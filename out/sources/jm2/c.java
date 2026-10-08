package jm2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import im2.State;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import r30.d;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xl2.q5;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljm2/c;", "Lxw/f;", "Ljm2/c$a;", "Lim2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Ljm2/c$a;)Lim2/c$a;", "Lmx/a;", "f", "()Lmx/a;", "a", "Lmx/c;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, im2.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jm2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001e\u0010&R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001a\u0010&R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006("}, d2 = {"Ljm2/c$a;", "", "Lim2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextAction", "onBackAction", "onCloseAction", "Lkotlin/Function1;", "", "switchClicked", "", "emailEntered", "consentChecked", "seeFullConsent", "<init>", "(Lim2/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lim2/b;", "g", "()Lim2/b;", "b", "Ler/a;", "e", "()Ler/a;", "c", "d", "Ler/l;", "h", "()Ler/l;", "f", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f103763i = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> switchClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> emailEntered;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> consentChecked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> seeFullConsent;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, l<? super Boolean, i0> lVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
            this.switchClicked = lVar;
            this.emailEntered = lVar2;
            this.consentChecked = lVar3;
            this.seeFullConsent = aVar4;
        }

        public final l<Boolean, i0> a() {
            return this.consentChecked;
        }

        public final l<String, i0> b() {
            return this.emailEntered;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onCloseAction;
        }

        public final er.a<i0> e() {
            return this.onNextAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.switchClicked, params.switchClicked) && t.c(this.emailEntered, params.emailEntered) && t.c(this.consentChecked, params.consentChecked) && t.c(this.seeFullConsent, params.seeFullConsent);
        }

        public final er.a<i0> f() {
            return this.seeFullConsent;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final l<Boolean, i0> h() {
            return this.switchClicked;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.switchClicked.hashCode()) * 31) + this.emailEntered.hashCode()) * 31) + this.consentChecked.hashCode()) * 31) + this.seeFullConsent.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", switchClicked=" + this.switchClicked + ", emailEntered=" + this.emailEntered + ", consentChecked=" + this.consentChecked + ", seeFullConsent=" + this.seeFullConsent + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103772a;

        static {
            int[] iArr = new int[km2.b.values().length];
            try {
                iArr[km2.b.ILLEGAL_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[km2.b.MALICIOUS_WEBSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[km2.b.FRAUD_WIZARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[km2.b.OTHER_WIZARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f103772a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, boolean z15) {
        params.a().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    public final Label f() {
        return this.labelProvider.c(q5.f219566q);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public im2.c.Data b(final Params params) {
        int i15;
        Label labelC;
        int i16 = b.f103772a[params.getState().getProcessType().ordinal()];
        if (i16 == 1) {
            i15 = q5.f219559m0;
        } else if (i16 == 2) {
            i15 = q5.D0;
        } else if (i16 == 3) {
            i15 = q5.T;
        } else {
            if (i16 != 4) {
                throw new p();
            }
            i15 = q5.F0;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(i15), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC2 = this.labelProvider.c(q5.F);
        Label labelC3 = this.labelProvider.c(q5.U);
        s50.a.c cVar = new s50.a.c(null, params.getState().getIsAnonymous(), this.labelProvider.c(q5.G), null, false, null, params.h(), null, 185, null);
        Label labelC4 = this.labelProvider.c(q5.f219546g);
        String email = params.getState().getEmail();
        if (email == null || (labelC = mx.b.b(email, "email")) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new im2.c.Data(baseScaffoldData, labelC2, labelC3, cVar, new v50.c.Text(null, labelC4, null, labelC, params.getState().getEmailValidationState(), null, null, params.b(), null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 917349, null), this.labelProvider.c(q5.f219564p), new CheckBoxSingleData(new CheckBoxRowData(null, params.getState().getConsentChecked(), new l() { // from class: jm2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.l(params, ((Boolean) obj).booleanValue());
            }
        }, this.labelProvider.c(q5.H), null, null, new d.Button(new ButtonTextData(null, this.labelProvider.c(q5.I), null, null, new er.a() { // from class: jm2.a
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, 13, null)), null, 177, null), params.getState().getConsentValidationState() instanceof hz.b.Invalid ? new r30.b.Error(null, ((hz.b.Invalid) params.getState().getConsentValidationState()).getMessage(), 1, null) : r30.b.a.f171263a, r30.c.CONTENT_BOX, false, null, 24, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q5.f219556l), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null), params.b());
    }
}
