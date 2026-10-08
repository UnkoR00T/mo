package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xf extends kg.a {
    public static final Parcelable.Creator<xf> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26526b;

    public xf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26525a, false);
        kg.c.u(parcel, 3, this.f26526b, false);
        kg.c.b(parcel, iA);
    }

    public xf(String str, String str2) {
        this.f26525a = str;
        this.f26526b = str2;
    }
}
