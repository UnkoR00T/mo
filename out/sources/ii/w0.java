package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract w0 a();

        @RecentlyNonNull
        public abstract a b(boolean z15);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull a0 a0Var) {
        a3 a3Var = new a3();
        a3Var.c(a0Var);
        a3Var.b(false);
        return a3Var;
    }

    @RecentlyNonNull
    public abstract a0 b();

    public abstract boolean c();
}
