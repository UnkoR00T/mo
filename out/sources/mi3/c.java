package mi3;

import androidx.compose.ui.graphics.Color;
import c20.d;
import er.l;
import er.p;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import sv0.g;
import sv0.s0;
import u60.PagingListData;
import u60.k;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lmi3/c;", "Lxw/f;", "Lmi3/c$a;", "Lli3/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lje3/b;", "localizationFormatter", "Lje3/c;", "vehicleCollisionStatementFormatter", "<init>", "(Lmx/c;Lez/e;Lje3/b;Lje3/c;)V", "Lyd3/c;", "params", "", "index", "Lni3/a$b$a;", "l", "(Lyd3/c;Lmi3/c$a;I)Lni3/a$b$a;", "Lsv0/g;", "Lr50/a$b;", "h", "(Lsv0/g;)Lr50/a$b;", "Lo40/a$a;", "f", "()Lo40/a$a;", "i", "(Lmi3/c$a;)Lli3/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lje3/b;", "d", "Lje3/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, li3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final je3.b localizationFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final je3.c vehicleCollisionStatementFormatter;

    /* JADX INFO: renamed from: mi3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Lmi3/c$a;", "", "Lli3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onNewStatementAction", "Lkotlin/Function1;", "Lsv0/g;", "onStatementClicked", "onLoad", "<init>", "(Lli3/b;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lli3/b;", "e", "()Lli3/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final li3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNewStatementAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<g, i0> onStatementClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLoad;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(li3.b bVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super g, i0> lVar, er.a<i0> aVar3) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onNewStatementAction = aVar2;
            this.onStatementClicked = lVar;
            this.onLoad = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onLoad;
        }

        public final er.a<i0> c() {
            return this.onNewStatementAction;
        }

        public final l<g, i0> d() {
            return this.onStatementClicked;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final li3.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onNewStatementAction, params.onNewStatementAction) && t.c(this.onStatementClicked, params.onStatementClicked) && t.c(this.onLoad, params.onLoad);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onNewStatementAction.hashCode()) * 31) + this.onStatementClicked.hashCode()) * 31) + this.onLoad.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onNewStatementAction=" + this.onNewStatementAction + ", onStatementClicked=" + this.onStatementClicked + ", onLoad=" + this.onLoad + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126711a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.StatementCreated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.StatementCreatedNotReported.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.ReportedToUfgToFillForm.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.ReportedToUfgFormFilled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.ReportedToUfg.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s0.StatementCreatingError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f126711a = iArr;
        }
    }

    /* JADX INFO: renamed from: mi3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3119c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3119c f126712a = new C3119c();

        C3119c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1864109956);
            if (p076m2.t.k()) {
                p076m2.t.o(-1864109956, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.statementlist.mapper.StatementListScreenMapper.getHeader.<anonymous> (StatementListScreenMapper.kt:260)");
            }
            long jA = ((ge3.a) rVar.N(ge3.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public c(mx.c cVar, e eVar, je3.b bVar, je3.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.localizationFormatter = bVar;
        this.vehicleCollisionStatementFormatter = cVar2;
    }

    private final o40.a.Icon f() {
        return new o40.a.Icon(jz.a.U3, null, C3119c.f126712a, this.labelProvider.c(md3.b.f125880z4), this.labelProvider.c(md3.b.A4), null, 34, null);
    }

    private final r50.a.WithIcon h(g gVar) {
        switch (b.f126711a[gVar.getCollisionStatus().ordinal()]) {
            case 1:
                return new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125780n0), null, 0, false, r50.g.POSITIVE, 29, null);
            case 2:
                return new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125808q4), null, 0, false, r50.g.INFORMATIVE, 29, null);
            case 3:
                return new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125784n4), null, 0, false, r50.g.INFORMATIVE, 29, null);
            case 4:
            case 5:
                return new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125776m4), null, 0, false, r50.g.POSITIVE, 29, null);
            case 6:
                return new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125780n0), null, 0, false, r50.g.INFORMATIVE, 29, null);
            default:
                Integer workingCopyValidityDaysLeft = gVar.getWorkingCopyValidityDaysLeft();
                if (workingCopyValidityDaysLeft == null) {
                    return new r50.a.WithIcon(null, this.labelProvider.c(md3.b.f125811r), null, 0, false, r50.g.NOTICE, 29, null);
                }
                int iIntValue = workingCopyValidityDaysLeft.intValue();
                mx.c cVar = this.labelProvider;
                return new r50.a.WithIcon(null, cVar.f(md3.b.f125768l4, cVar.a(d.f22741b, iIntValue, String.valueOf(iIntValue))), null, 0, false, r50.g.NOTICE, 29, null);
        }
    }

    private final ni3.a.StatementListByPaging.AbstractC3368a l(final yd3.c cVar, final Params params, int i15) {
        if (cVar instanceof yd3.c.C6075c) {
            return new ni3.a.StatementListByPaging.AbstractC3368a.Section(this.labelProvider.c(md3.b.f125792o4));
        }
        if (cVar instanceof yd3.c.GroupedHeader) {
            return new ni3.a.StatementListByPaging.AbstractC3368a.Section(mx.b.b(this.dateFormatter.b(((yd3.c.GroupedHeader) cVar).getDate()), "dynamicDate_" + cVar));
        }
        if (!(cVar instanceof yd3.c.PagingCollision)) {
            throw new oq.p();
        }
        yd3.c.PagingCollision pagingCollision = (yd3.c.PagingCollision) cVar;
        g collision = pagingCollision.getCollision();
        if (collision instanceof g.Started) {
            return new ni3.a.StatementListByPaging.AbstractC3368a.Item(new DefaultSingleCardData(null, new er.a() { // from class: mi3.a
                @Override // er.a
                public final Object a() {
                    return c.m(params, cVar);
                }
            }, false, null, null, false, null, new w0.StatusBadge(h(pagingCollision.getCollision())), new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(md3.b.X), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2685, null));
        }
        if (!(collision instanceof g.Grouped)) {
            throw new oq.p();
        }
        return new ni3.a.StatementListByPaging.AbstractC3368a.Item(new DefaultSingleCardData(null, new er.a() { // from class: mi3.b
            @Override // er.a
            public final Object a() {
                return c.q(params, cVar);
            }
        }, false, null, null, false, null, new w0.StatusBadge(h(pagingCollision.getCollision())), new BodySection(null, new n50.b.Title(new SingleCardLabel(this.vehicleCollisionStatementFormatter.b("StatementTitle_" + i15, ((g.Grouped) pagingCollision.getCollision()).getStatementNumber()), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), new BottomSection(new SingleCardLabel(mx.b.d(this.localizationFormatter.a(((g.Grouped) pagingCollision.getCollision()).getLocalizationDescription(), ((g.Grouped) pagingCollision.getCollision()).getCoordinates()), "localization_" + i15), null, null, 0, 0, null, 62, null), new SingleCardLabel(Label.INSTANCE.c(), null, null, 0, 0, null, 62, null)), 637, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, yd3.c cVar) {
        params.d().b(((yd3.c.PagingCollision) cVar).getCollision());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, yd3.c cVar) {
        params.d().b(((yd3.c.PagingCollision) cVar).getCollision());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public li3.c.a b(Params params) {
        li3.b state = params.getState();
        if (t.c(state, li3.b.a.f118361a)) {
            return li3.c.a.b.f118369a;
        }
        if (t.c(state, li3.b.d.f118366a)) {
            return li3.c.a.d.f118376a;
        }
        if (state instanceof li3.b.LoadingFirstPageError) {
            return new li3.c.a.Error(((li3.b.LoadingFirstPageError) state).getErrorVMS());
        }
        if (state instanceof li3.b.ListError) {
            return new li3.c.a.Error(((li3.b.ListError) state).getErrorVMS());
        }
        int i15 = 0;
        if (state instanceof li3.b.InterfaceC2878b.Empty) {
            return new li3.c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(md3.b.f125800p4), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), this.labelProvider.c(md3.b.f125800p4), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125727g3), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), new ni3.a.Empty(new EmptyStateData(null, this.labelProvider.c(md3.b.B4), null, 5, null), f()));
        }
        if (!(state instanceof li3.b.InterfaceC2878b.List)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(md3.b.f125800p4), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(md3.b.f125800p4);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125727g3), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null);
        Label labelC2 = this.labelProvider.c(md3.b.f125800p4);
        List listE = v.e(new ni3.a.StatementListByPaging.AbstractC3368a.Header(f()));
        List<yd3.c> listA = ((li3.b.InterfaceC2878b.List) params.getState()).getData().d().getPage().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(l((yd3.c) obj, params, i15));
            i15 = i16;
        }
        return new li3.c.a.Initialized(baseScaffoldData, aVarA, labelC, buttonData, new ni3.a.StatementListByPaging(labelC2, new PagingListData(v.L0(listE, arrayList), k.VERTICAL, 9, false, ((li3.b.InterfaceC2878b.List) params.getState()).getData().d() instanceof fy.c.Loading, false, ((li3.b.InterfaceC2878b.List) params.getState()).getData().d(), params.b(), 40, null)));
    }
}
