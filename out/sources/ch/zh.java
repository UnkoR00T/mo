package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zh extends kg.a {
    public static final Parcelable.Creator<zh> CREATOR = new wi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Point[] f26751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ra f26752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ud f26753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ve f26754h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yg f26755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xf f26756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sb f26757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o7 f26758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p8 f26759n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q9 f26760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f26761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f26763s;

    public zh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26747a);
        kg.c.u(parcel, 3, this.f26748b, false);
        kg.c.u(parcel, 4, this.f26749c, false);
        kg.c.m(parcel, 5, this.f26750d);
        kg.c.x(parcel, 6, this.f26751e, i15, false);
        kg.c.t(parcel, 7, this.f26752f, i15, false);
        kg.c.t(parcel, 8, this.f26753g, i15, false);
        kg.c.t(parcel, 9, this.f26754h, i15, false);
        kg.c.t(parcel, 10, this.f26755j, i15, false);
        kg.c.t(parcel, 11, this.f26756k, i15, false);
        kg.c.t(parcel, 12, this.f26757l, i15, false);
        kg.c.t(parcel, 13, this.f26758m, i15, false);
        kg.c.t(parcel, 14, this.f26759n, i15, false);
        kg.c.t(parcel, 15, this.f26760p, i15, false);
        kg.c.f(parcel, 16, this.f26761q, false);
        kg.c.c(parcel, 17, this.f26762r);
        kg.c.h(parcel, 18, this.f26763s);
        kg.c.b(parcel, iA);
    }

    public zh(int i15, String str, String str2, int i16, Point[] pointArr, ra raVar, ud udVar, ve veVar, yg ygVar, xf xfVar, sb sbVar, o7 o7Var, p8 p8Var, q9 q9Var, byte[] bArr, boolean z15, double d15) {
        this.f26747a = i15;
        this.f26748b = str;
        this.f26761q = bArr;
        this.f26749c = str2;
        this.f26750d = i16;
        this.f26751e = pointArr;
        this.f26762r = z15;
        this.f26763s = d15;
        this.f26752f = raVar;
        this.f26753g = udVar;
        this.f26754h = veVar;
        this.f26755j = ygVar;
        this.f26756k = xfVar;
        this.f26757l = sbVar;
        this.f26758m = o7Var;
        this.f26759n = p8Var;
        this.f26760p = q9Var;
    }
}
