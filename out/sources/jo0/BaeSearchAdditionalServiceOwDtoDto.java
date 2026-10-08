package jo0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ljo0/o;", "", "Ljava/time/LocalDate;", "activationDate", "resignationDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaeSearchAdditionalServiceOwDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activationDate")
    private final LocalDate activationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("resignationDate")
    private final LocalDate resignationDate;

    /* JADX WARN: Multi-variable type inference failed */
    public BaeSearchAdditionalServiceOwDtoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getActivationDate() {
        return this.activationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getResignationDate() {
        return this.resignationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaeSearchAdditionalServiceOwDtoDto)) {
            return false;
        }
        BaeSearchAdditionalServiceOwDtoDto baeSearchAdditionalServiceOwDtoDto = (BaeSearchAdditionalServiceOwDtoDto) other;
        return fr.t.c(this.activationDate, baeSearchAdditionalServiceOwDtoDto.activationDate) && fr.t.c(this.resignationDate, baeSearchAdditionalServiceOwDtoDto.resignationDate);
    }

    public int hashCode() {
        LocalDate localDate = this.activationDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.resignationDate;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "BaeSearchAdditionalServiceOwDtoDto(activationDate=" + this.activationDate + ", resignationDate=" + this.resignationDate + ')';
    }

    public BaeSearchAdditionalServiceOwDtoDto(LocalDate localDate, LocalDate localDate2) {
        this.activationDate = localDate;
        this.resignationDate = localDate2;
    }

    public /* synthetic */ BaeSearchAdditionalServiceOwDtoDto(LocalDate localDate, LocalDate localDate2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2);
    }
}
