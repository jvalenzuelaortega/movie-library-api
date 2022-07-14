package cl.mycompany.movielibraryapi.model;

public class Response<T> {

    private int code;
    private String message;
    private Response<T> response;

    public Response(int code, String message, Response<T> response) {
        this.code = code;
        this.message = message;
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response<T> getResponse() {
        return response;
    }

    public void setResponse(Response<T> response) {
        this.response = response;
    }
}
