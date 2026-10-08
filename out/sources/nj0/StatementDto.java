package nj0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Lnj0/l0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "organ", "b", "e", "signature", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "creationDate", "deprivationPeriod", "finalDate", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("organ")
    private final String organ;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("signature")
    private final String signature;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("creationDate")
    private final LocalDate creationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("deprivationPeriod")
    private final String deprivationPeriod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("finalDate")
    private final LocalDate finalDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeprivationPeriod() {
        return this.deprivationPeriod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getFinalDate() {
        return this.finalDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOrgan() {
        return this.organ;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementDto)) {
            return false;
        }
        StatementDto statementDto = (StatementDto) other;
        return fr.t.c(this.organ, statementDto.organ) && fr.t.c(this.signature, statementDto.signature) && fr.t.c(this.creationDate, statementDto.creationDate) && fr.t.c(this.deprivationPeriod, statementDto.deprivationPeriod) && fr.t.c(this.finalDate, statementDto.finalDate);
    }

    public int hashCode() {
        int iHashCode = ((this.organ.hashCode() * 31) + this.signature.hashCode()) * 31;
        LocalDate localDate = this.creationDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.deprivationPeriod;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate2 = this.finalDate;
        return iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "StatementDto(organ=" + this.organ + ", signature=" + this.signature + ", creationDate=" + this.creationDate + ", deprivationPeriod=" + this.deprivationPeriod + ", finalDate=" + this.finalDate + ')';
    }
}
