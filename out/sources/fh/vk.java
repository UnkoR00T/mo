package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 2) {
                rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
            } else if (iN == 3) {
                arrayListL = kg.b.l(parcel, iT, Point.CREATOR);
            } else if (iN == 4) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                arrayListL2 = kg.b.l(parcel, iT, yk.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new tk(strH, rect, arrayListL, strH2, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new tk[i15];
    }
}
