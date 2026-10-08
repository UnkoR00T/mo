package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class u extends kg.a {
    public static final Parcelable.Creator<u> CREATOR = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f102557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f102558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102560e;

    public u(int i15, boolean z15, boolean z16, int i16, int i17) {
        this.f102556a = i15;
        this.f102557b = z15;
        this.f102558c = z16;
        this.f102559d = i16;
        this.f102560e = i17;
    }

    public int h() {
        return this.f102559d;
    }

    public int m() {
        return this.f102560e;
    }

    public boolean p() {
        return this.f102557b;
    }

    public boolean r() {
        return this.f102558c;
    }

    public int u() {
        return this.f102556a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, u());
        kg.c.c(parcel, 2, p());
        kg.c.c(parcel, 3, r());
        kg.c.m(parcel, 4, h());
        kg.c.m(parcel, 5, m());
        kg.c.b(parcel, iA);
    }
}
