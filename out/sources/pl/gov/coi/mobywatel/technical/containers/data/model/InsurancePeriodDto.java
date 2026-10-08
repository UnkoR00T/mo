package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Date;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/InsurancePeriodDto;", "", "startDate", "Ljava/util/Date;", "endDate", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "getStartDate", "()Ljava/util/Date;", "getEndDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsurancePeriodDto {

    @c("endDate")
    private final Date endDate;

    @c("startDate")
    private final Date startDate;

    public InsurancePeriodDto(Date date, Date date2) {
        this.startDate = date;
        this.endDate = date2;
    }

    public static /* synthetic */ InsurancePeriodDto copy$default(InsurancePeriodDto insurancePeriodDto, Date date, Date date2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            date = insurancePeriodDto.startDate;
        }
        if ((i15 & 2) != 0) {
            date2 = insurancePeriodDto.endDate;
        }
        return insurancePeriodDto.copy(date, date2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getEndDate() {
        return this.endDate;
    }

    public final InsurancePeriodDto copy(Date startDate, Date endDate) {
        return new InsurancePeriodDto(startDate, endDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsurancePeriodDto)) {
            return false;
        }
        InsurancePeriodDto insurancePeriodDto = (InsurancePeriodDto) other;
        return t.c(this.startDate, insurancePeriodDto.startDate) && t.c(this.endDate, insurancePeriodDto.endDate);
    }

    public final Date getEndDate() {
        return this.endDate;
    }

    public final Date getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return (this.startDate.hashCode() * 31) + this.endDate.hashCode();
    }

    public String toString() {
        return "InsurancePeriodDto(startDate=" + this.startDate + ", endDate=" + this.endDate + ')';
    }
}
