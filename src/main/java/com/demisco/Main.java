package com.demisco;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(5,10);
        Rectangle r2=new Rectangle(5,10);
        System.out.println(r1.equals(r2));
        Set<Rectangle> set=new HashSet<Rectangle>();
        set.add(r1);
        System.out.println(set.contains(r2));
    }
}