package wx1;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import lw1.j0;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import t40.InfoRowListData;
import vx1.e;
import wv3.FaqScreenData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwx1/a;", "Lxw/f;", "Lwx1/a$a;", "Lvx1/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lwv3/d;", "e", "()Lwv3/d;", "params", "c", "(Lwx1/a$a;)Lvx1/f$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, vx1.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: wx1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, d2 = {"Lwx1/a$a;", "", "Lvx1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "onNextClick", "onFaqClick", "<init>", "(Lvx1/e;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvx1/e;", "getState", "()Lvx1/e;", "b", "Ler/a;", "()Ler/a;", "c", "d", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFaqClick;

        public Params(e eVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = eVar;
            this.onCloseClick = aVar;
            this.onNextClick = aVar2;
            this.onFaqClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final er.a<i0> b() {
            return this.onFaqClick;
        }

        public final er.a<i0> c() {
            return this.onNextClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onFaqClick, params.onFaqClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onCloseClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onFaqClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ", onNextClick=" + this.onNextClick + ", onFaqClick=" + this.onFaqClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f215786a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1236832754);
            if (p076m2.t.k()) {
                p076m2.t.o(-1236832754, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.welcomepage.mapper.DocumentSigningWelcomePageMapper.invoke.<anonymous> (DocumentSigningWelcomePageMapper.kt:114)");
            }
            long jA = ((ox1.a) rVar.N(ox1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public vx1.f.Data b(Params params) {
        return new vx1.f.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j0.S0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.B3, null, b.f215786a, this.labelProvider.c(j0.f120717e1), this.labelProvider.c(j0.f120697a1), null, 34, null), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(j0.f120702b1)), new t40.a.C4874a(this.labelProvider.c(j0.f120707c1)), new t40.a.C4874a(this.labelProvider.c(j0.f120712d1)))), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.Z0), null, 2, null), d.a.f107773a, null, params.c(), 35, null));
    }

    public final FaqScreenData e() {
        return new FaqScreenData(this.labelProvider.c(j0.f120760n), v.q(new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120721f0), this.labelProvider.c(j0.R)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120751l0), this.labelProvider.c(j0.X)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120756m0), this.labelProvider.c(j0.Y)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120761n0), this.labelProvider.c(j0.Z)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120766o0), this.labelProvider.c(j0.f120696a0)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120771p0), this.labelProvider.c(j0.f120701b0)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120776q0), this.labelProvider.c(j0.f120706c0)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120781r0), this.labelProvider.c(j0.f120711d0)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120785s0), this.labelProvider.c(j0.f120716e0)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120726g0), this.labelProvider.c(j0.S)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120731h0), this.labelProvider.c(j0.T)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120736i0), this.labelProvider.c(j0.U)), new wv3.c.FaqTextItem(this.labelProvider.c(j0.f120741j0), this.labelProvider.c(j0.V)), new wv3.c.FaqMarkdownItem(this.labelProvider.c(j0.f120746k0), this.labelProvider.c(j0.W).getText(), null, 4, null)));
    }
}
