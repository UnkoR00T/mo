package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yk extends kg.a {
    public static final Parcelable.Creator<yk> CREATOR = new zk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f63755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f63756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f63757g;

    public yk(String str, Rect rect, List list, String str2, List list2, float f15, float f16) {
        this.f63751a = str;
        this.f63752b = rect;
        this.f63753c = list;
        this.f63754d = str2;
        this.f63755e = list2;
        this.f63756f = f15;
        this.f63757g = f16;
    }

    public final String c() {
        return this.f63754d;
    }

    public final String d() {
        return this.f63751a;
    }

    public final float h() {
        return this.f63757g;
    }

    public final float m() {
        return this.f63756f;
    }

    public final Rect p() {
        return this.f63752b;
    }

    public final List r() {
        return this.f63753c;
    }

    public final List u() {
        return this.f63755e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63751a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63752b, i15, false);
        kg.c.y(parcel, 3, this.f63753c, false);
        kg.c.u(parcel, 4, this.f63754d, false);
        kg.c.y(parcel, 5, this.f63755e, false);
        kg.c.i(parcel, 6, this.f63756f);
        kg.c.i(parcel, 7, this.f63757g);
        kg.c.b(parcel, iA);
    }
}
