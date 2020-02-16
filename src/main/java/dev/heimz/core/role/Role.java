package dev.heimz.core.role;

import dev.heimz.core.application.Application;
import dev.heimz.core.subject.Subject;

import java.util.List;

public class Role {

    private String name;

    private Application application;

    private List<? extends Subject> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<? extends Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<? extends Subject> subjects) {
        this.subjects = subjects;
    }
}
