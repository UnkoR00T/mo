package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sl extends kg.a {
    public static final Parcelable.Creator<sl> CREATOR = new tl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f26338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Point[] f26339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kl f26341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nl f26342h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ol f26343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final rl f26344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final pl f26345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ll f26346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final hl f26347n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final il f26348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final jl f26349q;

    public sl(int i15, String str, String str2, byte[] bArr, Point[] pointArr, int i16, kl klVar, nl nlVar, ol olVar, rl rlVar, pl plVar, ll llVar, hl hlVar, il ilVar, jl jlVar) {
        this.f26335a = i15;
        this.f26336b = str;
        this.f26337c = str2;
        this.f26338d = bArr;
        this.f26339e = pointArr;
        this.f26340f = i16;
        this.f26341g = klVar;
        this.f26342h = nlVar;
        this.f26343j = olVar;
        this.f26344k = rlVar;
        this.f26345l = plVar;
        this.f26346m = llVar;
        this.f26347n = hlVar;
        this.f26348p = ilVar;
        this.f26349q = jlVar;
    }

    public final int h() {
        return this.f26335a;
    }

    public final int m() {
        return this.f26340f;
    }

    public final String p() {
        return this.f26336b;
    }

    public final String r() {
        return this.f26337c;
    }

    public final byte[] u() {
        return this.f26338d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f26335a);
        kg.c.u(parcel, 2, this.f26336b, false);
        kg.c.u(parcel, 3, this.f26337c, false);
        kg.c.f(parcel, 4, this.f26338d, false);
        kg.c.x(parcel, 5, this.f26339e, i15, false);
        kg.c.m(parcel, 6, this.f26340f);
        kg.c.t(parcel, 7, this.f26341g, i15, false);
        kg.c.t(parcel, 8, this.f26342h, i15, false);
        kg.c.t(parcel, 9, this.f26343j, i15, false);
        kg.c.t(parcel, 10, this.f26344k, i15, false);
        kg.c.t(parcel, 11, this.f26345l, i15, false);
        kg.c.t(parcel, 12, this.f26346m, i15, false);
        kg.c.t(parcel, 13, this.f26347n, i15, false);
        kg.c.t(parcel, 14, this.f26348p, i15, false);
        kg.c.t(parcel, 15, this.f26349q, i15, false);
        kg.c.b(parcel, iA);
    }

    public final Point[] y() {
        return this.f26339e;
    }
}
