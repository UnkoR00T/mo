package l82;

import er.l;
import fr.t;
import h30.ButtonData;
import iy.b0;
import iy.c0;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll82/e;", "Lxw/f;", "Ll82/e$a;", "Lj82/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Ll82/e$a;)Lj82/c$a;", "a", "Lmx/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, j82.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l82.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001a\u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Ll82/e$a;", "", "Lj82/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onFullNameChanged", "onAddressChanged", "onEmailChanged", "onPhoneChanged", "Lkotlin/Function0;", "onScrolledToField", "onNextClicked", "<init>", "(Lj82/b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj82/b;", "g", "()Lj82/b;", "b", "Ler/l;", "c", "()Ler/l;", "d", "e", "f", "Ler/a;", "()Ler/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j82.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFullNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onAddressChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onEmailChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPhoneChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j82.b bVar, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, l<? super b0, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onFullNameChanged = lVar;
            this.onAddressChanged = lVar2;
            this.onEmailChanged = lVar3;
            this.onPhoneChanged = lVar4;
            this.onScrolledToField = aVar;
            this.onNextClicked = aVar2;
        }

        public final l<b0, i0> a() {
            return this.onAddressChanged;
        }

        public final l<b0, i0> b() {
            return this.onEmailChanged;
        }

        public final l<b0, i0> c() {
            return this.onFullNameChanged;
        }

        public final er.a<i0> d() {
            return this.onNextClicked;
        }

        public final l<b0, i0> e() {
            return this.onPhoneChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFullNameChanged, params.onFullNameChanged) && t.c(this.onAddressChanged, params.onAddressChanged) && t.c(this.onEmailChanged, params.onEmailChanged) && t.c(this.onPhoneChanged, params.onPhoneChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onNextClicked, params.onNextClicked);
        }

        public final er.a<i0> f() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final j82.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onFullNameChanged.hashCode()) * 31) + this.onAddressChanged.hashCode()) * 31) + this.onEmailChanged.hashCode()) * 31) + this.onPhoneChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onNextClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFullNameChanged=" + this.onFullNameChanged + ", onAddressChanged=" + this.onAddressChanged + ", onEmailChanged=" + this.onEmailChanged + ", onPhoneChanged=" + this.onPhoneChanged + ", onScrolledToField=" + this.onScrolledToField + ", onNextClicked=" + this.onNextClicked + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.a().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public j82.c.a b(final Params params) {
        j82.b state = params.getState();
        if (t.c(state, j82.b.C2348b.f100200a)) {
            return j82.c.a.C2349a.f100201a;
        }
        if (!(state instanceof j82.b.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(v72.b.f204243b1);
        j82.b.Initialized initialized = (j82.b.Initialized) state;
        List listQ = v.q(new j82.c.a.InitializedData.Input(m82.a.NAME_AND_SURNAME, new v50.c.Text(null, this.labelProvider.c(v72.b.Y0), this.labelProvider.c(v72.b.X0), mx.b.b(c0.e(initialized.getFullName()), "InputElementFullName"), initialized.getFullNameValidationState(), null, null, new l() { // from class: l82.a
            @Override // er.l
            public final Object b(Object obj) {
                return e.l(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, null, 1032033, null)), new j82.c.a.InitializedData.Input(m82.a.ADDRESS, new v50.c.Text(null, this.labelProvider.c(v72.b.U0), this.labelProvider.c(v72.b.T0), mx.b.b(c0.e(initialized.getAddress()), "InputElementAddress"), initialized.getAddressValidationState(), null, null, new l() { // from class: l82.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.m(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, null, 1032033, null)), new j82.c.a.InitializedData.Input(m82.a.EMAIL, new v50.c.Text(null, this.labelProvider.c(v72.b.W0), this.labelProvider.c(v72.b.V0), mx.b.b(c0.e(initialized.getEmail()), "InputElementEmail"), initialized.getEmailValidationState(), null, null, new l() { // from class: l82.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, null, 1032033, null)), new j82.c.a.InitializedData.Input(m82.a.PHONE_NUMBER, new v50.c.Number(null, this.labelProvider.c(v72.b.f204240a1), this.labelProvider.c(v72.b.Z0), mx.b.b(c0.e(initialized.getPhoneNumber()), "InputElementPhoneNumber"), initialized.getPhoneNumberValidationState(), null, null, new l() { // from class: l82.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.r(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, false, 1032033, null)));
        z72.a scrollToField = ((j82.b.Initialized) params.getState()).getScrollToField();
        return new j82.c.a.InitializedData(labelC, listQ, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(v72.b.L), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), scrollToField != null ? m82.b.a(scrollToField) : null, params.f());
    }
}
