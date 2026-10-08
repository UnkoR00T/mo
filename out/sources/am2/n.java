package am2;

import androidx.compose.ui.graphics.Color;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lam2/n;", "Lxw/f;", "Lam2/n$a;", "Lam2/m$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lam2/n$a;)Lam2/m$a;", "a", "Lmx/c;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements xw.f<Params, m.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: am2.n$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lam2/n$a;", "", "Lam2/l;", "state", "Lkotlin/Function0;", "Loq/i0;", "onEnableNotificationsAction", "onBackAction", "toIncidentCategories", "goToKnowledgeBaseAction", "<init>", "(Lam2/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lam2/l;", "d", "()Lam2/l;", "b", "Ler/a;", "c", "()Ler/a;", "e", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnableNotificationsAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toIncidentCategories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToKnowledgeBaseAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onEnableNotificationsAction = aVar;
            this.onBackAction = aVar2;
            this.toIncidentCategories = aVar3;
            this.goToKnowledgeBaseAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.goToKnowledgeBaseAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onEnableNotificationsAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> e() {
            return this.toIncidentCategories;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEnableNotificationsAction, params.onEnableNotificationsAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.toIncidentCategories, params.toIncidentCategories) && t.c(this.goToKnowledgeBaseAction, params.goToKnowledgeBaseAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onEnableNotificationsAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.toIncidentCategories.hashCode()) * 31) + this.goToKnowledgeBaseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEnableNotificationsAction=" + this.onEnableNotificationsAction + ", onBackAction=" + this.onBackAction + ", toIncidentCategories=" + this.toIncidentCategories + ", goToKnowledgeBaseAction=" + this.goToKnowledgeBaseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7891a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1857405398);
            if (p076m2.t.k()) {
                p076m2.t.o(-1857405398, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.dashboard.presentation.NetworkSecurityIssuesDashboardMapper.invoke.<anonymous> (NetworkSecurityIssuesDashboardMapper.kt:49)");
            }
            long jA = ((bm2.a) rVar.N(bm2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public n(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(q5.f219543e1), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.I3, null, b.f7891a, this.labelProvider.c(q5.P0), this.labelProvider.c(q5.Q), null, 34, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(c20.b.B, null, null, null, null, 30, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.f219561n0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.K0), null, null, 0, 0, null, 62, null), 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.f219585z0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.f219583y0), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.W0, null, null, null, null, 30, null), 3, null), companion.b(), null, 2301, null);
        if (!params.getState().getKnowledgeBaseEnabled()) {
            defaultSingleCardData2 = null;
        }
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(q5.M0), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(q5.L0), null, null, params.c(), 13, null)), 55, null);
        if (!params.getState().getShowNotificationsAlert()) {
            cVar = null;
        }
        return new m.Data(baseScaffoldData, icon, defaultSingleCardData, defaultSingleCardData2, cVar);
    }
}
