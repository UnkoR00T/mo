package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f51532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    f f51533c;

    c() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51531a, false);
        kg.c.t(parcel, 3, this.f51532b, i15, false);
        kg.c.t(parcel, 5, this.f51533c, i15, false);
        kg.c.b(parcel, iA);
    }

    c(String str, d dVar, f fVar) {
        this.f51531a = str;
        this.f51532b = dVar;
        this.f51533c = fVar;
    }
}
