package org.bouncycastle.cms.jcajce;

import java.io.OutputStream;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes5.dex */
class JceAADStream extends OutputStream {
    private final byte[] SINGLE_BYTE = new byte[1];
    private Cipher cipher;

    JceAADStream(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override // java.io.OutputStream
    public void write(int i15) {
        byte[] bArr = this.SINGLE_BYTE;
        bArr[0] = (byte) i15;
        this.cipher.updateAAD(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) {
        this.cipher.updateAAD(bArr, i15, i16);
    }
}
