package ey3;

import dy3.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ley3/c;", "", "a", "b", "Ley3/c$a;", "Ley3/c$b;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ley3/c$a;", "Ley3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54279a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1499340451;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: ey3.c$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Ley3/c$b;", "Ley3/c;", "Ldy3/c;", "dataFromPaymentsCards", "", "Lvr0/p;", "sourceCards", "currentCards", "<init>", "(Ldy3/c;Ljava/util/List;Ljava/util/List;)V", "a", "(Ldy3/c;Ljava/util/List;Ljava/util/List;)Ley3/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldy3/c;", "d", "()Ldy3/c;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentCardRequiredData dataFromPaymentsCards;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUserCard> sourceCards;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUserCard> currentCards;

        public Initialized(PaymentCardRequiredData paymentCardRequiredData, List<BEUserCard> list, List<BEUserCard> list2) {
            this.dataFromPaymentsCards = paymentCardRequiredData;
            this.sourceCards = list;
            this.currentCards = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, PaymentCardRequiredData paymentCardRequiredData, List list, List list2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                paymentCardRequiredData = initialized.dataFromPaymentsCards;
            }
            if ((i15 & 2) != 0) {
                list = initialized.sourceCards;
            }
            if ((i15 & 4) != 0) {
                list2 = initialized.currentCards;
            }
            return initialized.a(paymentCardRequiredData, list, list2);
        }

        public final Initialized a(PaymentCardRequiredData dataFromPaymentsCards, List<BEUserCard> sourceCards, List<BEUserCard> currentCards) {
            return new Initialized(dataFromPaymentsCards, sourceCards, currentCards);
        }

        public final List<BEUserCard> c() {
            return this.currentCards;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PaymentCardRequiredData getDataFromPaymentsCards() {
            return this.dataFromPaymentsCards;
        }

        public final List<BEUserCard> e() {
            return this.sourceCards;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.dataFromPaymentsCards, initialized.dataFromPaymentsCards) && fr.t.c(this.sourceCards, initialized.sourceCards) && fr.t.c(this.currentCards, initialized.currentCards);
        }

        public int hashCode() {
            return (((this.dataFromPaymentsCards.hashCode() * 31) + this.sourceCards.hashCode()) * 31) + this.currentCards.hashCode();
        }

        public String toString() {
            return "Initialized(dataFromPaymentsCards=" + this.dataFromPaymentsCards + ", sourceCards=" + this.sourceCards + ", currentCards=" + this.currentCards + ')';
        }
    }
}
