package rb3;

import fr.t;
import p071kotlin.Metadata;
import vy.Coordinates;
import z93.Place;

/* JADX INFO: renamed from: rb3.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrb3/b;", "", "", "query", "Lrb3/b$b;", "selectedPlaceType", "Lrb3/b$a;", "hintsState", "<init>", "(Ljava/lang/String;Lrb3/b$b;Lrb3/b$a;)V", "a", "(Ljava/lang/String;Lrb3/b$b;Lrb3/b$a;)Lrb3/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lrb3/b$b;", "e", "()Lrb3/b$b;", "c", "Lrb3/b$a;", "()Lrb3/b$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripStateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC4414b selectedPlaceType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a hintsState;

    /* JADX INFO: renamed from: rb3.b$a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lrb3/b$a;", "", "a", "b", "c", "Lrb3/b$a$a;", "Lrb3/b$a$b;", "Lrb3/b$a$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: rb3.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrb3/b$a$a;", "Lrb3/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4412a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4412a f172995a = new C4412a();

            private C4412a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4412a);
            }

            public int hashCode() {
                return -298520027;
            }

            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: rb3.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrb3/b$a$b;", "Lrb3/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4413b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4413b f172996a = new C4413b();

            private C4413b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4413b);
            }

            public int hashCode() {
                return 1507240053;
            }

            public String toString() {
                return "InProgress";
            }
        }

        /* JADX INFO: renamed from: rb3.b$a$c */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrb3/b$a$c;", "Lrb3/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f172997a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 295199364;
            }

            public String toString() {
                return "NotInitialized";
            }
        }
    }

    /* JADX INFO: renamed from: rb3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\t\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lrb3/b$b;", "", "", "a", "()Z", "Lvy/c;", "m", "()Lvy/c;", "coordinates", "b", "Lrb3/b$b$a;", "Lrb3/b$b$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC4414b {

        /* JADX INFO: renamed from: rb3.b$b$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lrb3/b$b$a;", "Lrb3/b$b;", "a", "b", "Lrb3/b$b$a$a;", "Lrb3/b$b$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a extends InterfaceC4414b {

            /* JADX INFO: renamed from: rb3.b$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrb3/b$b$a$a;", "Lrb3/b$b$a;", "Lvy/c;", "coordinates", "<init>", "(Lvy/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy/c;", "m", "()Lvy/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PlaceInPoland implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f172998b = Coordinates.f208679c;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Coordinates coordinates;

                public PlaceInPoland(Coordinates coordinates) {
                    this.coordinates = coordinates;
                }

                @Override // rb3.TripStateData.InterfaceC4414b
                public /* bridge */ boolean a() {
                    return super.a();
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PlaceInPoland) && t.c(this.coordinates, ((PlaceInPoland) other).coordinates);
                }

                public int hashCode() {
                    return this.coordinates.hashCode();
                }

                @Override // rb3.TripStateData.InterfaceC4414b
                /* JADX INFO: renamed from: m, reason: from getter */
                public Coordinates getCoordinates() {
                    return this.coordinates;
                }

                public String toString() {
                    return "PlaceInPoland(coordinates=" + this.coordinates + ')';
                }
            }

            /* JADX INFO: renamed from: rb3.b$b$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrb3/b$b$a$b;", "Lrb3/b$b$a;", "Lvy/c;", "coordinates", "<init>", "(Lvy/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy/c;", "m", "()Lvy/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Unknown implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f173000b = Coordinates.f208679c;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Coordinates coordinates;

                public Unknown(Coordinates coordinates) {
                    this.coordinates = coordinates;
                }

                @Override // rb3.TripStateData.InterfaceC4414b
                public /* bridge */ boolean a() {
                    return super.a();
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Unknown) && t.c(this.coordinates, ((Unknown) other).coordinates);
                }

                public int hashCode() {
                    return this.coordinates.hashCode();
                }

                @Override // rb3.TripStateData.InterfaceC4414b
                /* JADX INFO: renamed from: m, reason: from getter */
                public Coordinates getCoordinates() {
                    return this.coordinates;
                }

                public String toString() {
                    return "Unknown(coordinates=" + this.coordinates + ')';
                }
            }
        }

        /* JADX INFO: renamed from: rb3.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lrb3/b$b$b;", "Lrb3/b$b;", "Lz93/c;", "value", "<init>", "(Lz93/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/c;", "b", "()Lz93/c;", "Lvy/c;", "m", "()Lvy/c;", "coordinates", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Supported implements InterfaceC4414b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f173002b = Coordinates.f208679c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Place value;

            public Supported(Place place) {
                this.value = place;
            }

            @Override // rb3.TripStateData.InterfaceC4414b
            public /* bridge */ boolean a() {
                return super.a();
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Place getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Supported) && t.c(this.value, ((Supported) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @Override // rb3.TripStateData.InterfaceC4414b
            /* JADX INFO: renamed from: m */
            public Coordinates getCoordinates() {
                return this.value.getCoordinates();
            }

            public String toString() {
                return "Supported(value=" + this.value + ')';
            }
        }

        default boolean a() {
            return this instanceof Supported;
        }

        /* JADX INFO: renamed from: m */
        Coordinates getCoordinates();
    }

    public TripStateData(String str, InterfaceC4414b interfaceC4414b, a aVar) {
        this.query = str;
        this.selectedPlaceType = interfaceC4414b;
        this.hintsState = aVar;
    }

    public static /* synthetic */ TripStateData b(TripStateData tripStateData, String str, InterfaceC4414b interfaceC4414b, a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = tripStateData.query;
        }
        if ((i15 & 2) != 0) {
            interfaceC4414b = tripStateData.selectedPlaceType;
        }
        if ((i15 & 4) != 0) {
            aVar = tripStateData.hintsState;
        }
        return tripStateData.a(str, interfaceC4414b, aVar);
    }

    public final TripStateData a(String query, InterfaceC4414b selectedPlaceType, a hintsState) {
        return new TripStateData(query, selectedPlaceType, hintsState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getHintsState() {
        return this.hintsState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC4414b getSelectedPlaceType() {
        return this.selectedPlaceType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripStateData)) {
            return false;
        }
        TripStateData tripStateData = (TripStateData) other;
        return t.c(this.query, tripStateData.query) && t.c(this.selectedPlaceType, tripStateData.selectedPlaceType) && t.c(this.hintsState, tripStateData.hintsState);
    }

    public int hashCode() {
        int iHashCode = this.query.hashCode() * 31;
        InterfaceC4414b interfaceC4414b = this.selectedPlaceType;
        return ((iHashCode + (interfaceC4414b == null ? 0 : interfaceC4414b.hashCode())) * 31) + this.hintsState.hashCode();
    }

    public String toString() {
        return "TripStateData(query=" + this.query + ", selectedPlaceType=" + this.selectedPlaceType + ", hintsState=" + this.hintsState + ')';
    }
}
