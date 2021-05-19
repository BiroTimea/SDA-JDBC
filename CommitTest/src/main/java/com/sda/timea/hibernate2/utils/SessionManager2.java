package com.sda.timea.hibernate2.utils;

import com.sda.timea.hibernate.utils.AbstractSessionManager;
import com.sda.timea.hibernate2.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager2 extends AbstractSessionManager {

    private static final SessionManager2 INSTANCE = new SessionManager2();

    private SessionManager2() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("Human_Resources");

    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {

        configuration.addAnnotatedClass(Attendance.class);
        configuration.addAnnotatedClass(Classroom.class);
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Team.class);
        configuration.addAnnotatedClass(Topic.class);
        configuration.addAnnotatedClass(Modul.class);


    }

}
