package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yg extends kg.a {
    public static final Parcelable.Creator<yg> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26704c;

    public yg() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26702a, false);
        kg.c.u(parcel, 3, this.f26703b, false);
        kg.c.m(parcel, 4, this.f26704c);
        kg.c.b(parcel, iA);
    }

    public yg(String str, String str2, int i15) {
        this.f26702a = str;
        this.f26703b = str2;
        this.f26704c = i15;
    }
}
