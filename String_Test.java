class String_Test
{
    public static void main (String [] args)
{
    
    System.out.println("Hello!");
    System.out.println();
    
    System.out.println("Hello " + "World!");
    System.out.println();
    
    String str = "abc";
    System.out.println(str);
    System.out.println();
    
    String str1 = str;
    System.out.println("This is string: " + str);
    System.out.println();
    
    String str2 = "abcdefgh";
    System.out.println(str2);
    System.out.println();
    
    System.out.println("Point 1");
    char [] ch2 = new char [15];
    ch2[0] = 'X';
    str2.getChars(0, 7, ch2, 1);
    System.out.println("ch2: " + ch2 + "end");
    System.out.println();
    String str1a = new String(ch2);
    System.out.println(str1a);
    System.out.println();
    
    System.out.println("Point 2");
    int [] codepoints = str2.codePoints().toArray();
    String str3 = new String(codepoints, 2, 4);
    System.out.println(str3);
    System.out.println(str2.codePointCount(1, 7));
    System.out.println(str2.codePointAt(1));
    System.out.println(str2.codePointBefore(1));
    System.out.println();
    
    System.out.println("Point 3");
    char [] massive = {'q', 'w', 'e', 'r', 't', 'u'};
    String str4 = new String(massive, 2, 3);
    System.out.println(str4);
    System.out.println();
    
    System.out.println("Point 4");
    byte [] ch1 = str2.getBytes();
    System.out.println("ch1: " + ch1);
    System.out.println();
    
    System.out.println("Point 5");
    byte [] bytes = {(byte)0, (byte)1, (byte)2, (byte)3, (byte)15, (byte)27, (byte)4};
    //Charset UTF8_CHARSET = Charset.forName("UTF-8");
    System.out.println("qqqqqqq");
    //String str5 = new String(bytes, Charset.forName("UTF-8"));
    //System.out.println(str5);
    System.out.println(bytes);
    System.out.println();
    
    System.out.println("Point 6");
    char [] mas1 = "This is test".toCharArray();
    String str6 = new String(mas1);
    System.out.println(str6);
    System.out.println();
    
    System.out.println(str + " lenght is: " + str.length());
    System.out.println();
    
    System.out.println("Point 7");
    String str7 = "";
    if (str7.isEmpty()) System.out.println("Empty");
    else System.out.println("NOT Empty");
    System.out.println();
    
    System.out.println(str6.charAt(1));
    
    if (str.equals(str1)) System.out.println(true);
    System.out.println();
   
    String str8 = "abc";
    System.out.println("Point 8");
    System.out.println(str8.contentEquals("abc"));
    System.out.println();
   
    String str9 = "abcde";
    System.out.println("Point 9");
    System.out.println(str8.compareTo(str9));
    System.out.println();
   
    System.out.println("Point 10");
    String str10 = null;
    str10 += " qwerty";
    System.out.println(str10);
    //str10 = null;
    //str10.concat("s"); // NullPointerException
    System.out.println();
    
    System.out.println("Point 11");
    String srt11format = "We are printing double variable (%f), "
            + "string ('%s') and integer variable (%d).";
    System.out.println(String.format(srt11format, 2.3, "qwerty", 10));
    System.out.println();
}
}
