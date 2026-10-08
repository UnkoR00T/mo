package br0;

import dx.i;
import p071kotlin.Metadata;
import sq0.BECreateNationalCourtRegisterSubscriptionRequest;
import sq0.BENationalCourtRegister;
import sq0.BESubscription;
import sq0.c;
import sq0.k;
import tq.e;
import tq0.BEFile;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\r\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lbr0/b;", "", "Ldx/i;", "Ldx/b;", "Lsq0/g;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lsq0/d;", "id", "Ltq0/d;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsq0/b;", "request", "Lsq0/i;", "d", "(Lsq0/b;Ltq/e;)Ljava/lang/Object;", "Lsq0/c;", "Lsq0/k;", "b", "(Lsq0/c;Ltq/e;)Ljava/lang/Object;", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(e<? super i<? extends dx.b, BENationalCourtRegister>> eVar);

    Object b(c cVar, e<? super i<? extends dx.b, k>> eVar);

    Object c(String str, e<? super i<? extends dx.b, BEFile>> eVar);

    Object d(BECreateNationalCourtRegisterSubscriptionRequest bECreateNationalCourtRegisterSubscriptionRequest, e<? super i<? extends dx.b, BESubscription>> eVar);
}
