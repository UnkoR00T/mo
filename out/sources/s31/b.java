package s31;

import er.l;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r31.State;
import r31.e;
import t31.OfficeSearchItems;
import t31.SearchScreenModel;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls31/b;", "Lxw/f;", "Ls31/b$a;", "Lr31/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lt31/a$a;", "", "query", "e", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "params", "f", "(Ls31/b$a;)Lr31/e$a;", "a", "Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: s31.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001c\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b#\u0010\u001e¨\u0006$"}, d2 = {"Ls31/b$a;", "", "Lr31/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "", "onSelectItemWithId", "", "onChangeSearchActive", "onChangeSearchQuery", "onClearSearchQuery", "<init>", "(Lr31/d;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lr31/d;", "f", "()Lr31/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "d", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSelectItemWithId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onChangeSearchActive;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeSearchQuery;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearSearchQuery;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar2) {
            this.state = state;
            this.onBack = aVar;
            this.onSelectItemWithId = lVar;
            this.onChangeSearchActive = lVar2;
            this.onChangeSearchQuery = lVar3;
            this.onClearSearchQuery = aVar2;
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

        public final l<String, i0> e() {
            return this.onSelectItemWithId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onSelectItemWithId, params.onSelectItemWithId) && t.c(this.onChangeSearchActive, params.onChangeSearchActive) && t.c(this.onChangeSearchQuery, params.onChangeSearchQuery) && t.c(this.onClearSearchQuery, params.onClearSearchQuery);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onSelectItemWithId.hashCode()) * 31) + this.onChangeSearchActive.hashCode()) * 31) + this.onChangeSearchQuery.hashCode()) * 31) + this.onClearSearchQuery.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onSelectItemWithId=" + this.onSelectItemWithId + ", onChangeSearchActive=" + this.onChangeSearchActive + ", onChangeSearchQuery=" + this.onChangeSearchQuery + ", onClearSearchQuery=" + this.onClearSearchQuery + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final List<OfficeSearchItems.Item> e(List<OfficeSearchItems.Item> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (r.b0(((OfficeSearchItems.Item) obj).getName(), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, OfficeSearchItems.Item item) {
        params.e().b(item.getId());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.Data b(final Params params) {
        EmptyStateData emptyStateData = new EmptyStateData(this.labelProvider.c(j31.a.B2), this.labelProvider.c(j31.a.f99137d3), null, 4, null);
        List<OfficeSearchItems.ItemGroup> listB = params.getState().getOfficeSearchItems().b();
        int i15 = 10;
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i16 = 0;
        for (Object obj : listB) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            OfficeSearchItems.ItemGroup itemGroup = (OfficeSearchItems.ItemGroup) obj;
            Label groupTitle = itemGroup.getGroupTitle();
            List<OfficeSearchItems.Item> listE = e(itemGroup.b(), params.getState().getSearchQuery());
            ArrayList arrayList2 = new ArrayList(v.y(listE, i15));
            int i18 = 0;
            for (Object obj2 : listE) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                final OfficeSearchItems.Item item = (OfficeSearchItems.Item) obj2;
                arrayList2.add(new DefaultSingleCardData("group" + i16 + "_officeCard" + i18, new er.a() { // from class: s31.a
                    @Override // er.a
                    public final Object a() {
                        return b.h(params, item);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(item.getName(), ""), null, null, 3, null)), null, 5, null), null, t.c(item.getId(), params.getState().getOfficeSearchItems().getCurrentlySelectedId()) ? x0.Icon.INSTANCE.a() : null, null, 2812, null));
                i18 = i19;
            }
            arrayList.add(new SearchScreenModel.CardGroup(groupTitle, new CardListData(arrayList2, null, false, null, null, 30, null)));
            i16 = i17;
            i15 = 10;
        }
        SearchScreenModel searchScreenModel = new SearchScreenModel(emptyStateData, arrayList);
        return new e.Data(params.a(), params.getState().getSearchIsActive() ? new BaseScaffoldData(null, null, null, null, null, null, 63, null) : new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(j31.a.f99146f2), null, null, null, 28, null), null, null, null, null, 61, null), searchScreenModel, new SearchBarData(params.getState().getSearchQuery(), params.c(), params.getState().getSearchIsActive(), params.b(), params.d(), this.labelProvider.c(j31.a.S2), null, Integer.valueOf(searchScreenModel.a()), 64, null));
    }
}
