package fw0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\f\u0010\u001e¨\u0006 "}, d2 = {"Lfw0/w;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "registrationAuthority", "c", "seriesAndNumber", "Lfw0/x;", "Lfw0/x;", "d", "()Lfw0/x;", "state", "Lfw0/y;", "Lfw0/y;", "e", "()Lfw0/y;", "type", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "expireDate", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAuthority")
    private final String registrationAuthority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("seriesAndNumber")
    private final String seriesAndNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("state")
    private final x state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final y type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expireDate")
    private final LocalDate expireDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getExpireDate() {
        return this.expireDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSeriesAndNumber() {
        return this.seriesAndNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentDto)) {
            return false;
        }
        DocumentDto documentDto = (DocumentDto) other;
        return fr.t.c(this.registrationAuthority, documentDto.registrationAuthority) && fr.t.c(this.seriesAndNumber, documentDto.seriesAndNumber) && this.state == documentDto.state && this.type == documentDto.type && fr.t.c(this.expireDate, documentDto.expireDate);
    }

    public int hashCode() {
        int iHashCode = ((((((this.registrationAuthority.hashCode() * 31) + this.seriesAndNumber.hashCode()) * 31) + this.state.hashCode()) * 31) + this.type.hashCode()) * 31;
        LocalDate localDate = this.expireDate;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "DocumentDto(registrationAuthority=" + this.registrationAuthority + ", seriesAndNumber=" + this.seriesAndNumber + ", state=" + this.state + ", type=" + this.type + ", expireDate=" + this.expireDate + ')';
    }
}
