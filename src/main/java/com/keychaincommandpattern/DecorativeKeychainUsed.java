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
public class DecorativeKeychainUsed implements Command{
    DecorativeKeychain dkeychain;
    public DecorativeKeychainUsed(DecorativeKeychain dkeychain){
        this.dkeychain=dkeychain;
    }
    @Override
    public void execute() {
        dkeychain.Hooked();
        dkeychain.Hold();
    }
}
