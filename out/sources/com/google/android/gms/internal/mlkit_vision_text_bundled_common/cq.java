package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class cq extends kg.a {
    public static final Parcelable.Creator<cq> CREATOR = new dq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f30385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f30388g;

    public cq(String str, String str2, String str3, boolean z15, int i15, String str4, boolean z16) {
        this.f30382a = str;
        this.f30383b = str2;
        this.f30384c = str3;
        this.f30387f = str4;
        this.f30386e = i15;
        this.f30385d = z15;
        this.f30388g = z16;
    }

    public final String h() {
        return this.f30382a;
    }

    public final String m() {
        return this.f30387f;
    }

    public final String p() {
        return this.f30384c;
    }

    public final boolean r() {
        return this.f30388g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30382a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30383b, false);
        kg.c.u(parcel, 3, this.f30384c, false);
        kg.c.c(parcel, 4, this.f30385d);
        kg.c.m(parcel, 5, this.f30386e);
        kg.c.u(parcel, 6, this.f30387f, false);
        kg.c.c(parcel, 7, this.f30388g);
        kg.c.b(parcel, iA);
    }
}
