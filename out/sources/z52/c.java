package z52;

import as0.BETransactionDetailsDomain;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lz52/c;", "", "a", "b", "Lz52/c$a;", "Lz52/c$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz52/c$a;", "Lz52/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f232953a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1286803341;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: z52.c$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lz52/c$b;", "Lz52/c;", "Las0/c;", "transactionDetails", "", "paymentId", "Lcb4/i;", "dialog", "<init>", "(Las0/c;Ljava/lang/String;Lcb4/i;)V", "a", "(Las0/c;Ljava/lang/String;Lcb4/i;)Lz52/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Las0/c;", "e", "()Las0/c;", "b", "Ljava/lang/String;", "d", "c", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BETransactionDetailsDomain transactionDetails;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialog;

        public Initialized(BETransactionDetailsDomain bETransactionDetailsDomain, String str, cb4.i iVar) {
            this.transactionDetails = bETransactionDetailsDomain;
            this.paymentId = str;
            this.dialog = iVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, BETransactionDetailsDomain bETransactionDetailsDomain, String str, cb4.i iVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bETransactionDetailsDomain = initialized.transactionDetails;
            }
            if ((i15 & 2) != 0) {
                str = initialized.paymentId;
            }
            if ((i15 & 4) != 0) {
                iVar = initialized.dialog;
            }
            return initialized.a(bETransactionDetailsDomain, str, iVar);
        }

        public final Initialized a(BETransactionDetailsDomain transactionDetails, String paymentId, cb4.i dialog) {
            return new Initialized(transactionDetails, paymentId, dialog);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialog() {
            return this.dialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BETransactionDetailsDomain getTransactionDetails() {
            return this.transactionDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.transactionDetails, initialized.transactionDetails) && fr.t.c(this.paymentId, initialized.paymentId) && fr.t.c(this.dialog, initialized.dialog);
        }

        public int hashCode() {
            int iHashCode = ((this.transactionDetails.hashCode() * 31) + this.paymentId.hashCode()) * 31;
            cb4.i iVar = this.dialog;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "Initialized(transactionDetails=" + this.transactionDetails + ", paymentId=" + this.paymentId + ", dialog=" + this.dialog + ')';
        }
    }
}
