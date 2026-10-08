package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        hi[] hiVarArr = null;
        ce ceVar = null;
        ce ceVar2 = null;
        String strH = null;
        String strH2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    hiVarArr = (hi[]) kg.b.k(parcel, iT, hi.CREATOR);
                    break;
                case 3:
                    ceVar = (ce) kg.b.g(parcel, iT, ce.CREATOR);
                    break;
                case 4:
                    ceVar2 = (ce) kg.b.g(parcel, iT, ce.CREATOR);
                    break;
                case 5:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 7:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new jk(hiVarArr, ceVar, ceVar2, strH, fR, strH2, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new jk[i15];
    }
}
