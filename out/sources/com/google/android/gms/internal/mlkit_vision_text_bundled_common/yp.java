package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yp extends kg.a {
    public static final Parcelable.Creator<yp> CREATOR = new zp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f30710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f30713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f30714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f30715g;

    public yp(String str, Rect rect, List list, String str2, List list2, float f15, float f16) {
        this.f30709a = str;
        this.f30710b = rect;
        this.f30711c = list;
        this.f30712d = str2;
        this.f30713e = list2;
        this.f30714f = f15;
        this.f30715g = f16;
    }

    public final Rect h() {
        return this.f30710b;
    }

    public final String m() {
        return this.f30712d;
    }

    public final String p() {
        return this.f30709a;
    }

    public final List r() {
        return this.f30711c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30709a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f30710b, i15, false);
        kg.c.y(parcel, 3, this.f30711c, false);
        kg.c.u(parcel, 4, this.f30712d, false);
        kg.c.y(parcel, 5, this.f30713e, false);
        kg.c.i(parcel, 6, this.f30714f);
        kg.c.i(parcel, 7, this.f30715g);
        kg.c.b(parcel, iA);
    }
}
