package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class dq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        int iV = 0;
        boolean zO2 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 5:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 6:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new cq(strH, strH2, strH3, zO, iV, strH4, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new cq[i15];
    }
}
