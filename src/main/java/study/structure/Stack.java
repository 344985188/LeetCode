package main.java.study.structure;

public class Stack {
  private String[] items;
  private int n;
  private int count;

  public Stack(int n) {
    this.count = 0;
    this.n = n;
    this.items = new String[n];
  }

  public boolean push(String item) {
    if (count == n) {
      return false;
    }
    items[count] = item;
    count++;
    return true;
  }

  public String pop() {
    if (count == 0) {
      return null;
    }
    String temp = items[count - 1];
    count--;
    return temp;
  }

  public int getCount() {
    return this.count;
  }
}
