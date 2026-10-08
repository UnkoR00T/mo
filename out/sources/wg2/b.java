package wg2;

import er.l;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import iy.c0;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mg2.g;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import tq0.MyRegistry;
import vg2.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwg2/b;", "Lxw/f;", "Lwg2/b$a;", "Lvg2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Ltq0/u;", "", "query", "e", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "params", "f", "(Lwg2/b$a;)Lvg2/c$a;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: wg2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lwg2/b$a;", "", "Lvg2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "", "onChangeSearchActive", "", "onChangeSearchQuery", "onClearSearchQuery", "onExitSearch", "Ltq0/u;", "onItemSelected", "<init>", "(Lvg2/b;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvg2/b;", "g", "()Lvg2/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "f", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vg2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onChangeSearchActive;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeSearchQuery;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearSearchQuery;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitSearch;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<MyRegistry, i0> onItemSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(vg2.b bVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, l<? super MyRegistry, i0> lVar3) {
            this.state = bVar;
            this.onBack = aVar;
            this.onChangeSearchActive = lVar;
            this.onChangeSearchQuery = lVar2;
            this.onClearSearchQuery = aVar2;
            this.onExitSearch = aVar3;
            this.onItemSelected = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<Boolean, i0> b() {
            return this.onChangeSearchActive;
        }

        public final l<String, i0> c() {
            return this.onChangeSearchQuery;
        }

        public final er.a<i0> d() {
            return this.onClearSearchQuery;
        }

        public final er.a<i0> e() {
            return this.onExitSearch;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onChangeSearchActive, params.onChangeSearchActive) && t.c(this.onChangeSearchQuery, params.onChangeSearchQuery) && t.c(this.onClearSearchQuery, params.onClearSearchQuery) && t.c(this.onExitSearch, params.onExitSearch) && t.c(this.onItemSelected, params.onItemSelected);
        }

        public final l<MyRegistry, i0> f() {
            return this.onItemSelected;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final vg2.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onChangeSearchActive.hashCode()) * 31) + this.onChangeSearchQuery.hashCode()) * 31) + this.onClearSearchQuery.hashCode()) * 31) + this.onExitSearch.hashCode()) * 31) + this.onItemSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onChangeSearchActive=" + this.onChangeSearchActive + ", onChangeSearchQuery=" + this.onChangeSearchQuery + ", onClearSearchQuery=" + this.onClearSearchQuery + ", onExitSearch=" + this.onExitSearch + ", onItemSelected=" + this.onItemSelected + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<MyRegistry> e(List<MyRegistry> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MyRegistry myRegistry = (MyRegistry) obj;
            StringBuilder sb5 = new StringBuilder();
            String text = this.labelProvider.c(g.a(myRegistry.getType())).getText();
            String strE = c0.e(myRegistry.getNumber());
            String strE2 = myRegistry.e();
            sb5.append(text);
            sb5.append(strE);
            sb5.append(strE2);
            if (r.b0(sb5.toString(), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, MyRegistry myRegistry) {
        params.f().b(myRegistry);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        vg2.b state = params.getState();
        if (t.c(state, vg2.b.c.f206713a)) {
            return new c.a.Initial(params.a());
        }
        if (!(state instanceof vg2.b.Content)) {
            if (state instanceof vg2.b.Error) {
                return new c.a.Error(params.a(), ((vg2.b.Error) state).getAdapter());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.B0), null, null, null, 28, null), null, null, null, null, 61, null);
        vg2.b.Content content = (vg2.b.Content) state;
        boolean zIsEmpty = content.c().isEmpty();
        if (zIsEmpty) {
            return new c.a.InterfaceC5408a.Empty(params.a(), baseScaffoldData, new IconPageData(new j.a(jz.a.f106856r2), this.labelProvider.c(xf2.a.D0), this.labelProvider.c(xf2.a.C0), null, null, null, false, 72, null));
        }
        if (zIsEmpty) {
            throw new p();
        }
        List<MyRegistry> listE = e(content.c(), content.getSearchQuery());
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        int i15 = 0;
        while (true) {
            SingleCardLabel singleCardLabel = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final MyRegistry myRegistry = (MyRegistry) next;
            String str = "registryCard_" + i15;
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(g.a(myRegistry.getType())), null, null, 0, 0, null, 62, null);
            n50.b statusBadge = myRegistry.getOpen() == MyRegistry.b.Closed ? new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.b(c0.e(myRegistry.getNumber()), ""), null, 0, false, r50.g.MINUS, 13, null)) : new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(myRegistry.getNumber()), ""), null, null, 0, 0, null, 62, null));
            SingleCardLabel singleCardLabel3 = new SingleCardLabel(mx.b.b(myRegistry.e(), ""), null, null, 0, 0, null, 62, null);
            if (!myRegistry.i().isEmpty()) {
                singleCardLabel = singleCardLabel3;
            }
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: wg2.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, myRegistry);
                }
            }, false, null, null, false, null, null, new BodySection(singleCardLabel2, statusBadge, singleCardLabel), null, x0.Icon.INSTANCE.b(), null, 2812, null));
            i15 = i16;
        }
        er.a<i0> aVarE = content.getSearchIsActive() ? params.e() : params.a();
        if (content.getSearchIsActive()) {
            baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        }
        return new c.a.InterfaceC5408a.Cards(aVarE, baseScaffoldData, content.getSearchQuery().length() == 0 ? new c30.b.c(null, null, null, this.labelProvider.c(xf2.a.C0), null, null, null, 119, null) : null, arrayList, new SearchBarData(content.getSearchQuery(), params.c(), content.getSearchIsActive(), params.b(), params.d(), this.labelProvider.c(xf2.a.f218400t), null, Integer.valueOf(arrayList.size()), 64, null), this.labelProvider.c(xf2.a.f218391q), this.labelProvider.c(xf2.a.f218406v));
    }
}
