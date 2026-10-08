package z52;

import as0.BETransactionCardDetails;
import as0.BETransactionDetailsDomain;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u0017*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lz52/e;", "Lxw/f;", "Lz52/e$a;", "Lz52/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lg42/j;", "paymentsCardsHelper", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Lez/e;Lg42/j;Ldz/a;)V", "Las0/c;", "Ln30/b;", "l", "(Las0/c;)Ln30/b;", "Lr50/a$b;", "c", "(Las0/c;)Lr50/a$b;", "Ljava/time/OffsetDateTime;", "createdAt", "Lmx/a;", "h", "(Ljava/time/OffsetDateTime;)Lmx/a;", "Lfz/c;", "formatType", "", "e", "(Ljava/time/OffsetDateTime;Lfz/c;)Ljava/lang/String;", "Las0/d;", "cardNumber", "i", "(Las0/d;Ljava/lang/String;)Lmx/a;", "", "isEpoAvailable", "Lkotlin/Function0;", "Loq/i0;", "getTransactionConfirmation", "Lh30/a;", "f", "(ZLer/a;)Lh30/a;", "params", "m", "(Lz52/e$a;)Lz52/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lg42/j;", "d", "Ldz/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g42.j paymentsCardsHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: z52.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lz52/e$a;", "", "Lz52/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "getTransactionConfirmation", "hideSnackBar", "<init>", "(Lz52/c;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz52/c;", "d", "()Lz52/c;", "b", "Ler/a;", "()Ler/a;", "c", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> getTransactionConfirmation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBar;

        public Params(c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.backAction = aVar;
            this.getTransactionConfirmation = aVar2;
            this.hideSnackBar = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.getTransactionConfirmation;
        }

        public final er.a<i0> c() {
            return this.hideSnackBar;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.backAction, params.backAction) && fr.t.c(this.getTransactionConfirmation, params.getTransactionConfirmation) && fr.t.c(this.hideSnackBar, params.hideSnackBar);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.getTransactionConfirmation.hashCode()) * 31) + this.hideSnackBar.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", getTransactionConfirmation=" + this.getTransactionConfirmation + ", hideSnackBar=" + this.hideSnackBar + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f232972b;

        static {
            int[] iArr = new int[as0.f.values().length];
            try {
                iArr[as0.f.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[as0.f.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[as0.f.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[as0.f.REVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[as0.f.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f232971a = iArr;
            int[] iArr2 = new int[as0.d.values().length];
            try {
                iArr2[as0.d.BLIK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[as0.d.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[as0.d.WALLET_GP.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[as0.d.WALLET_AP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[as0.d.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f232972b = iArr2;
        }
    }

    public e(mx.c cVar, ez.e eVar, g42.j jVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.paymentsCardsHelper = jVar;
        this.currencyFormatter = aVar;
    }

    private final r50.a.WithIcon c(BETransactionDetailsDomain bETransactionDetailsDomain) {
        int i15 = b.f232971a[bETransactionDetailsDomain.getTransactionStatus().ordinal()];
        if (i15 == 1) {
            return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.O1), null, 0, false, r50.g.NOTICE, 13, null);
        }
        if (i15 == 2) {
            return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.N1), null, 0, false, r50.g.POSITIVE, 13, null);
        }
        if (i15 == 3) {
            return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.Q1), null, 0, false, r50.g.NEGATIVE, 13, null);
        }
        if (i15 == 4) {
            return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.R1), null, 0, false, r50.g.NEGATIVE, 13, null);
        }
        if (i15 == 5) {
            return new r50.a.WithIcon(null, this.labelProvider.c(t32.b.f187506x0), null, 0, false, r50.g.NEGATIVE, 13, null);
        }
        throw new oq.p();
    }

    private final String e(OffsetDateTime offsetDateTime, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), cVar);
    }

    private final ButtonData f(boolean isEpoAvailable, er.a<i0> getTransactionConfirmation) {
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.W), null, 2, null), k30.d.a.f107773a, null, getTransactionConfirmation, 35, null);
        if (isEpoAvailable) {
            return buttonData;
        }
        return null;
    }

    private final Label h(OffsetDateTime createdAt) {
        return mx.b.b(e(createdAt, fz.c.DOTTED_PLUS_HOUR), "transactionDetailsCreatedAtTag");
    }

    private final Label i(as0.d dVar, String str) {
        int i15 = b.f232972b[dVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(t32.b.f187491s0);
        }
        if (i15 == 2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.labelProvider.c(t32.b.f187500v0).getText());
            if (str != null) {
                sb5.append("\n");
                sb5.append(this.paymentsCardsHelper.c(str).getText());
            }
            return mx.b.b(sb5.toString(), "transactionDetailsPaymentMethodTag");
        }
        if (i15 == 3) {
            return this.labelProvider.c(t32.b.f187497u0);
        }
        if (i15 == 4) {
            return this.labelProvider.c(t32.b.f187488r0);
        }
        if (i15 == 5) {
            return this.labelProvider.c(t32.b.f187506x0);
        }
        throw new oq.p();
    }

    private final CardListData l(BETransactionDetailsDomain bETransactionDetailsDomain) {
        String cardNumberMasked;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187496u), null, null, 3, null), new n50.b.StatusBadge(c(bETransactionDetailsDomain)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.K0), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.currencyFormatter.b(bETransactionDetailsDomain.getAmount(), "PLN"), "transactionDetailsAmountTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(t32.b.f187451f), null, null, 3, null), new n50.b.Title(new SingleCardLabel(h(bETransactionDetailsDomain.getCreatedAt()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(t32.b.C0), null, null, 3, null);
        as0.d paymentMethod = bETransactionDetailsDomain.getPaymentMethod();
        BETransactionCardDetails cardDetails = bETransactionDetailsDomain.getCardDetails();
        Label labelI = i(paymentMethod, cardDetails != null ? cardDetails.getCardNumberMasked() : null);
        BETransactionCardDetails cardDetails2 = bETransactionDetailsDomain.getCardDetails();
        return new CardListData(pq.v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(new SingleCardLabel(labelI, (cardDetails2 == null || (cardNumberMasked = cardDetails2.getCardNumberMasked()) == null) ? null : this.paymentsCardsHelper.f(cardNumberMasked), null, 0, 0, null, 60, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        c state = params.getState();
        if (fr.t.c(state, c.a.f232953a)) {
            return d.a.C6262a.f232957a;
        }
        if (state instanceof c.Initialized) {
            return new d.a.Initialized(l(((c.Initialized) params.getState()).getTransactionDetails()), f(((c.Initialized) params.getState()).getTransactionDetails().getIsEpoAvailable(), params.b()), params.c(), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(t32.b.f187457h), null, null, null, 28, null), null, null, null, null, 61, null), ((c.Initialized) params.getState()).getDialog());
        }
        throw new oq.p();
    }
}
