/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

public class Registrar {
 
    //creando atributos de los empleados
 private String Empresa;
 private String periodo;
 private String nombre;
 private String puesto;
 protected  double salario;
 private String n_cedula;
 private String n_inss;
 protected double H_extra;
 protected double comisiones;
 protected double bonos;
 protected double pension;

    public Registrar(String Empresa, String periodo, String nombre, String puesto, double salario, String n_cedula, String n_inss, double H_extra, double comisiones, double bonos, double pension) {
        this.Empresa = Empresa;
        this.periodo = periodo;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.n_cedula = n_cedula;
        this.n_inss = n_inss;
        this.H_extra = H_extra;
        this.comisiones = comisiones;
        this.bonos = bonos;
        this.pension = pension;
    }
    
 //Generando los metodos set and get 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getN_cedula() {
        return n_cedula;
    }

    public void setN_cedula(String n_cedula) {
        this.n_cedula = n_cedula;
    }

    public String getN_inss() {
        return n_inss;
    }

    public void setN_inss(String n_inss) {
        this.n_inss = n_inss;
    }

    public double getH_extra() {
        return H_extra;
    }

    public void setH_extra(double H_extra) {
        this.H_extra = H_extra;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getBonos() {
        return bonos;
    }

    public void setBonos(double bonos) {
        this.bonos = bonos;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
  
 
    
    
    
    
    
    
    
    
}
