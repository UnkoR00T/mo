package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class BoundaryLimitedInputStream extends InputStream {
    private final byte[] boundary;
    private final byte[] buf;
    private int bufOff;
    private int lastI;
    private final InputStream src;
    private int index = 0;
    private boolean ended = false;

    public BoundaryLimitedInputStream(InputStream inputStream, String str) {
        this.bufOff = 0;
        this.src = inputStream;
        this.boundary = Strings.toByteArray(str);
        this.buf = new byte[str.length() + 3];
        this.bufOff = 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i15;
        int i16;
        int i17;
        if (this.ended) {
            return -1;
        }
        int i18 = this.index;
        int i19 = this.bufOff;
        if (i18 < i19) {
            byte[] bArr = this.buf;
            int i25 = i18 + 1;
            this.index = i25;
            i15 = bArr[i18] & 255;
            if (i25 < i19) {
                return i15;
            }
            this.bufOff = 0;
            this.index = 0;
        } else {
            i15 = this.src.read();
        }
        this.lastI = i15;
        if (i15 < 0) {
            return -1;
        }
        if (i15 == 13 || i15 == 10) {
            this.index = 0;
            if (i15 != 13) {
                i16 = this.src.read();
            } else {
                i16 = this.src.read();
                if (i16 == 10) {
                    byte[] bArr2 = this.buf;
                    int i26 = this.bufOff;
                    this.bufOff = i26 + 1;
                    bArr2[i26] = 10;
                    i16 = this.src.read();
                }
            }
            if (i16 == 45) {
                byte[] bArr3 = this.buf;
                int i27 = this.bufOff;
                this.bufOff = i27 + 1;
                bArr3[i27] = 45;
                i16 = this.src.read();
            }
            if (i16 == 45) {
                byte[] bArr4 = this.buf;
                int i28 = this.bufOff;
                int i29 = i28 + 1;
                this.bufOff = i29;
                bArr4[i28] = 45;
                while (this.bufOff - i29 != this.boundary.length && (i17 = this.src.read()) >= 0) {
                    byte[] bArr5 = this.buf;
                    int i35 = this.bufOff;
                    byte b15 = (byte) i17;
                    bArr5[i35] = b15;
                    if (b15 != this.boundary[i35 - i29]) {
                        this.bufOff = i35 + 1;
                        break;
                    }
                    this.bufOff = i35 + 1;
                }
                if (this.bufOff - i29 == this.boundary.length) {
                    this.ended = true;
                    return -1;
                }
            } else if (i16 >= 0) {
                byte[] bArr6 = this.buf;
                int i36 = this.bufOff;
                this.bufOff = i36 + 1;
                bArr6[i36] = (byte) i16;
            }
        }
        return i15;
    }
}
