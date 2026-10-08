package wo3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.k;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lwo3/b;", "Lxw/f;", "Lwo3/b$b;", "Lvo3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lwo3/b$b;)Lvo3/c$a;", "a", "Lmx/c;", "b", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, vo3.c.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f214280b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214281c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwo3/b$a;", "", "<init>", "()V", "", "MAX_PIN_LENGTH", "I", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: wo3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lwo3/b$b;", "", "Lvo3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Liy/b0;", "onPinChanged", "onProvidedRequiredLengthPin", "<init>", "(Lvo3/b;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvo3/b;", "d", "()Lvo3/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vo3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPinChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onProvidedRequiredLengthPin;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(vo3.b bVar, er.a<i0> aVar, l<? super b0, i0> lVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBack = aVar;
            this.onPinChanged = lVar;
            this.onProvidedRequiredLengthPin = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<b0, i0> b() {
            return this.onPinChanged;
        }

        public final er.a<i0> c() {
            return this.onProvidedRequiredLengthPin;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final vo3.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onPinChanged, params.onPinChanged) && t.c(this.onProvidedRequiredLengthPin, params.onProvidedRequiredLengthPin);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onPinChanged.hashCode()) * 31) + this.onProvidedRequiredLengthPin.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onPinChanged=" + this.onPinChanged + ", onProvidedRequiredLengthPin=" + this.onProvidedRequiredLengthPin + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f214287a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-320478481);
            if (p076m2.t.k()) {
                p076m2.t.o(-320478481, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.pinauthentication.mapper.PinAuthenticationScreenMapper.invoke.<anonymous> (PinAuthenticationScreenMapper.kt:47)");
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
        public static final d f214288a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-438115250);
            if (p076m2.t.k()) {
                p076m2.t.o(-438115250, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.pinauthentication.mapper.PinAuthenticationScreenMapper.invoke.<anonymous> (PinAuthenticationScreenMapper.kt:48)");
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
    public vo3.c.a b(final Params params) {
        hz.b invalid;
        vo3.b state = params.getState();
        if (state instanceof vo3.b.a) {
            return vo3.c.a.C5457a.f207723a;
        }
        if (!(state instanceof vo3.b.InterfaceC5455b.Displaying) && !(state instanceof vo3.b.InterfaceC5455b.ValidatePin)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(un3.b.S), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106790i, c.f214287a, d.f214288a, this.labelProvider.c(un3.b.Q), this.labelProvider.c(un3.b.R), null, 32, null);
        Label labelB = mx.b.b(c0.e(((vo3.b.InterfaceC5455b) params.getState()).getPinValue()), "pinTag");
        vo3.b.InterfaceC5455b interfaceC5455b = (vo3.b.InterfaceC5455b) state;
        if (interfaceC5455b instanceof vo3.b.InterfaceC5455b.Displaying) {
            invalid = ((vo3.b.InterfaceC5455b.Displaying) state).getIsError() ? new hz.b.Invalid(this.labelProvider.c(un3.b.f199421g)) : hz.b.C2039b.f86846c;
        } else {
            if (!(interfaceC5455b instanceof vo3.b.InterfaceC5455b.ValidatePin)) {
                throw new oq.p();
            }
            invalid = hz.b.C2039b.f86846c;
        }
        return new vo3.c.a.Initialized(baseScaffoldData, icon, params.a(), new v50.c.Pin(null, null, labelB, invalid, null, null, new l() { // from class: wo3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 4, params.c(), 65459, null), true);
    }
}
