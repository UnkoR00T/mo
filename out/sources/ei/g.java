package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51545b;

    g() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51544a, false);
        kg.c.u(parcel, 3, this.f51545b, false);
        kg.c.b(parcel, iA);
    }

    public g(String str, String str2) {
        this.f51544a = str;
        this.f51545b = str2;
    }
}
