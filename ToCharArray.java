public class ToCharArray {
  
  public char[] toCharArray(String cad) {
    char[] output = new char[cad.length()];
    for (int i = 0; i < cad.length(); i++) {
      output[i] = cad.charAt(i);
    }
    return output;
  }
}
