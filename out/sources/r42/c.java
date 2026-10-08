package r42;

import java.util.List;
import p071kotlin.Metadata;
import t42.InstallmentWithCheck;
import t42.InstallmentsPaymentData;
import yr0.BEPaymentPackage;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr42/c;", "", "a", "b", "Lr42/c$a;", "Lr42/c$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: r42.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr42/c$a;", "Lr42/c;", "Lt42/b;", "installmentsPaymentData", "<init>", "(Lt42/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt42/b;", "getInstallmentsPaymentData", "()Lt42/b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstallmentsPaymentData installmentsPaymentData;

        public Initial(InstallmentsPaymentData installmentsPaymentData) {
            this.installmentsPaymentData = installmentsPaymentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.installmentsPaymentData, ((Initial) other).installmentsPaymentData);
        }

        public int hashCode() {
            return this.installmentsPaymentData.hashCode();
        }

        public String toString() {
            return "Initial(installmentsPaymentData=" + this.installmentsPaymentData + ')';
        }
    }

    /* JADX INFO: renamed from: r42.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\u0004\b\u0011\u0010\u0012Jl\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b/\u0010\u0016R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b$\u0010*¨\u00060"}, d2 = {"Lr42/c$b;", "Lr42/c;", "", "sourcePaymentId", "", "paymentPackageId", "Lyr0/i;", "paymentPackage", "", "Lt42/a;", "installmentsWithChecks", "", "isInfoAlertVisible", "institutionId", "institutionName", "Lyr0/a;", "availablePaymentMethods", "<init>", "(Ljava/lang/String;JLyr0/i;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;JLyr0/i;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lr42/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "J", "g", "()J", "c", "Lyr0/i;", "getPaymentPackage", "()Lyr0/i;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Z", "i", "()Z", "f", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sourcePaymentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long paymentPackageId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPaymentPackage paymentPackage;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<InstallmentWithCheck> installmentsWithChecks;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInfoAlertVisible;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<yr0.a> availablePaymentMethods;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized(String str, long j15, BEPaymentPackage bEPaymentPackage, List<InstallmentWithCheck> list, boolean z15, String str2, String str3, List<? extends yr0.a> list2) {
            this.sourcePaymentId = str;
            this.paymentPackageId = j15;
            this.paymentPackage = bEPaymentPackage;
            this.installmentsWithChecks = list;
            this.isInfoAlertVisible = z15;
            this.institutionId = str2;
            this.institutionName = str3;
            this.availablePaymentMethods = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, String str, long j15, BEPaymentPackage bEPaymentPackage, List list, boolean z15, String str2, String str3, List list2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = initialized.sourcePaymentId;
            }
            if ((i15 & 2) != 0) {
                j15 = initialized.paymentPackageId;
            }
            if ((i15 & 4) != 0) {
                bEPaymentPackage = initialized.paymentPackage;
            }
            if ((i15 & 8) != 0) {
                list = initialized.installmentsWithChecks;
            }
            if ((i15 & 16) != 0) {
                z15 = initialized.isInfoAlertVisible;
            }
            if ((i15 & 32) != 0) {
                str2 = initialized.institutionId;
            }
            if ((i15 & 64) != 0) {
                str3 = initialized.institutionName;
            }
            if ((i15 & 128) != 0) {
                list2 = initialized.availablePaymentMethods;
            }
            String str4 = str3;
            List list3 = list2;
            return initialized.a(str, j15, bEPaymentPackage, list, z15, str2, str4, list3);
        }

        public final Initialized a(String sourcePaymentId, long paymentPackageId, BEPaymentPackage paymentPackage, List<InstallmentWithCheck> installmentsWithChecks, boolean isInfoAlertVisible, String institutionId, String institutionName, List<? extends yr0.a> availablePaymentMethods) {
            return new Initialized(sourcePaymentId, paymentPackageId, paymentPackage, installmentsWithChecks, isInfoAlertVisible, institutionId, institutionName, availablePaymentMethods);
        }

        public final List<yr0.a> c() {
            return this.availablePaymentMethods;
        }

        public final List<InstallmentWithCheck> d() {
            return this.installmentsWithChecks;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInstitutionId() {
            return this.institutionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.sourcePaymentId, initialized.sourcePaymentId) && this.paymentPackageId == initialized.paymentPackageId && fr.t.c(this.paymentPackage, initialized.paymentPackage) && fr.t.c(this.installmentsWithChecks, initialized.installmentsWithChecks) && this.isInfoAlertVisible == initialized.isInfoAlertVisible && fr.t.c(this.institutionId, initialized.institutionId) && fr.t.c(this.institutionName, initialized.institutionName) && fr.t.c(this.availablePaymentMethods, initialized.availablePaymentMethods);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getPaymentPackageId() {
            return this.paymentPackageId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSourcePaymentId() {
            return this.sourcePaymentId;
        }

        public int hashCode() {
            return (((((((((((((this.sourcePaymentId.hashCode() * 31) + Long.hashCode(this.paymentPackageId)) * 31) + this.paymentPackage.hashCode()) * 31) + this.installmentsWithChecks.hashCode()) * 31) + Boolean.hashCode(this.isInfoAlertVisible)) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.availablePaymentMethods.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsInfoAlertVisible() {
            return this.isInfoAlertVisible;
        }

        public String toString() {
            return "Initialized(sourcePaymentId=" + this.sourcePaymentId + ", paymentPackageId=" + this.paymentPackageId + ", paymentPackage=" + this.paymentPackage + ", installmentsWithChecks=" + this.installmentsWithChecks + ", isInfoAlertVisible=" + this.isInfoAlertVisible + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", availablePaymentMethods=" + this.availablePaymentMethods + ')';
        }
    }
}
