package ka3;

import ia3.SummaryData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ka3.n, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lka3/n;", "", "Lia3/a;", "summaryData", "Lka3/k$b;", "statementData", "Lmb3/a;", "tripContext", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lia3/a;Lka3/k$b;Lmb3/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lia3/a;", "c", "()Lia3/a;", "b", "Lka3/k$b;", "()Lka3/k$b;", "Lmb3/a;", "d", "()Lmb3/a;", "Lhb4/c;", "f", "()Lhb4/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SummaryData summaryData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k.StatementData statementData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final mb3.a tripContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMSAdapter;

    public Error(SummaryData summaryData, k.StatementData statementData, mb3.a aVar, hb4.c cVar) {
        this.summaryData = summaryData;
        this.statementData = statementData;
        this.tripContext = aVar;
        this.errorVMSAdapter = cVar;
    }

    @Override // ka3.k.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public k.StatementData getStatementData() {
        return this.statementData;
    }

    @Override // ka3.k.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public SummaryData getSummaryData() {
        return this.summaryData;
    }

    @Override // ka3.k.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public mb3.a getTripContext() {
        return this.tripContext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.summaryData, error.summaryData) && fr.t.c(this.statementData, error.statementData) && fr.t.c(this.tripContext, error.tripContext) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hb4.c getErrorVMSAdapter() {
        return this.errorVMSAdapter;
    }

    public int hashCode() {
        return (((((this.summaryData.hashCode() * 31) + this.statementData.hashCode()) * 31) + this.tripContext.hashCode()) * 31) + this.errorVMSAdapter.hashCode();
    }

    public String toString() {
        return "Error(summaryData=" + this.summaryData + ", statementData=" + this.statementData + ", tripContext=" + this.tripContext + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
    }
}
