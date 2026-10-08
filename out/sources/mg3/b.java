package mg3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import sv0.Insurance;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lmg3/b;", "Lxw/f;", "Lmg3/b$b;", "Lkg3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lmg3/b$b;)Lkg3/c$a;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, kg3.c.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f126508b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f126509c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmg3/b$a;", "", "<init>", "()V", "", "BUTTON_NEXT_TAG", "Ljava/lang/String;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: mg3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lmg3/b$b;", "", "Lkg3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onAddInsurance", "Lkotlin/Function1;", "Lsv0/r;", "onEditInsurance", "onGoToNextStep", "onBackAction", "onExitAction", "<init>", "(Lkg3/b;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkg3/b;", "f", "()Lkg3/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kg3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddInsurance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Insurance, i0> onEditInsurance;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(kg3.b bVar, er.a<i0> aVar, l<? super Insurance, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onAddInsurance = aVar;
            this.onEditInsurance = lVar;
            this.onGoToNextStep = aVar2;
            this.onBackAction = aVar3;
            this.onExitAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onAddInsurance;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final l<Insurance, i0> c() {
            return this.onEditInsurance;
        }

        public final er.a<i0> d() {
            return this.onExitAction;
        }

        public final er.a<i0> e() {
            return this.onGoToNextStep;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAddInsurance, params.onAddInsurance) && t.c(this.onEditInsurance, params.onEditInsurance) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onExitAction, params.onExitAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final kg3.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onAddInsurance.hashCode()) * 31) + this.onEditInsurance.hashCode()) * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAddInsurance=" + this.onAddInsurance + ", onEditInsurance=" + this.onEditInsurance + ", onGoToNextStep=" + this.onGoToNextStep + ", onBackAction=" + this.onBackAction + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f126517a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2078936597);
            if (p076m2.t.k()) {
                p076m2.t.o(-2078936597, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.mapper.InsuranceListScreenMapper.invoke.<anonymous> (InsuranceListScreenMapper.kt:62)");
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
        public static final d f126518a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1404832267);
            if (p076m2.t.k()) {
                p076m2.t.o(1404832267, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.mapper.InsuranceListScreenMapper.invoke.<anonymous> (InsuranceListScreenMapper.kt:78)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f126519a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(170732725);
            if (p076m2.t.k()) {
                p076m2.t.o(170732725, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.insurancelist.mapper.InsuranceListScreenMapper.invoke.<anonymous> (InsuranceListScreenMapper.kt:85)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, Insurance insurance) {
        params.c().b(insurance);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public kg3.c.a b(final Params params) {
        Label labelC;
        ng3.a insuranceList;
        kg3.b state = params.getState();
        if (t.c(state, kg3.b.a.f110860a)) {
            return kg3.c.a.C2666a.f110862a;
        }
        if (!(state instanceof kg3.b.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(md3.b.f125847v3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f126517a, null, params.d(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        boolean zIsEmpty = ((kg3.b.Initialized) params.getState()).a().isEmpty();
        if (zIsEmpty) {
            labelC = this.labelProvider.c(md3.b.Q2);
        } else {
            if (zIsEmpty) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(md3.b.U2);
        }
        Label labelC2 = this.labelProvider.c(md3.b.O2);
        kg3.b.Initialized initialized = (kg3.b.Initialized) state;
        boolean zIsEmpty2 = initialized.a().isEmpty();
        if (zIsEmpty2) {
            insuranceList = new ng3.a.Empty(new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(md3.b.P2), null, e.f126519a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, d.f126518a, null, null, 26, null), 3, null), null, null, 3325, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.W).n("ButtonNext"), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null));
        } else {
            if (zIsEmpty2) {
                throw new oq.p();
            }
            Label labelC3 = this.labelProvider.c(md3.b.O2);
            List<Insurance> listA = initialized.a();
            ArrayList arrayList = new ArrayList(v.y(listA, 10));
            Iterator it = listA.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                final Insurance insurance = (Insurance) next;
                n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(insurance.getInsurerName(), "SingleCardLabelTitle_" + i15), null, null, 0, 0, null, 62, null));
                mx.c cVar = this.labelProvider;
                int i17 = md3.b.R2;
                b0 insuranceNumber = insurance.getInsuranceNumber();
                Iterator it4 = it;
                arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, title, new SingleCardLabel(cVar.e(i17, mx.b.d(insuranceNumber != null ? c0.e(insuranceNumber) : null, "insuranceNumber_" + i15).getText()), null, null, 0, 0, null, 62, null), 1, null), null, insurance.getInsuranceAddedManually() ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(md3.b.f125819s), this.labelProvider.c(md3.b.J0)), k30.d.a.f107773a, null, new er.a() { // from class: mg3.a
                    @Override // er.a
                    public final Object a() {
                        return b.f(params, insurance);
                    }
                }, 35, null)) : null, null, 2815, null));
                i15 = i16;
                it = it4;
            }
            k30.a.b bVar = k30.a.b.f107765a;
            k30.d.a aVar = k30.d.a.f107773a;
            insuranceList = new ng3.a.InsuranceList(labelC3, arrayList, new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(md3.b.f125675a), null, 2, null), aVar, null, params.a(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.K).n("ButtonNext"), null, 2, null), aVar, null, params.e(), 35, null));
        }
        return new kg3.c.a.Initialized(baseScaffoldData, labelC, labelC2, insuranceList);
    }
}
