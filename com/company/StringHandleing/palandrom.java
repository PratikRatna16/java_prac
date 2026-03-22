package com.company.StringHandleing;

class palandrom {
    public static void main(String[] args) {
        String s1 = "aba";
        for(int j=0;j<s1.length()/2;j++){
            if(s1.charAt(j) == s1.charAt(s1.length() -1)){
                System.out.println(s1+"is a palandrom");
            }
        }
    }
}
