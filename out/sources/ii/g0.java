package ii;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public g0 a() {
            g0 g0VarI = i();
            Iterator<String> it = g0VarI.e().iterator();
            while (it.hasNext()) {
                zj.p.e(!TextUtils.isEmpty(it.next()), "WeekdayText must not contain null or empty values.");
            }
            c(ak.n0.v(g0VarI.c()));
            e(ak.n0.v(g0VarI.e()));
            d(ak.n0.v(g0VarI.d()));
            return i();
        }

        @RecentlyNonNull
        public abstract a b(b bVar);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull List<j0> list);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull List<w0> list);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public abstract a f(Boolean bool);

        @RecentlyNonNull
        public abstract a g(Instant instant);

        @RecentlyNonNull
        public abstract a h(Instant instant);

        abstract g0 i();
    }

    public enum b implements Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;


        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new a7();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static a a() {
        a2 a2Var = new a2();
        a2Var.c(new ArrayList());
        a2Var.d(new ArrayList());
        a2Var.e(new ArrayList());
        return a2Var;
    }

    @RecentlyNullable
    public abstract b b();

    @RecentlyNonNull
    public abstract List<j0> c();

    @RecentlyNonNull
    public abstract List<w0> d();

    @RecentlyNonNull
    public abstract List<String> e();

    @RecentlyNullable
    public abstract Boolean f();

    @RecentlyNullable
    public abstract Instant g();

    @RecentlyNullable
    public abstract Instant h();
}
