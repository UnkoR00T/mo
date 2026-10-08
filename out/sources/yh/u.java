package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        c cVar = null;
        p pVar = null;
        ArrayList<Integer> arrayListF = null;
        m mVar = null;
        q qVar = null;
        String strH = null;
        byte[] bArrB = null;
        Bundle bundleA = null;
        boolean zO = true;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 2:
                    zO3 = kg.b.o(parcel, iT);
                    break;
                case 3:
                    cVar = (c) kg.b.g(parcel, iT, c.CREATOR);
                    break;
                case 4:
                    zO4 = kg.b.o(parcel, iT);
                    break;
                case 5:
                    pVar = (p) kg.b.g(parcel, iT, p.CREATOR);
                    break;
                case 6:
                    arrayListF = kg.b.f(parcel, iT);
                    break;
                case 7:
                    mVar = (m) kg.b.g(parcel, iT, m.CREATOR);
                    break;
                case 8:
                    qVar = (q) kg.b.g(parcel, iT, q.CREATOR);
                    break;
                case 9:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 10:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 11:
                    bundleA = kg.b.a(parcel, iT);
                    break;
                case 12:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new j(zO2, zO3, cVar, zO4, pVar, arrayListF, mVar, qVar, zO, strH, bArrB, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j[i15];
    }
}
