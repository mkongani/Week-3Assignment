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
public class WalletKeychain {
    public void Hooked(){
        System.out.println("Object is hooked in Wallet Keychain.");
    }
    
    public void Hold(){
        System.out.println("Holding objects together in Wallet Keychain.\n");
    }
    
    public void unHooked(){
        System.out.println("Object is unhooked from Wallet Keychain.");
    }
    
    public void unHold(){
        System.out.println("UnHolding the objects from Wallet Keychain.\n");
    }
}
