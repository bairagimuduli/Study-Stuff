package shopping;

public class Shop {
  public static void main(String[] args) {
    Pair<String> ps = new Pair<>("Fred", "Jones");
    ClothingPair<Sock> socks =
        new ClothingPair<>(new Sock("Red", 10), new Sock("Red", 11));
//    Pair<Sock> socks = new Pair(new Sock(), "Sock");
    Sock s = socks.getLeft();
    ClothingPair<Glove> gloves =
        new ClothingPair<>(new Glove("Black", 5), new Glove("Brown", 5));
//    gloves.setLeft(new Sock());
    System.out.println("socks match? " + socks.matches());
    System.out.println("gloves match? " + gloves.matches());


//    Colored & Sized g = new Glove("Black", 5);
    boolean m = ClothingPair.<Glove>match(new Glove("Blue", 4), new Glove("Green", 4));
  }
}
