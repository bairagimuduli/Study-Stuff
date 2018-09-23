package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstList {

  public static void breakAList(List/*<String>*/ l) {
    l.add(LocalDate.now());
  }
  public static void main(String[] args) {
    List<String> ls = new ArrayList<String>();
//    ls = Collections.checkedList(ls, String.class /*"".getClass()*/);
    ls.add("Fred");
    ls.add("Jim");
    ls.add("Sheila");
    System.out.println("item 1 is " + ls.get(0));

//    String s = (String)ls.get(0);
    String s = ls.get(0);
//    ls.add(LocalDate.now());
    breakAList(ls);
    System.out.println("item 3 is " + ls.get(3));
  }
}
