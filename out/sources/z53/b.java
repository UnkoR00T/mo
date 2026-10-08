package z53;

import a63.RepeatSetNewPinScreenData;
import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.k;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y53.State;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lz53/b;", "Lxw/f;", "Lz53/b$b;", "La63/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lz53/b$b;)La63/d;", "a", "Lmx/c;", "b", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, RepeatSetNewPinScreenData> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f233063b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f233064c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz53/b$a;", "", "<init>", "()V", "", "MAX_PIN_LENGTH", "I", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: z53.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Lz53/b$b;", "", "Ly53/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "showProcessTerminationDialog", "onBackAction", "onProvidedRequiredLengthPin", "Lkotlin/Function1;", "Liy/b0;", "onChangePinValue", "<init>", "(Ly53/b;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly53/b;", "e", "()Ly53/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f233066f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showProcessTerminationDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onProvidedRequiredLengthPin;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onChangePinValue;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f233066f = i15 | i16 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super b0, i0> lVar) {
            this.state = state;
            this.showProcessTerminationDialog = aVar;
            this.onBackAction = aVar2;
            this.onProvidedRequiredLengthPin = aVar3;
            this.onChangePinValue = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<b0, i0> b() {
            return this.onChangePinValue;
        }

        public final er.a<i0> c() {
            return this.onProvidedRequiredLengthPin;
        }

        public final er.a<i0> d() {
            return this.showProcessTerminationDialog;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.showProcessTerminationDialog, params.showProcessTerminationDialog) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onProvidedRequiredLengthPin, params.onProvidedRequiredLengthPin) && t.c(this.onChangePinValue, params.onChangePinValue);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.showProcessTerminationDialog.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onProvidedRequiredLengthPin.hashCode()) * 31) + this.onChangePinValue.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showProcessTerminationDialog=" + this.showProcessTerminationDialog + ", onBackAction=" + this.onBackAction + ", onProvidedRequiredLengthPin=" + this.onProvidedRequiredLengthPin + ", onChangePinValue=" + this.onChangePinValue + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f233072a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1775613484);
            if (p076m2.t.k()) {
                p076m2.t.o(-1775613484, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.turnon.repeatsetnewpin.mapper.RepeatSetNewPinMapper.invoke.<anonymous> (RepeatSetNewPinMapper.kt:52)");
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
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f233073a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1606361899);
            if (p076m2.t.k()) {
                p076m2.t.o(-1606361899, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.turnon.repeatsetnewpin.mapper.RepeatSetNewPinMapper.invoke.<anonymous> (RepeatSetNewPinMapper.kt:53)");
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
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public RepeatSetNewPinScreenData b(final Params params) {
        return new RepeatSetNewPinScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c53.a.M0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106790i, c.f233072a, d.f233073a, this.labelProvider.c(c53.a.L0), this.labelProvider.c(c53.a.K0), null, 32, null), new v50.c.Pin(null, null, mx.b.b(c0.e(params.getState().getPinValue()), "pinTag"), params.getState().getValidationState(), null, null, new l() { // from class: z53.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 4, params.c(), 65459, null), false, params.d(), 8, null);
    }
}
