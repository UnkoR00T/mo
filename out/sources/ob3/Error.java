package ob3;

import p071kotlin.Metadata;
import rb3.TripStateData;
import z93.PlaceSuggestion;

/* JADX INFO: renamed from: ob3.s, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"Lob3/s;", "Lob3/o$c;", "Lob3/o$a;", "Lhb4/c;", "vmsAdapter", "Lrb3/b;", "data", "Lz93/h;", "sessionToken", "", "isFetchingNative", "Lz93/g;", "hint", "<init>", "(Lhb4/c;Lrb3/b;Ljava/lang/String;ZLz93/g;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Lrb3/b;", "getData", "()Lrb3/b;", "c", "Ljava/lang/String;", "d", "Z", "()Z", "e", "Lz93/g;", "()Lz93/g;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements o.c, o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TripStateData data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFetchingNative;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlaceSuggestion hint;

    public /* synthetic */ Error(hb4.c cVar, TripStateData tripStateData, String str, boolean z15, PlaceSuggestion placeSuggestion, fr.k kVar) {
        this(cVar, tripStateData, str, z15, placeSuggestion);
    }

    @Override // ob3.o.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PlaceSuggestion getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsFetchingNative() {
        return this.isFetchingNative;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.vmsAdapter, error.vmsAdapter) && fr.t.c(this.data, error.data) && z93.h.b(this.sessionToken, error.sessionToken) && this.isFetchingNative == error.isFetchingNative && fr.t.c(this.hint, error.hint);
    }

    @Override // ob3.o
    public TripStateData getData() {
        return this.data;
    }

    public int hashCode() {
        return (((((((this.vmsAdapter.hashCode() * 31) + this.data.hashCode()) * 31) + z93.h.c(this.sessionToken)) * 31) + Boolean.hashCode(this.isFetchingNative)) * 31) + this.hint.hashCode();
    }

    public String toString() {
        return "Error(vmsAdapter=" + this.vmsAdapter + ", data=" + this.data + ", sessionToken=" + ((Object) z93.h.d(this.sessionToken)) + ", isFetchingNative=" + this.isFetchingNative + ", hint=" + this.hint + ')';
    }

    private Error(hb4.c cVar, TripStateData tripStateData, String str, boolean z15, PlaceSuggestion placeSuggestion) {
        this.vmsAdapter = cVar;
        this.data = tripStateData;
        this.sessionToken = str;
        this.isFetchingNative = z15;
        this.hint = placeSuggestion;
    }
}
