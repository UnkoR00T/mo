package t83;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.l;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import s83.d;
import s83.e;
import u83.ReportIssueReasonItem;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt83/b;", "Lxw/f;", "Lt83/b$a;", "Ls83/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lu83/b;", "reason", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Ln50/g;", "f", "(Lu83/b;Ler/a;)Ln50/g;", "params", "e", "(Lt83/b$a;)Ls83/e$a;", "a", "Lmx/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: t83.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lt83/b$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "reasonSelected", "Ls83/d;", "state", "<init>", "(Ler/a;Ler/a;Ls83/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "getReasonSelected", "c", "Ls83/d;", "()Ls83/d;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> reasonSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        public Params(er.a<i0> aVar, er.a<i0> aVar2, d dVar) {
            this.onBackAction = aVar;
            this.reasonSelected = aVar2;
            this.state = dVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onBackAction, params.onBackAction) && t.c(this.reasonSelected, params.reasonSelected) && t.c(this.state, params.state);
        }

        public int hashCode() {
            return (((this.onBackAction.hashCode() * 31) + this.reasonSelected.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "Params(onBackAction=" + this.onBackAction + ", reasonSelected=" + this.reasonSelected + ", state=" + this.state + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData f(final ReportIssueReasonItem reason, final er.a<i0> onBackAction) {
        return new DefaultSingleCardData(null, new er.a() { // from class: t83.a
            @Override // er.a
            public final Object a() {
                return b.h(reason, onBackAction);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(mx.b.b(reason.getLabel(), reason.getLabel()), null, null, 3, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(ReportIssueReasonItem reportIssueReasonItem, er.a aVar) {
        reportIssueReasonItem.b().a();
        aVar.a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (t.c(state, d.a.f179258a)) {
            return e.a.C4606a.f179260a;
        }
        if (!(state instanceof d.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(l83.a.f116992m), null, null, null, 28, null), null, null, null, null, 61, null);
        List<ReportIssueReasonItem> listA = ((d.Initialized) params.getState()).getSetupData().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((ReportIssueReasonItem) it.next(), params.a()));
        }
        return new e.a.Initialized(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), params.a());
    }
}
