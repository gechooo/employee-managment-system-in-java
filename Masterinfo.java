/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Nauman
 */
@Entity
@Table(name = "masterinfo", catalog = "fms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Masterinfo.findAll", query = "SELECT m FROM Masterinfo m")
    , @NamedQuery(name = "Masterinfo.findById", query = "SELECT m FROM Masterinfo m WHERE m.id = :id")
    , @NamedQuery(name = "Masterinfo.findByName", query = "SELECT m FROM Masterinfo m WHERE m.name = :name")
    , @NamedQuery(name = "Masterinfo.findByState", query = "SELECT m FROM Masterinfo m WHERE m.state = :state")
    , @NamedQuery(name = "Masterinfo.findByCity", query = "SELECT m FROM Masterinfo m WHERE m.city = :city")
    , @NamedQuery(name = "Masterinfo.findByDateofjoining", query = "SELECT m FROM Masterinfo m WHERE m.dateofjoining = :dateofjoining")
    , @NamedQuery(name = "Masterinfo.findBySalary", query = "SELECT m FROM Masterinfo m WHERE m.salary = :salary")
    , @NamedQuery(name = "Masterinfo.findByDepartment", query = "SELECT m FROM Masterinfo m WHERE m.department = :department")
    , @NamedQuery(name = "Masterinfo.findByContactnumber", query = "SELECT m FROM Masterinfo m WHERE m.contactnumber = :contactnumber")})
public class Masterinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "dateofjoining")
    private String dateofjoining;
    @Basic(optional = false)
    @Column(name = "salary")
    private String salary;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "contactnumber")
    private String contactnumber;
    @Basic(optional = false)
    @Lob
    @Column(name = "image")
    private byte[] image;

    public Masterinfo() {
    }

    public Masterinfo(Integer id) {
        this.id = id;
    }

    public Masterinfo(Integer id, String name, String state, String city, String dateofjoining, String salary, String department, String contactnumber, byte[] image) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.city = city;
        this.dateofjoining = dateofjoining;
        this.salary = salary;
        this.department = department;
        this.contactnumber = contactnumber;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(String dateofjoining) {
        String oldDateofjoining = this.dateofjoining;
        this.dateofjoining = dateofjoining;
        changeSupport.firePropertyChange("dateofjoining", oldDateofjoining, dateofjoining);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        String oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        String oldContactnumber = this.contactnumber;
        this.contactnumber = contactnumber;
        changeSupport.firePropertyChange("contactnumber", oldContactnumber, contactnumber);
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        byte[] oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Masterinfo)) {
            return false;
        }
        Masterinfo other = (Masterinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Masterinfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
