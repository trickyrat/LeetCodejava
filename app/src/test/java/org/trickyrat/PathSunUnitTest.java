package org.trickyrat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.trickyrat.DataStructures.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class PathSunUnitTest {
  private final Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("getData")
  public void test(TreeNode root, int targetNum, List<List<Integer>> expected) {
    List<List<Integer>> actual = solution.pathSum(root, targetNum);
    Assertions.assertEquals(expected, actual);
  }

  static Stream<Arguments> getData() {
    LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
    LinkedList<Integer> elem1 = new LinkedList<Integer>();
    elem1.add(5);
    elem1.add(4);
    elem1.add(11);
    elem1.add(2);
    list.add(elem1);
    LinkedList<Integer> elem2 = new LinkedList<Integer>();
    elem2.add(5);
    elem2.add(8);
    elem2.add(4);
    elem2.add(5);
    list.add(elem2);
    TreeNode root = Util.generateTreeNode("5,4,8,11,null,13,4,7,2,null,null,5,1");
    return Stream.of(
        Arguments.arguments(Util.generateTreeNode("1,2,3"), 5, new LinkedList<LinkedList<Integer>>()),
        Arguments.arguments(root, 22, list));
  }
}
