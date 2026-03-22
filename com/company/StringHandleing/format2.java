package com.company.StringHandleing;

class format2{
    public static void main(String args[]){
        String s = "KIITKISSKIMS";

        String s1 = s.substring(3,6);
        System.out.println(s1);

        String s2 = s.replace('K','N');
        System.out.println(s2);

        String s3 = s.toLowerCase();
        System.out.println(s3);

        System.out.println(s.indexOf("i"));
        System.out.println(s.lastIndexOf("i"));

        String s4 = String.join("/","KIIT","KISS");
        System.out.println(s4);
    }
}
