/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.ebanking.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author HMD
 */
@Entity
@Table(name = "InvestmentPlan")
@Inheritance(strategy = InheritanceType.JOINED)
public class InvestmentPlan implements Serializable{
    @Id
    @GeneratedValue
    private Long investmentPlanId;

    public Long getOpenedTermInvestmentId() {
        return investmentPlanId;
    }

    public void setOpenedTermInvestmentId(Long id) {
        this.investmentPlanId = id;
    }
    
}
