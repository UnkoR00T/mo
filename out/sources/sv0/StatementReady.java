package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.g0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001a\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b \u0010\u000f¨\u0006$"}, d2 = {"Lsv0/g0;", "", "", "regenerateStatement", "Lsv0/s0;", "status", "Lsv0/l;", "collisionRole", "Lsv0/x;", "pdfFile", "", "statementNumber", "<init>", "(ZLsv0/s0;Lsv0/l;Lsv0/x;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lsv0/s0;", "e", "()Lsv0/s0;", "Lsv0/l;", "()Lsv0/l;", "d", "Lsv0/x;", "()Lsv0/x;", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementReady {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean regenerateStatement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s0 status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l collisionRole;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PdfFile pdfFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statementNumber;

    public StatementReady(boolean z15, s0 s0Var, l lVar, PdfFile pdfFile, String str) {
        this.regenerateStatement = z15;
        this.status = s0Var;
        this.collisionRole = lVar;
        this.pdfFile = pdfFile;
        this.statementNumber = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getCollisionRole() {
        return this.collisionRole;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PdfFile getPdfFile() {
        return this.pdfFile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRegenerateStatement() {
        return this.regenerateStatement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatementNumber() {
        return this.statementNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s0 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementReady)) {
            return false;
        }
        StatementReady statementReady = (StatementReady) other;
        return this.regenerateStatement == statementReady.regenerateStatement && this.status == statementReady.status && this.collisionRole == statementReady.collisionRole && fr.t.c(this.pdfFile, statementReady.pdfFile) && fr.t.c(this.statementNumber, statementReady.statementNumber);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.regenerateStatement) * 31) + this.status.hashCode()) * 31) + this.collisionRole.hashCode()) * 31;
        PdfFile pdfFile = this.pdfFile;
        int iHashCode2 = (iHashCode + (pdfFile == null ? 0 : pdfFile.hashCode())) * 31;
        String str = this.statementNumber;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "StatementReady(regenerateStatement=" + this.regenerateStatement + ", status=" + this.status + ", collisionRole=" + this.collisionRole + ", pdfFile=" + this.pdfFile + ", statementNumber=" + this.statementNumber + ")";
    }
}
