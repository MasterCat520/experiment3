package edu.example.petclinic.model;

import org.springframework.data.relational.core.mapping.Table;

import java.beans.Transient;
import java.util.Date;

@Table("pets")
public class Pet extends NamedEntity{
    private Date birthDate;
    private int typeId;
//    @Transient
//    private PetType type;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
