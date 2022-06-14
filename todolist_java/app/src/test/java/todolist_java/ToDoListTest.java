package todolist_java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ToDoListTest {

@Test public void StartsWithEmptyTodo(){

  ToDoList test_list = new ToDoList();

  assertEquals("The to do list should initialize empty.", 0, test_list.getTasks().size());

}

@Test public void AddsTaskToTodo(){

  ToDoList test_list = new ToDoList();

  test_list.addTask("gym");

  assertEquals("The to do list correctly shows a new task was added.", 1, test_list.getTasks().size());


}



  
}

/***
 * 
 
  @Test public void testReturnNameAndPrice() {
    PriceDisplay item = new PriceDisplay();
    
    String ItemName = "coffee";

    double Price = 3.0;

    
    assertEquals("Item should return the string: The price for item: <item name> is <price>", "The price for item: coffee is 3.00", item.getPriceLabel(ItemName, Price));


 * 
 * 
 */


/***
ToDo (ArrayList<String>)
ToDo.init (EMPTY ARRAY)
ToDo.addTask(String)
ToDo.getTasks

 */