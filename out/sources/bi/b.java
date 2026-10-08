package bi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f19765a;

    b() {
        this(new byte[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.f(parcel, 2, this.f19765a, false);
        kg.c.b(parcel, iA);
    }

    public b(byte[] bArr) {
        this.f19765a = bArr;
    }
}
