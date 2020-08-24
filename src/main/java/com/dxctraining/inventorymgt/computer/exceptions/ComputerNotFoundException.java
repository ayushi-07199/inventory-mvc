package com.dxctraining.inventorymgt.computer.exceptions;

public class ComputerNotFoundException extends RuntimeException {
    public ComputerNotFoundException(String msg)
    {
        super(msg);
    }
}
