package com.github.tkmtmkt.study.javaparser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.visitor.*;

class MethodVisitor extends VoidVisitorAdapter<Object> {
    @Override
    public void visit(final ClassOrInterfaceDeclaration n, final Object arg) {
        System.out.println(n.getName());
        super.visit(n, arg);
    }

    @Override
    public void visit(MethodDeclaration n, Object arg) {
        System.out.println("  " + n.getName());
        super.visit(n, arg);
    }
}
