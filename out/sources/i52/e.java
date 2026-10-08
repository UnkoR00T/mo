package i52;

import er.l;
import fr.t;
import g52.StampDutyEmptySectionData;
import h52.State;
import h52.h;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Li52/e;", "Lxw/f;", "Li52/e$a;", "Lh52/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Li52/e$a;)Lh52/h$a;", "a", "Lmx/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: i52.e$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u001eR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006$"}, d2 = {"Li52/e$a;", "", "Lh52/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackWithSearchAction", "onCloseAction", "Lkotlin/Function1;", "", "onChangeQueryAction", "onQueryClearAction", "", "changeSearchActiveStateAction", "<init>", "(Lh52/g;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lh52/g;", "f", "()Lh52/g;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "e", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackWithSearchAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeQueryAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onQueryClearAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> changeSearchActiveStateAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, er.a<i0> aVar3, l<? super Boolean, i0> lVar2) {
            this.state = state;
            this.onBackWithSearchAction = aVar;
            this.onCloseAction = aVar2;
            this.onChangeQueryAction = lVar;
            this.onQueryClearAction = aVar3;
            this.changeSearchActiveStateAction = lVar2;
        }

        public final l<Boolean, i0> a() {
            return this.changeSearchActiveStateAction;
        }

        public final er.a<i0> b() {
            return this.onBackWithSearchAction;
        }

        public final l<String, i0> c() {
            return this.onChangeQueryAction;
        }

        public final er.a<i0> d() {
            return this.onCloseAction;
        }

        public final er.a<i0> e() {
            return this.onQueryClearAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackWithSearchAction, params.onBackWithSearchAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onChangeQueryAction, params.onChangeQueryAction) && t.c(this.onQueryClearAction, params.onQueryClearAction) && t.c(this.changeSearchActiveStateAction, params.changeSearchActiveStateAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackWithSearchAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onChangeQueryAction.hashCode()) * 31) + this.onQueryClearAction.hashCode()) * 31) + this.changeSearchActiveStateAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackWithSearchAction=" + this.onBackWithSearchAction + ", onCloseAction=" + this.onCloseAction + ", onChangeQueryAction=" + this.onChangeQueryAction + ", onQueryClearAction=" + this.onQueryClearAction + ", changeSearchActiveStateAction=" + this.changeSearchActiveStateAction + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        return new h.Data(new BaseScaffoldData(null, !params.getState().getIsSearchActive() ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(t32.b.f187456g1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null) : null, null, null, null, null, 61, null), !params.getState().getIsSearchActive() ? this.labelProvider.c(t32.b.f187483p1) : null, !params.getState().getIsSearchActive() ? this.labelProvider.c(t32.b.f187480o1) : null, new StampDutyEmptySectionData(this.labelProvider.c(t32.b.f187468k1), this.labelProvider.c(t32.b.f187465j1), this.labelProvider.c(t32.b.f187462i1)), new SearchBarData(params.getState().getQuery(), params.c(), params.getState().getIsSearchActive(), params.a(), params.e(), this.labelProvider.c(t32.b.f187460i), null, null, 64, null), params.b());
    }
}
