package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mc extends kg.a {
    public static final Parcelable.Creator<mc> CREATOR = new nd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50821d;

    public mc(int i15, float f15, float f16, int i16) {
        this.f50818a = i15;
        this.f50819b = f15;
        this.f50820c = f16;
        this.f50821d = i16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50818a);
        kg.c.i(parcel, 2, this.f50819b);
        kg.c.i(parcel, 3, this.f50820c);
        kg.c.m(parcel, 4, this.f50821d);
        kg.c.b(parcel, iA);
    }
}
