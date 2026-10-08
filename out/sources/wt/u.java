package wt;

import st.p2;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f215057a;

        static {
            int[] iArr = new int[p2.values().length];
            try {
                iArr[p2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f215057a = iArr;
        }
    }

    public static final y a(p2 p2Var) {
        int i15 = a.f215057a[p2Var.ordinal()];
        if (i15 == 1) {
            return y.INV;
        }
        if (i15 == 2) {
            return y.IN;
        }
        if (i15 == 3) {
            return y.OUT;
        }
        throw new oq.p();
    }
}
