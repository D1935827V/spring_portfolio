package com.example.sping_portfolio.controllers;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class BraydenLabFactorialTest
{
    public static void main (String[]args)
    {
        Number b;
        b = new YNI ();
        System.out.println ("your number is: " + b.getTheNumber ());
        b = new MNI ();
        System.out.println ("my number is: " + b.getTheNumber ());
    }
}
abstract class Number
{
    abstract int getTheNumber ();
}
class YNI extends Number
{
    int getTheNumber ()
    {
        return 12;
    }
}
class MNI extends Number
{
    int getTheNumber ()
    {
        return 50;
    }
}