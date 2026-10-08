package p049fm;

import nh.l;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfm/n5;", "Lfm/x1;", "Lnh/l;", "polygon", "Lkotlin/Function1;", "Loq/i0;", "onPolygonClick", "<init>", "(Lnh/l;Ler/l;)V", "e", "()V", "a", "Lnh/l;", "c", "()Lnh/l;", "b", "Ler/l;", "()Ler/l;", "d", "(Ler/l;)V", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n5 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l polygon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.l<? super l, i0> onPolygonClick;

    public n5(l lVar, er.l<? super l, i0> lVar2) {
        this.polygon = lVar;
        this.onPolygonClick = lVar2;
    }

    @Override // p049fm.x1
    public /* bridge */ void a() {
        super.a();
    }

    public final er.l<l, i0> b() {
        return this.onPolygonClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getPolygon() {
        return this.polygon;
    }

    public final void d(er.l<? super l, i0> lVar) {
        this.onPolygonClick = lVar;
    }

    @Override // p049fm.x1
    public void e() {
        this.polygon.a();
    }

    @Override // p049fm.x1
    public /* bridge */ void f() {
        super.f();
    }
}
