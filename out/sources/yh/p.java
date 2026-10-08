package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends kg.a {
    public static final Parcelable.Creator<p> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f226893a;

    private p() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.w(parcel, 1, this.f226893a, false);
        kg.c.b(parcel, iA);
    }

    p(ArrayList arrayList) {
        this.f226893a = arrayList;
    }
}
