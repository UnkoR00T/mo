package eg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.x5;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        x5 x5Var = null;
        byte[] bArrB = null;
        int[] iArrE = null;
        String[] strArrI = null;
        int[] iArrE2 = null;
        byte[][] bArrC = null;
        qh.a[] aVarArr = null;
        boolean zO = true;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    x5Var = (x5) kg.b.g(parcel, iT, x5.CREATOR);
                    break;
                case 3:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 4:
                    iArrE = kg.b.e(parcel, iT);
                    break;
                case 5:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 6:
                    iArrE2 = kg.b.e(parcel, iT);
                    break;
                case 7:
                    bArrC = kg.b.c(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 9:
                    aVarArr = (qh.a[]) kg.b.k(parcel, iT, qh.a.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new f(x5Var, bArrB, iArrE, strArrI, iArrE2, bArrC, zO, aVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i15) {
        return new f[i15];
    }
}
