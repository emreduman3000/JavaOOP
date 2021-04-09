/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emreduman;

//package, class namelerinin üzerine ctrl+click yaparsan nerde oldugunu gösterir

//import com.emreduman.deneme.JavaOOP;
//import com.emreduman.deneme.newClass2;
import com.emreduman.deneme.*;//* means all classes in this package

import com.emreduman.deneme2.newClass3;
import com.emreduman.deneme2.newClass2;
import com.emreduman.*;
// bu olmaz cunku 2 farklı package var onların icinde classlar var


import com.emreduman.deneme2.publicClass;
import org.w3c.dom.Node; //Java VM hangi nODE Clasını kullanacagını sasırır.


import java.awt.*;//CTRL+click yap
//awt package'ındaki tüm package ve classları external libraries e ekler
/**
 *
 * @author emreduman
 */
public class newClass extends publicClass {
    
    public static void main(String [] args)
    {

        //JDK8 DE dAHA COK Node class ı var

        //farklı package'dan classı kullanmak için import etmek gerekiyor
        //import edilen class da public-protected olmalı
       // Node javafxNode=null; //import javafx.scene.Node;
        org.w3c.dom.Node w3cNode=null;

        com.emreduman.deneme.newClass2 nesne=null; //import com.emreduman.deneme.newClass2;
        newClass2 nesnee=null;
        JavaOOP nesne2=null;


        newClass3 nesne3=null;//import com.emreduman.deneme2.newClass3;


    }
}
