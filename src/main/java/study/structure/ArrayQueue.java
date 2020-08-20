package main.java.study.structure;

public class ArrayQueue {
  private String[] items;
  private int n = 0;
  private int head = 0;
  private int tail = 0;

  public ArrayQueue(int capacity) {
    n = capacity;
    items = new String[capacity];
  }

  public boolean push(String item) {
    if ((tail + 1) % n == head) {
      return false;
    }
    items[tail] = item;
    tail = (tail + 1) % n;
    return true;
  }

  public String pop() {
    if (tail == head) {
      return null;
    }
    String first = items[head];
    head++;
    return first;
  }

  public int getHead() {
    return this.head;
  }

  public int getTail() {
    return this.tail;
  }
}
