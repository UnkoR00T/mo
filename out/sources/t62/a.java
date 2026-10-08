package t62;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import ou0.Ticket;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r50.g;
import s62.State;
import s62.d;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)¨\u0006*"}, d2 = {"Lt62/a;", "Lxw/f;", "Lt62/a$a;", "Ls62/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Lez/e;Ldz/a;)V", "Lou0/a;", "paymentStatus", "Lou0/b;", "ticket", "Ln30/b;", "f", "(Lou0/a;Lou0/b;)Ln30/b;", "Lou0/c;", "", "h", "(Lou0/c;)I", "", "issuer", "Lmx/a;", "c", "(Ljava/lang/String;)Lmx/a;", "numberAndSeries", "e", "", "isInExecution", "l", "(Z)I", "params", "i", "(Lt62/a$a;)Ls62/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "Ldz/a;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: t62.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lt62/a$a;", "", "Ls62/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "toFaq", "Lkotlin/Function1;", "", "onUrlClick", "<init>", "(Ls62/c;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls62/c;", "c", "()Ls62/c;", "b", "Ler/a;", "()Ler/a;", "d", "Ler/l;", "()Ler/l;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toFaq;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar) {
            this.state = state;
            this.onClose = aVar;
            this.toFaq = aVar2;
            this.onUrlClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final l<String, i0> b() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.toFaq;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.toFaq, params.toFaq) && t.c(this.onUrlClick, params.onUrlClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.toFaq.hashCode()) * 31) + this.onUrlClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", toFaq=" + this.toFaq + ", onUrlClick=" + this.onUrlClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f188009b;

        static {
            int[] iArr = new int[ou0.a.values().length];
            try {
                iArr[ou0.a.NOT_PAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ou0.a.PAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f188008a = iArr;
            int[] iArr2 = new int[ou0.c.values().length];
            try {
                iArr2[ou0.c.CREDITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ou0.c.IN_ABSENTIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ou0.c.PAID_BY_TERMINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ou0.c.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f188009b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f188010a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2107308090);
            if (p076m2.t.k()) {
                p076m2.t.o(-2107308090, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.details.mapper.TicketDetailsMapper.invoke.<anonymous> (TicketDetailsMapper.kt:75)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar, e eVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.currencyFormatter = aVar;
    }

    private final Label c(String issuer) {
        return (issuer == null || issuer.length() == 0) ? this.labelProvider.c(o62.a.f142768y) : mx.b.b(issuer, "issuer");
    }

    private final Label e(String numberAndSeries) {
        Label labelB;
        return (numberAndSeries == null || (labelB = mx.b.b(numberAndSeries, "numberAndSeries")) == null) ? this.labelProvider.c(o62.a.f142762s) : labelB;
    }

    private final CardListData f(ou0.a paymentStatus, Ticket ticket) {
        Label labelC;
        g gVar;
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(o62.a.f142747d), null, null, 3, null);
        int[] iArr = b.f188008a;
        int i15 = iArr[paymentStatus.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(o62.a.f142769z);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(o62.a.f142764u);
        }
        Label label = labelC;
        int i16 = iArr[paymentStatus.ordinal()];
        if (i16 == 1) {
            gVar = g.NEGATIVE;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            gVar = g.POSITIVE;
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.StatusBadge(new r50.a.WithIcon(null, label, null, 0, false, gVar, 13, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142755l), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.currencyFormatter.b(ticket.getAmountToPay(), "PLN"), "amountToPay"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        if (paymentStatus != ou0.a.NOT_PAID) {
            defaultSingleCardData2 = null;
        }
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142754k), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.currencyFormatter.b(ticket.getAmount(), "PLN"), "amountDetails"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142760q), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(ticket.getIssueDate()), fz.c.DOTTED), "issueDate"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142765v), null, null, 3, null), new n50.b.Title(n50.l.b(e(ticket.getNumberAndSeries()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142761r), null, null, 3, null), new n50.b.Title(n50.l.b(c(ticket.getIssuer()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142767x), null, null, 3, null), new n50.b.Title(n50.l.b(this.labelProvider.c(h(ticket.getTicketType())), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(o62.a.f142757n), null, null, 3, null), new n50.b.Title(n50.l.b(this.labelProvider.c(l(ticket.getInExecution())), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    private final int h(ou0.c cVar) {
        int i15 = b.f188009b[cVar.ordinal()];
        if (i15 == 1) {
            return o62.a.f142756m;
        }
        if (i15 == 2) {
            return o62.a.f142759p;
        }
        if (i15 == 3) {
            return o62.a.f142763t;
        }
        if (i15 == 4) {
            return o62.a.f142768y;
        }
        throw new oq.p();
    }

    private final int l(boolean isInExecution) {
        return isInExecution ? o62.a.f142748e : o62.a.f142746c;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        Label labelC;
        String numberAndSeries = params.getState().getTicket().getNumberAndSeries();
        if (numberAndSeries == null || (labelC = this.labelProvider.e(o62.a.f142758o, numberAndSeries)) == null) {
            labelC = this.labelProvider.c(o62.a.f142745b0);
        }
        CardListData cardListDataF = f(params.getState().getPaymentStatus(), params.getState().getTicket());
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(o62.a.B), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(o62.a.A), "https://urzadskarbowy.gov.pl/tickets ", LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null)), 55, null);
        if (params.getState().getPaymentStatus() != ou0.a.NOT_PAID) {
            cVar = null;
        }
        return new d.Data(labelC, cardListDataF, cVar, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(o62.a.f142766w), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, c.f188010a, null, params.d(), 4, null)), null, 20, null), null, null, null, null, 61, null));
    }
}
