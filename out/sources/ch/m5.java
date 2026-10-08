package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 extends kg.a {
    public static final Parcelable.Creator<m5> CREATOR = new l4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f26152b;

    public m5() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26151a);
        kg.c.v(parcel, 3, this.f26152b, false);
        kg.c.b(parcel, iA);
    }

    public m5(int i15, String[] strArr) {
        this.f26151a = i15;
        this.f26152b = strArr;
    }
}
