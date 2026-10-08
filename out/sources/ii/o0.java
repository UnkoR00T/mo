package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 implements Parcelable {

    @SuppressLint({"AmbiguousGranuleClass"})
    public static abstract class a {
        @RecentlyNonNull
        public o0 a() {
            List listK = k();
            if (listK != null) {
                b(ak.n0.v(listK));
            }
            List listL = l();
            if (listL != null) {
                h(ak.n0.v(listL));
            }
            return m();
        }

        @RecentlyNonNull
        public abstract a b(List<String> list);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);

        @RecentlyNonNull
        public abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(List<String> list);

        @RecentlyNonNull
        public abstract a i(String str);

        @RecentlyNonNull
        public abstract a j(String str);

        abstract List k();

        abstract List l();

        abstract o0 m();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        p2 p2Var = new p2();
        p2Var.n(str);
        return p2Var;
    }

    @RecentlyNullable
    public abstract List<String> b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();

    @RecentlyNullable
    public abstract String g();

    @RecentlyNullable
    public abstract List<String> h();

    @RecentlyNonNull
    public abstract String i();

    @RecentlyNullable
    public abstract String j();

    @RecentlyNullable
    public abstract String k();
}
