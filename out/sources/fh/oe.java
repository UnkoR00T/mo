package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class oe extends kg.a {
    public static final Parcelable.Creator<oe> CREATOR = new qf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63432a;

    public oe(String str) {
        this.f63432a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63432a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, str, false);
        kg.c.b(parcel, iA);
    }
}
