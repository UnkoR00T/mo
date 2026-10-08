package jc2;

import al0.BEGenerateXmlResponse;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jc2.j, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, d2 = {"Ljc2/j;", "", "Lhl0/a$d;", "invalidationData", "Liy/b0;", "userEdorAddress", "Ljc2/d$c;", "statementData", "Lal0/m;", "generateXmlResponse", "<init>", "(Lhl0/a$d;Liy/b0;Ljc2/d$c;Lal0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/a$d;", "d", "()Lhl0/a$d;", "b", "Liy/b0;", "l", "()Liy/b0;", "c", "Ljc2/d$c;", "()Ljc2/d$c;", "Lal0/m;", "()Lal0/m;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Submitting implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hl0.a.Theft invalidationData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 userEdorAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.StatementData statementData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEGenerateXmlResponse generateXmlResponse;

    public Submitting(hl0.a.Theft theft, iy.b0 b0Var, d.StatementData statementData, BEGenerateXmlResponse bEGenerateXmlResponse) {
        this.invalidationData = theft;
        this.userEdorAddress = b0Var;
        this.statementData = statementData;
        this.generateXmlResponse = bEGenerateXmlResponse;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEGenerateXmlResponse getGenerateXmlResponse() {
        return this.generateXmlResponse;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Submitting)) {
            return false;
        }
        Submitting submitting = (Submitting) other;
        return fr.t.c(this.invalidationData, submitting.invalidationData) && fr.t.c(this.userEdorAddress, submitting.userEdorAddress) && fr.t.c(this.statementData, submitting.statementData) && fr.t.c(this.generateXmlResponse, submitting.generateXmlResponse);
    }

    public int hashCode() {
        return (((((this.invalidationData.hashCode() * 31) + this.userEdorAddress.hashCode()) * 31) + this.statementData.hashCode()) * 31) + this.generateXmlResponse.hashCode();
    }

    @Override // jc2.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public iy.b0 getUserEdorAddress() {
        return this.userEdorAddress;
    }

    public String toString() {
        return "Submitting(invalidationData=" + this.invalidationData + ", userEdorAddress=" + this.userEdorAddress + ", statementData=" + this.statementData + ", generateXmlResponse=" + this.generateXmlResponse + ')';
    }
}
