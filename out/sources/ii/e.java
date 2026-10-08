package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract e a();

        @RecentlyNonNull
        public abstract a b(b bVar);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);
    }

    public enum b {
        CONTAINMENT_UNSPECIFIED,
        WITHIN,
        OUTSKIRTS,
        NEAR
    }

    @RecentlyNonNull
    public static a a() {
        return new g7();
    }

    @RecentlyNullable
    public abstract b b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();
}
