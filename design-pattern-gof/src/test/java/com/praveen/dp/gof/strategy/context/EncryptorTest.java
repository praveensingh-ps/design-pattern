package com.praveen.dp.gof.strategy.context;

import org.junit.Test;

import com.praveen.dp.gof.strategy.context.Encryptor;
import com.praveen.dp.gof.strategy.strategies.AesEncryptionStrategy;
import com.praveen.dp.gof.strategy.strategies.BlowfishEncryptionStrategy;
import com.praveen.dp.gof.strategy.strategies.EncryptionStrategy;

import static org.junit.Assert.*;


public class EncryptorTest {

    @Test
    public void testEncrypt() throws Exception {
      EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
      Encryptor aesEncryptor=new Encryptor(aesStrategy);
      aesEncryptor.setPlainText("This is plain text");
      aesEncryptor.encrypt();

        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }
}