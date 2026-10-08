package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends kg.a {
    public static final Parcelable.Creator<r> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f30214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f30215h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f30216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f30217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f30218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f30219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f30220n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f30221p;

    public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f30208a = str;
        this.f30209b = str2;
        this.f30210c = str3;
        this.f30211d = str4;
        this.f30212e = str5;
        this.f30213f = str6;
        this.f30214g = str7;
        this.f30215h = str8;
        this.f30216j = str9;
        this.f30217k = str10;
        this.f30218l = str11;
        this.f30219m = str12;
        this.f30220n = str13;
        this.f30221p = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30208a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30209b, false);
        kg.c.u(parcel, 3, this.f30210c, false);
        kg.c.u(parcel, 4, this.f30211d, false);
        kg.c.u(parcel, 5, this.f30212e, false);
        kg.c.u(parcel, 6, this.f30213f, false);
        kg.c.u(parcel, 7, this.f30214g, false);
        kg.c.u(parcel, 8, this.f30215h, false);
        kg.c.u(parcel, 9, this.f30216j, false);
        kg.c.u(parcel, 10, this.f30217k, false);
        kg.c.u(parcel, 11, this.f30218l, false);
        kg.c.u(parcel, 12, this.f30219m, false);
        kg.c.u(parcel, 13, this.f30220n, false);
        kg.c.u(parcel, 14, this.f30221p, false);
        kg.c.b(parcel, iA);
    }
}
