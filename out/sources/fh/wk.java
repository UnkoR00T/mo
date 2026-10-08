package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wk extends kg.a {
    public static final Parcelable.Creator<wk> CREATOR = new xk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f63697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f63698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f63699g;

    public wk(String str, Rect rect, List list, String str2, float f15, float f16, List list2) {
        this.f63693a = str;
        this.f63694b = rect;
        this.f63695c = list;
        this.f63696d = str2;
        this.f63697e = f15;
        this.f63698f = f16;
        this.f63699g = list2;
    }

    public final String c() {
        return this.f63696d;
    }

    public final String d() {
        return this.f63693a;
    }

    public final float h() {
        return this.f63698f;
    }

    public final float m() {
        return this.f63697e;
    }

    public final Rect p() {
        return this.f63694b;
    }

    public final List r() {
        return this.f63695c;
    }

    public final List u() {
        return this.f63699g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63693a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63694b, i15, false);
        kg.c.y(parcel, 3, this.f63695c, false);
        kg.c.u(parcel, 4, this.f63696d, false);
        kg.c.i(parcel, 5, this.f63697e);
        kg.c.i(parcel, 6, this.f63698f);
        kg.c.y(parcel, 7, this.f63699g, false);
        kg.c.b(parcel, iA);
    }
}
