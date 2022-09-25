/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import Base.Base;
import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.SendEmail;
import ultis.generator;

/**
 *
 * @author admin
 */
public class ResetPasswordController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");     
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("reset-password.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String email = request.getParameter("email");

        boolean isExistAccount = new AccountDAO().isExistAccount(email);

        if (!isExistAccount) {
            request.setAttribute("error", "Email is not exist. Please try again!");
        } else {
            String token = generator.generateRandomToken(45);

            boolean updatePasswordToken = new AccountDAO().updatePasswordTokenWithEmail(email, token);
            if (updatePasswordToken) {

                String subject = "Change your password";
                String message = "<!DOCTYPE html>\n"
                        + "<html lang=\"en\">\n"
                        + "<head></head>\n"
                        + "<body style=\"color:#000;\">\n"
                        + "    <h3>Quiz Pracite system</h3>\n"
                        + "    <p>Please click here to change your password| The Code Valid in 5 Minutes</p>\n"
                        //                        + "    <form id=\"myForm\" method=\"POST\" action=" + Base.LINK_CHANGE_PASSWORD + ">\n"
                        //                        + "        <input type=\"hidden\" value=" + email + " id=\"email\" name=\"email\">\n"
                        //                        + "        <input type=\"submit\" value=\"Change password\" \n"
                        //                        + "            style=\"padding: 10px 15px;color: #fff;background-color: rgb(0, 149, 255);border-radius: 10px;border:none\">\n"
                        //                        + "    </form>\n"
                        + "<a href=\"http://localhost:8080/SWP391/ChangePasswordForgot?txtToken=" + token + "\""
                        + "style=\"padding: 10px 15px;color: #fff;background-color: rgb(0, 149, 255);border-radius: 10px;border:none\">Change Password</a>"
                        + "    <h4>Thank you very much</h4>\n"
                        + "</body>\n"
                        + "</html>";

                SendEmail.sendMail(email, subject, message, Base.USERNAME_EMAIL, Base.PASSWORD_EMAIL);
//                new AccountDAO().updateDateModify(email);
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(60*1); // 5p
                session.setAttribute(token, "isExist");
                request.setAttribute("success", "Change password link has been sent to your email");
            }
        }

        request.getRequestDispatcher("reset-password.jsp").forward(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
