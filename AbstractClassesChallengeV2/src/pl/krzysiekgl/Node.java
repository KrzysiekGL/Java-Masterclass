package pl.krzysiekgl;

public class Node extends MyListItem {
  
  public Node(Object value) {
    super(value);
  }
  
  @Override
  MyListItem next() {
    return this.nextItem;
  }
  
  @Override
  MyListItem setNext(MyListItem item) {
    this.nextItem = item;
    return this.nextItem;
  }
  
  @Override
  MyListItem previous() {
    return this.previousItem;
  }
  
  @Override
  MyListItem setPrevious(MyListItem item) {
    this.previousItem = item;
    return this.previousItem;
  }
  
  @Override
  int compareTo(MyListItem item) {
    if(item != null) return ((String) super.getValue()).compareTo((String) item.getValue());
    else return -1;
  }
}
