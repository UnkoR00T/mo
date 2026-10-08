package org.bouncycastle.crypto;

import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PBEParametersGenerator {
    protected int iterationCount;
    protected byte[] password;
    protected byte[] salt;

    protected PBEParametersGenerator() {
    }

    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i15 = 0; i15 != cArr.length; i15++) {
            int i16 = i15 * 2;
            char c15 = cArr[i15];
            bArr[i16] = (byte) (c15 >>> '\b');
            bArr[i16 + 1] = (byte) c15;
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i15 = 0; i15 != length; i15++) {
            bArr[i15] = (byte) cArr[i15];
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char[] cArr) {
        return cArr != null ? Strings.toUTF8ByteArray(cArr) : new byte[0];
    }

    public abstract CipherParameters generateDerivedMacParameters(int i15);

    public abstract CipherParameters generateDerivedParameters(int i15);

    public abstract CipherParameters generateDerivedParameters(int i15, int i16);

    public int getIterationCount() {
        return this.iterationCount;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public void init(byte[] bArr, byte[] bArr2, int i15) {
        this.password = bArr;
        this.salt = bArr2;
        this.iterationCount = i15;
    }
}
