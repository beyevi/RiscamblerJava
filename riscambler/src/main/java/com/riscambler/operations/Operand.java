package com.riscambler.operations;

import com.riscambler.elements.registers.Register;

class GenericType<T, U> {
    private T intValue;
    private U registerValue;

    private GenericType(T intValue, U registerValue) {
        this.intValue = intValue;
        this.registerValue = registerValue;
    }

    public static <T> GenericType<T, ?> fromInt(T intValue) {
        return new GenericType<>(intValue, null);
    }

    public static <U> GenericType<?, U> fromRegister(U registerValue) {
        return new GenericType<>(null, registerValue);
    }

    public T getValue() {
        return intValue;
    }

    public U getValueAsRegister() {
        return registerValue;
    }
}

public class Operand {
    GenericType<Integer, Register> operand;
}
