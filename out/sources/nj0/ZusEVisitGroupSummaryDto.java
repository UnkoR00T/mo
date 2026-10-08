package nj0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.t0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnj0/t0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lnj0/s0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "details", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "visitDate", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusEVisitGroupSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("details")
    private final List<ZusEVisitGroupDetailsDto> details;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("visitDate")
    private final LocalDate visitDate;

    public final List<ZusEVisitGroupDetailsDto> a() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getVisitDate() {
        return this.visitDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusEVisitGroupSummaryDto)) {
            return false;
        }
        ZusEVisitGroupSummaryDto zusEVisitGroupSummaryDto = (ZusEVisitGroupSummaryDto) other;
        return fr.t.c(this.details, zusEVisitGroupSummaryDto.details) && fr.t.c(this.visitDate, zusEVisitGroupSummaryDto.visitDate);
    }

    public int hashCode() {
        return (this.details.hashCode() * 31) + this.visitDate.hashCode();
    }

    public String toString() {
        return "ZusEVisitGroupSummaryDto(details=" + this.details + ", visitDate=" + this.visitDate + ')';
    }
}
