package ur0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ur0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, d2 = {"Lur0/a;", "", "", "oneClickAliasId", "aliasLabel", "appLabel", "aliasValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEAlias {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String oneClickAliasId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aliasLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aliasValue;

    public BEAlias(String str, String str2, String str3, String str4) {
        this.oneClickAliasId = str;
        this.aliasLabel = str2;
        this.appLabel = str3;
        this.aliasValue = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAliasLabel() {
        return this.aliasLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAliasValue() {
        return this.aliasValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAppLabel() {
        return this.appLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOneClickAliasId() {
        return this.oneClickAliasId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEAlias)) {
            return false;
        }
        BEAlias bEAlias = (BEAlias) other;
        return t.c(this.oneClickAliasId, bEAlias.oneClickAliasId) && t.c(this.aliasLabel, bEAlias.aliasLabel) && t.c(this.appLabel, bEAlias.appLabel) && t.c(this.aliasValue, bEAlias.aliasValue);
    }

    public int hashCode() {
        return (((((this.oneClickAliasId.hashCode() * 31) + this.aliasLabel.hashCode()) * 31) + this.appLabel.hashCode()) * 31) + this.aliasValue.hashCode();
    }

    public String toString() {
        return "BEAlias(oneClickAliasId=" + this.oneClickAliasId + ", aliasLabel=" + this.aliasLabel + ", appLabel=" + this.appLabel + ", aliasValue=" + this.aliasValue + ")";
    }
}
