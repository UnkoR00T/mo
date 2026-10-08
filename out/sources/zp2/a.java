package zp2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yp2.d;
import yp2.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzp2/a;", "Lxw/f;", "Lzp2/a$a;", "Lyp2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lzp2/a$a;)Lyp2/e$a;", "a", "Lmx/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: zp2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzp2/a$a;", "", "Lyp2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextAction", "onBackAction", "<init>", "(Lyp2/d;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyp2/d;", "c", "()Lyp2/d;", "b", "Ler/a;", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (t.c(state, d.a.f228403a)) {
            return new e.a.Initial(params.a());
        }
        if (state instanceof d.b) {
            return new e.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(bp2.a.f21095t0), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(bp2.a.f21089q0), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(bp2.a.f21087p0)), new t40.a.C4874a(this.labelProvider.c(bp2.a.f21091r0)), new t40.a.C4874a(this.labelProvider.c(bp2.a.f21093s0)))), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21085o0), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), params.a());
        }
        if (!t.c(state, d.c.f228405a)) {
            throw new p();
        }
        return new e.a.Underage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106807k2), this.labelProvider.c(bp2.a.T), null, null, i0.f148189a, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21072i), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), false, 76, null), params.a());
    }
}
