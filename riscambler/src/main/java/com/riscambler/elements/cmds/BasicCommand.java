package com.riscambler.elements.cmds;

import com.riscambler.operations.Operand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
class BasicCommand {
    private final String opName;
    private final String opDescr;
    protected final CommandType cmdType;
    private final Operand[] opOperands;

    public void debugCommand() {
        System.out.println(getOpName().toUpperCase() + " : " + getCmdType());
        System.out.println(getOpDescr());
        System.out.println("Working with: ");
    }
}