package com.gui.bookstore.model.enums;

import lombok.Getter;

@Getter
public enum StatusRental {

    ENTREGUE ("ENTREGUE"),
    ATRASADO ("ATRASADO"),
    LENDO ("LENDO");

    private final String status;

    public String getRentStatus(){
        return this.status;
    }

    StatusRental(String status) {
        this.status = status;
    }
}
