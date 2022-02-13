package com.fundamentos.loquillo.bean;

public class MybeanWithPropertiesImplement implements MyBeanWithProperties{

    private String nombre;
    private String apellido;

    public MybeanWithPropertiesImplement(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }

    @Override
    public String function(){
        return nombre + "-" + apellido;
    }
}
