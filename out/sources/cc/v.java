package cc;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcc/w;", "generationalId", "", "systemId", "Lcc/o;", "a", "(Lcc/w;I)Lcc/o;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final SystemIdInfo a(WorkGenerationalId workGenerationalId, int i15) {
        return new SystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration(), i15);
    }
}
