package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends kg.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f235089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f235090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f235091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PendingIntent f235092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f235093e;

    k0(int i15, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f235089a = i15;
        this.f235090b = iBinder;
        this.f235091c = iBinder2;
        this.f235092d = pendingIntent;
        this.f235093e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, kh.u] */
    public static k0 h(IInterface iInterface, kh.u uVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new k0(2, iInterface, uVar, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k0 m(q1 q1Var) {
        return new k0(4, null, q1Var, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f235089a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.l(parcel, 2, this.f235090b, false);
        kg.c.l(parcel, 3, this.f235091c, false);
        kg.c.t(parcel, 4, this.f235092d, i15, false);
        kg.c.u(parcel, 6, this.f235093e, false);
        kg.c.b(parcel, iA);
    }
}
