package pa3;

import fr.t;
import ka3.p;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x40.LinkData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpa3/k;", "Lxw/f;", "Lpa3/k$a;", "Lka3/p$a$c$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "c", "(Lpa3/k$a;)Lka3/p$a$c$a;", "a", "Lmx/c;", "b", "Lu04/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, p.a.InitializedSummary.Statement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: pa3.k$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Lpa3/k$a;", "", "Lka3/k$b;", "statementData", "Lkotlin/Function1;", "", "Loq/i0;", "onStatementLinkClicked", "", "onStatementChecked", "Lkotlin/Function0;", "onScrolledToError", "<init>", "(Lka3/k$b;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lka3/k$b;", "d", "()Lka3/k$b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ka3.k.StatementData statementData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onStatementLinkClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onStatementChecked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ka3.k.StatementData statementData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, er.a<i0> aVar) {
            this.statementData = statementData;
            this.onStatementLinkClicked = lVar;
            this.onStatementChecked = lVar2;
            this.onScrolledToError = aVar;
        }

        public final er.a<i0> a() {
            return this.onScrolledToError;
        }

        public final er.l<Boolean, i0> b() {
            return this.onStatementChecked;
        }

        public final er.l<String, i0> c() {
            return this.onStatementLinkClicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ka3.k.StatementData getStatementData() {
            return this.statementData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.statementData, params.statementData) && t.c(this.onStatementLinkClicked, params.onStatementLinkClicked) && t.c(this.onStatementChecked, params.onStatementChecked) && t.c(this.onScrolledToError, params.onScrolledToError);
        }

        public int hashCode() {
            return (((((this.statementData.hashCode() * 31) + this.onStatementLinkClicked.hashCode()) * 31) + this.onStatementChecked.hashCode()) * 31) + this.onScrolledToError.hashCode();
        }

        public String toString() {
            return "Params(statementData=" + this.statementData + ", onStatementLinkClicked=" + this.onStatementLinkClicked + ", onStatementChecked=" + this.onStatementChecked + ", onScrolledToError=" + this.onScrolledToError + ')';
        }
    }

    public k(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p.a.InitializedSummary.Statement b(Params params) {
        r30.b error;
        Label labelC = this.labelProvider.c(r93.a.S);
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, params.getStatementData().getStatementState() instanceof ka3.k.StatementData.a.C2616a, params.b(), this.labelProvider.c(r93.a.P0), null, null, new r30.d.Link(new LinkData(null, this.labelProvider.c(r93.a.Q0), this.commonEndpoints.U(), LinkData.EnumC5775a.WEBSITE, false, params.c(), 17, null)), null, 177, null);
        boolean z15 = params.getStatementData().getStatementState() instanceof ka3.k.StatementData.a.C2617b;
        if (z15) {
            error = new r30.b.Error(null, this.labelProvider.c(r93.a.T), 1, null);
        } else {
            if (z15) {
                throw new oq.p();
            }
            error = r30.b.a.f171263a;
        }
        return new p.a.InitializedSummary.Statement(labelC, new CheckBoxSingleData(checkBoxRowData, error, null, false, null, 28, null), params.getStatementData().getScrollTo(), params.a());
    }
}
