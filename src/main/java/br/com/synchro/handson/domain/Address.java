package br.com.synchro.handson.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author cvs
 * @version 1.0
 */
@Entity
@Table(name = "tb_address")
@XmlRootElement
@SuppressWarnings("serial")
public class Address implements Serializable {

    @Id
    @SequenceGenerator(name = "SYN_SEQ_ADDRESS", sequenceName = "SYN_SEQ_ADDRESS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SYN_SEQ_ADDRESS")
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "number_id")
    private Integer number;

    @Column(name = "district")
    private String district;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private String zipcode;

    /**
     * @return city
     */
    public String getCity() {
	return city;
    }

    /**
     * @return district
     */
    public String getDistrict() {
	return district;
    }

    /**
     * @return id
     */
    public Long getId() {
	return id;
    }

    /**
     * @return number
     */
    public Integer getNumber() {
	return number;
    }

    /**
     * @return street
     */
    public String getStreet() {
	return street;
    }

    /**
     * @return zipcode
     */
    public String getZipcode() {
	return zipcode;
    }

    /**
     * @param pCcity
     */
    public void setCity(final String pCcity) {
	this.city = pCcity;
    }

    /**
     * @param pDdistrict
     */
    public void setDistrict(final String pDdistrict) {
	this.district = pDdistrict;
    }

    /**
     * @param pId
     */
    public void setId(final Long pId) {
	this.id = pId;
    }

    /**
     * @param pNumber
     */
    public void setNumber(final Integer pNumber) {
	this.number = pNumber;
    }

    /**
     * @param pStreet
     */
    public void setStreet(final String pStreet) {
	this.street = pStreet;
    }

    /**
     * @param pZipcode
     */
    public void setZipcode(final String pZipcode) {
	this.zipcode = pZipcode;
    }

    @Override
    public String toString() {
	return "Address [id=" + id + ", street=" + street + ", number=" + number + ", district=" + district + ", city=" + city
		+ ", zipcode=" + zipcode + "]";
    }
}
