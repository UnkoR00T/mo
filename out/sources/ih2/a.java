package ih2;

import fr.t;
import hh2.e;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.b;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lih2/a;", "Lxw/f;", "Lih2/a$a;", "Lhh2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lih2/a$a;)Lhh2/e$a;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ih2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lih2/a$a;", "", "Lhh2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDataShareClicked", "onBackAction", "<init>", "(Lhh2/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhh2/c;", "c", "()Lhh2/c;", "b", "Ler/a;", "()Ler/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hh2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDataShareClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(hh2.c cVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onDataShareClicked = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onDataShareClicked;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hh2.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onDataShareClicked, params.onDataShareClicked) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onDataShareClicked.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDataShareClicked=" + this.onDataShareClicked + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        hh2.c state = params.getState();
        if (state instanceof hh2.c.GeneratingCode) {
            return e.a.C1972a.f84712a;
        }
        if (state instanceof hh2.c.GeneratingCodeError) {
            return new e.a.Error(params.a(), ((hh2.c.GeneratingCodeError) state).getErrorVMS());
        }
        if (!(state instanceof hh2.c.Initialized)) {
            throw new p();
        }
        return new e.a.Initialized(params.a(), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.f218411w1), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(xf2.a.f218408v1), this.labelProvider.c(xf2.a.f218405u1), new ButtonTextData(null, this.labelProvider.c(xf2.a.f218402t1), null, null, params.b(), 13, null), ((hh2.c.Initialized) params.getState()).getQrCodeBitmap(), b.b(((hh2.c.Initialized) params.getState()).getCode(), "code"));
    }
}
