package ot0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ot0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lot0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "authorizationId", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "expirationDateTime", "c", "processId", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalQualifiedSignatureAuthorizationParametersDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("authorizationId")
    private final String authorizationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expirationDateTime")
    private final OffsetDateTime expirationDateTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("processId")
    private final String processId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthorizationId() {
        return this.authorizationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProcessId() {
        return this.processId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalQualifiedSignatureAuthorizationParametersDto)) {
            return false;
        }
        ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorizationParametersDto = (ExternalQualifiedSignatureAuthorizationParametersDto) other;
        return t.c(this.authorizationId, externalQualifiedSignatureAuthorizationParametersDto.authorizationId) && t.c(this.expirationDateTime, externalQualifiedSignatureAuthorizationParametersDto.expirationDateTime) && t.c(this.processId, externalQualifiedSignatureAuthorizationParametersDto.processId);
    }

    public int hashCode() {
        return (((this.authorizationId.hashCode() * 31) + this.expirationDateTime.hashCode()) * 31) + this.processId.hashCode();
    }

    public String toString() {
        return "ExternalQualifiedSignatureAuthorizationParametersDto(authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ", processId=" + this.processId + ')';
    }
}
