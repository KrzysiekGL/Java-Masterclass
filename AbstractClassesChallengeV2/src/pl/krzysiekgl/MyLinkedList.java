package pl.krzysiekgl;

import java.sql.SQLOutput;

public class MyLinkedList implements NodeList {
  private MyListItem root = null;
  
  public MyLinkedList(MyListItem root) {
    this.root = root;
  }
  
  @Override
  public MyListItem getRoot() {
    return this.root;
  }
  
  @Override
  public boolean addItem(MyListItem item) {
    if(this.root == null) {
      //The list was empty, so this item becomes first
      this.root = item;
      return true;
    }
    
    MyListItem currentItem = this.root;
    
    while(currentItem != null) {
      int comparison = (currentItem.compareTo(item));
      
      if(comparison < 0) {
        //item is greater, move right if possible
        if(currentItem.next() != null) currentItem = currentItem.next();
        else {
          //there is no next, so insert at the end of list
          currentItem.setNext(item);
          item.setPrevious(currentItem);
          return true;
        }
      }
      else if(comparison > 0) {
        //item is less, insert before
        if(currentItem.previous() != null) {
          currentItem.previous().setNext(item);
          item.setPrevious(currentItem.previous());
          item.setNext(currentItem);
          currentItem.setPrevious(item);
        }
        else {
          //the node with a previous is the root
          item.setNext(this.root);
          this.root.setPrevious(item);
          this.root = item;
        }
        return true;
      }
      else {
        //equal
        System.out.println(item.getValue() + " is already present, not added");
        return false;
      }
    }
    return false;
  }
  
  @Override
  public boolean removeItem(MyListItem item) {
    if(item != null) {
      System.out.println("Deleting item " + item.getValue());
    }
    
    MyListItem currentItem = this.root;
    while(currentItem != null) {
      int comparision = currentItem.compareTo(item);
      if(comparision == 0) {
        //found the item to delete
        if(currentItem == this.root) {
          this.root = currentItem.next();
        }
        else {
          currentItem.previous().setNext(currentItem.next());
          if(currentItem.next() != null) {
            currentItem.next().setPrevious(currentItem.previous());
          }
        }
      }
    }
  }
  
  @Override
  public void traverse(MyListItem root) {
    if(root == null) {
      System.out.println("The list is empty");
    }
    else {
      while(root != null) {
        System.out.println(root.getValue());
        root = root.next();
      }
    }
  }
}
