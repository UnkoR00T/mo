package x22;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import m02.SearchModel;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import w22.State;
import w22.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lx22/b;", "Lxw/f;", "Lx22/b$a;", "Lw22/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lx22/b$a;)Lw22/g$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: x22.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lx22/b$a;", "", "Lw22/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "queryChanged", "", "activeChanged", "Lkotlin/Function0;", "clearClicked", "closeClicked", "<init>", "(Lw22/f;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lw22/f;", "e", "()Lw22/f;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> queryChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> activeChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> clearClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.queryChanged = lVar;
            this.activeChanged = lVar2;
            this.clearClicked = aVar;
            this.closeClicked = aVar2;
        }

        public final l<Boolean, i0> a() {
            return this.activeChanged;
        }

        public final er.a<i0> b() {
            return this.clearClicked;
        }

        public final er.a<i0> c() {
            return this.closeClicked;
        }

        public final l<String, i0> d() {
            return this.queryChanged;
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
            return t.c(this.state, params.state) && t.c(this.queryChanged, params.queryChanged) && t.c(this.activeChanged, params.activeChanged) && t.c(this.clearClicked, params.clearClicked) && t.c(this.closeClicked, params.closeClicked);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.queryChanged.hashCode()) * 31) + this.activeChanged.hashCode()) * 31) + this.clearClicked.hashCode()) * 31) + this.closeClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", queryChanged=" + this.queryChanged + ", activeChanged=" + this.activeChanged + ", clearClicked=" + this.clearClicked + ", closeClicked=" + this.closeClicked + ')';
        }
    }

    /* JADX INFO: renamed from: x22.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5770b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5770b f216608a = new C5770b();

        C5770b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(136977096);
            if (p076m2.t.k()) {
                p076m2.t.o(136977096, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.mapper.SearchMapper.invoke.<anonymous>.<anonymous>.<anonymous> (SearchMapper.kt:66)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, SearchModel.Item item) {
        params.c().a();
        item.c().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.Data b(final Params params) {
        State state = params.getState();
        if (state.getIsActive()) {
            state = null;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, state != null ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), params.getState().getSearchModel().getTitleLabel(), null, null, null, 28, null) : null, null, null, null, null, 61, null);
        SearchBarData searchBarData = new SearchBarData(params.getState().getQuery(), params.d(), params.getState().getIsActive(), params.a(), params.b(), this.labelProvider.c(e02.a.f46575n0), null, Integer.valueOf(params.getState().e().size()), 64, null);
        List<SearchModel.Item> listE = params.getState().e();
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        for (final SearchModel.Item item : listE) {
            n50.b.Title title = new n50.b.Title(n50.l.b(item.getLabel(), null, null, 3, null));
            Label description = item.getDescription();
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: x22.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, item);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, description != null ? n50.l.b(description, null, null, 3, null) : null, 1, null), null, (item.getIsSelected() ? item : null) != null ? new x0.Icon(jz.a.f106783h, null, C5770b.f216608a, 2, null) : null, null, 2813, null));
        }
        return new g.Data(baseScaffoldData, searchBarData, new CardListData(arrayList, null, false, null, null, 30, null), new EmptyStateData(this.labelProvider.c(e02.a.Z), this.labelProvider.c(e02.a.B0), null, 4, null), params.c());
    }
}
