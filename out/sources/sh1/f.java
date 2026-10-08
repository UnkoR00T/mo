package sh1;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import qh1.ContentData;
import rh1.SearchRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0019\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020&*\u00020\u00132\u0006\u0010#\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160$H\u0002¢\u0006\u0004\b'\u0010(J9\u0010-\u001a\u00020,*\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160$H\u0002¢\u0006\u0004\b-\u0010.J;\u00102\u001a\u00020,*\u00020/2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160$2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J;\u00105\u001a\u00020,*\u0002042\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160$2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b7\u00108J\u0011\u00109\u001a\u000200*\u00020\u0013¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lsh1/f;", "Lxw/f;", "Lsh1/f$a;", "Lqh1/d$a;", "Lmx/c;", "labelProvider", "Lr34/a;", "getDocumentConfigLabelUC", "<init>", "(Lmx/c;Lr34/a;)V", "Lqh1/b;", "data", "params", "Lcb4/i;", "dialogVMS", "Lqh1/d$a$b;", "q", "(Lqh1/b;Lsh1/f$a;Lcb4/i;)Lqh1/d$a$b;", "", "Lth1/a;", "filteredByQueryItems", "Lkotlin/Function1;", "Loq/i0;", "onSearchItemClick", "Ln30/b;", "l", "(Ljava/util/List;Ler/l;)Ln30/b;", "items", "Lqh1/d$b;", "u", "(Ljava/util/List;Ler/l;)Lqh1/d$b;", "Lqh1/d$c;", "x", "(Ljava/util/List;Ler/l;)Lqh1/d$c;", "", "testTag", "Lkotlin/Function0;", "onClick", "Lo50/a;", "K", "(Lth1/a;Ljava/lang/String;Ler/a;)Lo50/a;", "", "showIcon", "showDescription", "Ln50/g;", "I", "(Lth1/a;Ljava/lang/String;ZZLer/a;)Ln50/g;", "Lth1/a$a;", "Lmx/a;", "description", i.f37087n, "(Lth1/a$a;Ljava/lang/String;ZLer/a;Lmx/a;)Ln50/g;", "Lth1/a$b;", "G", "(Lth1/a$b;Ljava/lang/String;ZLer/a;Lmx/a;)Ln50/g;", "F", "(Lsh1/f$a;)Lqh1/d$a;", "E", "(Lth1/a;)Lmx/a;", "a", "Lmx/c;", "b", "Lr34/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, qh1.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r34.a getDocumentConfigLabelUC;

    /* JADX INFO: renamed from: sh1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001d\u0010#R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lsh1/f$a;", "", "Lqh1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lth1/a;", "onSearchItemClick", "", "onChangeSearchActive", "", "onChangeSearchQuery", "onClearSearchQuery", "<init>", "(Lqh1/c;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqh1/c;", "f", "()Lqh1/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final qh1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<th1.a, i0> onSearchItemClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onChangeSearchActive;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeSearchQuery;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearSearchQuery;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(qh1.c cVar, er.a<i0> aVar, l<? super th1.a, i0> lVar, l<? super Boolean, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar2) {
            this.state = cVar;
            this.onBack = aVar;
            this.onSearchItemClick = lVar;
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

        public final l<th1.a, i0> e() {
            return this.onSearchItemClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onSearchItemClick, params.onSearchItemClick) && t.c(this.onChangeSearchActive, params.onChangeSearchActive) && t.c(this.onChangeSearchQuery, params.onChangeSearchQuery) && t.c(this.onClearSearchQuery, params.onClearSearchQuery);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final qh1.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onSearchItemClick.hashCode()) * 31) + this.onChangeSearchActive.hashCode()) * 31) + this.onChangeSearchQuery.hashCode()) * 31) + this.onClearSearchQuery.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onSearchItemClick=" + this.onSearchItemClick + ", onChangeSearchActive=" + this.onChangeSearchActive + ", onChangeSearchQuery=" + this.onChangeSearchQuery + ", onClearSearchQuery=" + this.onClearSearchQuery + ')';
        }
    }

    public f(mx.c cVar, r34.a aVar) {
        this.labelProvider = cVar;
        this.getDocumentConfigLabelUC = aVar;
    }

    private final DefaultSingleCardData G(th1.a.SearchAppMenuItem searchAppMenuItem, String str, boolean z15, er.a<i0> aVar, Label label) {
        return new DefaultSingleCardData(str, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(E(searchAppMenuItem), null, null, 0, 0, null, 62, null)), label != null ? n50.l.b(label, null, null, 3, null) : null, 1, null), z15 ? new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(searchAppMenuItem.getIconId(), null, 2, null), null, null, 6, null), 3, null) : null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2300, null);
    }

    private final DefaultSingleCardData H(th1.a.DocumentItem documentItem, String str, boolean z15, er.a<i0> aVar, Label label) {
        return new DefaultSingleCardData(str, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(E(documentItem), null, null, 0, 0, null, 62, null)), label != null ? n50.l.b(label, null, null, 3, null) : null, 1, null), z15 ? new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(fh1.a.a(documentItem.getDocumentConfig().getType()).getCardMiniResId(), null, 2, null), null, null, 6, null), 3, null) : null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2300, null);
    }

    private final DefaultSingleCardData I(th1.a aVar, String str, boolean z15, boolean z16, final er.a<i0> aVar2) {
        int i15;
        Label labelC = null;
        if (aVar instanceof th1.a.ServiceItem) {
            th1.a.ServiceItem serviceItem = (th1.a.ServiceItem) aVar;
            return fh1.c.c(serviceItem.getServiceTypeItem(), str, new p() { // from class: sh1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.J(aVar2, (gx.b) obj, (rq0.c) obj2);
                }
            }, serviceItem.getDashboardServiceEntry().getType(), z15, null, z16 ? this.labelProvider.c(sg1.a.O) : null, 16, null);
        }
        if (aVar instanceof th1.a.DocumentItem) {
            return H((th1.a.DocumentItem) aVar, str, z15, aVar2, z16 ? this.labelProvider.c(sg1.a.f181535z) : null);
        }
        if (!(aVar instanceof th1.a.SearchAppMenuItem)) {
            throw new oq.p();
        }
        th1.a.SearchAppMenuItem searchAppMenuItem = (th1.a.SearchAppMenuItem) aVar;
        ah1.a item = searchAppMenuItem.getItem();
        if (item instanceof ah1.a.b) {
            i15 = sg1.a.D;
        } else {
            if (!(item instanceof ah1.a.EnumC0131a) && !(item instanceof ah1.a.c)) {
                throw new oq.p();
            }
            i15 = sg1.a.I;
        }
        Integer numValueOf = Integer.valueOf(i15);
        if (!z16) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            labelC = this.labelProvider.c(numValueOf.intValue());
        }
        return G(searchAppMenuItem, str, z15, aVar2, labelC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(er.a aVar, gx.b bVar, rq0.c cVar) {
        aVar.a();
        return i0.f148189a;
    }

    private final SmallCardData K(th1.a aVar, String str, er.a<i0> aVar2) {
        return new SmallCardData(str, E(aVar), null, aVar.getIconId(), new o50.f.Custom(null, null, 3, null), false, aVar2, 36, null);
    }

    private final CardListData l(List<? extends th1.a> filteredByQueryItems, final l<? super th1.a, i0> onSearchItemClick) {
        List<? extends th1.a> list = filteredByQueryItems;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final th1.a aVar = (th1.a) obj;
            arrayList.add(I(aVar, "SearchResultItem" + i15, true, true, new er.a() { // from class: sh1.b
                @Override // er.a
                public final Object a() {
                    return f.m(onSearchItemClick, aVar);
                }
            }));
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, th1.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    private final qh1.d.a.Initialized q(ContentData data, final Params params, cb4.i dialogVMS) {
        BaseScaffoldData baseScaffoldData = data.getSearchIsActive() ? new BaseScaffoldData(null, null, null, null, null, null, 63, null) : new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(null, this.labelProvider.c(sg1.a.M).n("DashboardSearchScreenTitle"), null, null, true, null, 45, null), null, null, null, null, 60, null);
        CardListData cardListDataL = l(data.e(), params.e());
        qh1.d.SectionNewsData sectionNewsDataU = u(data.g(), params.e());
        qh1.d.SectionPopularData sectionPopularDataX = x(data.h(), params.e());
        SearchBarData searchBarData = new SearchBarData(data.getSearchQuery(), params.c(), data.getSearchIsActive(), params.b(), params.d(), this.labelProvider.c(sg1.a.N), null, Integer.valueOf(data.e().size()), 64, null);
        List<th1.a> listF = data.f();
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        for (final th1.a aVar : listF) {
            arrayList.add(new SearchRowListData.Row(jz.a.J, E(aVar).getText(), new er.a() { // from class: sh1.a
                @Override // er.a
                public final Object a() {
                    return f.s(params, aVar);
                }
            }));
        }
        SearchRowListData searchRowListData = new SearchRowListData("LastSearchedItems", arrayList);
        if (data.getSearchQuery().length() >= 3) {
            searchRowListData = null;
        }
        return new qh1.d.a.Initialized(params.a(), baseScaffoldData, sectionNewsDataU, sectionPopularDataX, searchBarData, cardListDataL, searchRowListData, new EmptyStateData(this.labelProvider.c(sg1.a.G), this.labelProvider.c(sg1.a.P), null, 4, null), data.getIsQuerying(), data.getSearchQuery().length() == 0, dialogVMS);
    }

    static /* synthetic */ qh1.d.a.Initialized r(f fVar, ContentData contentData, Params params, cb4.i iVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            iVar = null;
        }
        return fVar.q(contentData, params, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, th1.a aVar) {
        params.e().b(aVar);
        return i0.f148189a;
    }

    private final qh1.d.SectionNewsData u(List<? extends th1.a> items, final l<? super th1.a, i0> onSearchItemClick) {
        if (items.isEmpty()) {
            return null;
        }
        List<? extends th1.a> list = items;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final th1.a aVar = (th1.a) obj;
            arrayList.add(K(aVar, "NewsSectionItem" + i15, new er.a() { // from class: sh1.d
                @Override // er.a
                public final Object a() {
                    return f.v(onSearchItemClick, aVar);
                }
            }));
            i15 = i16;
        }
        return new qh1.d.SectionNewsData(this.labelProvider.c(sg1.a.E), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, th1.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    private final qh1.d.SectionPopularData x(List<? extends th1.a> items, final l<? super th1.a, i0> onSearchItemClick) {
        if (items.isEmpty()) {
            return null;
        }
        List<? extends th1.a> list = items;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final th1.a aVar = (th1.a) obj;
            arrayList.add(I(aVar, "PopularSectionItem" + i15, false, false, new er.a() { // from class: sh1.c
                @Override // er.a
                public final Object a() {
                    return f.z(onSearchItemClick, aVar);
                }
            }));
            i15 = i16;
        }
        return new qh1.d.SectionPopularData(this.labelProvider.c(sg1.a.J), new CardListData(arrayList, null, false, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar, th1.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    public final Label E(th1.a aVar) {
        if (aVar instanceof th1.a.ServiceItem) {
            return mx.b.b(((th1.a.ServiceItem) aVar).getServiceTypeItem().getTitle(), "");
        }
        if (!(aVar instanceof th1.a.DocumentItem)) {
            if (aVar instanceof th1.a.SearchAppMenuItem) {
                return this.labelProvider.c(((th1.a.SearchAppMenuItem) aVar).getItem().getTitle());
            }
            throw new oq.p();
        }
        th1.a.DocumentItem documentItem = (th1.a.DocumentItem) aVar;
        String strA = this.getDocumentConfigLabelUC.a(new r34.a.Params(documentItem.getDocumentConfig().g()));
        Label labelB = strA != null ? mx.b.b(strA, "") : null;
        if (labelB != null) {
            return labelB;
        }
        mx.c cVar = this.labelProvider;
        Integer nameAlternative = documentItem.getDocument().getNameAlternative();
        return cVar.c(nameAlternative != null ? nameAlternative.intValue() : documentItem.getDocument().getName());
    }

    @Override // er.l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public qh1.d.a b(Params params) {
        qh1.c state = params.getState();
        if (t.c(state, qh1.c.d.f166482a)) {
            return qh1.d.a.c.f166498a;
        }
        if (state instanceof qh1.c.Initialized) {
            return r(this, ((qh1.c.Initialized) state).getData(), params, null, 4, null);
        }
        if (state instanceof qh1.c.Dialog) {
            qh1.c.Dialog dialog = (qh1.c.Dialog) state;
            return q(dialog.getData(), params, dialog.getDialogVMS());
        }
        if (state instanceof qh1.c.InitializedError) {
            return new qh1.d.a.Error(((qh1.c.InitializedError) params.getState()).getErrorVMS());
        }
        if (state instanceof qh1.c.LoadingError) {
            return new qh1.d.a.Error(((qh1.c.LoadingError) params.getState()).getErrorVMS());
        }
        throw new oq.p();
    }
}
