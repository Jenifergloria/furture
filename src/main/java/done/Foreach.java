package done;

public class Foreach {
	public static void main(String[] args) {
		int[] arc = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dest = new int[10];

		printArray(dest);
		//System.arraycopy(arc, 2, dest, 4, 5);
		copy(arc, 2, dest, 4, 5);
		printArray(dest);
	}

	static void copy(int[] arc, int arcPos, int[] dest, int destPos,int length) {
		for (int i = arcPos; i < arcPos + length; i++) {
			dest[destPos] = arc[i];
			destPos++;
		}
	}

	static void printArray(int[] arr) {
		if (arr == null) {
			System.out.print("null");
			return;
		}
		String set = "[";
		for (int i = 0; i < arr.length; i++) {
			set = set + arr[i];
			if (i != arr.length - 1) {
				set = set + ",";
			}

		}
		set = set + "]";
		System.out.println(set);

	}
}
