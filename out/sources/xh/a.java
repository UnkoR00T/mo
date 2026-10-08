package xh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF[] f218580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218581b;

    public a(PointF[] pointFArr, int i15) {
        this.f218580a = pointFArr;
        this.f218581b = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, this.f218580a, i15, false);
        kg.c.m(parcel, 3, this.f218581b);
        kg.c.b(parcel, iA);
    }
}
