package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends kg.a {
    public static final Parcelable.Creator<e4> CREATOR = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f50486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f50487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f50488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f50489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f50490h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f50491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mc[] f50492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f50493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f50494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f50495n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2[] f50496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f50497q;

    public e4(int i15, int i16, float f15, float f16, float f17, float f18, float f19, float f25, float f26, mc[] mcVarArr, float f27, float f28, float f29, c2[] c2VarArr, float f35) {
        this.f50483a = i15;
        this.f50484b = i16;
        this.f50485c = f15;
        this.f50486d = f16;
        this.f50487e = f17;
        this.f50488f = f18;
        this.f50489g = f19;
        this.f50490h = f25;
        this.f50491j = f26;
        this.f50492k = mcVarArr;
        this.f50493l = f27;
        this.f50494m = f28;
        this.f50495n = f29;
        this.f50496p = c2VarArr;
        this.f50497q = f35;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50483a);
        kg.c.m(parcel, 2, this.f50484b);
        kg.c.i(parcel, 3, this.f50485c);
        kg.c.i(parcel, 4, this.f50486d);
        kg.c.i(parcel, 5, this.f50487e);
        kg.c.i(parcel, 6, this.f50488f);
        kg.c.i(parcel, 7, this.f50489g);
        kg.c.i(parcel, 8, this.f50490h);
        kg.c.x(parcel, 9, this.f50492k, i15, false);
        kg.c.i(parcel, 10, this.f50493l);
        kg.c.i(parcel, 11, this.f50494m);
        kg.c.i(parcel, 12, this.f50495n);
        kg.c.x(parcel, 13, this.f50496p, i15, false);
        kg.c.i(parcel, 14, this.f50491j);
        kg.c.i(parcel, 15, this.f50497q);
        kg.c.b(parcel, iA);
    }
}
