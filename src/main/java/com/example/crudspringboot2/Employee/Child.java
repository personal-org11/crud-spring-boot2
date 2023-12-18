package com.example.crudspringboot2.Employee;

import java.io.IOException;

class Parent
{
    public void getDetails() throws IOException
    {
        System.out.println("Parent class");
    }
}

public class Child extends Parent
{
    public void getDetails() throws IOException
    {
        System.out.println("Child class");
    }
    public static void main(String[] args) throws Exception
    {
        Child ch =new Child();
        ch.getDetails();

    }
}