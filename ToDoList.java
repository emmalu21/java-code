/*
 * Author:  Emma Bahr
 * Project: To-Do List App Code
 */

// defining the to-do list class

import java.util.MyList;

class ToDoList {

    constructor() {
        this.tasks =[];
    }

    // adding a new task to list

    addTask (task) {
        this.taks.push ( 
            { task, completed: false } );
    }

    // marking a task complete

    completedTask(index){
        if (index >= 0 && index < this.tasks.length) {

            this.tasks[index].completed = true;
        }
    }

    // searching for tasks containing a specific word

    searchTasks (keyword) {
        return this.tasks.filter(task => task.task.toLowerCase().includes(keyword.toLowerCase()));
    }

    // filter tasks based on completion 

    filterTasks(completed) {
        return this.tasks.filter(task => task.completed === completed);
    }

    // creating a new list

    constant myList = new ToDoList();

    // add tasks to list

    myList.addTask("Buy grocries");
    myList.addTask("Walk the dog");
    myList.addTask("Do laundry");

    // mark a task as completed

    myList.completedTask(1);

    // Search for tasks containing keyword

    constant searchResults = myList.searchTasks("laundry");
    console.log("Search Results: ");
    searchResults.forEach(task => console.log(task.task));

    // Filter tasks that are completed

    constant completedTasks = myList.filterTasks(true);
    console.log("Completed Tasks:");
    completedTasks.forEach(task => console.log(task.task));

    // Filter tasks that are not completed
    constant incompleteTasks = myList.filterTasks(false);
    console.log("Incomplete Tasks:");
    incompleteTasks.forEach(task => console.log(task.task));
}

