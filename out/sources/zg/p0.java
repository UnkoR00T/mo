package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        m0 m0Var = null;
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderU3 = null;
        String strH = null;
        int iV = 1;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    m0Var = (m0) kg.b.g(parcel, iT, m0.CREATOR);
                    break;
                case 3:
                    iBinderU = kg.b.u(parcel, iT);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderU2 = kg.b.u(parcel, iT);
                    break;
                case 6:
                    iBinderU3 = kg.b.u(parcel, iT);
                    break;
                case 7:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 8:
                    strH = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new o0(iV, m0Var, iBinderU, iBinderU2, pendingIntent, iBinderU3, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o0[i15];
    }
}
