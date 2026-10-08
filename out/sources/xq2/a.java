package xq2;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p127vq2.e0;
import wq2.State;
import wq2.i;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxq2/a;", "Lxw/f;", "Lxq2/a$a;", "Lwq2/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lx50/b;", "e", "(Lxq2/a$a;)Lx50/b;", "Lx50/a$a;", "c", "(Lxq2/a$a;)Lx50/a$a;", "f", "(Lxq2/a$a;)Lwq2/i$a;", "a", "Lmx/c;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: xq2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxq2/a$a;", "", "Lwq2/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "<init>", "(Lwq2/h;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwq2/h;", "c", "()Lwq2/h;", "b", "Ler/a;", "()Ler/a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBack = aVar;
            this.onClose = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final x50.a.Icon c(Params params) {
        e0 currentStep = params.getState().getCurrentStep();
        if (t.c(currentStep, e0.c.f207924a) || t.c(currentStep, e0.a.f207920a) || t.c(currentStep, e0.e.f207928a)) {
            return new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null));
        }
        if (t.c(currentStep, e0.d.f207926a) || t.c(currentStep, e0.b.f207922a) || currentStep == null) {
            return null;
        }
        throw new p();
    }

    private final NavigationButtonData e(Params params) {
        e0 currentStep = params.getState().getCurrentStep();
        if (t.c(currentStep, e0.b.f207922a) || t.c(currentStep, e0.c.f207924a) || t.c(currentStep, e0.a.f207920a) || t.c(currentStep, e0.e.f207928a) || currentStep == null) {
            return new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a());
        }
        if (t.c(currentStep, e0.d.f207926a)) {
            return new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b());
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.Data b(Params params) {
        Label labelC;
        e0 currentStep = params.getState().getCurrentStep();
        if (t.c(currentStep, e0.b.f207922a)) {
            labelC = this.labelProvider.c(qq2.a.f168125p);
        } else if (t.c(currentStep, e0.c.f207924a)) {
            labelC = this.labelProvider.c(qq2.a.f168127r);
        } else if (t.c(currentStep, e0.a.f207920a)) {
            labelC = this.labelProvider.c(qq2.a.f168132w);
        } else {
            labelC = t.c(currentStep, e0.e.f207928a) ? this.labelProvider.c(qq2.a.f168131v) : this.labelProvider.c(qq2.a.R);
        }
        return new i.Data(new BaseScaffoldData(null, new x50.i.Small(e(params), labelC, null, c(params), null, 20, null), null, null, null, null, 61, null), params.a());
    }
}
