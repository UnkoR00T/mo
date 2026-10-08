package oj3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import er.q;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.time.LocalDate;
import java.util.Locale;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import uv0.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loj3/f;", "Lxw/f;", "Loj3/f$a;", "Lnj3/f$b;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "l", "(Loj3/f$a;)Lnj3/f$b;", "a", "Lmx/c;", "b", "Lez/e;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, nj3.f.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: oj3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b\u001f\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010)R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b+\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b#\u0010&R1\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b*\u0010/R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b-\u0010&¨\u00060"}, d2 = {"Loj3/f$a;", "", "Lnj3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onTopBarIconMainClick", "Lkotlin/Function1;", "Luv0/d;", "onCheckPlateAction", "offSkipPlateFocusChange", "onPlateInputValueChange", "Luv0/v;", "onCheckVinAction", "offSkipVinFocusChange", "Lkotlin/Function3;", "Ljava/time/LocalDate;", "onCheckVehicleAction", "onRegistrationDateClick", "<init>", "(Lnj3/e;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/q;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnj3/e;", "i", "()Lnj3/e;", "b", "Ler/a;", "h", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "f", "g", "Ler/q;", "()Ler/q;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nj3.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTopBarIconMainClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<uv0.d, i0> onCheckPlateAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> offSkipPlateFocusChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<uv0.d, i0> onPlateInputValueChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onCheckVinAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> offSkipVinFocusChange;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<uv0.d, v, LocalDate, i0> onCheckVehicleAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRegistrationDateClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(nj3.e eVar, er.a<i0> aVar, l<? super uv0.d, i0> lVar, er.a<i0> aVar2, l<? super uv0.d, i0> lVar2, l<? super v, i0> lVar3, er.a<i0> aVar3, q<? super uv0.d, ? super v, ? super LocalDate, i0> qVar, er.a<i0> aVar4) {
            this.state = eVar;
            this.onTopBarIconMainClick = aVar;
            this.onCheckPlateAction = lVar;
            this.offSkipPlateFocusChange = aVar2;
            this.onPlateInputValueChange = lVar2;
            this.onCheckVinAction = lVar3;
            this.offSkipVinFocusChange = aVar3;
            this.onCheckVehicleAction = qVar;
            this.onRegistrationDateClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.offSkipPlateFocusChange;
        }

        public final er.a<i0> b() {
            return this.offSkipVinFocusChange;
        }

        public final l<uv0.d, i0> c() {
            return this.onCheckPlateAction;
        }

        public final q<uv0.d, v, LocalDate, i0> d() {
            return this.onCheckVehicleAction;
        }

        public final l<v, i0> e() {
            return this.onCheckVinAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onTopBarIconMainClick, params.onTopBarIconMainClick) && t.c(this.onCheckPlateAction, params.onCheckPlateAction) && t.c(this.offSkipPlateFocusChange, params.offSkipPlateFocusChange) && t.c(this.onPlateInputValueChange, params.onPlateInputValueChange) && t.c(this.onCheckVinAction, params.onCheckVinAction) && t.c(this.offSkipVinFocusChange, params.offSkipVinFocusChange) && t.c(this.onCheckVehicleAction, params.onCheckVehicleAction) && t.c(this.onRegistrationDateClick, params.onRegistrationDateClick);
        }

        public final l<uv0.d, i0> f() {
            return this.onPlateInputValueChange;
        }

        public final er.a<i0> g() {
            return this.onRegistrationDateClick;
        }

        public final er.a<i0> h() {
            return this.onTopBarIconMainClick;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onTopBarIconMainClick.hashCode()) * 31) + this.onCheckPlateAction.hashCode()) * 31) + this.offSkipPlateFocusChange.hashCode()) * 31) + this.onPlateInputValueChange.hashCode()) * 31) + this.onCheckVinAction.hashCode()) * 31) + this.offSkipVinFocusChange.hashCode()) * 31) + this.onCheckVehicleAction.hashCode()) * 31) + this.onRegistrationDateClick.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final nj3.e getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTopBarIconMainClick=" + this.onTopBarIconMainClick + ", onCheckPlateAction=" + this.onCheckPlateAction + ", offSkipPlateFocusChange=" + this.offSkipPlateFocusChange + ", onPlateInputValueChange=" + this.onPlateInputValueChange + ", onCheckVinAction=" + this.onCheckVinAction + ", offSkipVinFocusChange=" + this.offSkipVinFocusChange + ", onCheckVehicleAction=" + this.onCheckVehicleAction + ", onRegistrationDateClick=" + this.onRegistrationDateClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f146386a;

        static {
            int[] iArr = new int[m03.a.values().length];
            try {
                iArr[m03.a.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m03.a.INCORRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m03.a.CORRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f146386a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f146387a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1857756927);
            if (p076m2.t.k()) {
                p076m2.t.o(-1857756927, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.form.mapper.VehicleHistoryVerificationFormMapper.invoke.<anonymous> (VehicleHistoryVerificationFormMapper.kt:64)");
            }
            long jA = ((dj3.a) rVar.N(dj3.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public f(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.f().b(uv0.d.b(uv0.d.c(str)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.e().b(v.b(v.d(c0.e(v.d(str)).toUpperCase(Locale.ROOT))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(nj3.e eVar, Params params, boolean z15) {
        if (!z15) {
            nj3.e.Initialized initialized = (nj3.e.Initialized) eVar;
            if (!initialized.getSkipPlateFocusChange()) {
                params.c().b(uv0.d.b(initialized.getPlateNumber()));
            }
        }
        if (((nj3.e.Initialized) eVar).getSkipPlateFocusChange()) {
            params.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(nj3.e eVar, Params params, boolean z15) {
        if (!z15) {
            nj3.e.Initialized initialized = (nj3.e.Initialized) eVar;
            if (!initialized.getSkipVinFocusChange()) {
                params.e().b(v.b(initialized.getVin()));
            }
        }
        if (((nj3.e.Initialized) eVar).getSkipVinFocusChange()) {
            params.b();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, nj3.e eVar) {
        q<uv0.d, v, LocalDate, i0> qVarD = params.d();
        nj3.e.Initialized initialized = (nj3.e.Initialized) eVar;
        String plateNumber = initialized.getPlateNumber();
        Locale locale = Locale.ROOT;
        qVarD.w(uv0.d.b(uv0.d.c(plateNumber.toUpperCase(locale))), v.b(v.d(c0.e(initialized.getVin()).toUpperCase(locale))), initialized.getRegistrationState().getDate());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public nj3.f.b b(final Params params) {
        hz.b invalid;
        hz.b invalid2;
        final nj3.e state = params.getState();
        if (t.c(state, nj3.e.b.f136898a)) {
            return nj3.f.b.a.f136905a;
        }
        if (!(state instanceof nj3.e.Initialized)) {
            throw new oq.p();
        }
        nj3.e.Initialized initialized = (nj3.e.Initialized) state;
        boolean isSkipForm = initialized.getIsSkipForm();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.h()), this.labelProvider.c(yi3.a.f227216c0), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.E3, null, c.f146387a, this.labelProvider.c(yi3.a.f227213b0), this.labelProvider.c(yi3.a.f227242l), null, 34, null);
        Label labelC = this.labelProvider.c(yi3.a.V);
        int iD = v4.t.INSTANCE.d();
        Label labelB = mx.b.b(initialized.getPlateNumber(), "plate");
        int i15 = b.f146386a[initialized.getPlateCorrectness().ordinal()];
        if (i15 == 1) {
            invalid = new hz.b.Invalid(this.labelProvider.c(yi3.a.T));
        } else if (i15 == 2) {
            invalid = new hz.b.Invalid(this.labelProvider.c(yi3.a.U));
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            invalid = hz.b.d.f86848c;
        }
        v50.c.Text text = new v50.c.Text("plateInput", labelC, null, labelB, invalid, null, null, new l() { // from class: oj3.a
            @Override // er.l
            public final Object b(Object obj) {
                return f.m(params, (String) obj);
            }
        }, null, false, iD, null, false, null, false, null, null, null, null, null, 1047396, null);
        Label labelC2 = this.labelProvider.c(yi3.a.f227262r1);
        Label labelC3 = this.labelProvider.c(yi3.a.f227253o1);
        Label labelB2 = mx.b.b(c0.e(initialized.getVin()), "vin");
        if (initialized.getIsVinCorrect()) {
            invalid2 = hz.b.d.f86848c;
        } else {
            invalid2 = fu.r.t0(c0.e(initialized.getVin())) ? new hz.b.Invalid(this.labelProvider.c(yi3.a.f227256p1)) : new hz.b.Invalid(this.labelProvider.c(yi3.a.f227259q1));
        }
        v50.c.Text text2 = new v50.c.Text("vinInput", labelC2, null, labelB2, invalid2, labelC3, null, new l() { // from class: oj3.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048388, null);
        Label labelC4 = this.labelProvider.c(yi3.a.Y);
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        LocalDate date = initialized.getRegistrationState().getDate();
        return new nj3.f.b.Initialized(baseScaffoldData, icon, isSkipForm, new nj3.f.ContentData(text, text2, new l() { // from class: oj3.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(state, params, ((Boolean) obj).booleanValue());
            }
        }, new l() { // from class: oj3.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.s(state, params, ((Boolean) obj).booleanValue());
            }
        }, new InputDateTimeData("registrationDateInput", labelC4, date != null ? this.dateFormatter.d(new fz.b.LocalDate(date), fz.c.DOTTED) : null, c5303a, initialized.getRegistrationState().getIsValid() ? hz.b.d.f86848c : new hz.b.Invalid(this.labelProvider.c(yi3.a.X)), null, null, this.labelProvider.c(yi3.a.W), false, null, params.g(), 864, null)), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(yi3.a.S), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: oj3.e
            @Override // er.a
            public final Object a() {
                return f.u(params, state);
            }
        }, 35, null));
    }
}
