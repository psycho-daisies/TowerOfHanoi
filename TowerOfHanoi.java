// Class: CS 145
// Assignment: Tower of Hanoi
// Authors: Troy Brunette
//
// The Tower of Hanoi program is a way to demonstrate recursion
// A recursive method is one that calls itself.
// The Goal of Towers of Hanoi is to move 3 disks from one rod to another rod.
// One disk can be moved at a time, a bigger disk can't be placed on a smaller disk.
// A middle rod is used to help solve this problem.
//
//         n : number of disks
//         f : 'from' position
//         h : 'helper' position
//         t : 'target' position

public class TowerOfHanoi {
  public static void main(String[] args) {
    hanoi(3, 'A', 'B', 'C');
  }

  public static void move(int n, char f, char t) {
    System.out.printf("Move disk %d from rod %c to rod %c\n", n, f, t);
  }

  public static void hanoi(int n, char f, char h, char t) {
    if (n == 0) { // base case ends the recursive method calls
      return;
    }
    // recursive method call to itself
    hanoi(n-1, f, t, h);
    move(n, f, t);
    // recursive method call to itself
    hanoi(n-1, h, f, t);
  }
}