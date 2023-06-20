/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;


public class Calculos extends Registrar {
    
    //Heredando atributos de la clase registrar
    // para Acceder a los datos del tarbajador 
     public Calculos(String Empresa, String periodo, String nombre, String puesto, double salario, String n_cedula, String n_inss, double H_extra, double comisiones, double bonos, double pension) {
     super(Empresa, periodo, nombre, puesto, salario, n_cedula, n_inss, H_extra, comisiones, bonos, pension);
    }

    //Declarando atributoa 
    //Loa totales y resultados de las decciones y bonifiaciones
    
    // para calcular horas Extra  para sumar 
    private double  T_horasExtra;
    
    //Totales a calcular 
    private double   T_ingresos;
    private double   T_deduccion;
    private double   netoRecibir;
   
    //Deducciones a calculcular 
    private double   inssLaboral;
    private double  Ir;
    private double inss_patronal;
    private double Inatec;
    private double sindicato;
    
// Mas Bonificaciones 
     private double Vacaciones;
     private double aguinaldo;
     private double imdenizacion;

    
   
     //Metodoa para calcualar los resultados 
     //un metodo para cada cuenta 
     
//calculando horas Extra totales      
  public void calH_extra() {
    
      if (H_extra > 0) {
       
        // Aplica tu fórmula para calcular el pago de horas extras
        T_horasExtra = (salario / 30 * 8) * (H_extra * 2);
    }
    
    
}

//calculando total de ingresos
  public void calT_ingresos(){
      
   T_ingresos =  salario + T_horasExtra + bonos + comisiones;
           
  }

  //para calcular Inss laboral
  protected void calT_inssLaboral(){
      
    inssLaboral = T_ingresos * 0.07;  
  
 }

  //para calcualr ir
protected void cal_IR() {
    double salariotemp = salario - inssLaboral;
    
     if (salariotemp <= 8333.33) {
        Ir = salariotemp;
    } else if (salariotemp > 8333.33 && salariotemp <= 16666.66) {
        Ir = salariotemp - 8333.33 * 0.15;
    } else if (salariotemp > 16666.66 && salariotemp <= 29166.66) {
        Ir = salariotemp - 16666.66 * 0.20;
    } else if (salariotemp > 29166.66 && salariotemp <= 41666.66) {
        Ir = salariotemp - 29166.66 * 0.25;
    } else if (salariotemp > 41666.67) {
        Ir = salariotemp - 41666.67 * 0.30;
    }
}

//para calcular sindicato
protected  void cal_sindicato(){
    
   sindicato = T_ingresos * 0.01; 
}

//para calcualar pension alimenticia 
protected  void cal_pensionAlim(){
   
  pension = T_ingresos * pension;
    
}
//para calcular total deducciones 
protected void cal_Tdeduccion(){
    
 T_deduccion = inssLaboral + Ir + sindicato + pension ;
    
}

//para calcular neto a recibir 
protected void cak_netoRecibir(){
    
 netoRecibir = T_ingresos - T_deduccion;  
    
    
} 
 
//para calcualar INatec
protected void cal_inatec(){
    
 Inatec = T_ingresos * 0.02;   

 }

//Para calcualr INss patronal 
protected void cal_inss_patronal(){
    
   inss_patronal = T_ingresos * 0.22; 
    
    
}

//Para calcualr vacaciones
protected void cal_vacaciones(){
    
    Vacaciones = T_ingresos /12;
    
}
//Para calcualr Imdenizacion
protected void cal_Imdenizacion(){
    
    imdenizacion = T_ingresos /12;
    
}

//para calcular aguinaldo
protected void cal_Aginaldo(){
    
   aguinaldo = T_ingresos /12;
    
}











}