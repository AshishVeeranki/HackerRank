import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
class Compare implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		if (s1.getCgpa()==s2.getCgpa()) {
			if (s1.getFname()==s2.getFname()) {
				if (s1.getId() < s2.getId()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			else {
				return s1.getFname().compareTo(s2.getFname());
			}
		}
		else if (s1.getCgpa() < s2.getCgpa()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}




public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      Compare comp = new Compare();
       
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       Collections.sort(studentList,comp);
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
