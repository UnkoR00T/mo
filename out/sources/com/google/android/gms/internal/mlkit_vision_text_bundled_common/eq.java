package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eq extends kg.a {
    public static final Parcelable.Creator<eq> CREATOR = new fq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f30408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f30410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f30411e;

    public eq(String str, Rect rect, List list, float f15, float f16) {
        this.f30407a = str;
        this.f30408b = rect;
        this.f30409c = list;
        this.f30410d = f15;
        this.f30411e = f16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30407a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f30408b, i15, false);
        kg.c.y(parcel, 3, this.f30409c, false);
        kg.c.i(parcel, 4, this.f30410d);
        kg.c.i(parcel, 5, this.f30411e);
        kg.c.b(parcel, iA);
    }
}
