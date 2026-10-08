package ii;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract v a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull e0 e0Var);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull Instant instant);
    }

    public enum b implements Parcelable {
        FUEL_TYPE_UNSPECIFIED,
        DIESEL,
        REGULAR_UNLEADED,
        MIDGRADE,
        PREMIUM,
        SP91,
        SP91_E10,
        SP92,
        SP95,
        SP95_E10,
        SP98,
        SP99,
        SP100,
        LPG,
        E80,
        E85,
        METHANE,
        BIO_DIESEL,
        TRUCK_DIESEL;


        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new x6();

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
    public static v d(@RecentlyNonNull b bVar, @RecentlyNonNull e0 e0Var, @RecentlyNonNull Instant instant) {
        i1 i1Var = new i1();
        i1Var.d(bVar);
        i1Var.b(e0Var);
        i1Var.c(instant);
        return i1Var.a();
    }

    @RecentlyNonNull
    public abstract e0 a();

    @RecentlyNonNull
    public abstract b b();

    @RecentlyNonNull
    public abstract Instant c();
}
