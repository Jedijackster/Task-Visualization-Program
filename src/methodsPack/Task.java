package methodsPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    String name;
    String description;
    boolean isCompleted = false;
    private Task parentTask;
    private List<Task> subtasksList = new ArrayList<>(15);

    public Task addSubTask(){
        Scanner sc = new Scanner(System.in);
        Task subtask = new Task();
        setParentTask(subtask);
        System.out.println("Provide task name: ");        
        subtask.name = sc.nextLine();
        System.out.println("Provide task description: ");
        subtask.description = sc.nextLine();
        return subtask;
    }
    


    //Finder declares where you are in your subtask, what the parent task is and what the subtasks of current are
    //unfinished
    
    public void finder(){
        String current = this.getName();
        String parent;
        if (this.parentTask == null){parent = "N/A";}
        else{parent = this.parentTask.toString();}
        int num = this.subtasksList.size();
        System.out.printf("You are currently in the task: %s, with parent: %s, and have %d number of subtasks listed as: ", current, parent, num);
        int i=0;
        while (i < this.subtasksList.size()){
            System.out.print(this.subtasksList+", ");
            i++;
        }
    }
    


    //Getters and Setters for name description and marker for if task was completed
    public void subSetter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 if you want no subtasks and a value between 1 and 15 for number of subtasks you would like: ");
        int val = sc.nextInt();
        if (val == 0) {
            System.out.println("No subtasks reported.");
        }else if(val >15 ){
            System.out.println("Too many Subtask entered. Aborting program.");
            System.exit(0);
        }
        else {
            
            for (int k=0; k<val; k++) {
                subtasksList.add(addSubTask());
            }
        }
    }

    public void setName(String input){    this.name =input;}
    public String getName() {   return this.name;}

    public void setDescript(String input){  this.description =input;}
    public String getDescript() {   return this.description;}

    public void mark(boolean val){  this.isCompleted = val;} 

    //Parent/subtask task getters and setters 
    public void setParentTask(Task cur) {
        cur.parentTask = this;
    }

    public List<Task> getSubtasks() {
        return subtasksList;
    }

    
    //Printer methods that display task and subtask info
    //unfinished
 
    public void printTask(Task cur) {
        if (this.parentTask != null) {
            System.out.println(cur.parentTask);
            System.out.println("\t|\n\tV");
        }else {System.out.printf("\t%s\n\t|\n\tV",cur.name);}
        int num = this.subtasksList.size();
        for (int k=0; k < num; k++){
            System.out.print("|");
            for (int i=0; i < num; i++){    
                System.out.print("\t");
            
        }}
        System.out.print("\nV");
        System.out.print("\t\t");
        System.out.print("V\n");
        System.out.print("sub1\t\tsub2");
        

    } 



}