package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class m0 implements Parcelable {
    @RecentlyNonNull
    public static m0 c(@RecentlyNonNull l0 l0Var, double d15) {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        ak.q1 q1VarD = ak.q1.d(dValueOf, dValueOf2);
        Double dValueOf3 = Double.valueOf(d15);
        zj.p.n(q1VarD.g(dValueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, dValueOf3);
        return new z5(l0Var, d15);
    }

    public abstract double a();

    @RecentlyNonNull
    public abstract l0 b();
}
