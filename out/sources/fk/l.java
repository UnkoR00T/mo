package fk;

import sk.a0;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f64364a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64366b;

        static {
            int[] iArr = new int[b.values().length];
            f64366b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64366b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64366b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64366b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            f64365a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64365a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64365a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64365a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private l(a0 a0Var) {
        this.f64364a = a0Var;
    }

    public static l a(String str, byte[] bArr, b bVar) {
        return new l(a0.d0().H(str).I(com.google.crypto.tink.shaded.protobuf.h.i(bArr)).G(c(bVar)).build());
    }

    static i0 c(b bVar) {
        int i15 = a.f64366b[bVar.ordinal()];
        if (i15 == 1) {
            return i0.TINK;
        }
        if (i15 == 2) {
            return i0.LEGACY;
        }
        if (i15 == 3) {
            return i0.RAW;
        }
        if (i15 == 4) {
            return i0.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    a0 b() {
        return this.f64364a;
    }
}
