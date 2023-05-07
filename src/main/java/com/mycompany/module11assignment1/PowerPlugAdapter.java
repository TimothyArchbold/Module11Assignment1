/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module11assignment1;

/**
 *
 * @author timarchbold
 */
public class PowerPlugAdapter implements EuropeanSocket {
    private PowerPlug powerPlug;

    public PowerPlugAdapter(PowerPlug powerPlug) {
        this.powerPlug = powerPlug;
    }

    @Override
    public void plugIn(PowerPlug powerPlug) {
        this.powerPlug.provideElectricity();
    }
}

