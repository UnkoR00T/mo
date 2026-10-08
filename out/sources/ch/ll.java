package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ll extends kg.a {
    public static final Parcelable.Creator<ll> CREATOR = new bm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26144b;

    public ll(double d15, double d16) {
        this.f26143a = d15;
        this.f26144b = d16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.h(parcel, 1, this.f26143a);
        kg.c.h(parcel, 2, this.f26144b);
        kg.c.b(parcel, iA);
    }
}
