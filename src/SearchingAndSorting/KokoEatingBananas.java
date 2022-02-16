package SearchingAndSorting;

public class KokoEatingBananas {

//	private int minPile(int[] piles) {
//		int min = Integer.MAX_VALUE;
//
//		for (int idx = 0; idx < piles.length; idx++) {
//			min = Math.min(min, piles[idx]);
//		}
//
//		return min;
//	}

	private int maxPile(int[] piles) {
		int max = Integer.MIN_VALUE;

		for (int idx = 0; idx < piles.length; idx++) {
			max = Math.max(max, piles[idx]);
		}

		return max;
	}

	private boolean isEatingPossible(int[] piles, int maxHours, int speed) {
		int currHours = 0;

		for (int bananas : piles) {
			currHours += (bananas / speed);
			
			if (bananas % speed != 0)
				currHours++;

			if (currHours > maxHours) {
				return false;
			}
		}

		return true;
	}

	public int minEatingSpeed(int[] piles, int hours) {

		int low = 1;
		int high = this.maxPile(piles);

		int ans = 0;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (this.isEatingPossible(piles, hours, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return ans;

	}

	public static void main(String[] args) {

		KokoEatingBananas obj = new KokoEatingBananas();
		int[] piles = { 30, 11, 23, 4, 20 };
		int hours = 5;
		System.out.println(obj.minEatingSpeed(piles, hours));

	}

}
