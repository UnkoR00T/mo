package z24;

import fr.t;
import java.security.PublicKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z24.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, d2 = {"Lz24/a;", "", "Ljava/security/PublicKey;", "publicKey", "", "description", "url", "operator", "<init>", "(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/PublicKey;", "c", "()Ljava/security/PublicKey;", "b", "Ljava/lang/String;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CTLogInfoDomain {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PublicKey publicKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String operator;

    public CTLogInfoDomain(PublicKey publicKey, String str, String str2, String str3) {
        this.publicKey = publicKey;
        this.description = str;
        this.url = str2;
        this.operator = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PublicKey getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CTLogInfoDomain)) {
            return false;
        }
        CTLogInfoDomain cTLogInfoDomain = (CTLogInfoDomain) other;
        return t.c(this.publicKey, cTLogInfoDomain.publicKey) && t.c(this.description, cTLogInfoDomain.description) && t.c(this.url, cTLogInfoDomain.url) && t.c(this.operator, cTLogInfoDomain.operator);
    }

    public int hashCode() {
        return (((((this.publicKey.hashCode() * 31) + this.description.hashCode()) * 31) + this.url.hashCode()) * 31) + this.operator.hashCode();
    }

    public String toString() {
        return "CTLogInfoDomain(publicKey=" + this.publicKey + ", description=" + this.description + ", url=" + this.url + ", operator=" + this.operator + ")";
    }
}
