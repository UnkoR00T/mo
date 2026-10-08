package org.conscrypt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    OpenSSLBIOInputStream(InputStream inputStream, boolean z15) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z15);
    }

    long getBioContext() {
        return this.ctx;
    }

    int gets(byte[] bArr) {
        int i15;
        int i16 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i16 < bArr.length && (i15 = read()) != -1) {
                if (i15 != 10) {
                    bArr[i16] = (byte) i15;
                    i16++;
                } else if (i16 != 0) {
                    break;
                }
            }
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        if (i15 < 0 || i16 < 0 || i16 > bArr.length - i15) {
            throw new IndexOutOfBoundsException("Invalid bounds");
        }
        int i17 = 0;
        if (i16 == 0) {
            return 0;
        }
        do {
            int i18 = super.read(bArr, i15 + i17, i16 - i17);
            if (i18 == -1) {
                break;
            }
            i17 += i18;
        } while (i15 + i17 < i16);
        if (i17 == 0) {
            return -1;
        }
        return i17;
    }
}
