package xs0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xs0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lxs0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "pesel", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "changeDate", "Lxs0/l$a;", "c", "Lxs0/l$a;", "()Lxs0/l$a;", "status", "d", "subject", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionStatusChangeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("changeDate")
    private final OffsetDateTime changeDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final a status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subject")
    private final String subject;

    /* JADX INFO: renamed from: xs0.l$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lxs0/l$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        RESTRICTED("RESTRICTED"),
        UNRESTRICTED("UNRESTRICTED"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f220807f = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getChangeDate() {
        return this.changeDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionStatusChangeDto)) {
            return false;
        }
        RestrictionStatusChangeDto restrictionStatusChangeDto = (RestrictionStatusChangeDto) other;
        return t.c(this.pesel, restrictionStatusChangeDto.pesel) && t.c(this.changeDate, restrictionStatusChangeDto.changeDate) && this.status == restrictionStatusChangeDto.status && t.c(this.subject, restrictionStatusChangeDto.subject);
    }

    public int hashCode() {
        int iHashCode = this.pesel.hashCode() * 31;
        OffsetDateTime offsetDateTime = this.changeDate;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        a aVar = this.status;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.subject;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionStatusChangeDto(pesel=" + this.pesel + ", changeDate=" + this.changeDate + ", status=" + this.status + ", subject=" + this.subject + ')';
    }
}
