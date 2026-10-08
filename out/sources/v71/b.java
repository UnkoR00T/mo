package v71;

import cl0.BEPassportChildApplicationCountryDictionary;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import u71.State;
import u71.i;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lv71/b;", "Lxw/f;", "Lv71/b$a;", "Lu71/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lu71/h;", "", "Lcl0/o;", "e", "(Lu71/h;)Ljava/util/List;", "params", "f", "(Lv71/b$a;)Lu71/i$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: v71.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010 R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006%"}, d2 = {"Lv71/b$a;", "", "Lu71/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lcl0/o;", "goBackWithResult", "", "onQueryChangeAction", "onClearQueryAction", "", "changeIsSearchActiveAction", "<init>", "(Lu71/h;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lu71/h;", "f", "()Lu71/h;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "()Ler/l;", "d", "e", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEPassportChildApplicationCountryDictionary, i0> goBackWithResult;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChangeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearQueryAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> changeIsSearchActiveAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super BEPassportChildApplicationCountryDictionary, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2, l<? super Boolean, i0> lVar3) {
            this.state = state;
            this.onBackAction = aVar;
            this.goBackWithResult = lVar;
            this.onQueryChangeAction = lVar2;
            this.onClearQueryAction = aVar2;
            this.changeIsSearchActiveAction = lVar3;
        }

        public final l<Boolean, i0> a() {
            return this.changeIsSearchActiveAction;
        }

        public final l<BEPassportChildApplicationCountryDictionary, i0> b() {
            return this.goBackWithResult;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onClearQueryAction;
        }

        public final l<String, i0> e() {
            return this.onQueryChangeAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.goBackWithResult, params.goBackWithResult) && t.c(this.onQueryChangeAction, params.onQueryChangeAction) && t.c(this.onClearQueryAction, params.onClearQueryAction) && t.c(this.changeIsSearchActiveAction, params.changeIsSearchActiveAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.goBackWithResult.hashCode()) * 31) + this.onQueryChangeAction.hashCode()) * 31) + this.onClearQueryAction.hashCode()) * 31) + this.changeIsSearchActiveAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", goBackWithResult=" + this.goBackWithResult + ", onQueryChangeAction=" + this.onQueryChangeAction + ", onClearQueryAction=" + this.onClearQueryAction + ", changeIsSearchActiveAction=" + this.changeIsSearchActiveAction + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final List<BEPassportChildApplicationCountryDictionary> e(State state) {
        return state.getQuery().length() > 0 ? state.e() : state.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary) {
        params.b().b(bEPassportChildApplicationCountryDictionary);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(w51.a.B4), null, null, null, 28, null), null, null, null, null, 61, null);
        List<BEPassportChildApplicationCountryDictionary> listE = e(params.getState());
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        for (final BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary : listE) {
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEPassportChildApplicationCountryDictionary.getName(), "country"), null, null, 0, 0, null, 62, null)), null, 5, null);
            x0.Icon iconA = x0.Icon.INSTANCE.a();
            if (!t.c(params.getState().getSelectedCorrespondence(), bEPassportChildApplicationCountryDictionary)) {
                iconA = null;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: v71.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, bEPassportChildApplicationCountryDictionary);
                }
            }, false, null, null, false, null, null, bodySection, null, iconA, null, 2813, null));
        }
        return new i.Data(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), params.c(), new SearchBarData(params.getState().getQuery(), params.e(), params.getState().getIsSearchActive(), params.a(), params.d(), this.labelProvider.c(w51.a.f210462y4), null, Integer.valueOf(params.getState().e().size()), 64, null), new i.NoSearchResultsData(this.labelProvider.c(w51.a.f210386n4), this.labelProvider.c(w51.a.J4)));
    }
}
