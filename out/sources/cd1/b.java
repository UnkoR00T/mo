package cd1;

import androidx.compose.ui.graphics.Color;
import bd1.State;
import bd1.g;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import ld1.SearchModel;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b*\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcd1/b;", "Lxw/f;", "Lcd1/b$a;", "Lbd1/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lld1/m$a;", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "Ln50/g;", "f", "(Ljava/util/List;Ler/a;)Ljava/util/List;", "params", "e", "(Lcd1/b$a;)Lbd1/g$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: cd1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcd1/b$a;", "", "Lbd1/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onQueryChanged", "", "onActiveChanged", "Lkotlin/Function0;", "onClearClicked", "onCloseClick", "<init>", "(Lbd1/f;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbd1/f;", "e", "()Lbd1/f;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onActiveChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onQueryChanged = lVar;
            this.onActiveChanged = lVar2;
            this.onClearClicked = aVar;
            this.onCloseClick = aVar2;
        }

        public final l<Boolean, i0> a() {
            return this.onActiveChanged;
        }

        public final er.a<i0> b() {
            return this.onClearClicked;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public final l<String, i0> d() {
            return this.onQueryChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onQueryChanged, params.onQueryChanged) && t.c(this.onActiveChanged, params.onActiveChanged) && t.c(this.onClearClicked, params.onClearClicked) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onQueryChanged.hashCode()) * 31) + this.onActiveChanged.hashCode()) * 31) + this.onClearClicked.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onQueryChanged=" + this.onQueryChanged + ", onActiveChanged=" + this.onActiveChanged + ", onClearClicked=" + this.onClearClicked + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    /* JADX INFO: renamed from: cd1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0678b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0678b f25471a = new C0678b();

        C0678b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1804779917);
            if (p076m2.t.k()) {
                p076m2.t.o(-1804779917, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.search.mapper.SearchMapper.mapToSingleCardList.<anonymous>.<anonymous>.<anonymous> (SearchMapper.kt:84)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> f(List<SearchModel.a> list, final er.a<i0> aVar) {
        List<SearchModel.a> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final SearchModel.a aVar2 : list2) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: cd1.a
                @Override // er.a
                public final Object a() {
                    return b.h(aVar, aVar2);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(aVar2.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), null, null, 3, null)), aVar2.getDescription() != null ? new SingleCardLabel(aVar2.getDescription(), null, null, 0, 0, null, 62, null) : null, 1, null), null, (aVar2.getIsSelected() ? aVar2 : null) != null ? new x0.Icon(jz.a.f106783h, null, C0678b.f25471a, 2, null) : null, null, 2813, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(er.a aVar, SearchModel.a aVar2) {
        aVar.a();
        aVar2.c().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        i.Small small;
        State state = params.getState();
        if (state.getIsActive()) {
            state = null;
        }
        if (state != null) {
            small = new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), params.getState().getSearchModel().getTitleLabel(), null, null, null, 28, null);
        } else {
            small = null;
        }
        return new g.Data(new BaseScaffoldData(null, small, null, null, null, null, 61, null), new SearchBarData(params.getState().getQuery(), params.d(), params.getState().getIsActive(), params.a(), params.b(), params.getState().getSearchModel().getPlaceholderLabel(), null, Integer.valueOf(params.getState().e().size()), 64, null), new CardListData(f(params.getState().e(), params.c()), null, false, null, null, 30, null), new EmptyStateData(this.labelProvider.c(ha1.a.R), this.labelProvider.c(ha1.a.f82427j0), null, 4, null), params.c());
    }
}
