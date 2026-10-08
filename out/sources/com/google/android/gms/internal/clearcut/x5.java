package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 extends kg.a {
    public static final Parcelable.Creator<x5> CREATOR = new y5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f29602h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f29603j;

    public x5(String str, int i15, int i16, String str2, String str3, String str4, boolean z15, c5 c5Var) {
        this.f29595a = (String) jg.s.l(str);
        this.f29596b = i15;
        this.f29597c = i16;
        this.f29601g = str2;
        this.f29598d = str3;
        this.f29599e = str4;
        this.f29600f = !z15;
        this.f29602h = z15;
        this.f29603j = c5Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x5) {
            x5 x5Var = (x5) obj;
            if (jg.r.a(this.f29595a, x5Var.f29595a) && this.f29596b == x5Var.f29596b && this.f29597c == x5Var.f29597c && jg.r.a(this.f29601g, x5Var.f29601g) && jg.r.a(this.f29598d, x5Var.f29598d) && jg.r.a(this.f29599e, x5Var.f29599e) && this.f29600f == x5Var.f29600f && this.f29602h == x5Var.f29602h && this.f29603j == x5Var.f29603j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return jg.r.b(this.f29595a, Integer.valueOf(this.f29596b), Integer.valueOf(this.f29597c), this.f29601g, this.f29598d, this.f29599e, Boolean.valueOf(this.f29600f), Boolean.valueOf(this.f29602h), Integer.valueOf(this.f29603j));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f29595a + ",packageVersionCode=" + this.f29596b + ",logSource=" + this.f29597c + ",logSourceName=" + this.f29601g + ",uploadAccount=" + this.f29598d + ",loggingId=" + this.f29599e + ",logAndroidId=" + this.f29600f + ",isAnonymous=" + this.f29602h + ",qosTier=" + this.f29603j + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f29595a, false);
        kg.c.m(parcel, 3, this.f29596b);
        kg.c.m(parcel, 4, this.f29597c);
        kg.c.u(parcel, 5, this.f29598d, false);
        kg.c.u(parcel, 6, this.f29599e, false);
        kg.c.c(parcel, 7, this.f29600f);
        kg.c.u(parcel, 8, this.f29601g, false);
        kg.c.c(parcel, 9, this.f29602h);
        kg.c.m(parcel, 10, this.f29603j);
        kg.c.b(parcel, iA);
    }

    public x5(String str, int i15, int i16, String str2, String str3, boolean z15, String str4, boolean z16, int i17) {
        this.f29595a = str;
        this.f29596b = i15;
        this.f29597c = i16;
        this.f29598d = str2;
        this.f29599e = str3;
        this.f29600f = z15;
        this.f29601g = str4;
        this.f29602h = z16;
        this.f29603j = i17;
    }
}
