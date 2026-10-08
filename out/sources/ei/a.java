package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51527b;

    public a(String str, String str2) {
        this.f51526a = str;
        this.f51527b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51526a, false);
        kg.c.u(parcel, 3, this.f51527b, false);
        kg.c.b(parcel, iA);
    }
}
