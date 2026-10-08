package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends kg.a {
    public static final Parcelable.Creator<h> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f51548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    g f51549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    g f51550e;

    h(String str, String str2, f fVar, g gVar, g gVar2) {
        this.f51546a = str;
        this.f51547b = str2;
        this.f51548c = fVar;
        this.f51549d = gVar;
        this.f51550e = gVar2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51546a, false);
        kg.c.u(parcel, 3, this.f51547b, false);
        kg.c.t(parcel, 4, this.f51548c, i15, false);
        kg.c.t(parcel, 5, this.f51549d, i15, false);
        kg.c.t(parcel, 6, this.f51550e, i15, false);
        kg.c.b(parcel, iA);
    }
}
