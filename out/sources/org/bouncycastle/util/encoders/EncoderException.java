package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes5.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    EncoderException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
