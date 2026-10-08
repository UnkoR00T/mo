package xt0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lxt0/u;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "date", "b", "Ljava/lang/String;", "description", "c", "sanitaryUnit", "Lxt0/v;", "d", "Lxt0/v;", "()Lxt0/v;", "status", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterventionHistoryActionDetailDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("date")
    private final LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sanitaryUnit")
    private final String sanitaryUnit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final v status;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSanitaryUnit() {
        return this.sanitaryUnit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterventionHistoryActionDetailDto)) {
            return false;
        }
        InterventionHistoryActionDetailDto interventionHistoryActionDetailDto = (InterventionHistoryActionDetailDto) other;
        return fr.t.c(this.date, interventionHistoryActionDetailDto.date) && fr.t.c(this.description, interventionHistoryActionDetailDto.description) && fr.t.c(this.sanitaryUnit, interventionHistoryActionDetailDto.sanitaryUnit) && this.status == interventionHistoryActionDetailDto.status;
    }

    public int hashCode() {
        return (((((this.date.hashCode() * 31) + this.description.hashCode()) * 31) + this.sanitaryUnit.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "InterventionHistoryActionDetailDto(date=" + this.date + ", description=" + this.description + ", sanitaryUnit=" + this.sanitaryUnit + ", status=" + this.status + ')';
    }
}
