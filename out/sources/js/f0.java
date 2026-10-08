package js;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap<c, w> f104639a;

    public f0(EnumMap<c, w> enumMap) {
        this.f104639a = enumMap;
    }

    public final w a(c cVar) {
        return this.f104639a.get(cVar);
    }

    public final EnumMap<c, w> b() {
        return this.f104639a;
    }
}
