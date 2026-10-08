package c62;

import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import mx.Label;
import p071kotlin.Metadata;
import v60.PaymentStatusCardData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lc62/a;", "", "<init>", "()V", "a", "b", "Lc62/a$a;", "Lc62/a$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: c62.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc62/a$a;", "Lc62/a;", "Lmx/a;", "createdAt", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateSeparator extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label createdAt;

        public DateSeparator(Label label) {
            super(null);
            this.createdAt = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getCreatedAt() {
            return this.createdAt;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DateSeparator) && t.c(this.createdAt, ((DateSeparator) other).createdAt);
        }

        public int hashCode() {
            return this.createdAt.hashCode();
        }

        public String toString() {
            return "DateSeparator(createdAt=" + this.createdAt + ')';
        }
    }

    /* JADX INFO: renamed from: c62.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc62/a$b;", "Lc62/a;", "Lv60/a;", "cardData", "Ljava/time/OffsetDateTime;", "createdAt", "<init>", "(Lv60/a;Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv60/a;", "()Lv60/a;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionCard extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentStatusCardData cardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime createdAt;

        public TransactionCard(PaymentStatusCardData paymentStatusCardData, OffsetDateTime offsetDateTime) {
            super(null);
            this.cardData = paymentStatusCardData;
            this.createdAt = offsetDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentStatusCardData getCardData() {
            return this.cardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getCreatedAt() {
            return this.createdAt;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionCard)) {
                return false;
            }
            TransactionCard transactionCard = (TransactionCard) other;
            return t.c(this.cardData, transactionCard.cardData) && t.c(this.createdAt, transactionCard.createdAt);
        }

        public int hashCode() {
            return (this.cardData.hashCode() * 31) + this.createdAt.hashCode();
        }

        public String toString() {
            return "TransactionCard(cardData=" + this.cardData + ", createdAt=" + this.createdAt + ')';
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
