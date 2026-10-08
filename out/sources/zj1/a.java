package zj1;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yj1.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzj1/a;", "Lxw/f;", "Lzj1/a$a;", "Lyj1/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Li50/a;", "c", "(Lzj1/a$a;)Li50/a;", "", "stringId", "Lmx/a;", "f", "(I)Lmx/a;", "Lyj1/g$a$a;", "e", "(Lzj1/a$a;)Lyj1/g$a$a;", "a", "Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: zj1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lzj1/a$a;", "", "Lyj1/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onIndividualCategoryClick", "onGroupCategoryClick", "onMilitaryCategoryClick", "<init>", "(Lyj1/f;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyj1/f;", "e", "()Lyj1/f;", "b", "Ler/a;", "()Ler/a;", "c", "d", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yj1.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onIndividualCategoryClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGroupCategoryClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMilitaryCategoryClick;

        public Params(yj1.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = fVar;
            this.onBackClick = aVar;
            this.onIndividualCategoryClick = aVar2;
            this.onGroupCategoryClick = aVar3;
            this.onMilitaryCategoryClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onGroupCategoryClick;
        }

        public final er.a<i0> c() {
            return this.onIndividualCategoryClick;
        }

        public final er.a<i0> d() {
            return this.onMilitaryCategoryClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final yj1.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onIndividualCategoryClick, params.onIndividualCategoryClick) && t.c(this.onGroupCategoryClick, params.onGroupCategoryClick) && t.c(this.onMilitaryCategoryClick, params.onMilitaryCategoryClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onIndividualCategoryClick.hashCode()) * 31) + this.onGroupCategoryClick.hashCode()) * 31) + this.onMilitaryCategoryClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onIndividualCategoryClick=" + this.onIndividualCategoryClick + ", onGroupCategoryClick=" + this.onGroupCategoryClick + ", onMilitaryCategoryClick=" + this.onMilitaryCategoryClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f235466a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1834310020);
            if (p076m2.t.k()) {
                p076m2.t.o(1834310020, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdashboard.mapper.TrainingDashboardScreenMapper.invoke.<anonymous> (TrainingDashboardScreenMapper.kt:44)");
            }
            long jA = ((yi1.a) rVar.N(yi1.c.c())).a();
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

    private final BaseScaffoldData c(Params params) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), f(ri1.b.T1), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final Label f(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.a.Categories b(Params params) {
        if (!(params.getState() instanceof yj1.f.a)) {
            throw new oq.p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldDataC = c(params);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106788h4, null, b.f235466a, f(ri1.b.M1), f(ri1.b.S1), null, 34, null);
        er.a<i0> aVarC = params.c();
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.G0, null, null, null, null, 30, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(f(ri1.b.O1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(f(ri1.b.N1), null, null, 0, 0, null, 62, null), 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new g.a.Categories(baseScaffoldDataC, icon, new DefaultSingleCardData("IndividualTrainingCard", aVarC, false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2300, null), new DefaultSingleCardData("GroupTrainingCard", params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(f(ri1.b.L1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(f(ri1.b.K1), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.I0, null, null, null, null, 30, null), 3, null), companion.b(), null, 2300, null), new DefaultSingleCardData("MilitaryTrainingCard", params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(f(ri1.b.Q1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(f(ri1.b.P1), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.N, null, null, null, null, 30, null), 3, null), companion.b(), null, 2300, null), aVarA);
    }
}
