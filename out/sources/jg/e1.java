package jg;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, gVar.f102475a);
        kg.c.m(parcel, 2, gVar.f102476b);
        kg.c.m(parcel, 3, gVar.f102477c);
        kg.c.u(parcel, 4, gVar.f102478d, false);
        kg.c.l(parcel, 5, gVar.f102479e, false);
        kg.c.x(parcel, 6, gVar.f102480f, i15, false);
        kg.c.d(parcel, 7, gVar.f102481g, false);
        kg.c.t(parcel, 8, gVar.f102482h, i15, false);
        kg.c.x(parcel, 10, gVar.f102483j, i15, false);
        kg.c.x(parcel, 11, gVar.f102484k, i15, false);
        kg.c.c(parcel, 12, gVar.f102485l);
        kg.c.m(parcel, 13, gVar.f102486m);
        kg.c.c(parcel, 14, gVar.f102487n);
        kg.c.u(parcel, 15, gVar.h(), false);
        kg.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Scope[] scopeArr = g.f102473q;
        Bundle bundle = new Bundle();
        gg.c[] cVarArr = g.f102474r;
        gg.c[] cVarArr2 = cVarArr;
        String strH = null;
        IBinder iBinderU = null;
        Account account = null;
        String strH2 = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zO = false;
        int iV4 = 0;
        boolean zO2 = false;
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
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 5:
                    iBinderU = kg.b.u(parcel, iT);
                    break;
                case 6:
                    scopeArr = (Scope[]) kg.b.k(parcel, iT, Scope.CREATOR);
                    break;
                case 7:
                    bundle = kg.b.a(parcel, iT);
                    break;
                case 8:
                    account = (Account) kg.b.g(parcel, iT, Account.CREATOR);
                    break;
                case 9:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 10:
                    cVarArr = (gg.c[]) kg.b.k(parcel, iT, gg.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (gg.c[]) kg.b.k(parcel, iT, gg.c.CREATOR);
                    break;
                case 12:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 13:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 14:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 15:
                    strH2 = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new g(iV, iV2, iV3, strH, iBinderU, scopeArr, bundle, account, cVarArr, cVarArr2, zO, iV4, zO2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g[i15];
    }
}
