package v42;

import java.util.List;
import p071kotlin.Metadata;
import x42.PaymentSummary;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lv42/c;", "", "a", "b", "Lv42/c$a;", "Lv42/c$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv42/c$a;", "Lv42/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f203859a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1698962593;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: v42.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b'\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lv42/c$b;", "Lv42/c;", "", "sourcePaymentId", "", "paymentPackageId", "", "Lx42/a;", "paymentSummaries", "institutionId", "Lyr0/a;", "availablePaymentMethods", "institutionName", "", "isInfoAlertVisible", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Lv42/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "e", "Z", "i", "()Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sourcePaymentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long paymentPackageId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentSummary> paymentSummaries;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<yr0.a> availablePaymentMethods;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInfoAlertVisible;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized(String str, Long l15, List<PaymentSummary> list, String str2, List<? extends yr0.a> list2, String str3, boolean z15) {
            this.sourcePaymentId = str;
            this.paymentPackageId = l15;
            this.paymentSummaries = list;
            this.institutionId = str2;
            this.availablePaymentMethods = list2;
            this.institutionName = str3;
            this.isInfoAlertVisible = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, String str, Long l15, List list, String str2, List list2, String str3, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = initialized.sourcePaymentId;
            }
            if ((i15 & 2) != 0) {
                l15 = initialized.paymentPackageId;
            }
            if ((i15 & 4) != 0) {
                list = initialized.paymentSummaries;
            }
            if ((i15 & 8) != 0) {
                str2 = initialized.institutionId;
            }
            if ((i15 & 16) != 0) {
                list2 = initialized.availablePaymentMethods;
            }
            if ((i15 & 32) != 0) {
                str3 = initialized.institutionName;
            }
            if ((i15 & 64) != 0) {
                z15 = initialized.isInfoAlertVisible;
            }
            String str4 = str3;
            boolean z16 = z15;
            List list3 = list2;
            List list4 = list;
            return initialized.a(str, l15, list4, str2, list3, str4, z16);
        }

        public final Initialized a(String sourcePaymentId, Long paymentPackageId, List<PaymentSummary> paymentSummaries, String institutionId, List<? extends yr0.a> availablePaymentMethods, String institutionName, boolean isInfoAlertVisible) {
            return new Initialized(sourcePaymentId, paymentPackageId, paymentSummaries, institutionId, availablePaymentMethods, institutionName, isInfoAlertVisible);
        }

        public final List<yr0.a> c() {
            return this.availablePaymentMethods;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getInstitutionId() {
            return this.institutionId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.sourcePaymentId, initialized.sourcePaymentId) && fr.t.c(this.paymentPackageId, initialized.paymentPackageId) && fr.t.c(this.paymentSummaries, initialized.paymentSummaries) && fr.t.c(this.institutionId, initialized.institutionId) && fr.t.c(this.availablePaymentMethods, initialized.availablePaymentMethods) && fr.t.c(this.institutionName, initialized.institutionName) && this.isInfoAlertVisible == initialized.isInfoAlertVisible;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getPaymentPackageId() {
            return this.paymentPackageId;
        }

        public final List<PaymentSummary> g() {
            return this.paymentSummaries;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSourcePaymentId() {
            return this.sourcePaymentId;
        }

        public int hashCode() {
            int iHashCode = this.sourcePaymentId.hashCode() * 31;
            Long l15 = this.paymentPackageId;
            return ((((((((((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31) + this.paymentSummaries.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.availablePaymentMethods.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + Boolean.hashCode(this.isInfoAlertVisible);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsInfoAlertVisible() {
            return this.isInfoAlertVisible;
        }

        public String toString() {
            return "Initialized(sourcePaymentId=" + this.sourcePaymentId + ", paymentPackageId=" + this.paymentPackageId + ", paymentSummaries=" + this.paymentSummaries + ", institutionId=" + this.institutionId + ", availablePaymentMethods=" + this.availablePaymentMethods + ", institutionName=" + this.institutionName + ", isInfoAlertVisible=" + this.isInfoAlertVisible + ')';
        }
    }
}
