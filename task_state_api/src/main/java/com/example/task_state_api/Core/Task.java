package com.example.task_state_api.Core;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Task {
   private String title;
   private State taskState;
   private int taskID;

   public int getTaskID() {
      return taskID;
   }
   public String getTaskState()
   {
      return taskState.getStateStr();
   }
   public boolean setTaskID(int taskID) {
      this.taskID = taskID;
      return true;
   }
   public Task()
   {
      taskState = State.DRAFT;
   }
   public Task(String title)
   {
      this.title = title;
      this.taskState = State.DRAFT;
   }

   public String getTitle() {
      return title;
   }

   public boolean setTitle(String title) {
      this.title = title;
      return true;
   }

   public boolean setState(int stateInt)
   {
      State state = State.mapIntToState(stateInt);
      switch (state)
      {
         case DRAFT:
            return taskState == state;
         case ACTIVE:
            if (taskState == State.DRAFT)
            {
               taskState = state;
               return true;
            }
            else
               return false;
         case DONE:
            if(taskState == State.ACTIVE)
            {
               taskState = state;
               return true;
            }
            else
               return false;
         case ARCHIVED:
            taskState = state;
            return true;
         default:
            return false;
      }
   }
}
