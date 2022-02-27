package com.auto.eventwisher.models;

import com.bol.secure.Encrypted;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Setter
@Getter
public class WeddingAnniversaryInfoDto {

    @Encrypted
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate receiverAnniversaryDate;

    @Encrypted
    private String customAnniversaryWish;

    private String receiverPartnerFirstName;

    @Encrypted
    private String receiverPartnerLastName;
}
