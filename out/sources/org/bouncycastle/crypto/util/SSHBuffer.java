package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int u35 = readU32();
        int i15 = this.pos;
        int i16 = i15 + u35;
        byte[] bArr = this.buffer;
        if (i16 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i17 = u35 + i15;
        this.pos = i17;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i15, i17));
    }

    public byte[] readBlock() {
        int u35 = readU32();
        if (u35 == 0) {
            return new byte[0];
        }
        int i15 = this.pos;
        byte[] bArr = this.buffer;
        if (i15 > bArr.length - u35) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i16 = u35 + i15;
        this.pos = i16;
        return Arrays.copyOfRange(bArr, i15, i16);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i15 = this.pos;
        byte[] bArr = this.buffer;
        if (i15 > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i16 = i15 + 1;
        this.pos = i16;
        int i17 = (bArr[i15] & 255) << 24;
        int i18 = i15 + 2;
        this.pos = i18;
        int i19 = ((bArr[i16] & 255) << 16) | i17;
        int i25 = i15 + 3;
        this.pos = i25;
        int i26 = i19 | ((bArr[i18] & 255) << 8);
        this.pos = i15 + 4;
        return (bArr[i25] & 255) | i26;
    }

    public void skipBlock() {
        int u35 = readU32();
        int i15 = this.pos;
        if (i15 > this.buffer.length - u35) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.pos = i15 + u35;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i15 = 0; i15 != bArr.length; i15++) {
            if (bArr[i15] != bArr2[i15]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i15) {
        int i16;
        int u35 = readU32();
        if (u35 == 0) {
            return new byte[0];
        }
        int i17 = this.pos;
        byte[] bArr = this.buffer;
        if (i17 > bArr.length - u35) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (u35 % i15 != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i18 = i17 + u35;
        this.pos = i18;
        if (u35 > 0 && (i16 = bArr[i18 - 1] & 255) > 0 && i16 < i15) {
            i18 -= i16;
            int i19 = 1;
            int i25 = i18;
            while (i19 <= i16) {
                if (i19 != (this.buffer[i25] & 255)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i19++;
                i25++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i17, i18);
    }
}
