package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends kg.a {
    public static final Parcelable.Creator<m> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f226887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Bundle f226888b;

    private m() {
        this.f226888b = new Bundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f226887a);
        kg.c.d(parcel, 3, this.f226888b, false);
        kg.c.b(parcel, iA);
    }

    m(int i15, Bundle bundle) {
        new Bundle();
        this.f226887a = i15;
        this.f226888b = bundle;
    }
}
