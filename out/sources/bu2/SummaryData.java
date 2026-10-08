package bu2;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bu2.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lbu2/c;", "", "Lbu2/b;", "companyDetails", "Lbu2/d;", "verificationCheckData", "Lbu2/e;", "verifiedStatus", "<init>", "(Lbu2/b;Lbu2/d;Lbu2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/b;", "b", "()Lbu2/b;", "Lbu2/d;", "c", "()Lbu2/d;", "Lbu2/e;", "d", "()Lbu2/e;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryData {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21723e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final SummaryData f21724f = new SummaryData(null, new VerificationCheckData("", "", "", bv2.a.POLISH_CITIZENSHIP), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyDetails companyDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationCheckData verificationCheckData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerifiedStatus verifiedStatus;

    /* JADX INFO: renamed from: bu2.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbu2/c$a;", "", "<init>", "()V", "Lbu2/c;", "EMPTY", "Lbu2/c;", "a", "()Lbu2/c;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final SummaryData a() {
            return SummaryData.f21724f;
        }

        private Companion() {
        }
    }

    public SummaryData(CompanyDetails companyDetails, VerificationCheckData verificationCheckData, VerifiedStatus verifiedStatus) {
        this.companyDetails = companyDetails;
        this.verificationCheckData = verificationCheckData;
        this.verifiedStatus = verifiedStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CompanyDetails getCompanyDetails() {
        return this.companyDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VerificationCheckData getVerificationCheckData() {
        return this.verificationCheckData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VerifiedStatus getVerifiedStatus() {
        return this.verifiedStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryData)) {
            return false;
        }
        SummaryData summaryData = (SummaryData) other;
        return t.c(this.companyDetails, summaryData.companyDetails) && t.c(this.verificationCheckData, summaryData.verificationCheckData) && t.c(this.verifiedStatus, summaryData.verifiedStatus);
    }

    public int hashCode() {
        CompanyDetails companyDetails = this.companyDetails;
        int iHashCode = (((companyDetails == null ? 0 : companyDetails.hashCode()) * 31) + this.verificationCheckData.hashCode()) * 31;
        VerifiedStatus verifiedStatus = this.verifiedStatus;
        return iHashCode + (verifiedStatus != null ? verifiedStatus.hashCode() : 0);
    }

    public String toString() {
        return "SummaryData(companyDetails=" + this.companyDetails + ", verificationCheckData=" + this.verificationCheckData + ", verifiedStatus=" + this.verifiedStatus + ')';
    }
}
