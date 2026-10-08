package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract n0 a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new n2();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();
}
