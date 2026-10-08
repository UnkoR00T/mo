package t42;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: t42.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Lt42/b;", "", "", "sourcePaymentId", "", "paymentPackageId", "institutionId", "institutionName", "", "Lyr0/a;", "availablePaymentMethods", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "J", "d", "()J", "c", "Ljava/util/List;", "()Ljava/util/List;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstallmentsPaymentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourcePaymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long paymentPackageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<yr0.a> availablePaymentMethods;

    /* JADX WARN: Multi-variable type inference failed */
    public InstallmentsPaymentData(String str, long j15, String str2, String str3, List<? extends yr0.a> list) {
        this.sourcePaymentId = str;
        this.paymentPackageId = j15;
        this.institutionId = str2;
        this.institutionName = str3;
        this.availablePaymentMethods = list;
    }

    public final List<yr0.a> a() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getPaymentPackageId() {
        return this.paymentPackageId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSourcePaymentId() {
        return this.sourcePaymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsPaymentData)) {
            return false;
        }
        InstallmentsPaymentData installmentsPaymentData = (InstallmentsPaymentData) other;
        return t.c(this.sourcePaymentId, installmentsPaymentData.sourcePaymentId) && this.paymentPackageId == installmentsPaymentData.paymentPackageId && t.c(this.institutionId, installmentsPaymentData.institutionId) && t.c(this.institutionName, installmentsPaymentData.institutionName) && t.c(this.availablePaymentMethods, installmentsPaymentData.availablePaymentMethods);
    }

    public int hashCode() {
        return (((((((this.sourcePaymentId.hashCode() * 31) + Long.hashCode(this.paymentPackageId)) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.availablePaymentMethods.hashCode();
    }

    public String toString() {
        return "InstallmentsPaymentData(sourcePaymentId=" + this.sourcePaymentId + ", paymentPackageId=" + this.paymentPackageId + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", availablePaymentMethods=" + this.availablePaymentMethods + ')';
    }
}
