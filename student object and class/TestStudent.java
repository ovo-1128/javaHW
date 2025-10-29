public class TestStudent {

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student("江晨","U11016010","女",164);
				  
    student1.printAttribute();
    student2.printAttribute();
    }
  }

class Student{
  String name;
  String studentID;
  String gender;
  int hieght;
			    
  Student(){
    name = "classmate";
    studentID = "U11034567";
    gender = "男";
    hieght = 178;
  }
				
  Student(String name, String studentID, String gender, int hieght){
    this.name = name;
    this.studentID = studentID;
    this.gender = gender;
    this.hieght = hieght;
    }

  void printAttribute() {
    System.out.println(name+" "+studentID+" "+gender+" "+hieght+" ");
    }

}
