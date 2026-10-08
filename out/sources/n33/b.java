package n33;

import cb4.i;
import d60.ScrollControllerData;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import m33.d;
import m33.e;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;
import t50.s;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ln33/b;", "Lxw/f;", "Ln33/b$a;", "Lm33/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "stringId", "Lmx/a;", "h", "(I)Lmx/a;", "params", "e", "(Ln33/b$a;)Lm33/e$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: n33.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006&"}, d2 = {"Ln33/b$a;", "", "Lm33/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextClick", "onBack", "onClose", "Lkotlin/Function1;", "", "onChangeReportNumber", "onChangeInstitutionName", "onClickDate", "<init>", "(Lm33/d;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm33/d;", "g", "()Lm33/d;", "b", "Ler/a;", "f", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeReportNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onChangeInstitutionName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClickDate;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar4) {
            this.state = dVar;
            this.onNextClick = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onChangeReportNumber = lVar;
            this.onChangeInstitutionName = lVar2;
            this.onClickDate = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onChangeInstitutionName;
        }

        public final l<String, i0> c() {
            return this.onChangeReportNumber;
        }

        public final er.a<i0> d() {
            return this.onClickDate;
        }

        public final er.a<i0> e() {
            return this.onClose;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onChangeReportNumber, params.onChangeReportNumber) && t.c(this.onChangeInstitutionName, params.onChangeInstitutionName) && t.c(this.onClickDate, params.onClickDate);
        }

        public final er.a<i0> f() {
            return this.onNextClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onNextClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onChangeReportNumber.hashCode()) * 31) + this.onChangeInstitutionName.hashCode()) * 31) + this.onClickDate.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextClick=" + this.onNextClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onChangeReportNumber=" + this.onChangeReportNumber + ", onChangeInstitutionName=" + this.onChangeInstitutionName + ", onClickDate=" + this.onClickDate + ')';
        }
    }

    public b(c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(boolean z15) {
        return i0.f148189a;
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        d state = params.getState();
        d.Dialog dialog = state instanceof d.Dialog ? (d.Dialog) state : null;
        i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        x50.i.Small small = new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), h(h23.b.V0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.e(), 6, null)), null, 20, null);
        d state2 = params.getState();
        d.Screen screen = state2 instanceof d.Screen ? (d.Screen) state2 : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, small, null, null, null, new ScrollControllerData(screen != null ? screen.d() : null, false, false, 6, null), 29, null);
        Label labelH = h(h23.b.Q0);
        Label labelH2 = h(h23.b.R0);
        String institutionName = params.getState().getForm().getInstitutionName();
        s.Fix fix = new s.Fix(0, 1, null);
        hz.b institutionNameValidation = params.getState().getForm().getInstitutionNameValidation();
        TextAreaData textAreaData = new TextAreaData("InstitutionNameTextArea", labelH2, fix, null, institutionNameValidation instanceof hz.b.Invalid ? new t50.e.Error(((hz.b.Invalid) institutionNameValidation).getMessage()) : new t50.e.Default(null, 1, null), institutionName, false, new t50.a.Visible(300, new l() { // from class: n33.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(((Boolean) obj).booleanValue());
            }
        }), null, 0, null, m33.b.INSTITUTION_NAME, params.b(), null, 10056, null);
        v50.c.Text text = new v50.c.Text("ReportNumberInput", h(h23.b.U0), null, mx.b.b(params.getState().getForm().getReportNumber(), ""), params.getState().getForm().getReportNumberValidation(), null, null, params.c(), null, false, 0, null, false, null, false, null, null, null, null, m33.b.REPORT_NUMBER, 524132, null);
        Label labelH3 = h(h23.b.T0);
        fz.b.LocalDate reportDate = params.getState().getForm().getReportDate();
        return new e.Data(dialogVMSAdapter, baseScaffoldData, labelH, textAreaData, text, new InputDateTimeData("ReportDateInput", labelH3, reportDate != null ? this.dateFormatter.d(reportDate, fz.c.DOTTED) : null, InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, params.d(), 1008, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(h23.b.H), null, 2, null), k30.d.a.f107773a, null, params.f(), 35, null), params.a());
    }
}
