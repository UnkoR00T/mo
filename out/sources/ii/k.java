package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract k a();

        @RecentlyNonNull
        public abstract a b(Instant instant);

        @RecentlyNonNull
        public abstract a c(Integer num);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull Integer num);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull Double d15);

        @RecentlyNonNull
        public abstract a f(Integer num);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull r rVar, @RecentlyNonNull Double d15, @RecentlyNonNull Integer num) {
        q7 q7Var = new q7();
        q7Var.g(rVar);
        q7Var.e(d15);
        q7Var.d(num);
        return q7Var;
    }

    @RecentlyNullable
    public abstract Instant b();

    @RecentlyNullable
    public abstract Integer c();

    @RecentlyNonNull
    public abstract Integer d();

    @RecentlyNonNull
    public abstract Double e();

    @RecentlyNullable
    public abstract Integer f();

    @RecentlyNonNull
    public abstract r g();
}
