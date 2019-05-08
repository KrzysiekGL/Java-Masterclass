package pl.krzysiekgl;

public abstract class MyListItem {
  protected MyListItem previousItem = null;
  protected MyListItem nextItem = null;
  
  protected Object value;
  
  public MyListItem(Object value) {
    this.value = value;
  }
  
  abstract MyListItem next();
  abstract MyListItem setNext(MyListItem item);
  abstract MyListItem previous();
  abstract MyListItem setPrevious(MyListItem item);
  
  abstract int compareTo(MyListItem item);
  
  public Object getValue() {
    return value;
  }
  
  public void setValue(Object value) {
    this.value = value;
  }
}
