package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class gh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        int iV2 = 0;
        int iV3 = 0;
        jk[] jkVarArr = null;
        ce ceVar = null;
        ce ceVar2 = null;
        ce ceVar3 = null;
        String strH = null;
        String strH2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    jkVarArr = (jk[]) kg.b.k(parcel, iT, jk.CREATOR);
                    break;
                case 3:
                    ceVar = (ce) kg.b.g(parcel, iT, ce.CREATOR);
                    break;
                case 4:
                    ceVar2 = (ce) kg.b.g(parcel, iT, ce.CREATOR);
                    break;
                case 5:
                    ceVar3 = (ce) kg.b.g(parcel, iT, ce.CREATOR);
                    break;
                case 6:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 7:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 8:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 10:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 11:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 12:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new fg(jkVarArr, ceVar, ceVar2, ceVar3, strH, fR, strH2, iV, zO, iV2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new fg[i15];
    }
}
