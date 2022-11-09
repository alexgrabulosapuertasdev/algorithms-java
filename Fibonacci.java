public class Fibonacci {

  public int basic(int times) {
    if (times == 1) {
      return 0;
    }

    if (times == 2) {
      return 1;
    }

    int lastValue = 0;
    int value = 1;

    for (int i = 2; i < times; i++) {
      value += lastValue;
      lastValue = value - lastValue;
    }

    return value;
  }

  public int recursive(int times) {
    if (times <= 1) {
      return 0;
    }

    if (times == 2) {
      return 1;
    }

    return recursive(times-1) + recursive(times-2);
  }
}