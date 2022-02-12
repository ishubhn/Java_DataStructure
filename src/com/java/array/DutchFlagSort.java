package com.java.array;

import java.util.Arrays;

public class DutchFlagSort {
	private int[] nums;
	
	public DutchFlagSort(int[] nums) {
		this.nums = nums;
	}
	
	public void sortArray(int[] nums) {
		int i = 0;
		int j = 0;
		int pivot = 1;
		int k = nums.length - 1;	//8 -1 == 7
		
		while (j <= k) { //0 <= 7
			if(nums[j] < pivot) {	
				swap(i, j);
				i++;
				j++;
			} else if(nums[j] > pivot) {	//1. 2 > 1 --> swap
				swap(j, k);
				k--;
			} else {
				j++;
			}
		}
	}
	
	private void swap(int index1, int index2) {
		nums[index1] = nums[index1] + nums[index2];
		nums[index2] = nums[index1] - nums[index2];
		nums[index1] = nums[index1] - nums[index2];
	}
	
	public void showResult(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,0,0,1,1,0};
		
		DutchFlagSort df = new DutchFlagSort(nums);
		
		df.sortArray(nums);
		df.showResult(nums);
		
		
		}
	}

