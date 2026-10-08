package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends kg.a {
    public static final Parcelable.Creator<e> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51541b;

    public e(String str, String str2) {
        this.f51540a = str;
        this.f51541b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51540a, false);
        kg.c.u(parcel, 3, this.f51541b, false);
        kg.c.b(parcel, iA);
    }
}
