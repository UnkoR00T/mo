package p005Con;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260a;

    static {
        int[] iArr = new int[CertificateType.values().length];
        try {
            iArr[CertificateType.AUTHENTICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CertificateType.PRESENCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CertificateType.AUTHORIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f260a = iArr;
    }
}
