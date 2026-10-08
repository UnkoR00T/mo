package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes5.dex */
public class MacInputStream extends FilterInputStream {
    protected Mac mac;

    public MacInputStream(InputStream inputStream, Mac mac) {
        super(inputStream);
        this.mac = mac;
    }

    public Mac getMac() {
        return this.mac;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i15 = ((FilterInputStream) this).in.read();
        if (i15 >= 0) {
            this.mac.update((byte) i15);
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = ((FilterInputStream) this).in.read(bArr, i15, i16);
        if (i17 >= 0) {
            this.mac.update(bArr, i15, i17);
        }
        return i17;
    }
}
