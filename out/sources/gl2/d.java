package gl2;

import androidx.compose.ui.graphics.Color;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgl2/d;", "Lxw/f;", "Lgl2/d$a;", "Lgl2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lgl2/d$a;)Lgl2/c$a;", "Lmx/a;", "e", "()Lmx/a;", "c", "f", "a", "Lmx/c;", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gl2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b)\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b%\u0010\"R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b'\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\"¨\u0006+"}, d2 = {"Lgl2/d$a;", "", "Lgl2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onAlertCloseClick", "onPrescriptionClick", "onReferralsClick", "onScheduledVisitsClick", "onPermissionsClick", "onOrdersClick", "onContactClick", "onInsuranceClick", "onOpenGooglePlayStoreClick", "onBackAction", "<init>", "(Lgl2/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgl2/b;", "k", "()Lgl2/b;", "b", "Ler/a;", "()Ler/a;", "c", "h", "d", "i", "e", "j", "f", "g", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final gl2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAlertCloseClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPrescriptionClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReferralsClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScheduledVisitsClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPermissionsClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOrdersClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onContactClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInsuranceClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenGooglePlayStoreClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(gl2.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, er.a<i0> aVar8, er.a<i0> aVar9, er.a<i0> aVar10) {
            this.state = bVar;
            this.onAlertCloseClick = aVar;
            this.onPrescriptionClick = aVar2;
            this.onReferralsClick = aVar3;
            this.onScheduledVisitsClick = aVar4;
            this.onPermissionsClick = aVar5;
            this.onOrdersClick = aVar6;
            this.onContactClick = aVar7;
            this.onInsuranceClick = aVar8;
            this.onOpenGooglePlayStoreClick = aVar9;
            this.onBackAction = aVar10;
        }

        public final er.a<i0> a() {
            return this.onAlertCloseClick;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onContactClick;
        }

        public final er.a<i0> d() {
            return this.onInsuranceClick;
        }

        public final er.a<i0> e() {
            return this.onOpenGooglePlayStoreClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAlertCloseClick, params.onAlertCloseClick) && t.c(this.onPrescriptionClick, params.onPrescriptionClick) && t.c(this.onReferralsClick, params.onReferralsClick) && t.c(this.onScheduledVisitsClick, params.onScheduledVisitsClick) && t.c(this.onPermissionsClick, params.onPermissionsClick) && t.c(this.onOrdersClick, params.onOrdersClick) && t.c(this.onContactClick, params.onContactClick) && t.c(this.onInsuranceClick, params.onInsuranceClick) && t.c(this.onOpenGooglePlayStoreClick, params.onOpenGooglePlayStoreClick) && t.c(this.onBackAction, params.onBackAction);
        }

        public final er.a<i0> f() {
            return this.onOrdersClick;
        }

        public final er.a<i0> g() {
            return this.onPermissionsClick;
        }

        public final er.a<i0> h() {
            return this.onPrescriptionClick;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.onAlertCloseClick.hashCode()) * 31) + this.onPrescriptionClick.hashCode()) * 31) + this.onReferralsClick.hashCode()) * 31) + this.onScheduledVisitsClick.hashCode()) * 31) + this.onPermissionsClick.hashCode()) * 31) + this.onOrdersClick.hashCode()) * 31) + this.onContactClick.hashCode()) * 31) + this.onInsuranceClick.hashCode()) * 31) + this.onOpenGooglePlayStoreClick.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.onReferralsClick;
        }

        public final er.a<i0> j() {
            return this.onScheduledVisitsClick;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final gl2.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAlertCloseClick=" + this.onAlertCloseClick + ", onPrescriptionClick=" + this.onPrescriptionClick + ", onReferralsClick=" + this.onReferralsClick + ", onScheduledVisitsClick=" + this.onScheduledVisitsClick + ", onPermissionsClick=" + this.onPermissionsClick + ", onOrdersClick=" + this.onOrdersClick + ", onContactClick=" + this.onContactClick + ", onInsuranceClick=" + this.onInsuranceClick + ", onOpenGooglePlayStoreClick=" + this.onOpenGooglePlayStoreClick + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f73602a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1842808885);
            if (p076m2.t.k()) {
                p076m2.t.o(-1842808885, i15, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.dashboard.MyIkpDashboardMapper.invoke.<anonymous> (MyIkpDashboardMapper.kt:56)");
            }
            long jA = ((fl2.a) rVar.N(fl2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    public final Label c() {
        return this.labelProvider.c(yk2.a.f227565c);
    }

    public final Label e() {
        return this.labelProvider.c(yk2.a.f227564b);
    }

    public final Label f() {
        return this.labelProvider.c(yk2.a.f227563a);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        gl2.b state = params.getState();
        if (t.c(state, gl2.b.a.f73581a)) {
            return new c.a.Initial(params.b());
        }
        if (!(state instanceof gl2.b.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106772f4, null, b.f73602a, this.labelProvider.c(yk2.a.f227571i), this.labelProvider.c(yk2.a.f227570h), null, 34, null);
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(yk2.a.f227569g), params.a(), null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(yk2.a.f227568f), null, null, params.e(), 13, null)), 39, null);
        if (!((gl2.b.Initialized) state).getShouldShowAlert()) {
            cVar = null;
        }
        return new c.a.Initialized(baseScaffoldData, icon, cVar, new CardListData(v.q(new DefaultSingleCardData(null, params.h(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227579q), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227578p), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.i(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227581s), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227580r), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.j(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227583u), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227582t), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.g(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227577o), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227576n), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.f(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227575m), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227574l), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227567e), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227566d), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yk2.a.f227573k), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yk2.a.f227572j), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.f106867t, null, null, 6, null), null, 2813, null)), null, false, null, null, 30, null), params.b());
    }
}
