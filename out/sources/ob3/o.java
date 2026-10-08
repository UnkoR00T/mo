package ob3;

import java.util.UUID;
import p071kotlin.Metadata;
import rb3.TripStateData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lob3/o;", "", "Lrb3/b;", "getData", "()Lrb3/b;", "data", "a", "c", "b", "Lob3/o$a;", "Lob3/o$b;", "Lob3/o$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lob3/o$a;", "Lob3/o;", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lob3/p;", "Lob3/s;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends o {
        hb4.c a();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lob3/o$b;", "Lob3/o;", "a", "b", "Lob3/p;", "Lob3/q;", "Lob3/r;", "Lob3/o$b$a;", "Lob3/o$b$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends o {

        /* JADX INFO: renamed from: ob3.o$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lob3/o$b$a;", "Lob3/o$b;", "Lrb3/b;", "data", "", "isFetchingNative", "<init>", "(Lrb3/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrb3/b;", "getData", "()Lrb3/b;", "b", "Z", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialization implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TripStateData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFetchingNative;

            public Initialization(TripStateData tripStateData, boolean z15) {
                this.data = tripStateData;
                this.isFetchingNative = z15;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsFetchingNative() {
                return this.isFetchingNative;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialization)) {
                    return false;
                }
                Initialization initialization = (Initialization) other;
                return fr.t.c(this.data, initialization.data) && this.isFetchingNative == initialization.isFetchingNative;
            }

            @Override // ob3.o
            public TripStateData getData() {
                return this.data;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.isFetchingNative);
            }

            public String toString() {
                return "Initialization(data=" + this.data + ", isFetchingNative=" + this.isFetchingNative + ')';
            }
        }

        /* JADX INFO: renamed from: ob3.o$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lob3/o$b$b;", "Lob3/o$b;", "Lrb3/b;", "data", "", "isFetchingNative", "<init>", "(Lrb3/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrb3/b;", "getData", "()Lrb3/b;", "b", "Z", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TripStateData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFetchingNative;

            public Screen(TripStateData tripStateData, boolean z15) {
                this.data = tripStateData;
                this.isFetchingNative = z15;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsFetchingNative() {
                return this.isFetchingNative;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.data, screen.data) && this.isFetchingNative == screen.isFetchingNative;
            }

            @Override // ob3.o
            public TripStateData getData() {
                return this.data;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.isFetchingNative);
            }

            public String toString() {
                return "Screen(data=" + this.data + ", isFetchingNative=" + this.isFetchingNative + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lob3/o$c;", "Lob3/o;", "a", "Lob3/s;", "Lob3/t;", "Lob3/u;", "Lob3/o$c$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends o {

        /* JADX INFO: renamed from: ob3.o$c$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lob3/o$c$a;", "Lob3/o$c;", "Lrb3/b;", "data", "Lz93/h;", "sessionToken", "", "isFetchingNative", "<init>", "(Lrb3/b;Ljava/lang/String;ZLfr/k;)V", "b", "(Lrb3/b;Ljava/lang/String;Z)Lob3/o$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrb3/b;", "getData", "()Lrb3/b;", "Ljava/lang/String;", "d", "c", "Z", "e", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TripStateData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sessionToken;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFetchingNative;

            public /* synthetic */ Screen(TripStateData tripStateData, String str, boolean z15, fr.k kVar) {
                this(tripStateData, str, z15);
            }

            public static /* synthetic */ Screen c(Screen screen, TripStateData tripStateData, String str, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    tripStateData = screen.data;
                }
                if ((i15 & 2) != 0) {
                    str = screen.sessionToken;
                }
                if ((i15 & 4) != 0) {
                    z15 = screen.isFetchingNative;
                }
                return screen.b(tripStateData, str, z15);
            }

            public final Screen b(TripStateData data, String sessionToken, boolean isFetchingNative) {
                return new Screen(data, sessionToken, isFetchingNative, null);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public String getSessionToken() {
                return this.sessionToken;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public boolean getIsFetchingNative() {
                return this.isFetchingNative;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.data, screen.data) && z93.h.b(this.sessionToken, screen.sessionToken) && this.isFetchingNative == screen.isFetchingNative;
            }

            @Override // ob3.o
            public TripStateData getData() {
                return this.data;
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + z93.h.c(this.sessionToken)) * 31) + Boolean.hashCode(this.isFetchingNative);
            }

            public String toString() {
                return "Screen(data=" + this.data + ", sessionToken=" + ((Object) z93.h.d(this.sessionToken)) + ", isFetchingNative=" + this.isFetchingNative + ')';
            }

            private Screen(TripStateData tripStateData, String str, boolean z15) {
                this.data = tripStateData;
                this.sessionToken = str;
                this.isFetchingNative = z15;
            }

            public /* synthetic */ Screen(TripStateData tripStateData, String str, boolean z15, int i15, fr.k kVar) {
                this(tripStateData, (i15 & 2) != 0 ? z93.h.a(UUID.randomUUID().toString()) : str, z15, null);
            }
        }
    }

    TripStateData getData();
}
