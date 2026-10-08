package jc2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jc2.h, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljc2/h;", "", "Lhl0/a$c;", "invalidationData", "Liy/b0;", "userEdorAddress", "Ljc2/d$c;", "statementData", "<init>", "(Lhl0/a$c;Liy/b0;Ljc2/d$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/a$c;", "()Lhl0/a$c;", "b", "Liy/b0;", "l", "()Liy/b0;", "c", "Ljc2/d$c;", "()Ljc2/d$c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Sending implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hl0.a.c invalidationData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 userEdorAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.StatementData statementData;

    public Sending(hl0.a.c cVar, iy.b0 b0Var, d.StatementData statementData) {
        this.invalidationData = cVar;
        this.userEdorAddress = b0Var;
        this.statementData = statementData;
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public hl0.a.c getInvalidationData() {
        return this.invalidationData;
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public d.StatementData getStatementData() {
        return this.statementData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sending)) {
            return false;
        }
        Sending sending = (Sending) other;
        return fr.t.c(this.invalidationData, sending.invalidationData) && fr.t.c(this.userEdorAddress, sending.userEdorAddress) && fr.t.c(this.statementData, sending.statementData);
    }

    public int hashCode() {
        return (((this.invalidationData.hashCode() * 31) + this.userEdorAddress.hashCode()) * 31) + this.statementData.hashCode();
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public iy.b0 getUserEdorAddress() {
        return this.userEdorAddress;
    }

    public String toString() {
        return "Sending(invalidationData=" + this.invalidationData + ", userEdorAddress=" + this.userEdorAddress + ", statementData=" + this.statementData + ')';
    }
}
