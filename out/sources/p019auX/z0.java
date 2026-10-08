package p019auX;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14615a;

    static {
        int[] iArr = new int[RequestType.values().length];
        try {
            iArr[RequestType.CHANGE_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestType.RESET_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequestType.SIGN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequestType.READ_ICAO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequestType.READ_PHOTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RequestType.READ_CERTIFICATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RequestType.READ_ALL_DATA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f14615a = iArr;
    }
}
