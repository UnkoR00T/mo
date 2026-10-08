package nk;

import java.security.GeneralSecurityException;
import sk.i0;
import sk.y;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends fk.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f137047a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f137049b;

        static {
            int[] iArr = new int[y.c.values().length];
            f137049b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137049b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i0.values().length];
            f137048a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137048a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137048a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f137048a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, fk.y yVar) throws GeneralSecurityException {
        a(oVar, yVar);
        this.f137047a = oVar;
    }

    private static void a(o oVar, fk.y yVar) throws GeneralSecurityException {
        int i15 = a.f137049b[oVar.d().ordinal()];
        if (i15 == 1 || i15 == 2) {
            fk.y.b(yVar);
        }
    }
}
