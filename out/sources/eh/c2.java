package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends kg.a {
    public static final Parcelable.Creator<c2> CREATOR = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF[] f50293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50294b;

    public c2(PointF[] pointFArr, int i15) {
        this.f50293a = pointFArr;
        this.f50294b = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, this.f50293a, i15, false);
        kg.c.m(parcel, 3, this.f50294b);
        kg.c.b(parcel, iA);
    }
}
