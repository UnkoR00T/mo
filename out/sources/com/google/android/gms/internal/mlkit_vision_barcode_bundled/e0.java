package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends kg.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f29701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f29702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29703c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29704d;

    public e0(v0 v0Var, x0 x0Var, boolean z15, boolean z16) {
        this.f29701a = v0Var;
        this.f29702b = x0Var;
        this.f29704d = z16;
    }

    public final v0 h() {
        return this.f29701a;
    }

    public final boolean m() {
        return this.f29704d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f29701a, i15, false);
        kg.c.t(parcel, 2, this.f29702b, i15, false);
        kg.c.c(parcel, 3, this.f29703c);
        kg.c.c(parcel, 4, this.f29704d);
        kg.c.b(parcel, iA);
    }
}
