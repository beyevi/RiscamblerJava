package com.riscambler;

import org.junit.Test;

import com.riscambler.elements.registers.Register;

import static org.junit.Assert.assertEquals;

/**
 * Testing registers initialization.
 */
public class RegistersInitializationTest 
{
    @Test
    public void testRegister1() {
        Register testReg = new Register("x0", "zero");
        assertEquals(testReg.getRegName(), "x0");
        assertEquals(testReg.getRegAltName(), "zero");
    }

    @Test
    public void testRegister2() {
        Register testReg = new Register("x1", "ra");
        assertEquals(testReg.getRegName(), "x1");
        assertEquals(testReg.getRegAltName(), "ra");
    }

    @Test
    public void testRegister3() {
        Register testReg = new Register("x2", "sp");
        assertEquals(testReg.getRegName(), "x2");
        assertEquals(testReg.getRegAltName(), "sp");
    }

    @Test
    public void testRegister4() {
        Register testReg = new Register("x3", "gp");
        assertEquals(testReg.getRegName(), "x3");
        assertEquals(testReg.getRegAltName(), "gp");
    }

    @Test
    public void testRegister5() {
        Register testReg = new Register("x4", "tp");
        assertEquals(testReg.getRegName(), "x4");
        assertEquals(testReg.getRegAltName(), "tp");
    }

    @Test
    public void testRegister6() {
        Register testReg = new Register("x5", "t0");
        assertEquals(testReg.getRegName(), "x5");
        assertEquals(testReg.getRegAltName(), "t0");
    }

    @Test
    public void testRegister7() {
        Register testReg = new Register("x6", "t1");
        assertEquals(testReg.getRegName(), "x6");
        assertEquals(testReg.getRegAltName(), "t1");
    }

    @Test
    public void testRegister8() {
        Register testReg = new Register("x7", "t2");
        assertEquals(testReg.getRegName(), "x7");
        assertEquals(testReg.getRegAltName(), "t2");
    }

    @Test
    public void testRegister9() {
        Register testReg = new Register("x8", "s0/fp");
        assertEquals(testReg.getRegName(), "x8");
        assertEquals(testReg.getRegAltName(), "s0/fp");
    }

    @Test
    public void testRegister10() {
        Register testReg = new Register("x9", "s1");
        assertEquals(testReg.getRegName(), "x9");
        assertEquals(testReg.getRegAltName(), "s1");
    }
}
