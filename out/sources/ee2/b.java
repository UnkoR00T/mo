package ee2;

import androidx.compose.ui.graphics.Color;
import de2.Error;
import de2.d;
import de2.e;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zp0.BEReportedIncidentsReportedIncident;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lee2/b;", "Lxw/f;", "Lee2/b$a;", "Lde2/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lzp0/r;", "", "index", "Lkotlin/Function1;", "Loq/i0;", "onIncidentClick", "Ln50/g;", "e", "(Lzp0/r;ILer/l;)Ln50/g;", "stringId", "Lmx/a;", "i", "(I)Lmx/a;", "params", "h", "(Lee2/b$a;)Lde2/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ee2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lee2/b$a;", "", "Lde2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onNewIncidentClick", "Lkotlin/Function1;", "Lzp0/r;", "onReportedIncidentClick", "<init>", "(Lde2/d;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lde2/d;", "d", "()Lde2/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNewIncidentClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEReportedIncidentsReportedIncident, i0> onReportedIncidentClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super BEReportedIncidentsReportedIncident, i0> lVar) {
            this.state = dVar;
            this.onBackClick = aVar;
            this.onNewIncidentClick = aVar2;
            this.onReportedIncidentClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onNewIncidentClick;
        }

        public final l<BEReportedIncidentsReportedIncident, i0> c() {
            return this.onReportedIncidentClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onNewIncidentClick, params.onNewIncidentClick) && t.c(this.onReportedIncidentClick, params.onReportedIncidentClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onNewIncidentClick.hashCode()) * 31) + this.onReportedIncidentClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onNewIncidentClick=" + this.onNewIncidentClick + ", onReportedIncidentClick=" + this.onReportedIncidentClick + ')';
        }
    }

    /* JADX INFO: renamed from: ee2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1178b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1178b f49669a = new C1178b();

        C1178b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-237733333);
            if (p076m2.t.k()) {
                p076m2.t.o(-237733333, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.mapper.IncidentDashboardScreenMapper.invoke.<anonymous> (IncidentDashboardScreenMapper.kt:61)");
            }
            long jA = ((ce2.a) rVar.N(ce2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final DefaultSingleCardData e(final BEReportedIncidentsReportedIncident bEReportedIncidentsReportedIncident, int i15, final l<? super BEReportedIncidentsReportedIncident, i0> lVar) {
        return new DefaultSingleCardData("incidentCard_" + i15, new er.a() { // from class: ee2.a
            @Override // er.a
            public final Object a() {
                return b.f(lVar, bEReportedIncidentsReportedIncident);
            }
        }, false, null, null, false, null, new w0.StatusBadge(fe2.a.a(bEReportedIncidentsReportedIncident.getState(), this.labelProvider, true)), new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEReportedIncidentsReportedIncident.getType().getName(), "title_" + i15), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), new BottomSection(n50.l.b(this.labelProvider.e(ud2.a.X, this.dateFormatter.d(bEReportedIncidentsReportedIncident.getReportedDate(), fz.c.DOTTED)), null, null, 3, null), null, 2, null), 636, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, BEReportedIncidentsReportedIncident bEReportedIncidentsReportedIncident) {
        lVar.b(bEReportedIncidentsReportedIncident);
        return i0.f148189a;
    }

    private final Label i(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        e.b incidentsList;
        d state = params.getState();
        if (t.c(state, de2.c.f41186a)) {
            return new e.a.Empty(params.a());
        }
        if (!(state instanceof d.Initialized)) {
            if (!(state instanceof Error)) {
                throw new oq.p();
            }
            return new e.a.Error(params.a(), ((Error) state).getError());
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), i(ud2.a.f197732e0), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106809k4, null, C1178b.f49669a, i(ud2.a.f197734f0), i(ud2.a.V), null, 34, null);
        er.a<i0> aVarB = params.b();
        int i15 = 0;
        ButtonData buttonData = new ButtonData("newIncidentButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(i(ud2.a.W), null, 2, null), k30.d.a.f107773a, null, aVarB, 34, null);
        if (((d.Initialized) params.getState()).d().isEmpty()) {
            incidentsList = new e.b.Empty(new EmptyStateData(null, i(ud2.a.Y), null, 5, null));
        } else {
            Label labelI = i(ud2.a.Z);
            List<BEReportedIncidentsReportedIncident> listD = ((d.Initialized) params.getState()).d();
            ArrayList arrayList = new ArrayList(v.y(listD, 10));
            for (Object obj : listD) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                arrayList.add(e((BEReportedIncidentsReportedIncident) obj, i15, params.c()));
                i15 = i16;
            }
            incidentsList = new e.b.IncidentsList(labelI, arrayList);
        }
        return new e.a.Initialized(aVarA, baseScaffoldData, icon, incidentsList, buttonData, ((d.Initialized) state).getDialogVMSAdapter());
    }
}
