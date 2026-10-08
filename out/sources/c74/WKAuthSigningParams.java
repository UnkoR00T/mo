package c74;

import fr.k;
import fr.t;
import iy.b0;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: c74.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJT\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lc74/b;", "", "", "", "claimsToSign", "Liy/b0;", "encryptionKey", "encryptionKeyId", "", "tokenAudience", "Lgu/b;", "tokenTtlInSeconds", "<init>", "(Ljava/util/Map;Liy/b0;Liy/b0;Ljava/util/List;JLfr/k;)V", "a", "(Ljava/util/Map;Liy/b0;Liy/b0;Ljava/util/List;J)Lc74/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "b", "Liy/b0;", "d", "()Liy/b0;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "J", "g", "()J", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WKAuthSigningParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> claimsToSign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKeyId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tokenAudience;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tokenTtlInSeconds;

    public /* synthetic */ WKAuthSigningParams(Map map, b0 b0Var, b0 b0Var2, List list, long j15, k kVar) {
        this(map, b0Var, b0Var2, list, j15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WKAuthSigningParams b(WKAuthSigningParams wKAuthSigningParams, Map map, b0 b0Var, b0 b0Var2, List list, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = wKAuthSigningParams.claimsToSign;
        }
        if ((i15 & 2) != 0) {
            b0Var = wKAuthSigningParams.encryptionKey;
        }
        if ((i15 & 4) != 0) {
            b0Var2 = wKAuthSigningParams.encryptionKeyId;
        }
        if ((i15 & 8) != 0) {
            list = wKAuthSigningParams.tokenAudience;
        }
        if ((i15 & 16) != 0) {
            j15 = wKAuthSigningParams.tokenTtlInSeconds;
        }
        long j16 = j15;
        return wKAuthSigningParams.a(map, b0Var, b0Var2, list, j16);
    }

    public final WKAuthSigningParams a(Map<String, String> claimsToSign, b0 encryptionKey, b0 encryptionKeyId, List<String> tokenAudience, long tokenTtlInSeconds) {
        return new WKAuthSigningParams(claimsToSign, encryptionKey, encryptionKeyId, tokenAudience, tokenTtlInSeconds, null);
    }

    public final Map<String, String> c() {
        return this.claimsToSign;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getEncryptionKey() {
        return this.encryptionKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WKAuthSigningParams)) {
            return false;
        }
        WKAuthSigningParams wKAuthSigningParams = (WKAuthSigningParams) other;
        return t.c(this.claimsToSign, wKAuthSigningParams.claimsToSign) && t.c(this.encryptionKey, wKAuthSigningParams.encryptionKey) && t.c(this.encryptionKeyId, wKAuthSigningParams.encryptionKeyId) && t.c(this.tokenAudience, wKAuthSigningParams.tokenAudience) && gu.b.v(this.tokenTtlInSeconds, wKAuthSigningParams.tokenTtlInSeconds);
    }

    public final List<String> f() {
        return this.tokenAudience;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTokenTtlInSeconds() {
        return this.tokenTtlInSeconds;
    }

    public int hashCode() {
        return (((((((this.claimsToSign.hashCode() * 31) + this.encryptionKey.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.tokenAudience.hashCode()) * 31) + gu.b.N(this.tokenTtlInSeconds);
    }

    public String toString() {
        return "WKAuthSigningParams(claimsToSign=" + this.claimsToSign + ", encryptionKey=" + this.encryptionKey + ", encryptionKeyId=" + this.encryptionKeyId + ", tokenAudience=" + this.tokenAudience + ", tokenTtlInSeconds=" + gu.b.d0(this.tokenTtlInSeconds) + ")";
    }

    private WKAuthSigningParams(Map<String, String> map, b0 b0Var, b0 b0Var2, List<String> list, long j15) {
        this.claimsToSign = map;
        this.encryptionKey = b0Var;
        this.encryptionKeyId = b0Var2;
        this.tokenAudience = list;
        this.tokenTtlInSeconds = j15;
    }
}
