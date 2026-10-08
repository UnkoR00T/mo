package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes5.dex */
class SignatureUpdatingOutputStream extends OutputStream {
    private Signature sig;

    SignatureUpdatingOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i15) throws IOException {
        try {
            this.sig.update((byte) i15);
        } catch (SignatureException e15) {
            throw Exceptions.ioException(e15.getMessage(), e15);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.sig.update(bArr);
        } catch (SignatureException e15) {
            throw Exceptions.ioException(e15.getMessage(), e15);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        try {
            this.sig.update(bArr, i15, i16);
        } catch (SignatureException e15) {
            throw Exceptions.ioException(e15.getMessage(), e15);
        }
    }
}
