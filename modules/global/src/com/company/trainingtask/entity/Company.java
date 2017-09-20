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
@DiscriminatorValue("company")
@Table(name = "TRAININGTASK_COMPANY")
@Entity(name = "trainingtask$Company")
public class Company extends Customer {
    private static final long serialVersionUID = -4696869392594194079L;

    @Column(name = "INN", nullable = false, unique = true)
    protected String inn;

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }


}