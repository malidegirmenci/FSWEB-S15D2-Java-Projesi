package com.workintech.utils;

import com.workintech.entity.Task;

import java.util.Iterator;
import java.util.Set;


public class SetUtils {
    public static  void printAllSet(Set<Task> set){
        Iterator<Task> iterator = set.iterator();
        while(iterator.hasNext()){
            Task task = iterator.next();
            System.out.println("-->Task Detail<--" +
                    "\nProject: "+task.getProject()+
                    "\nDescription: "+task.getDescription()+
                    "\nAssignee: "+task.getAssignee()+
                    "\nPriority: "+task.getPriority()+
                    "\nStatus: "+task.getStatus());
        }
    }
}
