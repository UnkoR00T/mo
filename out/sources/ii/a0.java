package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 implements Parcelable, Comparable<a0> {
    @RecentlyNonNull
    public static a0 k(int i15, int i16, int i17) {
        r1 r1Var = new r1();
        r1Var.d(i15);
        r1Var.a(i16);
        r1Var.b(i17);
        a0 a0VarC = r1Var.c();
        int iG = a0VarC.g();
        ak.q1 q1VarD = ak.q1.d(1, 12);
        Integer numValueOf = Integer.valueOf(iG);
        zj.p.h(q1VarD.g(numValueOf), "Month must not be out of range of 1 to 12, but was: %s.", iG);
        int iE = a0VarC.e();
        ak.q1 q1VarD2 = ak.q1.d(1, 31);
        Integer numValueOf2 = Integer.valueOf(iE);
        zj.p.h(q1VarD2.g(numValueOf2), "Day must not be out of range of 1 to 31, but was: %s.", iE);
        if (Arrays.asList(4, 6, 9, 11).contains(numValueOf)) {
            zj.p.i(ak.q1.d(1, 30).g(numValueOf2), "%s is not a valid day for month %s.", iE, iG);
        }
        if (iG == 2) {
            int iJ = a0VarC.j();
            zj.p.n(ak.q1.d(1, Integer.valueOf(iJ % 4 == 0 ? 29 : 28)).g(numValueOf2), "%s is not a valid day for month %s in year %s.", numValueOf2, 2, Integer.valueOf(iJ));
        }
        return a0VarC;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@RecentlyNonNull a0 a0Var) {
        int iE;
        int iE2;
        zj.p.r(a0Var, "dateToCompare must not be null.");
        if (this == a0Var) {
            return 0;
        }
        if (j() != a0Var.j()) {
            iE = j();
            iE2 = a0Var.j();
        } else if (g() != a0Var.g()) {
            iE = g();
            iE2 = a0Var.g();
        } else {
            iE = e();
            iE2 = a0Var.e();
        }
        return iE - iE2;
    }

    public abstract int e();

    public abstract int g();

    public abstract int j();

    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(j()), String.format(Locale.getDefault(), "%02d", Integer.valueOf(g())), String.format(Locale.getDefault(), "%02d", Integer.valueOf(e())));
    }
}
