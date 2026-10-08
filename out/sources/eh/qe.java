package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qe extends kg.a {
    public static final Parcelable.Creator<qe> CREATOR = new re();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f50988b;

    public qe(int i15, PointF pointF) {
        this.f50987a = i15;
        this.f50988b = pointF;
    }

    public final int h() {
        return this.f50987a;
    }

    public final PointF m() {
        return this.f50988b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50987a);
        kg.c.t(parcel, 2, this.f50988b, i15, false);
        kg.c.b(parcel, iA);
    }
}
