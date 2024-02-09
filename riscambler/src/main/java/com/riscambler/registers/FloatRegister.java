package com.riscambler.registers;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class FloatRegister extends Register{
    double regData = 0.0;

    public FloatRegister(
        String regName,
        String regAltName) 
    {
        super(regName, regAltName);
    }

    @Override
    public String toString() {
        return "{regName: " +
                getRegName() +
                "; regAltName: " +
                getRegAltName() +
                "; regData: " +
                getRegData() +
                "}";
    }
}