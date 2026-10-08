package di;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WebPaymentData;
import yh.i;
import yh.k;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {
    void A2(Status status, yh.h hVar, Bundle bundle);

    void B2(int i15, FullWallet fullWallet, Bundle bundle);

    void E(int i15, boolean z15, Bundle bundle);

    void I2(int i15, MaskedWallet maskedWallet, Bundle bundle);

    void N2(Status status, WebPaymentData webPaymentData, Bundle bundle);

    void R0(Status status, ci.a aVar, Bundle bundle);

    void R2(Status status, bi.b bVar, Bundle bundle);

    void T1(Status status, bi.c cVar, Bundle bundle);

    void U1(Status status, zh.a aVar, Bundle bundle);

    void V0(int i15, boolean z15, Bundle bundle);

    void W1(Status status, k kVar, Bundle bundle);

    void W2(Status status, Bundle bundle);

    void Z1(Status status, bi.d dVar, Bundle bundle);

    void e1(int i15, Bundle bundle);

    void e2(int i15, Bundle bundle);

    void f0(Status status, Bundle bundle);

    void q1(Status status, Bundle bundle);

    void s2(Status status, i iVar, Bundle bundle);

    void u0(Status status, boolean z15, Bundle bundle);

    void u2(Status status, bi.a aVar, Bundle bundle);
}
