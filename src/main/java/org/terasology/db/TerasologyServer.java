package org.terasology.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "terasology_server")
public class TerasologyServer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false,length = 256)
    private String name;

    @Column(name = "address", nullable = false,length = 256)
    private String address;

    @Column(name = "port", nullable = false)
    private int port;

    @Column(name = "country",nullable = false, length = 256)
    private String country;

    @Column(name = "state_providence",nullable = false, length = 256)
    private String stateProvidence;

    @Column(name = "city",nullable = false, length = 256)
    private String city;

    @Column(name = "active",nullable = false)
    private boolean active;

    @Column(name = "mod_time", nullable = false)
    private Date modTime;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStateProvidence() {
        return stateProvidence;
    }

    public void setStateProvidence(String stateProvidence) {
        this.stateProvidence = stateProvidence;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getActive(){
        return this.active;
    }


}
