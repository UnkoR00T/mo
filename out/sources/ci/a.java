package ci;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String[] f27144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f27145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RemoteViews f27146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f27147d;

    private a() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.v(parcel, 1, this.f27144a, false);
        c.n(parcel, 2, this.f27145b, false);
        c.t(parcel, 3, this.f27146c, i15, false);
        c.f(parcel, 4, this.f27147d, false);
        c.b(parcel, iA);
    }

    public a(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f27144a = strArr;
        this.f27145b = iArr;
        this.f27146c = remoteViews;
        this.f27147d = bArr;
    }
}
