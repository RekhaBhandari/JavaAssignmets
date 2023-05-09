import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		System.out.println("Enter number of students: ");
		num = scnr.nextInt();
		
		double maxScore = 0;
//		int maxIndex = 0;
		String maxStudent = null;
		for(int i = 0; i < num; i++) {
			String studentName;
			double studentScore;
			System.out.println("Enter the name of student: ");
			studentName = scnr.next();
			System.out.println("Enter the score of student: ");
			studentScore = scnr.nextDouble();
			if(maxScore < studentScore) {
				maxScore = studentScore;
//				maxIndex = i;
				maxStudent = studentName;
			}
		
	}
		
		System.out.println(maxStudent + " got the highest score of " + maxScore);	
	}
}
	
	
//	private String name;
//	private double score;
//	
//	public Student(String name, double score){
//		this.name = name;
//		this.score = score;
//	}
//	
//
//	public Student() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//
//	public double getScore() {
//		return score;
//	}
//
//
//
//
//	public void setScore(double score) {
//		this.score = score;
//	}
//
//
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scnr = new Scanner(System.in);
//		int num;
////		List<Student> studentList = new ArrayList<>();
//		System.out.println("Enter number of students: ");
//		num = scnr.nextInt();
//		Student[] students = new Student[num];
//		
////		for(int i = 0; i < num; i++) {
////			String studentName;
////			double studentScore;
////			System.out.println("Enter the name of student: ");
////			studentName = scnr.next();
////			System.out.println("Enter the score of student: ");
////			studentScore = scnr.nextDouble();
////			
////			Student student = new Student(studentName, studentScore);
////			studentList.add(student);
////		}
//		
//		double maxScore = 0;
//		int maxIndex = 0;
//		String maxStudent = null;
//		for(int i = 0; i < num; i++) {
//			String studentName;
//			double studentScore;
//			System.out.println("Enter the name of student: ");
//			studentName = scnr.next();
//			System.out.println("Enter the score of student: ");
//			studentScore = scnr.nextDouble();
//			if(maxScore < studentScore) {
//				maxScore = studentScore;
//				maxIndex = i;
//				maxStudent = studentName;
//			}
//			
////			Student student = new Student(studentName, studentScore);
////			students[i] = student;
//		}
//		
//		System.out.println(maxStudent + " got the highest score of " + maxScore);
//	}

	
//	}
