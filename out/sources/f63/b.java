package f63;

import androidx.compose.ui.graphics.Color;
import e63.State;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import x60.BasicPinInputScreenData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lf63/b;", "Lxw/f;", "Lf63/b$b;", "Lx60/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lf63/b$b;)Lx60/c;", "a", "Lmx/c;", "b", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, BasicPinInputScreenData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f59551c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f63.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006!"}, d2 = {"Lf63/b$b;", "", "Le63/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "showProcessTerminationDialog", "Lkotlin/Function1;", "Liy/b0;", "onChangePinValue", "onProvidedRequiredLengthPin", "<init>", "(Le63/b;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le63/b;", "d", "()Le63/b;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "()Ler/l;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f59553e = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showProcessTerminationDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onChangePinValue;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onProvidedRequiredLengthPin;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super b0, i0> lVar, er.a<i0> aVar2) {
            this.state = state;
            this.showProcessTerminationDialog = aVar;
            this.onChangePinValue = lVar;
            this.onProvidedRequiredLengthPin = aVar2;
        }

        public final l<b0, i0> a() {
            return this.onChangePinValue;
        }

        public final er.a<i0> b() {
            return this.onProvidedRequiredLengthPin;
        }

        public final er.a<i0> c() {
            return this.showProcessTerminationDialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.showProcessTerminationDialog, params.showProcessTerminationDialog) && t.c(this.onChangePinValue, params.onChangePinValue) && t.c(this.onProvidedRequiredLengthPin, params.onProvidedRequiredLengthPin);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.showProcessTerminationDialog.hashCode()) * 31) + this.onChangePinValue.hashCode()) * 31) + this.onProvidedRequiredLengthPin.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showProcessTerminationDialog=" + this.showProcessTerminationDialog + ", onChangePinValue=" + this.onChangePinValue + ", onProvidedRequiredLengthPin=" + this.onProvidedRequiredLengthPin + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f59558a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1203760480);
            if (p076m2.t.k()) {
                p076m2.t.o(-1203760480, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.turnon.setnewpin.mapper.SetNewPinMapper.invoke.<anonymous> (SetNewPinMapper.kt:44)");
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
        public static final d f59559a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1080856543);
            if (p076m2.t.k()) {
                p076m2.t.o(-1080856543, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.turnon.setnewpin.mapper.SetNewPinMapper.invoke.<anonymous> (SetNewPinMapper.kt:45)");
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
    public BasicPinInputScreenData b(final Params params) {
        return new BasicPinInputScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(c53.a.M0), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106790i, c.f59558a, d.f59559a, this.labelProvider.c(c53.a.O0), this.labelProvider.c(c53.a.N0), null, 32, null), new v50.c.Pin(null, null, mx.b.b(c0.e(params.getState().getPinValue()), "pinTag"), params.getState().getValidationState(), null, null, new l() { // from class: f63.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 4, params.b(), 65459, null), true, params.c());
    }
}
