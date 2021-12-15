# TechnicalTask

# Task State Api 
- the api is written in java spring boot
- you need to have java, jdk 11, spring boot installed 
- to run the program u need to run TechnicalTask\task_state_api\src\main\java\com\example\task_state_api\TaskStateApiApplication.java
- after running the program the api will be hosted on localhost:8080 
- you can run the program by opening any java IDE or compiling the files using cmd

# Application Details

## Creating a task
- you need to make a post method to /task and adding the title in the request body as shown in picture
- if the task is created successfuly True will be returned else it will return false
![1](https://user-images.githubusercontent.com/55473799/146255794-d3968869-9ea2-4bd5-8920-362fef28bf13.PNG)

## getting all tasks created 
- to get all tasks you have created you neeed to make a get request to /tasks
- all tasks will be returned as shown in image
![2](https://user-images.githubusercontent.com/55473799/146256051-f32b52d8-a187-4e2e-b1a2-e10d070d81ab.PNG)

## getting a task with certain ID
- to get a certain task with certain ID , you need to make a get request to /tasks/{ID} in {ID} you put the ID you want
- the Task with this certain ID is then returned
![3](https://user-images.githubusercontent.com/55473799/146256419-ce526bd7-3514-4a86-a4bf-42716e911599.PNG)

## changing task state for a certain task
- to change the state of a task , you need to make put request to /task/{ID}/{state number}/updatestate
- {ID} stands for ID and {state number} stands for state number
- state number will be translated as follows:
- 0: Draft
- 1: Active
- 2: Done
- 3: Archived
- True will be returned if state changed successfuly and false other wise
![4](https://user-images.githubusercontent.com/55473799/146257187-b718c024-2fcb-4706-9c78-68007af83b70.PNG)

## changing task title for a certain task
- to change the title of a task, you need to make a put request to /task/{ID}/{new title}/updateTitle
- true will be returned if it is changed and false other wise
![5](https://user-images.githubusercontent.com/55473799/146257728-3401bbf2-fa2a-40b0-8f9c-6c591830bb81.PNG)

## deleting a certain task
- to delete a task you need to make a delete request to /tasks/{ID}/delete
- a task with an id you entered will be deleted and will return true
- if task is not found then it will return false
![6](https://user-images.githubusercontent.com/55473799/146257957-8f044e71-b29c-402d-9f0d-26f7e00bf76b.PNG)

