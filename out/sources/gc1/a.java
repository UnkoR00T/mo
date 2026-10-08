package gc1;

import ec1.Date;
import ec1.Number;
import ec1.State;
import ec1.TextArea;
import ec1.c;
import ec1.d0;
import er.l;
import ez.e;
import fr.t;
import fz.b;
import h30.ButtonData;
import java.time.LocalDate;
import k30.d;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t50.TextAreaData;
import t50.s;
import v40.InputDateTimeData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgc1/a;", "Lxw/f;", "Lgc1/a$a;", "Lec1/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ljava/time/LocalDate;", "", "e", "(Ljava/time/LocalDate;)Ljava/lang/String;", "params", "c", "(Lgc1/a$a;)Lec1/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: gc1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b&\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001a\u0010%¨\u0006("}, d2 = {"Lgc1/a$a;", "", "Lec1/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onFullNameChanged", "onShortNameChanged", "Lkotlin/Function0;", "onDateFieldClicked", "onNumberOfEmployeesChanged", "onScrolledToField", "onNextAction", "onBackAction", "<init>", "(Lec1/b;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lec1/b;", "h", "()Lec1/b;", "b", "Ler/l;", "c", "()Ler/l;", "g", "d", "Ler/a;", "()Ler/a;", "e", "f", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onFullNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onShortNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateFieldClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onNumberOfEmployeesChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, l<? super String, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onFullNameChanged = lVar;
            this.onShortNameChanged = lVar2;
            this.onDateFieldClicked = aVar;
            this.onNumberOfEmployeesChanged = lVar3;
            this.onScrolledToField = aVar2;
            this.onNextAction = aVar3;
            this.onBackAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onDateFieldClicked;
        }

        public final l<String, i0> c() {
            return this.onFullNameChanged;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        public final l<String, i0> e() {
            return this.onNumberOfEmployeesChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFullNameChanged, params.onFullNameChanged) && t.c(this.onShortNameChanged, params.onShortNameChanged) && t.c(this.onDateFieldClicked, params.onDateFieldClicked) && t.c(this.onNumberOfEmployeesChanged, params.onNumberOfEmployeesChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public final er.a<i0> f() {
            return this.onScrolledToField;
        }

        public final l<String, i0> g() {
            return this.onShortNameChanged;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onFullNameChanged.hashCode()) * 31) + this.onShortNameChanged.hashCode()) * 31) + this.onDateFieldClicked.hashCode()) * 31) + this.onNumberOfEmployeesChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFullNameChanged=" + this.onFullNameChanged + ", onShortNameChanged=" + this.onShortNameChanged + ", onDateFieldClicked=" + this.onDateFieldClicked + ", onNumberOfEmployeesChanged=" + this.onNumberOfEmployeesChanged + ", onScrolledToField=" + this.onScrolledToField + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String e(LocalDate localDate) {
        if (localDate != null) {
            return this.dateFormatter.d(new b.LocalDate(localDate), fz.c.DOTTED);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        t50.e error;
        t50.e error2;
        Label labelC = this.labelProvider.c(ha1.a.T0);
        d0 d0Var = d0.FULL_NAME;
        Label labelC2 = this.labelProvider.c(ha1.a.M0);
        s.Flexible flexible = new s.Flexible(5);
        hz.b validationState = params.getState().c().getValidationState();
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        if (t.c(validationState, c2039b) || t.c(validationState, hz.b.d.f86848c)) {
            error = new t50.e.Default(this.labelProvider.c(ha1.a.N0));
        } else {
            if (!(validationState instanceof hz.b.Invalid)) {
                throw new p();
            }
            error = new t50.e.Error(((hz.b.Invalid) validationState).getMessage());
        }
        t50.e eVar = error;
        String strD = params.getState().c().d();
        t50.a.C4878a c4878a = t50.a.C4878a.f187691a;
        TextArea textArea = new TextArea(d0Var, new TextAreaData(null, labelC2, flexible, null, eVar, strD, false, c4878a, null, 0, null, null, params.c(), null, 12105, null));
        d0 d0Var2 = d0.SHORT_NAME;
        Label labelC3 = this.labelProvider.c(ha1.a.Q0);
        s.Flexible flexible2 = new s.Flexible(3);
        hz.b validationState2 = params.getState().g().getValidationState();
        if (t.c(validationState2, c2039b) || t.c(validationState2, hz.b.d.f86848c)) {
            error2 = new t50.e.Default(this.labelProvider.c(ha1.a.R0));
        } else {
            if (!(validationState2 instanceof hz.b.Invalid)) {
                throw new p();
            }
            error2 = new t50.e.Error(((hz.b.Invalid) validationState2).getMessage());
        }
        return new c.Data(labelC, v.q(textArea, new TextArea(d0Var2, new TextAreaData(null, labelC3, flexible2, null, error2, params.getState().g().d(), false, c4878a, null, 0, null, null, params.g(), null, 12105, null))), this.labelProvider.c(ha1.a.V0), new Date(d0.LAUNCH_DATE, new InputDateTimeData(null, this.labelProvider.c(ha1.a.U0), e(params.getState().d().d()), InputDateTimeData.b.C5303a.f203783c, params.getState().d().getValidationState(), null, null, null, false, null, params.b(), 993, null)), this.labelProvider.c(ha1.a.Z0), new Number(d0.NUMBER_OF_EMPLOYEES, new v50.c.Number(null, this.labelProvider.c(ha1.a.W0), null, mx.b.b(params.getState().e().d(), "numberOfEmployeesValue"), params.getState().e().getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null)), params.getState().getScrollToField(), params.f(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), d.a.f107773a, null, params.d(), 35, null), params.a());
    }
}
