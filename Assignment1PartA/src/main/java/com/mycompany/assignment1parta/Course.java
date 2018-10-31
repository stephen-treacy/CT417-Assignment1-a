
package com.mycompany.assignment1parta;

import org.joda.time.*;

import java.util.ArrayList;

public class Course {
    public String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module[] getModules() {
        Module[] mod = new Module[modules.size()];
        for(int i = 0; i < modules.size(); i++){
            mod[i] = modules.get(i);
        }
        return mod;
    }

    public void setModules(Module[] modules) {
       for(int i = 0; i < modules.length; i++){
        this.modules.add(modules[i]);
                }
    }

    public DateTime getStartDate() {
        return startDate;
    }
    
    public void setStartDate(DateTime startDate)    {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
    
    public void setEndDate(DateTime endDate)    {
        this.endDate = endDate;
    }
}
