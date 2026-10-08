package xh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        float fR8 = Float.MAX_VALUE;
        float fR9 = Float.MAX_VALUE;
        float fR10 = Float.MAX_VALUE;
        LandmarkParcel[] landmarkParcelArr = null;
        a[] aVarArr = null;
        float fR11 = -1.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = kg.b.v(parcel, iT);
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
                    fR8 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    fR9 = kg.b.r(parcel, iT);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) kg.b.k(parcel, iT, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 11:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 12:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 13:
                    aVarArr = (a[]) kg.b.k(parcel, iT, a.CREATOR);
                    break;
                case 14:
                    fR10 = kg.b.r(parcel, iT);
                    break;
                case 15:
                    fR11 = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new FaceParcel(iV, iV2, fR, fR2, fR3, fR4, fR8, fR9, fR10, landmarkParcelArr, fR5, fR6, fR7, aVarArr, fR11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel[] newArray(int i15) {
        return new FaceParcel[i15];
    }
}
