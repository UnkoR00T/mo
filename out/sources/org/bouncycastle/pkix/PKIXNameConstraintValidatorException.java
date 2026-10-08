package org.bouncycastle.pkix;

/* JADX INFO: loaded from: classes5.dex */
public class PKIXNameConstraintValidatorException extends Exception {
    private Throwable cause;

    public PKIXNameConstraintValidatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PKIXNameConstraintValidatorException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
