package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends kg.a {
    public static final Parcelable.Creator<c2> CREATOR = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62974e;

    public c2(int i15, int i16, int i17, long j15, int i18) {
        this.f62970a = i15;
        this.f62971b = i16;
        this.f62972c = i17;
        this.f62973d = j15;
        this.f62974e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f62970a);
        kg.c.m(parcel, 3, this.f62971b);
        kg.c.m(parcel, 4, this.f62972c);
        kg.c.r(parcel, 5, this.f62973d);
        kg.c.m(parcel, 6, this.f62974e);
        kg.c.b(parcel, iA);
    }
}
