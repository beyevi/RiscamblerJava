package com.riscambler.registers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Register {
    protected final String regName;
    protected final String regAltName;
}
