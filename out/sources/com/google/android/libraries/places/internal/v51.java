package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class v51 implements Parcelable {
    public static final Parcelable.Creator<v51> CREATOR = new u51();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e61 f34025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pi.c f34026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t51 f34027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z51 f34028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pi.a f34029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ii.i f34030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34032h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34037n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f34040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f34041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f34042t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f34045x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final xu0 f34046y;

    /* synthetic */ v51(Parcel parcel, byte[] bArr) {
        this.f34025a = (e61) parcel.readParcelable(e61.class.getClassLoader());
        this.f34026b = (pi.c) parcel.readParcelable(pi.c.class.getClassLoader());
        this.f34027c = (t51) parcel.readParcelable(t51.class.getClassLoader());
        this.f34028d = (z51) parcel.readParcelable(z51.class.getClassLoader());
        this.f34029e = (pi.a) parcel.readParcelable(pi.a.class.getClassLoader());
        this.f34030f = (ii.i) parcel.readParcelable(ii.i.class.getClassLoader());
        this.f34038p = h(parcel);
        this.f34031g = h(parcel);
        this.f34032h = h(parcel);
        this.f34037n = parcel.readInt();
        this.f34033j = parcel.readInt();
        this.f34034k = parcel.readInt();
        this.f34035l = parcel.readInt();
        this.f34039q = h(parcel);
        this.f34036m = parcel.readInt();
        this.f34040r = zj.v.e(parcel.readString());
        this.f34041s = parcel.readInt();
        this.f34042t = parcel.readInt();
        this.f34043v = h(parcel);
        this.f34044w = parcel.readInt();
        this.f34045x = parcel.readLong();
        this.f34046y = new bv0();
    }

    private static boolean h(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private final boolean i() {
        return this.f34045x != -1;
    }

    public final int A() {
        return this.f34042t;
    }

    public final boolean B() {
        return this.f34043v;
    }

    public final int C() {
        return this.f34044w;
    }

    public final void D(int i15) {
        this.f34038p = true;
        this.f34037n = i15;
    }

    public final void E() {
        this.f34031g = true;
    }

    public final void F() {
        if (this.f34031g || this.f34039q) {
            return;
        }
        this.f34032h = true;
    }

    public final void G() {
        this.f34033j++;
    }

    public final void H() {
        this.f34034k++;
    }

    public final void I() {
        this.f34035l++;
    }

    public final void a() {
        this.f34039q = true;
    }

    public final void b() {
        this.f34036m++;
    }

    public final void c(String str) {
        this.f34041s++;
        this.f34040r = str;
    }

    public final void d() {
        this.f34042t++;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e() {
        this.f34043v = true;
    }

    public final void f() {
        if (i()) {
            return;
        }
        this.f34045x = this.f34046y.zzb();
    }

    public final void g() {
        if (i()) {
            this.f34044w += (int) (this.f34046y.zzb() - this.f34045x);
            this.f34045x = -1L;
        }
    }

    public final e61 j() {
        return this.f34025a;
    }

    public final pi.c k() {
        return this.f34026b;
    }

    public final t51 l() {
        return this.f34027c;
    }

    public final void m(t51 t51Var) {
        this.f34027c = t51Var;
    }

    public final z51 n() {
        return this.f34028d;
    }

    public final pi.a o() {
        return this.f34029e;
    }

    public final ii.i p() {
        return this.f34030f;
    }

    public final boolean q() {
        return this.f34038p;
    }

    public final boolean r() {
        return this.f34031g;
    }

    public final boolean s() {
        return this.f34032h;
    }

    public final int t() {
        return this.f34037n;
    }

    public final int u() {
        return this.f34033j;
    }

    public final int v() {
        return this.f34034k;
    }

    public final int w() {
        return this.f34035l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(this.f34025a, i15);
        parcel.writeParcelable(this.f34026b, i15);
        parcel.writeParcelable(this.f34027c, i15);
        parcel.writeParcelable(this.f34028d, i15);
        parcel.writeParcelable(this.f34029e, i15);
        parcel.writeParcelable(this.f34030f, i15);
        parcel.writeInt(this.f34038p ? 1 : 0);
        parcel.writeInt(this.f34031g ? 1 : 0);
        parcel.writeInt(this.f34032h ? 1 : 0);
        parcel.writeInt(this.f34037n);
        parcel.writeInt(this.f34033j);
        parcel.writeInt(this.f34034k);
        parcel.writeInt(this.f34035l);
        parcel.writeInt(this.f34039q ? 1 : 0);
        parcel.writeInt(this.f34036m);
        parcel.writeString(this.f34040r);
        parcel.writeInt(this.f34041s);
        parcel.writeInt(this.f34042t);
        parcel.writeInt(this.f34043v ? 1 : 0);
        parcel.writeInt(this.f34044w);
        parcel.writeLong(this.f34045x);
    }

    public final int x() {
        return this.f34036m;
    }

    public final String y() {
        return this.f34040r;
    }

    public final int z() {
        return this.f34041s;
    }

    public v51(e61 e61Var, pi.c cVar, z51 z51Var, pi.a aVar, String str, ii.i iVar, xu0 xu0Var) {
        this.f34025a = e61Var;
        this.f34026b = cVar;
        this.f34028d = z51Var;
        this.f34029e = aVar;
        if (iVar == null) {
            this.f34030f = ii.i.a();
        } else {
            this.f34030f = iVar;
        }
        ii.i.a();
        this.f34040r = zj.v.e(str);
        this.f34037n = -1;
        this.f34045x = -1L;
        this.f34046y = xu0Var;
    }
}
