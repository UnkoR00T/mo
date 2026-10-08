package ot2;

import androidx.compose.ui.graphics.Color;
import er.p;
import ez.e;
import ez.h;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.time.OffsetDateTime;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import pt2.PeselRestrictionData;
import q40.IconPageData;
import q40.j;
import ts0.PlanedRestriction;
import ts0.Restriction;
import ts0.RestrictionCheckSummary;
import ts0.RestrictionLock;
import ts0.RestrictionStatusChangeSummary;
import ts0.l;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u0004\u0018\u00010\r*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020\u0018*\u00020(2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lot2/c;", "Lxw/f;", "Lot2/c$a;", "Lnt2/d$a;", "Lmx/c;", "labelProvider", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/h;Lez/e;)V", "Lnt2/c$b;", "Lmx/a;", "s", "(Lnt2/c$b;)Lmx/a;", "r", "Lts0/e;", "Lkotlin/Function0;", "Loq/i0;", "onCancelClick", "Lc30/b$d;", "i", "(Lts0/e;Ler/a;)Lc30/b$d;", "", "f", "(Lts0/e;)Ljava/lang/String;", "Lts0/f;", "onSwitchStateChanged", "Ln50/g;", "l", "(Lts0/f;Ler/a;)Ln50/g;", "q", "(Lts0/f;)Lmx/a;", "Lts0/i;", "u", "(Lts0/i;)Lmx/a;", "Lts0/n;", "h", "(Lts0/n;)Lmx/a;", "Ljava/time/OffsetDateTime;", "Lfz/c;", "formatType", "e", "(Ljava/time/OffsetDateTime;Lfz/c;)Ljava/lang/String;", "params", "v", "(Lot2/c$a;)Lnt2/d$a;", "a", "Lmx/c;", "b", "Lez/h;", "c", "Lez/e;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, nt2.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: ot2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b&\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lot2/c$a;", "", "Lnt2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "close", "cancelPlannedRestriction", "changeRestrictionStatus", "hideSnackBar", "toMoreInfo", "checksHistory", "statusChangesHistory", "onRefresh", "<init>", "(Lnt2/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnt2/c;", "g", "()Lnt2/c;", "b", "Ler/a;", "d", "()Ler/a;", "c", "e", "f", "i", "h", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nt2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> cancelPlannedRestriction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> changeRestrictionStatus;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBar;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toMoreInfo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> checksHistory;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> statusChangesHistory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRefresh;

        public Params(nt2.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, er.a<i0> aVar8) {
            this.state = cVar;
            this.close = aVar;
            this.cancelPlannedRestriction = aVar2;
            this.changeRestrictionStatus = aVar3;
            this.hideSnackBar = aVar4;
            this.toMoreInfo = aVar5;
            this.checksHistory = aVar6;
            this.statusChangesHistory = aVar7;
            this.onRefresh = aVar8;
        }

        public final er.a<i0> a() {
            return this.cancelPlannedRestriction;
        }

        public final er.a<i0> b() {
            return this.changeRestrictionStatus;
        }

        public final er.a<i0> c() {
            return this.checksHistory;
        }

        public final er.a<i0> d() {
            return this.close;
        }

        public final er.a<i0> e() {
            return this.hideSnackBar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.close, params.close) && t.c(this.cancelPlannedRestriction, params.cancelPlannedRestriction) && t.c(this.changeRestrictionStatus, params.changeRestrictionStatus) && t.c(this.hideSnackBar, params.hideSnackBar) && t.c(this.toMoreInfo, params.toMoreInfo) && t.c(this.checksHistory, params.checksHistory) && t.c(this.statusChangesHistory, params.statusChangesHistory) && t.c(this.onRefresh, params.onRefresh);
        }

        public final er.a<i0> f() {
            return this.onRefresh;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final nt2.c getState() {
            return this.state;
        }

        public final er.a<i0> h() {
            return this.statusChangesHistory;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.close.hashCode()) * 31) + this.cancelPlannedRestriction.hashCode()) * 31) + this.changeRestrictionStatus.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31) + this.toMoreInfo.hashCode()) * 31) + this.checksHistory.hashCode()) * 31) + this.statusChangesHistory.hashCode()) * 31) + this.onRefresh.hashCode();
        }

        public final er.a<i0> i() {
            return this.toMoreInfo;
        }

        public String toString() {
            return "Params(state=" + this.state + ", close=" + this.close + ", cancelPlannedRestriction=" + this.cancelPlannedRestriction + ", changeRestrictionStatus=" + this.changeRestrictionStatus + ", hideSnackBar=" + this.hideSnackBar + ", toMoreInfo=" + this.toMoreInfo + ", checksHistory=" + this.checksHistory + ", statusChangesHistory=" + this.statusChangesHistory + ", onRefresh=" + this.onRefresh + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f150017a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-185192184);
            if (p076m2.t.k()) {
                p076m2.t.o(-185192184, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.mapper.PeselRestrictionStatusMapper.invoke.<anonymous> (PeselRestrictionStatusMapper.kt:77)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: renamed from: ot2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3693c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3693c f150018a = new C3693c();

        C3693c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1269461229);
            if (p076m2.t.k()) {
                p076m2.t.o(1269461229, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.mapper.PeselRestrictionStatusMapper.invoke.<anonymous> (PeselRestrictionStatusMapper.kt:87)");
            }
            long jA = ((xs2.a) rVar.N(xs2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public c(mx.c cVar, h hVar, e eVar) {
        this.labelProvider = cVar;
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
    }

    private final String e(OffsetDateTime offsetDateTime, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), cVar);
    }

    private final String f(PlanedRestriction planedRestriction) {
        h hVar = this.timeProvider;
        fz.f fVar = fz.f.POLISH;
        return hVar.a(fVar) ? e(planedRestriction.getDateFrom(), fz.c.DOTTED_PLUS_HOUR) : this.labelProvider.e(rs2.a.f175908l, e(this.timeProvider.b(planedRestriction.getDateFrom(), fVar), fz.c.DOTTED_PLUS_HOUR)).getText();
    }

    private final Label h(RestrictionStatusChangeSummary restrictionStatusChangeSummary) {
        if (restrictionStatusChangeSummary != null) {
            return this.labelProvider.e(rs2.a.X, e(restrictionStatusChangeSummary.getChangeDate(), fz.c.DOTTED));
        }
        return null;
    }

    private final c30.b.d i(PlanedRestriction planedRestriction, er.a<i0> aVar) {
        if (planedRestriction != null) {
            return new c30.b.d(null, null, this.labelProvider.c(rs2.a.f175909l0), this.labelProvider.e(rs2.a.f175905j0, f(planedRestriction)), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(rs2.a.f175907k0), null, null, aVar, 13, null)), 51, null);
        }
        return null;
    }

    private final DefaultSingleCardData l(Restriction restriction, final er.a<i0> aVar) {
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(rs2.a.f175917p0), null, null, 0, 0, null, 62, null)), null, 5, null);
        boolean z15 = restriction.getStatus() == l.RESTRICTED;
        l status = restriction.getStatus();
        l lVar = l.UNRESTRICTED;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, restriction.getStatus() != lVar || restriction.getRestrictionLock() == null, null, null, false, null, null, bodySection, null, new x0.Switch(new s50.a.C4550a(null, z15, status != lVar || restriction.getRestrictionLock() == null, new er.l() { // from class: ot2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.m(aVar, ((Boolean) obj).booleanValue());
            }
        }, null, null, null, false, 225, null)), null, 2811, null);
        if (restriction.getPlannedRestriction() == null) {
            return defaultSingleCardData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(er.a aVar, boolean z15) {
        aVar.a();
        return i0.f148189a;
    }

    private final Label q(Restriction restriction) {
        RestrictionLock restrictionLock;
        OffsetDateTime dateTo;
        if (restriction.getStatus() == l.RESTRICTED) {
            return this.labelProvider.c(rs2.a.C);
        }
        if (restriction.getPlannedRestriction() != null || (restrictionLock = restriction.getRestrictionLock()) == null || (dateTo = restrictionLock.getDateTo()) == null) {
            return null;
        }
        h hVar = this.timeProvider;
        fz.f fVar = fz.f.POLISH;
        OffsetDateTime offsetDateTimeB = hVar.b(dateTo, fVar);
        if (dateTo.getDayOfYear() == OffsetDateTime.now().getDayOfYear()) {
            return this.labelProvider.e(this.timeProvider.a(fVar) ? rs2.a.f175901h0 : rs2.a.f175903i0, e(offsetDateTimeB, fz.c.WITH_SECONDS));
        }
        return this.labelProvider.e(this.timeProvider.a(fVar) ? rs2.a.f175897f0 : rs2.a.f175899g0, e(offsetDateTimeB, fz.c.DOTTED), e(offsetDateTimeB, fz.c.WITH_SECONDS));
    }

    private final Label r(nt2.c.b bVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (bVar instanceof nt2.c.b.Restricted) {
            i15 = rs2.a.f175913n0;
        } else {
            if (!(bVar instanceof nt2.c.b.Unrestricted)) {
                throw new oq.p();
            }
            i15 = rs2.a.B0;
        }
        return cVar.c(i15);
    }

    private final Label s(nt2.c.b bVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (bVar instanceof nt2.c.b.Restricted) {
            i15 = rs2.a.f175915o0;
        } else {
            if (!(bVar instanceof nt2.c.b.Unrestricted)) {
                throw new oq.p();
            }
            i15 = rs2.a.C0;
        }
        return cVar.c(i15);
    }

    private final Label u(RestrictionCheckSummary restrictionCheckSummary) {
        if (restrictionCheckSummary != null) {
            return this.labelProvider.e(rs2.a.Y, e(restrictionCheckSummary.getVerifiedAt(), fz.c.DOTTED));
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public nt2.d.a b(Params params) {
        nt2.c state = params.getState();
        if (state instanceof nt2.c.Initial) {
            return new nt2.d.a.Initial(((nt2.c.Initial) state).getDialog());
        }
        if (!(state instanceof nt2.c.b)) {
            if (t.c(state, nt2.c.C3421c.f138430a)) {
                return new nt2.d.a.Underage(new IconPageData(new j.a(jz.a.f106770f2), this.labelProvider.c(rs2.a.f175920r), null, null, null, null, false, 76, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(rs2.a.f175918q), null, 2, null), k30.d.a.f107773a, null, params.i(), 35, null), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(rs2.a.f175917p0), null, null, null, 28, null), null, null, null, null, 61, null));
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(rs2.a.f175917p0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, b.f150017a, null, params.i(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        nt2.c.b bVar = (nt2.c.b) state;
        o40.a.Icon icon = new o40.a.Icon(jz.a.L3, null, C3693c.f150018a, s(bVar), r(bVar), null, 34, null);
        Label labelQ = q(bVar.getRestriction());
        c30.b.d dVarI = i(bVar.getRestriction().getPlannedRestriction(), params.a());
        Label labelC = this.labelProvider.c(rs2.a.f175898g);
        DefaultSingleCardData defaultSingleCardDataL = l(bVar.getRestriction(), params.b());
        Label labelC2 = this.labelProvider.c(rs2.a.f175898g);
        n50.b.Title title = new n50.b.Title(n50.l.b(this.labelProvider.c(rs2.a.f175895e0), null, null, 3, null));
        Label labelU = u(bVar.getRestriction().getLatestRestrictionCheck());
        BodySection bodySection = new BodySection(null, title, labelU != null ? n50.l.b(labelU, null, null, 3, null) : null, 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null);
        n50.b.Title title2 = new n50.b.Title(n50.l.b(this.labelProvider.c(rs2.a.P), null, null, 3, null));
        Label labelH = h(bVar.getRestriction().getLatestRestrictionStatusChange());
        return new nt2.d.a.Initialized(baseScaffoldData, icon, new PeselRestrictionData(labelQ, dVarI, defaultSingleCardDataL, labelC2, new CardListData(v.q(defaultSingleCardData, new DefaultSingleCardData(null, params.h(), false, null, null, false, null, null, new BodySection(null, title2, labelH != null ? n50.l.b(labelH, null, null, 3, null) : null, 1, null), null, companion.b(), null, 2813, null)), null, false, null, null, 30, null), labelC), bVar.getIsRefreshing(), params.d(), params.f(), params.e(), bVar.getDialog());
    }
}
