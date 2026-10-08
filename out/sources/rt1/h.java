package rt1;

import al0.BankRestrictionPassport;
import al0.BanksRestriction;
import al0.DocumentRestrictions;
import al0.MObywatelRestriction;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u000f*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lrt1/h;", "Lxw/f;", "Lrt1/h$a;", "Lrt1/g$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "Li50/a;", "q", "(Lrt1/h$a;)Li50/a;", "Lrt1/b;", "Lmx/a;", "i", "(Lrt1/b;)Lmx/a;", "h", "Lh30/a;", "e", "(Lrt1/h$a;)Lh30/a;", "f", "", "documentNumber", "Ln50/b$b;", "m", "(Ljava/lang/String;)Ln50/b$b;", "Lal0/o;", "l", "(Lal0/o;)Lmx/a;", "", "restrictionsCount", "c", "(I)Lmx/a;", "r", "(Lrt1/h$a;)Lrt1/g$a;", "a", "Lmx/c;", "b", "Lez/e;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: rt1.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lrt1/h$a;", "", "Lrt1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onButtonClick", "<init>", "(Lrt1/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrt1/b;", "c", "()Lrt1/b;", "b", "Ler/a;", "()Ler/a;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rt1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onButtonClick;

        public Params(rt1.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onButtonClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final rt1.b getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackClick, params.onBackClick) && fr.t.c(this.onButtonClick, params.onButtonClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onButtonClick=" + this.onButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176022a;

        static {
            int[] iArr = new int[al0.q.values().length];
            try {
                iArr[al0.q.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al0.q.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al0.q.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[al0.q.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[al0.q.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f176022a = iArr;
        }
    }

    public h(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label c(int restrictionsCount) {
        Label labelC = this.labelProvider.c(et1.a.G0);
        Label.Companion companion = Label.INSTANCE;
        return labelC.o(companion.d()).o(mx.b.b(String.valueOf(restrictionsCount), "")).o(companion.d()).o(restrictionsCount > 1 ? this.labelProvider.c(et1.a.f53397b0) : this.labelProvider.c(et1.a.f53399c0));
    }

    private final ButtonData e(Params params) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(f(params.getState()), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
    }

    private final Label f(rt1.b bVar) {
        if (fr.t.c(bVar, rt1.b.a.f175996a)) {
            return Label.INSTANCE.c();
        }
        if ((bVar instanceof NoRestriction) || (bVar instanceof RestrictedInBanks)) {
            return this.labelProvider.c(et1.a.f53429r0);
        }
        if ((bVar instanceof RestrictedInApp) || (bVar instanceof RestrictedInAppAndBanks)) {
            return this.labelProvider.c(et1.a.V);
        }
        throw new oq.p();
    }

    private final Label h(rt1.b bVar) {
        if (bVar instanceof NoRestriction) {
            return this.labelProvider.c(et1.a.f53425p0);
        }
        if ((bVar instanceof RestrictedInApp) || (bVar instanceof RestrictedInAppAndBanks)) {
            return this.labelProvider.c(et1.a.f53431s0);
        }
        if (bVar instanceof RestrictedInBanks) {
            return this.labelProvider.c(et1.a.f53401d0);
        }
        if (fr.t.c(bVar, rt1.b.a.f175996a)) {
            return Label.INSTANCE.c();
        }
        throw new oq.p();
    }

    private final Label i(rt1.b bVar) {
        if (bVar instanceof NoRestriction) {
            return this.labelProvider.c(et1.a.f53427q0);
        }
        if ((bVar instanceof RestrictedInApp) || (bVar instanceof RestrictedInAppAndBanks)) {
            return this.labelProvider.c(et1.a.f53423o0);
        }
        if (bVar instanceof RestrictedInBanks) {
            return this.labelProvider.c(et1.a.f53403e0);
        }
        if (fr.t.c(bVar, rt1.b.a.f175996a)) {
            return Label.INSTANCE.c();
        }
        throw new oq.p();
    }

    private final Label l(BankRestrictionPassport bankRestrictionPassport) {
        al0.q type = bankRestrictionPassport.getType();
        int i15 = type == null ? -1 : b.f176022a[type.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return this.labelProvider.c(et1.a.f53405f0);
            }
            if (i15 == 2) {
                return this.labelProvider.c(et1.a.f53439w0);
            }
            if (i15 == 3) {
                return this.labelProvider.c(et1.a.f53407g0);
            }
            if (i15 == 4) {
                return this.labelProvider.c(et1.a.f53419m0);
            }
            if (i15 != 5) {
                throw new oq.p();
            }
        }
        return this.labelProvider.c(et1.a.f53408h);
    }

    private final n50.b.Title m(String documentNumber) {
        Label labelC;
        if (documentNumber == null || (labelC = mx.b.b(documentNumber, "SeriesAndNumber")) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new n50.b.Title(n50.l.b(labelC, null, null, 3, null));
    }

    private final BaseScaffoldData q(Params params) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53429r0), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        BanksRestriction banksRestrictions;
        Integer restrictionsCount;
        MObywatelRestriction mobywatelRestriction;
        LocalDate restrictedAt;
        DefaultSingleCardData defaultSingleCardData2;
        BanksRestriction banksRestrictions2;
        Integer restrictionsCount2;
        MObywatelRestriction mobywatelRestriction2;
        LocalDate restrictedAt2;
        rt1.b state = params.getState();
        if (fr.t.c(state, rt1.b.a.f175996a)) {
            return g.a.C4490a.f176009a;
        }
        if (state instanceof NoRestriction) {
            BaseScaffoldData baseScaffoldDataQ = q(params);
            Label labelI = i(state);
            Label labelH = h(state);
            NoRestriction noRestriction = (NoRestriction) state;
            return new g.a.Initialized(baseScaffoldDataQ, labelI, labelH, e(params), new CardListData(pq.v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(noRestriction.getPassport()), null, null, 0, 0, null, 62, null), m(noRestriction.getPassport().getNumber()), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null), null, null, 3327, null)), null, false, null, null, 30, null), null, null);
        }
        DefaultSingleCardData defaultSingleCardData3 = null;
        if (state instanceof RestrictedInApp) {
            BaseScaffoldData baseScaffoldDataQ2 = q(params);
            Label labelI2 = i(state);
            Label labelH2 = h(state);
            ButtonData buttonDataE = e(params);
            RestrictedInApp restrictedInApp = (RestrictedInApp) state;
            DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(restrictedInApp.getPassport()), null, null, 0, 0, null, 62, null), m(restrictedInApp.getPassport().getNumber()), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
            DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(et1.a.B0), null, null, 0, 0, null, 62, null), new n50.b.Title(n50.l.b(this.labelProvider.c(et1.a.C0), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106874u, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
            DocumentRestrictions restrictions = restrictedInApp.getPassportRestriction().getRestrictions();
            if (restrictions != null && (mobywatelRestriction2 = restrictions.getMobywatelRestriction()) != null && (restrictedAt2 = mobywatelRestriction2.getRestrictedAt()) != null) {
                defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(et1.a.f53418m), null, null, 0, 0, null, 62, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(restrictedAt2), fz.c.DOTTED), ""), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106759e, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
            }
            return new g.a.Initialized(baseScaffoldDataQ2, labelI2, labelH2, buttonDataE, new CardListData(pq.v.s(defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData3), null, false, null, null, 30, null), null, null);
        }
        if (state instanceof RestrictedInBanks) {
            BaseScaffoldData baseScaffoldDataQ3 = q(params);
            Label labelI3 = i(state);
            Label labelH3 = h(state);
            ButtonData buttonDataE2 = e(params);
            RestrictedInBanks restrictedInBanks = (RestrictedInBanks) state;
            CardListData cardListData = new CardListData(pq.v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(restrictedInBanks.getPassport()), null, null, 0, 0, null, 62, null), m(restrictedInBanks.getPassport().getNumber()), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null), null, null, 3327, null)), null, false, null, null, 30, null);
            Label labelC = this.labelProvider.c(et1.a.H0);
            DocumentRestrictions restrictions2 = restrictedInBanks.getPassportRestriction().getRestrictions();
            if (restrictions2 == null || (banksRestrictions2 = restrictions2.getBanksRestrictions()) == null || (restrictionsCount2 = banksRestrictions2.getRestrictionsCount()) == null) {
                defaultSingleCardData2 = null;
            } else {
                defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(c(restrictionsCount2.intValue()), null, null, 3, null)), new SingleCardLabel(this.labelProvider.c(et1.a.J0), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.X0, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
            }
            return new g.a.Initialized(baseScaffoldDataQ3, labelI3, labelH3, buttonDataE2, cardListData, labelC, defaultSingleCardData2);
        }
        if (!(state instanceof RestrictedInAppAndBanks)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldDataQ4 = q(params);
        Label labelI4 = i(state);
        Label labelH4 = h(state);
        ButtonData buttonDataE3 = e(params);
        RestrictedInAppAndBanks restrictedInAppAndBanks = (RestrictedInAppAndBanks) state;
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(restrictedInAppAndBanks.getPassport()), null, null, 0, 0, null, 62, null), m(restrictedInAppAndBanks.getPassport().getNumber()), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(et1.a.B0), null, null, 0, 0, null, 62, null), new n50.b.Title(n50.l.b(this.labelProvider.c(et1.a.C0), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106874u, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
        DocumentRestrictions restrictions3 = restrictedInAppAndBanks.getPassportRestriction().getRestrictions();
        CardListData cardListData2 = new CardListData(pq.v.s(defaultSingleCardData6, defaultSingleCardData7, (restrictions3 == null || (mobywatelRestriction = restrictions3.getMobywatelRestriction()) == null || (restrictedAt = mobywatelRestriction.getRestrictedAt()) == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(et1.a.f53418m), null, null, 0, 0, null, 62, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(restrictedAt), fz.c.DOTTED), ""), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106759e, null, null, null, null, 30, null), 3, null), null, null, 3327, null)), null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(et1.a.I0);
        DocumentRestrictions restrictions4 = restrictedInAppAndBanks.getPassportRestriction().getRestrictions();
        if (restrictions4 == null || (banksRestrictions = restrictions4.getBanksRestrictions()) == null || (restrictionsCount = banksRestrictions.getRestrictionsCount()) == null) {
            defaultSingleCardData = null;
        } else {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(c(restrictionsCount.intValue()), null, null, 3, null)), new SingleCardLabel(this.labelProvider.c(et1.a.J0), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.X0, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
        }
        return new g.a.Initialized(baseScaffoldDataQ4, labelI4, labelH4, buttonDataE3, cardListData2, labelC2, defaultSingleCardData);
    }
}
