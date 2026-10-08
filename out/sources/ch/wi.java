package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class wi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        double dQ = 0.0d;
        int iV = 0;
        int iV2 = 0;
        boolean zO = false;
        String strH = null;
        String strH2 = null;
        Point[] pointArr = null;
        ra raVar = null;
        ud udVar = null;
        ve veVar = null;
        yg ygVar = null;
        xf xfVar = null;
        sb sbVar = null;
        o7 o7Var = null;
        p8 p8Var = null;
        q9 q9Var = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 6:
                    pointArr = (Point[]) kg.b.k(parcel, iT, Point.CREATOR);
                    break;
                case 7:
                    raVar = (ra) kg.b.g(parcel, iT, ra.CREATOR);
                    break;
                case 8:
                    udVar = (ud) kg.b.g(parcel, iT, ud.CREATOR);
                    break;
                case 9:
                    veVar = (ve) kg.b.g(parcel, iT, ve.CREATOR);
                    break;
                case 10:
                    ygVar = (yg) kg.b.g(parcel, iT, yg.CREATOR);
                    break;
                case 11:
                    xfVar = (xf) kg.b.g(parcel, iT, xf.CREATOR);
                    break;
                case 12:
                    sbVar = (sb) kg.b.g(parcel, iT, sb.CREATOR);
                    break;
                case 13:
                    o7Var = (o7) kg.b.g(parcel, iT, o7.CREATOR);
                    break;
                case 14:
                    p8Var = (p8) kg.b.g(parcel, iT, p8.CREATOR);
                    break;
                case 15:
                    q9Var = (q9) kg.b.g(parcel, iT, q9.CREATOR);
                    break;
                case 16:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 17:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 18:
                    dQ = kg.b.q(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new zh(iV, strH, strH2, iV2, pointArr, raVar, udVar, veVar, ygVar, xfVar, sbVar, o7Var, p8Var, q9Var, bArrB, zO, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new zh[i15];
    }
}
