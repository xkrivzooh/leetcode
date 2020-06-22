package xyz.xkrivzooh.leetcode.solutions;

import java.util.Arrays;

/**
 * 区间合并
 * https://leetcode-cn.com/problems/merge-intervals/
 */
class Solution56 {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }

        Arrays.sort(intervals, (t1, t2) -> t1[0] - t2[0]);

        int lastElementIndex = -1;
        int[][] resTmp = new int[intervals.length][2];
        for (int[] interval : intervals) {
            //如果临时结果数组为空，或者当前的起始元素大于临时结果最末尾的终止位置，则直接加到临时结果中
            if (lastElementIndex == -1 || interval[0] > resTmp[lastElementIndex][1]) {
                resTmp[++lastElementIndex] = interval;
            } else {
                resTmp[lastElementIndex][1] = Math.max(resTmp[lastElementIndex][1], interval[1]);
            }
        }
        return Arrays.copyOf(resTmp, lastElementIndex + 1);
    }
}
