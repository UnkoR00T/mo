package tq0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Ltq0/n;", "", "Ltq0/o;", "status", "Lfz/b$f;", "verificationDate", "Ltq0/m;", "verificationId", "Ltq0/a;", "documentCopyId", "", "number", "Ltq0/g;", "type", "<init>", "(Ltq0/o;Lfz/b$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq0/g;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/o;", "c", "()Ltq0/o;", "b", "Lfz/b$f;", "e", "()Lfz/b$f;", "Ljava/lang/String;", "f", "d", "Ltq0/g;", "()Ltq0/g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fz.b.OffsetDateTime verificationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String verificationId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String documentCopyId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g type;

    public /* synthetic */ n(o oVar, fz.b.OffsetDateTime offsetDateTime, String str, String str2, String str3, g gVar, fr.k kVar) {
        this(oVar, offsetDateTime, str, str2, str3, gVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentCopyId() {
        return this.documentCopyId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fz.b.OffsetDateTime getVerificationDate() {
        return this.verificationDate;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    public boolean equals(Object other) {
        boolean zB;
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        if (this.status != nVar.status || !fr.t.c(this.verificationDate, nVar.verificationDate) || !m.b(this.verificationId, nVar.verificationId)) {
            return false;
        }
        String str = this.documentCopyId;
        String str2 = nVar.documentCopyId;
        if (str == null) {
            if (str2 == null) {
                zB = true;
            } else {
                zB = false;
            }
        } else if (str2 == null) {
            zB = false;
        } else {
            zB = a.b(str, str2);
        }
        return zB && fr.t.c(this.number, nVar.number) && this.type == nVar.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getVerificationId() {
        return this.verificationId;
    }

    public int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + this.verificationDate.hashCode()) * 31) + m.c(this.verificationId)) * 31;
        String str = this.documentCopyId;
        int iC = (iHashCode + (str == null ? 0 : a.c(str))) * 31;
        String str2 = this.number;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        g gVar = this.type;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        o oVar = this.status;
        fz.b.OffsetDateTime offsetDateTime = this.verificationDate;
        String strD = m.d(this.verificationId);
        String str = this.documentCopyId;
        return "BEVerifyDocumentResponse(status=" + oVar + ", verificationDate=" + offsetDateTime + ", verificationId=" + strD + ", documentCopyId=" + (str == null ? "null" : a.d(str)) + ", number=" + this.number + ", type=" + this.type + ")";
    }

    private n(o oVar, fz.b.OffsetDateTime offsetDateTime, String str, String str2, String str3, g gVar) {
        this.status = oVar;
        this.verificationDate = offsetDateTime;
        this.verificationId = str;
        this.documentCopyId = str2;
        this.number = str3;
        this.type = gVar;
    }
}
