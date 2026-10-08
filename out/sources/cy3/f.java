package cy3;

import dy3.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcy3/f;", "", "a", "Lcy3/d;", "Lcy3/f$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcy3/f$a;", "Lcy3/f;", "", "Lvr0/p;", "c", "()Ljava/util/List;", "userCards", "a", "Lcy3/f$a$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f {

        /* JADX INFO: renamed from: cy3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcy3/f$a$a;", "Lcy3/f$a;", "Ldy3/c;", "paymentCardRequiredData", "", "Lvr0/p;", "userCards", "Ldy3/a;", "returnResult", "<init>", "(Ldy3/c;Ljava/util/List;Ldy3/a;)V", "b", "(Ldy3/c;Ljava/util/List;Ldy3/a;)Lcy3/f$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldy3/c;", "e", "()Ldy3/c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ldy3/a;", "f", "()Ldy3/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displayed implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentCardRequiredData paymentCardRequiredData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<BEUserCard> userCards;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final dy3.a returnResult;

            public Displayed(PaymentCardRequiredData paymentCardRequiredData, List<BEUserCard> list, dy3.a aVar) {
                this.paymentCardRequiredData = paymentCardRequiredData;
                this.userCards = list;
                this.returnResult = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Displayed d(Displayed displayed, PaymentCardRequiredData paymentCardRequiredData, List list, dy3.a aVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    paymentCardRequiredData = displayed.paymentCardRequiredData;
                }
                if ((i15 & 2) != 0) {
                    list = displayed.userCards;
                }
                if ((i15 & 4) != 0) {
                    aVar = displayed.returnResult;
                }
                return displayed.b(paymentCardRequiredData, list, aVar);
            }

            public final Displayed b(PaymentCardRequiredData paymentCardRequiredData, List<BEUserCard> userCards, dy3.a returnResult) {
                return new Displayed(paymentCardRequiredData, userCards, returnResult);
            }

            @Override // cy3.f.a
            public List<BEUserCard> c() {
                return this.userCards;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PaymentCardRequiredData getPaymentCardRequiredData() {
                return this.paymentCardRequiredData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displayed)) {
                    return false;
                }
                Displayed displayed = (Displayed) other;
                return fr.t.c(this.paymentCardRequiredData, displayed.paymentCardRequiredData) && fr.t.c(this.userCards, displayed.userCards) && this.returnResult == displayed.returnResult;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final dy3.a getReturnResult() {
                return this.returnResult;
            }

            public int hashCode() {
                int iHashCode = ((this.paymentCardRequiredData.hashCode() * 31) + this.userCards.hashCode()) * 31;
                dy3.a aVar = this.returnResult;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public String toString() {
                return "Displayed(paymentCardRequiredData=" + this.paymentCardRequiredData + ", userCards=" + this.userCards + ", returnResult=" + this.returnResult + ')';
            }
        }

        List<BEUserCard> c();
    }
}
