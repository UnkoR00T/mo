package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sb extends kg.a {
    public static final Parcelable.Creator<sb> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f26332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f26333b;

    public sb() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.h(parcel, 2, this.f26332a);
        kg.c.h(parcel, 3, this.f26333b);
        kg.c.b(parcel, iA);
    }

    public sb(double d15, double d16) {
        this.f26332a = d15;
        this.f26333b = d16;
    }
}
