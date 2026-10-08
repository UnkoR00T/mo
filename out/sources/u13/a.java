package u13;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import t13.d;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu13/a;", "Lxw/f;", "Lu13/a$a;", "Lt13/d$a;", "Lmx/c;", "labelProvider", "Lh13/a;", "safetyGuideEndpoints", "<init>", "(Lmx/c;Lh13/a;)V", "params", "c", "(Lu13/a$a;)Lt13/d$a;", "a", "Lmx/c;", "b", "Lh13/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h13.a safetyGuideEndpoints;

    /* JADX INFO: renamed from: u13.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010 R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(¨\u0006)"}, d2 = {"Lu13/a$a;", "", "Lt13/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onRulesClick", "onBackpackClick", "onAlertsClick", "onEmergencyNumbersClick", "onSuspiciousActivitiesClick", "Lkotlin/Function1;", "", "openUrl", "<init>", "(Lt13/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt13/c;", "getState", "()Lt13/c;", "b", "Ler/a;", "()Ler/a;", "c", "e", "d", "f", "g", "h", "Ler/l;", "()Ler/l;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t13.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRulesClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackpackClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAlertsClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEmergencyNumbersClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSuspiciousActivitiesClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(t13.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super String, i0> lVar) {
            this.state = cVar;
            this.onBackAction = aVar;
            this.onRulesClick = aVar2;
            this.onBackpackClick = aVar3;
            this.onAlertsClick = aVar4;
            this.onEmergencyNumbersClick = aVar5;
            this.onSuspiciousActivitiesClick = aVar6;
            this.openUrl = lVar;
        }

        public final er.a<i0> a() {
            return this.onAlertsClick;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onBackpackClick;
        }

        public final er.a<i0> d() {
            return this.onEmergencyNumbersClick;
        }

        public final er.a<i0> e() {
            return this.onRulesClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onRulesClick, params.onRulesClick) && t.c(this.onBackpackClick, params.onBackpackClick) && t.c(this.onAlertsClick, params.onAlertsClick) && t.c(this.onEmergencyNumbersClick, params.onEmergencyNumbersClick) && t.c(this.onSuspiciousActivitiesClick, params.onSuspiciousActivitiesClick) && t.c(this.openUrl, params.openUrl);
        }

        public final er.a<i0> f() {
            return this.onSuspiciousActivitiesClick;
        }

        public final l<String, i0> g() {
            return this.openUrl;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onRulesClick.hashCode()) * 31) + this.onBackpackClick.hashCode()) * 31) + this.onAlertsClick.hashCode()) * 31) + this.onEmergencyNumbersClick.hashCode()) * 31) + this.onSuspiciousActivitiesClick.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onRulesClick=" + this.onRulesClick + ", onBackpackClick=" + this.onBackpackClick + ", onAlertsClick=" + this.onAlertsClick + ", onEmergencyNumbersClick=" + this.onEmergencyNumbersClick + ", onSuspiciousActivitiesClick=" + this.onSuspiciousActivitiesClick + ", openUrl=" + this.openUrl + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f194363a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1087478305);
            if (p076m2.t.k()) {
                p076m2.t.o(1087478305, i15, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.dashboard.mapper.SafetyGuideDashboardMapper.invoke.<anonymous> (SafetyGuideDashboardMapper.kt:54)");
            }
            long jA = ((s13.a) rVar.N(s13.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public a(c cVar, h13.a aVar) {
        this.labelProvider = cVar;
        this.safetyGuideEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(g13.c.M1), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106823m4, null, b.f194363a, this.labelProvider.c(g13.c.J1), this.labelProvider.c(g13.c.I1), null, 34, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106827n1, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(g13.c.f69764z1), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection, new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106806k1, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(g13.c.P0), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection2, new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        LeadingSection leadingSection3 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106834o1, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(g13.c.f69759y), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection3, new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        LeadingSection leadingSection4 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106820m1, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(g13.c.f69719k1), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection4, new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        LeadingSection leadingSection5 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106813l1, null, null, null, null, 30, null), 3, null);
        return new d.Data(baseScaffoldData, icon, v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, params.f(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(g13.c.H1), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection5, new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null)), new c30.b.c(null, null, this.labelProvider.c(g13.c.L1), this.labelProvider.c(g13.c.K1), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(g13.c.f69693c), this.safetyGuideEndpoints.r(), LinkData.EnumC5775a.WEBSITE, false, params.g(), 17, null)), 51, null));
    }
}
