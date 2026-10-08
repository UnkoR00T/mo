package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends kg.a {
    public static final Parcelable.Creator<k> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f226884a;

    k(String str) {
        this.f226884a = (String) jg.s.m(str, "responseJson cannot be null!");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        String str = this.f226884a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.b(parcel, iA);
    }
}
