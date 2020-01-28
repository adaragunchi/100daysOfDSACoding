package com.ds.sorting;

public class InterSectionOfTwoArrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {1,3,4,8,9};
	int[] result=new int[a.length];
	int count=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				result[count]=a[i];
				count++;
			}
		}
	}
	
	for(int i=0;i<result.length;i++) {
		System.out.println(result[i]);
	}
}
}
