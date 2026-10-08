package nk0;

import fr.t;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nk0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lnk0/o;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "claimsToSign", "b", "Ljava/lang/String;", "encryptionKey", "c", "encryptionKeyId", "d", "providerName", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "tokenAudience", "", "f", "J", "()J", "tokenTtlInSeconds", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalQualifiedSignatureStartResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("claimsToSign")
    private final Map<String, String> claimsToSign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encryptionKey")
    private final String encryptionKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encryptionKeyId")
    private final String encryptionKeyId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("providerName")
    private final String providerName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tokenAudience")
    private final List<String> tokenAudience;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tokenTtlInSeconds")
    private final long tokenTtlInSeconds;

    public final Map<String, String> a() {
        return this.claimsToSign;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncryptionKey() {
        return this.encryptionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    public final List<String> e() {
        return this.tokenAudience;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalQualifiedSignatureStartResponseDto)) {
            return false;
        }
        ExternalQualifiedSignatureStartResponseDto externalQualifiedSignatureStartResponseDto = (ExternalQualifiedSignatureStartResponseDto) other;
        return t.c(this.claimsToSign, externalQualifiedSignatureStartResponseDto.claimsToSign) && t.c(this.encryptionKey, externalQualifiedSignatureStartResponseDto.encryptionKey) && t.c(this.encryptionKeyId, externalQualifiedSignatureStartResponseDto.encryptionKeyId) && t.c(this.providerName, externalQualifiedSignatureStartResponseDto.providerName) && t.c(this.tokenAudience, externalQualifiedSignatureStartResponseDto.tokenAudience) && this.tokenTtlInSeconds == externalQualifiedSignatureStartResponseDto.tokenTtlInSeconds;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTokenTtlInSeconds() {
        return this.tokenTtlInSeconds;
    }

    public int hashCode() {
        return (((((((((this.claimsToSign.hashCode() * 31) + this.encryptionKey.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.providerName.hashCode()) * 31) + this.tokenAudience.hashCode()) * 31) + Long.hashCode(this.tokenTtlInSeconds);
    }

    public String toString() {
        return "ExternalQualifiedSignatureStartResponseDto(claimsToSign=" + this.claimsToSign + ", encryptionKey=" + this.encryptionKey + ", encryptionKeyId=" + this.encryptionKeyId + ", providerName=" + this.providerName + ", tokenAudience=" + this.tokenAudience + ", tokenTtlInSeconds=" + this.tokenTtlInSeconds + ')';
    }
}
