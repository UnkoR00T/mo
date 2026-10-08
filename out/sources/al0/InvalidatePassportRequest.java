package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.g0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lal0/g0;", "", "", "id", "Lny/a;", "identityToken", "Lal0/o0;", "invalidationReason", "number", "<init>", "(Ljava/lang/String;Liy/b0;Lal0/o0;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "()Liy/b0;", "c", "Lal0/o0;", "()Lal0/o0;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvalidatePassportRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 identityToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final o0 invalidationReason;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    public /* synthetic */ InvalidatePassportRequest(String str, iy.b0 b0Var, o0 o0Var, String str2, fr.k kVar) {
        this(str, b0Var, o0Var, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getIdentityToken() {
        return this.identityToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o0 getInvalidationReason() {
        return this.invalidationReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvalidatePassportRequest)) {
            return false;
        }
        InvalidatePassportRequest invalidatePassportRequest = (InvalidatePassportRequest) other;
        return fr.t.c(this.id, invalidatePassportRequest.id) && ny.a.d(this.identityToken, invalidatePassportRequest.identityToken) && this.invalidationReason == invalidatePassportRequest.invalidationReason && fr.t.c(this.number, invalidatePassportRequest.number);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + ny.a.e(this.identityToken)) * 31) + this.invalidationReason.hashCode()) * 31) + this.number.hashCode();
    }

    public String toString() {
        return "InvalidatePassportRequest(id=" + this.id + ", identityToken=" + ny.a.f(this.identityToken) + ", invalidationReason=" + this.invalidationReason + ", number=" + this.number + ")";
    }

    private InvalidatePassportRequest(String str, iy.b0 b0Var, o0 o0Var, String str2) {
        this.id = str;
        this.identityToken = b0Var;
        this.invalidationReason = o0Var;
        this.number = str2;
    }
}
