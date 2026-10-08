package xy0;

import com.google.android.gms.maps.model.LatLng;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import p071kotlin.Metadata;
import zy0.PointPinItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\tR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lxy0/e;", "Ll00/e;", "Lxy0/e$a;", "Lmu/g;", "Lxy0/e$b;", "T8", "()Lmu/g;", "sideEffects", "a", "b", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lxy0/e$a;", "", "a", "b", "Lxy0/e$a$a;", "Lxy0/e$a$b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: xy0.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxy0/e$a$a;", "Lxy0/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5940a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5940a f222156a = new C5940a();

            private C5940a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5940a);
            }

            public int hashCode() {
                return 27790977;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: xy0.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b1\u00104R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b:\u00104R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b;\u00100R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b<\u0010*R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u000f8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b+\u00109¨\u0006>"}, d2 = {"Lxy0/e$a$b;", "Lxy0/e$a;", "Li50/a;", "baseScaffoldData", "", "isMyLocationEnabled", "", "Lzy0/c;", "clustersList", "Lh30/a;", "navigationButtonData", "Lkotlin/Function0;", "Loq/i0;", "onResumeEvent", "onPauseEvent", "Lkotlin/Function1;", "onPointClick", "onBackClick", "onHelpClick", "onMapLoaded", "searchButtonData", "shouldSearchButtonVisible", "Ld40/b$b;", "getPinIconData", "<init>", "(Li50/a;ZLjava/util/List;Lh30/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Lh30/a;ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Z", "l", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lh30/a;", "()Lh30/a;", "e", "Ler/a;", "i", "()Ler/a;", "f", "g", "Ler/l;", "h", "()Ler/l;", "getOnHelpClick", "j", "k", "m", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isMyLocationEnabled;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<PointPinItem> clustersList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData navigationButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onResumeEvent;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onPauseEvent;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<PointPinItem, oq.i0> onPointClick;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onHelpClick;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onMapLoaded;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData searchButtonData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldSearchButtonVisible;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<PointPinItem, d40.b.C0864b> getPinIconData;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, boolean z15, List<PointPinItem> list, ButtonData buttonData, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.l<? super PointPinItem, oq.i0> lVar, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, er.a<oq.i0> aVar5, ButtonData buttonData2, boolean z16, er.l<? super PointPinItem, d40.b.C0864b> lVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.isMyLocationEnabled = z15;
                this.clustersList = list;
                this.navigationButtonData = buttonData;
                this.onResumeEvent = aVar;
                this.onPauseEvent = aVar2;
                this.onPointClick = lVar;
                this.onBackClick = aVar3;
                this.onHelpClick = aVar4;
                this.onMapLoaded = aVar5;
                this.searchButtonData = buttonData2;
                this.shouldSearchButtonVisible = z16;
                this.getPinIconData = lVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<PointPinItem> b() {
                return this.clustersList;
            }

            public final er.l<PointPinItem, d40.b.C0864b> c() {
                return this.getPinIconData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getNavigationButtonData() {
                return this.navigationButtonData;
            }

            public final er.a<oq.i0> e() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && this.isMyLocationEnabled == initialized.isMyLocationEnabled && fr.t.c(this.clustersList, initialized.clustersList) && fr.t.c(this.navigationButtonData, initialized.navigationButtonData) && fr.t.c(this.onResumeEvent, initialized.onResumeEvent) && fr.t.c(this.onPauseEvent, initialized.onPauseEvent) && fr.t.c(this.onPointClick, initialized.onPointClick) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.onHelpClick, initialized.onHelpClick) && fr.t.c(this.onMapLoaded, initialized.onMapLoaded) && fr.t.c(this.searchButtonData, initialized.searchButtonData) && this.shouldSearchButtonVisible == initialized.shouldSearchButtonVisible && fr.t.c(this.getPinIconData, initialized.getPinIconData);
            }

            public final er.a<oq.i0> f() {
                return this.onMapLoaded;
            }

            public final er.a<oq.i0> g() {
                return this.onPauseEvent;
            }

            public final er.l<PointPinItem, oq.i0> h() {
                return this.onPointClick;
            }

            public int hashCode() {
                return (((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + Boolean.hashCode(this.isMyLocationEnabled)) * 31) + this.clustersList.hashCode()) * 31) + this.navigationButtonData.hashCode()) * 31) + this.onResumeEvent.hashCode()) * 31) + this.onPauseEvent.hashCode()) * 31) + this.onPointClick.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onHelpClick.hashCode()) * 31) + this.onMapLoaded.hashCode()) * 31) + this.searchButtonData.hashCode()) * 31) + Boolean.hashCode(this.shouldSearchButtonVisible)) * 31) + this.getPinIconData.hashCode();
            }

            public final er.a<oq.i0> i() {
                return this.onResumeEvent;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final ButtonData getSearchButtonData() {
                return this.searchButtonData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getShouldSearchButtonVisible() {
                return this.shouldSearchButtonVisible;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getIsMyLocationEnabled() {
                return this.isMyLocationEnabled;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", clustersList=" + this.clustersList + ", navigationButtonData=" + this.navigationButtonData + ", onResumeEvent=" + this.onResumeEvent + ", onPauseEvent=" + this.onPauseEvent + ", onPointClick=" + this.onPointClick + ", onBackClick=" + this.onBackClick + ", onHelpClick=" + this.onHelpClick + ", onMapLoaded=" + this.onMapLoaded + ", searchButtonData=" + this.searchButtonData + ", shouldSearchButtonVisible=" + this.shouldSearchButtonVisible + ", getPinIconData=" + this.getPinIconData + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxy0/e$b;", "", "a", "Lxy0/e$b$a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: xy0.e$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxy0/e$b$a;", "Lxy0/e$b;", "Lcom/google/android/gms/maps/model/LatLng;", "coordinates", "Lxy0/e$b$a$a;", "type", "Lkotlin/Function0;", "Loq/i0;", "onFinished", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;Lxy0/e$b$a$a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "b", "Lxy0/e$b$a$a;", "c", "()Lxy0/e$b$a$a;", "Ler/a;", "()Ler/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MoveCamera implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LatLng coordinates;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC5941a type;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onFinished;

            /* JADX INFO: renamed from: xy0.e$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lxy0/e$b$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum EnumC5941a {
                POINT,
                USER;


                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final /* synthetic */ wq.a f222176d = wq.b.a(b());
            }

            public MoveCamera(LatLng latLng, EnumC5941a enumC5941a, er.a<oq.i0> aVar) {
                this.coordinates = latLng;
                this.type = enumC5941a;
                this.onFinished = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LatLng getCoordinates() {
                return this.coordinates;
            }

            public final er.a<oq.i0> b() {
                return this.onFinished;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final EnumC5941a getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MoveCamera)) {
                    return false;
                }
                MoveCamera moveCamera = (MoveCamera) other;
                return fr.t.c(this.coordinates, moveCamera.coordinates) && this.type == moveCamera.type && fr.t.c(this.onFinished, moveCamera.onFinished);
            }

            public int hashCode() {
                int iHashCode = ((this.coordinates.hashCode() * 31) + this.type.hashCode()) * 31;
                er.a<oq.i0> aVar = this.onFinished;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public String toString() {
                return "MoveCamera(coordinates=" + this.coordinates + ", type=" + this.type + ", onFinished=" + this.onFinished + ')';
            }
        }
    }

    mu.g<b> T8();
}
