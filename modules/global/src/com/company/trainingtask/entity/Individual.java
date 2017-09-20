package com.company.trainingtask.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Column;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@DiscriminatorValue("individual")
@Table(name = "TRAININGTASK_INDIVIDUAL")
@Entity(name = "trainingtask$Individual")
public class Individual extends Customer {
    private static final long serialVersionUID = 3840367538832423352L;

    @Column(name = "PASSPORT_NO", nullable = false, unique = true, length = 10)
    protected String passportNo;

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPassportNo() {
        return passportNo;
    }


}