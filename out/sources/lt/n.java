package lt;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface n {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(n nVar, d dVar, er.l lVar, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i15 & 1) != 0) {
                dVar = d.f120103o;
            }
            if ((i15 & 2) != 0) {
                lVar = k.f120129a.c();
            }
            return nVar.f(dVar, lVar);
        }
    }

    vr.h e(zs.f fVar, ds.b bVar);

    Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar);
}
