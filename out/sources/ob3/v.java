package ob3;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import k40.EmptyStateData;
import n30.CardListData;
import p071kotlin.Metadata;
import rb3.SelectedPlaceData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lob3/v;", "Ll00/e;", "Lob3/v$a;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface v extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lob3/v$a;", "", "a", "b", "Lob3/v$a$a;", "Lob3/v$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ob3.v$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lob3/v$a$a;", "Lob3/v$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(hb4.c cVar) {
                this.vmsAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.vmsAdapter, ((Error) other).vmsAdapter);
            }

            public int hashCode() {
                return this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: ob3.v$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"Lob3/v$a$b;", "Lob3/v$a;", "Li50/a;", "scaffoldData", "Lj50/e;", "searchBarData", "Lob3/v$a$b$a;", "mapData", "Lob3/v$a$b$b;", "searchData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lj50/e;Lob3/v$a$b$a;Lob3/v$a$b$b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lj50/e;", "d", "()Lj50/e;", "Lob3/v$a$b$a;", "()Lob3/v$a$b$a;", "Lob3/v$a$b$b;", "e", "()Lob3/v$a$b$b;", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchBarData searchBarData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final MapData mapData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC3582b searchData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: ob3.v$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001\u0017B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001b\u0010#R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b\u0017\u0010&¨\u0006)"}, d2 = {"Lob3/v$a$b$a;", "", "", "isLoaded", "Lkotlin/Function0;", "Loq/i0;", "onLoaded", "Lrb3/a;", "selectedPlace", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "onClick", "<init>", "(ZLer/a;Lrb3/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Ler/a;", "c", "()Ler/a;", "Lrb3/a;", "d", "()Lrb3/a;", "Ler/l;", "()Ler/l;", "Lcom/google/android/gms/maps/model/CameraPosition;", "Lcom/google/android/gms/maps/model/CameraPosition;", "()Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "f", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class MapData {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final C3581a f144365f = new C3581a(null);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final LatLng f144366g = new LatLng(52.06522d, 19.25248d);

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isLoaded;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onLoaded;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final SelectedPlaceData selectedPlace;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.l<LatLng, oq.i0> onClick;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                private final CameraPosition initialCameraPosition = CameraPosition.h(f144366g, 1.0f);

                /* JADX INFO: renamed from: ob3.v$a$b$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lob3/v$a$b$a$a;", "", "<init>", "()V", "", "DEFAULT_ZOOM", "F", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                private static final class C3581a {
                    public /* synthetic */ C3581a(fr.k kVar) {
                        this();
                    }

                    private C3581a() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public MapData(boolean z15, er.a<oq.i0> aVar, SelectedPlaceData selectedPlaceData, er.l<? super LatLng, oq.i0> lVar) {
                    this.isLoaded = z15;
                    this.onLoaded = aVar;
                    this.selectedPlace = selectedPlaceData;
                    this.onClick = lVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CameraPosition getInitialCameraPosition() {
                    return this.initialCameraPosition;
                }

                public final er.l<LatLng, oq.i0> b() {
                    return this.onClick;
                }

                public final er.a<oq.i0> c() {
                    return this.onLoaded;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final SelectedPlaceData getSelectedPlace() {
                    return this.selectedPlace;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final boolean getIsLoaded() {
                    return this.isLoaded;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapData)) {
                        return false;
                    }
                    MapData mapData = (MapData) other;
                    return this.isLoaded == mapData.isLoaded && fr.t.c(this.onLoaded, mapData.onLoaded) && fr.t.c(this.selectedPlace, mapData.selectedPlace) && fr.t.c(this.onClick, mapData.onClick);
                }

                public int hashCode() {
                    int iHashCode = ((Boolean.hashCode(this.isLoaded) * 31) + this.onLoaded.hashCode()) * 31;
                    SelectedPlaceData selectedPlaceData = this.selectedPlace;
                    return ((iHashCode + (selectedPlaceData == null ? 0 : selectedPlaceData.hashCode())) * 31) + this.onClick.hashCode();
                }

                public String toString() {
                    return "MapData(isLoaded=" + this.isLoaded + ", onLoaded=" + this.onLoaded + ", selectedPlace=" + this.selectedPlace + ", onClick=" + this.onClick + ')';
                }
            }

            /* JADX INFO: renamed from: ob3.v$a$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lob3/v$a$b$b;", "", "a", "c", "b", "Lob3/v$a$b$b$a;", "Lob3/v$a$b$b$b;", "Lob3/v$a$b$b$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InterfaceC3582b {

                /* JADX INFO: renamed from: ob3.v$a$b$b$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lob3/v$a$b$b$a;", "Lob3/v$a$b$b;", "Lk40/a;", "data", "<init>", "(Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk40/a;", "()Lk40/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Empty implements InterfaceC3582b {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final int f144372b = EmptyStateData.f108236d;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final EmptyStateData data;

                    public Empty(EmptyStateData emptyStateData) {
                        this.data = emptyStateData;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final EmptyStateData getData() {
                        return this.data;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Empty) && fr.t.c(this.data, ((Empty) other).data);
                    }

                    public int hashCode() {
                        return this.data.hashCode();
                    }

                    public String toString() {
                        return "Empty(data=" + this.data + ')';
                    }
                }

                /* JADX INFO: renamed from: ob3.v$a$b$b$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lob3/v$a$b$b$b;", "Lob3/v$a$b$b;", "Ln30/b;", "cards", "<init>", "(Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "()Ln30/b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Hints implements InterfaceC3582b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final CardListData cards;

                    public Hints(CardListData cardListData) {
                        this.cards = cardListData;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final CardListData getCards() {
                        return this.cards;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Hints) && fr.t.c(this.cards, ((Hints) other).cards);
                    }

                    public int hashCode() {
                        return this.cards.hashCode();
                    }

                    public String toString() {
                        return "Hints(cards=" + this.cards + ')';
                    }
                }

                /* JADX INFO: renamed from: ob3.v$a$b$b$c */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lob3/v$a$b$b$c;", "Lob3/v$a$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class c implements InterfaceC3582b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final c f144375a = new c();

                    private c() {
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof c);
                    }

                    public int hashCode() {
                        return 1799989940;
                    }

                    public String toString() {
                        return "Loading";
                    }
                }
            }

            public Initialized(BaseScaffoldData baseScaffoldData, SearchBarData searchBarData, MapData mapData, InterfaceC3582b interfaceC3582b, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.searchBarData = searchBarData;
                this.mapData = mapData;
                this.searchData = interfaceC3582b;
                this.onBack = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final MapData getMapData() {
                return this.mapData;
            }

            public final er.a<oq.i0> b() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final SearchBarData getSearchBarData() {
                return this.searchBarData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final InterfaceC3582b getSearchData() {
                return this.searchData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.searchBarData, initialized.searchBarData) && fr.t.c(this.mapData, initialized.mapData) && fr.t.c(this.searchData, initialized.searchData) && fr.t.c(this.onBack, initialized.onBack);
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.searchBarData.hashCode()) * 31) + this.mapData.hashCode()) * 31;
                InterfaceC3582b interfaceC3582b = this.searchData;
                return ((iHashCode + (interfaceC3582b == null ? 0 : interfaceC3582b.hashCode())) * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", searchBarData=" + this.searchBarData + ", mapData=" + this.mapData + ", searchData=" + this.searchData + ", onBack=" + this.onBack + ')';
            }
        }
    }
}
