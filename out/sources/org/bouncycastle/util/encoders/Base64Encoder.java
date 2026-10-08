package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c15, char c16, char c17, char c18) throws IOException {
        char c19 = this.padding;
        if (c17 == c19) {
            if (c18 != c19) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b15 = bArr[c15];
            byte b16 = bArr[c16];
            if ((b15 | b16) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b15 << 2) | (b16 >> 4));
            return 1;
        }
        if (c18 == c19) {
            byte[] bArr2 = this.decodingTable;
            byte b17 = bArr2[c15];
            byte b18 = bArr2[c16];
            byte b19 = bArr2[c17];
            if ((b17 | b18 | b19) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b17 << 2) | (b18 >> 4));
            outputStream.write((b18 << 4) | (b19 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b25 = bArr3[c15];
        byte b26 = bArr3[c16];
        byte b27 = bArr3[c17];
        byte b28 = bArr3[c18];
        if ((b25 | b26 | b27 | b28) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b25 << 2) | (b26 >> 4));
        outputStream.write((b26 << 4) | (b27 >> 2));
        outputStream.write((b27 << 6) | b28);
        return 3;
    }

    private boolean ignore(char c15) {
        return c15 == '\n' || c15 == '\r' || c15 == '\t' || c15 == ' ';
    }

    private int nextI(String str, int i15, int i16) {
        while (i15 < i16 && ignore(str.charAt(i15))) {
            i15++;
        }
        return i15;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i15 = length;
        int i16 = 0;
        while (i15 > 0 && i16 != 4) {
            if (!ignore(str.charAt(i15 - 1))) {
                i16++;
            }
            i15--;
        }
        int iNextI = nextI(str, 0, i15);
        int i17 = 0;
        int i18 = 0;
        while (iNextI < i15) {
            int i19 = iNextI + 1;
            byte b15 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, i19, i15);
            int i25 = iNextI2 + 1;
            byte b16 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, i25, i15);
            int i26 = iNextI3 + 1;
            byte b17 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, i26, i15);
            int i27 = iNextI4 + 1;
            byte b18 = this.decodingTable[str.charAt(iNextI4)];
            if ((b15 | b16 | b17 | b18) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i17] = (byte) ((b15 << 2) | (b16 >> 4));
            int i28 = i17 + 2;
            bArr[i17 + 1] = (byte) ((b16 << 4) | (b17 >> 2));
            i17 += 3;
            bArr[i28] = (byte) ((b17 << 6) | b18);
            i18 += 3;
            if (i17 == 54) {
                outputStream.write(bArr);
                i17 = 0;
            }
            iNextI = nextI(str, i27, i15);
        }
        if (i17 > 0) {
            outputStream.write(bArr, 0, i17);
        }
        int iNextI5 = nextI(str, iNextI, length);
        int iNextI6 = nextI(str, iNextI5 + 1, length);
        int iNextI7 = nextI(str, iNextI6 + 1, length);
        return i18 + decodeLastBlock(outputStream, str.charAt(iNextI5), str.charAt(iNextI6), str.charAt(iNextI7), str.charAt(nextI(str, iNextI7 + 1, length)));
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
            int iMin = Math.min(54, i18);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i17, iMin, bArr2, 0));
            i17 += iMin;
            i18 -= iMin;
            bArr = bArr3;
        }
        return ((i16 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i15) {
        return ((i15 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i15) {
        return (i15 / 4) * 3;
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
                return;
            }
            this.decodingTable[bArr2[i15]] = (byte) i15;
            i15++;
        }
    }

    private int nextI(byte[] bArr, int i15, int i16) {
        while (i15 < i16 && ignore((char) bArr[i15])) {
            i15++;
        }
        return i15;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i15, int i16, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[54];
        int i17 = i15 + i16;
        while (i17 > i15 && ignore((char) bArr[i17 - 1])) {
            i17--;
        }
        if (i17 == 0) {
            return 0;
        }
        int i18 = i17;
        int i19 = 0;
        while (i18 > i15 && i19 != 4) {
            if (!ignore((char) bArr[i18 - 1])) {
                i19++;
            }
            i18--;
        }
        int iNextI = nextI(bArr, i15, i18);
        int i25 = 0;
        int i26 = 0;
        while (iNextI < i18) {
            int i27 = iNextI + 1;
            byte b15 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i27, i18);
            int i28 = iNextI2 + 1;
            byte b16 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i28, i18);
            int i29 = iNextI3 + 1;
            byte b17 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i29, i18);
            int i35 = iNextI4 + 1;
            byte b18 = this.decodingTable[bArr[iNextI4]];
            if ((b15 | b16 | b17 | b18) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr2[i25] = (byte) ((b15 << 2) | (b16 >> 4));
            int i36 = i25 + 2;
            bArr2[i25 + 1] = (byte) ((b16 << 4) | (b17 >> 2));
            i25 += 3;
            bArr2[i36] = (byte) ((b17 << 6) | b18);
            if (i25 == 54) {
                outputStream.write(bArr2);
                i25 = 0;
            }
            i26 += 3;
            iNextI = nextI(bArr, i35, i18);
        }
        if (i25 > 0) {
            outputStream.write(bArr2, 0, i25);
        }
        int iNextI5 = nextI(bArr, iNextI, i17);
        int iNextI6 = nextI(bArr, iNextI5 + 1, i17);
        int iNextI7 = nextI(bArr, iNextI6 + 1, i17);
        return i26 + decodeLastBlock(outputStream, (char) bArr[iNextI5], (char) bArr[iNextI6], (char) bArr[iNextI7], (char) bArr[nextI(bArr, iNextI7 + 1, i17)]);
    }

    public int encode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = (i15 + i16) - 2;
        int i19 = i15;
        int i25 = i17;
        while (i19 < i18) {
            byte b15 = bArr[i19];
            int i26 = i19 + 2;
            int i27 = bArr[i19 + 1] & 255;
            i19 += 3;
            byte b16 = bArr[i26];
            byte[] bArr3 = this.encodingTable;
            bArr2[i25] = bArr3[(b15 >>> 2) & 63];
            bArr2[i25 + 1] = bArr3[((b15 << 4) | (i27 >>> 4)) & 63];
            int i28 = i25 + 3;
            bArr2[i25 + 2] = bArr3[((i27 << 2) | ((b16 & 255) >>> 6)) & 63];
            i25 += 4;
            bArr2[i28] = bArr3[b16 & 63];
        }
        int i29 = i16 - (i19 - i15);
        if (i29 == 1) {
            int i35 = bArr[i19] & 255;
            byte[] bArr4 = this.encodingTable;
            bArr2[i25] = bArr4[(i35 >>> 2) & 63];
            bArr2[i25 + 1] = bArr4[(i35 << 4) & 63];
            int i36 = i25 + 3;
            byte b17 = this.padding;
            bArr2[i25 + 2] = b17;
            i25 += 4;
            bArr2[i36] = b17;
        } else if (i29 == 2) {
            int i37 = bArr[i19] & 255;
            int i38 = bArr[i19 + 1] & 255;
            byte[] bArr5 = this.encodingTable;
            bArr2[i25] = bArr5[(i37 >>> 2) & 63];
            bArr2[i25 + 1] = bArr5[((i37 << 4) | (i38 >>> 4)) & 63];
            int i39 = i25 + 3;
            bArr2[i25 + 2] = bArr5[(i38 << 2) & 63];
            i25 += 4;
            bArr2[i39] = this.padding;
        }
        return i25 - i17;
    }
}
