package com.praveen.dp.gof.visitor.visitors;


import com.praveen.dp.gof.visitor.structure.OperaMailClient;
import com.praveen.dp.gof.visitor.structure.SquirrelMailClient;
import com.praveen.dp.gof.visitor.structure.ZimbraMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
    void visit(ZimbraMailClient mailClient);
}
