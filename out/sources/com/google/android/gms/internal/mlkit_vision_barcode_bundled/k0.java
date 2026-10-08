package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        u uVar = null;
        String strH = null;
        String strH2 = null;
        v[] vVarArr = null;
        s[] sVarArr = null;
        String[] strArrI = null;
        n[] nVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    uVar = (u) kg.b.g(parcel, iT, u.CREATOR);
                    break;
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    vVarArr = (v[]) kg.b.k(parcel, iT, v.CREATOR);
                    break;
                case 5:
                    sVarArr = (s[]) kg.b.k(parcel, iT, s.CREATOR);
                    break;
                case 6:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 7:
                    nVarArr = (n[]) kg.b.k(parcel, iT, n.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new q(uVar, strH, strH2, vVarArr, sVarArr, strArrI, nVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q[i15];
    }
}
