package eh2;

import dh2.c;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import lg2.d;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import tq0.OrderedDocumentByNumber;
import tq0.g;
import tq0.k;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Leh2/b;", "Lxw/f;", "Leh2/b$a;", "Ldh2/c$a;", "Lmx/c;", "labelProvider", "Llg2/d;", "statusMapper", "Llg2/a;", "departmentMapper", "<init>", "(Lmx/c;Llg2/d;Llg2/a;)V", "params", "f", "(Leh2/b$a;)Ldh2/c$a;", "Ltq0/k;", "document", "Lmx/a;", "e", "(Ltq0/k;)Lmx/a;", "a", "Lmx/c;", "b", "Llg2/d;", "c", "Llg2/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d statusMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lg2.a departmentMapper;

    /* JADX INFO: renamed from: eh2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Leh2/b$a;", "", "Ldh2/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onQueryChange", "Lkotlin/Function0;", "onClearClicked", "", "onActiveChange", "onBackClick", "Lkotlin/Function2;", "Ltq0/k;", "onClickOrder", "<init>", "(Ldh2/b;Ler/l;Ler/a;Ler/l;Ler/a;Ler/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ldh2/b;", "f", "()Ldh2/b;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "Ler/p;", "()Ler/p;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dh2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onActiveChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, k, i0> onClickOrder;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dh2.b bVar, l<? super String, i0> lVar, er.a<i0> aVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar2, p<? super String, ? super k, i0> pVar) {
            this.state = bVar;
            this.onQueryChange = lVar;
            this.onClearClicked = aVar;
            this.onActiveChange = lVar2;
            this.onBackClick = aVar2;
            this.onClickOrder = pVar;
        }

        public final l<Boolean, i0> a() {
            return this.onActiveChange;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final er.a<i0> c() {
            return this.onClearClicked;
        }

        public final p<String, k, i0> d() {
            return this.onClickOrder;
        }

        public final l<String, i0> e() {
            return this.onQueryChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onQueryChange, params.onQueryChange) && t.c(this.onClearClicked, params.onClearClicked) && t.c(this.onActiveChange, params.onActiveChange) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onClickOrder, params.onClickOrder);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final dh2.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onQueryChange.hashCode()) * 31) + this.onClearClicked.hashCode()) * 31) + this.onActiveChange.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onClickOrder.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onQueryChange=" + this.onQueryChange + ", onClearClicked=" + this.onClearClicked + ", onActiveChange=" + this.onActiveChange + ", onBackClick=" + this.onBackClick + ", onClickOrder=" + this.onClickOrder + ')';
        }
    }

    /* JADX INFO: renamed from: eh2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1212b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51523a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.Transcript.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.FullTranscript.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.Extract.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.ClosingCertificate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51523a = iArr;
        }
    }

    public b(mx.c cVar, d dVar, lg2.a aVar) {
        this.labelProvider = cVar;
        this.statusMapper = dVar;
        this.departmentMapper = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, OrderedDocumentByNumber orderedDocumentByNumber, k kVar) {
        params.d().B(orderedDocumentByNumber.getNumber(), kVar);
        return i0.f148189a;
    }

    public final Label e(k document) {
        Label labelE;
        int i15 = C1212b.f51523a[document.getType().ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(xf2.a.J0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(xf2.a.G0);
        }
        if (i15 == 3) {
            String strB = this.departmentMapper.b(document.a());
            return (strB == null || (labelE = this.labelProvider.e(xf2.a.f218360f1, strB)) == null) ? this.labelProvider.c(xf2.a.F0) : labelE;
        }
        if (i15 == 4) {
            return this.labelProvider.c(xf2.a.E0);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        i.Small small;
        r50.g gVar;
        dh2.b state = params.getState();
        if (state instanceof dh2.b.d) {
            return c.a.d.f42590a;
        }
        int i15 = 0;
        if (state instanceof dh2.b.C0932b) {
            return new c.a.Empty(params.b(), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(xf2.a.U0), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(0, 1, null), this.labelProvider.c(xf2.a.W0), this.labelProvider.c(xf2.a.V0), null, null, null, false, 72, null));
        }
        if (state instanceof dh2.b.Error) {
            return new c.a.Error(((dh2.b.Error) state).getAdapter());
        }
        if (!(state instanceof dh2.b.Content)) {
            throw new oq.p();
        }
        er.a<i0> aVarB = params.b();
        dh2.b.Content content = (dh2.b.Content) state;
        boolean isSearchActive = content.getIsSearchActive();
        if (!isSearchActive) {
            small = new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(xf2.a.U0), null, null, null, 28, null);
        } else {
            if (!isSearchActive) {
                throw new oq.p();
            }
            small = null;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, small, null, null, null, null, 61, null);
        SearchBarData searchBarData = new SearchBarData(content.getQuery(), params.e(), content.getIsSearchActive(), params.a(), params.c(), this.labelProvider.c(xf2.a.f218400t), null, Integer.valueOf(content.c().size()), 64, null);
        List<OrderedDocumentByNumber> listC = content.c();
        int i16 = 10;
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i17 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final OrderedDocumentByNumber orderedDocumentByNumber = (OrderedDocumentByNumber) next;
            Label labelN = this.labelProvider.f(xf2.a.X0, mx.b.b(orderedDocumentByNumber.getNumber(), "group_title_" + i15)).n("group_title_" + i15);
            List<k> listD = orderedDocumentByNumber.d();
            ArrayList arrayList2 = new ArrayList(v.y(listD, i16));
            for (final k kVar : listD) {
                boolean z15 = kVar instanceof k.PaymentError;
                String str = "group_" + i15;
                Label labelB = this.statusMapper.b(kVar);
                if (kVar instanceof k.AboutToExpire) {
                    gVar = r50.g.NOTICE;
                } else if (kVar instanceof k.Expired) {
                    gVar = r50.g.MINUS;
                } else if (kVar instanceof k.ToDownload) {
                    gVar = r50.g.POSITIVE;
                } else if (kVar instanceof k.Generating) {
                    gVar = r50.g.INFORMATIVE;
                } else {
                    if (!(kVar instanceof k.Rejected) && !(kVar instanceof k.GenericError) && !z15) {
                        throw new oq.p();
                    }
                    gVar = r50.g.NEGATIVE;
                }
                w0.StatusBadge statusBadge = new w0.StatusBadge(new r50.a.WithIcon(null, labelB, null, 0, false, gVar, 29, null));
                Iterator it4 = it;
                BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(e(kVar), null, null, 0, 0, null, 62, null)), !kVar.f().isEmpty() ? new SingleCardLabel(mx.b.b(kVar.h(), "shortAddress"), null, null, 0, 0, null, 62, null) : null, 1, null);
                x0.Icon iconB = !z15 ? x0.Icon.INSTANCE.b() : null;
                er.a aVar = new er.a() { // from class: eh2.a
                    @Override // er.a
                    public final Object a() {
                        return b.h(params, orderedDocumentByNumber, kVar);
                    }
                };
                if (z15) {
                    aVar = null;
                }
                arrayList2.add(new DefaultSingleCardData(str, aVar, false, null, null, false, null, statusBadge, bodySection, null, iconB, null, 2684, null));
                it = it4;
            }
            arrayList.add(new c.a.Content.Group(labelN, arrayList2));
            i15 = i17;
            it = it;
            i16 = 10;
        }
        return new c.a.Content(aVarB, baseScaffoldData, searchBarData, arrayList, new EmptyStateData(this.labelProvider.c(xf2.a.f218391q), this.labelProvider.c(xf2.a.f218406v), null, 4, null));
    }
}
