package tp3;

import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oo0.EndedIdeaVoteRound;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sp3.Section;
import sp3.i;
import sp3.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ltp3/b;", "Lxw/f;", "Ltp3/b$a;", "Lsp3/j$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "f", "(Ler/a;)Li50/a;", "", "Loo0/e;", "Lkotlin/Function1;", "onClick", "Lsp3/h;", "m", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "Ln30/b;", "h", "(Ljava/util/List;Ler/l;)Ln30/b;", "Lmx/a;", "l", "(Loo0/e;)Lmx/a;", "params", "e", "(Ltp3/b$a;)Lsp3/j$a;", "a", "Lmx/c;", "b", "Lez/e;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: tp3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Ltp3/b$a;", "", "Lsp3/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Loo0/e;", "onResultClick", "<init>", "(Lsp3/i;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp3/i;", "c", "()Lsp3/i;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<EndedIdeaVoteRound, i0> onResultClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i iVar, er.a<i0> aVar, l<? super EndedIdeaVoteRound, i0> lVar) {
            this.state = iVar;
            this.onBack = aVar;
            this.onResultClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<EndedIdeaVoteRound, i0> b() {
            return this.onResultClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onResultClick, params.onResultClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onResultClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onResultClick=" + this.onResultClick + ')';
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final BaseScaffoldData f(er.a<i0> onBack) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(gp3.a.I), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final CardListData h(List<EndedIdeaVoteRound> list, final l<? super EndedIdeaVoteRound, i0> lVar) {
        List<EndedIdeaVoteRound> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final EndedIdeaVoteRound endedIdeaVoteRound : list2) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: tp3.a
                @Override // er.a
                public final Object a() {
                    return b.i(lVar, endedIdeaVoteRound);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(endedIdeaVoteRound.getMobileName(), endedIdeaVoteRound.getMobileName()), null, null, 3, null)), n50.l.b(l(endedIdeaVoteRound), null, null, 3, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, EndedIdeaVoteRound endedIdeaVoteRound) {
        lVar.b(endedIdeaVoteRound);
        return i0.f148189a;
    }

    private final Label l(EndedIdeaVoteRound endedIdeaVoteRound) {
        c cVar = this.labelProvider;
        int i15 = gp3.a.G;
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(endedIdeaVoteRound.getStartDate());
        fz.c cVar2 = fz.c.MONTH_DATE_DOT;
        return cVar.e(i15, eVar.d(offsetDateTime, cVar2), this.dateFormatter.d(new fz.b.OffsetDateTime(endedIdeaVoteRound.getEndDate()), cVar2));
    }

    private final List<Section> m(List<EndedIdeaVoteRound> list, l<? super EndedIdeaVoteRound, i0> lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer numValueOf = Integer.valueOf(((EndedIdeaVoteRound) obj).getStartDate().getYear());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new Section(new Label(String.valueOf(((Number) entry.getKey()).intValue()), "roundYearTitle" + entry), h((List) entry.getValue(), lVar)));
        }
        return arrayList2;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j.a b(Params params) {
        i state = params.getState();
        if (t.c(state, i.b.f183456a)) {
            return j.a.b.f183459a;
        }
        if (state instanceof i.Initialized) {
            return new j.a.Initialized(f(params.a()), m(((i.Initialized) params.getState()).a(), params.b()));
        }
        throw new p();
    }
}
