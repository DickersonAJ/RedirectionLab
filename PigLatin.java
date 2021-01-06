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

  public static String pigLatin(String s){
    s = s.toLowerCase();
    Scanner n = new Scanner(s);
    String str = "";
    String word = "";
    char first = ' ';
    String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    boolean isdia = false;
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
            for (int i = 0; i < diagraphs.length; i++) {
              if (word.substring(0,2).equals(diagraphs[i])) {
                isdia=true;
                i=diagraphs.length;
              }
            }
            if (isdia) {
              word = word.substring(2,word.length()) + word.substring(0,2) + "ay";
              isdia=false;
            }
            else {
              word = word.substring(1,word.length()) + String.valueOf(first) + "ay";
            }
          }
          str+=word+" ";
        }
        str+="\n";
    }
    return str;
  }

  public static void main(String[]args){
    System.out.println("pigLatinSimple Test");
    String testring = "One fish, two fish,\nred fish, blue fish!\na b c 1 2 3";
    System.out.println(testring);
    System.out.println(pigLatinSimple(testring));
    System.out.println();
    System.out.println("pigLatin Test");
    //String testring = "One fish, two fish,\nred fish, blue fish!\na b c 1 2 3";
    System.out.println(testring);
    System.out.println(pigLatin(testring));
    System.out.println();
  }

}
