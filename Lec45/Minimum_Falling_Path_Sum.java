package Lec45;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Path_Sum(grid, 0, i));
		}
		System.out.println(ans);
	}

	public static int Path_Sum(int[][] grid, int cr, int cc) {
		if (cc < 0 || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}

		int ld = Path_Sum(grid, cr + 1, cc - 1);
		int rd = Path_Sum(grid, cr + 1, cc + 1);
		int d = Path_Sum(grid, cr + 1, cc);
		return Math.min(d, Math.min(rd, ld)) + grid[cr][cc];

	}

}
