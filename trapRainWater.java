public class trapRainWater {
    public int trap(int[] A) {
	if (A.length == 0) {
	    return 0;
	}
        int[] left = new int[A.length], right = new int[A.length];
	left[0] = A[0];
	for (int i = 1; i < A.length; i++) {
	    left[i] = Math.max(left[i - 1], A[i]);
	}
	right[A.length - 1] = A[A.length - 1];
	for (int i = A.length - 2; i >= 0; i--) {
	    right[i] = Math.max(right[i + 1], A[i]);
	}
	int sum = 0;
	for (int i = 0; i < A.length; i++) {
	    sum += Math.min(left[i], right[i]) - A[i];
	}
	return sum;
    }
    public static void main(String[] args) {
	trapRainWater solution = new trapRainWater();
	int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
	System.out.println(solution.trap(height));
    }
}