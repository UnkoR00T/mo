package r53;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import k30.d;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr53/c;", "Lxw/f;", "Lr53/c$a;", "Lq53/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lq53/c$a$a;", "i", "(Lr53/c$a;)Lq53/c$a$a;", "Lmx/a;", "f", "()Lmx/a;", "h", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, q53.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r53.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0018\u0010!¨\u0006\""}, d2 = {"Lr53/c$a;", "", "Lq53/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "showProcessTerminateDialog", "Lkotlin/Function1;", "Liy/b0;", "validPassword", "Ls53/b;", "checkPassword", "<init>", "(Lq53/b;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq53/b;", "c", "()Lq53/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "d", "()Ler/l;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q53.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showProcessTerminateDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> validPassword;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<s53.b, i0> checkPassword;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q53.b bVar, er.a<i0> aVar, l<? super b0, i0> lVar, l<? super s53.b, i0> lVar2) {
            this.state = bVar;
            this.showProcessTerminateDialog = aVar;
            this.validPassword = lVar;
            this.checkPassword = lVar2;
        }

        public final l<s53.b, i0> a() {
            return this.checkPassword;
        }

        public final er.a<i0> b() {
            return this.showProcessTerminateDialog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final q53.b getState() {
            return this.state;
        }

        public final l<b0, i0> d() {
            return this.validPassword;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.showProcessTerminateDialog, params.showProcessTerminateDialog) && t.c(this.validPassword, params.validPassword) && t.c(this.checkPassword, params.checkPassword);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.showProcessTerminateDialog.hashCode()) * 31) + this.validPassword.hashCode()) * 31) + this.checkPassword.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showProcessTerminateDialog=" + this.showProcessTerminateDialog + ", validPassword=" + this.validPassword + ", checkPassword=" + this.checkPassword + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f171930a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1540393499);
            if (p076m2.t.k()) {
                p076m2.t.o(-1540393499, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.confirmpassword.mapper.ConfirmPasswordMapper.invoke.<anonymous> (ConfirmPasswordMapper.kt:66)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    /* JADX INFO: renamed from: r53.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4375c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4375c f171931a = new C4375c();

        C4375c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1150569924);
            if (p076m2.t.k()) {
                p076m2.t.o(1150569924, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.confirmpassword.mapper.ConfirmPasswordMapper.invoke.<anonymous> (ConfirmPasswordMapper.kt:67)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, q53.b bVar) {
        params.a().b(((q53.b.Initialized) bVar).getScreenType());
        return i0.f148189a;
    }

    public final Label f() {
        return this.labelProvider.c(c53.a.D);
    }

    public final Label h() {
        return this.labelProvider.c(c53.a.I);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q53.c.a.Initialized b(final Params params) {
        int i15;
        int i16;
        final q53.b state = params.getState();
        if (!(state instanceof q53.b.Initialized)) {
            throw new oq.p();
        }
        mx.c cVar = this.labelProvider;
        q53.b.Initialized initialized = (q53.b.Initialized) state;
        s53.b screenType = initialized.getScreenType();
        s53.b.a aVar = s53.b.a.f178174a;
        if (t.c(screenType, aVar)) {
            i15 = c53.a.f23730t0;
        } else {
            if (!t.c(screenType, s53.b.C4559b.f178175a)) {
                throw new oq.p();
            }
            i15 = c53.a.M0;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), cVar.c(i15), null, null, null, 28, null), null, null, null, null, 61, null);
        int i17 = jz.a.f106767f;
        Label labelC = this.labelProvider.c(c53.a.J0);
        mx.c cVar2 = this.labelProvider;
        s53.b screenType2 = initialized.getScreenType();
        if (t.c(screenType2, aVar)) {
            i16 = c53.a.f23733u0;
        } else {
            if (!t.c(screenType2, s53.b.C4559b.f178175a)) {
                throw new oq.p();
            }
            i16 = c53.a.I0;
        }
        return new q53.c.a.Initialized(baseScaffoldData, new o40.a.Icon(i17, b.f171930a, C4375c.f171931a, labelC, cVar2.c(i16), null, 32, null), new v50.c.Password(null, this.labelProvider.c(c53.a.E), null, mx.b.b(c0.e(initialized.getPassword()), "password"), initialized.getValidationState(), null, null, new l() { // from class: r53.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.l(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 0, null, null, null, null, 1048421, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.F), null, 2, null), d.a.f107773a, null, new er.a() { // from class: r53.b
            @Override // er.a
            public final Object a() {
                return c.m(params, state);
            }
        }, 35, null), params.b());
    }
}
