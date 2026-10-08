package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public y a() {
            List listJ = j();
            if (listJ != null) {
                i(ak.n0.v(listJ));
            }
            return k();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(b bVar);

        @RecentlyNonNull
        public abstract a g(Double d15);

        @RecentlyNonNull
        public abstract a h(Double d15);

        @RecentlyNonNull
        public abstract a i(List<String> list);

        abstract List j();

        abstract y k();
    }

    public enum b {
        NEAR,
        WITHIN,
        BESIDE,
        ACROSS_THE_ROAD,
        DOWN_THE_ROAD,
        AROUND_THE_CORNER,
        BEHIND
    }

    @RecentlyNonNull
    public static a a() {
        return new o1();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract b f();

    @RecentlyNullable
    public abstract Double g();

    @RecentlyNullable
    public abstract Double h();

    @RecentlyNullable
    public abstract List<String> i();
}
