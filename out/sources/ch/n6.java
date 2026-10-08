package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n6 extends kg.a {
    public static final Parcelable.Creator<n6> CREATOR = new xj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26180h;

    public n6() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26173a);
        kg.c.m(parcel, 3, this.f26174b);
        kg.c.m(parcel, 4, this.f26175c);
        kg.c.m(parcel, 5, this.f26176d);
        kg.c.m(parcel, 6, this.f26177e);
        kg.c.m(parcel, 7, this.f26178f);
        kg.c.c(parcel, 8, this.f26179g);
        kg.c.u(parcel, 9, this.f26180h, false);
        kg.c.b(parcel, iA);
    }

    public n6(int i15, int i16, int i17, int i18, int i19, int i25, boolean z15, String str) {
        this.f26173a = i15;
        this.f26174b = i16;
        this.f26175c = i17;
        this.f26176d = i18;
        this.f26177e = i19;
        this.f26178f = i25;
        this.f26179g = z15;
        this.f26180h = str;
    }
}
