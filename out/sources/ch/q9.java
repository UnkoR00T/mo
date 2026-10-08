package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q9 extends kg.a {
    public static final Parcelable.Creator<q9> CREATOR = new nm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26283h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26288n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26289p;

    public q9() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26276a, false);
        kg.c.u(parcel, 3, this.f26277b, false);
        kg.c.u(parcel, 4, this.f26278c, false);
        kg.c.u(parcel, 5, this.f26279d, false);
        kg.c.u(parcel, 6, this.f26280e, false);
        kg.c.u(parcel, 7, this.f26281f, false);
        kg.c.u(parcel, 8, this.f26282g, false);
        kg.c.u(parcel, 9, this.f26283h, false);
        kg.c.u(parcel, 10, this.f26284j, false);
        kg.c.u(parcel, 11, this.f26285k, false);
        kg.c.u(parcel, 12, this.f26286l, false);
        kg.c.u(parcel, 13, this.f26287m, false);
        kg.c.u(parcel, 14, this.f26288n, false);
        kg.c.u(parcel, 15, this.f26289p, false);
        kg.c.b(parcel, iA);
    }

    public q9(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f26276a = str;
        this.f26277b = str2;
        this.f26278c = str3;
        this.f26279d = str4;
        this.f26280e = str5;
        this.f26281f = str6;
        this.f26282g = str7;
        this.f26283h = str8;
        this.f26284j = str9;
        this.f26285k = str10;
        this.f26286l = str11;
        this.f26287m = str12;
        this.f26288n = str13;
        this.f26289p = str14;
    }
}
