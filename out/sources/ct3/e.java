package ct3;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import cj0.ZusEVisitDetails;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r50.g;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJg\u0010\u0014\u001a\u00020\u0013*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b%\u0010#J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lct3/e;", "Lxw/f;", "Lct3/e$a;", "Lbt3/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lbt3/c$c;", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "showInfo", "addToCalendar", "shareVisitLink", "cancelVisit", "showJoinVisitDialog", "Lbt3/d$a$b;", "z", "(Lbt3/c$c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)Lbt3/d$a$b;", "Lbt3/c$a;", "showRedoVisitDialog", "Lbt3/d$a$a;", "x", "(Lbt3/c$a;Ler/a;Ler/a;)Lbt3/d$a$a;", "Lcj0/i$a;", "status", "Lr50/a$b;", "r", "(Lcj0/i$a;)Lr50/a$b;", "redoVisit", "Lcb4/d;", "m", "(Ler/a;)Lcb4/d;", "joinVisit", "i", "params", "s", "(Lct3/e$a;)Lbt3/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, bt3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ct3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b \u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b&\u0010#R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lct3/e$a;", "", "Lbt3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "showInfo", "addToCalendar", "shareVisitLink", "cancelVisit", "joinVisit", "redoVisit", "Lkotlin/Function1;", "Lcb4/d;", "showNavigationDialog", "<init>", "(Lbt3/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbt3/c;", "i", "()Lbt3/c;", "b", "Ler/a;", "d", "()Ler/a;", "c", "g", "e", "f", "h", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bt3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showInfo;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addToCalendar;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> shareVisitLink;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> cancelVisit;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> joinVisit;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> redoVisit;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DialogData, i0> showNavigationDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(bt3.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, l<? super DialogData, i0> lVar) {
            this.state = cVar;
            this.onBackPressed = aVar;
            this.showInfo = aVar2;
            this.addToCalendar = aVar3;
            this.shareVisitLink = aVar4;
            this.cancelVisit = aVar5;
            this.joinVisit = aVar6;
            this.redoVisit = aVar7;
            this.showNavigationDialog = lVar;
        }

        public final er.a<i0> a() {
            return this.addToCalendar;
        }

        public final er.a<i0> b() {
            return this.cancelVisit;
        }

        public final er.a<i0> c() {
            return this.joinVisit;
        }

        public final er.a<i0> d() {
            return this.onBackPressed;
        }

        public final er.a<i0> e() {
            return this.redoVisit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.showInfo, params.showInfo) && t.c(this.addToCalendar, params.addToCalendar) && t.c(this.shareVisitLink, params.shareVisitLink) && t.c(this.cancelVisit, params.cancelVisit) && t.c(this.joinVisit, params.joinVisit) && t.c(this.redoVisit, params.redoVisit) && t.c(this.showNavigationDialog, params.showNavigationDialog);
        }

        public final er.a<i0> f() {
            return this.shareVisitLink;
        }

        public final er.a<i0> g() {
            return this.showInfo;
        }

        public final l<DialogData, i0> h() {
            return this.showNavigationDialog;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackPressed.hashCode()) * 31) + this.showInfo.hashCode()) * 31) + this.addToCalendar.hashCode()) * 31) + this.shareVisitLink.hashCode()) * 31) + this.cancelVisit.hashCode()) * 31) + this.joinVisit.hashCode()) * 31) + this.redoVisit.hashCode()) * 31) + this.showNavigationDialog.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final bt3.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackPressed=" + this.onBackPressed + ", showInfo=" + this.showInfo + ", addToCalendar=" + this.addToCalendar + ", shareVisitLink=" + this.shareVisitLink + ", cancelVisit=" + this.cancelVisit + ", joinVisit=" + this.joinVisit + ", redoVisit=" + this.redoVisit + ", showNavigationDialog=" + this.showNavigationDialog + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37865a;

        static {
            int[] iArr = new int[ZusEVisitDetails.a.values().length];
            try {
                iArr[ZusEVisitDetails.a.PLANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZusEVisitDetails.a.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZusEVisitDetails.a.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZusEVisitDetails.a.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZusEVisitDetails.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f37865a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f37866a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-985580027);
            if (p076m2.t.k()) {
                p076m2.t.o(-985580027, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.mapper.VisitDetailsScreenMapper.map.<anonymous> (VisitDetailsScreenMapper.kt:200)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f37867a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-654989743);
            if (p076m2.t.k()) {
                p076m2.t.o(-654989743, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.mapper.VisitDetailsScreenMapper.map.<anonymous> (VisitDetailsScreenMapper.kt:209)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    /* JADX INFO: renamed from: ct3.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0804e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0804e f37868a = new C0804e();

        C0804e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1435952888);
            if (p076m2.t.k()) {
                p076m2.t.o(1435952888, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.mapper.VisitDetailsScreenMapper.map.<anonymous> (VisitDetailsScreenMapper.kt:297)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public e(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final DialogData i(er.a<i0> joinVisit) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(ir3.a.f96839y0), this.labelProvider.c(ir3.a.f96836x0), new DialogButtonTextData(this.labelProvider.c(ir3.a.f96832w), null, joinVisit, 2, null), new DialogButtonTextData(this.labelProvider.c(ir3.a.f96775d), null, new er.a() { // from class: ct3.a
            @Override // er.a
            public final Object a() {
                return e.l();
            }
        }, 2, null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    private final DialogData m(er.a<i0> redoVisit) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(ir3.a.A0), null, new DialogButtonTextData(this.labelProvider.c(ir3.a.f96769b), null, redoVisit, 2, null), new DialogButtonTextData(this.labelProvider.c(ir3.a.f96787h), null, new er.a() { // from class: ct3.b
            @Override // er.a
            public final Object a() {
                return e.q();
            }
        }, 2, null), null, null, 100, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    private final r50.a.WithIcon r(ZusEVisitDetails.a status) {
        int i15 = b.f37865a[status.ordinal()];
        if (i15 == 1) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.f96772c), null, 0, false, g.POSITIVE, 13, null);
        }
        if (i15 == 2) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.A), null, 0, false, g.NOTICE, 13, null);
        }
        if (i15 == 3) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.f96778e), null, 0, false, g.NEGATIVE, 13, null);
        }
        if (i15 == 4) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.f96814q), null, 0, false, g.POSITIVE, 13, null);
        }
        if (i15 == 5) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.J), null, 0, false, g.MINUS, 13, null);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, e eVar) {
        params.h().b(eVar.i(params.c()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, e eVar) {
        params.h().b(eVar.m(params.e()));
        return i0.f148189a;
    }

    private final bt3.d.a.DisplayedFinished x(bt3.c.Finished finished, er.a<i0> aVar, er.a<i0> aVar2) {
        Label labelC = this.labelProvider.c(ir3.a.C0);
        Label labelD = mx.b.d(finished.getDetails().getTopicDescription(), "topicValueTag");
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.F), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(r(finished.getDetails().getStatus())), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96790i), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(ez.d.j(finished.getDetails().getVisitDate()), fz.c.DOTTED), "dateValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96823t), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(ez.d.j(finished.getDetails().getVisitDate()), fz.c.ONLY_HOUR), "timeValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.f96831v1), null, null, 0, 0, null, 62, null);
        String departmentDescription = finished.getDetails().getDepartmentDescription();
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(departmentDescription != null ? ir3.b.a(departmentDescription) : null, "departmentValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.f96842z0), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106735b, null, C0804e.f37868a, null, null, 26, null), 3, null), null, null, 3325, null);
        if (!finished.getBookingAvailable()) {
            defaultSingleCardData4 = null;
        }
        return new bt3.d.a.DisplayedFinished(labelC, aVar2, labelD, cardListData, defaultSingleCardData4, aVar2);
    }

    private final bt3.d.a.DisplayedPlanned z(bt3.c.Planned planned, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), this.labelProvider.c(ir3.a.C0), null, null, null, 28, null), null, null, null, null, 61, null);
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(ir3.a.Y), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(ir3.a.f96808o), null, null, aVar2, 13, null)), 55, null);
        Label labelD = mx.b.d(planned.getDetails().getTopicDescription(), "topicDescriptionValueTag");
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.F), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(r(planned.getDetails().getStatus())), null, 4, null), null, null, null, 3839, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96790i), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(ez.d.j(planned.getDetails().getVisitDate()), fz.c.DOTTED), "dateValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar7 = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(ir3.a.f96766a), null, 2, null), aVar7, null, aVar3, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96823t), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(ez.d.j(planned.getDetails().getVisitDate()), fz.c.ONLY_HOUR), "timeValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.f96831v1), null, null, 0, 0, null, 62, null);
        String departmentDescription = planned.getDetails().getDepartmentDescription();
        return new bt3.d.a.DisplayedPlanned(baseScaffoldData, cVar, labelD, new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(departmentDescription != null ? ir3.b.a(departmentDescription) : null, "departmentValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), new DefaultSingleCardData(null, aVar4, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.B0), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106744c0, null, null, null, null, 30, null), 3, null), null, null, 3325, null), new DefaultSingleCardData(null, aVar5, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.f96830v0), null, d.f37867a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106804k, null, c.f37866a, null, null, 26, null), 3, null), null, null, 3325, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ir3.a.f96833w0), null, 2, null), aVar7, null, aVar6, 35, null), aVar);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public bt3.d.a b(final Params params) {
        bt3.c state = params.getState();
        if (state instanceof bt3.c.Planned) {
            return z((bt3.c.Planned) params.getState(), params.d(), params.g(), params.a(), params.f(), params.b(), new er.a() { // from class: ct3.c
                @Override // er.a
                public final Object a() {
                    return e.u(params, this);
                }
            });
        }
        return state instanceof bt3.c.Finished ? x((bt3.c.Finished) params.getState(), new er.a() { // from class: ct3.d
            @Override // er.a
            public final Object a() {
                return e.v(params, this);
            }
        }, params.d()) : bt3.d.a.c.f21601a;
    }
}
