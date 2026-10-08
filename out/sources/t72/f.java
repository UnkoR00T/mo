package t72;

import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.LatLng;
import d72.HydroArea;
import d72.HydroWarningArea;
import d72.HydroWarningLine;
import d72.HydroWarningMultiPolygon;
import d72.HydroWarningPoint;
import d72.HydroWarningPolygon;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r70.BaseFloatingActionButtonData;
import s72.State;
import vy.Coordinates;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b0\b0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b*\b\u0012\u0004\u0012\u00020\u00120\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lt72/f;", "Lxw/f;", "Lt72/f$a;", "Ls72/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Ld72/c;", "Ld72/a;", "f", "(Ljava/util/List;)Ljava/util/List;", "Ld72/g;", "", "color", "e", "(Ljava/util/List;I)Ljava/util/List;", "Ld72/f;", "Lcom/google/android/gms/maps/model/LatLng;", "h", "params", "c", "(Lt72/f$a;)Ls72/c$a;", "a", "Lmx/c;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, s72.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: t72.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Lt72/f$a;", "", "Ls72/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onResumeEvent", "onPauseEvent", "onPreciseLocationButtonClick", "onHelpAction", "<init>", "(Ls72/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls72/b;", "f", "()Ls72/b;", "b", "Ler/a;", "()Ler/a;", "c", "e", "d", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResumeEvent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPauseEvent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPreciseLocationButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHelpAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onBackAction = aVar;
            this.onResumeEvent = aVar2;
            this.onPauseEvent = aVar3;
            this.onPreciseLocationButtonClick = aVar4;
            this.onHelpAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onHelpAction;
        }

        public final er.a<i0> c() {
            return this.onPauseEvent;
        }

        public final er.a<i0> d() {
            return this.onPreciseLocationButtonClick;
        }

        public final er.a<i0> e() {
            return this.onResumeEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onResumeEvent, params.onResumeEvent) && t.c(this.onPauseEvent, params.onPauseEvent) && t.c(this.onPreciseLocationButtonClick, params.onPreciseLocationButtonClick) && t.c(this.onHelpAction, params.onHelpAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onResumeEvent.hashCode()) * 31) + this.onPauseEvent.hashCode()) * 31) + this.onPreciseLocationButtonClick.hashCode()) * 31) + this.onHelpAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onResumeEvent=" + this.onResumeEvent + ", onPauseEvent=" + this.onPauseEvent + ", onPreciseLocationButtonClick=" + this.onPreciseLocationButtonClick + ", onHelpAction=" + this.onHelpAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f188780a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1661407196);
            if (p076m2.t.k()) {
                p076m2.t.o(-1661407196, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.map.mapper.FloodAlertMapMapper.invoke.<anonymous> (FloodAlertMapMapper.kt:58)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<HydroArea> e(List<HydroWarningPolygon> list, int i15) {
        List<HydroWarningPolygon> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (HydroWarningPolygon hydroWarningPolygon : list2) {
            List<LatLng> listH = h(hydroWarningPolygon.getOutline().a());
            List<HydroWarningLine> listA = hydroWarningPolygon.a();
            ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(h(((HydroWarningLine) it.next()).a()));
            }
            arrayList.add(new HydroArea(listH, arrayList2, i15));
        }
        return arrayList;
    }

    private final List<List<List<HydroArea>>> f(List<HydroWarningArea> list) {
        ArrayList arrayList = new ArrayList();
        for (HydroWarningArea hydroWarningArea : list) {
            List<HydroWarningMultiPolygon> listB = hydroWarningArea.b();
            ArrayList arrayList2 = null;
            if (listB != null) {
                ArrayList arrayList3 = new ArrayList();
                for (HydroWarningMultiPolygon hydroWarningMultiPolygon : listB) {
                    Integer level = hydroWarningArea.getLevel();
                    List<HydroArea> listE = level != null ? e(hydroWarningMultiPolygon.a(), level.intValue()) : null;
                    if (listE != null) {
                        arrayList3.add(listE);
                    }
                }
                arrayList2 = arrayList3;
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private final List<LatLng> h(List<HydroWarningPoint> list) {
        List<HydroWarningPoint> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (HydroWarningPoint hydroWarningPoint : list2) {
            arrayList.add(new LatLng(hydroWarningPoint.getLat(), hydroWarningPoint.getLon()));
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s72.c.Data b(Params params) {
        List<List<List<HydroArea>>> listN;
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(a72.c.S), null, null, null, 119, null);
        er.a<i0> aVarA = params.a();
        er.a<i0> aVarE = params.e();
        er.a<i0> aVarC = params.c();
        boolean z15 = params.getState().getIsGpsEnabled() && params.getState().getIsGpsPermissionGranted();
        Coordinates mapViewCoordinates = params.getState().getMapViewCoordinates();
        List<HydroWarningArea> listC = params.getState().c();
        if (listC == null || (listN = f(listC)) == null) {
            listN = v.n();
        }
        return new s72.c.Data(cVar, aVarA, aVarE, aVarC, z15, mapViewCoordinates, listN, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(a72.c.R), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, b.f188780a, null, params.b(), 4, null)), null, 20, null), new BaseFloatingActionButtonData((params.getState().getIsGpsEnabled() && params.getState().getIsGpsPermissionGranted() && params.getState().getUserCurrentPosition() != null) ? jz.a.f106737b1 : jz.a.f106745c1, new BaseFloatingActionButtonData.InterfaceC4389a.Icon(c70.a.f23835a.a().o()), params.d()), null, null, 25, null));
    }
}
