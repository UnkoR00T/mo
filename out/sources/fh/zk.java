package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    arrayListL = kg.b.l(parcel, iT, Point.CREATOR);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    arrayListL2 = kg.b.l(parcel, iT, wk.CREATOR);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 7:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new yk(strH, rect, arrayListL, strH2, arrayListL2, fR, fR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new yk[i15];
    }
}
