package b43;

import androidx.compose.ui.graphics.Color;
import er.p;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r50.g;
import tt0.BEReportedIntervention;
import tt0.BEReportedInterventionGroup;
import tt0.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb43/b;", "Lxw/f;", "Lb43/b$a;", "La43/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "stringId", "Lmx/a;", "h", "(I)Lmx/a;", "params", "e", "(Lb43/b$a;)La43/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, a43.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b43.b$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001e¨\u0006!"}, d2 = {"Lb43/b$a;", "", "La43/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextClick", "Lkotlin/Function2;", "", "Ltt0/e;", "onDetailsClick", "onBack", "<init>", "(La43/b;Ler/a;Ler/p;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La43/b;", "d", "()La43/b;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/p;", "()Ler/p;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a43.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, tt0.e, i0> onDetailsClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(a43.b bVar, er.a<i0> aVar, p<? super String, ? super tt0.e, i0> pVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onNextClick = aVar;
            this.onDetailsClick = pVar;
            this.onBack = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final p<String, tt0.e, i0> b() {
            return this.onDetailsClick;
        }

        public final er.a<i0> c() {
            return this.onNextClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a43.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onDetailsClick, params.onDetailsClick) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onNextClick.hashCode()) * 31) + this.onDetailsClick.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextClick=" + this.onNextClick + ", onDetailsClick=" + this.onDetailsClick + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: renamed from: b43.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0393b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16526a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16526a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16527a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1622786747);
            if (p076m2.t.k()) {
                p076m2.t.o(1622786747, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.welcome.mapper.WelcomeScreenMapper.invoke.<anonymous> (WelcomeScreenMapper.kt:64)");
            }
            long jA = ((o23.a) rVar.N(o23.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, BEReportedIntervention bEReportedIntervention) {
        params.b().B(bEReportedIntervention.getInitiativeId(), bEReportedIntervention.getType());
        return i0.f148189a;
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a43.c.a b(final Params params) {
        a43.c.a.Content.InterfaceC0048a bodyList;
        Label labelH;
        g gVar;
        a43.b state = params.getState();
        if (state instanceof a43.b.Error) {
            return new a43.c.a.Error(((a43.b.Error) state).getErrorVMSAdapter());
        }
        if (t.c(state, a43.b.c.f2899a)) {
            return a43.c.a.C0051c.f2911a;
        }
        if (!(state instanceof a43.b.Content)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), h(h23.b.U1), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106837o4, null, c.f16527a, h(h23.b.O1), h(h23.b.T1), null, 34, null);
        a43.b.Content content = (a43.b.Content) state;
        if (content.a().isEmpty()) {
            bodyList = new a43.c.a.Content.InterfaceC0048a.Empty(new EmptyStateData(null, h(h23.b.N1), null, 5, null));
        } else {
            List<BEReportedInterventionGroup> listA = content.a();
            int i15 = 10;
            ArrayList arrayList = new ArrayList(v.y(listA, 10));
            Iterator it = listA.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                BEReportedInterventionGroup bEReportedInterventionGroup = (BEReportedInterventionGroup) next;
                Label labelB = mx.b.b(this.dateFormatter.b(bEReportedInterventionGroup.getCreatedAt()), "time");
                List<BEReportedIntervention> listB = bEReportedInterventionGroup.b();
                ArrayList arrayList2 = new ArrayList(v.y(listB, i15));
                int i18 = 0;
                for (Object obj : listB) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        v.x();
                    }
                    final BEReportedIntervention bEReportedIntervention = (BEReportedIntervention) obj;
                    String str = "InterventionCard_" + i16 + i18;
                    d processingStatus = bEReportedIntervention.getProcessingStatus();
                    int[] iArr = C0393b.f16526a;
                    int i25 = iArr[processingStatus.ordinal()];
                    Iterator it4 = it;
                    if (i25 == 1) {
                        labelH = h(h23.b.S1);
                    } else if (i25 == 2) {
                        labelH = h(h23.b.R1);
                    } else {
                        if (i25 != 3) {
                            throw new oq.p();
                        }
                        labelH = h(h23.b.Q1);
                    }
                    Label label = labelH;
                    int i26 = iArr[bEReportedIntervention.getProcessingStatus().ordinal()];
                    if (i26 == 1) {
                        gVar = g.INFORMATIVE;
                    } else if (i26 == 2) {
                        gVar = g.NOTICE;
                    } else {
                        if (i26 != 3) {
                            throw new oq.p();
                        }
                        gVar = g.POSITIVE;
                    }
                    arrayList2.add(new DefaultSingleCardData(str, new er.a() { // from class: b43.a
                        @Override // er.a
                        public final Object a() {
                            return b.f(params, bEReportedIntervention);
                        }
                    }, false, null, null, false, null, new w0.StatusBadge(new r50.a.WithIcon(null, label, null, 0, true, gVar, 13, null)), new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEReportedIntervention.getCategoryName(), "category"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(bEReportedIntervention.getNumber(), "number"), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2684, null));
                    i18 = i19;
                    it = it4;
                }
                arrayList.add(new a43.c.a.Content.InterfaceC0048a.BodyList.Group(labelB, arrayList2));
                i16 = i17;
                it = it;
                i15 = 10;
            }
            bodyList = new a43.c.a.Content.InterfaceC0048a.BodyList(arrayList);
        }
        return new a43.c.a.Content(baseScaffoldData, icon, bodyList, new ButtonData("NewReportButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(h23.b.P1), null, 2, null), k30.d.a.f107773a, null, params.c(), 34, null), params.a());
    }
}
