/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repo.uca.mail;
/**
 *
 * @author mel_e
 */
public class Mail 
{
    
    /*
    Estas son las credenciales
    usuario: usuariomelvin 
    password: Mmdz127:v

    */

    private String from;
    private String psswd;
    private String to;
    private String asunto;
    private String mensaje;
    private String carga;
    private String archivo;

    public Mail(String from, String psswd, String to, String asunto, String mensaje) 
    {
        this.from = from;
        this.psswd = psswd;
        this.to = to;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }



}
