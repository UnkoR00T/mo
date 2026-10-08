package ck0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lck0/e0;", "", "Ljava/time/LocalDate;", "from", "to", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "getFrom", "()Ljava/time/LocalDate;", "b", "getTo", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationSuspensionPeriodDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("from")
    private final LocalDate from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("to")
    private final LocalDate to;

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyApplicationSuspensionPeriodDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationSuspensionPeriodDto)) {
            return false;
        }
        CompanyApplicationSuspensionPeriodDto companyApplicationSuspensionPeriodDto = (CompanyApplicationSuspensionPeriodDto) other;
        return fr.t.c(this.from, companyApplicationSuspensionPeriodDto.from) && fr.t.c(this.to, companyApplicationSuspensionPeriodDto.to);
    }

    public int hashCode() {
        LocalDate localDate = this.from;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.to;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationSuspensionPeriodDto(from=" + this.from + ", to=" + this.to + ')';
    }

    public CompanyApplicationSuspensionPeriodDto(LocalDate localDate, LocalDate localDate2) {
        this.from = localDate;
        this.to = localDate2;
    }

    public /* synthetic */ CompanyApplicationSuspensionPeriodDto(LocalDate localDate, LocalDate localDate2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2);
    }
}
