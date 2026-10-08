package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfw0/v;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lfw0/u;", "a", "Ljava/util/List;", "()Ljava/util/List;", "dictionaries", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DictionaryResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dictionaries")
    private final List<DictionaryDto> dictionaries;

    public final List<DictionaryDto> a() {
        return this.dictionaries;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DictionaryResponse) && fr.t.c(this.dictionaries, ((DictionaryResponse) other).dictionaries);
    }

    public int hashCode() {
        return this.dictionaries.hashCode();
    }

    public String toString() {
        return "DictionaryResponse(dictionaries=" + this.dictionaries + ')';
    }
}
