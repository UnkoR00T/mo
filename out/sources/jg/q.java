package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class q extends kg.a {
    public static final Parcelable.Creator<q> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f102539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f102540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f102541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f102542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f102543h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f102544j;

    @Deprecated
    public q(int i15, int i16, int i17, long j15, long j16, String str, String str2, int i18) {
        this(i15, i16, i17, j15, j16, str, str2, i18, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f102536a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f102537b);
        kg.c.m(parcel, 3, this.f102538c);
        kg.c.r(parcel, 4, this.f102539d);
        kg.c.r(parcel, 5, this.f102540e);
        kg.c.u(parcel, 6, this.f102541f, false);
        kg.c.u(parcel, 7, this.f102542g, false);
        kg.c.m(parcel, 8, this.f102543h);
        kg.c.m(parcel, 9, this.f102544j);
        kg.c.b(parcel, iA);
    }

    public q(int i15, int i16, int i17, long j15, long j16, String str, String str2, int i18, int i19) {
        this.f102536a = i15;
        this.f102537b = i16;
        this.f102538c = i17;
        this.f102539d = j15;
        this.f102540e = j16;
        this.f102541f = str;
        this.f102542g = str2;
        this.f102543h = i18;
        this.f102544j = i19;
    }
}
