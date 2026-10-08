package pl.gov.coi.common.network;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/w;", "", "T", "Lpl/gov/coi/common/network/y;", "profile", "Ljava/lang/Class;", "service", "a", "(Lpl/gov/coi/common/network/y;Ljava/lang/Class;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w {
    static /* synthetic */ Object b(w wVar, y yVar, Class cls, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i15 & 1) != 0) {
            yVar = new y.Backend(null, 1, null);
        }
        return wVar.a(yVar, cls);
    }

    <T> T a(y profile, Class<T> service);
}
