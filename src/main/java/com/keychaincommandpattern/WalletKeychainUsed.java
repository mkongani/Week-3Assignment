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
public class WalletKeychainUsed implements Command{
    WalletKeychain wkeychain;
    public WalletKeychainUsed(WalletKeychain wkeychain){
        this.wkeychain=wkeychain;
    }
    @Override
    public void execute() {
        wkeychain.Hooked();
        wkeychain.Hold();
    }
}
