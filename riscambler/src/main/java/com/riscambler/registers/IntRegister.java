package com.riscambler.registers;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class IntRegister extends Register{
    int regData = 0;

    public IntRegister(
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