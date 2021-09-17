/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychaincommandpattern;

/**
 *
 * @author Mohit Computers
 */
public class DecorativeKeychain {
    public void Hooked(){
        System.out.println("Object is hooked in Decorative Keychain.");
    }
    
    public void Hold(){
        System.out.println("Holding objects together in Decorative Keychain.\n");
    }
    
    public void unHooked(){
        System.out.println("Object is unhooked from Decorative Keychain.");
    }
    
    public void unHold(){
        System.out.println("UnHolding the objects from Decorative Keychain.\n");
    }
}
