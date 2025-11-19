import java.util.Scanner;
// Model : Stores or Handle data
// View  : Display data
// Controller: Connect Model and View

// model
class StudentModel{
    private String studentname;
    private String studentRollNo;

    public void setStudentname(String name){
        studentname = name;
    }
    public void setStudentRollNo(String roll){
        studentRollNo = roll;
    }
    public String getStudentName(){
        return studentname;
    }
    public String getStudentRollNo(){
        return studentRollNo;
    }
}

// views
class ModelView{
    public void display(String studentname, String studentroll){
        System.out.println("Student Details");
        System.out.println("Name "+studentname);
        System.out.println("Roll No. " + studentroll);
    }
}

// controller
class ModelController{
    private StudentModel model;
    private ModelView view;

    public ModelController(StudentModel model, ModelView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentname(String name){
        model.setStudentname(name);

    }
    public void setStudentRollNo(String roll){
        model.setStudentRollNo(roll);
    }

    public void updateView(){
       view.display(model.getStudentName(), model.getStudentRollNo());

    }
}

public class UnderstandingMVC {
    public static void main(String []args){
        StudentModel model = new StudentModel();
        model.setStudentRollNo("2024071116");
        model.setStudentname("Anurag Mishra");
        
        ModelView view = new ModelView();
        ModelController controller = new ModelController(model,view);
        
        controller.updateView();
    }
}
