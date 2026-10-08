package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.r2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lgm0/r2;", "", "", "id", "identityToken", "Lgm0/i5;", "invalidationReason", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgm0/i5;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getIdentityToken", "c", "Lgm0/i5;", "getInvalidationReason", "()Lgm0/i5;", "d", "getNumber", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvalidatePassportRequestV2Dto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("identityToken")
    private final String identityToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("invalidationReason")
    private final i5 invalidationReason;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    public InvalidatePassportRequestV2Dto(String str, String str2, i5 i5Var, String str3) {
        this.id = str;
        this.identityToken = str2;
        this.invalidationReason = i5Var;
        this.number = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvalidatePassportRequestV2Dto)) {
            return false;
        }
        InvalidatePassportRequestV2Dto invalidatePassportRequestV2Dto = (InvalidatePassportRequestV2Dto) other;
        return fr.t.c(this.id, invalidatePassportRequestV2Dto.id) && fr.t.c(this.identityToken, invalidatePassportRequestV2Dto.identityToken) && this.invalidationReason == invalidatePassportRequestV2Dto.invalidationReason && fr.t.c(this.number, invalidatePassportRequestV2Dto.number);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.identityToken.hashCode()) * 31) + this.invalidationReason.hashCode()) * 31) + this.number.hashCode();
    }

    public String toString() {
        return "InvalidatePassportRequestV2Dto(id=" + this.id + ", identityToken=" + this.identityToken + ", invalidationReason=" + this.invalidationReason + ", number=" + this.number + ')';
    }
}
