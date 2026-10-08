package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f19764a;

    a() {
        this(new byte[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.f(parcel, 2, this.f19764a, false);
        kg.c.b(parcel, iA);
    }

    public a(byte[] bArr) {
        this.f19764a = bArr;
    }
}
