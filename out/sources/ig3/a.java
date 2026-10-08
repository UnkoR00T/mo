package ig3;

import fr.t;
import hg3.d;
import hg3.e;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import jg3.InformationContent;
import md3.b;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lig3/a;", "Lxw/f;", "Lig3/a$a;", "Lhg3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ljg3/a;", "c", "(Lig3/a$a;)Ljg3/a;", "", "stringId", "Lmx/a;", "e", "(I)Lmx/a;", "f", "(Lig3/a$a;)Lhg3/e$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ig3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lig3/a$a;", "", "Lhg3/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToNextStep", "onLinkClicked", "onExitAction", "<init>", "(Lhg3/d;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg3/d;", "d", "()Lhg3/d;", "b", "Ler/a;", "()Ler/a;", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLinkClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = dVar;
            this.onGoToNextStep = aVar;
            this.onLinkClicked = aVar2;
            this.onExitAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onExitAction;
        }

        public final er.a<i0> b() {
            return this.onGoToNextStep;
        }

        public final er.a<i0> c() {
            return this.onLinkClicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onLinkClicked, params.onLinkClicked) && t.c(this.onExitAction, params.onExitAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onLinkClicked.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToNextStep=" + this.onGoToNextStep + ", onLinkClicked=" + this.onLinkClicked + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final InformationContent c(Params params) {
        return new InformationContent(e(b.K2), new InfoRowListData(v.q(new t40.a.C4874a(e(b.G2)), new t40.a.C4874a(e(b.I2)), new t40.a.C4874a(e(b.J2)))), new ButtonTextData(null, this.labelProvider.c(b.H2), null, null, params.c(), 13, null), this.labelProvider.c(b.K));
    }

    private final Label e(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (t.c(state, d.a.f84584a)) {
            return e.a.C1963a.f84586a;
        }
        if (!(state instanceof d.b)) {
            throw new p();
        }
        return new e.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(b.f125847v3), null, null, null, 28, null), null, null, null, null, 61, null), c(params), params.b());
    }
}
