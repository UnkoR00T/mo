package org.conscrypt;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class ScryptKeySpec implements KeySpec {
    private final int blockSize;
    private final int costParameter;
    private final int keyOutputBits;
    private final int parallelizationParameter;
    private final char[] password;
    private final byte[] salt;

    public ScryptKeySpec(char[] cArr, byte[] bArr, int i15, int i16, int i17, int i18) {
        this.password = cArr;
        this.salt = bArr;
        this.costParameter = i15;
        this.blockSize = i16;
        this.parallelizationParameter = i17;
        this.keyOutputBits = i18;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getCostParameter() {
        return this.costParameter;
    }

    public int getKeyLength() {
        return this.keyOutputBits;
    }

    public int getParallelizationParameter() {
        return this.parallelizationParameter;
    }

    public char[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return this.salt;
    }
}
