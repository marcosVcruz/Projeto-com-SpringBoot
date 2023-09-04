package com.marcosVcruz.cursoSpringBoot.services.exceptions;

public class ResourceFoundException extends RuntimeException {

    public ResourceFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
