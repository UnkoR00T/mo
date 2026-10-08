package up0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: renamed from: up0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lup0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "challenge", "b", "encryptionKey", "c", "encryptionKeyId", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "tokenAudience", "", "e", "J", "()J", "tokenTtlInSeconds", "identitysrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitAuthenticationByMobileSignatureResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("challenge")
    private final String challenge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("encryptionKey")
    private final String encryptionKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("encryptionKeyId")
    private final String encryptionKeyId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @c("tokenAudience")
    private final List<String> tokenAudience;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @c("tokenTtlInSeconds")
    private final long tokenTtlInSeconds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncryptionKey() {
        return this.encryptionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public final List<String> d() {
        return this.tokenAudience;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTokenTtlInSeconds() {
        return this.tokenTtlInSeconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitAuthenticationByMobileSignatureResponseDto)) {
            return false;
        }
        InitAuthenticationByMobileSignatureResponseDto initAuthenticationByMobileSignatureResponseDto = (InitAuthenticationByMobileSignatureResponseDto) other;
        return t.c(this.challenge, initAuthenticationByMobileSignatureResponseDto.challenge) && t.c(this.encryptionKey, initAuthenticationByMobileSignatureResponseDto.encryptionKey) && t.c(this.encryptionKeyId, initAuthenticationByMobileSignatureResponseDto.encryptionKeyId) && t.c(this.tokenAudience, initAuthenticationByMobileSignatureResponseDto.tokenAudience) && this.tokenTtlInSeconds == initAuthenticationByMobileSignatureResponseDto.tokenTtlInSeconds;
    }

    public int hashCode() {
        return (((((((this.challenge.hashCode() * 31) + this.encryptionKey.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.tokenAudience.hashCode()) * 31) + Long.hashCode(this.tokenTtlInSeconds);
    }

    public String toString() {
        return "InitAuthenticationByMobileSignatureResponseDto(challenge=" + this.challenge + ", encryptionKey=" + this.encryptionKey + ", encryptionKeyId=" + this.encryptionKeyId + ", tokenAudience=" + this.tokenAudience + ", tokenTtlInSeconds=" + this.tokenTtlInSeconds + ')';
    }
}
