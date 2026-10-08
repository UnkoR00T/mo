package fp0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: renamed from: fp0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lfp0/i;", "", "", "instituteUrl", "Lry/c;", "certKeyPair", "Lxw/g;", "pesel", "Lfp0/f;", "institutionCardAndCertData", "Lfp0/j;", "summaryData", "<init>", "(Ljava/lang/String;Lry/c;Liy/b0;Lfp0/f;Lfp0/j;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lry/c;", "()Lry/c;", "c", "Liy/b0;", "d", "()Liy/b0;", "Lfp0/f;", "()Lfp0/f;", "e", "Lfp0/j;", "()Lfp0/j;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String instituteUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CertKeyPair certKeyPair;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InstitutionCardAndCertData institutionCardAndCertData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final SummaryData summaryData;

    public /* synthetic */ ReportData(String str, CertKeyPair certKeyPair, b0 b0Var, InstitutionCardAndCertData institutionCardAndCertData, SummaryData summaryData, fr.k kVar) {
        this(str, certKeyPair, b0Var, institutionCardAndCertData, summaryData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CertKeyPair getCertKeyPair() {
        return this.certKeyPair;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstituteUrl() {
        return this.instituteUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InstitutionCardAndCertData getInstitutionCardAndCertData() {
        return this.institutionCardAndCertData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final SummaryData getSummaryData() {
        return this.summaryData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportData)) {
            return false;
        }
        ReportData reportData = (ReportData) other;
        return t.c(this.instituteUrl, reportData.instituteUrl) && t.c(this.certKeyPair, reportData.certKeyPair) && xw.g.f(this.pesel, reportData.pesel) && t.c(this.institutionCardAndCertData, reportData.institutionCardAndCertData) && t.c(this.summaryData, reportData.summaryData);
    }

    public int hashCode() {
        return (((((((this.instituteUrl.hashCode() * 31) + this.certKeyPair.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + this.institutionCardAndCertData.hashCode()) * 31) + this.summaryData.hashCode();
    }

    public String toString() {
        return "ReportData(instituteUrl=" + this.instituteUrl + ", certKeyPair=" + this.certKeyPair + ", pesel=" + xw.g.i(this.pesel) + ", institutionCardAndCertData=" + this.institutionCardAndCertData + ", summaryData=" + this.summaryData + ")";
    }

    private ReportData(String str, CertKeyPair certKeyPair, b0 b0Var, InstitutionCardAndCertData institutionCardAndCertData, SummaryData summaryData) {
        this.instituteUrl = str;
        this.certKeyPair = certKeyPair;
        this.pesel = b0Var;
        this.institutionCardAndCertData = institutionCardAndCertData;
        this.summaryData = summaryData;
    }
}
