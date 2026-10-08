package xs0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xs0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxs0/g;", "", "Lxs0/g$a;", "status", "Ljava/time/OffsetDateTime;", "statusStartDate", "<init>", "(Lxs0/g$a;Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxs0/g$a;", "()Lxs0/g$a;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionCheckStatusDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final a status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statusStartDate")
    private final OffsetDateTime statusStartDate;

    /* JADX INFO: renamed from: xs0.g$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lxs0/g$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        RESTRICTED("RESTRICTED"),
        UNRESTRICTED("UNRESTRICTED"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f220781f = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestrictionCheckStatusDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getStatusStartDate() {
        return this.statusStartDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionCheckStatusDto)) {
            return false;
        }
        RestrictionCheckStatusDto restrictionCheckStatusDto = (RestrictionCheckStatusDto) other;
        return this.status == restrictionCheckStatusDto.status && t.c(this.statusStartDate, restrictionCheckStatusDto.statusStartDate);
    }

    public int hashCode() {
        a aVar = this.status;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.statusStartDate;
        return iHashCode + (offsetDateTime != null ? offsetDateTime.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionCheckStatusDto(status=" + this.status + ", statusStartDate=" + this.statusStartDate + ')';
    }

    public RestrictionCheckStatusDto(a aVar, OffsetDateTime offsetDateTime) {
        this.status = aVar;
        this.statusStartDate = offsetDateTime;
    }

    public /* synthetic */ RestrictionCheckStatusDto(a aVar, OffsetDateTime offsetDateTime, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : aVar, (i15 & 2) != 0 ? null : offsetDateTime);
    }
}
