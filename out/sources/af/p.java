package af;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class p implements ye.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ye.c> f6143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f6144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f6145c;

    p(Set<ye.c> set, o oVar, s sVar) {
        this.f6143a = set;
        this.f6144b = oVar;
        this.f6145c = sVar;
    }

    @Override // ye.i
    public <T> ye.h<T> a(String str, Class<T> cls, ye.c cVar, ye.g<T, byte[]> gVar) {
        if (this.f6143a.contains(cVar)) {
            return new r(this.f6144b, str, cVar, gVar, this.f6145c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f6143a));
    }
}
