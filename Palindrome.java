public class Palindrome {
  public static boolean palindrome(String x) {
    String reversed = "";
    int length = x.length();
    for(int i = length - 1; i >= 0; i--) {
      reversed += x.charAt(i);
    }
    if(x.equals(reversed)) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String [] args) {
    System.out.println(palindrome("racecar"));
  }
}