/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD
/**
 *
 * @author yentt
 */
=======

>>>>>>> 3ef12d2cc7650d61392a01ad69c1f3d18e7af169
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Type implements Serializable {
    private String typeId;
    private String typeName;
}
