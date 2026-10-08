package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        b bVar = null;
        UserAddress userAddress = null;
        l lVar = null;
        String strH2 = null;
        Bundle bundleA = null;
        String strH3 = null;
        Bundle bundleA2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    bVar = (b) kg.b.g(parcel, iT, b.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) kg.b.g(parcel, iT, UserAddress.CREATOR);
                    break;
                case 4:
                    lVar = (l) kg.b.g(parcel, iT, l.CREATOR);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    bundleA = kg.b.a(parcel, iT);
                    break;
                case 7:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    bundleA2 = kg.b.a(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new i(strH, bVar, userAddress, lVar, strH2, bundleA, strH3, bundleA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}
