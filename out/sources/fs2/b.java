package fs2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import ez.e;
import fr.t;
import gs2.PenaltyPointsCardModel;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageData;
import q40.j;
import qv0.Violation;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010 J\u0019\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lfs2/b;", "Lxw/f;", "Lfs2/b$a;", "Les2/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Les2/b$a;", "state", "Lkotlin/Function1;", "Lqv0/g;", "Loq/i0;", "onViolationClick", "Les2/c$a$a$a;", "r", "(Les2/b$a;Ler/l;)Les2/c$a$a$a;", "s", "", "violations", "Ln50/g;", "h", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "Lc30/b$b;", "u", "(Ljava/util/List;)Lc30/b$b;", "", "activePenaltyPoints", "Lgs2/a;", "m", "(I)Lgs2/a;", "temporaryPenaltyPoints", "q", "Ljava/time/OffsetDateTime;", "violationDate", "Lmx/a;", "f", "(Ljava/time/OffsetDateTime;)Lmx/a;", "points", "e", "(Ljava/lang/Integer;)Lmx/a;", "params", "l", "(Lfs2/b$a;)Les2/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, es2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: fs2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Lfs2/b$a;", "", "Les2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onInfoClick", "Lkotlin/Function1;", "Lqv0/g;", "onViolationClick", "Ly30/n$b$b;", "onStatusTabSelected", "<init>", "(Les2/b;Ler/a;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Les2/b;", "e", "()Les2/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final es2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Violation, i0> onViolationClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onStatusTabSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(es2.b bVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super Violation, i0> lVar, l<? super n.Switch.EnumC5973b, i0> lVar2) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onInfoClick = aVar2;
            this.onViolationClick = lVar;
            this.onStatusTabSelected = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onInfoClick;
        }

        public final l<n.Switch.EnumC5973b, i0> c() {
            return this.onStatusTabSelected;
        }

        public final l<Violation, i0> d() {
            return this.onViolationClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final es2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onInfoClick, params.onInfoClick) && t.c(this.onViolationClick, params.onViolationClick) && t.c(this.onStatusTabSelected, params.onStatusTabSelected);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onInfoClick.hashCode()) * 31) + this.onViolationClick.hashCode()) * 31) + this.onStatusTabSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onInfoClick=" + this.onInfoClick + ", onViolationClick=" + this.onViolationClick + ", onStatusTabSelected=" + this.onStatusTabSelected + ')';
        }
    }

    /* JADX INFO: renamed from: fs2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1492b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66876a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66876a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((Violation) t16).getViolationDate(), ((Violation) t15).getViolationDate());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f66877a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(369604792);
            if (p076m2.t.k()) {
                p076m2.t.o(369604792, i15, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.mappers.PenaltyPointsMapper.invoke.<anonymous> (PenaltyPointsMapper.kt:59)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(Integer points) {
        mx.c cVar = this.labelProvider;
        int i15 = zr2.a.B;
        Object obj = points;
        if (points == null) {
            obj = "-";
        }
        return cVar.e(i15, obj);
    }

    private final Label f(OffsetDateTime violationDate) {
        return this.labelProvider.f(zr2.a.D, mx.b.d(violationDate != null ? this.dateFormatter.d(new fz.b.OffsetDateTime(violationDate), fz.c.DOTTED) : null, "violationDate"));
    }

    private final List<DefaultSingleCardData> h(List<Violation> violations, final l<? super Violation, i0> onViolationClick) {
        Integer penaltyPoints;
        if (violations != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : violations) {
                Violation violation = (Violation) obj;
                if (violation.getPenaltyPoints() != null && ((penaltyPoints = violation.getPenaltyPoints()) == null || penaltyPoints.intValue() != 0)) {
                    arrayList.add(obj);
                }
            }
            List listU0 = v.U0(arrayList, new c());
            if (listU0 != null) {
                List<Violation> list = listU0;
                ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                for (final Violation violation2 : list) {
                    arrayList2.add(new DefaultSingleCardData(null, new er.a() { // from class: fs2.a
                        @Override // er.a
                        public final Object a() {
                            return b.i(onViolationClick, violation2);
                        }
                    }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(f(violation2.getViolationDate()), null, null, 0, 0, null, 62, null)), new SingleCardLabel(e(violation2.getPenaltyPoints()), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
                }
                return arrayList2;
            }
        }
        return v.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, Violation violation) {
        lVar.b(violation);
        return i0.f148189a;
    }

    private final PenaltyPointsCardModel m(int activePenaltyPoints) {
        return new PenaltyPointsCardModel(mx.b.b(String.valueOf(activePenaltyPoints), "active_penalty_points_value"), activePenaltyPoints > 0 ? new gs2.b.Active(this.labelProvider.c(zr2.a.f236506s)) : new gs2.b.Lack(this.labelProvider.c(zr2.a.f236509v)), null);
    }

    private final PenaltyPointsCardModel q(int temporaryPenaltyPoints) {
        return new PenaltyPointsCardModel(mx.b.b(String.valueOf(temporaryPenaltyPoints), "temporary_penalty_points_value"), temporaryPenaltyPoints > 0 ? new gs2.b.Temporary(this.labelProvider.c(zr2.a.f236513z)) : new gs2.b.Lack(this.labelProvider.c(zr2.a.f236510w)), this.labelProvider.c(zr2.a.f236508u));
    }

    private final es2.c.a.DataLoaded.PenaltyPointsTabData r(es2.b.DataSet state, l<? super Violation, i0> onViolationClick) {
        Integer activePenaltyPoints = state.getPenaltyPoints().getActivePenaltyPoints();
        if (activePenaltyPoints == null) {
            return null;
        }
        return new es2.c.a.DataLoaded.PenaltyPointsTabData(u(state.getPenaltyPoints().b()), m(activePenaltyPoints.intValue()), this.labelProvider.c(zr2.a.E), h(state.getPenaltyPoints().b(), onViolationClick));
    }

    private final es2.c.a.DataLoaded.PenaltyPointsTabData s(es2.b.DataSet state, l<? super Violation, i0> onViolationClick) {
        Integer temporaryPenaltyPoints = state.getPenaltyPoints().getTemporaryPenaltyPoints();
        if (temporaryPenaltyPoints == null) {
            return null;
        }
        return new es2.c.a.DataLoaded.PenaltyPointsTabData(u(state.getPenaltyPoints().d()), q(temporaryPenaltyPoints.intValue()), this.labelProvider.c(zr2.a.E), h(state.getPenaltyPoints().d(), onViolationClick));
    }

    private final c30.b.C0606b u(List<Violation> violations) {
        Object next;
        if (violations != null) {
            Iterator<T> it = violations.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Violation) next).getPenaltyPoints() != null);
            if (((Violation) next) != null) {
                return new c30.b.C0606b(null, null, this.labelProvider.c(zr2.a.f236488a), this.labelProvider.c(zr2.a.C), null, null, null, 115, null);
            }
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public es2.c.a b(Params params) {
        es2.c.a.DataLoaded.PenaltyPointsTabData penaltyPointsTabDataR;
        es2.b state = params.getState();
        if (t.c(state, es2.b.C1255b.f53276a)) {
            return es2.c.a.b.f53287a;
        }
        if (!(state instanceof es2.b.DataSet)) {
            throw new oq.p();
        }
        Label labelC = this.labelProvider.c(zr2.a.A);
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), labelC, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, d.f66877a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        n.Switch r15 = new n.Switch(new n.Switch.TabItem(this.labelProvider.c(zr2.a.f236511x), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(zr2.a.f236512y), n.Switch.EnumC5973b.RIGHT), ((es2.b.DataSet) params.getState()).getSelectedType(), false, params.c(), 8, null);
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(zr2.a.f236507t), null, null, null, 119, null);
        int i15 = C1492b.f66876a[((es2.b.DataSet) params.getState()).getSelectedType().ordinal()];
        if (i15 == 1) {
            penaltyPointsTabDataR = r((es2.b.DataSet) params.getState(), params.d());
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            penaltyPointsTabDataR = s((es2.b.DataSet) params.getState(), params.d());
        }
        return new es2.c.a.DataLoaded(baseScaffoldData, aVarA, r15, cVar, penaltyPointsTabDataR, new IconPageData(new j.a(jz.a.f106888w), this.labelProvider.c(zr2.a.f236491d), this.labelProvider.c(zr2.a.f236490c), null, null, null, false, 72, null));
    }
}
