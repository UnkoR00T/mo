package di;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WebPaymentData;
import yh.i;
import yh.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends jh.b implements b {
    public e() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // jh.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        switch (i15) {
            case 1:
                int i17 = parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) jh.c.b(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                I2(i17, maskedWallet, bundle);
                return true;
            case 2:
                int i18 = parcel.readInt();
                FullWallet fullWallet = (FullWallet) jh.c.b(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                B2(i18, fullWallet, bundle2);
                return true;
            case 3:
                int i19 = parcel.readInt();
                boolean zA = jh.c.a(parcel);
                Bundle bundle3 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                V0(i19, zA, bundle3);
                return true;
            case 4:
                int i25 = parcel.readInt();
                Bundle bundle4 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                e2(i25, bundle4);
                return true;
            case 5:
            default:
                return false;
            case 6:
                int i26 = parcel.readInt();
                boolean zA2 = jh.c.a(parcel);
                Bundle bundle5 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                E(i26, zA2, bundle5);
                return true;
            case 7:
                Status status = (Status) jh.c.b(parcel, Status.CREATOR);
                bi.a aVar = (bi.a) jh.c.b(parcel, bi.a.CREATOR);
                Bundle bundle6 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                u2(status, aVar, bundle6);
                return true;
            case 8:
                Status status2 = (Status) jh.c.b(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                f0(status2, bundle7);
                return true;
            case 9:
                Status status3 = (Status) jh.c.b(parcel, Status.CREATOR);
                boolean zA3 = jh.c.a(parcel);
                Bundle bundle8 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                u0(status3, zA3, bundle8);
                return true;
            case 10:
                Status status4 = (Status) jh.c.b(parcel, Status.CREATOR);
                bi.b bVar = (bi.b) jh.c.b(parcel, bi.b.CREATOR);
                Bundle bundle9 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                R2(status4, bVar, bundle9);
                return true;
            case 11:
                Status status5 = (Status) jh.c.b(parcel, Status.CREATOR);
                Bundle bundle10 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                W2(status5, bundle10);
                return true;
            case 12:
                Status status6 = (Status) jh.c.b(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) jh.c.b(parcel, WebPaymentData.CREATOR);
                Bundle bundle11 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                N2(status6, webPaymentData, bundle11);
                return true;
            case 13:
                Status status7 = (Status) jh.c.b(parcel, Status.CREATOR);
                Bundle bundle12 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                q1(status7, bundle12);
                return true;
            case 14:
                Status status8 = (Status) jh.c.b(parcel, Status.CREATOR);
                i iVar = (i) jh.c.b(parcel, i.CREATOR);
                Bundle bundle13 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                s2(status8, iVar, bundle13);
                return true;
            case 15:
                Status status9 = (Status) jh.c.b(parcel, Status.CREATOR);
                ci.a aVar2 = (ci.a) jh.c.b(parcel, ci.a.CREATOR);
                Bundle bundle14 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                R0(status9, aVar2, bundle14);
                return true;
            case 16:
                Status status10 = (Status) jh.c.b(parcel, Status.CREATOR);
                bi.c cVar = (bi.c) jh.c.b(parcel, bi.c.CREATOR);
                Bundle bundle15 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                T1(status10, cVar, bundle15);
                return true;
            case 17:
                Status status11 = (Status) jh.c.b(parcel, Status.CREATOR);
                bi.d dVar = (bi.d) jh.c.b(parcel, bi.d.CREATOR);
                Bundle bundle16 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                Z1(status11, dVar, bundle16);
                return true;
            case 18:
                int i27 = parcel.readInt();
                Bundle bundle17 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                e1(i27, bundle17);
                return true;
            case 19:
                Status status12 = (Status) jh.c.b(parcel, Status.CREATOR);
                yh.h hVar = (yh.h) jh.c.b(parcel, yh.h.CREATOR);
                Bundle bundle18 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                A2(status12, hVar, bundle18);
                return true;
            case 20:
                Status status13 = (Status) jh.c.b(parcel, Status.CREATOR);
                zh.a aVar3 = (zh.a) jh.c.b(parcel, zh.a.CREATOR);
                Bundle bundle19 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                U1(status13, aVar3, bundle19);
                return true;
            case 21:
                Status status14 = (Status) jh.c.b(parcel, Status.CREATOR);
                k kVar = (k) jh.c.b(parcel, k.CREATOR);
                Bundle bundle20 = (Bundle) jh.c.b(parcel, Bundle.CREATOR);
                jh.c.e(parcel);
                W1(status14, kVar, bundle20);
                return true;
        }
    }
}
