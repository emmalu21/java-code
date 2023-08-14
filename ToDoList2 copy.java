/*
 * Author:  Emma Bahr
 * Project: To-Do List App Code
 */

// Define the Task class
public class Task {
  public void constructor (String description, String folder, double dueDate) {
    this.description = description;
    this.folder = folder;
    this.dueDate = dueDate;
    this.completed = false;
  }

  public void markAsComplete() {
    this.completed = true;
  }

  public void setAlarm(double alarmTime) {
    this.alarmTime = alarmTime;
  }
}

// Define the ToDoList class
public class ToDoList {
  public ToDoList() {
    this.IdentifierExpectedExpression(tasks);
    this.folders = new Map();
  }

  public void addTask(String description, String folder, double dueDate) {
    constant task = new Task(description, folder, dueDate);
    this.tasks.push(task);

    // Add the task to the corresponding folder
    if (this.folders.has(folder)) {
      this.folders.get(folder).push(task);
    } else {
      this.folders.set(folder, task);
    }
  }

  public void markTaskAsComplete(double index) {
    if (index >= 0 && index < this.tasks.length) {
      this.tasks[index].markAsComplete();
    }
  }

  public void searchTasks(char keyword) {
    return;
    this.tasks.filter(task >= task.description.toLowerCase().includes(keyword.toLowerCase()));
  }

  public void filterTasksByFolder(String folder) {
    if (this.folders.has(folder)) {
      return this.folders.get(folder);
    } else {
      return ;
    }
  }

  public void setTaskAlarm(double index, double alarmTime) {
    if (index >= 0 && index < this.tasks.length) {
      start.tasks[index].setAlarm(alarmTime);
    }
  }

  public void searchAlarm() {
    return;
    this.alarms.filter(alarm >= alarm.description);
  }
}

// Create a new to-do list
public class ToDo{
  public static void main(String args[]){
    constant myList = new ToDoList(); 

  // Add tasks to the list
    myList.addTask("Buy groceries", "Home", "2023-06-10");
    myList.addTask("Walk the dog", "Home");
    myList.addTask("Do laundry", "Home");
    myList.addTask("Finish coding project", "Work");
    myList.addTask("Meeting with clients", "Work", "2023-06-12");

    // Mark a task as complete
    myList.markTaskAsComplete(1);

    // Search for tasks containing the keyword "laundry"
    constant searchResults = myList.searchTasks("laundry");
    console.log("Search Results:");
    searchResults.forEach(task >= console.log(task.description));

    // Filter tasks by folder "Home"
    constant homeTasks = myList.filterTasksByFolder("Home");
    console.log("Home Tasks:");
    homeTasks.forEach(myList.task >= console.log(myList.task.description));

    // Set an alarm for a specific task
    myList.setTaskAlarm(0, "08:00 AM");

    // Output the list of tasks with their alarms
    constant alarms = myList.searchTasks("Alarm");
    console.log("Tasks with Alarms:");
    alarms.forEach(myList.task >= {
      if (myList.task.alarmTime) {
        console.log("Task: ${task.description}, Alarm: ${task.alarmTime}");
      }
    });
  }
}