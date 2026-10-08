package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0 extends kg.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f235099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f235100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh.x f235101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kh.u f235102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f235103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k1 f235104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f235105g;

    o0(int i15, m0 m0Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f235099a = i15;
        this.f235100b = m0Var;
        k1 i1Var = null;
        this.f235101c = iBinder != null ? kh.w.m3(iBinder) : null;
        this.f235103e = pendingIntent;
        this.f235102d = iBinder2 != null ? kh.t.m3(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            i1Var = iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(iBinder3);
        }
        this.f235104f = i1Var;
        this.f235105g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f235099a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.t(parcel, 2, this.f235100b, i15, false);
        kh.x xVar = this.f235101c;
        kg.c.l(parcel, 3, xVar == null ? null : xVar.asBinder(), false);
        kg.c.t(parcel, 4, this.f235103e, i15, false);
        kh.u uVar = this.f235102d;
        kg.c.l(parcel, 5, uVar == null ? null : uVar.asBinder(), false);
        k1 k1Var = this.f235104f;
        kg.c.l(parcel, 6, k1Var != null ? k1Var.asBinder() : null, false);
        kg.c.u(parcel, 8, this.f235105g, false);
        kg.c.b(parcel, iA);
    }
}
