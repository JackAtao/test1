package jashjk;

import java.util.Arrays;

public class Sys {

	public static  <T> Comparable<T>[] sort(Comparable<T>[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				int result = nums[j].compareTo((T) nums[j+1]);
				if(result>0) {
					Number a = (Number) nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = (Comparable<T>) a;
				}
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		Comparable[] nums = new Comparable[] {69,45,87,25,46,27,67,35};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int a=20 ,aa=20;
		int b=21;
		System.out.println("a++:"+a++);
		System.out.println("++a:"+ ++a);  
		System.out.println(b+1==a++);
		System.out.println(b+3==++a);
		
		final int num = 100;
		Student stu1 = new Student("小红","男",24);
		
		final Student stu = new Student("小明","男",24);
		System.out.println(stu+"---------"+stu.String());
		stu.setAge(26);
		System.out.println(stu+"---------"+stu.String());
		
		
	}
	
}







