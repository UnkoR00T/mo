package oz1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.x0;
import nz1.Error;
import nz1.LoadingAvailableSupport;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageData;
import q40.j;
import un0.AvailableElectionSupport;
import un0.o;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Loz1/f;", "Lxw/f;", "Loz1/f$a;", "Lnz1/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lez/e;Lu04/a;)V", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "l", "(Ler/a;)Li50/a;", "params", "m", "(Loz1/f$a;)Lnz1/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lu04/a;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, nz1.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: oz1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b \u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Loz1/f$a;", "", "Lnz1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Lkotlin/Function1;", "Lun0/a;", "onElectionSupportClick", "onHistoryOfSupportClick", "onStateOfCommitteeSupportClick", "", "openUrlAction", "<init>", "(Lnz1/b;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnz1/b;", "f", "()Lnz1/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nz1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AvailableElectionSupport, i0> onElectionSupportClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHistoryOfSupportClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onStateOfCommitteeSupportClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrlAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(nz1.b bVar, er.a<i0> aVar, l<? super AvailableElectionSupport, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar2) {
            this.state = bVar;
            this.onCloseAction = aVar;
            this.onElectionSupportClick = lVar;
            this.onHistoryOfSupportClick = aVar2;
            this.onStateOfCommitteeSupportClick = aVar3;
            this.openUrlAction = lVar2;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        public final l<AvailableElectionSupport, i0> b() {
            return this.onElectionSupportClick;
        }

        public final er.a<i0> c() {
            return this.onHistoryOfSupportClick;
        }

        public final er.a<i0> d() {
            return this.onStateOfCommitteeSupportClick;
        }

        public final l<String, i0> e() {
            return this.openUrlAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onElectionSupportClick, params.onElectionSupportClick) && t.c(this.onHistoryOfSupportClick, params.onHistoryOfSupportClick) && t.c(this.onStateOfCommitteeSupportClick, params.onStateOfCommitteeSupportClick) && t.c(this.openUrlAction, params.openUrlAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final nz1.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onElectionSupportClick.hashCode()) * 31) + this.onHistoryOfSupportClick.hashCode()) * 31) + this.onStateOfCommitteeSupportClick.hashCode()) * 31) + this.openUrlAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onElectionSupportClick=" + this.onElectionSupportClick + ", onHistoryOfSupportClick=" + this.onHistoryOfSupportClick + ", onStateOfCommitteeSupportClick=" + this.onStateOfCommitteeSupportClick + ", openUrlAction=" + this.openUrlAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f150774a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-608754749);
            if (p076m2.t.k()) {
                p076m2.t.o(-608754749, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.mapper.ElectoralSupportMapper.invoke.<anonymous> (ElectoralSupportMapper.kt:94)");
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
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f150775a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1537811716);
            if (p076m2.t.k()) {
                p076m2.t.o(1537811716, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.mapper.ElectoralSupportMapper.invoke.<anonymous> (ElectoralSupportMapper.kt:95)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().d();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jD;
        }
    }

    public f(mx.c cVar, ez.e eVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.commonEndpoints = aVar;
    }

    private final BaseScaffoldData l(er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onCloseAction), this.labelProvider.c(fz1.a.A0), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, AvailableElectionSupport availableElectionSupport) {
        params.b().b(availableElectionSupport);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.c().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public nz1.f.a b(final Params params) {
        nz1.b state = params.getState();
        if ((state instanceof nz1.e) || (state instanceof LoadingAvailableSupport)) {
            return nz1.f.a.d.f139816a;
        }
        if (state instanceof Error) {
            return new nz1.f.a.Error(((Error) params.getState()).getErrorVMS());
        }
        if (state instanceof nz1.b.C3466b) {
            return new nz1.f.a.ServiceForAdults(l(new er.a() { // from class: oz1.a
                @Override // er.a
                public final Object a() {
                    return f.q(params);
                }
            }), new IconPageData(new j.a(jz.a.f106807k2), this.labelProvider.c(fz1.a.f68953i0), null, null, null, null, false, 76, null));
        }
        if (!(state instanceof nz1.b.Displayed)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldDataL = l(new er.a() { // from class: oz1.b
            @Override // er.a
            public final Object a() {
                return f.r(params);
            }
        });
        o40.a.Icon icon = new o40.a.Icon(jz.a.Z3, b.f150774a, c.f150775a, ((nz1.b.Displayed) params.getState()).getAvailableElectionSupports().getHasVotingRights() ? ((nz1.b.Displayed) params.getState()).getAvailableElectionSupports().b().isEmpty() ? this.labelProvider.c(fz1.a.Y) : this.labelProvider.c(fz1.a.f68956k) : this.labelProvider.c(fz1.a.f68937a0), ((nz1.b.Displayed) params.getState()).getAvailableElectionSupports().getHasVotingRights() ? ((nz1.b.Displayed) params.getState()).getAvailableElectionSupports().b().isEmpty() ? this.labelProvider.c(fz1.a.X) : this.labelProvider.c(fz1.a.f68954j) : this.labelProvider.c(fz1.a.Z), null, 32, null);
        Label labelC = this.labelProvider.c(fz1.a.f68972s);
        List<AvailableElectionSupport> listB = ((nz1.b.Displayed) params.getState()).getAvailableElectionSupports().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        for (final AvailableElectionSupport availableElectionSupport : listB) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: oz1.c
                @Override // er.a
                public final Object a() {
                    return f.s(params, availableElectionSupport);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(availableElectionSupport.getElectionActionName(), "electionActionName"), j70.a.NORMAL, null, 2, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), new BottomSection(n50.l.b(this.labelProvider.c(fz1.a.f68970r), null, null, 3, null), n50.l.b(mx.b.b(this.dateFormatter.d(new fz.b.String(availableElectionSupport.getSupportDeadline(), fz.c.ZONED_DATE_TIME_SEC, false, 4, null), fz.c.FULL_MONTH_DATE_TIME_COMMA), "supportDeadline"), null, null, 3, null)), 765, null));
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        if (cardListData.d().isEmpty()) {
            cardListData = null;
        }
        BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(fz1.a.f68959l0), null, null, 3, null)), null, 5, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new nz1.f.a.Displayed(baseScaffoldDataL, icon, labelC, cardListData, ((nz1.b.Displayed) params.getState()).getProfileAccess().b().contains(o.RESULTS) ? new DefaultSingleCardData(null, new er.a() { // from class: oz1.d
            @Override // er.a
            public final Object a() {
                return f.u(params);
            }
        }, false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null) : null, ((nz1.b.Displayed) params.getState()).getProfileAccess().b().contains(o.HISTORY_OF_SUPPORT) ? new DefaultSingleCardData(null, new er.a() { // from class: oz1.e
            @Override // er.a
            public final Object a() {
                return f.v(params);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(fz1.a.P), null, null, 3, null)), null, 5, null), null, companion.b(), null, 2813, null) : null, this.labelProvider.c(fz1.a.W), new LinkData(null, this.labelProvider.c(fz1.a.f68944e), this.commonEndpoints.l0(), LinkData.EnumC5775a.WEBSITE, false, params.e(), 17, null));
    }
}
