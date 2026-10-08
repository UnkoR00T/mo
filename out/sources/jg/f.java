package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f102459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f102460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f102461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f102462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f102464f;

    public f(u uVar, boolean z15, boolean z16, int[] iArr, int i15, int[] iArr2) {
        this.f102459a = uVar;
        this.f102460b = z15;
        this.f102461c = z16;
        this.f102462d = iArr;
        this.f102463e = i15;
        this.f102464f = iArr2;
    }

    public int h() {
        return this.f102463e;
    }

    public int[] m() {
        return this.f102462d;
    }

    public int[] p() {
        return this.f102464f;
    }

    public boolean r() {
        return this.f102460b;
    }

    public boolean u() {
        return this.f102461c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f102459a, i15, false);
        kg.c.c(parcel, 2, r());
        kg.c.c(parcel, 3, u());
        kg.c.n(parcel, 4, m(), false);
        kg.c.m(parcel, 5, h());
        kg.c.n(parcel, 6, p(), false);
        kg.c.b(parcel, iA);
    }

    public final u y() {
        return this.f102459a;
    }
}
