package ex1;

import androidx.compose.ui.graphics.Color;
import dx1.State;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import l3.o;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p079n1.k3;
import p079n1.l3;
import v4.a0;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lex1/d;", "Lxw/f;", "Lex1/d$a;", "Ldx1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lyw1/a;", "certificateType", "Lmx/a;", "l", "(Lyw1/a;)Lmx/a;", "h", "i", "params", "m", "(Lex1/d$a;)Ldx1/c$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, dx1.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ex1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001a\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001e\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lex1/d$a;", "", "Ldx1/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onPinValueChanged", "Lkotlin/Function0;", "onInterruptProcess", "onResetPin", "onBack", "onClose", "onNext", "<init>", "(Ldx1/b;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx1/b;", "g", "()Ldx1/b;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "f", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f54020h = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPinValueChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInterruptProcess;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResetPin;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onPinValueChanged = lVar;
            this.onInterruptProcess = aVar;
            this.onResetPin = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
            this.onNext = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onInterruptProcess;
        }

        public final er.a<i0> d() {
            return this.onNext;
        }

        public final l<b0, i0> e() {
            return this.onPinValueChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPinValueChanged, params.onPinValueChanged) && t.c(this.onInterruptProcess, params.onInterruptProcess) && t.c(this.onResetPin, params.onResetPin) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        public final er.a<i0> f() {
            return this.onResetPin;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onPinValueChanged.hashCode()) * 31) + this.onInterruptProcess.hashCode()) * 31) + this.onResetPin.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPinValueChanged=" + this.onPinValueChanged + ", onInterruptProcess=" + this.onInterruptProcess + ", onResetPin=" + this.onResetPin + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54028a;

        static {
            int[] iArr = new int[yw1.a.values().length];
            try {
                iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54028a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f54029a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1930785402);
            if (p076m2.t.k()) {
                p076m2.t.o(-1930785402, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.pin.mapper.EdoPinMapper.invoke.<anonymous> (EdoPinMapper.kt:51)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jI;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label h(yw1.a certificateType) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f54028a[certificateType.ordinal()];
        if (i16 == 1) {
            i15 = j0.R2;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j0.V2;
        }
        return cVar.c(i15);
    }

    private final Label i(yw1.a certificateType) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f54028a[certificateType.ordinal()];
        if (i16 == 1) {
            i15 = j0.S2;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j0.X2;
        }
        return cVar.c(i15);
    }

    private final Label l(yw1.a certificateType) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f54028a[certificateType.ordinal()];
        if (i16 == 1) {
            i15 = j0.T2;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j0.Y2;
        }
        return cVar.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 r(final Params params, final o oVar) {
        return new l3(new l() { // from class: ex1.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.s(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.d().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public dx1.c.Data b(final Params params) {
        er.a<i0> aVarB;
        er.a<i0> aVarB2;
        Label topBarTitle = params.getState().getPinScreenData().getTopBarTitle();
        NavigationButtonData navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a());
        x50.a.MenuButtonData.b bVar = x50.a.MenuButtonData.b.f216847c;
        c cVar = c.f54029a;
        boolean zM = params.getState().getPinScreenData().getProcessInterruptDialogTitle().m();
        if (zM) {
            aVarB = params.c();
        } else {
            if (zM) {
                throw new oq.p();
            }
            aVarB = params.b();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(navigationButtonData, topBarTitle, null, !params.getState().getPinScreenData().getFirstScreenInFlow() ? new x50.a.Icon(new x50.a.MenuButtonData(bVar, cVar, null, aVarB, 4, null)) : null, null, 20, null), null, null, null, null, 61, null);
        Label labelL = l(params.getState().getPinScreenData().getCertificateType());
        Label labelH = h(params.getState().getPinScreenData().getCertificateType());
        er.a<i0> aVarA = params.a();
        boolean zM2 = params.getState().getPinScreenData().getProcessInterruptDialogTitle().m();
        if (zM2) {
            aVarB2 = params.c();
        } else {
            if (zM2) {
                throw new oq.p();
            }
            aVarB2 = params.b();
        }
        er.a<i0> aVar = aVarB2;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120765o), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null);
        Label labelI = i(params.getState().getPinScreenData().getCertificateType());
        Label labelB = mx.b.b(c0.e(params.getState().getPin()), "pin");
        ButtonTextData buttonTextData = params.getState().getPinScreenData().getResetPinAvailable() ? new ButtonTextData(null, this.labelProvider.c(j0.W2), null, null, params.f(), 13, null) : null;
        int iB = v4.t.INSTANCE.b();
        return new dx1.c.Data(baseScaffoldData, labelL, labelH, aVarA, aVar, buttonData, new v50.c.Password(null, labelI, null, labelB, params.getState().getValidationState(), null, buttonTextData, new l() { // from class: ex1.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.q(params, (String) obj);
            }
        }, null, false, iB, new l() { // from class: ex1.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.r(params, (o) obj);
            }
        }, false, null, false, a0.INSTANCE.e(), null, null, new v50.c.Password.IconContentDescription(this.labelProvider.c(j0.f120695a), this.labelProvider.c(j0.f120705c)), null, 750373, null));
    }
}
