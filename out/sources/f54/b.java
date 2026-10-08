package f54;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lr.m;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\f*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"Lf54/b;", "", "Ly04/a;", "buildConfigRepository", "", "Lb54/b;", "localFeatureFlags", "Lf54/a;", "localDataSource", "<init>", "(Ly04/a;Ljava/util/List;Lf54/a;)V", "", "", "b", "()Ljava/util/Map;", "featureFlag", "enabled", "Loq/i0;", "c", "(Lb54/b;Z)V", "a", "Ljava/util/List;", "Lf54/a;", "Z", "prodFeatureFlags", "(Lb54/b;)Z", "defaultValueBasedOnEnv", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<b54.b> localFeatureFlags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a localDataSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean prodFeatureFlags;

    /* JADX WARN: Multi-variable type inference failed */
    public b(y04.a aVar, List<? extends b54.b> list, a aVar2) {
        this.localFeatureFlags = list;
        this.localDataSource = aVar2;
        this.prodFeatureFlags = aVar.getProdFeatureFlags();
    }

    private final boolean a(b54.b bVar) {
        return this.prodFeatureFlags ? bVar.getDefaultValue().getProd() : bVar.getDefaultValue().getTest();
    }

    public final Map<b54.b, Boolean> b() {
        List<b54.b> list = this.localFeatureFlags;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, Boolean.valueOf(a((b54.b) obj)));
        }
        return v0.o(linkedHashMap, this.localDataSource.a());
    }

    public final void c(b54.b featureFlag, boolean enabled) {
        this.localDataSource.b(featureFlag, enabled);
    }
}
