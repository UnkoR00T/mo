package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract p0 a();

        @RecentlyNonNull
        public abstract a b(e0 e0Var);

        @RecentlyNonNull
        public abstract a c(e0 e0Var);
    }

    @RecentlyNonNull
    public static a a() {
        return new r2();
    }

    @RecentlyNullable
    public abstract e0 b();

    @RecentlyNullable
    public abstract e0 c();
}
