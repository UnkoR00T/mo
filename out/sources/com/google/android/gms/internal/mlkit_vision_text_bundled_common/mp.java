package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mp extends kg.a {
    public static final Parcelable.Creator<mp> CREATOR = new np();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30505e;

    public mp(int i15, int i16, int i17, int i18, long j15) {
        this.f30501a = i15;
        this.f30502b = i16;
        this.f30503c = i17;
        this.f30504d = i18;
        this.f30505e = j15;
    }

    public final int h() {
        return this.f30503c;
    }

    public final int m() {
        return this.f30501a;
    }

    public final int p() {
        return this.f30504d;
    }

    public final int r() {
        return this.f30502b;
    }

    public final long u() {
        return this.f30505e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f30501a);
        kg.c.m(parcel, 2, this.f30502b);
        kg.c.m(parcel, 3, this.f30503c);
        kg.c.m(parcel, 4, this.f30504d);
        kg.c.r(parcel, 5, this.f30505e);
        kg.c.b(parcel, iA);
    }
}
