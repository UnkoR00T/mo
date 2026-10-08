package org.bouncycastle.oer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BitBuilder {
    private static final byte[] bits = {-128, 64, 32, 16, 8, 4, 2, 1};
    byte[] buf = new byte[1];
    int pos = 0;

    public void pad() {
        int i15 = this.pos;
        this.pos = i15 + (i15 % 8);
    }

    public int write(OutputStream outputStream) throws IOException {
        int i15 = this.pos;
        int i16 = (i15 + (i15 % 8)) / 8;
        outputStream.write(this.buf, 0, i16);
        outputStream.flush();
        return i16;
    }

    public void write7BitBytes(int i15) {
        boolean z15 = false;
        for (int i16 = 4; i16 >= 0; i16--) {
            if (!z15 && ((-33554432) & i15) != 0) {
                z15 = true;
            }
            if (z15) {
                writeBit(i16).writeBits(i15, 32, 7);
            }
            i15 <<= 7;
        }
    }

    public int writeAndClear(OutputStream outputStream) throws IOException {
        int i15 = this.pos;
        int i16 = (i15 + (i15 % 8)) / 8;
        outputStream.write(this.buf, 0, i16);
        outputStream.flush();
        zero();
        return i16;
    }

    public BitBuilder writeBit(int i15) {
        int i16 = this.pos;
        int i17 = i16 / 8;
        byte[] bArr = this.buf;
        if (i17 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, i16 / 8);
            Arrays.clear(this.buf);
            this.buf = bArr2;
        }
        if (i15 == 0) {
            byte[] bArr3 = this.buf;
            int i18 = this.pos;
            int i19 = i18 / 8;
            bArr3[i19] = (byte) ((~bits[i18 % 8]) & bArr3[i19]);
        } else {
            byte[] bArr4 = this.buf;
            int i25 = this.pos;
            int i26 = i25 / 8;
            bArr4[i26] = (byte) (bits[i25 % 8] | bArr4[i26]);
        }
        this.pos++;
        return this;
    }

    public BitBuilder writeBits(long j15, int i15) {
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            writeBit(((1 << i16) & j15) > 0 ? 1 : 0);
        }
        return this;
    }

    public void zero() {
        Arrays.clear(this.buf);
        this.pos = 0;
    }

    public void write7BitBytes(BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + (bigInteger.bitLength() % 8)) / 8;
        int i15 = iBitLength * 8;
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(254L).shiftLeft(i15);
        boolean z15 = false;
        while (iBitLength >= 0) {
            if (!z15 && bigInteger.and(bigIntegerShiftLeft).compareTo(BigInteger.ZERO) != 0) {
                z15 = true;
            }
            if (z15) {
                writeBit(iBitLength).writeBits(bigInteger.and(bigIntegerShiftLeft).shiftRight(i15 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            iBitLength--;
        }
    }

    public BitBuilder writeBits(long j15, int i15, int i16) {
        for (int i17 = i15 - 1; i17 >= i15 - i16; i17--) {
            writeBit(((1 << i17) & j15) != 0 ? 1 : 0);
        }
        return this;
    }
}
