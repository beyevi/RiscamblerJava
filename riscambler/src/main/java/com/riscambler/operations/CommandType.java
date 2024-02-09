package com.riscambler.operations;

enum CommandType {
    ARITHMETIC,                     // add, sub, mul, div, rem(same as %), neg
    LOGICAL,                        // and, or, xor, not
    COMPARISON,                     // slt, sltu, slti, sltiu
    DATA_TRANSFER,                  // lw, sw, lb, sb
    CONTROL_TRANSFER,               // jal, jalr, beq, bne, blt, bge
    SHIFT_AND_BIT_MANIPULATION,     // sll, srl, sra, rol, ror; (and, or, xor can be also used)
    SYSTEM_INSTRUCTIONS             // ecall, ebreak
}
