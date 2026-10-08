package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class tl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        kl klVar = null;
        nl nlVar = null;
        ol olVar = null;
        rl rlVar = null;
        pl plVar = null;
        ll llVar = null;
        hl hlVar = null;
        il ilVar = null;
        jl jlVar = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 5:
                    pointArr = (Point[]) kg.b.k(parcel, iT, Point.CREATOR);
                    break;
                case 6:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    klVar = (kl) kg.b.g(parcel, iT, kl.CREATOR);
                    break;
                case 8:
                    nlVar = (nl) kg.b.g(parcel, iT, nl.CREATOR);
                    break;
                case 9:
                    olVar = (ol) kg.b.g(parcel, iT, ol.CREATOR);
                    break;
                case 10:
                    rlVar = (rl) kg.b.g(parcel, iT, rl.CREATOR);
                    break;
                case 11:
                    plVar = (pl) kg.b.g(parcel, iT, pl.CREATOR);
                    break;
                case 12:
                    llVar = (ll) kg.b.g(parcel, iT, ll.CREATOR);
                    break;
                case 13:
                    hlVar = (hl) kg.b.g(parcel, iT, hl.CREATOR);
                    break;
                case 14:
                    ilVar = (il) kg.b.g(parcel, iT, il.CREATOR);
                    break;
                case 15:
                    jlVar = (jl) kg.b.g(parcel, iT, jl.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new sl(iV, strH, strH2, bArrB, pointArr, iV2, klVar, nlVar, olVar, rlVar, plVar, llVar, hlVar, ilVar, jlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new sl[i15];
    }
}
