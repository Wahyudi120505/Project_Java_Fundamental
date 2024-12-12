package com.guitartune.project_wahyudi.services;

import com.guitartune.project_wahyudi.models.User;


public interface GetAuthorities{
    public User getAuthenticatedUser() throws Exception;
}
