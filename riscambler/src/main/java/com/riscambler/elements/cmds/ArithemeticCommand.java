package com.riscambler.elements.cmds;

import com.riscambler.operations.MathOperation;
import com.riscambler.operations.Operand;

public class ArithemeticCommand extends BasicCommand {
    private final MathOperation mathOp;

    public ArithemeticCommand(
        String opName,
        String opDescr,
        CommandType cmdType,
        Operand[] operands,
        MathOperation newMathOp
    ) {
        super(opName, opDescr, cmdType, operands);
        mathOp = newMathOp;
    }

    public void performOperation() {
        switch (mathOp) {
            case ADD:
                break;
            case SUB:
                break;
            case MUL:
                break;
            case DIV:
                break;
            case REM:
                break;
            case NEG:
                break;
            default:
                break;
        }
    }
}
