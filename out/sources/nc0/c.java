package nc0;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import e60.FooterData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import k30.d;
import mc0.j;
import mc0.k;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lnc0/c;", "Lxw/f;", "Lnc0/c$a;", "Lmc0/k$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Li50/a;", "m", "()Li50/a;", "", "appVersion", "Le60/a;", "h", "(Ljava/lang/String;)Le60/a;", "params", "i", "(Lnc0/c$a;)Lmc0/k$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lcb4/d;", "f", "(Ldx/b;Ler/a;)Lcb4/d;", "a", "Lmx/c;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: nc0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001a\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u001e\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lnc0/c$a;", "", "Lmc0/j;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onPinChanged", "Lkotlin/Function0;", "onForgotPasswordAction", "onBackAction", "onBiometricSectionClick", "onToBiometricLogin", "onToPinLogin", "<init>", "(Lmc0/j;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmc0/j;", "g", "()Lmc0/j;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "e", "f", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPinChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onForgotPasswordAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBiometricSectionClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onToBiometricLogin;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onToPinLogin;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, l<? super b0, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = jVar;
            this.onPinChanged = lVar;
            this.onForgotPasswordAction = aVar;
            this.onBackAction = aVar2;
            this.onBiometricSectionClick = aVar3;
            this.onToBiometricLogin = aVar4;
            this.onToPinLogin = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onBiometricSectionClick;
        }

        public final er.a<i0> c() {
            return this.onForgotPasswordAction;
        }

        public final l<b0, i0> d() {
            return this.onPinChanged;
        }

        public final er.a<i0> e() {
            return this.onToBiometricLogin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPinChanged, params.onPinChanged) && t.c(this.onForgotPasswordAction, params.onForgotPasswordAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onBiometricSectionClick, params.onBiometricSectionClick) && t.c(this.onToBiometricLogin, params.onToBiometricLogin) && t.c(this.onToPinLogin, params.onToPinLogin);
        }

        public final er.a<i0> f() {
            return this.onToPinLogin;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onPinChanged.hashCode()) * 31) + this.onForgotPasswordAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onBiometricSectionClick.hashCode()) * 31) + this.onToBiometricLogin.hashCode()) * 31) + this.onToPinLogin.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPinChanged=" + this.onPinChanged + ", onForgotPasswordAction=" + this.onForgotPasswordAction + ", onBackAction=" + this.onBackAction + ", onBiometricSectionClick=" + this.onBiometricSectionClick + ", onToBiometricLogin=" + this.onToBiometricLogin + ", onToPinLogin=" + this.onToPinLogin + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f133923a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1315098266);
            if (p076m2.t.k()) {
                p076m2.t.o(1315098266, i15, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.login.mapper.LoginMapper.invoke.<anonymous> (LoginMapper.kt:88)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final FooterData h(String appVersion) {
        return new FooterData(this.labelProvider.e(jc0.a.f101400g, appVersion), this.labelProvider.c(jc0.a.f101394a), this.labelProvider.c(jc0.a.f101397d), this.labelProvider.c(jc0.a.f101396c), this.labelProvider.c(jc0.a.f101398e), this.labelProvider.c(jc0.a.f101395b), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    private final BaseScaffoldData m() {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: nc0.b
            @Override // er.a
            public final Object a() {
                return c.q();
            }
        }), null, null, null, null, 30, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    public final DialogData f(dx.b domainError, er.a<i0> onClose) {
        oq.r rVar;
        if (domainError instanceof dx.b.InterfaceC1027b.a.c) {
            rVar = new oq.r(this.labelProvider.c(jc0.a.A), this.labelProvider.c(jc0.a.f101419z));
        } else if (domainError instanceof dx.b.j.c) {
            rVar = new oq.r(this.labelProvider.c(jc0.a.D), this.labelProvider.c(jc0.a.C));
        } else {
            rVar = t.c(domainError, dx.c.f45092a) ? new oq.r(this.labelProvider.c(jc0.a.f101418y), this.labelProvider.c(jc0.a.B)) : new oq.r(this.labelProvider.c(jc0.a.f101418y), this.labelProvider.c(jc0.a.f101417x));
        }
        return new DialogData(h.b.f24985a, (Label) rVar.a(), (Label) rVar.b(), new DialogButtonTextData(this.labelProvider.c(jc0.a.f101402i), null, onClose, 2, null), null, null, null, 112, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k.a b(final Params params) {
        ButtonData buttonData;
        j state = params.getState();
        if (t.c(state, j.a.f125399a)) {
            return k.a.b.f125417a;
        }
        if (!(state instanceof j.b)) {
            throw new oq.p();
        }
        j.b bVar = (j.b) state;
        if (!(bVar instanceof j.b.Password)) {
            if (!(bVar instanceof j.b.Biometric) && !(bVar instanceof j.b.BiometricAuthenticationInProgress)) {
                throw new oq.p();
            }
            return new k.a.Biometric(m(), this.labelProvider.c(jc0.a.f101410q), this.labelProvider.c(jc0.a.f101405l), new d40.b.C0864b(null, jz.a.f106775g, d40.i.l.f39715e, b.f133923a, null, null, 33, null), this.labelProvider.c(jc0.a.f101406m), params.b(), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(jc0.a.f101407n), null, 2, null), new d.Secondary(null, 1, null), null, params.f(), 35, null), h(bVar.getAppVersion()));
        }
        BaseScaffoldData baseScaffoldDataM = m();
        Label labelE = this.labelProvider.e(jc0.a.f101410q, "");
        Label labelC = this.labelProvider.c(jc0.a.f101409p);
        j.b.Password password = (j.b.Password) state;
        v50.c.Pin pin = new v50.c.Pin(null, null, mx.b.b(c0.e(password.getPinValue()), "loginPinTag"), password.getValidationState(), null, null, new l() { // from class: nc0.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.l(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 6, null, 196531, null);
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(jc0.a.f101408o), null, null, params.c(), 13, null);
        er.a<i0> aVarA = params.a();
        FooterData footerDataH = h(password.getAppVersion());
        if (password.getIsBiometricEnabled()) {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(jc0.a.f101404k), null, 2, null), new d.Secondary(null, 1, null), null, params.e(), 35, null);
        } else {
            buttonData = null;
        }
        return new k.a.Password(baseScaffoldDataM, labelE, labelC, pin, buttonTextData, true, aVarA, footerDataH, buttonData, password.getDialogVMSAdapter());
    }
}
