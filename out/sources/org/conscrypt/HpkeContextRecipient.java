package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes5.dex */
public class HpkeContextRecipient extends HpkeContext {
    private HpkeContextRecipient(HpkeSpi hpkeSpi) {
        super(hpkeSpi);
    }

    public static HpkeContextRecipient getInstance(String str) {
        return new HpkeContextRecipient(HpkeContext.findSpi(str));
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2) {
        this.spi.engineInitRecipient(bArr, privateKey, bArr2, null, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public byte[] open(byte[] bArr, byte[] bArr2) {
        return this.spi.engineOpen(bArr, bArr2);
    }

    public static HpkeContextRecipient getInstance(String str, String str2) {
        return new HpkeContextRecipient(HpkeContext.findSpi(str, str2));
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey) throws InvalidKeyException {
        if (publicKey == null) {
            throw new InvalidKeyException("null sender key");
        }
        this.spi.engineInitRecipient(bArr, privateKey, bArr2, publicKey, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public static HpkeContextRecipient getInstance(String str, Provider provider) {
        return new HpkeContextRecipient(HpkeContext.findSpi(str, provider));
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.spi.engineInitRecipient(bArr, privateKey, bArr2, null, bArr3, bArr4);
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey, byte[] bArr3, byte[] bArr4) throws InvalidKeyException {
        if (publicKey != null) {
            this.spi.engineInitRecipient(bArr, privateKey, bArr2, publicKey, bArr3, bArr4);
            return;
        }
        throw new InvalidKeyException("null sender key");
    }
}
