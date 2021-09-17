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
public class KeychainMainClass {
    public static void main(String[] args) {
        UsingKeychain usingkc = new UsingKeychain();
        WalletKeychain wkeychain = new WalletKeychain();
        DecorativeKeychain dkeychain = new DecorativeKeychain();
        
        usingkc.setCommand(new WalletKeychainUsed(wkeychain));
        usingkc.performingAction();
        
        usingkc.setCommand(new WalletKeychainUnused(wkeychain));
        usingkc.performingAction();
        
        usingkc.setCommand(new DecorativeKeychainUsed(dkeychain));
        usingkc.performingAction();
        
        usingkc.setCommand(new DecorativeKeychainUnused(dkeychain));
        usingkc.performingAction();
    }
}
