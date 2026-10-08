package jc2;

import al0.BEGenerateXmlResponse;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jc2.i, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"Ljc2/i;", "", "Ljc2/d$a;", "Lhl0/a$d;", "invalidationData", "Liy/b0;", "userEdorAddress", "Ljc2/d$c;", "statementData", "Lhb4/c;", "vmsAdapter", "Lal0/m;", "response", "<init>", "(Lhl0/a$d;Liy/b0;Ljc2/d$c;Lhb4/c;Lal0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/a$d;", "d", "()Lhl0/a$d;", "b", "Liy/b0;", "l", "()Liy/b0;", "c", "Ljc2/d$c;", "()Ljc2/d$c;", "Lhb4/c;", "()Lhb4/c;", "e", "Lal0/m;", "()Lal0/m;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements d, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hl0.a.Theft invalidationData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 userEdorAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.StatementData statementData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEGenerateXmlResponse response;

    public Error(hl0.a.Theft theft, iy.b0 b0Var, d.StatementData statementData, hb4.c cVar, BEGenerateXmlResponse bEGenerateXmlResponse) {
        this.invalidationData = theft;
        this.userEdorAddress = b0Var;
        this.statementData = statementData;
        this.vmsAdapter = cVar;
        this.response = bEGenerateXmlResponse;
    }

    @Override // jc2.d.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public d.StatementData getStatementData() {
        return this.statementData;
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public hl0.a.Theft getInvalidationData() {
        return this.invalidationData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEGenerateXmlResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.invalidationData, error.invalidationData) && fr.t.c(this.userEdorAddress, error.userEdorAddress) && fr.t.c(this.statementData, error.statementData) && fr.t.c(this.vmsAdapter, error.vmsAdapter) && fr.t.c(this.response, error.response);
    }

    public int hashCode() {
        return (((((((this.invalidationData.hashCode() * 31) + this.userEdorAddress.hashCode()) * 31) + this.statementData.hashCode()) * 31) + this.vmsAdapter.hashCode()) * 31) + this.response.hashCode();
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public iy.b0 getUserEdorAddress() {
        return this.userEdorAddress;
    }

    public String toString() {
        return "Error(invalidationData=" + this.invalidationData + ", userEdorAddress=" + this.userEdorAddress + ", statementData=" + this.statementData + ", vmsAdapter=" + this.vmsAdapter + ", response=" + this.response + ')';
    }
}
