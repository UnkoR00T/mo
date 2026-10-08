package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        gl glVar = null;
        gl glVar2 = null;
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
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    glVar = (gl) kg.b.g(parcel, iT, gl.CREATOR);
                    break;
                case 7:
                    glVar2 = (gl) kg.b.g(parcel, iT, gl.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new hl(strH, strH2, strH3, strH4, strH5, glVar, glVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new hl[i15];
    }
}
