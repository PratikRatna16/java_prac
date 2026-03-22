package com.company.StringHandleing;

class format{
    public static void main(String[] args) {
        String s1 = "HEllo";
        s1.concat("world");
        System.out.println(s1);

        String s2 = "hello";
        s2 = s2.concat(" world");
        System.out.println(s2);

        char [] ch = {'a','b','c','d','e','f','g'};
        String s3 = new String(ch);
        System.out.println(s3); // s3 -> abcdefg
        String s4 = new String(ch,2,2);
        System.out.println(s4); // s4 -> cd

        String s5 = "Four"+2+2;
        System.out.println(s5);

        String s6 = "Four"+(2+2);
        System.out.println(s6);

        String s7 = "abcdefg";
        char c = s7.charAt(2);
        System.out.println(c);
    }
}
