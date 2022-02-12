/**
 * 
 */
package com.java.array;

/**
 *
 */
public class TrappedRainWater {

	public int findTrappedWater (int[] height) {
		//if height is less than or equal to 2, water cannot be trapped
		if (height.length < 3) {return 0;}
	
		//Create maxLeft and minLeft array
		int[] maxLeft = new int[height.length];
		int[] maxRight = new int[height.length];
		
		//Calculate max left value (left to right)
		maxLeft[0] = 0;
		
		for (int i = 1; i < maxLeft.length; ++i) {
			maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
		}
		
		//Calculate max right value (right to left)
		maxRight[maxRight.length - 1] = 0;
		
		for (int i = maxRight.length - 2; i >= 0; --i) {
			maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
		}
		
		//Consider all items running in o(N) running time
		//min(maxLeft, maxRight) - height
		int trapped = 0;
		
		for (int i = 1; i < height.length - 1; i++) {
			//only if max value from maxLeft, minLeft is greater than height
			if (Math.min(maxLeft[i], maxRight[i]) > height[i]) {
				trapped += Math.min(maxLeft[i], maxRight[i]) - height[i];
				return trapped;
			}
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		int[] height = {2,1,3,1,4};
		
		TrappedRainWater tr = new TrappedRainWater();
		
		System.out.println(tr.findTrappedWater(height));
	}

}
