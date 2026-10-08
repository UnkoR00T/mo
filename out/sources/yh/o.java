package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o extends kg.a {
    public static final Parcelable.Creator<o> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f226889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f226890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f226891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f226892d;

    public o(String str, String str2, int i15, int i16) {
        this.f226889a = str;
        this.f226890b = str2;
        this.f226891c = i15;
        this.f226892d = i16;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        String str = this.f226889a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, str, false);
        kg.c.u(parcel, 3, this.f226890b, false);
        kg.c.m(parcel, 4, this.f226891c);
        kg.c.m(parcel, 5, this.f226892d);
        kg.c.b(parcel, iA);
    }
}
