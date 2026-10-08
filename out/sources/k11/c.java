package k11;

import a14.i;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j11.PageIndicatorData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k30.d;
import k40.EmptyStateData;
import l11.CasesTimelineItem;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.w0;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import r50.g;
import vi0.MyCase;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J3\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001c*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u001fH\u0002¢\u0006\u0004\b%\u0010#J\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lk11/c;", "Lxw/f;", "Lk11/c$a;", "Li11/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(Lmx/c;Lez/e;La14/i;)V", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lk40/a;", "r", "(Ldx/b;Ler/a;)Lk40/a;", "Lmx/a;", "u", "(Ldx/b;)Lmx/a;", "s", "params", "Li50/a;", "f", "(Lk11/c$a;)Li50/a;", "", "Lvi0/b;", "list", "Lkotlin/Function1;", "onItemClick", "Ll11/a;", "h", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "Ln50/g;", "m", "Lvi0/b$a;", "Lr50/g;", "v", "(Lvi0/b$a;)Lr50/g;", "i", "(Lk11/c$a;)Li11/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "La14/i;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i11.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: k11.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001f\u0010\"¨\u0006#"}, d2 = {"Lk11/c$a;", "", "Li11/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onHideInfoBanner", "onLoadNextItems", "Lkotlin/Function1;", "Lvi0/b;", "onItemClick", "<init>", "(Li11/b;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li11/b;", "e", "()Li11/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i11.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHideInfoBanner;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLoadNextItems;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<MyCase, i0> onItemClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i11.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super MyCase, i0> lVar) {
            this.state = bVar;
            this.onBack = aVar;
            this.onHideInfoBanner = aVar2;
            this.onLoadNextItems = aVar3;
            this.onItemClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onHideInfoBanner;
        }

        public final l<MyCase, i0> c() {
            return this.onItemClick;
        }

        public final er.a<i0> d() {
            return this.onLoadNextItems;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final i11.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onHideInfoBanner, params.onHideInfoBanner) && t.c(this.onLoadNextItems, params.onLoadNextItems) && t.c(this.onItemClick, params.onItemClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onHideInfoBanner.hashCode()) * 31) + this.onLoadNextItems.hashCode()) * 31) + this.onItemClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onHideInfoBanner=" + this.onHideInfoBanner + ", onLoadNextItems=" + this.onLoadNextItems + ", onItemClick=" + this.onItemClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107428a;

        static {
            int[] iArr = new int[MyCase.a.values().length];
            try {
                iArr[MyCase.a.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyCase.a.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyCase.a.ORANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MyCase.a.YELLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MyCase.a.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MyCase.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f107428a = iArr;
        }
    }

    public c(mx.c cVar, e eVar, i iVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    private final BaseScaffoldData f(Params params) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(d11.a.f39426k), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final List<CasesTimelineItem> h(List<MyCase> list, l<? super MyCase, i0> onItemClick) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            OffsetDateTime lastModificationDate = ((MyCase) next).getLastModificationDate();
            Label labelA = lastModificationDate != null ? this.formatHeaderDatesWithDaysUseCase.a(new i.Params(lastModificationDate, null, 2, null)) : null;
            Object arrayList = linkedHashMap.get(labelA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(labelA, arrayList);
            }
            ((List) arrayList).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Label label = (Label) entry.getKey();
            CasesTimelineItem casesTimelineItem = label != null ? new CasesTimelineItem(label, m((List) entry.getValue(), onItemClick)) : null;
            if (casesTimelineItem != null) {
                arrayList2.add(casesTimelineItem);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, MyCase myCase) {
        params.c().b(myCase);
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> m(List<MyCase> list, final l<? super MyCase, i0> lVar) {
        Object objC;
        List<MyCase> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final MyCase myCase = (MyCase) obj;
            w0.StatusBadge statusBadge = new w0.StatusBadge(new r50.a.WithIcon(null, mx.b.d(myCase.getStatus(), "status"), null, 0, false, v(myCase.getLabelColor()), 29, null));
            BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(mx.b.d(myCase.getName(), "name_" + i15), null, null, 3, null)), null, 5, null);
            mx.c cVar = this.labelProvider;
            int i17 = d11.a.f39422g;
            OffsetDateTime lastModificationDate = myCase.getLastModificationDate();
            if (lastModificationDate == null || (objC = this.dateFormatter.d(new fz.b.OffsetDateTime(lastModificationDate), fz.c.DOTTED)) == null) {
                objC = Label.INSTANCE.c();
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: k11.b
                @Override // er.a
                public final Object a() {
                    return c.q(lVar, myCase);
                }
            }, false, null, null, false, null, statusBadge, bodySection, null, x0.Icon.INSTANCE.b(), new BottomSection(n50.l.b(cVar.e(i17, objC), null, null, 3, null), null, 2, null), 637, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, MyCase myCase) {
        lVar.b(myCase);
        return i0.f148189a;
    }

    private final EmptyStateData r(dx.b domainError, er.a<i0> onClick) {
        if (domainError == null) {
            return null;
        }
        return new EmptyStateData(u(domainError), s(domainError), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(d11.a.f39431p), null, 2, null), d.c.f107775a, null, onClick, 35, null));
    }

    private final Label s(dx.b bVar) {
        return this.labelProvider.c(bVar instanceof dx.b.g.e ? d11.a.f39429n : d11.a.f39427l);
    }

    private final Label u(dx.b bVar) {
        return this.labelProvider.c(bVar instanceof dx.b.g.e ? d11.a.f39430o : d11.a.f39428m);
    }

    private final g v(MyCase.a aVar) {
        switch (b.f107428a[aVar.ordinal()]) {
            case 1:
                return g.POSITIVE;
            case 2:
                return g.INFORMATIVE;
            case 3:
                return g.NOTICE;
            case 4:
                return g.NOTICE;
            case 5:
                return g.NEGATIVE;
            case 6:
                return g.NEGATIVE;
            default:
                throw new p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i11.c.a b(final Params params) {
        i11.b state = params.getState();
        if (state instanceof i11.b.C2076b) {
            return i11.c.a.b.f88211a;
        }
        if (state instanceof i11.b.a) {
            return new i11.c.a.Empty(f(params), new IconPageData(new j.a(jz.a.f106888w), this.labelProvider.c(d11.a.f39424i), this.labelProvider.c(d11.a.f39423h), null, null, null, false, 8, null));
        }
        if (state instanceof i11.b.Initialized) {
            return new i11.c.a.Initialized(f(params), new c30.b.c(null, null, null, this.labelProvider.c(d11.a.f39425j), params.b(), null, null, 103, null), h(((i11.b.Initialized) params.getState()).d(), new l() { // from class: k11.a
                @Override // er.l
                public final Object b(Object obj) {
                    return c.l(params, (MyCase) obj);
                }
            }), params.d(), ((i11.b.Initialized) params.getState()).getShowInfoBanner(), ((i11.b.Initialized) params.getState()).getEndReached(), new PageIndicatorData(((i11.b.Initialized) params.getState()).getIsLoadingNextPage(), r(((i11.b.Initialized) params.getState()).getNextPageDomainError(), params.d())));
        }
        throw new p();
    }
}
