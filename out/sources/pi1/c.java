package pi1;

import ah1.g;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import iq0.DashboardServiceEntry;
import iq0.q;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oi1.State;
import oi1.e;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpi1/c;", "Lxw/f;", "Lpi1/c$a;", "Loi1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lpi1/c$a;)Loi1/e$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: pi1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Lpi1/c$a;", "", "Loi1/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "changeAirQualityWidgetStateAction", "changeEPaymentsWidgetState", "isEPaymentsWidgetRemoteFFActive", "isAirQualityWidgetRemoteFFActive", "Lkotlin/Function0;", "onBack", "<init>", "(Loi1/d;Ler/l;Ler/l;ZZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loi1/d;", "d", "()Loi1/d;", "b", "Ler/l;", "()Ler/l;", "c", "Z", "f", "()Z", "e", "Ler/a;", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> changeAirQualityWidgetStateAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> changeEPaymentsWidgetState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEPaymentsWidgetRemoteFFActive;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAirQualityWidgetRemoteFFActive;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Boolean, i0> lVar, l<? super Boolean, i0> lVar2, boolean z15, boolean z16, er.a<i0> aVar) {
            this.state = state;
            this.changeAirQualityWidgetStateAction = lVar;
            this.changeEPaymentsWidgetState = lVar2;
            this.isEPaymentsWidgetRemoteFFActive = z15;
            this.isAirQualityWidgetRemoteFFActive = z16;
            this.onBack = aVar;
        }

        public final l<Boolean, i0> a() {
            return this.changeAirQualityWidgetStateAction;
        }

        public final l<Boolean, i0> b() {
            return this.changeEPaymentsWidgetState;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsAirQualityWidgetRemoteFFActive() {
            return this.isAirQualityWidgetRemoteFFActive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.changeAirQualityWidgetStateAction, params.changeAirQualityWidgetStateAction) && t.c(this.changeEPaymentsWidgetState, params.changeEPaymentsWidgetState) && this.isEPaymentsWidgetRemoteFFActive == params.isEPaymentsWidgetRemoteFFActive && this.isAirQualityWidgetRemoteFFActive == params.isAirQualityWidgetRemoteFFActive && t.c(this.onBack, params.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsEPaymentsWidgetRemoteFFActive() {
            return this.isEPaymentsWidgetRemoteFFActive;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.changeAirQualityWidgetStateAction.hashCode()) * 31) + this.changeEPaymentsWidgetState.hashCode()) * 31) + Boolean.hashCode(this.isEPaymentsWidgetRemoteFFActive)) * 31) + Boolean.hashCode(this.isAirQualityWidgetRemoteFFActive)) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", changeAirQualityWidgetStateAction=" + this.changeAirQualityWidgetStateAction + ", changeEPaymentsWidgetState=" + this.changeEPaymentsWidgetState + ", isEPaymentsWidgetRemoteFFActive=" + this.isEPaymentsWidgetRemoteFFActive + ", isAirQualityWidgetRemoteFFActive=" + this.isAirQualityWidgetRemoteFFActive + ", onBack=" + this.onBack + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, boolean z15) {
        params.a().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, boolean z15) {
        params.b().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.Data b(final Params params) {
        List<DashboardServiceEntry> listD;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(sg1.a.f181537z1), null, null, false, null, 60, null), null, null, null, null, 60, null);
        Label labelC = this.labelProvider.c(sg1.a.f181534y1);
        DefaultSingleCardData defaultSingleCardData = null;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(sg1.a.f181522u1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(sg1.a.f181519t1), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Switch(new s50.a.C4550a("airQualitySwitch", params.getState().c().contains(g.AIR_QUALITY), true, new l() { // from class: pi1.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, ((Boolean) obj).booleanValue());
            }
        }, null, null, null, false, 240, null)), null, 2815, null);
        if (!params.getIsAirQualityWidgetRemoteFFActive()) {
            defaultSingleCardData2 = null;
        }
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(sg1.a.f181531x1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(sg1.a.f181528w1), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Switch(new s50.a.C4550a("paymentsSwitch", params.getState().c().contains(g.EPAYMENTS), true, new l() { // from class: pi1.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, ((Boolean) obj).booleanValue());
            }
        }, null, null, null, false, 240, null)), null, 2815, null);
        if (params.getIsEPaymentsWidgetRemoteFFActive() && (listD = params.getState().d()) != null && q.a(listD, rq0.c.E_PAYMENTS)) {
            defaultSingleCardData = defaultSingleCardData3;
        }
        return new e.Data(baseScaffoldData, labelC, new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData), null, false, null, null, 30, null), params.c());
    }
}
