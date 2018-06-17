package com.github.tkmtmkt.study.javaparser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void parse(Path path) throws IOException {
        CompilationUnit cu = JavaParser.parse(path);
        new MethodVisitor().visit(cu, null);
    }

    public static void main(String[] args) {
        Path source = Paths.get("src/main/java/com/github/tkmtmkt/study/javaparser/Main.java");
        try {
            parse(source);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
