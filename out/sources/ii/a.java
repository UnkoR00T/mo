package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: ii.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2187a {
        @RecentlyNonNull
        public abstract a a();

        @RecentlyNonNull
        public abstract AbstractC2187a b(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2187a c(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2187a d(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2187a e(@RecentlyNonNull l0.a aVar);
    }

    @RecentlyNonNull
    public static AbstractC2187a a() {
        z0 z0Var = new z0();
        l0.a aVar = l0.a.UNKNOWN;
        z0Var.b(aVar);
        z0Var.d(aVar);
        z0Var.c(aVar);
        z0Var.e(aVar);
        return z0Var;
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
