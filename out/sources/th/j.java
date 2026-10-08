package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends kg.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f190195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l0 f190196b;

    j(int i15, l0 l0Var) {
        this.f190195a = i15;
        this.f190196b = l0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f190195a);
        kg.c.t(parcel, 2, this.f190196b, i15, false);
        kg.c.b(parcel, iA);
    }
}
