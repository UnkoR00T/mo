package vp3;

import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.w0;
import n50.x0;
import oo0.IdeaStatus;
import oo0.h;
import oo0.m;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b!\u0010\"J3\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#*\b\u0012\u0004\u0012\u00020\r0#2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b%\u0010&J7\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#*\b\u0012\u0004\u0012\u00020\r0#2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0#*\b\u0012\u0004\u0012\u00020)0#H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lvp3/c;", "Lxw/f;", "Lvp3/c$a;", "Lup3/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lup3/b$c;", "state", "Lkotlin/Function1;", "Loo0/h;", "Loq/i0;", "onIdeaClickAction", "Lup3/c$b;", "i", "(Lup3/b$c;Ler/l;)Lup3/c$b;", "Lkotlin/Function0;", "onBackAction", "Ly30/n$b$b;", "onFilterClickAction", "l", "(Lup3/b$c;Ler/a;Ler/l;Ler/l;)Lup3/c$a;", "Lmx/a;", "m", "(Lup3/b$c;)Lmx/a;", "Li50/a;", "q", "(Lup3/b$c;Ler/a;)Li50/a;", "onFilterClick", "Ly30/n$b;", "f", "(Lup3/b$c;Ler/l;)Ly30/n$b;", "", "Lup3/c$c;", "u", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "Ln50/g;", "x", "Loo0/g;", "v", "(Ljava/util/List;)Ljava/util/List;", "Loo0/m;", "Lr50/g;", "s", "(Loo0/m;)Lr50/g;", "params", "r", "(Lvp3/c$a;)Lup3/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, up3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: vp3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lvp3/c$a;", "", "Lup3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Loo0/h;", "onIdeaClickAction", "Ly30/n$b$b;", "onFilterClickAction", "<init>", "(Lup3/b;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lup3/b;", "d", "()Lup3/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final up3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<h, i0> onIdeaClickAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onFilterClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(up3.b bVar, er.a<i0> aVar, l<? super h, i0> lVar, l<? super n.Switch.EnumC5973b, i0> lVar2) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onIdeaClickAction = lVar;
            this.onFilterClickAction = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<n.Switch.EnumC5973b, i0> b() {
            return this.onFilterClickAction;
        }

        public final l<h, i0> c() {
            return this.onIdeaClickAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final up3.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onIdeaClickAction, params.onIdeaClickAction) && t.c(this.onFilterClickAction, params.onFilterClickAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onIdeaClickAction.hashCode()) * 31) + this.onFilterClickAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onIdeaClickAction=" + this.onIdeaClickAction + ", onFilterClickAction=" + this.onFilterClickAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f207889b;

        static {
            int[] iArr = new int[up3.b.a.values().length];
            try {
                iArr[up3.b.a.PROMOTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[up3.b.a.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f207888a = iArr;
            int[] iArr2 = new int[m.values().length];
            try {
                iArr2[m.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[m.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m.IN_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f207889b = iArr2;
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final n.Switch f(up3.b.Initialized state, final l<? super n.Switch.EnumC5973b, i0> onFilterClick) {
        Label labelC = this.labelProvider.c(gp3.a.F);
        n.Switch.EnumC5973b enumC5973b = n.Switch.EnumC5973b.LEFT;
        n.Switch.TabItem tabItem = new n.Switch.TabItem(labelC, enumC5973b);
        Label labelC2 = this.labelProvider.c(gp3.a.A);
        n.Switch.EnumC5973b enumC5973b2 = n.Switch.EnumC5973b.RIGHT;
        n.Switch.TabItem tabItem2 = new n.Switch.TabItem(labelC2, enumC5973b2);
        int i15 = b.f207888a[state.getFilterSelected().ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new p();
            }
            enumC5973b = enumC5973b2;
        }
        return new n.Switch(tabItem, tabItem2, enumC5973b, false, new l() { // from class: vp3.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(onFilterClick, (n.Switch.EnumC5973b) obj);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, n.Switch.EnumC5973b enumC5973b) {
        lVar.b(enumC5973b);
        return i0.f148189a;
    }

    private final up3.c.b i(up3.b.Initialized state, l<? super h, i0> onIdeaClickAction) {
        int i15 = b.f207888a[state.getFilterSelected().ordinal()];
        if (i15 == 1) {
            return new up3.c.b.PromotedIdeas(u(state.getResults().b(), onIdeaClickAction));
        }
        if (i15 == 2) {
            return new up3.c.b.OtherIdeas(new CardListData(v(state.getResults().a()), null, false, null, null, 30, null));
        }
        throw new p();
    }

    private final up3.c.a l(up3.b.Initialized state, er.a<i0> onBackAction, l<? super h, i0> onIdeaClickAction, l<? super n.Switch.EnumC5973b, i0> onFilterClickAction) {
        Label labelC;
        if (state.getFilterSelected() == up3.b.a.PROMOTED && state.getResults().b().isEmpty()) {
            return up3.c.a.C5197a.f199842a;
        }
        if (state.getFilterSelected() == up3.b.a.OTHER && state.getResults().a().isEmpty()) {
            return up3.c.a.C5197a.f199842a;
        }
        BaseScaffoldData baseScaffoldDataQ = q(state, onBackAction);
        n.Switch switchF = f(state, onFilterClickAction);
        Label labelM = m(state);
        int i15 = b.f207888a[state.getFilterSelected().ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(gp3.a.C);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            labelC = this.labelProvider.c(gp3.a.f76164z);
        }
        return new up3.c.a.Initialized(baseScaffoldDataQ, switchF, labelC, labelM, i(state, onIdeaClickAction));
    }

    private final Label m(up3.b.Initialized state) {
        mx.c cVar = this.labelProvider;
        int i15 = gp3.a.G;
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(state.getRoundData().getStartDate());
        fz.c cVar2 = fz.c.MONTH_DATE_DOT;
        return cVar.e(i15, eVar.d(offsetDateTime, cVar2), this.dateFormatter.d(new fz.b.OffsetDateTime(state.getRoundData().getEndDate()), cVar2));
    }

    private final BaseScaffoldData q(up3.b.Initialized state, er.a<i0> onBackAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackAction), mx.b.b(state.getRoundData().getMobileName(), "roundTitle"), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final g s(m mVar) {
        int i15 = b.f207889b[mVar.ordinal()];
        if (i15 == 1) {
            return g.POSITIVE;
        }
        if (i15 != 2) {
            return i15 != 3 ? g.INFORMATIVE : g.INFORMATIVE;
        }
        return g.NEGATIVE;
    }

    private final List<up3.c.Section> u(List<h> list, l<? super h, i0> lVar) {
        up3.c.Section section;
        up3.c.Section section2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            IdeaStatus status = ((h) obj).getStatus();
            Object arrayList = linkedHashMap.get(status);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(status, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i15 = b.f207889b[((IdeaStatus) entry.getKey()).getIdeaStatusCode().ordinal()];
            if (i15 == 1) {
                section = new up3.c.Section(this.labelProvider.c(gp3.a.B), new CardListData(x((List) entry.getValue(), lVar), null, false, null, null, 30, null));
            } else if (i15 != 2) {
                if (i15 != 3) {
                    section2 = null;
                } else {
                    section = new up3.c.Section(this.labelProvider.c(gp3.a.D), new CardListData(x((List) entry.getValue(), lVar), null, false, null, null, 30, null));
                }
                arrayList2.add(section2);
            } else {
                section = new up3.c.Section(this.labelProvider.c(gp3.a.E), new CardListData(x((List) entry.getValue(), lVar), null, false, null, null, 30, null));
            }
            section2 = section;
            arrayList2.add(section2);
        }
        return e5.b.b(arrayList2);
    }

    private final List<DefaultSingleCardData> v(List<oo0.g> list) {
        List<oo0.g> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            oo0.g gVar = (oo0.g) obj;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.b(gVar.getCategory().getDescription(), "ideaCardInfo_" + i15), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(gVar.getTopic(), "ideaDescription_" + i15), null, null, 3, null)), n50.l.b(this.labelProvider.e(gp3.a.f76125f0, Integer.valueOf(gVar.getVotes())), null, null, 3, null)), null, null, null, 3839, null));
            i15 = i16;
        }
        return arrayList;
    }

    private final List<DefaultSingleCardData> x(List<h> list, final l<? super h, i0> lVar) {
        List<h> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final h hVar = (h) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: vp3.a
                @Override // er.a
                public final Object a() {
                    return c.z(lVar, hVar);
                }
            }, false, null, null, false, null, new w0.StatusBadge(new r50.a.WithIcon(null, mx.b.b(hVar.getStatus().getDescription(), "ideaStatusBadge_" + i15), null, 0, false, s(hVar.getStatus().getIdeaStatusCode()), 29, null)), new BodySection(n50.l.b(mx.b.b(hVar.getCategory().getDescription(), "ideaCardInfo_" + i15), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(hVar.getTopic(), "ideaDescription_" + i15), null, null, 3, null)), n50.l.b(this.labelProvider.e(gp3.a.f76125f0, Integer.valueOf(hVar.getVotes())), null, null, 3, null)), null, x0.Icon.INSTANCE.b(), null, 2685, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar, h hVar) {
        if (lVar != null) {
            lVar.b(hVar);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public up3.c.a b(Params params) {
        up3.b state = params.getState();
        if (state instanceof up3.b.Initial) {
            return up3.c.a.b.f199843a;
        }
        if (state instanceof up3.b.Initialized) {
            return l((up3.b.Initialized) params.getState(), params.a(), params.c(), params.b());
        }
        throw new p();
    }
}
