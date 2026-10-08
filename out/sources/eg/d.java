package eg;

import android.os.Parcel;
import android.os.Parcelable;
import jg.r;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f49952c;

    public d(boolean z15, long j15, long j16) {
        this.f49950a = z15;
        this.f49951b = j15;
        this.f49952c = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f49950a == dVar.f49950a && this.f49951b == dVar.f49951b && this.f49952c == dVar.f49952c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.b(Boolean.valueOf(this.f49950a), Long.valueOf(this.f49951b), Long.valueOf(this.f49952c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f49950a + ",collectForDebugStartTimeMillis: " + this.f49951b + ",collectForDebugExpiryTimeMillis: " + this.f49952c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, this.f49950a);
        kg.c.r(parcel, 2, this.f49952c);
        kg.c.r(parcel, 3, this.f49951b);
        kg.c.b(parcel, iA);
    }
}
