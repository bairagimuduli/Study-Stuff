package functionargs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class School {
  public static <E> E[] getByPredicateAsArray(List<E> in,
                    Predicate<? super E> ps, Class<E> cl) {
    List<E> out = new ArrayList<>();
    for (E s : in) {
      if (ps.test(s)) {
        out.add(s);
      }
    }
    // does not work "E" has no type at runtime! Arrays KNOW their type!
//    E [] array = new E[out.size()];
    // works but "heap pollution" (you might not care)
//    E [] array = (E[])new Object[out.size()];
    E [] array = (E[])Array.newInstance(cl, out.size());

    for (int idx = 0; idx < out.size(); idx++) {
      array[idx] = out.get(idx);
    }
    return array;
  }
  public static <E> List<E> getByPredicate(List<E> in,
                                           Predicate<? super E> ps) {
    List<E> out = new ArrayList<>();
    for (E s : in) {
      if (ps.test(s)) {
        out.add(s);
      }
    }
    return out;
  }
  public static void showAll(List<? extends Student> school) {
    for (Student s : school) {
      System.out.println(s);
    }
    System.out.println("----------------------");
  }
  public static void main(String[] args) {
    List<Student> school = new ArrayList<>();
    school.add(new Student("Fred"));
    school.add(new Student("Sheila"));
    showAll(school);
    showAll(getByPredicate(school, s -> s.getName().length() < 5));

    Predicate<VIPStudent> pv = null; // NO!!! cannot test Student

    List<VIPStudent> lv = new ArrayList<>();
    lv.add(new VIPStudent("Frederick"));
    lv.add(new VIPStudent("Lady Sheila"));

    Predicate<Student> ps = s -> s.getName().length() < 5;
    List<VIPStudent> lv2 = getByPredicate(lv, ps); // ps.test(lv.get(0))
  }
}
