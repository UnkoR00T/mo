package d42;

import p071kotlin.Metadata;
import u42.PaymentCardsNavParams;

/* JADX INFO: renamed from: d42.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ld42/d;", "Ld42/f;", "Lu42/c;", "paymentCardsNavParams", "<init>", "(Lu42/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu42/c;", "getPaymentCardsNavParams", "()Lu42/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Init implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCardsNavParams paymentCardsNavParams;

    public Init(PaymentCardsNavParams paymentCardsNavParams) {
        this.paymentCardsNavParams = paymentCardsNavParams;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Init) && fr.t.c(this.paymentCardsNavParams, ((Init) other).paymentCardsNavParams);
    }

    public int hashCode() {
        return this.paymentCardsNavParams.hashCode();
    }

    public String toString() {
        return "Init(paymentCardsNavParams=" + this.paymentCardsNavParams + ')';
    }
}
