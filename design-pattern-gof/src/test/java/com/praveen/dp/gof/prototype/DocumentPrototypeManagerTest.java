package com.praveen.dp.gof.prototype;

import org.junit.Test;

import com.praveen.dp.gof.prototype.DocumentPrototypeManager;
import com.praveen.dp.gof.prototype.PrototypeCapableDocument;

import static org.junit.Assert.*;

/**
 * Created by Admin on 4/21/2015.
 */
public class DocumentPrototypeManagerTest {

    @Test
    public void testGetClonedDocument() throws Exception {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }
}