package w42;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l60.Hideable;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t32.b;
import v42.d;
import x42.PaymentSummary;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lw42/a;", "Lxw/f;", "Lw42/a$a;", "Lv42/d$a;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Ldz/a;)V", "", "Lx42/a;", "Lmx/a;", "c", "(Ljava/util/List;)Lmx/a;", "Ll60/b;", "e", "(Ljava/util/List;)Ll60/b;", "params", "f", "(Lw42/a$a;)Lv42/d$a;", "a", "Lmx/c;", "b", "Ldz/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: w42.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lw42/a$a;", "", "Lv42/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "close", "hideInfoAlert", "payButtonAction", "<init>", "(Lv42/c;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv42/c;", "d", "()Lv42/c;", "b", "Ler/a;", "()Ler/a;", "c", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v42.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideInfoAlert;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> payButtonAction;

        public Params(v42.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.close = aVar;
            this.hideInfoAlert = aVar2;
            this.payButtonAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.close;
        }

        public final er.a<i0> b() {
            return this.hideInfoAlert;
        }

        public final er.a<i0> c() {
            return this.payButtonAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v42.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.close, params.close) && t.c(this.hideInfoAlert, params.hideInfoAlert) && t.c(this.payButtonAction, params.payButtonAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.close.hashCode()) * 31) + this.hideInfoAlert.hashCode()) * 31) + this.payButtonAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", close=" + this.close + ", hideInfoAlert=" + this.hideInfoAlert + ", payButtonAction=" + this.payButtonAction + ')';
        }
    }

    public a(c cVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
    }

    private final Label c(List<PaymentSummary> list) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((PaymentSummary) it.next()).getAmount());
        }
        return this.labelProvider.e(b.W0, this.currencyFormatter.b(bigDecimalValueOf, ((PaymentSummary) v.l0(list)).getCurrency()));
    }

    private final Hideable<Label> e(List<PaymentSummary> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PaymentSummary) obj).getType() == x42.b.REMINDER) {
                arrayList.add(obj);
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((PaymentSummary) it.next()).getAmount());
        }
        return new Hideable<>(this.labelProvider.e(b.W1, this.currencyFormatter.b(bigDecimalValueOf, ((PaymentSummary) v.l0(list)).getCurrency())), bigDecimalValueOf.compareTo(BigDecimal.ZERO) > 0);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        v42.c state = params.getState();
        if (t.c(state, v42.c.a.f203859a)) {
            return d.a.C5310a.f203867a;
        }
        if (!(state instanceof v42.c.Initialized)) {
            throw new p();
        }
        v42.c.Initialized initialized = (v42.c.Initialized) state;
        Hideable hideable = new Hideable(new c30.b.e(null, null, null, this.labelProvider.c(b.X1), params.b(), null, null, 103, null), initialized.getIsInfoAlertVisible());
        List<PaymentSummary> listG = initialized.g();
        ArrayList arrayList = new ArrayList(v.y(listG, 10));
        for (PaymentSummary paymentSummary : listG) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(paymentSummary.getTitle(), "paymentReminderTitle"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(b.f187433a).o(Label.INSTANCE.d()).o(mx.b.b(this.currencyFormatter.b(paymentSummary.getAmount(), paymentSummary.getCurrency()), "paymentReminderDescription")), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3839, null));
        }
        return new d.a.Initialized(hideable, arrayList, c(initialized.g()), e(initialized.g()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(b.f187449e0), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(b.f187499v), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
