package xs0;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xs0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lxs0/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lxs0/o;", "a", "Ljava/util/List;", "()Ljava/util/List;", "restrictionVerifications", "Lxs0/p$a;", "b", "Lxs0/p$a;", "()Lxs0/p$a;", "status", "Ljava/time/OffsetDateTime;", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "verificationDate", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionsVerificationListDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("restrictionVerifications")
    private final List<RestrictionVerificationDto> restrictionVerifications;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final a status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationDate")
    private final OffsetDateTime verificationDate;

    /* JADX INFO: renamed from: xs0.p$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lxs0/p$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        VERIFIED("VERIFIED"),
        NOT_FOUND("NOT_FOUND"),
        INVALID_INPUT("INVALID_INPUT"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f220828g = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    public final List<RestrictionVerificationDto> a() {
        return this.restrictionVerifications;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getVerificationDate() {
        return this.verificationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionsVerificationListDto)) {
            return false;
        }
        RestrictionsVerificationListDto restrictionsVerificationListDto = (RestrictionsVerificationListDto) other;
        return t.c(this.restrictionVerifications, restrictionsVerificationListDto.restrictionVerifications) && this.status == restrictionsVerificationListDto.status && t.c(this.verificationDate, restrictionsVerificationListDto.verificationDate);
    }

    public int hashCode() {
        int iHashCode = this.restrictionVerifications.hashCode() * 31;
        a aVar = this.status;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.verificationDate;
        return iHashCode2 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionsVerificationListDto(restrictionVerifications=" + this.restrictionVerifications + ", status=" + this.status + ", verificationDate=" + this.verificationDate + ')';
    }
}
