package jk0;

import fr.t;
import iy.b0;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jk0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Ljk0/k;", "", "", "", "claimsToSign", "Liy/b0;", "encryptionKey", "encryptionKeyId", "providerName", "", "tokenAudience", "Lgu/b;", "tokenTtlInSeconds", "<init>", "(Ljava/util/Map;Liy/b0;Liy/b0;Ljava/lang/String;Ljava/util/List;JLfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Liy/b0;", "()Liy/b0;", "c", "d", "Ljava/lang/String;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "J", "()J", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalQualifiedSignatureStartResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> claimsToSign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKeyId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String providerName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tokenAudience;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tokenTtlInSeconds;

    public /* synthetic */ ExternalQualifiedSignatureStartResponse(Map map, b0 b0Var, b0 b0Var2, String str, List list, long j15, fr.k kVar) {
        this(map, b0Var, b0Var2, str, list, j15);
    }

    public final Map<String, String> a() {
        return this.claimsToSign;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getEncryptionKey() {
        return this.encryptionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getEncryptionKeyId() {
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
        if (!(other instanceof ExternalQualifiedSignatureStartResponse)) {
            return false;
        }
        ExternalQualifiedSignatureStartResponse externalQualifiedSignatureStartResponse = (ExternalQualifiedSignatureStartResponse) other;
        return t.c(this.claimsToSign, externalQualifiedSignatureStartResponse.claimsToSign) && t.c(this.encryptionKey, externalQualifiedSignatureStartResponse.encryptionKey) && t.c(this.encryptionKeyId, externalQualifiedSignatureStartResponse.encryptionKeyId) && t.c(this.providerName, externalQualifiedSignatureStartResponse.providerName) && t.c(this.tokenAudience, externalQualifiedSignatureStartResponse.tokenAudience) && gu.b.v(this.tokenTtlInSeconds, externalQualifiedSignatureStartResponse.tokenTtlInSeconds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTokenTtlInSeconds() {
        return this.tokenTtlInSeconds;
    }

    public int hashCode() {
        return (((((((((this.claimsToSign.hashCode() * 31) + this.encryptionKey.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.providerName.hashCode()) * 31) + this.tokenAudience.hashCode()) * 31) + gu.b.N(this.tokenTtlInSeconds);
    }

    public String toString() {
        return "ExternalQualifiedSignatureStartResponse(claimsToSign=" + this.claimsToSign + ", encryptionKey=" + this.encryptionKey + ", encryptionKeyId=" + this.encryptionKeyId + ", providerName=" + this.providerName + ", tokenAudience=" + this.tokenAudience + ", tokenTtlInSeconds=" + gu.b.d0(this.tokenTtlInSeconds) + ")";
    }

    private ExternalQualifiedSignatureStartResponse(Map<String, String> map, b0 b0Var, b0 b0Var2, String str, List<String> list, long j15) {
        this.claimsToSign = map;
        this.encryptionKey = b0Var;
        this.encryptionKeyId = b0Var2;
        this.providerName = str;
        this.tokenAudience = list;
        this.tokenTtlInSeconds = j15;
    }
}
