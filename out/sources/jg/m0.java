package jg;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Account account = null;
        int iV = 0;
        int iV2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                account = (Account) kg.b.g(parcel, iT, Account.CREATOR);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                googleSignInAccount = (GoogleSignInAccount) kg.b.g(parcel, iT, GoogleSignInAccount.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new l0(iV, account, iV2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l0[i15];
    }
}
