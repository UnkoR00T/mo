package eo0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Leo0/p0;", "Leo0/y0;", "b", "(Leo0/p0;)Leo0/y0;", "a", "(Leo0/y0;)Leo0/p0;", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52364b;

        static {
            int[] iArr = new int[p0.values().length];
            try {
                iArr[p0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p0.E_PUAP_AND_E_DELIVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52363a = iArr;
            int[] iArr2 = new int[y0.values().length];
            try {
                iArr2[y0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[y0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f52364b = iArr2;
        }
    }

    public static final p0 a(y0 y0Var) {
        int i15 = a.f52364b[y0Var.ordinal()];
        if (i15 == 1) {
            return p0.E_PUAP;
        }
        if (i15 == 2) {
            return p0.E_DELIVERY;
        }
        if (i15 == 3) {
            return p0.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final y0 b(p0 p0Var) {
        int i15 = a.f52363a[p0Var.ordinal()];
        if (i15 == 1) {
            return y0.E_PUAP;
        }
        if (i15 == 2) {
            return y0.E_DELIVERY;
        }
        if (i15 == 3 || i15 == 4) {
            return y0.UNKNOWN;
        }
        throw new oq.p();
    }
}
