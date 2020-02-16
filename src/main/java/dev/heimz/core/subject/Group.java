package dev.heimz.core.subject;

import java.util.List;

public class Group extends Subject {

  private List<? extends Subject> subjects;

  public List<? extends Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<? extends Subject> subjects) {
    this.subjects = subjects;
  }
}
