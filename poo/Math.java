public class Math {

  public void sumVoid(int a, int b) {
    int result = a + b;
    System.out.println(String.format("result with void: %s", result));
  }

  public int sum(int a, int b) {
    int result = a + b;
    return result;
  }
}
