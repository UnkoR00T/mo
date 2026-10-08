package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jl extends kg.a {
    public static final Parcelable.Creator<jl> CREATOR = new zl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25988h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f25990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f25991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f25992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f25993n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f25994p;

    public jl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f25981a = str;
        this.f25982b = str2;
        this.f25983c = str3;
        this.f25984d = str4;
        this.f25985e = str5;
        this.f25986f = str6;
        this.f25987g = str7;
        this.f25988h = str8;
        this.f25989j = str9;
        this.f25990k = str10;
        this.f25991l = str11;
        this.f25992m = str12;
        this.f25993n = str13;
        this.f25994p = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f25981a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f25982b, false);
        kg.c.u(parcel, 3, this.f25983c, false);
        kg.c.u(parcel, 4, this.f25984d, false);
        kg.c.u(parcel, 5, this.f25985e, false);
        kg.c.u(parcel, 6, this.f25986f, false);
        kg.c.u(parcel, 7, this.f25987g, false);
        kg.c.u(parcel, 8, this.f25988h, false);
        kg.c.u(parcel, 9, this.f25989j, false);
        kg.c.u(parcel, 10, this.f25990k, false);
        kg.c.u(parcel, 11, this.f25991l, false);
        kg.c.u(parcel, 12, this.f25992m, false);
        kg.c.u(parcel, 13, this.f25993n, false);
        kg.c.u(parcel, 14, this.f25994p, false);
        kg.c.b(parcel, iA);
    }
}
