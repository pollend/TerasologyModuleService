package org.terasology;

import dagger.Component;
import org.terasology.auth.JWTAuth;
import org.terasology.dao.DataAccessObjectModule;
import org.terasology.resource.AuthResource;
import org.terasology.resource.UserResource;
import org.terasology.services.ServiceModule;


@Component(modules = {DataAccessObjectModule.class, ServiceModule.class})
public interface Core {
    UserResource userResource();
    AuthResource authResource();
    JWTAuth jwtAuth();
}
