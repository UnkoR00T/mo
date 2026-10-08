package yy0;

import com.google.android.gms.maps.model.LatLng;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh0.BEBasicMeasurementPoint;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xy0.y0;
import zy0.PointPinItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyy0/g;", "Lxw/f;", "Lyy0/g$a;", "Lxy0/e$a;", "Lmx/c;", "labelProvider", "Lxy0/y0;", "markerIconFlyweight", "<init>", "(Lmx/c;Lxy0/y0;)V", "Lkh0/c;", "Lzy0/c;", "h", "(Lkh0/c;)Lzy0/c;", "params", "e", "(Lyy0/g$a;)Lxy0/e$a;", "a", "Lmx/c;", "b", "Lxy0/y0;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, xy0.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y0 markerIconFlyweight;

    /* JADX INFO: renamed from: yy0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b \u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b'\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b)\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b(\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b*\u0010&R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b$\u0010&¨\u0006+"}, d2 = {"Lyy0/g$a;", "", "Lxy0/d;", "state", "Lkotlin/Function1;", "Lzy0/c;", "Loq/i0;", "onPointClick", "Lkotlin/Function0;", "onBackClick", "onHelpClick", "onMoveToUserPosition", "onResumeEvent", "onPauseEvent", "onSearch", "onMapLoaded", "<init>", "(Lxy0/d;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxy0/d;", "i", "()Lxy0/d;", "b", "Ler/l;", "f", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "e", "g", "h", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final xy0.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PointPinItem, i0> onPointClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHelpClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoveToUserPosition;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResumeEvent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPauseEvent;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSearch;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMapLoaded;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(xy0.d dVar, l<? super PointPinItem, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7) {
            this.state = dVar;
            this.onPointClick = lVar;
            this.onBackClick = aVar;
            this.onHelpClick = aVar2;
            this.onMoveToUserPosition = aVar3;
            this.onResumeEvent = aVar4;
            this.onPauseEvent = aVar5;
            this.onSearch = aVar6;
            this.onMapLoaded = aVar7;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onHelpClick;
        }

        public final er.a<i0> c() {
            return this.onMapLoaded;
        }

        public final er.a<i0> d() {
            return this.onMoveToUserPosition;
        }

        public final er.a<i0> e() {
            return this.onPauseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPointClick, params.onPointClick) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onHelpClick, params.onHelpClick) && t.c(this.onMoveToUserPosition, params.onMoveToUserPosition) && t.c(this.onResumeEvent, params.onResumeEvent) && t.c(this.onPauseEvent, params.onPauseEvent) && t.c(this.onSearch, params.onSearch) && t.c(this.onMapLoaded, params.onMapLoaded);
        }

        public final l<PointPinItem, i0> f() {
            return this.onPointClick;
        }

        public final er.a<i0> g() {
            return this.onResumeEvent;
        }

        public final er.a<i0> h() {
            return this.onSearch;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onPointClick.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onHelpClick.hashCode()) * 31) + this.onMoveToUserPosition.hashCode()) * 31) + this.onResumeEvent.hashCode()) * 31) + this.onPauseEvent.hashCode()) * 31) + this.onSearch.hashCode()) * 31) + this.onMapLoaded.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final xy0.d getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPointClick=" + this.onPointClick + ", onBackClick=" + this.onBackClick + ", onHelpClick=" + this.onHelpClick + ", onMoveToUserPosition=" + this.onMoveToUserPosition + ", onResumeEvent=" + this.onResumeEvent + ", onPauseEvent=" + this.onPauseEvent + ", onSearch=" + this.onSearch + ", onMapLoaded=" + this.onMapLoaded + ')';
        }
    }

    public g(mx.c cVar, y0 y0Var) {
        this.labelProvider = cVar;
        this.markerIconFlyweight = y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d40.b.C0864b f(g gVar, PointPinItem pointPinItem) {
        return gVar.markerIconFlyweight.a(pointPinItem);
    }

    private final PointPinItem h(BEBasicMeasurementPoint bEBasicMeasurementPoint) {
        return new PointPinItem(bEBasicMeasurementPoint.getId(), new LatLng(bEBasicMeasurementPoint.getCoordinates().getLatitude(), bEBasicMeasurementPoint.getCoordinates().getLongitude()), bEBasicMeasurementPoint.getPlace(), bEBasicMeasurementPoint.getQuality());
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xy0.e.a b(Params params) {
        xy0.d state = params.getState();
        if (state instanceof xy0.d.a) {
            return xy0.e.a.C5940a.f222156a;
        }
        if (!(state instanceof xy0.d.b)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(zx0.b.L), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        List<BEBasicMeasurementPoint> listC = ((xy0.d.b) params.getState()).getInitializedModel().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(h((BEBasicMeasurementPoint) it.next()));
        }
        boolean z15 = ((xy0.d.b) params.getState()).getInitializedModel().getIsGpsEnabled() && ((xy0.d.b) params.getState()).getInitializedModel().getIsGpsPermissionGranted();
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.c.WithIcon withIcon = new k30.c.WithIcon((((xy0.d.b) params.getState()).getInitializedModel().getIsGpsEnabled() && ((xy0.d.b) params.getState()).getInitializedModel().getIsGpsPermissionGranted() && ((xy0.d.b) params.getState()).getInitializedModel().getUserCurrentPosition() != null) ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o());
        k30.d.a aVar = k30.d.a.f107773a;
        return new xy0.e.a.Initialized(baseScaffoldData, z15, arrayList, new ButtonData(null, null, large, withIcon, aVar, null, params.d(), 35, null), params.g(), params.e(), params.f(), params.a(), params.b(), params.c(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(zx0.b.f238260m), null, 2, null), aVar, null, params.h(), 35, null), !((xy0.d.b) params.getState()).getInitializedModel().c().isEmpty(), new l() { // from class: yy0.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.f(this.f230644a, (PointPinItem) obj);
            }
        });
    }
}
