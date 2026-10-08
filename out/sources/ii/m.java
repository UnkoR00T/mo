package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract m a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(Uri uri);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new u7();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract Uri c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();
}
