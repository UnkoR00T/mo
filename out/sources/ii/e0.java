package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public e0 a() {
            long jLongValue = c().longValue();
            Integer numB = b();
            if (jLongValue > 0) {
                zj.p.l(numB.intValue() >= 0, "Unit is positive and nano must be positive or zero, but was: %s.", numB);
            } else if (jLongValue < 0) {
                zj.p.l(numB.intValue() <= 0, "Unit is negative and nano must be negative or zero, but was: %s.", numB);
            }
            return f();
        }

        @RecentlyNonNull
        public abstract Integer b();

        @RecentlyNonNull
        public abstract Long c();

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull Integer num);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull Long l15);

        abstract e0 f();
    }

    @RecentlyNonNull
    public static e0 d(@RecentlyNonNull String str, @RecentlyNonNull Long l15, @RecentlyNonNull Integer num) {
        v1 v1Var = new v1();
        v1Var.g(str);
        v1Var.e(l15);
        v1Var.d(num);
        return v1Var.a();
    }

    @RecentlyNonNull
    public abstract String a();

    @RecentlyNonNull
    public abstract Integer b();

    @RecentlyNonNull
    public abstract Long c();
}
