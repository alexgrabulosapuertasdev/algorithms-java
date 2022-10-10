public class Substring {
  
  public String subString(String cad, int startIndex) {
    String output = "";
    for (int i = startIndex; i < cad.length(); i++) {
      output += cad.charAt(i);
    }
    return output;
  }

  public String subString(String cad, int startIndex, int endIndex) {
    String output = "";
    for (int i = startIndex; i < endIndex; i++) {
      output += cad.charAt(i);
    }
    return output;
  }
}
