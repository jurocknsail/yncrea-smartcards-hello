/**
 * Copyright (c) 1998, 2015, Oracle and/or its affiliates. All rights reserved.
 * 
 */

/*
 */

// /*
// Workfile:@(#)HelloWorld.java	1.7
// Version:1.7
// Date:01/03/06
//
// Archive:  /Products/Europa/samples/com/sun/javacard/samples/HelloWorld/HelloWorld.java
// Modified:01/03/06 12:13:08
// Original author:  Mitch Butler
// */
package com.sun.jcclassic.samples.helloworld;

import javacard.framework.APDU;
import javacard.framework.Applet;
import javacard.framework.ISO7816;
import javacard.framework.ISOException;

/**
 * This is a comment !!!!!! 
 */

public class HelloWorld extends Applet {


    /**
     * Only this class's install method should create the applet object.
     */
    protected HelloWorld() {
        register();
    }

    /**
     * Installs this applet. 
     *
     * @param bArray
     *            the array containing installation parameters
     * @param bOffset
     *            the starting offset in bArray
     * @param bLength
     *            the length in bytes of the parameter data in bArray
     */
    public static void install(byte[] bArray, short bOffset, byte bLength) {
        new HelloWorld();
    }

    /**
     * Processes an incoming APDU.
     *
     * @see APDU
     * @param apdu
     *            the incoming APDU
     * @exception ISOException
     *                with the response bytes per ISO 7816-4
     */
   public void process(APDU apdu) {
        byte buffer[] = apdu.getBuffer();

        // check SELECT APDU command
        if ((buffer[ISO7816.OFFSET_CLA] == 0) &&
                (buffer[ISO7816.OFFSET_INS] == (byte) (0xA4))) {
            return;
        }
        
        
        
        // APDU: CLA INS P1 P2 Lc DATAIn Le DATAOut SW1 SW2 
        
        // Receive APDU Header
        short bytesRead = apdu.setIncomingAndReceive();
        
        
        // Receive APDU DATAIn
        // ...
        
        
        // Prepare data to send: echo APDU (Header + DATAIn)
        // ...
        
        
        // Send data
        // ...
        
        
        // Status Word ?

    }

}
