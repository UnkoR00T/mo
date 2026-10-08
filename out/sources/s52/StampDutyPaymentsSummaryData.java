package s52;

import fr.t;
import p071kotlin.Metadata;
import y52.StampDutyCommitmentTypeData;
import y52.StampDutyCommitmentVariantData;
import y52.StampDutyInstitutionsData;
import y52.g;

/* JADX INFO: renamed from: s52.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Ls52/a;", "", "Ly52/a;", "commitmentType", "Ly52/b;", "commitmentVariant", "Ly52/d;", "institution", "Ly52/g;", "personalData", "<init>", "(Ly52/a;Ly52/b;Ly52/d;Ly52/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly52/a;", "()Ly52/a;", "b", "Ly52/b;", "()Ly52/b;", "c", "Ly52/d;", "()Ly52/d;", "d", "Ly52/g;", "()Ly52/g;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StampDutyPaymentsSummaryData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StampDutyCommitmentTypeData commitmentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StampDutyCommitmentVariantData commitmentVariant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final StampDutyInstitutionsData institution;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g personalData;

    public StampDutyPaymentsSummaryData(StampDutyCommitmentTypeData stampDutyCommitmentTypeData, StampDutyCommitmentVariantData stampDutyCommitmentVariantData, StampDutyInstitutionsData stampDutyInstitutionsData, g gVar) {
        this.commitmentType = stampDutyCommitmentTypeData;
        this.commitmentVariant = stampDutyCommitmentVariantData;
        this.institution = stampDutyInstitutionsData;
        this.personalData = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final StampDutyCommitmentTypeData getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StampDutyCommitmentVariantData getCommitmentVariant() {
        return this.commitmentVariant;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final StampDutyInstitutionsData getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getPersonalData() {
        return this.personalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StampDutyPaymentsSummaryData)) {
            return false;
        }
        StampDutyPaymentsSummaryData stampDutyPaymentsSummaryData = (StampDutyPaymentsSummaryData) other;
        return t.c(this.commitmentType, stampDutyPaymentsSummaryData.commitmentType) && t.c(this.commitmentVariant, stampDutyPaymentsSummaryData.commitmentVariant) && t.c(this.institution, stampDutyPaymentsSummaryData.institution) && t.c(this.personalData, stampDutyPaymentsSummaryData.personalData);
    }

    public int hashCode() {
        return (((((this.commitmentType.hashCode() * 31) + this.commitmentVariant.hashCode()) * 31) + this.institution.hashCode()) * 31) + this.personalData.hashCode();
    }

    public String toString() {
        return "StampDutyPaymentsSummaryData(commitmentType=" + this.commitmentType + ", commitmentVariant=" + this.commitmentVariant + ", institution=" + this.institution + ", personalData=" + this.personalData + ')';
    }
}
