package os;

import oq.p;
import st.c2;
import st.d2;
import st.f2;
import st.h0;
import st.i0;
import st.l2;
import st.p2;
import st.t0;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149661a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149661a = iArr;
        }
    }

    @Override // st.h0
    public d2 a(m1 m1Var, i0 i0Var, c2 c2Var, t0 t0Var) {
        if (!(i0Var instanceof os.a)) {
            return super.a(m1Var, i0Var, c2Var, t0Var);
        }
        os.a aVarL = (os.a) i0Var;
        if (!aVarL.i()) {
            aVarL = aVarL.l(c.INFLEXIBLE);
        }
        int i15 = a.f149661a[aVarL.g().ordinal()];
        if (i15 == 1) {
            return new f2(p2.INVARIANT, t0Var);
        }
        if (i15 != 2 && i15 != 3) {
            throw new p();
        }
        if (m1Var.q().e()) {
            return !t0Var.T0().getParameters().isEmpty() ? new f2(p2.OUT_VARIANCE, t0Var) : l2.t(m1Var, aVarL);
        }
        return new f2(p2.INVARIANT, ht.e.m(m1Var).I());
    }
}
