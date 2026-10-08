package eh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class je extends kg.a {
    public static final Parcelable.Creator<je> CREATOR = new ke();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f50711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f50712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f50713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f50714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f50715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f50716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f50717h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f50718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f50719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f50720l;

    public je(int i15, Rect rect, float f15, float f16, float f17, float f18, float f19, float f25, float f26, List list, List list2) {
        this.f50710a = i15;
        this.f50711b = rect;
        this.f50712c = f15;
        this.f50713d = f16;
        this.f50714e = f17;
        this.f50715f = f18;
        this.f50716g = f19;
        this.f50717h = f25;
        this.f50718j = f26;
        this.f50719k = list;
        this.f50720l = list2;
    }

    public final Rect C() {
        return this.f50711b;
    }

    public final List E() {
        return this.f50720l;
    }

    public final List H() {
        return this.f50719k;
    }

    public final float h() {
        return this.f50715f;
    }

    public final int i() {
        return this.f50710a;
    }

    public final float m() {
        return this.f50713d;
    }

    public final float p() {
        return this.f50716g;
    }

    public final float r() {
        return this.f50712c;
    }

    public final float u() {
        return this.f50717h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50710a);
        kg.c.t(parcel, 2, this.f50711b, i15, false);
        kg.c.i(parcel, 3, this.f50712c);
        kg.c.i(parcel, 4, this.f50713d);
        kg.c.i(parcel, 5, this.f50714e);
        kg.c.i(parcel, 6, this.f50715f);
        kg.c.i(parcel, 7, this.f50716g);
        kg.c.i(parcel, 8, this.f50717h);
        kg.c.i(parcel, 9, this.f50718j);
        kg.c.y(parcel, 10, this.f50719k, false);
        kg.c.y(parcel, 11, this.f50720l, false);
        kg.c.b(parcel, iA);
    }

    public final float y() {
        return this.f50714e;
    }
}
