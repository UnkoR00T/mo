package ka3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ka3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lka3/a;", "", "Lka3/p$a$c$a;", "statement", "Lj1/a;", "bringIntoViewRequester", "<init>", "(Lka3/p$a$c$a;Lj1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lka3/p$a$c$a;", "b", "()Lka3/p$a$c$a;", "Lj1/a;", "()Lj1/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class StatementWithBringIntoView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p.a.InitializedSummary.Statement statement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final j1.a bringIntoViewRequester;

    public StatementWithBringIntoView(p.a.InitializedSummary.Statement statement, j1.a aVar) {
        this.statement = statement;
        this.bringIntoViewRequester = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j1.a getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p.a.InitializedSummary.Statement getStatement() {
        return this.statement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementWithBringIntoView)) {
            return false;
        }
        StatementWithBringIntoView statementWithBringIntoView = (StatementWithBringIntoView) other;
        return fr.t.c(this.statement, statementWithBringIntoView.statement) && fr.t.c(this.bringIntoViewRequester, statementWithBringIntoView.bringIntoViewRequester);
    }

    public int hashCode() {
        return (this.statement.hashCode() * 31) + this.bringIntoViewRequester.hashCode();
    }

    public String toString() {
        return "StatementWithBringIntoView(statement=" + this.statement + ", bringIntoViewRequester=" + this.bringIntoViewRequester + ')';
    }
}
