package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p8 extends kg.a {
    public static final Parcelable.Creator<p8> CREATOR = new ql();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tc f26248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ud[] f26251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ra[] f26252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f26253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m5[] f26254g;

    public p8() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, this.f26248a, i15, false);
        kg.c.u(parcel, 3, this.f26249b, false);
        kg.c.u(parcel, 4, this.f26250c, false);
        kg.c.x(parcel, 5, this.f26251d, i15, false);
        kg.c.x(parcel, 6, this.f26252e, i15, false);
        kg.c.v(parcel, 7, this.f26253f, false);
        kg.c.x(parcel, 8, this.f26254g, i15, false);
        kg.c.b(parcel, iA);
    }

    public p8(tc tcVar, String str, String str2, ud[] udVarArr, ra[] raVarArr, String[] strArr, m5[] m5VarArr) {
        this.f26248a = tcVar;
        this.f26249b = str;
        this.f26250c = str2;
        this.f26251d = udVarArr;
        this.f26252e = raVarArr;
        this.f26253f = strArr;
        this.f26254g = m5VarArr;
    }
}
