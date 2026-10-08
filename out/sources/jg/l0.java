package jg;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends kg.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f102521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f102522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f102524d;

    l0(int i15, Account account, int i16, GoogleSignInAccount googleSignInAccount) {
        this.f102521a = i15;
        this.f102522b = account;
        this.f102523c = i16;
        this.f102524d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f102521a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.t(parcel, 2, this.f102522b, i15, false);
        kg.c.m(parcel, 3, this.f102523c);
        kg.c.t(parcel, 4, this.f102524d, i15, false);
        kg.c.b(parcel, iA);
    }

    public l0(Account account, int i15, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i15, googleSignInAccount);
    }
}
