package yh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayListC = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC2 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC3 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListL = arrayListC;
        ArrayList arrayListL2 = arrayListC2;
        ArrayList arrayListL3 = arrayListC3;
        ArrayList arrayListC4 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC5 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC6 = com.google.android.gms.common.util.b.c();
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        ei.f fVar = null;
        String strH11 = null;
        String strH12 = null;
        ei.c cVar = null;
        int iV = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 11:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                case 12:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 13:
                    arrayListL = kg.b.l(parcel, iT, ei.h.CREATOR);
                    break;
                case 14:
                    fVar = (ei.f) kg.b.g(parcel, iT, ei.f.CREATOR);
                    break;
                case 15:
                    arrayListL2 = kg.b.l(parcel, iT, LatLng.CREATOR);
                    break;
                case 16:
                    strH11 = kg.b.h(parcel, iT);
                    break;
                case 17:
                    strH12 = kg.b.h(parcel, iT);
                    break;
                case 18:
                    arrayListL3 = kg.b.l(parcel, iT, ei.b.CREATOR);
                    break;
                case 19:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 20:
                    arrayListC4 = kg.b.l(parcel, iT, ei.g.CREATOR);
                    break;
                case 21:
                    arrayListC5 = kg.b.l(parcel, iT, ei.e.CREATOR);
                    break;
                case 22:
                    arrayListC6 = kg.b.l(parcel, iT, ei.g.CREATOR);
                    break;
                case 23:
                    cVar = (ei.c) kg.b.g(parcel, iT, ei.c.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new f(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, iV, arrayListL, fVar, arrayListL2, strH11, strH12, arrayListL3, zO, arrayListC4, arrayListC5, arrayListC6, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f[i15];
    }
}
