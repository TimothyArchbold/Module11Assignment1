/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.module11assignment1;

/**
 *
 * @author timarchbold
 */
public class Module11Assignment1 {

  public static void main(String[] args) {
        PowerPlug americanPowerPlug = new AmericanPowerPlug();
        EuropeanSocket europeanSocket = new PowerPlugAdapter(americanPowerPlug);
        europeanSocket.plugIn(americanPowerPlug);
    }
}
