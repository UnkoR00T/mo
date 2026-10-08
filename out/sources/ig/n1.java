package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class n1 implements vh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vh.m f92237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f92238b;

    n1(v vVar, vh.m mVar) {
        this.f92237a = mVar;
        Objects.requireNonNull(vVar);
        this.f92238b = vVar;
    }

    @Override // vh.f
    public final void a(vh.l lVar) {
        this.f92238b.g().remove(this.f92237a);
    }
}
