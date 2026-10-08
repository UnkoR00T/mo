package g54;

import iy.y;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg54/f;", "Lc54/c;", "Lf54/b;", "featureFlagRepository", "Liy/y;", "secureWindow", "<init>", "(Lf54/b;Liy/y;)V", "Lc54/c$a;", "params", "Loq/i0;", "b", "(Lc54/c$a;)V", "a", "Lf54/b;", "Liy/y;", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements c54.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f54.b featureFlagRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y secureWindow;

    public f(f54.b bVar, y yVar) {
        this.featureFlagRepository = bVar;
        this.secureWindow = yVar;
    }

    @Override // gz.a
    public /* bridge */ /* synthetic */ i0 a(gz.b.a aVar) {
        b((c54.c.Params) aVar);
        return i0.f148189a;
    }

    public void b(c54.c.Params params) {
        this.featureFlagRepository.c(params.getLocalFeatureFlag(), params.getEnabled());
        if (params.getLocalFeatureFlag() == b54.c.SECURE_WINDOW) {
            if (params.getEnabled()) {
                this.secureWindow.a();
            } else {
                this.secureWindow.c();
            }
        }
    }
}
