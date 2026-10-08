package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f51542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f51543b;

    f() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.r(parcel, 2, this.f51542a);
        kg.c.r(parcel, 3, this.f51543b);
        kg.c.b(parcel, iA);
    }

    public f(long j15, long j16) {
        this.f51542a = j15;
        this.f51543b = j16;
    }
}
