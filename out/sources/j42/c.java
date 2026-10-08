package j42;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i42.d;
import i42.e;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lj42/c;", "Lxw/f;", "Lj42/c$a;", "Li42/e$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "f", "(Lj42/c$a;)Li42/e$a;", "a", "Lmx/c;", "b", "Lu04/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: j42.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"Lj42/c$a;", "", "Li42/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "toPaymentsYourCardsAction", "toStampDutyPaymentsAction", "toPaymentsHistoryAction", "Lkotlin/Function1;", "", "openUrlIntentAction", "<init>", "(Li42/d;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li42/d;", "c", "()Li42/d;", "b", "Ler/a;", "()Ler/a;", "e", "d", "f", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toPaymentsYourCardsAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toStampDutyPaymentsAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toPaymentsHistoryAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrlIntentAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super String, i0> lVar) {
            this.state = dVar;
            this.onBackAction = aVar;
            this.toPaymentsYourCardsAction = aVar2;
            this.toStampDutyPaymentsAction = aVar3;
            this.toPaymentsHistoryAction = aVar4;
            this.openUrlIntentAction = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<String, i0> b() {
            return this.openUrlIntentAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.toPaymentsHistoryAction;
        }

        public final er.a<i0> e() {
            return this.toPaymentsYourCardsAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.toPaymentsYourCardsAction, params.toPaymentsYourCardsAction) && t.c(this.toStampDutyPaymentsAction, params.toStampDutyPaymentsAction) && t.c(this.toPaymentsHistoryAction, params.toPaymentsHistoryAction) && t.c(this.openUrlIntentAction, params.openUrlIntentAction);
        }

        public final er.a<i0> f() {
            return this.toStampDutyPaymentsAction;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.toPaymentsYourCardsAction.hashCode()) * 31) + this.toStampDutyPaymentsAction.hashCode()) * 31) + this.toPaymentsHistoryAction.hashCode()) * 31) + this.openUrlIntentAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", toPaymentsYourCardsAction=" + this.toPaymentsYourCardsAction + ", toStampDutyPaymentsAction=" + this.toStampDutyPaymentsAction + ", toPaymentsHistoryAction=" + this.toPaymentsHistoryAction + ", openUrlIntentAction=" + this.openUrlIntentAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99413a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(648349650);
            if (p076m2.t.k()) {
                p076m2.t.o(648349650, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.mapper.PaymentsDashboardMapper.invoke.<anonymous> (PaymentsDashboardMapper.kt:52)");
            }
            long jA = ((f42.a) rVar.N(f42.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public c(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, c cVar, String str) {
        params.b().b(cVar.commonEndpoints.j());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        k42.a withPayments;
        d state = params.getState();
        if (t.c(state, d.a.f89159a)) {
            return e.a.C2103a.f89162a;
        }
        if (!(state instanceof d.b)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(t32.b.X0), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.M3, null, b.f99413a, this.labelProvider.c(t32.b.Y), this.labelProvider.c(t32.b.X), null, 34, null);
        Label labelC = this.labelProvider.c(t32.b.Z0);
        int i15 = jz.a.G;
        o50.f.c cVar = o50.f.c.f142478a;
        ShortcutsLayoutData shortcutsLayoutData = new ShortcutsLayoutData(v.q(new SmallCardData(null, labelC, null, i15, cVar, false, params.f(), 37, null), new SmallCardData(null, this.labelProvider.c(t32.b.Y0), null, jz.a.f106797j, cVar, false, params.d(), 37, null), new SmallCardData(null, this.labelProvider.c(t32.b.f187435a1), null, jz.a.C, cVar, false, params.e(), 37, null)), new ShortcutMoreData(Label.INSTANCE.c(), new l() { // from class: j42.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h((List) obj);
            }
        }));
        Label labelC2 = this.labelProvider.c(t32.b.f187438b0);
        d.b bVar = (d.b) params.getState();
        if (t.c(bVar, d.b.a.f89160a)) {
            withPayments = new k42.a.NoPayments(this.labelProvider.c(t32.b.Z), new LinkData(null, this.labelProvider.c(t32.b.f187469l), this.commonEndpoints.j(), LinkData.EnumC5775a.WEBSITE, false, new l() { // from class: j42.b
                @Override // er.l
                public final Object b(Object obj) {
                    return c.i(params, this, (String) obj);
                }
            }, 17, null));
        } else {
            if (!t.c(bVar, d.b.C2102b.f89161a)) {
                throw new oq.p();
            }
            withPayments = new k42.a.WithPayments(this.labelProvider.c(t32.b.f187434a0));
        }
        return new e.a.Initialized(baseScaffoldData, icon, shortcutsLayoutData, labelC2, withPayments);
    }
}
