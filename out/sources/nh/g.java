package nh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136273a;

    public g(String str) {
        jg.s.m(str, "json must not be null");
        this.f136273a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        String str = this.f136273a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, str, false);
        kg.c.b(parcel, iA);
    }
}
