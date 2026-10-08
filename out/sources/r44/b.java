package r44;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr44/b;", "", "Lr44/b$a;", "Lr44/b$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lr44/b$a;", "Lgz/b$a;", "", "e", "()Ljava/lang/String;", "paymentId", "a", "b", "Lr44/b$a$a;", "Lr44/b$a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends gz.b.a {

        /* JADX INFO: renamed from: r44.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lr44/b$a$a;", "Lr44/b$a;", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Payments implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            public Payments(String str) {
                this.paymentId = str;
            }

            @Override // r44.b.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getPaymentId() {
                return this.paymentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Payments) && t.c(this.paymentId, ((Payments) other).paymentId);
            }

            public int hashCode() {
                return this.paymentId.hashCode();
            }

            public String toString() {
                return "Payments(paymentId=" + this.paymentId + ")";
            }
        }

        /* JADX INFO: renamed from: r44.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"Lr44/b$a$b;", "Lr44/b$a;", "", "paymentId", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Transaction implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String transactionId;

            public Transaction(String str, String str2) {
                this.paymentId = str;
                this.transactionId = str2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getTransactionId() {
                return this.transactionId;
            }

            @Override // r44.b.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getPaymentId() {
                return this.paymentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Transaction)) {
                    return false;
                }
                Transaction transaction = (Transaction) other;
                return t.c(this.paymentId, transaction.paymentId) && t.c(this.transactionId, transaction.transactionId);
            }

            public int hashCode() {
                return (this.paymentId.hashCode() * 31) + this.transactionId.hashCode();
            }

            public String toString() {
                return "Transaction(paymentId=" + this.paymentId + ", transactionId=" + this.transactionId + ")";
            }
        }

        /* JADX INFO: renamed from: e */
        String getPaymentId();
    }

    /* JADX INFO: renamed from: r44.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lr44/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC4371b {
        OK,
        FILE_NOT_SAVED,
        NOT_PERMISSION_GRANTED_GO_TO_SETTINGS,
        NOT_PERMISSION_GRANTED;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f171793f = wq.b.a(b());
    }
}
