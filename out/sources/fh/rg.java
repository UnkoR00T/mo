package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rg extends kg.a {
    public static final Parcelable.Creator<rg> CREATOR = new sh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc[] f63491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f63492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f63493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f63494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f63495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f63496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63497g;

    public rg(mc[] mcVarArr, e4 e4Var, e4 e4Var2, String str, float f15, String str2, boolean z15) {
        this.f63491a = mcVarArr;
        this.f63492b = e4Var;
        this.f63493c = e4Var2;
        this.f63494d = str;
        this.f63495e = f15;
        this.f63496f = str2;
        this.f63497g = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        mc[] mcVarArr = this.f63491a;
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, mcVarArr, i15, false);
        kg.c.t(parcel, 3, this.f63492b, i15, false);
        kg.c.t(parcel, 4, this.f63493c, i15, false);
        kg.c.u(parcel, 5, this.f63494d, false);
        kg.c.i(parcel, 6, this.f63495e);
        kg.c.u(parcel, 7, this.f63496f, false);
        kg.c.c(parcel, 8, this.f63497g);
        kg.c.b(parcel, iA);
    }
}
