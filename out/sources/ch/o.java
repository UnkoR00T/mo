package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends kg.a {
    public static final Parcelable.Creator<o> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26205e;

    public o(int i15, int i16, int i17, long j15, int i18) {
        this.f26201a = i15;
        this.f26202b = i16;
        this.f26203c = i17;
        this.f26204d = j15;
        this.f26205e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26201a);
        kg.c.m(parcel, 3, this.f26202b);
        kg.c.m(parcel, 4, this.f26203c);
        kg.c.r(parcel, 5, this.f26204d);
        kg.c.m(parcel, 6, this.f26205e);
        kg.c.b(parcel, iA);
    }
}
