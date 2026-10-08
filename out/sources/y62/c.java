package y62;

import a14.i;
import er.p;
import er.q;
import ja.n0;
import ja.u0;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import oq.u;
import ou0.Ticket;
import p071kotlin.Metadata;
import r50.g;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\"*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010&\u001a\u00020%H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Ly62/c;", "Ly62/a;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(Lmx/c;Ldz/a;La14/i;)V", "Lou0/b;", "Lou0/a;", "paymentStatus", "Lkotlin/Function2;", "Loq/i0;", "navigateToDetails", "Lz62/a$a;", "h", "(Lou0/b;Lou0/a;Ler/p;)Lz62/a$a;", "", "ticketNumber", "Lmx/a;", "s", "(Ljava/lang/String;)Lmx/a;", "r", "()Lmx/a;", "Lr50/a$b;", "v", "(Lou0/a;)Lr50/a$b;", "m", "(Lou0/a;)Lmx/a;", "ticket", "q", "(Lou0/b;Lou0/a;)Lmx/a;", "Ljava/math/BigDecimal;", "l", "(Lou0/b;Lou0/a;)Ljava/math/BigDecimal;", "Ly62/a$a;", "params", "Lja/n0;", "Lz62/a;", "u", "(Ly62/a$a;)Lja/n0;", "a", "Lmx/c;", "b", "Ldz/a;", "c", "La14/i;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements y62.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224645a;

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
            f224645a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou0/b;", "ticket", "Lz62/a$a;", "<anonymous>", "(Lou0/b;)Lz62/a$a;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<Ticket, e<? super z62.a.C6275a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224647f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y62.a.Params f224649h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y62.a.Params params, e<? super b> eVar) {
            super(2, eVar);
            this.f224649h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Ticket ticket = (Ticket) this.f224647f;
            uq.b.e();
            if (this.f224646e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c.this.h(ticket, this.f224649h.getPaymentStatus(), this.f224649h.a());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Ticket ticket, e<? super z62.a.C6275a> eVar) {
            return ((b) v(ticket, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = c.this.new b(this.f224649h, eVar);
            bVar.f224647f = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: y62.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz62/a$a;", "before", "after", "Lz62/a;", "<anonymous>", "(Lz62/a$a;Lz62/a$a;)Lz62/a;"}, k = 3, mv = {2, 2, 0})
    static final class C6020c extends k implements q<z62.a.C6275a, z62.a.C6275a, e<? super z62.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224652g;

        C6020c(e<? super C6020c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OffsetDateTime itemDate;
            z62.a.C6275a c6275a = (z62.a.C6275a) this.f224651f;
            z62.a.C6275a c6275a2 = (z62.a.C6275a) this.f224652g;
            uq.b.e();
            if (this.f224650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (c6275a2 != null && (itemDate = c6275a2.getItemDate()) != null) {
                if (ez.d.a(itemDate, c6275a != null ? c6275a.getItemDate() : null)) {
                    itemDate = null;
                }
                if (itemDate != null) {
                    return new z62.a.b(c.this.formatHeaderDatesWithDaysUseCase.a(new i.Params(itemDate, null, 2, null)));
                }
            }
            return null;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z62.a.C6275a c6275a, z62.a.C6275a c6275a2, e<? super z62.a> eVar) {
            C6020c c6020c = c.this.new C6020c(eVar);
            c6020c.f224651f = c6275a;
            c6020c.f224652g = c6275a2;
            return c6020c.J(i0.f148189a);
        }
    }

    public c(mx.c cVar, dz.a aVar, i iVar) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z62.a.C6275a h(final Ticket ticket, final ou0.a aVar, final p<? super ou0.a, ? super Ticket, i0> pVar) {
        Label labelR;
        w0.StatusBadge statusBadge = new w0.StatusBadge(v(aVar));
        String numberAndSeries = ticket.getNumberAndSeries();
        if (numberAndSeries == null || (labelR = s(numberAndSeries)) == null) {
            labelR = r();
        }
        return new z62.a.C6275a(new DefaultSingleCardData(null, new er.a() { // from class: y62.b
            @Override // er.a
            public final Object a() {
                return c.i(pVar, aVar, ticket);
            }
        }, false, null, null, false, null, statusBadge, new BodySection(null, new n50.b.Title(new SingleCardLabel(labelR, null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), new BottomSection(new SingleCardLabel(m(aVar), null, null, 0, 0, null, 62, null), new SingleCardLabel(q(ticket, aVar), null, null, 0, 0, null, 62, null)), 637, null), ticket.getIssueDate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(p pVar, ou0.a aVar, Ticket ticket) {
        pVar.B(aVar, ticket);
        return i0.f148189a;
    }

    private final BigDecimal l(Ticket ticket, ou0.a aVar) {
        int i15 = a.f224645a[aVar.ordinal()];
        if (i15 == 1) {
            return ticket.getAmountToPay();
        }
        if (i15 == 2) {
            return ticket.getAmount();
        }
        throw new oq.p();
    }

    private final Label m(ou0.a paymentStatus) {
        int i15 = a.f224645a[paymentStatus.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(o62.a.f142749f);
        }
        if (i15 == 2) {
            return this.labelProvider.c(o62.a.f142742a);
        }
        throw new oq.p();
    }

    private final Label q(Ticket ticket, ou0.a paymentStatus) {
        return mx.b.b(dz.a.a(this.currencyFormatter, l(ticket, paymentStatus), null, 2, null) + " " + this.currencyFormatter.d("PLN"), "amountWithCurrency");
    }

    private final Label r() {
        return this.labelProvider.c(o62.a.f142745b0).o(Label.INSTANCE.d()).o(this.labelProvider.c(o62.a.f142750g));
    }

    private final Label s(String ticketNumber) {
        return this.labelProvider.e(o62.a.f142751h, ticketNumber);
    }

    private final r50.a.WithIcon v(ou0.a paymentStatus) {
        int i15 = a.f224645a[paymentStatus.ordinal()];
        if (i15 == 1) {
            return new r50.a.WithIcon(null, this.labelProvider.c(o62.a.f142769z), null, 0, false, g.NEGATIVE, 29, null);
        }
        if (i15 == 2) {
            return new r50.a.WithIcon(null, this.labelProvider.c(o62.a.f142764u), null, 0, false, g.POSITIVE, 29, null);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public n0<z62.a> b(y62.a.Params params) {
        return u0.b(u0.c(params.c(), new b(params, null)), null, new C6020c(null), 1, null);
    }
}
