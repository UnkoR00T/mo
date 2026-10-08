package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes5.dex */
public class DigestInputStream extends FilterInputStream {
    protected Digest digest;

    public DigestInputStream(InputStream inputStream, Digest digest) {
        super(inputStream);
        this.digest = digest;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i15 = ((FilterInputStream) this).in.read();
        if (i15 >= 0) {
            this.digest.update((byte) i15);
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = ((FilterInputStream) this).in.read(bArr, i15, i16);
        if (i17 > 0) {
            this.digest.update(bArr, i15, i17);
        }
        return i17;
    }
}
