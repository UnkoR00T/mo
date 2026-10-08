package ii1;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import java.util.Iterator;
import java.util.List;
import m50.ServiceWidgetData;
import mx.Label;
import ni1.Small;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q44.Exactly;
import q44.More;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001-B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010 \u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u0012*\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0012*\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120&H\u0002¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lii1/g;", "Lxw/f;", "Lii1/g$a;", "Lm50/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lq44/c;", "Lni1/a;", "x", "(Lq44/c;)Lni1/a;", "Lni1/b;", "z", "(Lq44/c;)Lni1/b;", "Lq44/b;", "Lmx/a;", "v", "(Lq44/b;)Lmx/a;", "Landroidx/compose/ui/graphics/Color;", "u", "(Lq44/b;Lm2/r;I)J", "", "position", "paymentsCount", "largeSlotData", "smallSlotData", "Lkotlin/Function0;", "Loq/i0;", "onClick", "q", "(ILjava/lang/Integer;Lni1/a;Lni1/b;Ler/a;)Lm50/a;", "i", "(Lni1/a;Ljava/lang/Integer;)Lmx/a;", "l", "(Lni1/b;Ljava/lang/Integer;)Lmx/a;", "", "labels", "h", "(Ljava/util/List;)Lmx/a;", "params", "m", "(Lii1/g$a;)Lm50/a;", "a", "Lmx/c;", "b", "Lez/e;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, ServiceWidgetData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ii1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lii1/g$a;", "", "", "position", "Lq44/c;", "widgetResponse", "", "isLoading", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ILq44/c;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lq44/c;", "c", "()Lq44/c;", "Z", "d", "()Z", "Ler/a;", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q44.c widgetResponse;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClick;

        public Params(int i15, q44.c cVar, boolean z15, er.a<i0> aVar) {
            this.position = i15;
            this.widgetResponse = cVar;
            this.isLoading = z15;
            this.onClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final q44.c getWidgetResponse() {
            return this.widgetResponse;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.position == params.position && t.c(this.widgetResponse, params.widgetResponse) && this.isLoading == params.isLoading && t.c(this.onClick, params.onClick);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.position) * 31;
            q44.c cVar = this.widgetResponse;
            return ((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "Params(position=" + this.position + ", widgetResponse=" + this.widgetResponse + ", isLoading=" + this.isLoading + ", onClick=" + this.onClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92898a;

        static {
            int[] iArr = new int[q44.b.values().length];
            try {
                iArr[q44.b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q44.b.IN_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q44.b.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q44.b.OVERDUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q44.b.REMITTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q44.b.ENFORCEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q44.b.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q44.b.WITHDRAWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q44.b.REGISTERED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q44.b.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f92898a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q44.c f92900b;

        c(q44.c cVar) {
            this.f92900b = cVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1768495934);
            if (p076m2.t.k()) {
                p076m2.t.o(1768495934, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.PaymentsWidgetMapper.toLargeSlotData.<anonymous> (PaymentsWidgetMapper.kt:84)");
            }
            long jU = g.this.u(((Exactly) this.f92900b).getNextPaymentStatus(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jU;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q44.c f92902b;

        d(q44.c cVar) {
            this.f92902b = cVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1362890177);
            if (p076m2.t.k()) {
                p076m2.t.o(-1362890177, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.PaymentsWidgetMapper.toLargeSlotData.<anonymous> (PaymentsWidgetMapper.kt:99)");
            }
            long jU = g.this.u(((More) this.f92902b).getNextPaymentStatus(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jU;
        }
    }

    public g(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label h(List<Label> labels) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.labelProvider.c(sg1.a.f181449a1).getText());
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            sb5.append(", " + ((Label) it.next()).getText());
        }
        return mx.b.b(sb5.toString(), "");
    }

    private final Label i(ni1.a aVar, Integer num) {
        Label labelC;
        List<Label> listQ;
        if (aVar instanceof ni1.a.Empty) {
            ni1.a.Empty empty = (ni1.a.Empty) aVar;
            listQ = v.q(empty.getTitle(), empty.getDescription());
        } else if (aVar instanceof ni1.a.Error) {
            ni1.a.Error error = (ni1.a.Error) aVar;
            listQ = v.q(error.getTitle(), error.getDescription());
        } else if (aVar instanceof ni1.a.Loading) {
            listQ = v.e(((ni1.a.Loading) aVar).getTitle());
        } else {
            if (!(aVar instanceof ni1.a.Payments)) {
                throw new oq.p();
            }
            if (num != null && num.intValue() == 1) {
                labelC = this.labelProvider.c(sg1.a.Y0);
            } else {
                labelC = (num != null && num.intValue() == 2) ? this.labelProvider.c(sg1.a.Z0) : ((ni1.a.Payments) aVar).getTitle();
            }
            ni1.a.Payments payments = (ni1.a.Payments) aVar;
            listQ = v.q(labelC, payments.getDate(), payments.getStatus(), payments.getDescription());
        }
        return h(listQ).n("paymentsWidgetStatus");
    }

    private final Label l(Small small, Integer num) {
        Label labelC;
        if (num != null && num.intValue() == 1) {
            labelC = this.labelProvider.c(sg1.a.Y0);
        } else {
            labelC = (num != null && num.intValue() == 2) ? this.labelProvider.c(sg1.a.Z0) : small.getTitle();
        }
        return h(v.e(labelC));
    }

    private final ServiceWidgetData q(int position, Integer paymentsCount, final ni1.a largeSlotData, final Small smallSlotData, er.a<i0> onClick) {
        int i15 = jz.a.M3;
        Label labelI = i(largeSlotData, paymentsCount);
        return new ServiceWidgetData("paymentsWidgetData", position, i15, null, m.b(2101074863, true, new p() { // from class: ii1.e
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g.r(smallSlotData, (r) obj, ((Integer) obj2).intValue());
            }
        }), m.b(-30590224, true, new p() { // from class: ii1.f
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g.s(largeSlotData, (r) obj, ((Integer) obj2).intValue());
            }
        }), onClick, l(smallSlotData, paymentsCount), labelI, false, 520, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Small small, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2101074863, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.PaymentsWidgetMapper.provideServiceWidgetData.<anonymous> (PaymentsWidgetMapper.kt:177)");
            }
            mi1.i.b(small, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(ni1.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-30590224, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.PaymentsWidgetMapper.provideServiceWidgetData.<anonymous> (PaymentsWidgetMapper.kt:180)");
            }
            mi1.g.g(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(q44.b bVar, r rVar, int i15) {
        long jG;
        if (p076m2.t.k()) {
            p076m2.t.o(-1237713446, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.PaymentsWidgetMapper.toColor (PaymentsWidgetMapper.kt:151)");
        }
        switch (b.f92898a[bVar.ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 9:
            case 10:
                rVar.X(263326214);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
                break;
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
                rVar.X(263332196);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                rVar.R();
                break;
            default:
                rVar.X(263320730);
                rVar.R();
                throw new oq.p();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jG;
    }

    private final Label v(q44.b bVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        switch (b.f92898a[bVar.ordinal()]) {
            case 1:
                i15 = sg1.a.W0;
                break;
            case 2:
                i15 = sg1.a.S0;
                break;
            case 3:
                i15 = sg1.a.U0;
                break;
            case 4:
                i15 = sg1.a.T0;
                break;
            case 5:
                i15 = sg1.a.P0;
                break;
            case 6:
                i15 = sg1.a.Q0;
                break;
            case 7:
                i15 = sg1.a.R0;
                break;
            case 8:
                i15 = sg1.a.X0;
                break;
            case 9:
                i15 = sg1.a.V0;
                break;
            case 10:
                i15 = sg1.a.Q;
                break;
            default:
                throw new oq.p();
        }
        return cVar.c(i15).n("paymentsWidgetStatus");
    }

    private final ni1.a x(q44.c cVar) {
        int i15;
        int i16;
        if (t.c(cVar, q44.c.a.f164750a)) {
            return new ni1.a.Empty(this.labelProvider.c(sg1.a.f181461d1), this.labelProvider.c(sg1.a.f181465e1));
        }
        if (!(cVar instanceof Exactly)) {
            if (cVar instanceof More) {
                More more = (More) cVar;
                return new ni1.a.Payments(this.labelProvider.c(sg1.a.f181469f1).n("paymentsWidgetTitle"), this.labelProvider.f(sg1.a.f181485j1, mx.b.b(this.dateFormatter.d(more.getNextPaymentDate(), fz.c.DOTTED), "nextPaymentDate")).n("paymentsWidgetDueDate"), v(more.getNextPaymentStatus()), new d(cVar), mx.b.b(more.getNextPaymentDescription(), "paymentsWidgetDescription"));
            }
            if (t.c(cVar, q44.c.b.f164751a)) {
                return new ni1.a.Error(this.labelProvider.c(sg1.a.f181453b1).n("paymentsWidgetTitle"), this.labelProvider.c(sg1.a.f181457c1).n("paymentsWidgetDescription"));
            }
            throw new oq.p();
        }
        mx.c cVar2 = this.labelProvider;
        Exactly exactly = (Exactly) cVar;
        boolean z15 = exactly.getPaymentCount() == 1;
        if (z15) {
            i15 = sg1.a.f181481i1;
        } else {
            if (z15) {
                throw new oq.p();
            }
            i15 = sg1.a.f181477h1;
        }
        Label labelN = cVar2.f(i15, mx.b.b(String.valueOf(exactly.getPaymentCount()), "paymentCount")).n("paymentsWidgetTitle");
        mx.c cVar3 = this.labelProvider;
        boolean z16 = exactly.getPaymentCount() == 1;
        if (z16) {
            i16 = sg1.a.f181473g1;
        } else {
            if (z16) {
                throw new oq.p();
            }
            i16 = sg1.a.f181485j1;
        }
        return new ni1.a.Payments(labelN, cVar3.f(i16, mx.b.b(this.dateFormatter.d(exactly.getNextPaymentDate(), fz.c.DOTTED), "nextPaymentDate")).n("paymentsWidgetDueDate"), v(exactly.getNextPaymentStatus()), new c(cVar), mx.b.b(exactly.getNextPaymentDescription(), "paymentsWidgetDescription"));
    }

    private final Small z(q44.c cVar) {
        int i15;
        if (t.c(cVar, q44.c.a.f164750a)) {
            return new Small(this.labelProvider.c(sg1.a.f181461d1).n("paymentsWidgetTitle"));
        }
        if (!(cVar instanceof Exactly)) {
            if (cVar instanceof More) {
                return new Small(this.labelProvider.c(sg1.a.f181469f1).n("paymentsWidgetTitle"));
            }
            if (t.c(cVar, q44.c.b.f164751a)) {
                return new Small(this.labelProvider.c(sg1.a.f181453b1).n("paymentsWidgetTitle"));
            }
            throw new oq.p();
        }
        mx.c cVar2 = this.labelProvider;
        Exactly exactly = (Exactly) cVar;
        boolean z15 = exactly.getPaymentCount() == 1;
        if (z15) {
            i15 = sg1.a.f181481i1;
        } else {
            if (z15) {
                throw new oq.p();
            }
            i15 = sg1.a.f181477h1;
        }
        return new Small(cVar2.f(i15, mx.b.b(String.valueOf(exactly.getPaymentCount()), "paymentCount")));
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ServiceWidgetData b(Params params) {
        if (params.getIsLoading()) {
            return q(params.getPosition(), null, new ni1.a.Loading(this.labelProvider.c(sg1.a.f181529x).n("paymentsWidgetDescription")), new Small(this.labelProvider.c(sg1.a.f181529x).n("paymentsWidgetDescription")), params.a());
        }
        q44.c widgetResponse = params.getWidgetResponse();
        if (widgetResponse == null) {
            return null;
        }
        Exactly exactly = widgetResponse instanceof Exactly ? (Exactly) widgetResponse : null;
        return q(params.getPosition(), exactly != null ? Integer.valueOf(exactly.getPaymentCount()) : null, x(widgetResponse), z(widgetResponse), params.a());
    }
}
