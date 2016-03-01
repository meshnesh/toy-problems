public static String getReverse2(String s){

if(s.length()==1){

return s;

}

return getReverse2(s.substring(1))+s.charAt(0);

}