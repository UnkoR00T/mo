package n42;

import androidx.compose.ui.graphics.Color;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import wr0.BEPaymentAddress;
import x50.NavigationButtonData;
import yr0.BEInterest;
import yr0.BEPaymentDetails;
import yr0.BEPaymentPackageSummary;
import yr0.BEPaymentReminder;
import yr0.BEProlongation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001AB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$*\u00020\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u0004\u0018\u00010**\u00020!2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020-*\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u000200*\u00020*H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u00020**\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u00020**\u000206H\u0002¢\u0006\u0004\b7\u00108J'\u0010=\u001a\u0004\u0018\u00010<2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\"092\u0006\u0010;\u001a\u00020\u0018H\u0002¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Ln42/t;", "Lxw/f;", "Ln42/t$a;", "Ln42/r$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Lez/e;Ldz/a;)V", "Lyr0/e;", "Ln42/q$a;", "state", "params", "Lcb4/i;", "dialog", "Ln42/r$a$c;", "v", "(Lyr0/e;Ln42/q$a;Ln42/t$a;Lcb4/i;)Ln42/r$a$c;", "Landroidx/compose/ui/graphics/Color;", "q", "(Lyr0/e;Lm2/r;I)J", "", "isStampDutyPayment", "Ln30/b;", "l", "(Lyr0/e;Z)Ln30/b;", "Lr50/a$b;", "f", "(Lyr0/e;)Lr50/a$b;", "Lkotlin/Function1;", "Lyr0/c;", "Loq/i0;", "onClick", "", "Lh30/a;", "h", "(Lyr0/e;Ler/l;)Ljava/util/List;", "Lyr0/l;", "reminder", "Lmx/a;", "r", "(Lyr0/c;Lyr0/l;)Lmx/a;", "Lk30/d;", "s", "(Lyr0/c;)Lk30/d;", "", "m", "(Lmx/a;)Ljava/lang/String;", "Lyr0/f;", "u", "(Lyr0/f;)Lmx/a;", "Lyr0/j;", "x", "(Lyr0/j;)Lmx/a;", "Lkotlin/Function0;", "onTransactionsClick", "hasTransactions", "Ln50/g;", "z", "(Ler/a;Z)Ln50/g;", "E", "(Ln42/t$a;)Ln42/r$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Ldz/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements xw.f<Params, r.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: n42.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Ln42/t$a;", "", "Ln42/q;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "Lyr0/c;", "buttonAction", "hideSnackBar", "toTransaction", "<init>", "(Ln42/q;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln42/q;", "d", "()Ln42/q;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "e", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<yr0.c, oq.i0> buttonAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> hideSnackBar;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toTransaction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q qVar, er.a<oq.i0> aVar, er.l<? super yr0.c, oq.i0> lVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3) {
            this.state = qVar;
            this.closeAction = aVar;
            this.buttonAction = lVar;
            this.hideSnackBar = aVar2;
            this.toTransaction = aVar3;
        }

        public final er.l<yr0.c, oq.i0> a() {
            return this.buttonAction;
        }

        public final er.a<oq.i0> b() {
            return this.closeAction;
        }

        public final er.a<oq.i0> c() {
            return this.hideSnackBar;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final q getState() {
            return this.state;
        }

        public final er.a<oq.i0> e() {
            return this.toTransaction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.closeAction, params.closeAction) && fr.t.c(this.buttonAction, params.buttonAction) && fr.t.c(this.hideSnackBar, params.hideSnackBar) && fr.t.c(this.toTransaction, params.toTransaction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.buttonAction.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31) + this.toTransaction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", buttonAction=" + this.buttonAction + ", hideSnackBar=" + this.hideSnackBar + ", toTransaction=" + this.toTransaction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f131707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f131708c;

        static {
            int[] iArr = new int[yr0.m.values().length];
            try {
                iArr[yr0.m.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yr0.m.OVERDUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yr0.m.ENFORCEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yr0.m.REGISTERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yr0.m.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yr0.m.IN_PAYMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yr0.m.COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[yr0.m.REMITTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[yr0.m.EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[yr0.m.WITHDRAWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f131706a = iArr;
            int[] iArr2 = new int[yr0.c.values().length];
            try {
                iArr2[yr0.c.START_PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[yr0.c.DOWNLOAD_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[yr0.c.CHOOSE_INSTALLMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[yr0.c.ACCEPT_INSTANT_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[yr0.c.REJECT_INSTANT_PAYMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[yr0.c.WITHDRAW_PAYMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[yr0.c.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            f131707b = iArr2;
            int[] iArr3 = new int[yr0.f.values().length];
            try {
                iArr3[yr0.f.BLIK.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[yr0.f.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[yr0.f.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[yr0.f.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[yr0.f.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[yr0.f.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            f131708c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            k30.d buttonVariant = ((ButtonData) t16).getButtonVariant();
            k30.d.a aVar = k30.d.a.f107773a;
            return sq.a.e(Boolean.valueOf(fr.t.c(buttonVariant, aVar)), Boolean.valueOf(fr.t.c(((ButtonData) t15).getButtonVariant(), aVar)));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BEPaymentDetails f131710b;

        d(BEPaymentDetails bEPaymentDetails) {
            this.f131710b = bEPaymentDetails;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1417747898);
            if (p076m2.t.k()) {
                p076m2.t.o(1417747898, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsMapper.getInitializedData.<anonymous>.<anonymous> (PaymentsDetailsMapper.kt:110)");
            }
            long jQ = t.this.q(this.f131710b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jQ;
        }
    }

    public t(mx.c cVar, ez.e eVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.currencyFormatter = aVar;
    }

    private final r50.a.WithIcon f(BEPaymentDetails bEPaymentDetails) {
        switch (b.f131706a[bEPaymentDetails.getStatus().ordinal()]) {
            case 1:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.S1), null, 0, false, r50.g.NOTICE, 13, null);
            case 2:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.M1), null, 0, false, r50.g.NEGATIVE, 13, null);
            case 3:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.I1), null, 0, false, r50.g.NEGATIVE, 13, null);
            case 4:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.P1), null, 0, false, r50.g.NOTICE, 13, null);
            case 5:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.f187502w), null, 0, false, r50.g.NEGATIVE, 13, null);
            case 6:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.K1), null, 0, false, r50.g.INFORMATIVE, 13, null);
            case 7:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.N1), null, 0, false, r50.g.POSITIVE, 13, null);
            case 8:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.H1), null, 0, false, r50.g.MINUS, 13, null);
            case 9:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.J1), null, 0, false, r50.g.MINUS, 13, null);
            case 10:
                return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.U1), null, 0, false, r50.g.MINUS, 13, null);
            default:
                throw new oq.p();
        }
    }

    private final List<ButtonData> h(BEPaymentDetails bEPaymentDetails, final er.l<? super yr0.c, oq.i0> lVar) {
        List<yr0.c> listC = bEPaymentDetails.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        for (final yr0.c cVar : listC) {
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d dVarS = s(cVar);
            Label labelR = r(cVar, bEPaymentDetails.getReminder());
            if (labelR == null) {
                labelR = Label.INSTANCE.c();
            }
            arrayList.add(new ButtonData(null, null, large, new k30.c.WithText(labelR, null, 2, null), dVarS, null, new er.a() { // from class: n42.s
                @Override // er.a
                public final Object a() {
                    return t.i(lVar, cVar);
                }
            }, 35, null));
        }
        return pq.v.U0(arrayList, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(er.l lVar, yr0.c cVar) {
        lVar.b(cVar);
        return oq.i0.f148189a;
    }

    private final CardListData l(BEPaymentDetails bEPaymentDetails, boolean z15) {
        int i15;
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187496u), null, null, 3, null), new n50.b.StatusBadge(f(bEPaymentDetails)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187512z0), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.currencyFormatter.b(bEPaymentDetails.getAmount(), bEPaymentDetails.getCurrency()), "currencyWithAmount"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        BigDecimal baseAmount = bEPaymentDetails.getBaseAmount();
        if (baseAmount != null) {
            i15 = 3;
            defaultSingleCardData = !fr.t.c(bEPaymentDetails.getAmount(), baseAmount) ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187446d0), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.currencyFormatter.b(baseAmount, bEPaymentDetails.getCurrency()), "baseCurrencyWithAmount"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
        } else {
            i15 = 3;
            defaultSingleCardData = null;
        }
        BEInterest interest = bEPaymentDetails.getInterest();
        DefaultSingleCardData defaultSingleCardData5 = interest != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187458h0), null, null, i15, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.e(t32.b.f187461i0, this.currencyFormatter.b(interest.getAmount(), bEPaymentDetails.getCurrency()), this.dateFormatter.d(new fz.b.LocalDate(interest.getDateFor()), fz.c.DOTTED)), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
        BEProlongation prolongation = bEPaymentDetails.getProlongation();
        DefaultSingleCardData defaultSingleCardData6 = prolongation != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187464j0), null, null, i15, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.currencyFormatter.b(prolongation.getAmount(), bEPaymentDetails.getCurrency()), "prolongationCurrencyWithAmount"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(t32.b.D0), null, null, i15, null);
        StringBuilder sb5 = new StringBuilder();
        BEPaymentAddress institutionAddress = bEPaymentDetails.getInstitutionAddress();
        if (institutionAddress != null) {
            sb5.append(bEPaymentDetails.getInstitutionName());
            sb5.append('\n');
            sb5.append(institutionAddress.d());
        } else {
            sb5.append(bEPaymentDetails.getInstitutionName());
        }
        oq.i0 i0Var = oq.i0.f148189a;
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(new SingleCardLabel(mx.b.b(sb5.toString(), "institutionAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData8 = !z15 ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.F0), null, null, i15, null), new n50.b.Title(new SingleCardLabel(new Label(bEPaymentDetails.getTitle(), m(this.labelProvider.c(t32.b.F0))), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
        DefaultSingleCardData defaultSingleCardData9 = !z15 ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.A0), null, null, i15, null), new n50.b.Title(n50.l.b(new Label(bEPaymentDetails.getExternalId(), m(this.labelProvider.c(t32.b.A0))), null, null, i15, null)), null, 4, null), null, null, null, 3839, null) : null;
        String additionalInfo = bEPaymentDetails.getAdditionalInfo();
        if (additionalInfo != null) {
            DefaultSingleCardData defaultSingleCardData10 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187507x1), null, null, i15, null), new n50.b.Title(new SingleCardLabel(mx.b.b(additionalInfo, "personalInfo"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            if (!z15) {
                defaultSingleCardData10 = null;
            }
            defaultSingleCardData2 = defaultSingleCardData10;
        } else {
            defaultSingleCardData2 = null;
        }
        SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(t32.b.B0), null, null, i15, null);
        StringBuilder sb6 = new StringBuilder();
        sb6.append((bEPaymentDetails.getPaymentType() == yr0.n.INSTANT || bEPaymentDetails.getPaymentType() == yr0.n.STAMP_DUTY) ? this.dateFormatter.d(new fz.b.LocalDateTime(bEPaymentDetails.getDueDateTime().toLocalDateTime()), fz.c.DOTTED_PLUS_HOUR) : this.dateFormatter.d(new fz.b.LocalDate(bEPaymentDetails.getDueDate()), fz.c.DOTTED));
        String dueDateMessage = bEPaymentDetails.getDueDateMessage();
        if (dueDateMessage != null) {
            sb6.append(" ");
            sb6.append(dueDateMessage);
        }
        DefaultSingleCardData defaultSingleCardData11 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(n50.l.b(new Label(sb6.toString(), m(this.labelProvider.c(t32.b.B0))), null, null, i15, null)), null, 4, null), null, null, null, 3839, null);
        yr0.f paymentDetailsPaymentMethod = bEPaymentDetails.getPaymentDetailsPaymentMethod();
        DefaultSingleCardData defaultSingleCardData12 = paymentDetailsPaymentMethod != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.C0), null, null, i15, null), new n50.b.Title(new SingleCardLabel(u(paymentDetailsPaymentMethod), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
        BEPaymentPackageSummary paymentPackageSummary = bEPaymentDetails.getPaymentPackageSummary();
        return new CardListData(pq.v.s(defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, defaultSingleCardData9, defaultSingleCardData2, defaultSingleCardData11, defaultSingleCardData12, paymentPackageSummary != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187455g0), null, null, i15, null), new n50.b.Title(new SingleCardLabel(x(paymentPackageSummary), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null), null, false, null, null, 30, null);
    }

    private final String m(Label label) {
        return label.getTag() + "description";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long q(BEPaymentDetails bEPaymentDetails, p076m2.r rVar, int i15) {
        long jG;
        if (p076m2.t.k()) {
            p076m2.t.o(1121984923, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsMapper.getAdditionalTitleColor (PaymentsDetailsMapper.kt:133)");
        }
        switch (b.f131706a[bEPaymentDetails.getStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                rVar.X(190727143);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                rVar.X(190733061);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
                break;
            default:
                rVar.X(190721657);
                rVar.R();
                throw new oq.p();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jG;
    }

    private final Label r(yr0.c cVar, BEPaymentReminder bEPaymentReminder) {
        Label labelC;
        switch (b.f131707b[cVar.ordinal()]) {
            case 1:
                return (bEPaymentReminder == null || (labelC = this.labelProvider.c(t32.b.f187478o)) == null) ? this.labelProvider.c(t32.b.f187449e0) : labelC;
            case 2:
                return this.labelProvider.c(t32.b.W);
            case 3:
                return this.labelProvider.c(t32.b.f187485q0);
            case 4:
                return this.labelProvider.c(t32.b.f187442c0);
            case 5:
                return this.labelProvider.c(t32.b.f187487r);
            case 6:
                return this.labelProvider.c(t32.b.f187513z1);
            case 7:
                return null;
            default:
                throw new oq.p();
        }
    }

    private final k30.d s(yr0.c cVar) {
        switch (b.f131707b[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
                return k30.d.a.f107773a;
            case 5:
            case 6:
                return new k30.d.Secondary(null, 1, null);
            default:
                throw new oq.p();
        }
    }

    private final Label u(yr0.f fVar) {
        switch (b.f131708c[fVar.ordinal()]) {
            case 1:
                return this.labelProvider.c(t32.b.f187491s0);
            case 2:
                return this.labelProvider.c(t32.b.f187500v0);
            case 3:
                return this.labelProvider.c(t32.b.f187494t0);
            case 4:
                return this.labelProvider.c(t32.b.f187497u0);
            case 5:
                return this.labelProvider.c(t32.b.f187488r0);
            case 6:
                return this.labelProvider.c(t32.b.f187506x0);
            default:
                throw new oq.p();
        }
    }

    private final r.a.Initialized v(BEPaymentDetails bEPaymentDetails, q.a aVar, Params params, cb4.i iVar) {
        String id5 = bEPaymentDetails.getId();
        yr0.m status = bEPaymentDetails.getStatus();
        String description = bEPaymentDetails.getDescription();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(bEPaymentDetails.getStatusDetails());
        String dueDateMessage = bEPaymentDetails.getDueDateMessage();
        if (dueDateMessage != null) {
            sb5.append(" ");
            sb5.append(dueDateMessage);
            sb5.append(".");
        }
        oq.i0 i0Var = oq.i0.f148189a;
        return new r.a.Initialized(id5, status, description, sb5.toString(), new d(bEPaymentDetails), l(bEPaymentDetails, aVar.getItem().getPaymentType() == yr0.n.STAMP_DUTY), h(bEPaymentDetails, params.a()), params.c(), z(params.e(), aVar.getItem().getHasTransactions()), new BaseScaffoldData(null, null, null, null, null, null, 63, null), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(t32.b.E0), null, null, null, 28, null), null, null, null, null, 61, null), iVar);
    }

    private final Label x(BEPaymentPackageSummary bEPaymentPackageSummary) {
        return this.labelProvider.e(t32.b.f187452f0, Integer.valueOf(bEPaymentPackageSummary.getPartNumber()), Integer.valueOf(bEPaymentPackageSummary.getNumberOfParts()));
    }

    private final DefaultSingleCardData z(er.a<oq.i0> onTransactionsClick, boolean hasTransactions) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, onTransactionsClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(t32.b.f187470l0), null, null, 0, 0, null, 62, null)), null, 5, null), null, n50.x0.Icon.INSTANCE.b(), null, 2813, null);
        if (hasTransactions) {
            return defaultSingleCardData;
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public r.a b(Params params) {
        q state = params.getState();
        if (state instanceof Loading) {
            return r.a.b.f131515a;
        }
        if (state instanceof Displayed) {
            Displayed displayed = (Displayed) state;
            return v(displayed.getItem(), (q.a) state, params, displayed.getDialog());
        }
        if ((state instanceof Accepting) || (state instanceof Downloading) || (state instanceof Loading) || (state instanceof Rejecting) || (state instanceof Rejecting)) {
            q.a aVar = (q.a) state;
            return v(aVar.getItem(), aVar, params, null);
        }
        if (state instanceof Error) {
            return new r.a.Error(((Error) state).getErrorVMS());
        }
        if (state instanceof Error) {
            return new r.a.Error(((Error) state).getErrorVMS());
        }
        if (state instanceof j) {
            return new r.a.Error(((j) state).b());
        }
        if (state instanceof Error) {
            return new r.a.Error(((Error) state).getErrorVMS());
        }
        if (state instanceof Error) {
            return new r.a.Error(((Error) state).getErrorVMS());
        }
        if (state instanceof Error) {
            return new r.a.Error(((Error) state).getErrorVMS());
        }
        if (state instanceof Error) {
            return new r.a.Error(((Error) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
