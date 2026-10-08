package as;

import java.util.List;
import ot.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f14286b = new j();

    private j() {
    }

    @Override // ot.w
    public void a(vr.b bVar) {
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    @Override // ot.w
    public void b(vr.e eVar, List<String> list) {
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
