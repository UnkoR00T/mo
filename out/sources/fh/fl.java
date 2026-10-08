package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
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
                fR = kg.b.r(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                fR2 = kg.b.r(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new el(strH, rect, arrayListL, fR, fR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new el[i15];
    }
}
