package com.fh;

public class Test {
  public static void main(String[] args){
	  /*	1. 定义ArrayTest类, 已知一维数组 {33，99，66，77，120，199，6，80}
		输出数组中是3的倍数但不是9的倍数的数。 */
	/*	int[] arr={33,99,66,77,120,199,6,80};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0&&arr[i]%9!=0){
				System.out.println(arr[i]);
			}
		}*/

//2. int[] arr = {22,23,15,12,33,32},获取这个数组中最小值的下标。
		/*	int[] arr = {22,23,15,12,33,32};
			int min=0;
			for(int i=0;i<arr.length;i++){
				if(arr[min]>arr[i]){
					min=i;
				}
			}
			System.out.println(min);*/
	
				/*3. 已知一维数组 {111，15，32，21，2，3，5，6}
				求数组中最大的偶数，并输出到控制台*/
			/*	int []arr={111,15,32,21,2,3,5,6};
					int max=arr[0];
					for(int i=0;i<arr.length;i++){
					if(arr[i]%2==0){
						max=arr[i];
						break;//找到第一个最大的偶数跳出循环
					}
					}
					/和第一个最大的偶数比较
					for(int i=0;i<arr.length;i++){
						if(max<arr[i]&&arr[i]%2==0){
							max=arr[i];
						}
					}
					System.out.println(max);*/
	
		/*4. 一维数组，int[] arr = {77,38,24,18,198,37}，
			计算数组中的奇数和与偶数和，并输出到控制台*/
	/*	int[] arr = {77,38,24,18,198,37};
		int sumq=0;
		int sumo=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				sumq+=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
				if(arr[i]%2==0){
					sumo+=arr[i];
				}
			}
			System.out.println("奇数和为"+sumq);
			System.out.println("偶数和为"+sumo);*/
	
			//5. int[] arr = {22,23,15,12,33,32},求数组的最大值
			/*int[] arr = {22,23,15,12,33,32};
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
				if(max<arr[i]){
					max=arr[i];
				}
			}
			System.out.println(max);*/
	
			/*6. 已知一维数组 {31，9，16，79，12，19，6，80}
			输出数组中是4的倍数或者是9的倍数的数*/
			/*int[]arr={31,9,16,79,12,19,6,80};
			for(int i=0;i<arr.length;i++){
				if(arr[i]%4==0 || arr[i]%9==0){
					System.out.println(arr[i]);
				}
			}*/

	
		//7.已知一维数组 {50，82，31，15，1，120，6，20}求数组中最大的偶数
	/*	int [] arr={50,82,31,15,1,120,6,20};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				max=arr[i];
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0&&max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println(max);*/

	//8. 已知数组int[] arr = {32,21,16,33,120,60}，将数组中的最小值和最大值进行位置交换
		/*int[] arr = {32,21,16,33,120,60};
		int min =0;//默认第一个为最小值的下标
		int max =0;//第一个为最大值的下标
		for(int i=0;i<arr.length;i++){
			if(arr[min]>arr[i]){
				min=i;//找到最小值的索引
			}
			if(arr[max]<arr[i]){
				max=i;//找到最大值的索引
			}
		}
		//交换位置
		int temp;
		temp=arr[min];
		arr[min]=arr[max];
		arr[max]=temp;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
	
	//	9.int[] arr= {3,-7,22,15,89,21,10,14}，将数组中的最小值和最后一位进行位置交换
	/*  int [] arr={3,-7,22,15,89,21,10,14};
	  int min=0;
	  for(int i=0;i<arr.length;i++){
		if(arr[min]>arr[i]){
			min=i;
		}
	  }
	  int temp;
	  temp=arr[arr.length-1];
	 arr[arr.length-1]=arr[min];
	  arr[min]=temp;
	  for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	  }*/
	
		//10.已知一维数组 {111，15，32，21，2，3，5，6}求数组中最小的奇数
	/*	int[]arr={111,15,32,21,2,3,5,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				min=arr[i];
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0&&min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(min);*/
	

	//	11.int[] arr = {11,23,33,12,21,32}请使用冒泡排序从小到大对该数组进行排序
			int [] arr={11,23,33,12,21,32};
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
  }
}
