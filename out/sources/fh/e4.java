package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends kg.a {
    public static final Parcelable.Creator<e4> CREATOR = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f63015e;

    public e4(int i15, int i16, int i17, int i18, float f15) {
        this.f63011a = i15;
        this.f63012b = i16;
        this.f63013c = i17;
        this.f63014d = i18;
        this.f63015e = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f63011a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, i16);
        kg.c.m(parcel, 3, this.f63012b);
        kg.c.m(parcel, 4, this.f63013c);
        kg.c.m(parcel, 5, this.f63014d);
        kg.c.i(parcel, 6, this.f63015e);
        kg.c.b(parcel, iA);
    }
}
