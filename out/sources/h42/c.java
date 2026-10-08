package h42;

import er.l;
import fr.t;
import mx.Label;
import n50.k0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import v60.PaymentStatusCardData;
import xw.f;
import yr0.BEPaymentInfo;
import yr0.BEPaymentPackageSummary;
import yr0.m;
import yr0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh42/c;", "Lxw/f;", "Lh42/c$a;", "Lv60/a;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Ldz/a;)V", "Lyr0/m;", "Ln50/k0$f;", "l", "(Lyr0/m;)Ln50/k0$f;", "Lyr0/h;", "Lmx/a;", "e", "(Lyr0/h;)Lmx/a;", "f", "params", "h", "(Lh42/c$a;)Lv60/a;", "a", "Lmx/c;", "b", "Ldz/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, PaymentStatusCardData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: h42.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lh42/c$a;", "", "Lyr0/h;", "paymentInfo", "Lkotlin/Function1;", "Loq/i0;", "onItemSelectedAction", "<init>", "(Lyr0/h;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyr0/h;", "b", "()Lyr0/h;", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPaymentInfo paymentInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEPaymentInfo, i0> onItemSelectedAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(BEPaymentInfo bEPaymentInfo, l<? super BEPaymentInfo, i0> lVar) {
            this.paymentInfo = bEPaymentInfo;
            this.onItemSelectedAction = lVar;
        }

        public final l<BEPaymentInfo, i0> a() {
            return this.onItemSelectedAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEPaymentInfo getPaymentInfo() {
            return this.paymentInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.paymentInfo, params.paymentInfo) && t.c(this.onItemSelectedAction, params.onItemSelectedAction);
        }

        public int hashCode() {
            return (this.paymentInfo.hashCode() * 31) + this.onItemSelectedAction.hashCode();
        }

        public String toString() {
            return "Params(paymentInfo=" + this.paymentInfo + ", onItemSelectedAction=" + this.onItemSelectedAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80984a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.IN_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.OVERDUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.REMITTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.ENFORCEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m.WITHDRAWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m.REGISTERED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f80984a = iArr;
        }
    }

    public c(mx.c cVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
    }

    private final Label e(BEPaymentInfo bEPaymentInfo) {
        if (bEPaymentInfo.getPaymentPackageSummary() != null) {
            BEPaymentPackageSummary paymentPackageSummary = bEPaymentInfo.getPaymentPackageSummary();
            if (paymentPackageSummary != null) {
                return this.labelProvider.e(t32.b.f187452f0, Integer.valueOf(paymentPackageSummary.getPartNumber()), Integer.valueOf(paymentPackageSummary.getNumberOfParts()));
            }
            return null;
        }
        if (bEPaymentInfo.getPaymentType() == n.INSTANT) {
            return this.labelProvider.c(t32.b.L1);
        }
        if (bEPaymentInfo.getPaymentType() == n.STAMP_DUTY) {
            return this.labelProvider.c(t32.b.T1);
        }
        return null;
    }

    private final Label f(BEPaymentInfo bEPaymentInfo) {
        return mx.b.b(dz.a.a(this.currencyFormatter, bEPaymentInfo.getAmount(), null, 2, null) + ' ' + this.currencyFormatter.d(bEPaymentInfo.getCurrencyCode()), "subtitleValueLabel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, BEPaymentInfo bEPaymentInfo) {
        params.a().b(bEPaymentInfo);
        return i0.f148189a;
    }

    private final k0.f l(m mVar) {
        switch (b.f80984a[mVar.ordinal()]) {
            case 1:
                return new k0.f.Error(null, this.labelProvider.c(t32.b.S1), 1, null);
            case 2:
                return new k0.f.Normal(null, this.labelProvider.c(t32.b.K1), 1, null);
            case 3:
                return new k0.f.Normal(null, this.labelProvider.c(t32.b.N1), 1, null);
            case 4:
                return new k0.f.Error(null, this.labelProvider.c(t32.b.M1), 1, null);
            case 5:
                return new k0.f.Normal(null, this.labelProvider.c(t32.b.H1), 1, null);
            case 6:
                return new k0.f.Error(null, this.labelProvider.c(t32.b.I1), 1, null);
            case 7:
                return new k0.f.Normal(null, this.labelProvider.c(t32.b.J1), 1, null);
            case 8:
                return new k0.f.Normal(null, this.labelProvider.c(t32.b.U1), 1, null);
            case 9:
                return new k0.f.Error(null, this.labelProvider.c(t32.b.P1), 1, null);
            case 10:
                return new k0.f.Error(null, this.labelProvider.c(t32.b.f187502w), 1, null);
            default:
                throw new p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public PaymentStatusCardData b(final Params params) {
        final BEPaymentInfo paymentInfo = params.getPaymentInfo();
        k0.f fVarL = l(paymentInfo.getPaymentStatus());
        Label labelE = e(paymentInfo);
        Label labelB = mx.b.b(paymentInfo.getDescription(), "paymentDescription");
        Label labelC = this.labelProvider.c(t32.b.f187433a);
        Label.Companion companion = Label.INSTANCE;
        return new PaymentStatusCardData(null, fVarL, labelE, labelB, labelC.o(companion.d()), f(paymentInfo), companion.c(), null, 1, new er.a() { // from class: h42.b
            @Override // er.a
            public final Object a() {
                return c.i(params, paymentInfo);
            }
        }, 1, null);
    }
}
