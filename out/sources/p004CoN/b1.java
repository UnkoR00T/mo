package p004CoN;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241a;

    static {
        int[] iArr = new int[CertificateType.values().length];
        try {
            iArr[CertificateType.PRESENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CertificateType.AUTHENTICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CertificateType.AUTHORIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f241a = iArr;
    }
}
