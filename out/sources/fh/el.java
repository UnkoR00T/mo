package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class el extends kg.a {
    public static final Parcelable.Creator<el> CREATOR = new fl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f63026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f63027e;

    public el(String str, Rect rect, List list, float f15, float f16) {
        this.f63023a = str;
        this.f63024b = rect;
        this.f63025c = list;
        this.f63026d = f15;
        this.f63027e = f16;
    }

    public final String c() {
        return this.f63023a;
    }

    public final float h() {
        return this.f63027e;
    }

    public final float m() {
        return this.f63026d;
    }

    public final Rect p() {
        return this.f63024b;
    }

    public final List r() {
        return this.f63025c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63023a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63024b, i15, false);
        kg.c.y(parcel, 3, this.f63025c, false);
        kg.c.i(parcel, 4, this.f63026d);
        kg.c.i(parcel, 5, this.f63027e);
        kg.c.b(parcel, iA);
    }
}
