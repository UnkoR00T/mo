package d42;

import e42.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ld42/f;", "", "a", "Ld42/d;", "Ld42/f$a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Ld42/f$a;", "Ld42/f;", "", "Lvr0/p;", "c", "()Ljava/util/List;", "userCards", "Lcb4/i;", "b", "()Lcb4/i;", "dialog", "a", "Ld42/f$a$a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f {

        /* JADX INFO: renamed from: d42.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\u001e\u0010&¨\u0006'"}, d2 = {"Ld42/f$a$a;", "Ld42/f$a;", "Le42/b;", "paymentCardRequiredData", "", "Lvr0/p;", "userCards", "Lu42/a;", "returnResult", "Lcb4/i;", "dialog", "<init>", "(Le42/b;Ljava/util/List;Lu42/a;Lcb4/i;)V", "d", "(Le42/b;Ljava/util/List;Lu42/a;Lcb4/i;)Ld42/f$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le42/b;", "f", "()Le42/b;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lu42/a;", "g", "()Lu42/a;", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displayed implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentCardRequiredData paymentCardRequiredData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<BEUserCard> userCards;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final u42.a returnResult;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Displayed(PaymentCardRequiredData paymentCardRequiredData, List<BEUserCard> list, u42.a aVar, cb4.i iVar) {
                this.paymentCardRequiredData = paymentCardRequiredData;
                this.userCards = list;
                this.returnResult = aVar;
                this.dialog = iVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Displayed e(Displayed displayed, PaymentCardRequiredData paymentCardRequiredData, List list, u42.a aVar, cb4.i iVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    paymentCardRequiredData = displayed.paymentCardRequiredData;
                }
                if ((i15 & 2) != 0) {
                    list = displayed.userCards;
                }
                if ((i15 & 4) != 0) {
                    aVar = displayed.returnResult;
                }
                if ((i15 & 8) != 0) {
                    iVar = displayed.dialog;
                }
                return displayed.d(paymentCardRequiredData, list, aVar, iVar);
            }

            @Override // d42.f.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public cb4.i getDialog() {
                return this.dialog;
            }

            @Override // d42.f.a
            public List<BEUserCard> c() {
                return this.userCards;
            }

            public final Displayed d(PaymentCardRequiredData paymentCardRequiredData, List<BEUserCard> userCards, u42.a returnResult, cb4.i dialog) {
                return new Displayed(paymentCardRequiredData, userCards, returnResult, dialog);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displayed)) {
                    return false;
                }
                Displayed displayed = (Displayed) other;
                return fr.t.c(this.paymentCardRequiredData, displayed.paymentCardRequiredData) && fr.t.c(this.userCards, displayed.userCards) && this.returnResult == displayed.returnResult && fr.t.c(this.dialog, displayed.dialog);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final PaymentCardRequiredData getPaymentCardRequiredData() {
                return this.paymentCardRequiredData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final u42.a getReturnResult() {
                return this.returnResult;
            }

            public int hashCode() {
                int iHashCode = ((this.paymentCardRequiredData.hashCode() * 31) + this.userCards.hashCode()) * 31;
                u42.a aVar = this.returnResult;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                cb4.i iVar = this.dialog;
                return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
            }

            public String toString() {
                return "Displayed(paymentCardRequiredData=" + this.paymentCardRequiredData + ", userCards=" + this.userCards + ", returnResult=" + this.returnResult + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        cb4.i getDialog();

        List<BEUserCard> c();
    }
}
