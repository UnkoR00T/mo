package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c15) {
        return c15 == '\n' || c15 == '\r' || c15 == '\t' || c15 == ' ';
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            while (i15 < length && ignore(str.charAt(i15))) {
                i15++;
            }
            int i18 = i15 + 1;
            byte b15 = this.decodingTable[str.charAt(i15)];
            while (i18 < length && ignore(str.charAt(i18))) {
                i18++;
            }
            int i19 = i18 + 1;
            byte b16 = this.decodingTable[str.charAt(i18)];
            if ((b15 | b16) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i25 = i16 + 1;
            bArr[i16] = (byte) ((b15 << 4) | b16);
            if (i25 == 36) {
                outputStream.write(bArr);
                i16 = 0;
            } else {
                i16 = i25;
            }
            i17++;
            i15 = i19;
        }
        if (i16 > 0) {
            outputStream.write(bArr, 0, i16);
        }
        return i17;
    }

    byte[] decodeStrict(String str, int i15, int i16) throws IOException {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        }
        if (i15 < 0 || i16 < 0 || i15 > str.length() - i16) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i16 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i17 = i16 >>> 1;
        byte[] bArr = new byte[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i15 + 1;
            byte b15 = this.decodingTable[str.charAt(i15)];
            i15 += 2;
            int i25 = (b15 << 4) | this.decodingTable[str.charAt(i19)];
            if (i25 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i18] = (byte) i25;
        }
        return bArr;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i15, int i16, OutputStream outputStream) throws IOException {
        if (i16 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i17 = i15;
        int i18 = i16;
        while (i18 > 0) {
            int iMin = Math.min(36, i18);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i17, iMin, bArr2, 0));
            i17 += iMin;
            i18 -= iMin;
            bArr = bArr3;
        }
        return i16 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i15) {
        return i15 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i15) {
        return i15 / 2;
    }

    protected void initialiseDecodingTable() {
        int i15 = 0;
        int i16 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i16 >= bArr.length) {
                break;
            }
            bArr[i16] = -1;
            i16++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i15 >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i15]] = (byte) i15;
            i15++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i15, int i16, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[36];
        int i17 = i16 + i15;
        while (i17 > i15 && ignore((char) bArr[i17 - 1])) {
            i17--;
        }
        int i18 = 0;
        int i19 = 0;
        while (i15 < i17) {
            while (i15 < i17 && ignore((char) bArr[i15])) {
                i15++;
            }
            int i25 = i15 + 1;
            byte b15 = this.decodingTable[bArr[i15]];
            while (i25 < i17 && ignore((char) bArr[i25])) {
                i25++;
            }
            int i26 = i25 + 1;
            byte b16 = this.decodingTable[bArr[i25]];
            if ((b15 | b16) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            int i27 = i18 + 1;
            bArr2[i18] = (byte) ((b15 << 4) | b16);
            if (i27 == 36) {
                outputStream.write(bArr2);
                i18 = 0;
            } else {
                i18 = i27;
            }
            i19++;
            i15 = i26;
        }
        if (i18 > 0) {
            outputStream.write(bArr2, 0, i18);
        }
        return i19;
    }

    public int encode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = i16 + i15;
        int i19 = i17;
        while (i15 < i18) {
            int i25 = i15 + 1;
            byte b15 = bArr[i15];
            int i26 = i19 + 1;
            byte[] bArr3 = this.encodingTable;
            bArr2[i19] = bArr3[(b15 & 255) >>> 4];
            i19 += 2;
            bArr2[i26] = bArr3[b15 & 15];
            i15 = i25;
        }
        return i19 - i17;
    }
}
