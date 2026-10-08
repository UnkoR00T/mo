package b52;

import er.l;
import fr.t;
import g52.StampDutyEmptySectionData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import k30.d;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lb52/c;", "Lxw/f;", "Lb52/c$a;", "La52/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lb52/c$a;)La52/c$a;", "a", "Lmx/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, a52.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b52.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b)\u0010\"R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\u001c\u0010(R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b+\u0010\"R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b*\u0010\"¨\u0006,"}, d2 = {"Lb52/c$a;", "", "La52/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onBackWithSearchAction", "onCloseAction", "onCloseProcessAction", "Lkotlin/Function1;", "", "onChangeQueryAction", "onQueryClearAction", "", "changeSearchActiveStateAction", "setWithDataStateAction", "setNoDataState", "<init>", "(La52/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "La52/b;", "j", "()La52/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "f", "Ler/l;", "()Ler/l;", "g", "h", "i", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a52.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackWithSearchAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseProcessAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeQueryAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onQueryClearAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> changeSearchActiveStateAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> setWithDataStateAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> setNoDataState;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(a52.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super String, i0> lVar, er.a<i0> aVar5, l<? super Boolean, i0> lVar2, er.a<i0> aVar6, er.a<i0> aVar7) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onBackWithSearchAction = aVar2;
            this.onCloseAction = aVar3;
            this.onCloseProcessAction = aVar4;
            this.onChangeQueryAction = lVar;
            this.onQueryClearAction = aVar5;
            this.changeSearchActiveStateAction = lVar2;
            this.setWithDataStateAction = aVar6;
            this.setNoDataState = aVar7;
        }

        public final l<Boolean, i0> a() {
            return this.changeSearchActiveStateAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onBackWithSearchAction;
        }

        public final l<String, i0> d() {
            return this.onChangeQueryAction;
        }

        public final er.a<i0> e() {
            return this.onCloseAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onBackWithSearchAction, params.onBackWithSearchAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onCloseProcessAction, params.onCloseProcessAction) && t.c(this.onChangeQueryAction, params.onChangeQueryAction) && t.c(this.onQueryClearAction, params.onQueryClearAction) && t.c(this.changeSearchActiveStateAction, params.changeSearchActiveStateAction) && t.c(this.setWithDataStateAction, params.setWithDataStateAction) && t.c(this.setNoDataState, params.setNoDataState);
        }

        public final er.a<i0> f() {
            return this.onCloseProcessAction;
        }

        public final er.a<i0> g() {
            return this.onQueryClearAction;
        }

        public final er.a<i0> h() {
            return this.setNoDataState;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onBackWithSearchAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onCloseProcessAction.hashCode()) * 31) + this.onChangeQueryAction.hashCode()) * 31) + this.onQueryClearAction.hashCode()) * 31) + this.changeSearchActiveStateAction.hashCode()) * 31) + this.setWithDataStateAction.hashCode()) * 31) + this.setNoDataState.hashCode();
        }

        public final er.a<i0> i() {
            return this.setWithDataStateAction;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final a52.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onBackWithSearchAction=" + this.onBackWithSearchAction + ", onCloseAction=" + this.onCloseAction + ", onCloseProcessAction=" + this.onCloseProcessAction + ", onChangeQueryAction=" + this.onChangeQueryAction + ", onQueryClearAction=" + this.onQueryClearAction + ", changeSearchActiveStateAction=" + this.changeSearchActiveStateAction + ", setWithDataStateAction=" + this.setWithDataStateAction + ", setNoDataState=" + this.setNoDataState + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a52.c.a b(Params params) {
        a52.b state = params.getState();
        if (t.c(state, a52.b.a.f3531a)) {
            return new a52.c.a.Initial(params.i(), params.h(), params.b());
        }
        if (t.c(state, a52.b.C0057b.f3532a)) {
            return new a52.c.a.NoData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(t32.b.f187456g1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.f(), 6, null)), null, 20, null), null, null, null, null, 61, null), new IconPageData(new j.a(0, 1, null), this.labelProvider.c(t32.b.f187447d1), this.labelProvider.c(t32.b.f187443c1), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.f187445d), null, 2, null), d.a.f107773a, null, params.f(), 35, null), null, null, 6, null), false, 72, null), params.b());
        }
        if (state instanceof a52.b.WithData) {
            return new a52.c.a.WithData(new BaseScaffoldData(null, !((a52.b.WithData) params.getState()).getIsSearchActive() ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(t32.b.f187456g1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.e(), 6, null)), null, 20, null) : null, null, null, null, null, 61, null), !((a52.b.WithData) params.getState()).getIsSearchActive() ? this.labelProvider.c(t32.b.f187450e1) : null, new StampDutyEmptySectionData(this.labelProvider.c(t32.b.f187468k1), this.labelProvider.c(t32.b.f187465j1), this.labelProvider.c(t32.b.f187459h1)), new SearchBarData(((a52.b.WithData) params.getState()).getQuery(), params.d(), ((a52.b.WithData) params.getState()).getIsSearchActive(), params.a(), params.g(), this.labelProvider.c(t32.b.f187493t), null, null, 64, null), params.c());
        }
        throw new p();
    }
}
