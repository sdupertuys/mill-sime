package fr.ippon.mill.farmer.infrastructure.primary;

public class HttpResponse {
    private Object entity;
    private String message;
    private boolean withError;

    public HttpResponse(Object entity, String message, boolean withError) {
        this.entity = entity;
        this.message = message;
        this.withError = withError;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isWithError() {
        return withError;
    }

    public void setWithError(boolean withError) {
        this.withError = withError;
    }
}
