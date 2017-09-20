package com.model;

import com.model.common.AppModule;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 15 11:21:57 EEST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    
    public void deleteAllEmployees(){
        ViewObject vo=this.findViewObject("EmployeesView1");
        vo.executeQuery();
        
        }

    /**
     * Container's getter for DepartmentsView1.
     * @return DepartmentsView1
     */
    public ViewObjectImpl getDepartmentsView1() {
        return (ViewObjectImpl) findViewObject("DepartmentsView1");
    }

    /**
     * Container's getter for EmployeesView1.
     * @return EmployeesView1
     */
    public ViewObjectImpl getEmployeesView1() {
        return (ViewObjectImpl) findViewObject("EmployeesView1");
    }

    /**
     * Container's getter for JobsView1.
     * @return JobsView1
     */
    public ViewObjectImpl getJobsView1() {
        return (ViewObjectImpl) findViewObject("JobsView1");
    }

    /**
     * Container's getter for DepartmentsView2.
     * @return DepartmentsView2
     */
    public ViewObjectImpl getDepartmentsView2() {
        return (ViewObjectImpl) findViewObject("DepartmentsView2");
    }

    /**
     * Container's getter for EmployeesView2.
     * @return EmployeesView2
     */
    public ViewObjectImpl getEmployeesView2() {
        return (ViewObjectImpl) findViewObject("EmployeesView2");
    }

    /**
     * Container's getter for EmployeesView3.
     * @return EmployeesView3
     */
    public ViewObjectImpl getEmployeesView3() {
        return (ViewObjectImpl) findViewObject("EmployeesView3");
    }

    /**
     * Container's getter for LocationsView1.
     * @return LocationsView1
     */
    public ViewObjectImpl getLocationsView1() {
        return (ViewObjectImpl) findViewObject("LocationsView1");
    }

    /**
     * Container's getter for HightlyPaidEmpoyees1.
     * @return HightlyPaidEmpoyees1
     */
    public HightlyPaidEmpoyeesImpl getHightlyPaidEmpoyees1() {
        return (HightlyPaidEmpoyeesImpl) findViewObject("HightlyPaidEmpoyees1");
    }

    /**
     * Container's getter for HightlyPaidEmpoyees2.
     * @return HightlyPaidEmpoyees2
     */
    public HightlyPaidEmpoyeesImpl getHightlyPaidEmpoyees2() {
        return (HightlyPaidEmpoyeesImpl) findViewObject("HightlyPaidEmpoyees2");
    }

    /**
     * Container's getter for DeptMgrFkLink1.
     * @return DeptMgrFkLink1
     */
    public ViewLinkImpl getDeptMgrFkLink1() {
        return (ViewLinkImpl) findViewLink("DeptMgrFkLink1");
    }

    /**
     * Container's getter for EmpManagerFkLink1.
     * @return EmpManagerFkLink1
     */
    public ViewLinkImpl getEmpManagerFkLink1() {
        return (ViewLinkImpl) findViewLink("EmpManagerFkLink1");
    }

    /**
     * Container's getter for EmpDeptFkLink1.
     * @return EmpDeptFkLink1
     */
    public ViewLinkImpl getEmpDeptFkLink1() {
        return (ViewLinkImpl) findViewLink("EmpDeptFkLink1");
    }

    /**
     * Container's getter for CountriesView1.
     * @return CountriesView1
     */
    public ViewObjectImpl getCountriesView1() {
        return (ViewObjectImpl) findViewObject("CountriesView1");
    }

    /**
     * Container's getter for Locations1View1.
     * @return Locations1View1
     */
    public ViewObjectImpl getLocations1View1() {
        return (ViewObjectImpl) findViewObject("Locations1View1");
    }

    /**
     * Container's getter for RegionsView1.
     * @return RegionsView1
     */
    public ViewObjectImpl getRegionsView1() {
        return (ViewObjectImpl) findViewObject("RegionsView1");
    }

    /**
     * Container's getter for Locations1View2.
     * @return Locations1View2
     */
    public ViewObjectImpl getLocations1View2() {
        return (ViewObjectImpl) findViewObject("Locations1View2");
    }

    /**
     * Container's getter for CountriesView2.
     * @return CountriesView2
     */
    public ViewObjectImpl getCountriesView2() {
        return (ViewObjectImpl) findViewObject("CountriesView2");
    }

    /**
     * Container's getter for LocCIdFkLink1.
     * @return LocCIdFkLink1
     */
    public ViewLinkImpl getLocCIdFkLink1() {
        return (ViewLinkImpl) findViewLink("LocCIdFkLink1");
    }

    /**
     * Container's getter for CountrRegFkLink1.
     * @return CountrRegFkLink1
     */
    public ViewLinkImpl getCountrRegFkLink1() {
        return (ViewLinkImpl) findViewLink("CountrRegFkLink1");
    }
}

