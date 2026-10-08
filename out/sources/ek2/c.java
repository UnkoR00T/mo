package ek2;

import ac4.p;
import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import d40.i;
import dk2.d;
import e60.FooterData;
import er.l;
import fr.t;
import h30.ButtonData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import l20.GreetingsHeaderData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lek2/c;", "Lxw/f;", "Lek2/c$a;", "Ldk2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ldk2/c$b;", "params", "Ldk2/d$a$c;", "s", "(Ldk2/c$b;Lek2/c$a;)Ldk2/d$a$c;", "Lac4/p;", "Lmx/a;", "q", "(Lac4/p;)Lmx/a;", "r", "(Lek2/c$a;)Ldk2/d$a;", "Ldx/b;", "domainError", "Lcb4/d;", "f", "(Ldx/b;)Lcb4/d;", "l", "()Lmx/a;", "m", "i", "a", "Lmx/c;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ek2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b\u001f\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b'\u0010\"R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Lek2/c$a;", "", "Ldk2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "toLoginPassword", "Lkotlin/Function1;", "Liy/b0;", "onPasswordTyped", "onForgottenPasswordAction", "onCheckPasswordAction", "onBackAction", "showBiometricDialog", "toLoginBiometric", "<init>", "(Ldk2/c;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldk2/c;", "f", "()Ldk2/c;", "b", "Ler/a;", "h", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "e", "g", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dk2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toLoginPassword;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPasswordTyped;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onForgottenPasswordAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckPasswordAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showBiometricDialog;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toLoginBiometric;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dk2.c cVar, er.a<i0> aVar, l<? super b0, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = cVar;
            this.toLoginPassword = aVar;
            this.onPasswordTyped = lVar;
            this.onForgottenPasswordAction = aVar2;
            this.onCheckPasswordAction = aVar3;
            this.onBackAction = aVar4;
            this.showBiometricDialog = aVar5;
            this.toLoginBiometric = aVar6;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCheckPasswordAction;
        }

        public final er.a<i0> c() {
            return this.onForgottenPasswordAction;
        }

        public final l<b0, i0> d() {
            return this.onPasswordTyped;
        }

        public final er.a<i0> e() {
            return this.showBiometricDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.toLoginPassword, params.toLoginPassword) && t.c(this.onPasswordTyped, params.onPasswordTyped) && t.c(this.onForgottenPasswordAction, params.onForgottenPasswordAction) && t.c(this.onCheckPasswordAction, params.onCheckPasswordAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.showBiometricDialog, params.showBiometricDialog) && t.c(this.toLoginBiometric, params.toLoginBiometric);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final dk2.c getState() {
            return this.state;
        }

        public final er.a<i0> g() {
            return this.toLoginBiometric;
        }

        public final er.a<i0> h() {
            return this.toLoginPassword;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.toLoginPassword.hashCode()) * 31) + this.onPasswordTyped.hashCode()) * 31) + this.onForgottenPasswordAction.hashCode()) * 31) + this.onCheckPasswordAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.showBiometricDialog.hashCode()) * 31) + this.toLoginBiometric.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", toLoginPassword=" + this.toLoginPassword + ", onPasswordTyped=" + this.onPasswordTyped + ", onForgottenPasswordAction=" + this.onForgottenPasswordAction + ", onCheckPasswordAction=" + this.onCheckPasswordAction + ", onBackAction=" + this.onBackAction + ", showBiometricDialog=" + this.showBiometricDialog + ", toLoginBiometric=" + this.toLoginBiometric + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51813a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.MORNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AFTERNOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.EVENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51813a = iArr;
        }
    }

    /* JADX INFO: renamed from: ek2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1222c implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1222c f51814a = new C1222c();

        C1222c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-827502737);
            if (p076m2.t.k()) {
                p076m2.t.o(-827502737, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.mapper.LoginMapper.toLoginContent.<anonymous> (LoginMapper.kt:121)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    private final Label q(p pVar) {
        int i15 = b.f51813a[pVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(sj2.b.f182033n);
        }
        if (i15 == 2) {
            return this.labelProvider.c(sj2.b.f182030k);
        }
        if (i15 == 3) {
            return this.labelProvider.c(sj2.b.f182032m);
        }
        throw new oq.p();
    }

    private final d.a.c s(dk2.c.b bVar, final Params params) {
        if (!(bVar instanceof dk2.c.b.Password)) {
            if ((bVar instanceof dk2.c.b.Biometric) || (bVar instanceof dk2.c.b.BiometricAuthenticationInProgress)) {
                return new d.a.c.Biometric(new d40.b.C0864b(null, c20.b.f22705p, i.l.f39715e, C1222c.f51814a, Label.INSTANCE.c(), null, 33, null), this.labelProvider.c(sj2.b.f182035p), params.e(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(sj2.b.f182043x), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.h(), 35, null), new GreetingsHeaderData(q(bVar.getPartOfTheDay()), this.labelProvider.c(sj2.b.f182031l)), new FooterData(this.labelProvider.e(sj2.b.f182026g, bVar.getAppVersion()), this.labelProvider.c(sj2.b.f182020a), this.labelProvider.c(sj2.b.f182023d), this.labelProvider.c(sj2.b.f182022c), this.labelProvider.c(sj2.b.f182024e), this.labelProvider.c(sj2.b.f182021b), true));
            }
            throw new oq.p();
        }
        dk2.c.b.Password password = (dk2.c.b.Password) bVar;
        v50.c.Password password2 = new v50.c.Password("loginInput", this.labelProvider.c(sj2.b.C), null, mx.b.b(c0.e(password.getPassword()), "passwordValue"), password.getPasswordState(), null, null, new l() { // from class: ek2.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.u(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 0, null, null, null, null, 1048420, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(sj2.b.f182034o), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
        return new d.a.c.Password(password2, password.getPassword(), password.getIsImeVisible(), buttonData, (!password.getIsBiometricEnabled() || password.getIsImeVisible()) ? null : new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(sj2.b.f182044y), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.g(), 35, null), new ButtonTextData(null, this.labelProvider.c(sj2.b.f182045z), null, null, params.c(), 13, null), new GreetingsHeaderData(q(password.getPartOfTheDay()), this.labelProvider.c(sj2.b.f182031l)), new FooterData(this.labelProvider.e(sj2.b.f182026g, password.getAppVersion()), this.labelProvider.c(sj2.b.f182020a), this.labelProvider.c(sj2.b.f182023d), this.labelProvider.c(sj2.b.f182022c), this.labelProvider.c(sj2.b.f182024e), this.labelProvider.c(sj2.b.f182021b), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    public final DialogData f(dx.b domainError) {
        oq.r rVar;
        if (domainError instanceof dx.b.InterfaceC1027b.a.c) {
            rVar = new oq.r(this.labelProvider.c(sj2.b.f182037r), this.labelProvider.c(sj2.b.f182036q));
        } else if (domainError instanceof dx.b.j.c) {
            rVar = new oq.r(this.labelProvider.c(sj2.b.f182039t), this.labelProvider.c(sj2.b.f182038s));
        } else {
            rVar = t.c(domainError, dx.c.f45092a) ? new oq.r(this.labelProvider.c(sj2.b.f182037r), this.labelProvider.c(sj2.b.f182040u)) : null;
        }
        if (rVar != null) {
            return new DialogData(h.b.f24985a, (Label) rVar.a(), (Label) rVar.b(), new DialogButtonTextData(this.labelProvider.c(sj2.b.f182028i), null, new er.a() { // from class: ek2.b
                @Override // er.a
                public final Object a() {
                    return c.h();
                }
            }, 2, null), null, null, null, 112, null);
        }
        return null;
    }

    public final Label i() {
        return this.labelProvider.c(sj2.b.f182041v);
    }

    public final Label l() {
        return this.labelProvider.c(sj2.b.A);
    }

    public final Label m() {
        return this.labelProvider.c(sj2.b.B);
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        dk2.c state = params.getState();
        if (t.c(state, dk2.c.a.f43159a)) {
            return d.a.C0959a.f43172a;
        }
        if (state instanceof dk2.c.b) {
            return new d.a.Initialized(s((dk2.c.b) state, params), params.a());
        }
        throw new oq.p();
    }
}
