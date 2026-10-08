package ei;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    String f51528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    String f51529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f51530c;

    b(String str, String str2, ArrayList arrayList) {
        this.f51528a = str;
        this.f51529b = str2;
        this.f51530c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51528a, false);
        kg.c.u(parcel, 3, this.f51529b, false);
        kg.c.y(parcel, 4, this.f51530c, false);
        kg.c.b(parcel, iA);
    }
}
