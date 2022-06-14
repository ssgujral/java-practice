package todolist_java;

import java.util.ArrayList;

class ToDoList {
 
    private ArrayList<String> list_name = new ArrayList<>();

  public void addTask(String new_task){
    this.list_name.add(new_task);
  }

  public ArrayList<String> getTasks(){

    return this.list_name;

  }
  

}


