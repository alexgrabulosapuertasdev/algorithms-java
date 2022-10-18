public class ToLowerCase {

  public static String toLowerCase(String cad) {
    String output = "";
    for (int i = 0; i < cad.length(); i++) {
      if (Character.isUpperCase(cad.charAt(i))) {
        int asciiValue = ((int) cad.charAt(i)) + 32;
        String character = new Character((char) asciiValue).toString();
        output += character;
      } else {
        output += cad.charAt(i);
      }
    }
    return output;
  }
}
