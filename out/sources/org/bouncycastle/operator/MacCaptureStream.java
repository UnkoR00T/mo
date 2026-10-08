package org.bouncycastle.operator;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class MacCaptureStream extends OutputStream {
    private final OutputStream cOut;
    private final byte[] mac;
    int macIndex = 0;

    public MacCaptureStream(OutputStream outputStream, int i15) {
        this.cOut = outputStream;
        this.mac = new byte[i15];
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // java.io.OutputStream
    public void write(int i15) throws IOException {
        int i16 = this.macIndex;
        byte[] bArr = this.mac;
        if (i16 != bArr.length) {
            this.macIndex = i16 + 1;
            bArr[i16] = (byte) i15;
            return;
        }
        byte b15 = bArr[0];
        System.arraycopy(bArr, 1, bArr, 0, bArr.length - 1);
        byte[] bArr2 = this.mac;
        bArr2[bArr2.length - 1] = (byte) i15;
        this.cOut.write(b15);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        byte[] bArr2 = this.mac;
        if (i16 < bArr2.length) {
            for (int i17 = 0; i17 != i16; i17++) {
                write(bArr[i15 + i17]);
            }
        } else {
            this.cOut.write(bArr2, 0, this.macIndex);
            byte[] bArr3 = this.mac;
            this.macIndex = bArr3.length;
            System.arraycopy(bArr, (i15 + i16) - bArr3.length, bArr3, 0, bArr3.length);
            this.cOut.write(bArr, i15, i16 - this.mac.length);
        }
    }
}
