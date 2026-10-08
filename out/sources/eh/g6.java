package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g6 extends kg.a {
    public static final Parcelable.Creator<g6> CREATOR = new h7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f50581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f50582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f50583f;

    public g6(int i15, int i16, int i17, boolean z15, boolean z16, float f15) {
        this.f50578a = i15;
        this.f50579b = i16;
        this.f50580c = i17;
        this.f50581d = z15;
        this.f50582e = z16;
        this.f50583f = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f50578a);
        kg.c.m(parcel, 3, this.f50579b);
        kg.c.m(parcel, 4, this.f50580c);
        kg.c.c(parcel, 5, this.f50581d);
        kg.c.c(parcel, 6, this.f50582e);
        kg.c.i(parcel, 7, this.f50583f);
        kg.c.b(parcel, iA);
    }
}
