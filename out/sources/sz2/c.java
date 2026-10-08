package sz2;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import k30.d;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import qz2.m;
import qz2.n;
import rz2.FreeSignaturesCounterModel;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsz2/c;", "Lxw/f;", "Lsz2/c$a;", "Lqz2/n$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lsz2/c$a;)Lqz2/n$a;", "a", "Lmx/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: sz2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lsz2/c$a;", "", "Lqz2/m;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseInfoPage", "onNextAction", "onMoreInfoAction", "<init>", "(Lqz2/m;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqz2/m;", "e", "()Lqz2/m;", "b", "Ler/a;", "()Ler/a;", "c", "d", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseInfoPage;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreInfoAction;

        public Params(m mVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = mVar;
            this.onBackAction = aVar;
            this.onCloseInfoPage = aVar2;
            this.onNextAction = aVar3;
            this.onMoreInfoAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseInfoPage;
        }

        public final er.a<i0> c() {
            return this.onMoreInfoAction;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final m getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseInfoPage, params.onCloseInfoPage) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onMoreInfoAction, params.onMoreInfoAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseInfoPage.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onMoreInfoAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseInfoPage=" + this.onCloseInfoPage + ", onNextAction=" + this.onNextAction + ", onMoreInfoAction=" + this.onMoreInfoAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f186141a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-576883900);
            if (p076m2.t.k()) {
                p076m2.t.o(-576883900, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.mapper.QualifiedSignatureMapper.invoke.<anonymous>.<anonymous> (QualifiedSignatureMapper.kt:54)");
            }
            long jA = ((bz2.a) rVar.N(bz2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Params params) {
        mx.c cVar = this.labelProvider;
        m state = params.getState();
        if (t.c(state, m.c.f169704a)) {
            return n.a.c.f169712a;
        }
        if (state instanceof m.Initialized) {
            m.Initialized initialized = (m.Initialized) state;
            return new n.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(uy2.b.f202309o0), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106748c4, null, b.f186141a, cVar.c(uy2.b.T), cVar.c(uy2.b.S), null, 34, null), new FreeSignaturesCounterModel(new Label(String.valueOf(initialized.getQualifiedSignatureInfo().getFreeSignaturesCounter()), "availableFreeSignaturesCounterTag"), cVar.c(initialized.getQualifiedSignatureInfo().getFreeSignaturesCounter() > 0 ? uy2.b.P : uy2.b.f202289e0), initialized.getQualifiedSignatureInfo().getFreeSignaturesCounter() > 0 ? cVar.c(uy2.b.P).o(Label.INSTANCE.d()).o(mx.b.b(String.valueOf(initialized.getQualifiedSignatureInfo().getFreeSignaturesCounter()), "")) : cVar.c(uy2.b.f202289e0)), new ButtonTextData(null, cVar.c(uy2.b.U), null, null, params.c(), 13, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(uy2.b.G), null, 2, null), d.a.f107773a, null, params.d(), 35, null), params.a());
        }
        if (state instanceof m.Error) {
            return new n.a.Error(((m.Error) state).getErrorVMS());
        }
        if (state instanceof m.InfoPage) {
            return new n.a.InfoPage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), cVar.c(uy2.b.f202309o0), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(uy2.b.f202281a0), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(uy2.b.V)), new t40.a.C4874a(this.labelProvider.c(uy2.b.W)), new t40.a.C4874a(this.labelProvider.c(uy2.b.X)), new t40.a.C4874a(this.labelProvider.c(uy2.b.Y)), new t40.a.C4874a(this.labelProvider.c(uy2.b.Z)))), params.b());
        }
        throw new oq.p();
    }
}
