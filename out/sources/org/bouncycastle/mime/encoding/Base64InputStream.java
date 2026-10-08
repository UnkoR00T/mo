package org.bouncycastle.mime.encoding;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class Base64InputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    InputStream f149379in;
    int[] outBuf = new int[3];
    int bufPtr = 3;

    static {
        for (int i15 = 65; i15 <= 90; i15++) {
            decodingTable[i15] = (byte) (i15 - 65);
        }
        for (int i16 = 97; i16 <= 122; i16++) {
            decodingTable[i16] = (byte) (i16 - 71);
        }
        for (int i17 = 48; i17 <= 57; i17++) {
            decodingTable[i17] = (byte) (i17 + 4);
        }
        byte[] bArr = decodingTable;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public Base64InputStream(InputStream inputStream) {
        this.f149379in = inputStream;
    }

    private int decode(int i15, int i16, int i17, int i18, int[] iArr) throws EOFException {
        if (i18 < 0) {
            throw new EOFException("unexpected end of file in armored stream.");
        }
        if (i17 == 61) {
            byte[] bArr = decodingTable;
            iArr[2] = (((bArr[i15] & 255) << 2) | ((bArr[i16] & 255) >> 4)) & GF2Field.MASK;
            return 2;
        }
        if (i18 == 61) {
            byte[] bArr2 = decodingTable;
            byte b15 = bArr2[i15];
            byte b16 = bArr2[i16];
            byte b17 = bArr2[i17];
            iArr[1] = ((b15 << 2) | (b16 >> 4)) & GF2Field.MASK;
            iArr[2] = ((b16 << 4) | (b17 >> 2)) & GF2Field.MASK;
            return 1;
        }
        byte[] bArr3 = decodingTable;
        byte b18 = bArr3[i15];
        byte b19 = bArr3[i16];
        byte b25 = bArr3[i17];
        byte b26 = bArr3[i18];
        iArr[0] = ((b18 << 2) | (b19 >> 4)) & GF2Field.MASK;
        iArr[1] = ((b19 << 4) | (b25 >> 2)) & GF2Field.MASK;
        iArr[2] = ((b25 << 6) | b26) & GF2Field.MASK;
        return 0;
    }

    private int readIgnoreSpace() throws IOException {
        while (true) {
            int i15 = this.f149379in.read();
            if (i15 != 9 && i15 != 32) {
                return i15;
            }
        }
    }

    private int readIgnoreSpaceFirst() throws IOException {
        while (true) {
            int i15 = this.f149379in.read();
            if (i15 != 9 && i15 != 10 && i15 != 13 && i15 != 32) {
                return i15;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f149379in.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        Base64InputStream base64InputStream;
        if (this.bufPtr > 2) {
            int ignoreSpaceFirst = readIgnoreSpaceFirst();
            if (ignoreSpaceFirst < 0) {
                return -1;
            }
            base64InputStream = this;
            base64InputStream.bufPtr = base64InputStream.decode(ignoreSpaceFirst, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
        } else {
            base64InputStream = this;
        }
        int[] iArr = base64InputStream.outBuf;
        int i15 = base64InputStream.bufPtr;
        base64InputStream.bufPtr = i15 + 1;
        return iArr[i15];
    }
}
