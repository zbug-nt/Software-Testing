import org.junit.Test;
import org.junit.Assert;

public class TestBubbleSort {
	@Test
	public void BubbleSort() {
		int[] in = new int[]{1,6,2,2,5};
		int[] out = new int[] {1,2,2,5,6};
		Assert.assertArrayEquals(out, BubbleSort.BubbleSort(in));
	}
}