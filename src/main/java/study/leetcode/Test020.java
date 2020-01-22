package main.java.study.leetcode;

import main.java.study.dataStructure.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class Test020 {

  public static void main(String[] args) {
    String s = "()[][}";
    String ss = "()[{]}";
    String sss = "{()[]}";

    System.out.println(isValid(sss));
  }

  public static boolean isValid(String s) {
    Stack stack = new Stack(s.length());
    for (int i = 0; i < s.length(); i++) {
      String subStr = s.substring(i, i + 1);
      if (subStr.equals("(") || subStr.equals("[") || subStr.equals("{")) {
        stack.push(subStr);
      } else {
        String head = stack.pop();
        if (head == null || !head.equals(matchString(subStr))) {
          return false;
        }
      }
    }
    if (stack.getCount() == 0) {
      return true;
    } 
    return false;
  }

  private static String matchString(String sign) {
    if (")".equals(sign)) {
      return "(";
    }
    if ("}".equals(sign)) {
      return "{";
    }
    if ("]".equals(sign)) {
      return "[";
    }
    return null;
  }

}
