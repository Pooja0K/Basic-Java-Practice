package String;

import java.util.Arrays;

public class StringFunctions {
    // We are going to use different String functions in this class
    //1. toLowerCase()--> It will convert all the value of String into lowercase & return type is String
    //2. toUpperCase()--> It will convert all the value of String into uppercase & return type is String
    //3. charAt(int Index)--> It will return character at given index, it takes integer argument & return type is char
    //4. length()--> It will return length of the String literal and return type is int
    //5. substring()--> It takes 2 different types of argument
    //5a.substring(int beginIndex)--> This method takes 1 integer argument
    //5a. And  returns String starting from value of beginIndex(inclusive of beginIndex)
    //5b. substring(int beginIndex, int endIndex)--> This method takes 2 integer arguments
    //5b. And returns String starting from value/position of beginIndex(inclusive) till before endIndex(exclusive)
    //5b. example if string name ="Anjuli" then name.substring(2,5) will give o/p jul because
    // 5b. 2nd position in String(POSITION STARTS FROM ZERO IN STRING) is j & 5th position is 'i' but endIndex is exclusive so o/p is jul
    //6. charArray()--> It returns Array & return type is character of Array
    //7. replace()--> It replaces old character in String by new character & its return type is String & it takes 2 character arguments(old & new char value)
    //8. trim();--> It trims whitespace/blank from String and return type is also String
    //9. split();
    public static void main(String[] args) {
        String name = "Anjuli"; //A is in upper case
        String s1 = name.toLowerCase();
        //toLowerCase() will convert all the value of String into lowercase & return type is String
        System.out.println(s1);
        //output is anjuli
        //However if we want to optimize code them we can directly use this function in SOP as below
        System.out.println(name.toLowerCase()); // this will also give o/p as anjuli
        System.out.println(name.toUpperCase()); // this will give o/p as ANJULI
        char c = name.charAt(3);
        // return type is character, it takes integer argument/index & will return character present at that index
        System.out.println(c); // this will give o/p as char u
        System.out.println(name.charAt(4)); // this will give o/p as char l
        System.out.println(name.charAt(name.length() - 4)); // this will give o/p as char j
        System.out.println(name.length()); //it will give o/p as 6 & return type is int
        System.out.println(name.substring(2));
        // it will give o/p as juli, return type is String & takes integer argument/beginIndex
        String s2 = name.substring(1); //it takes integer argument/beginIndex & return type String
        System.out.println(s2);// this will give o/p as char njuli
        System.out.println(name.substring(name.length() - 4));//o/p is juli same as line 27
        System.out.println(name.substring(2, 5));//beginIndex is inclusive but endIndex is exclusive so o/p is jul
        String s3 = name.substring(2, 5); // it takes integer arguments and return type is String
        System.out.println(s3);//this will give o/p as jul
        System.out.println(name.substring(name.length() - 4, name.length() - 2)); //this will give o/p as ju
        System.out.println(name.toCharArray()); //o/p is Array of String name
        char[] ch = name.toCharArray(); //return type is char Array
        System.out.println(Arrays.toString(ch)); //o/p is array {A,n,j,u,l,i}
        System.out.println(name.replace('l', 'i'));//o/p is Anjuii
        String s4 = name.replace('l', 'i');//return type is string & takes character Arguments
        System.out.println(s4); // o/p is Anjuii
        System.out.println(name.replace(name.charAt(name.length() - 4), name.charAt(0))); //AnAuli
        System.out.println(name.replace('j', 'k')); //o/p is ankuli and new character k was not part of name string before replace

        String name1 = "Anjuli";
        String name2 = "Ankita";
        String str1 = name1.substring(0, 2);
        System.out.println(str1); //o/p is An
        String str2 = name2.substring(2, 5);
        System.out.println(str2); //o/p is kit
        System.out.println(str1 + str2); //o/p is Ankita
        String name3=" Ankita1 ";
        System.out.println(name3.trim()); // o/p is Ankita1 and space will be removed from the left and right of String name3
        String name4="Pooja Kumari";
        String [] ss= name4.split("");
        System.out.println(Arrays.toString(ss));

    }
}
