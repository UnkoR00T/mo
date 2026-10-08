package gm0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.s6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lgm0/s6;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgm0/o2;", "a", "Lgm0/o2;", "()Lgm0/o2;", "allowedAction", "b", "Ljava/lang/String;", "c", "number", "d", "series", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "cancelSuspensionEndDate", "e", "suspensionDate", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardSuspensionInitResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("allowedAction")
    private final o2 allowedAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("series")
    private final String series;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cancelSuspensionEndDate")
    private final LocalDate cancelSuspensionEndDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("suspensionDate")
    private final LocalDate suspensionDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o2 getAllowedAction() {
        return this.allowedAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getCancelSuspensionEndDate() {
        return this.cancelSuspensionEndDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSeries() {
        return this.series;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getSuspensionDate() {
        return this.suspensionDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardSuspensionInitResponse)) {
            return false;
        }
        PhysicalIdCardSuspensionInitResponse physicalIdCardSuspensionInitResponse = (PhysicalIdCardSuspensionInitResponse) other;
        return this.allowedAction == physicalIdCardSuspensionInitResponse.allowedAction && fr.t.c(this.number, physicalIdCardSuspensionInitResponse.number) && fr.t.c(this.series, physicalIdCardSuspensionInitResponse.series) && fr.t.c(this.cancelSuspensionEndDate, physicalIdCardSuspensionInitResponse.cancelSuspensionEndDate) && fr.t.c(this.suspensionDate, physicalIdCardSuspensionInitResponse.suspensionDate);
    }

    public int hashCode() {
        int iHashCode = ((((this.allowedAction.hashCode() * 31) + this.number.hashCode()) * 31) + this.series.hashCode()) * 31;
        LocalDate localDate = this.cancelSuspensionEndDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.suspensionDate;
        return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "PhysicalIdCardSuspensionInitResponse(allowedAction=" + this.allowedAction + ", number=" + this.number + ", series=" + this.series + ", cancelSuspensionEndDate=" + this.cancelSuspensionEndDate + ", suspensionDate=" + this.suspensionDate + ')';
    }
}
