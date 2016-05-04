public class Entity {

  private int x;
  private int y;
  private int width;
  private int height;

  Entity(int x, int y, int width, int height) {
    this.x      = x;
    this.y      = y;
    this.width  = width;
    this.height = height;
  }

  public void draw() {
    System.out.println(String.format("x: %s | y: %s", x, y));
    System.out.println(String.format("width: %s | height: %s", width, height));
  }
}
