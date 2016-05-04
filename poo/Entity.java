public class Entity {

  private int x;
  private int y;
  private int width;
  private int height;

  Entity(int valueX, int valueY, int valueWidth, int valueHeight) {
    x = valueX;
    y = valueY;
    width = valueWidth;
    height = valueHeight;
  }

  public void draw() {
    System.out.println(String.format("x: %s | y: %s", x, y));
    System.out.println(String.format("width: %s | height: %s", width, height));
  }
}
