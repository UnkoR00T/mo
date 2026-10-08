package j53;

import e04.e;
import fr.t;
import i50.BaseScaffoldData;
import i53.b;
import i53.c;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj53/a;", "Lxw/f;", "Lj53/a$a;", "Li53/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ln50/g;", "c", "(Lmx/a;Ler/a;)Ln50/g;", "params", "Li53/c$a$a;", "e", "(Lj53/a$a;)Li53/c$a$a;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j53.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lj53/a$a;", "", "Li53/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "turnOffBiometricLogin", "changePin", "disablePinOnLogin", "<init>", "(Li53/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li53/b;", "d", "()Li53/b;", "b", "Ler/a;", "c", "()Ler/a;", "e", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> turnOffBiometricLogin;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> changePin;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> disablePinOnLogin;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.turnOffBiometricLogin = aVar2;
            this.changePin = aVar3;
            this.disablePinOnLogin = aVar4;
        }

        public final er.a<i0> a() {
            return this.changePin;
        }

        public final er.a<i0> b() {
            return this.disablePinOnLogin;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getState() {
            return this.state;
        }

        public final er.a<i0> e() {
            return this.turnOffBiometricLogin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.turnOffBiometricLogin, params.turnOffBiometricLogin) && t.c(this.changePin, params.changePin) && t.c(this.disablePinOnLogin, params.disablePinOnLogin);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.turnOffBiometricLogin.hashCode()) * 31) + this.changePin.hashCode()) * 31) + this.disablePinOnLogin.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", turnOffBiometricLogin=" + this.turnOffBiometricLogin + ", changePin=" + this.changePin + ", disablePinOnLogin=" + this.disablePinOnLogin + ')';
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(Label title, er.a<i0> onClick) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a.Initialized b(Params params) {
        b state = params.getState();
        if (state instanceof b.Initialized) {
            return new c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(c53.a.f23726s), null, null, null, 28, null), null, null, null, null, 61, null), c(this.labelProvider.c(c53.a.f23729t), params.e()), new CardListData(v.q(c(this.labelProvider.c(c53.a.f23720q), params.a()), c(this.labelProvider.c(t.c(((b.Initialized) state).getBiometricStatus(), e.b.a.f46688a) ? c53.a.f23732u : c53.a.f23735v), params.b())), null, false, null, null, 30, null));
        }
        throw new p();
    }
}
