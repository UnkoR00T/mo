package s42;

import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l60.Hideable;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r42.d;
import t42.InstallmentWithCheck;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yr0.BEPaymentPart;
import yr0.BEPaymentReminder;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\" B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ls42/b;", "Lxw/f;", "Ls42/b$b;", "Lr42/d$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Lez/c;Ldz/a;)V", "", "Lt42/a;", "Ljava/math/BigDecimal;", "e", "(Ljava/util/List;)Ljava/math/BigDecimal;", "Lkotlin/Function2;", "", "", "Loq/i0;", "onCheckChanged", "Ln50/g;", "i", "(Ljava/util/List;Ler/p;)Ljava/util/List;", "Ll60/b;", "Lmx/a;", "h", "(Ljava/util/List;)Ll60/b;", "params", "f", "(Ls42/b$b;)Lr42/d$a;", "a", "Lmx/c;", "b", "Lez/c;", "c", "Ldz/a;", "d", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f177838e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: s42.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Ls42/b$b;", "", "Lr42/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextAction", "onBackButtonClicked", "Lkotlin/Function2;", "", "", "onInstallmentClicked", "hideInfoAlert", "toPaymentsReminderSummary", "<init>", "(Lr42/c;Ler/a;Ler/a;Ler/p;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lr42/c;", "e", "()Lr42/c;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/p;", "()Ler/p;", "f", "getToPaymentsReminderSummary", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r42.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackButtonClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, Boolean, i0> onInstallmentClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideInfoAlert;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toPaymentsReminderSummary;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(r42.c cVar, er.a<i0> aVar, er.a<i0> aVar2, p<? super Integer, ? super Boolean, i0> pVar, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = cVar;
            this.onNextAction = aVar;
            this.onBackButtonClicked = aVar2;
            this.onInstallmentClicked = pVar;
            this.hideInfoAlert = aVar3;
            this.toPaymentsReminderSummary = aVar4;
        }

        public final er.a<i0> a() {
            return this.hideInfoAlert;
        }

        public final er.a<i0> b() {
            return this.onBackButtonClicked;
        }

        public final p<Integer, Boolean, i0> c() {
            return this.onInstallmentClicked;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final r42.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackButtonClicked, params.onBackButtonClicked) && t.c(this.onInstallmentClicked, params.onInstallmentClicked) && t.c(this.hideInfoAlert, params.hideInfoAlert) && t.c(this.toPaymentsReminderSummary, params.toPaymentsReminderSummary);
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onNextAction.hashCode()) * 31) + this.onBackButtonClicked.hashCode()) * 31) + this.onInstallmentClicked.hashCode()) * 31) + this.hideInfoAlert.hashCode()) * 31) + this.toPaymentsReminderSummary.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextAction=" + this.onNextAction + ", onBackButtonClicked=" + this.onBackButtonClicked + ", onInstallmentClicked=" + this.onInstallmentClicked + ", hideInfoAlert=" + this.hideInfoAlert + ", toPaymentsReminderSummary=" + this.toPaymentsReminderSummary + ')';
        }
    }

    public b(c cVar, ez.c cVar2, dz.a aVar) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.currencyFormatter = aVar;
    }

    private final BigDecimal e(List<InstallmentWithCheck> list) {
        BigDecimal amount;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InstallmentWithCheck) obj).g()) {
                arrayList.add(obj);
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((InstallmentWithCheck) it.next()).e().getAmount());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            BEPaymentReminder paymentReminder = ((InstallmentWithCheck) obj2).getPaymentReminder();
            if (hashSet.add(paymentReminder != null ? paymentReminder.getId() : null)) {
                arrayList2.add(obj2);
            }
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            BEPaymentReminder paymentReminder2 = ((InstallmentWithCheck) it4.next()).getPaymentReminder();
            if (paymentReminder2 == null || (amount = paymentReminder2.getAmount()) == null) {
                amount = BigDecimal.ZERO;
            }
            bigDecimalValueOf2 = bigDecimalValueOf2.add(amount);
        }
        return bigDecimalValueOf.add(bigDecimalValueOf2);
    }

    private final Hideable<Label> h(List<InstallmentWithCheck> list) {
        BigDecimal amount;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InstallmentWithCheck) obj).g()) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            BEPaymentReminder paymentReminder = ((InstallmentWithCheck) obj2).getPaymentReminder();
            if (hashSet.add(paymentReminder != null ? paymentReminder.getId() : null)) {
                arrayList2.add(obj2);
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            BEPaymentReminder paymentReminder2 = ((InstallmentWithCheck) it.next()).getPaymentReminder();
            if (paymentReminder2 == null || (amount = paymentReminder2.getAmount()) == null) {
                amount = BigDecimal.ZERO;
            }
            bigDecimalValueOf = bigDecimalValueOf.add(amount);
        }
        return new Hideable<>(this.labelProvider.e(t32.b.W1, this.currencyFormatter.b(bigDecimalValueOf, ((InstallmentWithCheck) v.l0(list)).e().getCurrency())), bigDecimalValueOf.compareTo(BigDecimal.ZERO) > 0);
    }

    private final List<DefaultSingleCardData> i(List<InstallmentWithCheck> list, final p<? super Integer, ? super Boolean, i0> pVar) {
        List<InstallmentWithCheck> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        final int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            InstallmentWithCheck installmentWithCheck = (InstallmentWithCheck) obj;
            BEPaymentPart paymentPart = installmentWithCheck.getPaymentPart();
            final boolean isChecked = installmentWithCheck.getIsChecked();
            Label labelO = this.labelProvider.c(t32.b.f187433a).o(Label.INSTANCE.d()).o(mx.b.b(this.currencyFormatter.b(paymentPart.getAmount(), paymentPart.getCurrency()), "amount"));
            Label labelE = this.labelProvider.e(t32.b.T0, this.dateConverter.a(paymentPart.getDueDate()));
            Label labelE2 = this.labelProvider.e(t32.b.U0, Integer.valueOf(paymentPart.getPartNumber()), Integer.valueOf(paymentPart.getNumberOfParts()));
            boolean zG = i15 > 0 ? list.get(i15 - 1).g() : true;
            LeadingSection leadingSection = new LeadingSection(false, new n50.d.CheckBox(isChecked), null, 5, null);
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(paymentPart.getDescription(), "partTitle"), null, null, 0, 0, null, 62, null));
            i0 i0Var = i0.f148189a;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: s42.a
                @Override // er.a
                public final Object a() {
                    return b.l(pVar, i15, isChecked);
                }
            }, zG, null, null, false, null, null, new BodySection(null, title, new SingleCardLabel(mx.b.b(labelO.getText() + "\n" + labelE.getText() + "\n" + labelE2.getText(), "partDescription"), null, null, 0, 0, null, 62, null), 1, null), leadingSection, null, null, 3321, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(p pVar, int i15, boolean z15) {
        pVar.B(Integer.valueOf(i15), Boolean.valueOf(!z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        k30.b bVar;
        r42.c state = params.getState();
        if (state instanceof r42.c.Initial) {
            return d.a.C4365a.f171696a;
        }
        if (!(state instanceof r42.c.Initialized)) {
            throw new oq.p();
        }
        r42.c.Initialized initialized = (r42.c.Initialized) state;
        Hideable hideable = new Hideable(new c30.b.e(null, null, null, this.labelProvider.c(t32.b.R0), params.a(), null, null, 103, null), initialized.getIsInfoAlertVisible());
        Label labelC = this.labelProvider.c(t32.b.V0);
        List<DefaultSingleCardData> listI = i(initialized.d(), params.c());
        Label labelE = this.labelProvider.e(t32.b.W0, this.currencyFormatter.b(e(initialized.d()), ((InstallmentWithCheck) v.l0(initialized.d())).e().getCurrency()));
        Hideable<Label> hideableH = h(initialized.d());
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(t32.b.f187478o), null, 2, null);
        List<InstallmentWithCheck> listD = initialized.d();
        if ((listD instanceof Collection) && listD.isEmpty()) {
            bVar = k30.b.C2562b.f107767a;
        } else {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                if (((InstallmentWithCheck) it.next()).g()) {
                    bVar = k30.b.c.f107768a;
                }
            }
            bVar = k30.b.C2562b.f107767a;
        }
        return new d.a.Initialized(hideable, labelC, listI, labelE, hideableH, new ButtonData(null, null, large, withText, aVar, bVar, params.d(), 3, null), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(t32.b.S0), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
