package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract n a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull String str);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        w7 w7Var = new w7();
        w7Var.c(str);
        w7Var.b(str2);
        return w7Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNonNull
    public abstract String c();
}
