package com.tjuscs.st;

public class Solve {
	public boolean solve(int x) {
		if (x < 0 || x >= 94) return false;
		int[] v = {50, 20, 10, 5, 1}, n = {1, 1, 1, 2, 3};
		boolean[] f = new boolean[94];
		f[0] = true;
		for (int i = 1; i < 94; ++i) {
			f[i] = false;
		}
		for (int i = 0; i < 5; ++i)
			for (int j = 0; j < n[i]; ++j)
				for (int k = 93; k >= v[i]; --k)
					if (f[k - v[i]]) f[k] = true;
		return f[x];
	}
}