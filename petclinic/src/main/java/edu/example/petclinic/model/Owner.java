package edu.example.petclinic.model;

import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Collection;

@Table("owners")
public class Owner extends Person{
    String address;
    String city;
    String telephone;

    @MappedCollection(idColumn = "owner_id", keyColumn = "name") //idColumn->foreign_key keyColumn->order by ...
    private Collection<Pet> pets;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Collection<Pet> getPets() {
        return pets;
    }
}
