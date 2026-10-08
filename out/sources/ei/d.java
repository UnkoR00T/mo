package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f51534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f51536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f51537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f51538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f51539f;

    d() {
        this.f51539f = -1;
        this.f51534a = -1;
        this.f51536c = -1.0d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f51534a);
        kg.c.u(parcel, 3, this.f51535b, false);
        kg.c.h(parcel, 4, this.f51536c);
        kg.c.u(parcel, 5, this.f51537d, false);
        kg.c.r(parcel, 6, this.f51538e);
        kg.c.m(parcel, 7, this.f51539f);
        kg.c.b(parcel, iA);
    }

    d(int i15, String str, double d15, String str2, long j15, int i16) {
        this.f51534a = i15;
        this.f51535b = str;
        this.f51536c = d15;
        this.f51537d = str2;
        this.f51538e = j15;
        this.f51539f = i16;
    }
}
