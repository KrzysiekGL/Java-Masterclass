package pl.krzysiekgl;

public interface NodeList {
  MyListItem getRoot();
  boolean addItem(MyListItem item);
  boolean removeItem(MyListItem item);
  void traverse(MyListItem root);
}
