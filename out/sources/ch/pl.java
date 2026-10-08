package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pl extends kg.a {
    public static final Parcelable.Creator<pl> CREATOR = new jm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26269b;

    public pl(String str, String str2) {
        this.f26268a = str;
        this.f26269b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26268a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26269b, false);
        kg.c.b(parcel, iA);
    }
}
