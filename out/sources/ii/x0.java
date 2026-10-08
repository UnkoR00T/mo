package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract x0 a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull String str);
    }

    @RecentlyNonNull
    public static x0 c(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        c3 c3Var = new c3();
        c3Var.c(str);
        c3Var.b(str2);
        return c3Var.a();
    }

    @RecentlyNonNull
    public abstract String a();

    @RecentlyNonNull
    public abstract String b();
}
