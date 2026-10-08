package yh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f226811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    UserAddress f226812e;

    private b() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, this.f226808a, false);
        kg.c.u(parcel, 2, this.f226809b, false);
        kg.c.u(parcel, 3, this.f226810c, false);
        kg.c.m(parcel, 4, this.f226811d);
        kg.c.t(parcel, 5, this.f226812e, i15, false);
        kg.c.b(parcel, iA);
    }

    b(String str, String str2, String str3, int i15, UserAddress userAddress) {
        this.f226808a = str;
        this.f226809b = str2;
        this.f226810c = str3;
        this.f226811d = i15;
        this.f226812e = userAddress;
    }
}
