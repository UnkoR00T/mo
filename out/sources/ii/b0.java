package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 implements Parcelable, Comparable<b0> {
    @RecentlyNonNull
    public static b0 j(int i15, int i16) {
        try {
            t1 t1Var = new t1();
            t1Var.c(i15);
            t1Var.a(i16);
            b0 b0VarB = t1Var.b();
            int iE = b0VarB.e();
            zj.p.z(ak.q1.d(0, 23).g(Integer.valueOf(iE)), "Hours must not be out-of-range: 0 to 23, but was: %s.", iE);
            int iG = b0VarB.g();
            zj.p.z(ak.q1.d(0, 59).g(Integer.valueOf(iG)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", iG);
            return b0VarB;
        } catch (IllegalStateException e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@RecentlyNonNull b0 b0Var) {
        int iE;
        int iE2;
        zj.p.r(b0Var, "compare must not be null.");
        if (this == b0Var) {
            return 0;
        }
        if (e() == b0Var.e()) {
            iE = g();
            iE2 = b0Var.g();
        } else {
            iE = e();
            iE2 = b0Var.e();
        }
        return iE - iE2;
    }

    public abstract int e();

    public abstract int g();
}
