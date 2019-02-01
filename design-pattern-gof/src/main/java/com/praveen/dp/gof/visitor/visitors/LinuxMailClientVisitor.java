package com.praveen.dp.gof.visitor.visitors;


import com.praveen.dp.gof.visitor.structure.OperaMailClient;
import com.praveen.dp.gof.visitor.structure.SquirrelMailClient;
import com.praveen.dp.gof.visitor.structure.ZimbraMailClient;

public class LinuxMailClientVisitor implements MailClientVisitor{
    @Override
    public void visit(OperaMailClient mailClient) {
      System.out.println("Configuration of Opera mail client for Linux complete");
    }

    @Override
    public void visit(SquirrelMailClient mailClient) {
        System.out.println("Configuration of Squirrel mail client for Linux complete");

    }

    @Override
    public void visit(ZimbraMailClient mailClient) {
        System.out.println("Configuration of Zimbra mail client for Linux complete");

    }
}
