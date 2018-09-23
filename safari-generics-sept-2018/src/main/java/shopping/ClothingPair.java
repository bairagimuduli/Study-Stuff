package shopping;

// Type variable decl    VVVVVVVVVVVV
public class ClothingPair<E extends /*Object & */Colored & Sized/*, String*/> extends Pair<E> {
//  private String something = "Hello";
  public ClothingPair(E left, E right) {
    super(left, right);
  }
  public /*<F>*/ boolean matches() {
//    F thing = null;
    return getLeft().getSize() == getRight().getSize()
        && getLeft().getColor().equals(getRight().getColor());
  }
  // Type var declaration
  //            VVV
  public static <F extends Colored & Sized> boolean match(F left, F right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
