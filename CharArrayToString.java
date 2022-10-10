public class CharArrayToString {

  public String toString(char[] characters) {
    String cad = "";
    for (char character: characters) {
      cad += character;
    }
    return cad;
  }
}
