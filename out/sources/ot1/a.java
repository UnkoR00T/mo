package ot1;

import al0.BanksRestriction;
import al0.DocumentRestrictions;
import al0.MObywatelRestriction;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import mx.Label;
import mx.b;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.l;
import nt1.Error;
import nt1.d;
import nt1.e;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\rJ!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lot1/a;", "Lxw/f;", "Lot1/a$a;", "Lnt1/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lpt1/a;", "Lmx/a;", "m", "(Lpt1/a;)Lmx/a;", "h", "c", "", "restrictionsCount", "l", "(I)Lmx/a;", "e", "params", "Lkotlin/Function0;", "Loq/i0;", "f", "(Lpt1/a;Lot1/a$a;)Ler/a;", "i", "q", "(Lot1/a$a;)Lnt1/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ot1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lot1/a$a;", "", "Lnt1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "restrictDrivingLicence", "undoDrivingLicenceRestriction", "back", "<init>", "(Lnt1/d;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnt1/d;", "c", "()Lnt1/d;", "b", "Ler/a;", "()Ler/a;", "d", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> restrictDrivingLicence;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> undoDrivingLicenceRestriction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> back;

        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = dVar;
            this.restrictDrivingLicence = aVar;
            this.undoDrivingLicenceRestriction = aVar2;
            this.back = aVar3;
        }

        public final er.a<i0> a() {
            return this.back;
        }

        public final er.a<i0> b() {
            return this.restrictDrivingLicence;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.undoDrivingLicenceRestriction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.restrictDrivingLicence, params.restrictDrivingLicence) && t.c(this.undoDrivingLicenceRestriction, params.undoDrivingLicenceRestriction) && t.c(this.back, params.back);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.restrictDrivingLicence.hashCode()) * 31) + this.undoDrivingLicenceRestriction.hashCode()) * 31) + this.back.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", restrictDrivingLicence=" + this.restrictDrivingLicence + ", undoDrivingLicenceRestriction=" + this.undoDrivingLicenceRestriction + ", back=" + this.back + ')';
        }
    }

    public a(c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label c(pt1.a aVar) {
        if (aVar instanceof pt1.a.AppAndBank) {
            return this.labelProvider.c(et1.a.F0);
        }
        if (aVar instanceof pt1.a.Bank) {
            return this.labelProvider.c(et1.a.E0);
        }
        return null;
    }

    private final Label e(pt1.a aVar) {
        return ((aVar instanceof pt1.a.App) || (aVar instanceof pt1.a.AppAndBank)) ? this.labelProvider.c(et1.a.B) : this.labelProvider.c(et1.a.f53438w);
    }

    private final er.a<i0> f(pt1.a aVar, Params params) {
        return ((aVar instanceof pt1.a.App) || (aVar instanceof pt1.a.AppAndBank)) ? params.d() : params.b();
    }

    private final Label h(pt1.a aVar) {
        if ((aVar instanceof pt1.a.App) || (aVar instanceof pt1.a.AppAndBank)) {
            return this.labelProvider.c(et1.a.f53430s);
        }
        if (aVar instanceof pt1.a.Bank) {
            return this.labelProvider.c(et1.a.f53420n);
        }
        if (aVar instanceof pt1.a.None) {
            return this.labelProvider.c(et1.a.f53434u);
        }
        throw new p();
    }

    private final Label i(pt1.a aVar) {
        return b.b(aVar.getDrivingLicence().getDocumentNumber(), "DrivingLicenceDocumentNumber");
    }

    private final Label l(int restrictionsCount) {
        Label labelC = this.labelProvider.c(et1.a.D0);
        Label.Companion companion = Label.INSTANCE;
        return labelC.o(companion.d()).o(b.b(String.valueOf(restrictionsCount), "restrictionPlacesCount")).o(companion.d()).o(restrictionsCount > 1 ? this.labelProvider.c(et1.a.f53397b0) : this.labelProvider.c(et1.a.f53399c0));
    }

    private final Label m(pt1.a aVar) {
        if (aVar instanceof pt1.a.App) {
            return this.labelProvider.c(et1.a.f53432t);
        }
        if (aVar instanceof pt1.a.Bank) {
            return this.labelProvider.c(et1.a.f53422o);
        }
        if (aVar instanceof pt1.a.AppAndBank) {
            return this.labelProvider.c(et1.a.f53432t);
        }
        if (aVar instanceof pt1.a.None) {
            return this.labelProvider.c(et1.a.f53436v);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        CardListData cardListData;
        BanksRestriction banksRestrictions;
        DefaultSingleCardData defaultSingleCardData;
        MObywatelRestriction mobywatelRestriction;
        LocalDate restrictedAt;
        d state = params.getState();
        if (t.c(state, nt1.c.f138319a)) {
            return e.a.b.f138323a;
        }
        if (!(state instanceof d.Initialized)) {
            if (t.c(state, d.b.f138321a)) {
                return new e.a.NoDrivingLicence(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53438w), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106835o2), this.labelProvider.c(et1.a.f53428r), null, null, null, null, false, 76, null));
            }
            if (state instanceof Error) {
                return new e.a.Error(((Error) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53438w), null, null, null, 28, null), null, null, null, null, 61, null);
        d.Initialized initialized = (d.Initialized) state;
        Label labelM = m(initialized.getDrivingLicenceRestriction());
        Label labelH = h(initialized.getDrivingLicenceRestriction());
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(et1.a.f53394a), null, null, 3, null), new n50.b.Title(l.b(i(initialized.getDrivingLicenceRestriction()), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
        DocumentRestrictions restrictions = initialized.getDrivingLicenceRestriction().getDrivingLicence().getRestrictions();
        DefaultSingleCardData defaultSingleCardData3 = (restrictions == null || restrictions.getMobywatelRestriction() == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(et1.a.B0), null, null, 3, null), new n50.b.Title(l.b(this.labelProvider.c(et1.a.C0), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106874u, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
        DocumentRestrictions restrictions2 = initialized.getDrivingLicenceRestriction().getDrivingLicence().getRestrictions();
        CardListData cardListData2 = new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, (restrictions2 == null || (mobywatelRestriction = restrictions2.getMobywatelRestriction()) == null || (restrictedAt = mobywatelRestriction.getRestrictedAt()) == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(et1.a.f53418m), null, null, 3, null), new n50.b.Title(l.b(b.b(this.dateFormatter.d(new fz.b.LocalDate(restrictedAt), fz.c.DOTTED), "DateOfRestriction"), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106759e, null, null, null, null, 30, null), 3, null), null, null, 3327, null)), null, false, null, null, 30, null);
        Label labelC = c(initialized.getDrivingLicenceRestriction());
        DocumentRestrictions restrictions3 = initialized.getDrivingLicenceRestriction().getDrivingLicence().getRestrictions();
        if (restrictions3 == null || (banksRestrictions = restrictions3.getBanksRestrictions()) == null) {
            cardListData = null;
        } else {
            Integer restrictionsCount = banksRestrictions.getRestrictionsCount();
            if (restrictionsCount != null) {
                defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(l(restrictionsCount.intValue()), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(et1.a.J0), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.X0, null, null, null, null, 30, null), 3, null), null, null, 3327, null);
            } else {
                defaultSingleCardData = null;
            }
            cardListData = new CardListData(v.r(defaultSingleCardData), null, false, null, null, 30, null);
        }
        return new e.a.Initialized(baseScaffoldData, labelM, labelH, cardListData2, labelC, cardListData, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(e(initialized.getDrivingLicenceRestriction()), null, 2, null), k30.d.a.f107773a, null, f(initialized.getDrivingLicenceRestriction(), params), 35, null), params.a());
    }
}
