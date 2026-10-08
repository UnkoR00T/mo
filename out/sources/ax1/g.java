package ax1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
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
import zw1.State;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lax1/g;", "Lxw/f;", "Lax1/g$a;", "Lzw1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lyw1/a;", "certificateType", "Lmx/a;", "m", "(Lyw1/a;)Lmx/a;", "params", "q", "(Lax1/g$a;)Lzw1/c$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, zw1.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ax1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b$\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\u001c\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b \u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b)\u0010(¨\u0006+"}, d2 = {"Lax1/g$a;", "", "Lzw1/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onPinValueChanged", "onRepeatedNewPinValueChanged", "Lkotlin/Function0;", "onNewPinInputFocusChanged", "onRepeatedNewPinInputFocusChanged", "onInterruptProcess", "onBack", "onClose", "onNext", "<init>", "(Lzw1/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzw1/b;", "i", "()Lzw1/b;", "b", "Ler/l;", "f", "()Ler/l;", "c", "h", "d", "Ler/a;", "()Ler/a;", "e", "g", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f14882j;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPinValueChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onRepeatedNewPinValueChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNewPinInputFocusChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRepeatedNewPinInputFocusChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInterruptProcess;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f14882j = i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = state;
            this.onPinValueChanged = lVar;
            this.onRepeatedNewPinValueChanged = lVar2;
            this.onNewPinInputFocusChanged = aVar;
            this.onRepeatedNewPinInputFocusChanged = aVar2;
            this.onInterruptProcess = aVar3;
            this.onBack = aVar4;
            this.onClose = aVar5;
            this.onNext = aVar6;
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
            return this.onNewPinInputFocusChanged;
        }

        public final er.a<i0> e() {
            return this.onNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPinValueChanged, params.onPinValueChanged) && t.c(this.onRepeatedNewPinValueChanged, params.onRepeatedNewPinValueChanged) && t.c(this.onNewPinInputFocusChanged, params.onNewPinInputFocusChanged) && t.c(this.onRepeatedNewPinInputFocusChanged, params.onRepeatedNewPinInputFocusChanged) && t.c(this.onInterruptProcess, params.onInterruptProcess) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        public final l<b0, i0> f() {
            return this.onPinValueChanged;
        }

        public final er.a<i0> g() {
            return this.onRepeatedNewPinInputFocusChanged;
        }

        public final l<b0, i0> h() {
            return this.onRepeatedNewPinValueChanged;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onPinValueChanged.hashCode()) * 31) + this.onRepeatedNewPinValueChanged.hashCode()) * 31) + this.onNewPinInputFocusChanged.hashCode()) * 31) + this.onRepeatedNewPinInputFocusChanged.hashCode()) * 31) + this.onInterruptProcess.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPinValueChanged=" + this.onPinValueChanged + ", onRepeatedNewPinValueChanged=" + this.onRepeatedNewPinValueChanged + ", onNewPinInputFocusChanged=" + this.onNewPinInputFocusChanged + ", onRepeatedNewPinInputFocusChanged=" + this.onRepeatedNewPinInputFocusChanged + ", onInterruptProcess=" + this.onInterruptProcess + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14892a;

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
            f14892a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14893a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1664387983);
            if (p076m2.t.k()) {
                p076m2.t.o(1664387983, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.newpin.mapper.EdoNewPinMapper.invoke.<anonymous> (EdoNewPinMapper.kt:53)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jI;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label m(yw1.a certificateType) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f14892a[certificateType.ordinal()];
        if (i16 == 1) {
            i15 = j0.J2;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j0.L2;
        }
        return cVar.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, String str) {
        params.f().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 s(final o oVar) {
        return new l3(null, null, new l() { // from class: ax1.a
            @Override // er.l
            public final Object b(Object obj) {
                return g.u(oVar, (k3) obj);
            }
        }, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(o oVar, k3 k3Var) {
        oVar.h(l3.g.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, String str) {
        params.h().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 x(final Params params, final o oVar) {
        return new l3(new l() { // from class: ax1.b
            @Override // er.l
            public final Object b(Object obj) {
                return g.z(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.e().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public zw1.c.Data b(final Params params) {
        er.a<i0> aVarB;
        Label topBarTitle = params.getState().getNewPinScreenData().getTopBarTitle();
        NavigationButtonData navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a());
        x50.a.MenuButtonData.b bVar = x50.a.MenuButtonData.b.f216847c;
        c cVar = c.f14893a;
        boolean zM = params.getState().getNewPinScreenData().getProcessInterruptDialogTitle().m();
        if (zM) {
            aVarB = params.c();
        } else {
            if (zM) {
                throw new oq.p();
            }
            aVarB = params.b();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(navigationButtonData, topBarTitle, null, new x50.a.Icon(new x50.a.MenuButtonData(bVar, cVar, null, aVarB, 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(j0.P2);
        Label labelM = m(params.getState().getNewPinScreenData().getCertificateType());
        er.a<i0> aVarA = params.a();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120765o), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null);
        Label labelC2 = this.labelProvider.c(j0.N2);
        Label labelB = mx.b.b(c0.e(params.getState().getNewPin()), "newPin");
        v4.t.Companion companion = v4.t.INSTANCE;
        int iD = companion.d();
        hz.b newPinValidationState = params.getState().getNewPinValidationState();
        v50.c.Password.IconContentDescription iconContentDescription = new v50.c.Password.IconContentDescription(this.labelProvider.c(j0.f120695a), this.labelProvider.c(j0.f120705c));
        a0.Companion companion2 = a0.INSTANCE;
        v50.c.Password password = new v50.c.Password(null, labelC2, null, labelB, newPinValidationState, null, null, new l() { // from class: ax1.c
            @Override // er.l
            public final Object b(Object obj) {
                return g.r(params, (String) obj);
            }
        }, null, false, iD, new l() { // from class: ax1.d
            @Override // er.l
            public final Object b(Object obj) {
                return g.s((o) obj);
            }
        }, false, null, false, companion2.e(), null, null, iconContentDescription, null, 750437, null);
        Label labelC3 = this.labelProvider.c(j0.O2);
        Label labelB2 = mx.b.b(c0.e(params.getState().getRepeatedNewPin()), "repeatedNewPin");
        int iB = companion.b();
        hz.b repeatedNewPinValidationState = params.getState().getRepeatedNewPinValidationState();
        v50.c.Password.IconContentDescription iconContentDescription2 = new v50.c.Password.IconContentDescription(this.labelProvider.c(j0.f120695a), this.labelProvider.c(j0.f120705c));
        return new zw1.c.Data(baseScaffoldData, labelC, labelM, aVarA, buttonData, password, new v50.c.Password(null, labelC3, null, labelB2, repeatedNewPinValidationState, null, null, new l() { // from class: ax1.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.v(params, (String) obj);
            }
        }, null, false, iB, new l() { // from class: ax1.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.x(params, (o) obj);
            }
        }, false, null, false, companion2.e(), null, null, iconContentDescription2, null, 750437, null), params.d(), params.g());
    }
}
