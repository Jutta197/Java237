package two2_search;

public class BinarySearch {

	public static void main(String[] args) {
		// 
		int[] data = {1,2,3,4,5,6,7};
		System.out.println(search(data, 4));
	}
	public static int search(int[] data, int val) {
		int ret = -1;
		int left = 0;
		int right = data.length-1;
		while(left<=right) {
			int mid = (left + right)/2;
			if(data[mid] == val) {
				return mid +1;	
			}else if(val < data[mid]) {
				right = mid -1;
			}else {
				left = mid+1;
			}
		}
		return ret;
	}
	

}

//以下の手順を基にソース作成します
	/*まず、配列 data に対して、探索対象となる値 target を探すために、変数 left と right を定義し、
	 * それぞれの初期値を 0 と data.length - 1 に設定します。
	 * この left と right は、探索対象の範囲を表します。

	次に、while ループを開始し、left が right 以下の場合、つまり探索対象の範囲にまだ探索すべき要素がある場合、
	以下の処理を繰り返し実行します。

	まず、探索対象範囲の中央の要素を求めるために、left と right の和を2で割って中央のインデックスを算出します。
	これを変数 mid に代入します。この中央の要素が、現在の探索対象の範囲の中央になります。

	そして、data[mid] が target と等しい場合、探索が成功したことを意味していて、
	mid + 1 を返します。配列のインデックスは 0 から始まるため、配列のインデックス番号 mid に 1 を加えて、
	探索成功の結果を返しています。

	一方で、data[mid] が target より大きい場合は、探索対象の範囲が左側にあるため、right の値を
	mid - 1 に更新します。そして、data[mid] が target より小さい場合は、探索対象の範囲が右側にあるため、
	left の値を mid + 1 に更新します。これによって、次のループでは、
	新しい探索対象の範囲に対して同じ処理が繰り返されるという処理にします。

	最後に、探索が失敗した場合は、ret の初期値である -1 を返します。*/

/*
 * 这段给定的Java代码实现了二分查找算法，用于在已排序的整数数组中查找目标值的索引。让我们逐步分析这段代码：
 * 
 * 1. 代码定义了一个名为`BinarySearch`的类，位于`two2_search`包中。
 * 
 * 2. `main`方法是程序的入口点。它创建了一个包含整数的数组`data`，然后调用`search`方法在数组中查找值`4`的索引。
 * 
 * 3. `search`方法接受两个参数：数组`data`和要查找的整数`val`。
 * 
 * 4. 在`search`方法内部，定义了三个变量： - `ret`：初始化为-1，用于存储目标值的索引（如果找到）。 -
 * `left`：设置为0，表示当前查找范围的左边界索引。 - `right`：设置为数组长度减1，表示当前查找范围的右边界索引。
 * 
 * 5. 使用`while`循环进行二分查找，直到`left`大于`right`为止，意味着查找范围为空，目标值不存在于数组中。
 * 
 * 6. 在每次循环中，计算中间索引`mid`，然后与目标值进行比较。 -
 * 如果`data[mid]`等于目标值`val`，则直接返回`mid+1`，表示找到目标值的索引（索引从1开始计数）。 -
 * 否则，如果目标值`val`小于`data[mid]`，则在左半部分继续查找，将`right`更新为`mid-1`。 -
 * 如果目标值`val`大于`data[mid]`，则在右半部分继续查找，将`left`更新为`mid+1`。
 * 
 * 7. 如果整个循环结束后仍未找到目标值，则返回`ret`，其值仍为-1，表示目标值不存在于数组中。
 * 
 * 请注意，由于数组索引从0开始计数，而返回的索引值是从1开始计数的，所以返回的索引值比实际索引值大1。
 */