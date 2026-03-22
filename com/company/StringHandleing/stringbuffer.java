package com.company.StringHandleing;

import javax.swing.*;

class stringbuffer {
public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("");
    //sb.append("hellohellohellohello");
    System.out.println(sb.toString());
    System.out.println(sb.length());
    System.out.println(sb.capacity()); // checks the capacity if the 'sb'.
}
}
