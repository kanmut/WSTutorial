
package com.tutorial.kanmut.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "multiplyAsDouble", namespace = "http://kanmut.tutorial.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyAsDouble", namespace = "http://kanmut.tutorial.com/")
public class MultiplyAsDouble {

    @XmlElement(name = "multiplicand", namespace = "")
    private Double multiplicand;

    /**
     * 
     * @return
     *     returns Double
     */
    public Double getMultiplicand() {
        return this.multiplicand;
    }

    /**
     * 
     * @param multiplicand
     *     the value for the multiplicand property
     */
    public void setMultiplicand(Double multiplicand) {
        this.multiplicand = multiplicand;
    }

    @XmlElement(name = "multiplier", namespace = "")
    private Double multiplier;

    /**
     * 
     * @return
     *     returns Double
     */
    public Double getMultiplier() {
        return this.multiplier;
    }

    /**
     * 
     * @param multiplier
     *     the value for the multiplier property
     */
    public void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

}
