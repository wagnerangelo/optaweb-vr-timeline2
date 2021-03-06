/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.vehiclerouting.domain;

/**
 * Data set location.
 */
public class RoutingProblemParameters {

    private String demoContext;
    private String demoComplexity;
    private int demoHorizon;
    private String demoInitialDate;
    private String demoElucidation;
    private Boolean isloadingVesselCase;
    private Boolean isTravelTimeCase;
    private Double barrelPrice;
    private Boolean checkEarlyDate;
    private Boolean updateIncludingOrder;
    private String bestSolutionKnowed;



    /**
     *Create routing problem parameters.
     *@param demoContext business context , ie type of vehicle (PSLV, RSV)
     *@param democomplexity business complexity case, if is basic, advanced, multicriteria
     *@param demoHorizon horizon consider to calculate schedule quality parameters (days)
     *@param demoInitialDate initial date of schedule problem (string) ("dd/mm/yy")
     *@param demoElucidation explanation of business case
     */
    public RoutingProblemParameters(final String demoContext, final String demoComplexity) {
        this.demoContext = demoContext;
        this.demoComplexity = demoComplexity;
        this.demoHorizon = 90;
        this.demoInitialDate = "01/01/2021";
        this.demoElucidation = "explanation";
        this.isloadingVesselCase = null;
        this.isTravelTimeCase = null;
        this.barrelPrice = null;
        this.checkEarlyDate = null;
        this.updateIncludingOrder = null;
        this.bestSolutionKnowed = null;
    }

    public RoutingProblemParameters(final String demoContext, final String demoComplexity, final String demoElucidation) {
        this.demoContext = demoContext;
        this.demoComplexity = demoComplexity;
        this.demoHorizon = 90;
        this.demoInitialDate = "01/01/2021";
        this.demoElucidation = demoElucidation;
        this.isloadingVesselCase = null;
        this.isTravelTimeCase = null;
        this.barrelPrice = null;
        this.checkEarlyDate = null;
        this.updateIncludingOrder = null;
        this.bestSolutionKnowed = null;
    }

    /**
     * demoContext.
     * @return demoContext
     */
    public String getDemoContext() {
        return demoContext;
    }

    public void setDemoContext(final String demoContext) {
        this.demoContext = demoContext;
    }

    /**
     * demoComplexity.
     * @return demoComplexity
     */
    public String getDemoComplexity() {
        return demoComplexity;
    }

    public void setDemoComplexity(final String demoComplexity) {
        this.demoComplexity = demoComplexity;
    }

     /**
     * demoHorizon (days)
     * @return demoHorizon
     */
    public int getDemoHorizon() {
        return demoHorizon;
    }

    public void setDemoHorizon(final int demoHorizon) {
        this.demoHorizon = demoHorizon;
    }

    /**
     * initial date.
     * @return String
     */
    public String getDemoInitialDate() {
        return demoInitialDate;
    }

    public void setDemoInitialDate(final String demoInitialDate) {
        this.demoInitialDate = demoInitialDate;
    }

    /**
     * multiline text clarification about case.
     * @return String
     */
    public String getDemoElucidation() {
        return demoElucidation;
    }

    public void setElucidation(final String demoElucidation) {
        this.demoElucidation= demoElucidation;
    }

    @Override
    public String toString() {
        return "DataParameters{" +
                "demoContext" + demoContext + '\'' +
                ", demoComplexity=" + demoComplexity;
    }

    public Boolean getIsloadingVesselCase() {
        return isloadingVesselCase;
    }

    public void setIsloadingVesselCase(Boolean isloadingVesselCase) {
        this.isloadingVesselCase = isloadingVesselCase;
    }

    public Boolean getIsTravelTimeCase() {
        return isTravelTimeCase;
    }

    public void setIsTravelTimeCase(Boolean isTravelTimeCase) {
        this.isTravelTimeCase = isTravelTimeCase;
    }

    public Double getBarrelPrice() {
        return barrelPrice;
    }

    public void setBarrelPrice(Double barrelPrice) {
        this.barrelPrice = barrelPrice;
    }

    public Boolean getCheckEarlyDate() {
        return checkEarlyDate;
    }

    public void setCheckEarlyDate(Boolean checkEarlyDate) {
        this.checkEarlyDate = checkEarlyDate;
    }

    public Boolean getUpdateIncludingOrder() {
        return updateIncludingOrder;
    }

    public void setUpdateIncludingOrder(Boolean updateIncludingOrder) {
        this.updateIncludingOrder = updateIncludingOrder;
    }

    public String getBestSolutionKnowed() {
        return bestSolutionKnowed;
    }

    public void setBestSolutionKnowed(String bestSolutionKnowed) {
        this.bestSolutionKnowed = bestSolutionKnowed;
    }
}