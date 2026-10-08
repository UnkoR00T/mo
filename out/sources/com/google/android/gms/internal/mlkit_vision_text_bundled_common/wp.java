package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wp extends kg.a {
    public static final Parcelable.Creator<wp> CREATOR = new xp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f30682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f30685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f30686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f30687g;

    public wp(String str, Rect rect, List list, String str2, float f15, float f16, List list2) {
        this.f30681a = str;
        this.f30682b = rect;
        this.f30683c = list;
        this.f30684d = str2;
        this.f30685e = f15;
        this.f30686f = f16;
        this.f30687g = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30681a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f30682b, i15, false);
        kg.c.y(parcel, 3, this.f30683c, false);
        kg.c.u(parcel, 4, this.f30684d, false);
        kg.c.i(parcel, 5, this.f30685e);
        kg.c.i(parcel, 6, this.f30686f);
        kg.c.y(parcel, 7, this.f30687g, false);
        kg.c.b(parcel, iA);
    }
}
