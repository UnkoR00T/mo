package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract y0 a();

        @RecentlyNonNull
        public abstract a b(a0 a0Var);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull b0 b0Var);

        @RecentlyNonNull
        public abstract a d(boolean z15);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull p pVar, @RecentlyNonNull b0 b0Var) {
        e3 e3Var = new e3();
        e3Var.e(pVar);
        e3Var.c(b0Var);
        e3Var.d(false);
        return e3Var;
    }

    @RecentlyNonNull
    public static y0 f(@RecentlyNonNull p pVar, @RecentlyNonNull b0 b0Var) {
        return a(pVar, b0Var).a();
    }

    @RecentlyNullable
    public abstract a0 b();

    @RecentlyNonNull
    public abstract p c();

    @RecentlyNonNull
    public abstract b0 d();

    public abstract boolean e();
}
