package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kk extends kg.a {
    public static final Parcelable.Creator<kk> CREATOR = new lk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f63354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f63355e;

    public kk(int i15, int i16, int i17, int i18, long j15) {
        this.f63351a = i15;
        this.f63352b = i16;
        this.f63353c = i17;
        this.f63354d = i18;
        this.f63355e = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f63351a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f63352b);
        kg.c.m(parcel, 3, this.f63353c);
        kg.c.m(parcel, 4, this.f63354d);
        kg.c.r(parcel, 5, this.f63355e);
        kg.c.b(parcel, iA);
    }
}
