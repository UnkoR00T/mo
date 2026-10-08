package xa3;

import er.l;
import er.p;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import v93.Country;
import wa3.Error;
import wa3.k;
import wa3.m;
import wa3.n;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\u001b*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u001e*\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b \u0010!J7\u0010$\u001a\u00020#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b$\u0010%J5\u0010&\u001a\u00020\u001b*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lxa3/i;", "Lxw/f;", "Lxa3/i$a;", "Lwa3/n$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lv93/c;", "Lkotlin/Function2;", "", "", "Loq/i0;", "onCountryClick", "Ln30/b;", "M", "(Ljava/util/List;Ler/p;)Ln30/b;", "Lwa3/k$a$a$a;", "activeTab", "allCountryList", "followedCountryList", "Lwa3/n$a$a;", "r", "(Lwa3/k$a$a$a;Ljava/util/List;Ljava/util/List;Ler/p;)Lwa3/n$a$a;", "", "index", "Ln50/g;", "K", "(Lv93/c;ILer/p;)Ln50/g;", "", "Lmx/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/util/List;Ler/p;)Ljava/util/Map;", "countryList", "Lwa3/n$a$f;", "s", "(Ljava/util/List;Ler/p;)Lwa3/n$a$f;", "I", "params", "u", "(Lxa3/i$a;)Lwa3/n$a;", "a", "Lmx/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xa3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b(\u0010\"R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b)\u0010'¨\u0006,"}, d2 = {"Lxa3/i$a;", "", "Lwa3/k;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onOpenSearch", "onCloseSearch", "Lkotlin/Function1;", "", "onSearchQueryChanged", "onSearchQueryCleared", "Lkotlin/Function2;", "", "onCountryClick", "Lwa3/k$a$a$a;", "onTabSelected", "<init>", "(Lwa3/k;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/p;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwa3/k;", "h", "()Lwa3/k;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "f", "g", "Ler/p;", "()Ler/p;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenSearch;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseSearch;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSearchQueryChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSearchQueryCleared;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, Boolean, i0> onCountryClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<k.a.ContentData.InterfaceC5568a, i0> onTabSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(k kVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, er.a<i0> aVar4, p<? super String, ? super Boolean, i0> pVar, l<? super k.a.ContentData.InterfaceC5568a, i0> lVar2) {
            this.state = kVar;
            this.onBack = aVar;
            this.onOpenSearch = aVar2;
            this.onCloseSearch = aVar3;
            this.onSearchQueryChanged = lVar;
            this.onSearchQueryCleared = aVar4;
            this.onCountryClick = pVar;
            this.onTabSelected = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onCloseSearch;
        }

        public final p<String, Boolean, i0> c() {
            return this.onCountryClick;
        }

        public final er.a<i0> d() {
            return this.onOpenSearch;
        }

        public final l<String, i0> e() {
            return this.onSearchQueryChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onOpenSearch, params.onOpenSearch) && t.c(this.onCloseSearch, params.onCloseSearch) && t.c(this.onSearchQueryChanged, params.onSearchQueryChanged) && t.c(this.onSearchQueryCleared, params.onSearchQueryCleared) && t.c(this.onCountryClick, params.onCountryClick) && t.c(this.onTabSelected, params.onTabSelected);
        }

        public final er.a<i0> f() {
            return this.onSearchQueryCleared;
        }

        public final l<k.a.ContentData.InterfaceC5568a, i0> g() {
            return this.onTabSelected;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final k getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onOpenSearch.hashCode()) * 31) + this.onCloseSearch.hashCode()) * 31) + this.onSearchQueryChanged.hashCode()) * 31) + this.onSearchQueryCleared.hashCode()) * 31) + this.onCountryClick.hashCode()) * 31) + this.onTabSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onOpenSearch=" + this.onOpenSearch + ", onCloseSearch=" + this.onCloseSearch + ", onSearchQueryChanged=" + this.onSearchQueryChanged + ", onSearchQueryCleared=" + this.onSearchQueryCleared + ", onCountryClick=" + this.onCountryClick + ", onTabSelected=" + this.onTabSelected + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217857a;

        static {
            int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f217857a = iArr;
        }
    }

    public i(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, boolean z15) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, y30.n.Switch.EnumC5973b enumC5973b) {
        k.a.ContentData.InterfaceC5568a interfaceC5568a;
        l<k.a.ContentData.InterfaceC5568a, i0> lVarG = params.g();
        int i15 = b.f217857a[enumC5973b.ordinal()];
        if (i15 == 1) {
            interfaceC5568a = k.a.ContentData.InterfaceC5568a.C5569a.f211635a;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            interfaceC5568a = k.a.ContentData.InterfaceC5568a.b.f211636a;
        }
        lVarG.b(interfaceC5568a);
        return i0.f148189a;
    }

    private final Map<Label, CardListData> H(List<Country> list, p<? super String, ? super Boolean, i0> pVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Label labelB = mx.b.b(r.u1(String.valueOf(r.C1(((Country) obj).getName()))).toString(), "CountryAlphabeticalHeader");
            Object arrayList = linkedHashMap.get(labelB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(labelB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(v.y(iterable, 10));
            int i15 = 0;
            for (Object obj2 : iterable) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                arrayList2.add(I((Country) obj2, i15, pVar));
                i15 = i16;
            }
            linkedHashMap2.put(key, new CardListData(arrayList2, null, false, null, null, 30, null));
        }
        return linkedHashMap2;
    }

    private final DefaultSingleCardData I(final Country country, int i15, final p<? super String, ? super Boolean, i0> pVar) {
        return new DefaultSingleCardData(null, new er.a() { // from class: xa3.b
            @Override // er.a
            public final Object a() {
                return i.J(pVar, country);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(country.getName(), "CountryName" + i15), null, null, 3, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(p pVar, Country country) {
        pVar.B(country.getIsoCode(), Boolean.valueOf(country.getIsSubscribed()));
        return i0.f148189a;
    }

    private final DefaultSingleCardData K(final Country country, int i15, final p<? super String, ? super Boolean, i0> pVar) {
        SingleCardLabel singleCardLabelB;
        bb3.a aVarA = u93.a.a(country.getWarningLevel());
        n50.b.Title title = new n50.b.Title(n50.l.b(mx.b.b(country.getName(), "CountryName" + i15), null, null, 3, null));
        if (aVarA != null) {
            singleCardLabelB = n50.l.b(mx.b.b(country.getWarningLevel().getDescription(), "WarningLevelText" + i15), null, null, 3, null);
        } else {
            singleCardLabelB = null;
        }
        return new DefaultSingleCardData(null, new er.a() { // from class: xa3.a
            @Override // er.a
            public final Object a() {
                return i.L(pVar, country);
            }
        }, false, null, null, false, null, null, new BodySection(null, title, singleCardLabelB, 1, null), aVarA != null ? new LeadingSection(false, null, new n50.i.Icon(aVarA.getIconResId(), null, aVarA.e(), null, null, 26, null), 3, null) : null, x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(p pVar, Country country) {
        pVar.B(country.getIsoCode(), Boolean.valueOf(country.getIsSubscribed()));
        return i0.f148189a;
    }

    private final CardListData M(List<Country> list, p<? super String, ? super Boolean, i0> pVar) {
        List<Country> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(K((Country) obj, i15, pVar));
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    private final n.a.InterfaceC5570a r(k.a.ContentData.InterfaceC5568a activeTab, List<Country> allCountryList, List<Country> followedCountryList, p<? super String, ? super Boolean, i0> onCountryClick) {
        if (t.c(activeTab, k.a.ContentData.InterfaceC5568a.C5569a.f211635a)) {
            return new n.a.InterfaceC5570a.All(H(allCountryList, onCountryClick));
        }
        if (t.c(activeTab, k.a.ContentData.InterfaceC5568a.b.f211636a)) {
            return followedCountryList.isEmpty() ? new n.a.InterfaceC5570a.b.Empty(new EmptyStateData(this.labelProvider.c(r93.a.f172459a0), this.labelProvider.c(r93.a.Z), null, 4, null)) : new n.a.InterfaceC5570a.b.WithContent(M(followedCountryList, onCountryClick));
        }
        throw new oq.p();
    }

    private final n.a.f s(List<Country> countryList, p<? super String, ? super Boolean, i0> onCountryClick) {
        if (countryList.isEmpty()) {
            return new n.a.f.NotFound(new EmptyStateData(this.labelProvider.c(r93.a.F), this.labelProvider.c(r93.a.V), null, 4, null));
        }
        List<Country> list = countryList;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(I((Country) obj, i15, onCountryClick));
            i15 = i16;
        }
        return new n.a.f.WithContent(new CardListData(arrayList, null, false, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, String str) {
        params.e().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, boolean z15) {
        if (!z15) {
            params.b().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(String str) {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public n.a b(final Params params) {
        y30.n.Switch.EnumC5973b enumC5973b;
        k state = params.getState();
        if (state instanceof m) {
            return n.a.d.f211656a;
        }
        if (state instanceof Error) {
            return new n.a.Error(((Error) params.getState()).getErrorVms());
        }
        if (state instanceof k.a.Search) {
            return new n.a.Search(new BaseScaffoldData(null, null, null, null, null, null, 61, null), new SearchBarData(((k.a.Search) params.getState()).getSearchQuery(), new l() { // from class: xa3.c
                @Override // er.l
                public final Object b(Object obj) {
                    return i.v(params, (String) obj);
                }
            }, true, new l() { // from class: xa3.d
                @Override // er.l
                public final Object b(Object obj) {
                    return i.x(params, ((Boolean) obj).booleanValue());
                }
            }, params.f(), this.labelProvider.c(r93.a.f172465c0), null, Integer.valueOf(((k.a.Search) params.getState()).getContentData().f().size()), 64, null), s(((k.a.Search) params.getState()).getContentData().f(), params.c()));
        }
        if (!(state instanceof k.a.Screen)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.C1), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(r93.a.Y);
        SearchBarData searchBarData = new SearchBarData("", new l() { // from class: xa3.e
            @Override // er.l
            public final Object b(Object obj) {
                return i.z((String) obj);
            }
        }, false, new l() { // from class: xa3.f
            @Override // er.l
            public final Object b(Object obj) {
                return i.E(params, ((Boolean) obj).booleanValue());
            }
        }, new er.a() { // from class: xa3.g
            @Override // er.a
            public final Object a() {
                return i.F();
            }
        }, this.labelProvider.c(r93.a.f172465c0), null, null, 64, null);
        Label labelC2 = this.labelProvider.c(r93.a.f172461b);
        y30.n.Switch.EnumC5973b enumC5973b2 = y30.n.Switch.EnumC5973b.LEFT;
        y30.n.Switch.TabItem tabItem = new y30.n.Switch.TabItem(labelC2, enumC5973b2);
        Label labelC3 = this.labelProvider.c(r93.a.f172462b0);
        y30.n.Switch.EnumC5973b enumC5973b3 = y30.n.Switch.EnumC5973b.RIGHT;
        y30.n.Switch.TabItem tabItem2 = new y30.n.Switch.TabItem(labelC3, enumC5973b3);
        k.a.ContentData.InterfaceC5568a activeTab = ((k.a.Screen) params.getState()).getContentData().getActiveTab();
        if (t.c(activeTab, k.a.ContentData.InterfaceC5568a.C5569a.f211635a)) {
            enumC5973b = enumC5973b2;
        } else {
            if (!t.c(activeTab, k.a.ContentData.InterfaceC5568a.b.f211636a)) {
                throw new oq.p();
            }
            enumC5973b = enumC5973b3;
        }
        return new n.a.Initialized(baseScaffoldData, labelC, searchBarData, new y30.n.Switch(tabItem, tabItem2, enumC5973b, false, new l() { // from class: xa3.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.G(params, (y30.n.Switch.EnumC5973b) obj);
            }
        }, 8, null), r(((k.a.Screen) params.getState()).getContentData().getActiveTab(), ((k.a.Screen) params.getState()).getContentData().d(), ((k.a.Screen) params.getState()).getContentData().e(), params.c()));
    }
}
