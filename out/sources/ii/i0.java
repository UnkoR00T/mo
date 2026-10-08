package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract i0 a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull l0.a aVar);
    }

    @RecentlyNonNull
    public static a a() {
        e2 e2Var = new e2();
        l0.a aVar = l0.a.UNKNOWN;
        e2Var.c(aVar);
        e2Var.d(aVar);
        e2Var.b(aVar);
        e2Var.e(aVar);
        return e2Var;
    }

    @RecentlyNonNull
    public abstract l0.a b();

    @RecentlyNonNull
    public abstract l0.a c();

    @RecentlyNonNull
    public abstract l0.a d();

    @RecentlyNonNull
    public abstract l0.a e();
}
