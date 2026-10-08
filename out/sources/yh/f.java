package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f226830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f226831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f226832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f226833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f226834h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    String f226835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f226836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f226837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList f226838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ei.f f226839n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final ArrayList f226840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    String f226841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    String f226842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ArrayList f226843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f226844t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ArrayList f226845v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ArrayList f226846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final ArrayList f226847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ei.c f226848y;

    f() {
        this.f226838m = com.google.android.gms.common.util.b.c();
        this.f226840p = com.google.android.gms.common.util.b.c();
        this.f226843s = com.google.android.gms.common.util.b.c();
        this.f226845v = com.google.android.gms.common.util.b.c();
        this.f226846w = com.google.android.gms.common.util.b.c();
        this.f226847x = com.google.android.gms.common.util.b.c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f226827a, false);
        kg.c.u(parcel, 3, this.f226828b, false);
        kg.c.u(parcel, 4, this.f226829c, false);
        kg.c.u(parcel, 5, this.f226830d, false);
        kg.c.u(parcel, 6, this.f226831e, false);
        kg.c.u(parcel, 7, this.f226832f, false);
        kg.c.u(parcel, 8, this.f226833g, false);
        kg.c.u(parcel, 9, this.f226834h, false);
        kg.c.u(parcel, 10, this.f226835j, false);
        kg.c.u(parcel, 11, this.f226836k, false);
        kg.c.m(parcel, 12, this.f226837l);
        kg.c.y(parcel, 13, this.f226838m, false);
        kg.c.t(parcel, 14, this.f226839n, i15, false);
        kg.c.y(parcel, 15, this.f226840p, false);
        kg.c.u(parcel, 16, this.f226841q, false);
        kg.c.u(parcel, 17, this.f226842r, false);
        kg.c.y(parcel, 18, this.f226843s, false);
        kg.c.c(parcel, 19, this.f226844t);
        kg.c.y(parcel, 20, this.f226845v, false);
        kg.c.y(parcel, 21, this.f226846w, false);
        kg.c.y(parcel, 22, this.f226847x, false);
        kg.c.t(parcel, 23, this.f226848y, i15, false);
        kg.c.b(parcel, iA);
    }

    f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i15, ArrayList arrayList, ei.f fVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z15, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ei.c cVar) {
        this.f226827a = str;
        this.f226828b = str2;
        this.f226829c = str3;
        this.f226830d = str4;
        this.f226831e = str5;
        this.f226832f = str6;
        this.f226833g = str7;
        this.f226834h = str8;
        this.f226835j = str9;
        this.f226836k = str10;
        this.f226837l = i15;
        this.f226838m = arrayList;
        this.f226839n = fVar;
        this.f226840p = arrayList2;
        this.f226841q = str11;
        this.f226842r = str12;
        this.f226843s = arrayList3;
        this.f226844t = z15;
        this.f226845v = arrayList4;
        this.f226846w = arrayList5;
        this.f226847x = arrayList6;
        this.f226848y = cVar;
    }
}
