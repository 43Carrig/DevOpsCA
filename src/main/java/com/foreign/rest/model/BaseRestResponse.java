package com.foreign.rest.model;

public abstract class BaseRestResponse {

    private boolean success;

    protected BaseRestResponse(boolean status) {
        this.success = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


}
