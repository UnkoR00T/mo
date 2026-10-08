package ii1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.t;
import h30.ButtonData;
import hi1.InitializedData;
import i50.BaseScaffoldData;
import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import iq0.TemporaryInterruption;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k40.EmptyStateData;
import m50.ServiceWidgetData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lii1/j;", "Lii1/h;", "Lmx/c;", "labelProvider", "Lii1/d;", "airQualityWidgetMapper", "Lii1/g;", "paymentsWidgetMapper", "<init>", "(Lmx/c;Lii1/d;Lii1/g;)V", "Lhi1/d;", "Lii1/h$a;", "params", "Lhi1/g$b$c;", "h", "(Lhi1/d;Lii1/h$a;)Lhi1/g$b$c;", "", "Lah1/h;", "widgetModels", "Lkotlin/Function0;", "Loq/i0;", "onAirQualityWidgetClick", "toPayments", "Lm50/a;", "i", "(Ljava/util/Set;Ler/a;Ler/a;)Ljava/util/Set;", "Lhi1/g$b$a;", "l", "(Lii1/h$a;)Lhi1/g$b$a;", "Lhi1/g$b;", "f", "(Lii1/h$a;)Lhi1/g$b;", "Liq0/g0;", "temporaryInterruption", "Lcb4/d;", "A", "(Liq0/g0;)Lcb4/d;", "a", "Lmx/c;", "b", "Lii1/d;", "c", "Lii1/g;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d airQualityWidgetMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g paymentsWidgetMapper;

    public j(mx.c cVar, d dVar, g gVar) {
        this.labelProvider = cVar;
        this.airQualityWidgetMapper = dVar;
        this.paymentsWidgetMapper = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    private final hi1.g.b.ServicesLoaded h(InitializedData initializedData, h.ServiceListParams serviceListParams) {
        Label labelC = this.labelProvider.c(sg1.a.H1);
        List<DashboardServiceEntry> listE = initializedData.e();
        int i15 = 10;
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        int i16 = 0;
        for (Object obj : listE) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            DashboardServiceEntry dashboardServiceEntry = (DashboardServiceEntry) obj;
            arrayList.add(fh1.c.c(ji1.d.a(dashboardServiceEntry), "FavouritesServiceItem" + i16, serviceListParams.d(), dashboardServiceEntry.getType(), false, c70.a.f23835a.a().V(dashboardServiceEntry.getName(), i17, initializedData.e().size()), null, 40, null));
            i16 = i17;
        }
        List<CategoryDashboardServices> listC = initializedData.c();
        ArrayList arrayList2 = new ArrayList();
        for (CategoryDashboardServices categoryDashboardServices : listC) {
            List<DashboardServiceEntry> listB = categoryDashboardServices.b();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listB) {
                if (!initializedData.e().contains((DashboardServiceEntry) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(v.y(arrayList3, i15));
            int i18 = 0;
            for (Object obj3 : arrayList3) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                DashboardServiceEntry dashboardServiceEntry2 = (DashboardServiceEntry) obj3;
                arrayList4.add(fh1.c.c(ji1.d.a(dashboardServiceEntry2), "ServiceTypeItem" + i18, serviceListParams.d(), dashboardServiceEntry2.getType(), false, c70.a.f23835a.a().V(dashboardServiceEntry2.getName(), i19, categoryDashboardServices.b().size()), null, 40, null));
                i18 = i19;
            }
            hi1.g.CategoryItem categoryItem = new hi1.g.CategoryItem(mx.b.b(categoryDashboardServices.getName(), "Category-" + categoryDashboardServices.getName()), arrayList4);
            if (arrayList4.isEmpty()) {
                categoryItem = null;
            }
            if (categoryItem != null) {
                arrayList2.add(categoryItem);
            }
            i15 = 10;
        }
        return new hi1.g.b.ServicesLoaded(labelC, arrayList, arrayList2, new ButtonTextData("Dostosuj", this.labelProvider.c(sg1.a.f181507p1), null, null, serviceListParams.b(), 12, null), new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(null, this.labelProvider.c(sg1.a.D1), null, null, true, null, 45, null), null, null, null, null, 60, null), i(initializedData.f(), serviceListParams.a(), serviceListParams.f()));
    }

    private final Set<ServiceWidgetData> i(Set<? extends ah1.h<?>> widgetModels, er.a<i0> onAirQualityWidgetClick, er.a<i0> toPayments) {
        ServiceWidgetData serviceWidgetDataB;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = widgetModels.iterator();
        while (it.hasNext()) {
            ah1.h hVar = (ah1.h) it.next();
            if (hVar instanceof ah1.h.AirQualityWidgetData) {
                ah1.h.AirQualityWidgetData airQualityWidgetData = (ah1.h.AirQualityWidgetData) hVar;
                serviceWidgetDataB = this.airQualityWidgetMapper.b(new d.Params(onAirQualityWidgetClick, airQualityWidgetData.getData(), airQualityWidgetData.getPosition(), airQualityWidgetData.getIsLoading()));
            } else {
                if (!(hVar instanceof ah1.h.PaymentsWidgetData)) {
                    throw new p();
                }
                ah1.h.PaymentsWidgetData paymentsWidgetData = (ah1.h.PaymentsWidgetData) hVar;
                serviceWidgetDataB = this.paymentsWidgetMapper.b(new g.Params(paymentsWidgetData.getPosition(), paymentsWidgetData.getData(), paymentsWidgetData.getIsLoading(), toPayments));
            }
            if (serviceWidgetDataB != null) {
                arrayList.add(serviceWidgetDataB);
            }
        }
        return v.k1(arrayList);
    }

    private final hi1.g.b.EmptyState l(h.ServiceListParams params) {
        return new hi1.g.b.EmptyState(new EmptyStateData(null, this.labelProvider.c(sg1.a.B1), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(sg1.a.K), null, 2, null), k30.d.c.f107775a, null, params.c(), 35, null), 1, null), new BaseScaffoldData(null, new x50.i.Medium(null, this.labelProvider.c(sg1.a.D1), null, null, true, null, 45, null), null, null, null, null, 61, null));
    }

    @Override // ii1.h
    public DialogData A(TemporaryInterruption temporaryInterruption) {
        Label labelC;
        cb4.h.b bVar = cb4.h.b.f24985a;
        String title = temporaryInterruption.getTitle();
        if (title == null || (labelC = mx.b.b(title, "temporaryInterruptionTitle")) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new DialogData(bVar, labelC, mx.b.b(temporaryInterruption.getMessage(), "temporaryInterruptionMessage"), new DialogButtonTextData(this.labelProvider.c(sg1.a.f181526w), null, new er.a() { // from class: ii1.i
            @Override // er.a
            public final Object a() {
                return j.e();
            }
        }, 2, null), null, null, null, 112, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public hi1.g.b b(h.ServiceListParams params) {
        hi1.f state = params.getState();
        if (state instanceof hi1.f.DataSet) {
            return h(((hi1.f.DataSet) state).getData(), params);
        }
        if (state instanceof hi1.f.LoadingWidgets) {
            return h(((hi1.f.LoadingWidgets) state).getData(), params);
        }
        if (t.c(state, hi1.f.c.f84821a) || (state instanceof hi1.f.d)) {
            return new hi1.g.b.Loading(new BaseScaffoldData(null, new x50.i.Medium(null, this.labelProvider.c(sg1.a.D1), null, null, true, null, 45, null), null, null, null, null, 61, null));
        }
        if (state instanceof hi1.f.b) {
            return l(params);
        }
        throw new p();
    }
}
