package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f19766a;

    public c(byte[] bArr) {
        this.f19766a = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        byte[] bArr = this.f19766a;
        int iA = kg.c.a(parcel);
        kg.c.f(parcel, 1, bArr, false);
        kg.c.b(parcel, iA);
    }
}
