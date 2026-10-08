package l72;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import k72.g;
import k72.h;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll72/a;", "Lxw/f;", "Ll72/a$a;", "Lk72/h$a;", "Lmx/c;", "labelProvider", "Lb72/a;", "floodAlertEndpoints", "<init>", "(Lmx/c;Lb72/a;)V", "params", "c", "(Ll72/a$a;)Lk72/h$a;", "a", "Lmx/c;", "b", "Lb72/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b72.a floodAlertEndpoints;

    /* JADX INFO: renamed from: l72.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$¨\u0006%"}, d2 = {"Ll72/a$a;", "", "Lk72/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "goToAlarmStates", "goToHowToProceed", "goToMap", "Lkotlin/Function1;", "", "openUrl", "<init>", "(Lk72/g;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk72/g;", "getState", "()Lk72/g;", "b", "Ler/a;", "d", "()Ler/a;", "c", "e", "f", "Ler/l;", "()Ler/l;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToAlarmStates;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToHowToProceed;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToMap;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super String, i0> lVar) {
            this.state = gVar;
            this.onBackAction = aVar;
            this.goToAlarmStates = aVar2;
            this.goToHowToProceed = aVar3;
            this.goToMap = aVar4;
            this.openUrl = lVar;
        }

        public final er.a<i0> a() {
            return this.goToAlarmStates;
        }

        public final er.a<i0> b() {
            return this.goToHowToProceed;
        }

        public final er.a<i0> c() {
            return this.goToMap;
        }

        public final er.a<i0> d() {
            return this.onBackAction;
        }

        public final l<String, i0> e() {
            return this.openUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.goToAlarmStates, params.goToAlarmStates) && t.c(this.goToHowToProceed, params.goToHowToProceed) && t.c(this.goToMap, params.goToMap) && t.c(this.openUrl, params.openUrl);
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.goToAlarmStates.hashCode()) * 31) + this.goToHowToProceed.hashCode()) * 31) + this.goToMap.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", goToAlarmStates=" + this.goToAlarmStates + ", goToHowToProceed=" + this.goToHowToProceed + ", goToMap=" + this.goToMap + ", openUrl=" + this.openUrl + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f116783a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-597160861);
            if (p076m2.t.k()) {
                p076m2.t.o(-597160861, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.dashboard.mapper.FloodAlertDashboardMapper.invoke.<anonymous> (FloodAlertDashboardMapper.kt:54)");
            }
            long jA = ((j72.a) rVar.N(j72.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public a(c cVar, b72.a aVar) {
        this.labelProvider = cVar;
        this.floodAlertEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(a72.c.f4051p), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.H3, null, b.f116783a, this.labelProvider.c(a72.c.f4049o), this.labelProvider.c(a72.c.f4047n), null, 34, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.F, null, null, null, null, 30, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(a72.c.f4027d), null, null, 3, null)), n50.l.b(this.labelProvider.c(a72.c.f4035h), null, null, 3, null), 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.H1, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(a72.c.A), null, null, 3, null)), n50.l.b(this.labelProvider.c(a72.c.f4066z), null, null, 3, null), 1, null), leadingSection2, companion.b(), null, 2301, null);
        LeadingSection leadingSection3 = new LeadingSection(false, null, new n50.i.Icon(jz.a.Y0, null, null, null, null, 30, null), 3, null);
        return new h.Data(baseScaffoldData, icon, new h.FloodDashboardContentScreenData(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(a72.c.R), null, null, 3, null)), n50.l.b(this.labelProvider.c(a72.c.T), null, null, 3, null), 1, null), leadingSection3, companion.b(), null, 2301, null)), new c30.b.c(null, null, this.labelProvider.c(a72.c.f4041k), this.labelProvider.c(a72.c.f4037i), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(a72.c.f4039j), this.floodAlertEndpoints.i0(), LinkData.EnumC5775a.WEBSITE, false, params.e(), 17, null)), 51, null));
    }
}
