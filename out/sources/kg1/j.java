package kg1;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import fr.t;
import h30.ButtonData;
import hg1.m;
import hg1.n;
import java.time.LocalDate;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import v40.InputDateTimeData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkg1/j;", "Lxw/f;", "Lkg1/j$a;", "Lhg1/n$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lia1/a;Lez/e;)V", "Lhg1/m$e;", "stateData", "params", "l", "(Lhg1/m$e;Lkg1/j$a;)Lhg1/n$a;", "Lhg1/m$e$a;", "Lhg1/n$a$c;", "q", "(Lhg1/m$e$a;Lkg1/j$a;)Lhg1/n$a$c;", "Lhg1/m$e$b;", "Lhg1/n$a$d;", "s", "(Lhg1/m$e$b;Lkg1/j$a;)Lhg1/n$a$d;", "Lh30/a;", "m", "(Lkg1/j$a;)Lh30/a;", "E", "(Lkg1/j$a;)Lhg1/n$a;", "a", "Lmx/c;", "b", "Lia1/a;", "c", "Lez/e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: kg1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lkg1/j$a;", "", "Lhg1/m;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onNextAction", "Lkotlin/Function1;", "Lhg1/n$a$d$a;", "onDatePickerAction", "", "onUrlAction", "Lna1/a;", "onSuspensionPeriodSelectionAction", "<init>", "(Lhg1/m;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg1/m;", "f", "()Lhg1/m;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.a.InitializedSuspension.InterfaceC1954a, i0> onDatePickerAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<na1.a, i0> onSuspensionPeriodSelectionAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m mVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super n.a.InitializedSuspension.InterfaceC1954a, i0> lVar, l<? super String, i0> lVar2, l<? super na1.a, i0> lVar3) {
            this.state = mVar;
            this.onBackAction = aVar;
            this.onNextAction = aVar2;
            this.onDatePickerAction = lVar;
            this.onUrlAction = lVar2;
            this.onSuspensionPeriodSelectionAction = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<n.a.InitializedSuspension.InterfaceC1954a, i0> b() {
            return this.onDatePickerAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        public final l<na1.a, i0> d() {
            return this.onSuspensionPeriodSelectionAction;
        }

        public final l<String, i0> e() {
            return this.onUrlAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onDatePickerAction, params.onDatePickerAction) && t.c(this.onUrlAction, params.onUrlAction) && t.c(this.onSuspensionPeriodSelectionAction, params.onSuspensionPeriodSelectionAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final m getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onDatePickerAction.hashCode()) * 31) + this.onUrlAction.hashCode()) * 31) + this.onSuspensionPeriodSelectionAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onNextAction=" + this.onNextAction + ", onDatePickerAction=" + this.onDatePickerAction + ", onUrlAction=" + this.onUrlAction + ", onSuspensionPeriodSelectionAction=" + this.onSuspensionPeriodSelectionAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110847a;

        static {
            int[] iArr = new int[na1.a.values().length];
            try {
                iArr[na1.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f110847a = iArr;
        }
    }

    public j(mx.c cVar, ia1.a aVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
        this.dateFormatter = eVar;
    }

    private final n.a l(m.e stateData, Params params) {
        if (stateData instanceof m.e.Resumption) {
            return q((m.e.Resumption) stateData, params);
        }
        if (stateData instanceof m.e.Suspension) {
            return s((m.e.Suspension) stateData, params);
        }
        throw new p();
    }

    private final ButtonData m(Params params) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null);
    }

    private final n.a.InitializedResumption q(m.e.Resumption stateData, final Params params) {
        return new n.a.InitializedResumption(new n.a.InitializedResumption.ResumptionDate(this.labelProvider.c(ha1.a.f82376c5), new InputDateTimeData(null, this.labelProvider.c(ha1.a.A5), this.dateFormatter.d(new fz.b.LocalDate(stateData.getStartResumptionDate()), fz.c.DOTTED), InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, new er.a() { // from class: kg1.i
            @Override // er.a
            public final Object a() {
                return j.r(params);
            }
        }, 1009, null)), params.a(), m(params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.b().b(n.a.InitializedSuspension.InterfaceC1954a.C1955a.f84423a);
        return i0.f148189a;
    }

    private final n.a.InitializedSuspension s(m.e.Suspension stateData, final Params params) {
        String strD;
        Label labelC = this.labelProvider.c(ha1.a.G5);
        LocalDate startSuspensionDate = stateData.getStartSuspensionDate();
        ez.e eVar = this.dateFormatter;
        fz.b.LocalDate localDate = new fz.b.LocalDate(startSuspensionDate);
        fz.c cVar = fz.c.DOTTED;
        String strD2 = eVar.d(localDate, cVar);
        Label labelC2 = this.labelProvider.c(ha1.a.F5);
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        n.a.InitializedSuspension.StartSuspensionPeriod startSuspensionPeriod = new n.a.InitializedSuspension.StartSuspensionPeriod(labelC, new InputDateTimeData(null, labelC2, strD2, c5303a, null, null, null, null, false, null, new er.a() { // from class: kg1.e
            @Override // er.a
            public final Object a() {
                return j.u(params);
            }
        }, 1009, null));
        Label labelC3 = this.labelProvider.c(ha1.a.D5);
        Label labelC4 = this.labelProvider.c(ha1.a.f82548z5);
        b50.e.a aVar = b50.e.a.f16684a;
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, stateData.getSuspensionPeriodSelection() == na1.a.SUSPEND, false, 5, null), new er.a() { // from class: kg1.f
            @Override // er.a
            public final Object a() {
                return j.v(params);
            }
        }, this.labelProvider.c(ha1.a.B5), null, null, 24, null);
        Label labelC5 = this.labelProvider.c(ha1.a.C5);
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, stateData.getSuspensionPeriodSelection() == na1.a.RESUME_WITH_DATA_ADJUSTMENT, false, 5, null);
        LocalDate endSuspensionDate = stateData.getEndSuspensionDate();
        if (endSuspensionDate == null || (strD = this.dateFormatter.d(new fz.b.LocalDate(endSuspensionDate), cVar)) == null) {
            strD = "";
        }
        List listQ = v.q(radioButtonRow, new RadioButtonRow(radioButtonItemData, new er.a() { // from class: kg1.h
            @Override // er.a
            public final Object a() {
                return j.z(params);
            }
        }, labelC5, null, new ig1.b(new InputDateTimeData(null, this.labelProvider.c(ha1.a.A5), strD, c5303a, null, null, null, null, false, null, new er.a() { // from class: kg1.g
            @Override // er.a
            public final Object a() {
                return j.x(params);
            }
        }, 1009, null)), 8, null));
        Label labelC6 = this.labelProvider.c(ha1.a.f82477p4);
        na1.a suspensionPeriodSelection = stateData.getSuspensionPeriodSelection();
        return new n.a.InitializedSuspension(startSuspensionPeriod, new n.a.InitializedSuspension.EndSuspensionPeriod(labelC3, labelC4, new RadioButtonData(listQ, aVar, (suspensionPeriodSelection == null ? -1 : b.f110847a[suspensionPeriodSelection.ordinal()]) == 1 ? new b50.d.Error(this.labelProvider.c(ha1.a.f82426j)) : b50.d.c.f16683a, null, null, labelC6, null, 88, null)), new c30.b.c(null, null, null, this.labelProvider.c(ha1.a.E5), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(ha1.a.J4), this.companyEndpoints.w(), LinkData.EnumC5775a.WEBSITE, false, params.e(), 17, null)), 55, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.b().b(n.a.InitializedSuspension.InterfaceC1954a.C1955a.f84423a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.d().b(na1.a.SUSPEND);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.b().b(n.a.InitializedSuspension.InterfaceC1954a.b.f84424a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params) {
        params.d().b(na1.a.RESUME_WITH_DATA_ADJUSTMENT);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public n.a b(Params params) {
        m state = params.getState();
        if (t.c(state, m.d.f84395a)) {
            return n.a.b.f84409a;
        }
        if (state instanceof m.GetCitizenData) {
            return l(((m.GetCitizenData) state).getData(), params);
        }
        if (state instanceof m.e.Resumption) {
            return q((m.e.Resumption) state, params);
        }
        if (state instanceof m.e.Suspension) {
            return s((m.e.Suspension) state, params);
        }
        if (state instanceof m.ErrorInitial) {
            return new n.a.Error(((m.ErrorInitial) state).getErrorVMS());
        }
        if (state instanceof m.ErrorInitialized) {
            return new n.a.Error(((m.ErrorInitialized) state).getErrorVMS());
        }
        throw new p();
    }
}
