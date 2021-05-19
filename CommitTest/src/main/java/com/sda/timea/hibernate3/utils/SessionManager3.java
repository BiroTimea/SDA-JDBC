package com.sda.timea.hibernate3.utils;

import com.sda.timea.hibernate.utils.AbstractSessionManager;
import com.sda.timea.hibernate3.model.Client;
import com.sda.timea.hibernate3.model.Reservation;
import com.sda.timea.hibernate3.model.Seat;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager3 extends AbstractSessionManager {

    private static final SessionManager3 INSTANCE = new SessionManager3();

    private SessionManager3() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("cinema_sda");

    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {

      configuration.addAnnotatedClass(Client.class);
      configuration.addAnnotatedClass(Reservation.class);
      configuration.addAnnotatedClass(Seat.class);

    }

}
