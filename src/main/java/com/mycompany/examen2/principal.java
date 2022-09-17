
package com.mycompany.examen2;

import java.sql.*;


public class principal {
    
    public static void ej1(){
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbpacial.tbempleados";
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.println("NIV ="+resultado.getInt(1));
                System.out.println("Nombre = "+resultado.getString(2));
                System.out.println("enero ="+resultado.getInt(3));
                System.out.println("febrero ="+resultado.getInt(4));
                System.out.println("marzo ="+resultado.getInt(5));
                System.out.println("abril ="+resultado.getInt(6));
                System.out.println("mayo ="+resultado.getInt(7));
                System.out.println("junio ="+resultado.getInt(8));
            }
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
  
    
    
      public static void ej2(String nom){
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "insert into tbempleados(nm) values('" + nom +"')";
             System.out.println("se grabo con exito");
            //este print nos sirve para analizar qué instrucción sql se va a ejecutar
            //System.out.println(sql);
            // paso 5 ejecutamos el query
            // tome atención que es diferente del paso 5 de la funcion ej1
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
     public static void niv(int id){
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "select * from tbempleados where codigo ="+ id ;
             ResultSet resultado = sentencia.executeQuery(sql);
             while(resultado.next()){
                System.out.println("id ="+resultado.getInt(1));
                System.out.println("Nombre = "+resultado.getString(2));
                System.out.println("enero ="+resultado.getInt(3));
                System.out.println("febrero ="+resultado.getInt(4));
                System.out.println("marzo ="+resultado.getInt(5));
                System.out.println("abril ="+resultado.getInt(6));
                System.out.println("mayo ="+resultado.getInt(7));
                System.out.println("junio ="+resultado.getInt(8));
                
                int tm  = resultado.getInt(3)+resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8);
                 System.out.println("el total es  ="+tm);       
             }
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
} 
     public static void eliminar(int id){
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            Statement sentencia = conexion.createStatement();
            String sql = "DELETE FROM tbempleados where codigo ="+ id +";";
             System.out.println("se borro con exito con exito");
              String sqll = " ALTER TABLE tbempleados AUTO_INCREMENT = 1;";
            sentencia.execute(sql);
            sentencia.execute(sqll);
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
     }
        public static void elimin(int id,String nue){
    
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            Statement sentencia = conexion.createStatement();
            String sql = "update tbempleados set nm='" +nue+ "' where codigo= "+id+";";
             System.out.println("se grabo con exito");
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
  public static void notas(int id, int m1, int m2,int m3,int m4,int m5,int m6){
    
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            Statement sentencia = conexion.createStatement();
            String sql = "update tbempleados set enero='"+m1+ "', febrero='" +m2+ "', marzo='" +m3+ "', abril='" +m4+"', mayo='" +m5+"', junio='" +m6+"' where codigo="+id+";";
             System.out.println("se grabo con exito");
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}

     public static void totales(){
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            Statement sentencia = conexion.createStatement();
            
            
            String sql = "SELECT sum(enero) as t1, sum(febrero) as t2, sum(marzo) as t3, sum(abril) as t4, sum(mayo) as t5, sum(junio) as t6 FROM dbpacial.tbempleados";
            
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                
             System.out.println("el total de enero es ="+resultado.getInt(1));
             System.out.println("el total de febrero es ="+resultado.getInt(2));
             System.out.println("el total de marzo es ="+resultado.getInt(3));
             System.out.println("el total de abril es ="+resultado.getInt(4));
             System.out.println("el total de mayo es ="+resultado.getInt(5));
             System.out.println("el total de junio es ="+resultado.getInt(6));
            }
             
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
      public static void nomb(){
        String url = "jdbc:mysql://localhost:3306/dbpacial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","holamundo");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbpacial.tbempleados";
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.println("id ="+resultado.getInt(1));
                System.out.println("Nombre = "+resultado.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
}
