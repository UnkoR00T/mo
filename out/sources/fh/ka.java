package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ka extends kg.a {
    public static final Parcelable.Creator<ka> CREATOR = new lb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg[] f63319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f63320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f63321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4 f63322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f63323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f63324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f63326h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f63327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f63328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f63329l;

    public ka(rg[] rgVarArr, e4 e4Var, e4 e4Var2, e4 e4Var3, String str, float f15, String str2, int i15, boolean z15, int i16, int i17) {
        this.f63319a = rgVarArr;
        this.f63320b = e4Var;
        this.f63321c = e4Var2;
        this.f63322d = e4Var3;
        this.f63323e = str;
        this.f63324f = f15;
        this.f63325g = str2;
        this.f63326h = i15;
        this.f63327j = z15;
        this.f63328k = i16;
        this.f63329l = i17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        rg[] rgVarArr = this.f63319a;
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, rgVarArr, i15, false);
        kg.c.t(parcel, 3, this.f63320b, i15, false);
        kg.c.t(parcel, 4, this.f63321c, i15, false);
        kg.c.t(parcel, 5, this.f63322d, i15, false);
        kg.c.u(parcel, 6, this.f63323e, false);
        kg.c.i(parcel, 7, this.f63324f);
        kg.c.u(parcel, 8, this.f63325g, false);
        kg.c.m(parcel, 9, this.f63326h);
        kg.c.c(parcel, 10, this.f63327j);
        kg.c.m(parcel, 11, this.f63328k);
        kg.c.m(parcel, 12, this.f63329l);
        kg.c.b(parcel, iA);
    }
}
