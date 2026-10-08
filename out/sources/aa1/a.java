package aa1;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import k30.d;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import xw.f;
import z91.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Laa1/a;", "Lxw/f;", "Laa1/a$a;", "Lz91/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Laa1/a$a;)Lz91/c$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: aa1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, d2 = {"Laa1/a$a;", "", "Lz91/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onWaitAction", "onDeleteApplicationAction", "onBackAction", "<init>", "(Lz91/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz91/b;", "getState", "()Lz91/b;", "b", "Ler/a;", "c", "()Ler/a;", "d", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z91.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onWaitAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteApplicationAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(z91.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onWaitAction = aVar;
            this.onDeleteApplicationAction = aVar2;
            this.onBackAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onDeleteApplicationAction;
        }

        public final er.a<i0> c() {
            return this.onWaitAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onWaitAction, params.onWaitAction) && t.c(this.onDeleteApplicationAction, params.onDeleteApplicationAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onWaitAction.hashCode()) * 31) + this.onDeleteApplicationAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onWaitAction=" + this.onWaitAction + ", onDeleteApplicationAction=" + this.onDeleteApplicationAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5153a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1146384386);
            if (p076m2.t.k()) {
                p076m2.t.o(-1146384386, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.takestoolong.mapper.ChildPassportApplicationTakesTooLongMapper.invoke.<anonymous> (ChildPassportApplicationTakesTooLongMapper.kt:71)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        return new c.Data(new IconPageData(j.b.d.f164690d, this.labelProvider.c(w51.a.U2), this.labelProvider.c(w51.a.T2), null, new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(w51.a.P2)), new t40.a.C4874a(this.labelProvider.c(w51.a.Q2)))), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.R2), null, 2, null), d.a.f107773a, null, params.c(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.S2), null, 2, null), new d.Secondary(b.f5153a), null, params.b(), 35, null), null, 4, null), false, 72, null), params.a());
    }
}
