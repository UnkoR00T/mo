package g64;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g64.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lg64/a;", "", "", "type", "subType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlobalSearchDocumentResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subType;

    public GlobalSearchDocumentResult(String str, String str2) {
        this.type = str;
        this.subType = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalSearchDocumentResult)) {
            return false;
        }
        GlobalSearchDocumentResult globalSearchDocumentResult = (GlobalSearchDocumentResult) other;
        return t.c(this.type, globalSearchDocumentResult.type) && t.c(this.subType, globalSearchDocumentResult.subType);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.subType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GlobalSearchDocumentResult(type=" + this.type + ", subType=" + this.subType + ")";
    }
}
