package ob3;

import p071kotlin.Metadata;
import rb3.TripStateData;
import z93.PlaceSuggestion;

/* JADX INFO: renamed from: ob3.u, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"Lob3/u;", "Lob3/o$c;", "Lrb3/b;", "data", "Lz93/h;", "sessionToken", "", "isFetchingNative", "Lz93/g;", "hint", "<init>", "(Lrb3/b;Ljava/lang/String;ZLz93/g;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrb3/b;", "getData", "()Lrb3/b;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "Lz93/g;", "()Lz93/g;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FetchingNative implements o.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TripStateData data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFetchingNative;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlaceSuggestion hint;

    public /* synthetic */ FetchingNative(TripStateData tripStateData, String str, boolean z15, PlaceSuggestion placeSuggestion, fr.k kVar) {
        this(tripStateData, str, z15, placeSuggestion);
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
        if (!(other instanceof FetchingNative)) {
            return false;
        }
        FetchingNative fetchingNative = (FetchingNative) other;
        return fr.t.c(this.data, fetchingNative.data) && z93.h.b(this.sessionToken, fetchingNative.sessionToken) && this.isFetchingNative == fetchingNative.isFetchingNative && fr.t.c(this.hint, fetchingNative.hint);
    }

    @Override // ob3.o
    public TripStateData getData() {
        return this.data;
    }

    public int hashCode() {
        return (((((this.data.hashCode() * 31) + z93.h.c(this.sessionToken)) * 31) + Boolean.hashCode(this.isFetchingNative)) * 31) + this.hint.hashCode();
    }

    public String toString() {
        return "FetchingNative(data=" + this.data + ", sessionToken=" + ((Object) z93.h.d(this.sessionToken)) + ", isFetchingNative=" + this.isFetchingNative + ", hint=" + this.hint + ')';
    }

    private FetchingNative(TripStateData tripStateData, String str, boolean z15, PlaceSuggestion placeSuggestion) {
        this.data = tripStateData;
        this.sessionToken = str;
        this.isFetchingNative = z15;
        this.hint = placeSuggestion;
    }
}
