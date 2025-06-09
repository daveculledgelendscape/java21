package finalfeature;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class SequencedCollections {
  void main(String[] args) {
    sequencedList();
    sequencedSet();
    sequencedMap();
  }

  private static void sequencedList() {
    // Arraylist now implements  SequencedCollection - https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html
    System.out.println("List");
    ArrayList<String> list = new ArrayList<String>();
    list.add("B");
    list.addFirst("A");
    list.addLast("C");
    System.out.println(list);

    System.out.println(list.reversed());

    list.removeFirst();
    list.removeLast();
    System.out.println(list);
  }

  private void sequencedSet() {
    System.out.println("Set");
    LinkedHashSet<String> set = new LinkedHashSet<String>();
    set.add("B");
    set.add("B");
    set.addFirst("A");
    set.addLast("C");
    System.out.println(set);
    System.out.println(set.reversed());

    set.removeFirst();
    System.out.println(set);
  }

  private void sequencedMap() {
    System.out.println("Map");
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    map.put("B", "1");
    map.put("B", "2");
    map.putFirst("A", "1");
    map.putLast("C", "1");
    System.out.println(map);

    System.out.println("Set: " + map.sequencedEntrySet());
    System.out.println("Reversed: " + map.reversed());
    System.out.println("sequencedKeySet: " + map.sequencedKeySet());
    System.out.println("sequencedValues: " + map.sequencedValues());

    System.out.println("firstEntry: " + map.firstEntry());
    System.out.println(map);

    System.out.println("pollFirstEntry: " + map.pollFirstEntry());
    System.out.println(map);
  }

}
