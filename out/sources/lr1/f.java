package lr1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llr1/f;", "Lxw/f;", "Llr1/f$a;", "Llr1/c$a;", "Liy/c;", "bytesConverter", "<init>", "(Liy/c;)V", "params", "f", "(Llr1/f$a;)Llr1/c$a;", "a", "Liy/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: lr1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b \u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b\u001c\u0010#R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b*\u0010&R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b)\u0010&¨\u0006+"}, d2 = {"Llr1/f$a;", "", "Llr1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Liy/b0;", "onSecretValueChanged", "", "onAliasValueChanged", "", "onTimeoutValueChanged", "onRsaKeyguardClick", "onAesKeyguardClick", "", "onUseBiometricSwitch", "onSkipKeyCreationSwitch", "<init>", "(Llr1/b;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llr1/b;", "i", "()Llr1/b;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "e", "()Ler/l;", "d", "g", "f", "h", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f119868j = iy.a0.f97720c | iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<iy.b0, i0> onSecretValueChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onAliasValueChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> onTimeoutValueChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRsaKeyguardClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAesKeyguardClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onUseBiometricSwitch;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onSkipKeyCreationSwitch;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.l<? super iy.b0, i0> lVar, er.l<? super String, i0> lVar2, er.l<? super Integer, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, er.l<? super Boolean, i0> lVar4, er.l<? super Boolean, i0> lVar5) {
            this.state = state;
            this.onBackAction = aVar;
            this.onSecretValueChanged = lVar;
            this.onAliasValueChanged = lVar2;
            this.onTimeoutValueChanged = lVar3;
            this.onRsaKeyguardClick = aVar2;
            this.onAesKeyguardClick = aVar3;
            this.onUseBiometricSwitch = lVar4;
            this.onSkipKeyCreationSwitch = lVar5;
        }

        public final er.a<i0> a() {
            return this.onAesKeyguardClick;
        }

        public final er.l<String, i0> b() {
            return this.onAliasValueChanged;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onRsaKeyguardClick;
        }

        public final er.l<iy.b0, i0> e() {
            return this.onSecretValueChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.onSecretValueChanged, params.onSecretValueChanged) && fr.t.c(this.onAliasValueChanged, params.onAliasValueChanged) && fr.t.c(this.onTimeoutValueChanged, params.onTimeoutValueChanged) && fr.t.c(this.onRsaKeyguardClick, params.onRsaKeyguardClick) && fr.t.c(this.onAesKeyguardClick, params.onAesKeyguardClick) && fr.t.c(this.onUseBiometricSwitch, params.onUseBiometricSwitch) && fr.t.c(this.onSkipKeyCreationSwitch, params.onSkipKeyCreationSwitch);
        }

        public final er.l<Boolean, i0> f() {
            return this.onSkipKeyCreationSwitch;
        }

        public final er.l<Integer, i0> g() {
            return this.onTimeoutValueChanged;
        }

        public final er.l<Boolean, i0> h() {
            return this.onUseBiometricSwitch;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onSecretValueChanged.hashCode()) * 31) + this.onAliasValueChanged.hashCode()) * 31) + this.onTimeoutValueChanged.hashCode()) * 31) + this.onRsaKeyguardClick.hashCode()) * 31) + this.onAesKeyguardClick.hashCode()) * 31) + this.onUseBiometricSwitch.hashCode()) * 31) + this.onSkipKeyCreationSwitch.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onSecretValueChanged=" + this.onSecretValueChanged + ", onAliasValueChanged=" + this.onAliasValueChanged + ", onTimeoutValueChanged=" + this.onTimeoutValueChanged + ", onRsaKeyguardClick=" + this.onRsaKeyguardClick + ", onAesKeyguardClick=" + this.onAesKeyguardClick + ", onUseBiometricSwitch=" + this.onUseBiometricSwitch + ", onSkipKeyCreationSwitch=" + this.onSkipKeyCreationSwitch + ')';
        }
    }

    public f(iy.c cVar) {
        this.bytesConverter = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.e().b(iy.c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        try {
            params.g().b(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.Data b(final Params params) {
        Label labelB;
        Label labelB2;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), mx.b.b("Developer Keyguard", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarC = params.c();
        v50.c.Text text = new v50.c.Text(null, null, null, mx.b.b(iy.c0.e(params.getState().getSecret()), ""), null, null, null, new er.l() { // from class: lr1.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048439, null);
        v50.c.Text text2 = new v50.c.Text(null, null, null, mx.b.b(params.getState().getAlias(), ""), null, null, null, params.b(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048439, null);
        v50.c.Number number = new v50.c.Number(null, null, null, mx.b.b(String.valueOf(params.getState().getTimeout()), ""), null, null, null, new er.l() { // from class: lr1.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.i(params, (String) obj);
            }
        }, null, !params.getState().getSkipKeyCreation(), 0, null, false, null, false, null, null, null, null, false, 1047927, null);
        Label labelB3 = mx.b.b("Encrypted:", "");
        dx.i<dx.b, char[]> iVarC = this.bytesConverter.c(params.getState().getEncryptedData().getData(), new iy.b.Standard(null, 1, null));
        if (iVarC instanceof dx.i.Left) {
            labelB = Label.INSTANCE.c();
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            labelB = mx.b.b(new String((char[]) ((dx.i.Right) iVarC).b()), "");
        }
        Label labelB4 = mx.b.b("Decrypted:", "");
        dx.i<dx.b, char[]> iVarC2 = this.bytesConverter.c(params.getState().getDecryptedData().getData(), new iy.b.Standard(null, 1, null));
        if (iVarC2 instanceof dx.i.Left) {
            labelB2 = Label.INSTANCE.c();
        } else {
            if (!(iVarC2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            labelB2 = mx.b.b(new String((char[]) ((dx.i.Right) iVarC2).b()), "");
        }
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.c.WithText withText = new k30.c.WithText(mx.b.b("Encrypt/Decrypt RSA", ""), null, 2, null);
        k30.d.a aVar = k30.d.a.f107773a;
        return new c.Data(baseScaffoldData, aVarC, text, text2, number, labelB3, labelB, labelB4, labelB2, new ButtonData(null, null, large, withText, aVar, null, params.d(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Encrypt/Decrypt AES", ""), null, 2, null), aVar, null, params.a(), 35, null), new s50.a.c(null, params.getState().getUseBiometric(), mx.b.b("Use BiometricManager wrapper", ""), null, false, null, params.h(), null, 185, null), new s50.a.c(null, params.getState().getSkipKeyCreation(), mx.b.b("Skip key creation", ""), null, false, null, params.f(), null, 185, null));
    }
}
