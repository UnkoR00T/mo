package h53;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import g53.State;
import i50.BaseScaffoldData;
import iy.a0;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p53.RepeatNewPinScreenData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lh53/b;", "Lxw/f;", "Lh53/b$a;", "Lp53/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lh53/b$a;)Lp53/d;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, RepeatNewPinScreenData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h53.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lh53/b$a;", "", "Lg53/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onShowTerminationDialog", "Lkotlin/Function1;", "Liy/b0;", "onPinChanged", "<init>", "(Lg53/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg53/b;", "c", "()Lg53/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f81179d = (hz.b.f86845b | b0.f97726c) | a0.f97720c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowTerminationDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPinChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super b0, i0> lVar) {
            this.state = state;
            this.onShowTerminationDialog = aVar;
            this.onPinChanged = lVar;
        }

        public final l<b0, i0> a() {
            return this.onPinChanged;
        }

        public final er.a<i0> b() {
            return this.onShowTerminationDialog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onShowTerminationDialog, params.onShowTerminationDialog) && t.c(this.onPinChanged, params.onPinChanged);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onShowTerminationDialog.hashCode()) * 31) + this.onPinChanged.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onShowTerminationDialog=" + this.onShowTerminationDialog + ", onPinChanged=" + this.onPinChanged + ')';
        }
    }

    /* JADX INFO: renamed from: h53.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1870b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1870b f81183a = new C1870b();

        C1870b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(119681277);
            if (p076m2.t.k()) {
                p076m2.t.o(119681277, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometricauthorization.mapper.BiometricAuthorizationMapper.invoke.<anonymous> (BiometricAuthorizationMapper.kt:42)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f81184a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-51158180);
            if (p076m2.t.k()) {
                p076m2.t.o(-51158180, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometricauthorization.mapper.BiometricAuthorizationMapper.invoke.<anonymous> (BiometricAuthorizationMapper.kt:43)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, String str) {
        params.a().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public RepeatNewPinScreenData b(final Params params) {
        return new RepeatNewPinScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(c53.a.J), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106790i, C1870b.f81183a, c.f81184a, this.labelProvider.c(c53.a.f23737w), null, null, 32, null), new v50.c.Pin(null, null, mx.b.b(c0.e(params.getState().getPinValue()), "pinTag"), params.getState().getValidationState(), null, null, new l() { // from class: h53.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, 262067, null), params.getState().getShouldFocusWithKeyboard(), params.b());
    }
}
