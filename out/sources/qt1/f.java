package qt1;

import al0.BanksRestriction;
import al0.DocumentRestrictions;
import al0.MObywatelRestriction;
import al0.PhysicalIdCard;
import al0.PhysicalIdCardRestrictions;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqt1/f;", "Lxw/f;", "Lqt1/f$a;", "Lqt1/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lal0/v0;", "physicalIdCardRestrictions", "Lmx/a;", "h", "(Lal0/v0;)Lmx/a;", "e", "", "restrictionsCount", "f", "(I)Lmx/a;", "params", "i", "(Lqt1/f$a;)Lqt1/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: qt1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lqt1/f$a;", "", "Lqt1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onRestrictIdCardClick", "onUndoRestrictionIdCardClick", "onBack", "<init>", "(Lqt1/c;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqt1/c;", "d", "()Lqt1/c;", "b", "Ler/a;", "()Ler/a;", "c", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRestrictIdCardClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUndoRestrictionIdCardClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.onRestrictIdCardClick = aVar;
            this.onUndoRestrictionIdCardClick = aVar2;
            this.onBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onRestrictIdCardClick;
        }

        public final er.a<i0> c() {
            return this.onUndoRestrictionIdCardClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onRestrictIdCardClick, params.onRestrictIdCardClick) && fr.t.c(this.onUndoRestrictionIdCardClick, params.onUndoRestrictionIdCardClick) && fr.t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onRestrictIdCardClick.hashCode()) * 31) + this.onUndoRestrictionIdCardClick.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onRestrictIdCardClick=" + this.onRestrictIdCardClick + ", onUndoRestrictionIdCardClick=" + this.onUndoRestrictionIdCardClick + ", onBack=" + this.onBack + ')';
        }
    }

    public f(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(PhysicalIdCardRestrictions physicalIdCardRestrictions) {
        DocumentRestrictions restrictions = physicalIdCardRestrictions.getRestrictions();
        if ((restrictions != null ? restrictions.getMobywatelRestriction() : null) != null) {
            return this.labelProvider.c(et1.a.I);
        }
        DocumentRestrictions restrictions2 = physicalIdCardRestrictions.getRestrictions();
        return (restrictions2 != null ? restrictions2.getBanksRestrictions() : null) != null ? this.labelProvider.c(et1.a.G) : this.labelProvider.c(et1.a.K);
    }

    private final Label f(int restrictionsCount) {
        Label labelC = this.labelProvider.c(et1.a.K0);
        Label.Companion companion = Label.INSTANCE;
        return labelC.o(companion.d()).o(mx.b.b(String.valueOf(restrictionsCount), "")).o(companion.d()).o(restrictionsCount > 1 ? this.labelProvider.c(et1.a.f53397b0) : this.labelProvider.c(et1.a.f53399c0));
    }

    private final Label h(PhysicalIdCardRestrictions physicalIdCardRestrictions) {
        DocumentRestrictions restrictions = physicalIdCardRestrictions.getRestrictions();
        if ((restrictions != null ? restrictions.getMobywatelRestriction() : null) != null) {
            return this.labelProvider.c(et1.a.J);
        }
        DocumentRestrictions restrictions2 = physicalIdCardRestrictions.getRestrictions();
        return (restrictions2 != null ? restrictions2.getBanksRestrictions() : null) != null ? this.labelProvider.c(et1.a.H) : this.labelProvider.c(et1.a.L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        DocumentRestrictions restrictions = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getRestrictions();
        if ((restrictions != null ? restrictions.getMobywatelRestriction() : null) != null) {
            params.c().a();
        } else {
            params.b().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d.a b(final Params params) {
        DefaultSingleCardData defaultSingleCardData;
        BanksRestriction banksRestrictions;
        Integer restrictionsCount;
        MObywatelRestriction mobywatelRestriction;
        LocalDate restrictedAt;
        c state = params.getState();
        if (fr.t.c(state, c.a.f168445a)) {
            return d.a.C4258a.f168447a;
        }
        if (!(state instanceof c.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.M), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelH = h(((c.Initialized) params.getState()).getPhysicalIdCardRestrictions());
        Label labelE = e(((c.Initialized) params.getState()).getPhysicalIdCardRestrictions());
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null);
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(et1.a.f53404f), null, null, 3, null);
        StringBuilder sb5 = new StringBuilder();
        PhysicalIdCard document = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getDocument();
        sb5.append(document != null ? document.getSeries() : null);
        PhysicalIdCard document2 = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getDocument();
        sb5.append(document2 != null ? document2.getNumber() : null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(n50.l.b(mx.b.b(sb5.toString(), "SeriesAndNumber"), null, null, 3, null)), null, 4, null), leadingSection, null, null, 3327, null);
        DocumentRestrictions restrictions = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getRestrictions();
        DefaultSingleCardData defaultSingleCardData3 = (restrictions == null || restrictions.getMobywatelRestriction() == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(et1.a.B0), null, null, 3, null), new n50.b.Title(n50.l.b(this.labelProvider.c(et1.a.C0), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106874u, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
        DocumentRestrictions restrictions2 = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getRestrictions();
        CardListData cardListData = new CardListData(pq.v.s(defaultSingleCardData2, defaultSingleCardData3, (restrictions2 == null || (mobywatelRestriction = restrictions2.getMobywatelRestriction()) == null || (restrictedAt = mobywatelRestriction.getRestrictedAt()) == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(et1.a.f53418m), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(restrictedAt), fz.c.DOTTED), "DateOfRestriction"), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106759e, null, null, null, null, 30, null), 3, null), null, null, 3327, null)), null, false, null, null, 30, null);
        mx.c cVar = this.labelProvider;
        DocumentRestrictions restrictions3 = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getRestrictions();
        Label labelC = cVar.c((restrictions3 != null ? restrictions3.getMobywatelRestriction() : null) != null ? et1.a.M0 : et1.a.L0);
        DocumentRestrictions restrictions4 = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getRestrictions();
        if (restrictions4 == null || (banksRestrictions = restrictions4.getBanksRestrictions()) == null || (restrictionsCount = banksRestrictions.getRestrictionsCount()) == null) {
            defaultSingleCardData = null;
        } else {
            int iIntValue = restrictionsCount.intValue();
            LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.X0, null, null, null, null, 30, null), 3, null);
            Label labelF = f(iIntValue);
            labelF.n("RestrictionPlacesCount");
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(labelF, null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(et1.a.J0), null, null, 0, 0, null, 62, null), 1, null), leadingSection2, null, null, 3327, null);
        }
        CardListData cardListData2 = new CardListData(pq.v.r(defaultSingleCardData), null, false, null, null, 30, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        DocumentRestrictions restrictions5 = ((c.Initialized) params.getState()).getPhysicalIdCardRestrictions().getRestrictions();
        return new d.a.Initialized(baseScaffoldData, labelH, labelE, cardListData, labelC, cardListData2, new ButtonData(null, null, large, new k30.c.WithText((restrictions5 != null ? restrictions5.getMobywatelRestriction() : null) != null ? this.labelProvider.c(et1.a.V) : this.labelProvider.c(et1.a.M), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: qt1.e
            @Override // er.a
            public final Object a() {
                return f.l(params);
            }
        }, 35, null), params.a());
    }
}
