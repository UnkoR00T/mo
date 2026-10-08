package b62;

import as0.BETransaction;
import er.l;
import er.p;
import er.q;
import ez.e;
import fr.t;
import ja.n0;
import ja.u0;
import java.time.OffsetDateTime;
import mx.Label;
import n50.k0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import v60.PaymentStatusCardData;
import vq.k;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lb62/c;", "Lxw/f;", "Lb62/c$a;", "Lja/n0;", "Lc62/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Las0/a;", "params", "Lc62/a$b;", "r", "(Las0/a;Lb62/c$a;)Lc62/a$b;", "Lmx/a;", "m", "(Las0/a;)Lmx/a;", "Ln50/k0$f;", "i", "(Las0/a;)Ln50/k0$f;", "l", "Ljava/time/OffsetDateTime;", "transactionDate", "Lc62/a$a;", "h", "(Ljava/time/OffsetDateTime;)Lc62/a$a;", "q", "(Lb62/c$a;)Lja/n0;", "a", "Lmx/c;", "b", "Lez/e;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, n0<c62.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b62.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb62/c$a;", "", "Lja/n0;", "Las0/a;", "transactionsDataFlow", "Lkotlin/Function1;", "", "Loq/i0;", "onTransactionClickAction", "<init>", "(Lja/n0;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/n0;", "b", "()Lja/n0;", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0<BETransaction> transactionsDataFlow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onTransactionClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n0<BETransaction> n0Var, l<? super String, i0> lVar) {
            this.transactionsDataFlow = n0Var;
            this.onTransactionClickAction = lVar;
        }

        public final l<String, i0> a() {
            return this.onTransactionClickAction;
        }

        public final n0<BETransaction> b() {
            return this.transactionsDataFlow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.transactionsDataFlow, params.transactionsDataFlow) && t.c(this.onTransactionClickAction, params.onTransactionClickAction);
        }

        public int hashCode() {
            return (this.transactionsDataFlow.hashCode() * 31) + this.onTransactionClickAction.hashCode();
        }

        public String toString() {
            return "Params(transactionsDataFlow=" + this.transactionsDataFlow + ", onTransactionClickAction=" + this.onTransactionClickAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16873b;

        static {
            int[] iArr = new int[as0.e.values().length];
            try {
                iArr[as0.e.BLIK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[as0.e.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[as0.e.WALLET_GP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[as0.e.WALLET_AP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[as0.e.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16872a = iArr;
            int[] iArr2 = new int[as0.f.values().length];
            try {
                iArr2[as0.f.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[as0.f.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[as0.f.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[as0.f.REVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[as0.f.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f16873b = iArr2;
        }
    }

    /* JADX INFO: renamed from: b62.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Las0/a;", "transaction", "Lc62/a$b;", "<anonymous>", "(Las0/a;)Lc62/a$b;"}, k = 3, mv = {2, 2, 0})
    static final class C0412c extends k implements p<BETransaction, tq.e<? super c62.a.TransactionCard>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16875f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f16877h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0412c(Params params, tq.e<? super C0412c> eVar) {
            super(2, eVar);
            this.f16877h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BETransaction bETransaction = (BETransaction) this.f16875f;
            uq.b.e();
            if (this.f16874e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c.this.r(bETransaction, this.f16877h);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(BETransaction bETransaction, tq.e<? super c62.a.TransactionCard> eVar) {
            return ((C0412c) v(bETransaction, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C0412c c0412c = c.this.new C0412c(this.f16877h, eVar);
            c0412c.f16875f = obj;
            return c0412c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc62/a$b;", "before", "after", "Lc62/a;", "<anonymous>", "(Lc62/a$b;Lc62/a$b;)Lc62/a;"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements q<c62.a.TransactionCard, c62.a.TransactionCard, tq.e<? super c62.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f16880g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OffsetDateTime createdAt;
            c62.a.TransactionCard transactionCard = (c62.a.TransactionCard) this.f16879f;
            c62.a.TransactionCard transactionCard2 = (c62.a.TransactionCard) this.f16880g;
            uq.b.e();
            if (this.f16878e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (transactionCard2 == null || (createdAt = transactionCard2.getCreatedAt()) == null) {
                return null;
            }
            if (ez.d.a(createdAt, transactionCard != null ? transactionCard.getCreatedAt() : null)) {
                createdAt = null;
            }
            if (createdAt != null) {
                return c.this.h(createdAt);
            }
            return null;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c62.a.TransactionCard transactionCard, c62.a.TransactionCard transactionCard2, tq.e<? super c62.a> eVar) {
            d dVar = c.this.new d(eVar);
            dVar.f16879f = transactionCard;
            dVar.f16880g = transactionCard2;
            return dVar.J(i0.f148189a);
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c62.a.DateSeparator h(OffsetDateTime transactionDate) {
        return new c62.a.DateSeparator(mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(transactionDate), fz.c.DOTTED), "transactionSeparatorTag"));
    }

    private final k0.f i(BETransaction bETransaction) {
        int i15 = b.f16873b[bETransaction.getTransactionStatus().ordinal()];
        if (i15 == 1) {
            return new k0.f.Normal(null, this.labelProvider.c(t32.b.O1), 1, null);
        }
        if (i15 == 2) {
            return new k0.f.Normal(null, this.labelProvider.c(t32.b.N1), 1, null);
        }
        if (i15 == 3) {
            return new k0.f.Error(null, this.labelProvider.c(t32.b.Q1), 1, null);
        }
        if (i15 == 4) {
            return new k0.f.Error(null, this.labelProvider.c(t32.b.R1), 1, null);
        }
        if (i15 == 5) {
            return new k0.f.Normal(null, this.labelProvider.c(t32.b.f187506x0), 1, null);
        }
        throw new oq.p();
    }

    private final Label l(BETransaction bETransaction) {
        Label labelC = this.labelProvider.c(t32.b.f187472m);
        Label.Companion companion = Label.INSTANCE;
        return labelC.o(companion.a()).o(companion.d()).o(mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(bETransaction.getCreatedAt()), fz.c.ONLY_HOUR), "transactionSubtitleTag"));
    }

    private final Label m(BETransaction bETransaction) {
        int i15 = b.f16872a[bETransaction.getPaymentDetailsPaymentMethod().ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(t32.b.f187491s0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(t32.b.f187500v0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(t32.b.f187497u0);
        }
        if (i15 == 4) {
            return this.labelProvider.c(t32.b.f187488r0);
        }
        if (i15 == 5) {
            return this.labelProvider.c(t32.b.f187502w);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c62.a.TransactionCard r(final BETransaction bETransaction, final Params params) {
        return new c62.a.TransactionCard(new PaymentStatusCardData(null, i(bETransaction), null, m(bETransaction), null, l(bETransaction), Label.INSTANCE.c(), null, 0, new er.a() { // from class: b62.b
            @Override // er.a
            public final Object a() {
                return c.s(params, bETransaction);
            }
        }, 261, null), bETransaction.getCreatedAt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, BETransaction bETransaction) {
        params.a().b(bETransaction.getTransactionId());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public n0<c62.a> b(Params params) {
        return u0.b(u0.c(params.b(), new C0412c(params, null)), null, new d(null), 1, null);
    }
}
