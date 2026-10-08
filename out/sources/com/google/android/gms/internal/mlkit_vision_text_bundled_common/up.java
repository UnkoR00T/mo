package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class up extends kg.a {
    public static final Parcelable.Creator<up> CREATOR = new vp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f30645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f30648e;

    public up(String str, Rect rect, List list, String str2, List list2) {
        this.f30644a = str;
        this.f30645b = rect;
        this.f30646c = list;
        this.f30647d = str2;
        this.f30648e = list2;
    }

    public final String h() {
        return this.f30644a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30644a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f30645b, i15, false);
        kg.c.y(parcel, 3, this.f30646c, false);
        kg.c.u(parcel, 4, this.f30647d, false);
        kg.c.y(parcel, 5, this.f30648e, false);
        kg.c.b(parcel, iA);
    }
}
