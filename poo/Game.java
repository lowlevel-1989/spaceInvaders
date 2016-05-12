class Game {

  public static void main(String args[]) {

    Math mate = new Math();
    
    mate.sumVoid(5, 5);


    int result = mate.sum(2, 4);
    System.out.println(String.format("result in main: %s", result));

  }
}
