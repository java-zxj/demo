package com.fh;

public class Test {
  public static void main(String[] args){
	  /*	1. ����ArrayTest��, ��֪һά���� {33��99��66��77��120��199��6��80}
		�����������3�ı���������9�ı��������� */
	/*	int[] arr={33,99,66,77,120,199,6,80};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0&&arr[i]%9!=0){
				System.out.println(arr[i]);
			}
		}*/

//2. int[] arr = {22,23,15,12,33,32},��ȡ�����������Сֵ���±ꡣ
		/*	int[] arr = {22,23,15,12,33,32};
			int min=0;
			for(int i=0;i<arr.length;i++){
				if(arr[min]>arr[i]){
					min=i;
				}
			}
			System.out.println(min);*/
	
				/*3. ��֪һά���� {111��15��32��21��2��3��5��6}
				������������ż���������������̨*/
			/*	int []arr={111,15,32,21,2,3,5,6};
					int max=arr[0];
					for(int i=0;i<arr.length;i++){
					if(arr[i]%2==0){
						max=arr[i];
						break;//�ҵ���һ������ż������ѭ��
					}
					}
					/�͵�һ������ż���Ƚ�
					for(int i=0;i<arr.length;i++){
						if(max<arr[i]&&arr[i]%2==0){
							max=arr[i];
						}
					}
					System.out.println(max);*/
	
		/*4. һά���飬int[] arr = {77,38,24,18,198,37}��
			���������е���������ż���ͣ������������̨*/
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
			System.out.println("������Ϊ"+sumq);
			System.out.println("ż����Ϊ"+sumo);*/
	
			//5. int[] arr = {22,23,15,12,33,32},����������ֵ
			/*int[] arr = {22,23,15,12,33,32};
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
				if(max<arr[i]){
					max=arr[i];
				}
			}
			System.out.println(max);*/
	
			/*6. ��֪һά���� {31��9��16��79��12��19��6��80}
			�����������4�ı���������9�ı�������*/
			/*int[]arr={31,9,16,79,12,19,6,80};
			for(int i=0;i<arr.length;i++){
				if(arr[i]%4==0 || arr[i]%9==0){
					System.out.println(arr[i]);
				}
			}*/

	
		//7.��֪һά���� {50��82��31��15��1��120��6��20}������������ż��
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

	//8. ��֪����int[] arr = {32,21,16,33,120,60}���������е���Сֵ�����ֵ����λ�ý���
		/*int[] arr = {32,21,16,33,120,60};
		int min =0;//Ĭ�ϵ�һ��Ϊ��Сֵ���±�
		int max =0;//��һ��Ϊ���ֵ���±�
		for(int i=0;i<arr.length;i++){
			if(arr[min]>arr[i]){
				min=i;//�ҵ���Сֵ������
			}
			if(arr[max]<arr[i]){
				max=i;//�ҵ����ֵ������
			}
		}
		//����λ��
		int temp;
		temp=arr[min];
		arr[min]=arr[max];
		arr[max]=temp;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
	
	//	9.int[] arr= {3,-7,22,15,89,21,10,14}���������е���Сֵ�����һλ����λ�ý���
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
	
		//10.��֪һά���� {111��15��32��21��2��3��5��6}����������С������
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
	

	//	11.int[] arr = {11,23,33,12,21,32}��ʹ��ð�������С����Ը������������
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
