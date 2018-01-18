package org.terasology.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import org.terasology.db.TerasologyServer;

public class TerasologyServerDAO extends AbstractDAO<TerasologyServer> {
    public TerasologyServerDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
