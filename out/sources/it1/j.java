package it1;

import androidx.compose.ui.graphics.Color;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import p071kotlin.Metadata;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lit1/j;", "Lxw/f;", "Lit1/j$a;", "Lit1/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lal0/n;", "Lmx/a;", "c", "(Lal0/n;)Lmx/a;", "params", "Lkotlin/Function0;", "Loq/i0;", "e", "(Lal0/n;Lit1/j$a;)Ler/a;", "f", "(Lit1/j$a;)Lit1/i$a;", "a", "Lmx/c;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: it1.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lit1/j$a;", "", "Lit1/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "toIdDocumentRestriction", "backAction", "toPassportRestriction", "toDrivingLicenceRestriction", "<init>", "(Lit1/h;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit1/h;", "b", "()Lit1/h;", "Ler/a;", "d", "()Ler/a;", "c", "e", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toIdDocumentRestriction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> backAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toPassportRestriction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toDrivingLicenceRestriction;

        public Params(h hVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4) {
            this.state = hVar;
            this.toIdDocumentRestriction = aVar;
            this.backAction = aVar2;
            this.toPassportRestriction = aVar3;
            this.toDrivingLicenceRestriction = aVar4;
        }

        public final er.a<oq.i0> a() {
            return this.backAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getState() {
            return this.state;
        }

        public final er.a<oq.i0> c() {
            return this.toDrivingLicenceRestriction;
        }

        public final er.a<oq.i0> d() {
            return this.toIdDocumentRestriction;
        }

        public final er.a<oq.i0> e() {
            return this.toPassportRestriction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.toIdDocumentRestriction, params.toIdDocumentRestriction) && fr.t.c(this.backAction, params.backAction) && fr.t.c(this.toPassportRestriction, params.toPassportRestriction) && fr.t.c(this.toDrivingLicenceRestriction, params.toDrivingLicenceRestriction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.toIdDocumentRestriction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.toPassportRestriction.hashCode()) * 31) + this.toDrivingLicenceRestriction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", toIdDocumentRestriction=" + this.toIdDocumentRestriction + ", backAction=" + this.backAction + ", toPassportRestriction=" + this.toPassportRestriction + ", toDrivingLicenceRestriction=" + this.toDrivingLicenceRestriction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96989a;

        static {
            int[] iArr = new int[al0.n.values().length];
            try {
                iArr[al0.n.PHYSICAL_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al0.n.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al0.n.DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[al0.n.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96989a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f96990a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(468533749);
            if (p076m2.t.k()) {
                p076m2.t.o(468533749, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.dashboard.DocumentRestrictionDashboardMapper.invoke.<anonymous> (DocumentRestrictionDashboardMapper.kt:54)");
            }
            long jA = ((ht1.a) rVar.N(ht1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f96991a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1531587553);
            if (p076m2.t.k()) {
                p076m2.t.o(-1531587553, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.dashboard.DocumentRestrictionDashboardMapper.invoke.<anonymous> (DocumentRestrictionDashboardMapper.kt:104)");
            }
            long jA = ((ht1.a) rVar.N(ht1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(al0.n nVar) {
        int i15 = b.f96989a[nVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(et1.a.f53402e);
        }
        if (i15 == 2) {
            return this.labelProvider.c(et1.a.f53406g);
        }
        if (i15 == 3) {
            return this.labelProvider.c(et1.a.f53400d);
        }
        if (i15 == 4) {
            return this.labelProvider.c(et1.a.f53408h);
        }
        throw new oq.p();
    }

    private final er.a<oq.i0> e(al0.n nVar, Params params) {
        int i15 = b.f96989a[nVar.ordinal()];
        if (i15 == 1) {
            return params.d();
        }
        if (i15 == 2) {
            return params.e();
        }
        if (i15 == 3) {
            return params.c();
        }
        if (i15 == 4) {
            return params.a();
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        h state = params.getState();
        if (fr.t.c(state, it1.c.f96959a)) {
            return i.a.b.f96972a;
        }
        if (state instanceof Presentation) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53416l), null, null, null, 28, null), null, null, null, null, 61, null);
            er.a<oq.i0> aVarA = params.a();
            o40.a.Icon icon = new o40.a.Icon(jz.a.f106732a4, null, c.f96990a, this.labelProvider.c(et1.a.f53414k), this.labelProvider.c(et1.a.f53412j), null, 34, null);
            List<al0.n> listA = ((Presentation) state).a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            for (al0.n nVar : listA) {
                arrayList.add(new DefaultSingleCardData(null, e(nVar, params), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(c(nVar), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
            }
            return new i.a.Initialized(baseScaffoldData, icon, arrayList, new c30.b.c(null, null, null, this.labelProvider.c(et1.a.f53410i), null, null, null, 119, null), aVarA);
        }
        if (fr.t.c(state, g.f96969a)) {
            return new i.a.Underage(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53416l), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new q40.j.a(jz.a.f106835o2), this.labelProvider.c(et1.a.N0), null, null, null, null, false, 76, null), params.a());
        }
        if (!(state instanceof GetPassportRestriction)) {
            if (state instanceof Error) {
                return new i.a.Error(((Error) state).getErrorVMS());
            }
            if (state instanceof Error) {
                return new i.a.Error(((Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53416l), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<oq.i0> aVarA2 = params.a();
        o40.a.Icon icon2 = new o40.a.Icon(jz.a.f106732a4, null, d.f96991a, this.labelProvider.c(et1.a.f53414k), this.labelProvider.c(et1.a.f53412j), null, 34, null);
        List<al0.n> listA2 = ((GetPassportRestriction) state).a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA2, 10));
        for (al0.n nVar2 : listA2) {
            arrayList2.add(new DefaultSingleCardData(null, e(nVar2, params), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(c(nVar2), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
        }
        return new i.a.Initialized(baseScaffoldData2, icon2, arrayList2, new c30.b.c(null, null, null, this.labelProvider.c(et1.a.f53410i), null, null, null, 119, null), aVarA2);
    }
}
