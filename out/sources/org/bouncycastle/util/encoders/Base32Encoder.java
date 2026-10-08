package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = DEFAULT_PADDING;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c15, char c16, char c17, char c18, char c19, char c25, char c26, char c27) throws IOException {
        char c28 = this.padding;
        if (c27 != c28) {
            byte[] bArr = this.decodingTable;
            byte b15 = bArr[c15];
            byte b16 = bArr[c16];
            byte b17 = bArr[c17];
            byte b18 = bArr[c18];
            byte b19 = bArr[c19];
            byte b25 = bArr[c25];
            byte b26 = bArr[c26];
            byte b27 = bArr[c27];
            if ((b15 | b16 | b17 | b18 | b19 | b25 | b26 | b27) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b15 << 3) | (b16 >> 2));
            outputStream.write((b16 << 6) | (b17 << 1) | (b18 >> 4));
            outputStream.write((b18 << 4) | (b19 >> 1));
            outputStream.write((b19 << 7) | (b25 << 2) | (b26 >> 3));
            outputStream.write((b26 << 5) | b27);
            return 5;
        }
        if (c26 != c28) {
            byte[] bArr2 = this.decodingTable;
            byte b28 = bArr2[c15];
            byte b29 = bArr2[c16];
            byte b35 = bArr2[c17];
            byte b36 = bArr2[c18];
            byte b37 = bArr2[c19];
            byte b38 = bArr2[c25];
            byte b39 = bArr2[c26];
            if ((b28 | b29 | b35 | b36 | b37 | b38 | b39) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b28 << 3) | (b29 >> 2));
            outputStream.write((b29 << 6) | (b35 << 1) | (b36 >> 4));
            outputStream.write((b36 << 4) | (b37 >> 1));
            outputStream.write((b37 << 7) | (b38 << 2) | (b39 >> 3));
            return 4;
        }
        if (c25 != c28) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        if (c19 != c28) {
            byte[] bArr3 = this.decodingTable;
            byte b45 = bArr3[c15];
            byte b46 = bArr3[c16];
            byte b47 = bArr3[c17];
            byte b48 = bArr3[c18];
            byte b49 = bArr3[c19];
            if ((b45 | b46 | b47 | b48 | b49) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b45 << 3) | (b46 >> 2));
            outputStream.write((b46 << 6) | (b47 << 1) | (b48 >> 4));
            outputStream.write((b48 << 4) | (b49 >> 1));
            return 3;
        }
        if (c18 == c28) {
            if (c17 != c28) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            byte[] bArr4 = this.decodingTable;
            byte b55 = bArr4[c15];
            byte b56 = bArr4[c16];
            if ((b55 | b56) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b55 << 3) | (b56 >> 2));
            return 1;
        }
        byte[] bArr5 = this.decodingTable;
        byte b57 = bArr5[c15];
        byte b58 = bArr5[c16];
        byte b59 = bArr5[c17];
        byte b65 = bArr5[c18];
        if ((b57 | b58 | b59 | b65) < 0) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        outputStream.write((b57 << 3) | (b58 >> 2));
        outputStream.write((b58 << 6) | (b59 << 1) | (b65 >> 4));
        return 2;
    }

    private void encodeBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        byte b15 = bArr[i15];
        int i17 = bArr[i15 + 1] & 255;
        int i18 = bArr[i15 + 2] & 255;
        int i19 = bArr[i15 + 3] & 255;
        byte b16 = bArr[i15 + 4];
        byte[] bArr3 = this.encodingTable;
        bArr2[i16] = bArr3[(b15 >>> 3) & 31];
        bArr2[i16 + 1] = bArr3[((b15 << 2) | (i17 >>> 6)) & 31];
        bArr2[i16 + 2] = bArr3[(i17 >>> 1) & 31];
        bArr2[i16 + 3] = bArr3[((i17 << 4) | (i18 >>> 4)) & 31];
        bArr2[i16 + 4] = bArr3[((i18 << 1) | (i19 >>> 7)) & 31];
        bArr2[i16 + 5] = bArr3[(i19 >>> 2) & 31];
        bArr2[i16 + 6] = bArr3[(((b16 & 255) >>> 5) | (i19 << 3)) & 31];
        bArr2[i16 + 7] = bArr3[b16 & 31];
    }

    private boolean ignore(char c15) {
        return c15 == '\n' || c15 == '\r' || c15 == '\t' || c15 == ' ';
    }

    private int nextI(byte[] bArr, int i15, int i16) {
        while (i15 < i16 && ignore((char) bArr[i15])) {
            i15++;
        }
        return i15;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
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
            int iMin = Math.min(45, i18);
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
        return ((i15 + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i15) {
        return (i15 / 8) * 5;
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

    public Base32Encoder(byte[] bArr, byte b15) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            throw new IllegalArgumentException("encoding table needs to be length 32");
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b15;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i15, int i16, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[55];
        int i17 = i15 + i16;
        while (i17 > i15 && ignore((char) bArr[i17 - 1])) {
            i17--;
        }
        if (i17 == 0) {
            return 0;
        }
        int i18 = i17;
        int i19 = 0;
        while (i18 > i15 && i19 != 8) {
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
            int iNextI5 = nextI(bArr, i35, i18);
            int i36 = iNextI5 + 1;
            byte b19 = this.decodingTable[bArr[iNextI5]];
            int iNextI6 = nextI(bArr, i36, i18);
            int i37 = iNextI6 + 1;
            byte b25 = this.decodingTable[bArr[iNextI6]];
            int iNextI7 = nextI(bArr, i37, i18);
            int i38 = iNextI7 + 1;
            byte b26 = this.decodingTable[bArr[iNextI7]];
            int iNextI8 = nextI(bArr, i38, i18);
            int i39 = iNextI8 + 1;
            byte b27 = this.decodingTable[bArr[iNextI8]];
            if ((b15 | b16 | b17 | b18 | b19 | b25 | b26 | b27) < 0) {
                throw new IOException("invalid characters encountered in base32 data");
            }
            bArr2[i25] = (byte) ((b15 << 3) | (b16 >> 2));
            bArr2[i25 + 1] = (byte) ((b16 << 6) | (b17 << 1) | (b18 >> 4));
            bArr2[i25 + 2] = (byte) ((b18 << 4) | (b19 >> 1));
            int i45 = i25 + 4;
            bArr2[i25 + 3] = (byte) ((b25 << 2) | (b19 << 7) | (b26 >> 3));
            i25 += 5;
            bArr2[i45] = (byte) ((b26 << 5) | b27);
            if (i25 == 55) {
                outputStream.write(bArr2);
                i25 = 0;
            }
            i26 += 5;
            iNextI = nextI(bArr, i39, i18);
        }
        if (i25 > 0) {
            outputStream.write(bArr2, 0, i25);
        }
        int iNextI9 = nextI(bArr, iNextI, i17);
        int iNextI10 = nextI(bArr, iNextI9 + 1, i17);
        int iNextI11 = nextI(bArr, iNextI10 + 1, i17);
        int iNextI12 = nextI(bArr, iNextI11 + 1, i17);
        int iNextI13 = nextI(bArr, iNextI12 + 1, i17);
        int iNextI14 = nextI(bArr, iNextI13 + 1, i17);
        int iNextI15 = nextI(bArr, iNextI14 + 1, i17);
        return i26 + decodeLastBlock(outputStream, (char) bArr[iNextI9], (char) bArr[iNextI10], (char) bArr[iNextI11], (char) bArr[iNextI12], (char) bArr[iNextI13], (char) bArr[iNextI14], (char) bArr[iNextI15], (char) bArr[nextI(bArr, iNextI15 + 1, i17)]);
    }

    public int encode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = (i15 + i16) - 4;
        int i19 = i15;
        int i25 = i17;
        while (i19 < i18) {
            encodeBlock(bArr, i19, bArr2, i25);
            i19 += 5;
            i25 += 8;
        }
        int i26 = i16 - (i19 - i15);
        if (i26 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i19, bArr3, 0, i26);
            encodeBlock(bArr3, 0, bArr2, i25);
            if (i26 == 1) {
                byte b15 = this.padding;
                bArr2[i25 + 2] = b15;
                bArr2[i25 + 3] = b15;
                bArr2[i25 + 4] = b15;
                bArr2[i25 + 5] = b15;
                bArr2[i25 + 6] = b15;
                bArr2[i25 + 7] = b15;
            } else if (i26 == 2) {
                byte b16 = this.padding;
                bArr2[i25 + 4] = b16;
                bArr2[i25 + 5] = b16;
                bArr2[i25 + 6] = b16;
                bArr2[i25 + 7] = b16;
            } else if (i26 == 3) {
                byte b17 = this.padding;
                bArr2[i25 + 5] = b17;
                bArr2[i25 + 6] = b17;
                bArr2[i25 + 7] = b17;
            } else if (i26 == 4) {
                bArr2[i25 + 7] = this.padding;
            }
            i25 += 8;
        }
        return i25 - i17;
    }
}
