package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract j0 a();

        @RecentlyNonNull
        public abstract a b(y0 y0Var);

        @RecentlyNonNull
        public abstract a c(y0 y0Var);
    }

    @RecentlyNonNull
    public static a a() {
        return new g2();
    }

    @RecentlyNullable
    public abstract y0 b();

    @RecentlyNullable
    public abstract y0 c();
}
