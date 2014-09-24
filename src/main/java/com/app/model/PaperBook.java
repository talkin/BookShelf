package com.app.model;

public class PaperBook extends Book{
    private BookStatus status;

    @Override
    String getLocation() {
        return null;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
