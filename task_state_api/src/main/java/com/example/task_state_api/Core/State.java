package com.example.task_state_api.Core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

public enum State {
  DRAFT("DRAFT"),
  ACTIVE("ACTIVE"),
  DONE("DONE"),
  ARCHIVED("ARCHIVED");

  private String stateStr;

  private State(String stateStr)
  {
    this.stateStr = stateStr;
  }
  @JsonValue
  public String getStateStr() {
    return stateStr;
  }

  public static State mapIntToState(int state)
  {
    switch (state)
    {
      case 0:
        return State.DRAFT;
      case 1:
        return State.ACTIVE;
      case 2:
        return State.DONE;
      case 3:
        return State.ARCHIVED;
      default:
        return null;
    }
  }
}
