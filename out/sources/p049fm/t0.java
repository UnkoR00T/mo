package p049fm;

import er.l;
import fr.k;
import nh.d;
import nh.e;
import nh.h;
import nh.n;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0001\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001d¨\u00064"}, d2 = {"Lfm/t0;", "Lfm/x1;", "Lkotlin/Function1;", "Lnh/d;", "Loq/i0;", "onCircleClick", "Lnh/e;", "onGroundOverlayClick", "Lnh/l;", "onPolygonClick", "Lnh/n;", "onPolylineClick", "Lnh/h;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "<set-?>", "a", "Lm2/a3;", "b", "()Ler/l;", "o", "(Ler/l;)V", "c", "p", "m", "x", "d", "n", "y", "e", "i", "t", "f", "q", "g", "r", "h", "s", "j", "u", "k", "v", "l", "w", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 onCircleClick;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 onGroundOverlayClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 onPolygonClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 onPolylineClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3 onMarkerClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 onInfoWindowClick;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 onInfoWindowClose;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a3 onInfoWindowLongClick;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a3 onMarkerDrag;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a3 onMarkerDragEnd;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a3 onMarkerDragStart;

    public t0() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // p049fm.x1
    public /* bridge */ void a() {
        super.a();
    }

    public final l<d, i0> b() {
        return (l) this.onCircleClick.getValue();
    }

    public final l<e, i0> c() {
        return (l) this.onGroundOverlayClick.getValue();
    }

    public final l<h, i0> d() {
        return (l) this.onInfoWindowClick.getValue();
    }

    @Override // p049fm.x1
    public /* bridge */ void e() {
        super.e();
    }

    @Override // p049fm.x1
    public /* bridge */ void f() {
        super.f();
    }

    public final l<h, i0> g() {
        return (l) this.onInfoWindowClose.getValue();
    }

    public final l<h, i0> h() {
        return (l) this.onInfoWindowLongClick.getValue();
    }

    public final l<h, Boolean> i() {
        return (l) this.onMarkerClick.getValue();
    }

    public final l<h, i0> j() {
        return (l) this.onMarkerDrag.getValue();
    }

    public final l<h, i0> k() {
        return (l) this.onMarkerDragEnd.getValue();
    }

    public final l<h, i0> l() {
        return (l) this.onMarkerDragStart.getValue();
    }

    public final l<nh.l, i0> m() {
        return (l) this.onPolygonClick.getValue();
    }

    public final l<n, i0> n() {
        return (l) this.onPolylineClick.getValue();
    }

    public final void o(l<? super d, i0> lVar) {
        this.onCircleClick.setValue(lVar);
    }

    public final void p(l<? super e, i0> lVar) {
        this.onGroundOverlayClick.setValue(lVar);
    }

    public final void q(l<? super h, i0> lVar) {
        this.onInfoWindowClick.setValue(lVar);
    }

    public final void r(l<? super h, i0> lVar) {
        this.onInfoWindowClose.setValue(lVar);
    }

    public final void s(l<? super h, i0> lVar) {
        this.onInfoWindowLongClick.setValue(lVar);
    }

    public final void t(l<? super h, Boolean> lVar) {
        this.onMarkerClick.setValue(lVar);
    }

    public final void u(l<? super h, i0> lVar) {
        this.onMarkerDrag.setValue(lVar);
    }

    public final void v(l<? super h, i0> lVar) {
        this.onMarkerDragEnd.setValue(lVar);
    }

    public final void w(l<? super h, i0> lVar) {
        this.onMarkerDragStart.setValue(lVar);
    }

    public final void x(l<? super nh.l, i0> lVar) {
        this.onPolygonClick.setValue(lVar);
    }

    public final void y(l<? super n, i0> lVar) {
        this.onPolylineClick.setValue(lVar);
    }

    public t0(l<? super d, i0> lVar, l<? super e, i0> lVar2, l<? super nh.l, i0> lVar3, l<? super n, i0> lVar4, l<? super h, Boolean> lVar5, l<? super h, i0> lVar6, l<? super h, i0> lVar7, l<? super h, i0> lVar8, l<? super h, i0> lVar9, l<? super h, i0> lVar10, l<? super h, i0> lVar11) {
        this.onCircleClick = c6.e(lVar, null, 2, null);
        this.onGroundOverlayClick = c6.e(lVar2, null, 2, null);
        this.onPolygonClick = c6.e(lVar3, null, 2, null);
        this.onPolylineClick = c6.e(lVar4, null, 2, null);
        this.onMarkerClick = c6.e(lVar5, null, 2, null);
        this.onInfoWindowClick = c6.e(lVar6, null, 2, null);
        this.onInfoWindowClose = c6.e(lVar7, null, 2, null);
        this.onInfoWindowLongClick = c6.e(lVar8, null, 2, null);
        this.onMarkerDrag = c6.e(lVar9, null, 2, null);
        this.onMarkerDragEnd = c6.e(lVar10, null, 2, null);
        this.onMarkerDragStart = c6.e(lVar11, null, 2, null);
    }

    public /* synthetic */ t0(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, l lVar9, l lVar10, l lVar11, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : lVar, (i15 & 2) != 0 ? null : lVar2, (i15 & 4) != 0 ? null : lVar3, (i15 & 8) != 0 ? null : lVar4, (i15 & 16) != 0 ? null : lVar5, (i15 & 32) != 0 ? null : lVar6, (i15 & 64) != 0 ? null : lVar7, (i15 & 128) != 0 ? null : lVar8, (i15 & 256) != 0 ? null : lVar9, (i15 & 512) != 0 ? null : lVar10, (i15 & 1024) != 0 ? null : lVar11);
    }
}
