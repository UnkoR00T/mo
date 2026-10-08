package n42;

import p071kotlin.Metadata;
import yr0.BEPaymentDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ln42/q;", "", "", "e", "()Ljava/lang/String;", "paymentId", "", "f", "()Z", "refreshScreen", "a", "Ln42/q$a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface q {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ln42/q$a;", "Ln42/q;", "Lyr0/e;", "getItem", "()Lyr0/e;", "item", "", "a", "()Z", "paymentProcessSucceed", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends q {
        boolean a();

        BEPaymentDetails getItem();
    }

    String e();

    boolean f();
}
