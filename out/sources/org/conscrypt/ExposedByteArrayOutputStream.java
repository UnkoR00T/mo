package org.conscrypt;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
    public ExposedByteArrayOutputStream() {
    }

    public byte[] array() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public void setCountManually(int i15) {
        ((ByteArrayOutputStream) this).count = i15;
    }

    public ExposedByteArrayOutputStream(int i15) {
        super(i15);
    }
}
