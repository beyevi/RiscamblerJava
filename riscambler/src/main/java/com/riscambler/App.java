package com.riscambler;


import java.util.Arrays;

import com.riscambler.elements.registers.IntRegister;
import com.riscambler.elements.registers.Register;


public class App 
{
    public static void main( String[] args )
    {
        Register[] registers = {
            new IntRegister("x0", "zero"),
            new IntRegister("x1", "ra"),
            new IntRegister("x2", "sp"),
            new IntRegister("x3", "gp"),
            new IntRegister("x4", "tp"),
            new IntRegister("x5", "t0"),
            new IntRegister("x6", "t1"),
            new IntRegister("x7", "t2"),
            new IntRegister("x8", "s0/fp"),
            new IntRegister("x9", "s1"),
            new IntRegister("x10", "a0"),
            new IntRegister("x11", "a1"),
            new IntRegister("x12", "a2"),
            new IntRegister("x13", "a3"),
            new IntRegister("x14", "a4"),
            new IntRegister("x15", "a5"),
            new IntRegister("x16", "a6"),
            new IntRegister("x17", "a7"),
            new IntRegister("x18", "s2"),
            new IntRegister("x19", "s3"),
            new IntRegister("x20", "s4"),
            new IntRegister("x21", "s5"),
            new IntRegister("x22", "s6"),
            new IntRegister("x23", "s7"),
            new IntRegister("x24", "s8"),
            new IntRegister("x25", "s9"),
            new IntRegister("x26", "s10"),
            new IntRegister("x27", "s11"),
            new IntRegister("x28", "t3"),
            new IntRegister("x29", "t4"),
            new IntRegister("x30", "t5"),
            new IntRegister("x31", "t6"),
        };

        System.out.println(Arrays.deepToString(registers));
    }
}
