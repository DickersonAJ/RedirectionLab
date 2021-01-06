import java.util.*;
public class PigLatin {

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    Scanner n = new Scanner(s);
    String str = "";
    String word = "";
    char first = ' ';
    while (n.hasNextLine()) {
      Scanner linear = new Scanner(n.nextLine());
        while (linear.hasNext()){
          word = linear.next();
          first = word.charAt(0);
          if (first=='a'||first=='e'||first=='i'||first=='o'||first=='u'){
            word+="hay";
          }
          else if (word.length()==1){
            word+="ay";
          }
          else{
            word = word.substring(1,word.length()) + String.valueOf(first) + "ay";
          }
          str+=word+" ";
        }
        str+="\n";
    }
    return str;
  }

  //public static String pigLatin(String s){

  //}

  public static void main(String[]args){
    System.out.println("pigLatinSimple Test");
    String testring = "One fish, two fish,\nred fish, blue fish!\na b c 1 2 3";
    System.out.println(testring);
    System.out.println(pigLatinSimple(testring));
  }

}
