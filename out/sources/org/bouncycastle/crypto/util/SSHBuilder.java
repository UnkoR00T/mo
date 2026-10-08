package org.bouncycastle.crypto.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
class SSHBuilder {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    SSHBuilder() {
    }

    public byte[] getBytes() {
        return this.bos.toByteArray();
    }

    public byte[] getPaddedBytes() {
        return getPaddedBytes(8);
    }

    public void u32(int i15) {
        this.bos.write((i15 >>> 24) & GF2Field.MASK);
        this.bos.write((i15 >>> 16) & GF2Field.MASK);
        this.bos.write((i15 >>> 8) & GF2Field.MASK);
        this.bos.write(i15 & GF2Field.MASK);
    }

    public void writeBigNum(BigInteger bigInteger) {
        writeBlock(bigInteger.toByteArray());
    }

    public void writeBlock(byte[] bArr) {
        u32(bArr.length);
        try {
            this.bos.write(bArr);
        } catch (IOException e15) {
            throw new IllegalStateException(e15.getMessage(), e15);
        }
    }

    public void writeBytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
        } catch (IOException e15) {
            throw new IllegalStateException(e15.getMessage(), e15);
        }
    }

    public void writeString(String str) {
        writeBlock(Strings.toByteArray(str));
    }

    public byte[] getPaddedBytes(int i15) {
        int size = this.bos.size() % i15;
        if (size != 0) {
            int i16 = i15 - size;
            for (int i17 = 1; i17 <= i16; i17++) {
                this.bos.write(i17);
            }
        }
        return this.bos.toByteArray();
    }
}
