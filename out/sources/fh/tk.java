package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tk extends kg.a {
    public static final Parcelable.Creator<tk> CREATOR = new vk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f63549e;

    public tk(String str, Rect rect, List list, String str2, List list2) {
        this.f63545a = str;
        this.f63546b = rect;
        this.f63547c = list;
        this.f63548d = str2;
        this.f63549e = list2;
    }

    public final String a() {
        return this.f63545a;
    }

    public final Rect h() {
        return this.f63546b;
    }

    public final String m() {
        return this.f63548d;
    }

    public final List p() {
        return this.f63547c;
    }

    public final List r() {
        return this.f63549e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63545a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63546b, i15, false);
        kg.c.y(parcel, 3, this.f63547c, false);
        kg.c.u(parcel, 4, this.f63548d, false);
        kg.c.y(parcel, 5, this.f63549e, false);
        kg.c.b(parcel, iA);
    }
}
