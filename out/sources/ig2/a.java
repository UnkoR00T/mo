package ig2;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.l;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lig2/a;", "Lxw/f;", "Lig2/a$a;", "Lhg2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lhg2/c$a$a;", "c", "(Lig2/a$a;)Lhg2/c$a$a;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, hg2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ig2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lig2/a$a;", "", "Lhg2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onGoToMyRegistries", "onGoToOrderedDocuments", "onGoToVerifyDocument", "<init>", "(Lhg2/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg2/b;", "getState", "()Lhg2/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hg2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToMyRegistries;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToOrderedDocuments;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToVerifyDocument;

        public Params(hg2.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onGoToMyRegistries = aVar2;
            this.onGoToOrderedDocuments = aVar3;
            this.onGoToVerifyDocument = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onGoToMyRegistries;
        }

        public final er.a<i0> c() {
            return this.onGoToOrderedDocuments;
        }

        public final er.a<i0> d() {
            return this.onGoToVerifyDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onGoToMyRegistries, params.onGoToMyRegistries) && t.c(this.onGoToOrderedDocuments, params.onGoToOrderedDocuments) && t.c(this.onGoToVerifyDocument, params.onGoToVerifyDocument);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onGoToMyRegistries.hashCode()) * 31) + this.onGoToOrderedDocuments.hashCode()) * 31) + this.onGoToVerifyDocument.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onGoToMyRegistries=" + this.onGoToMyRegistries + ", onGoToOrderedDocuments=" + this.onGoToOrderedDocuments + ", onGoToVerifyDocument=" + this.onGoToVerifyDocument + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f92316a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(660590480);
            if (p076m2.t.k()) {
                p076m2.t.o(660590480, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.dashboard.mapper.LandRegistryDashboardScreenMapper.invoke.<anonymous> (LandRegistryDashboardScreenMapper.kt:50)");
            }
            long jA = ((gg2.a) rVar.N(gg2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f92317a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1418465793);
            if (p076m2.t.k()) {
                p076m2.t.o(-1418465793, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.dashboard.mapper.LandRegistryDashboardScreenMapper.invoke.<anonymous> (LandRegistryDashboardScreenMapper.kt:60)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f92318a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1605494818);
            if (p076m2.t.k()) {
                p076m2.t.o(1605494818, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.dashboard.mapper.LandRegistryDashboardScreenMapper.invoke.<anonymous> (LandRegistryDashboardScreenMapper.kt:80)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f92319a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(334488133);
            if (p076m2.t.k()) {
                p076m2.t.o(334488133, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.dashboard.mapper.LandRegistryDashboardScreenMapper.invoke.<anonymous> (LandRegistryDashboardScreenMapper.kt:100)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public hg2.c.a.Initialized b(Params params) {
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.E), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106795i4, null, b.f92316a, this.labelProvider.c(xf2.a.f218418z), this.labelProvider.c(xf2.a.f218415y), null, 32, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.R0, null, c.f92317a, null, null, 26, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(l.b(this.labelProvider.c(xf2.a.B), null, null, 3, null)), l.b(this.labelProvider.c(xf2.a.A), null, null, 3, null), 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.P0, null, d.f92318a, null, null, 26, null), 3, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(this.labelProvider.c(xf2.a.D), null, null, 3, null)), l.b(this.labelProvider.c(xf2.a.C), null, null, 3, null), 1, null), leadingSection2, companion.b(), null, 2301, null);
        LeadingSection leadingSection3 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106777g1, null, e.f92319a, null, null, 26, null), 3, null);
        return new hg2.c.a.Initialized(aVarA, baseScaffoldData, icon, new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(this.labelProvider.c(xf2.a.G), null, null, 3, null)), l.b(this.labelProvider.c(xf2.a.F), null, null, 3, null), 1, null), leadingSection3, companion.b(), null, 2301, null)), null, false, null, null, 30, null));
    }
}
