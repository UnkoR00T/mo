package fi1;

import androidx.compose.ui.graphics.Color;
import ei1.State;
import er.l;
import er.p;
import fr.t;
import gi1.OtherServiceSection;
import gi1.ServicesFavouritesScreenModel;
import gi1.UserServiceSection;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import iq0.DashboardServiceEntry;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfi1/b;", "Lxw/f;", "Lfi1/b$a;", "Lei1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Liq0/p;", "Lkotlin/Function1;", "Loq/i0;", "removeServiceClickAction", "Ln50/g;", "i", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "params", "userServiceList", "otherServiceList", "Lgi1/b;", "h", "(Lfi1/b$a;Ljava/util/List;Ljava/util/List;)Lgi1/b;", "", "serviceName", "Lmx/a;", "e", "(Ljava/lang/String;)Lmx/a;", "f", "(Lfi1/b$a;)Lei1/c$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, ei1.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: fi1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0019\u0010\"R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lfi1/b$a;", "", "Lei1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "Lkotlin/Function1;", "Liq0/p;", "removeServiceClickAction", "addServiceClickAction", "Lkotlin/Function2;", "", "reorderFavoriteServicesAction", "<init>", "(Lei1/b;Ler/a;Ler/l;Ler/l;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lei1/b;", "e", "()Lei1/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "Ler/p;", "()Ler/p;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DashboardServiceEntry, i0> removeServiceClickAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DashboardServiceEntry, i0> addServiceClickAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, Integer, i0> reorderFavoriteServicesAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super DashboardServiceEntry, i0> lVar, l<? super DashboardServiceEntry, i0> lVar2, p<? super Integer, ? super Integer, i0> pVar) {
            this.state = state;
            this.onCloseButtonClick = aVar;
            this.removeServiceClickAction = lVar;
            this.addServiceClickAction = lVar2;
            this.reorderFavoriteServicesAction = pVar;
        }

        public final l<DashboardServiceEntry, i0> a() {
            return this.addServiceClickAction;
        }

        public final er.a<i0> b() {
            return this.onCloseButtonClick;
        }

        public final l<DashboardServiceEntry, i0> c() {
            return this.removeServiceClickAction;
        }

        public final p<Integer, Integer, i0> d() {
            return this.reorderFavoriteServicesAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCloseButtonClick, params.onCloseButtonClick) && t.c(this.removeServiceClickAction, params.removeServiceClickAction) && t.c(this.addServiceClickAction, params.addServiceClickAction) && t.c(this.reorderFavoriteServicesAction, params.reorderFavoriteServicesAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onCloseButtonClick.hashCode()) * 31) + this.removeServiceClickAction.hashCode()) * 31) + this.addServiceClickAction.hashCode()) * 31) + this.reorderFavoriteServicesAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseButtonClick=" + this.onCloseButtonClick + ", removeServiceClickAction=" + this.removeServiceClickAction + ", addServiceClickAction=" + this.addServiceClickAction + ", reorderFavoriteServicesAction=" + this.reorderFavoriteServicesAction + ')';
        }
    }

    /* JADX INFO: renamed from: fi1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1428b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1428b f64128a = new C1428b();

        C1428b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-768101926);
            if (p076m2.t.k()) {
                p076m2.t.o(-768101926, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.mappers.ServicesFavouritesScreenMapper.toSingleCards.<anonymous>.<anonymous> (ServicesFavouritesScreenMapper.kt:69)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(String serviceName) {
        return this.labelProvider.e(sg1.a.A1, serviceName);
    }

    private final ServicesFavouritesScreenModel h(Params params, List<DefaultSingleCardData> userServiceList, List<DashboardServiceEntry> otherServiceList) {
        return new ServicesFavouritesScreenModel(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(sg1.a.f181513r1), null, null, false, null, 60, null), null, null, null, null, 60, null), this.labelProvider.c(sg1.a.f181501n1), new UserServiceSection(this.labelProvider.c(sg1.a.H1), this.labelProvider.c(sg1.a.f181504o1), this.labelProvider.c(sg1.a.f181497m1), userServiceList), new OtherServiceSection(this.labelProvider.c(sg1.a.G1), new EmptyStateData(this.labelProvider.c(sg1.a.F1), this.labelProvider.c(sg1.a.E1), null, 4, null), otherServiceList, params.a()), this.labelProvider.c(sg1.a.C1).getText(), params.d());
    }

    private final List<DefaultSingleCardData> i(List<DashboardServiceEntry> list, final l<? super DashboardServiceEntry, i0> lVar) {
        List<DashboardServiceEntry> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final DashboardServiceEntry dashboardServiceEntry : list2) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(dashboardServiceEntry.getName(), mx.b.c(dashboardServiceEntry.getType().name()) + "Tag"), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new d.IconButton(new ButtonIconData(null, jz.a.f106911z1, C1428b.f64128a, null, e(dashboardServiceEntry.getName()), new er.a() { // from class: fi1.a
                @Override // er.a
                public final Object a() {
                    return b.l(lVar, dashboardServiceEntry);
                }
            }, 9, null)), null, 5, null), new x0.Icon(jz.a.f106909z, null, null, 6, null), null, 2303, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, DashboardServiceEntry dashboardServiceEntry) {
        lVar.b(dashboardServiceEntry);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ei1.c.Data b(Params params) {
        return new ei1.c.Data(h(params, i(params.getState().d(), params.c()), v.H0(params.getState().c(), v.k1(params.getState().d()))));
    }
}
