package maxponits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**

P 为 给 定 的 二 维 平 面 整 数 点 集 。 定 义 P 中 某 点 如 果 × 满 足 P 中 任 意 点 都 不 在 × 的 右 上 方 区 域 内 （ 横 纵 坐标 都
 大 于 × ） ， 则 称 其 为 “ 最 大 的 ” 。 求 出 所 有 “ 最 大 的 ” 点 的 集 合 。 〈 所 有 点 的 横 坐 标 和 纵 坐 标 都 不 重 复 ．
 坐 标 轴 范 围 在 [ 0 ， 1 e9 ] 内 ） 如 下 图 实 心 点 为 满 足 条 件 的 点 的 集 合 。

 请 实 现 代 码 找 到 集 合 P 中 的 所 有 ” 最 大 “ 点 的 集 合 并 输 出 。 第 一 行 输 入 点 集 的 个 数 N ， 接 下 来 N 行 ， 每 行 两
 个 数 字 代 表 点 的 x 轴 和 Y 轴 。


 输 出
输 出 “ 最 大 的 ” 点 集 合 ， 按 照 x 轴 从 小 到 大 的 方 式 输 出 ， 每 行 两 个 数 字 分 别 代 表 点 的 x 轴 和 Y 轴 。
样 例 输 入

5
1 2
5 3
4 6
7 5
9 0
 输出例子1:
 4 6
 7 5
 9 0

 1.暴力搜索法

 先取一点，然后和其他所有点比较，看看是否有点在其右上方，没有则证明该点是“最大点”。重复检测所有的点。显而易见，算法的复杂度为O(n2)

 2.变治法（预排序）

 由“最大点”的性质可知，对于每一个“最大点”，若存在其他点的y值大于该点y值，那么其他点x值必然小于该点的x值。

 换言之，当某一点确定它的x值高于所有y值大于它的点的x值，那么该点就是“最大点” 。网上给出的答案基本上都是这个套路。

 对于y有序的点集，只需要O(n)即可输出“最大点”点集。一般基于比较的排序算法时间复杂度O(nlogn)。那么，显而易见，算法整体复杂度为O(nlogn)。
 */

public class MaxPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr[i] = new Pair(x, y);
        }

        Arrays.sort(arr);

        List<Pair> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean f = true;
            for (int j = i+1; j < n; j++) {

                if (arr[i].x < arr[j].x && arr[i].y < arr[j].y) {
                    f = false;
                    break;
                }
            }
            if (f) {
                res.add(arr[i]);
            }
        }

        for (Pair p : res) {
            System.out.println(p.x + " " + p.y);
        }

        in.close();


    }
}
