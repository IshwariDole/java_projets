import java.util.*;
public class StudentGradeCalculator{
	public static void main(String args[])
	{ 
	    String grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total number of subjects: ");
		int subject_no=sc.nextInt();
		System.out.println("Enter all subject marks:");
		
		int sum=0;
		for(int i=0;i<subject_no;i++){
			int sub_marks=sc.nextInt();
			   sum=sum+sub_marks;
		}
		System.out.println("Total Marks:"+sum);
		float avg=sum/subject_no;
		System.out.println("Average persentage:"+avg);
		
		  if(avg>=80)
		  {
			  grade="A";
			  System.out.println("grade:"+grade);
		  }
		 else if(avg>=60 && avg<80)
		 {
			 grade="B";
			 System.out.println("grade:"+grade);
		 }	
		 else if(avg>=40 && avg<60)
		 {
			 grade="C";
			 System.out.println("grade:"+grade);
		 }	
		 else
		 {
			 grade="D";
			 System.out.println("grade:"+grade);
		 }
	}
}