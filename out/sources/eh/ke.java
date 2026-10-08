package eh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ke implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        Rect rect = null;
        ArrayList arrayListL = null;
        ArrayList arrayListL2 = null;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 4:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 5:
                    fR3 = kg.b.r(parcel, iT);
                    break;
                case 6:
                    fR4 = kg.b.r(parcel, iT);
                    break;
                case 7:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 9:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 10:
                    arrayListL = kg.b.l(parcel, iT, qe.CREATOR);
                    break;
                case 11:
                    arrayListL2 = kg.b.l(parcel, iT, fe.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new je(iV, rect, fR, fR2, fR3, fR4, fR5, fR6, fR7, arrayListL, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new je[i15];
    }
}
