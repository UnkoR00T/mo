package p049fm;

import er.l;
import er.q;
import nh.h;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0001\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010-\u001a\u0004\b!\u0010.\"\u0004\b/\u00100R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010-\u001a\u0004\b\u001d\u0010.\"\u0004\b1\u00100¨\u00062"}, d2 = {"Lfm/s4;", "Lfm/x1;", "Lm2/v;", "compositionContext", "Lnh/h;", "marker", "Lfm/v4;", "markerState", "Lkotlin/Function1;", "", "onMarkerClick", "Loq/i0;", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "infoWindow", "infoContent", "<init>", "(Lm2/v;Lnh/h;Lfm/v4;Ler/l;Ler/l;Ler/l;Ler/l;Ler/q;Ler/q;)V", "f", "()V", "e", "a", "Lm2/v;", "b", "()Lm2/v;", "Lnh/h;", "g", "()Lnh/h;", "c", "Lfm/v4;", "h", "()Lfm/v4;", "d", "Ler/l;", "l", "()Ler/l;", "r", "(Ler/l;)V", "i", "o", "j", "p", "k", "q", "Ler/q;", "()Ler/q;", "n", "(Ler/q;)V", "m", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s4 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v compositionContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h marker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v4 markerState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private l<? super h, Boolean> onMarkerClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l<? super h, i0> onInfoWindowClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private l<? super h, i0> onInfoWindowClose;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private l<? super h, i0> onInfoWindowLongClick;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private q<? super h, ? super r, ? super Integer, i0> infoWindow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private q<? super h, ? super r, ? super Integer, i0> infoContent;

    public s4(v vVar, h hVar, v4 v4Var, l<? super h, Boolean> lVar, l<? super h, i0> lVar2, l<? super h, i0> lVar3, l<? super h, i0> lVar4, q<? super h, ? super r, ? super Integer, i0> qVar, q<? super h, ? super r, ? super Integer, i0> qVar2) {
        this.compositionContext = vVar;
        this.marker = hVar;
        this.markerState = v4Var;
        this.onMarkerClick = lVar;
        this.onInfoWindowClick = lVar2;
        this.onInfoWindowClose = lVar3;
        this.onInfoWindowLongClick = lVar4;
        this.infoWindow = qVar;
        this.infoContent = qVar2;
    }

    @Override // p049fm.x1
    public void a() {
        this.markerState.h(null);
        this.marker.e();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getCompositionContext() {
        return this.compositionContext;
    }

    public final q<h, r, Integer, i0> c() {
        return this.infoContent;
    }

    public final q<h, r, Integer, i0> d() {
        return this.infoWindow;
    }

    @Override // p049fm.x1
    public void e() {
        this.markerState.h(null);
        this.marker.e();
    }

    @Override // p049fm.x1
    public void f() {
        this.markerState.h(this.marker);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getMarker() {
        return this.marker;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final v4 getMarkerState() {
        return this.markerState;
    }

    public final l<h, i0> i() {
        return this.onInfoWindowClick;
    }

    public final l<h, i0> j() {
        return this.onInfoWindowClose;
    }

    public final l<h, i0> k() {
        return this.onInfoWindowLongClick;
    }

    public final l<h, Boolean> l() {
        return this.onMarkerClick;
    }

    public final void m(q<? super h, ? super r, ? super Integer, i0> qVar) {
        this.infoContent = qVar;
    }

    public final void n(q<? super h, ? super r, ? super Integer, i0> qVar) {
        this.infoWindow = qVar;
    }

    public final void o(l<? super h, i0> lVar) {
        this.onInfoWindowClick = lVar;
    }

    public final void p(l<? super h, i0> lVar) {
        this.onInfoWindowClose = lVar;
    }

    public final void q(l<? super h, i0> lVar) {
        this.onInfoWindowLongClick = lVar;
    }

    public final void r(l<? super h, Boolean> lVar) {
        this.onMarkerClick = lVar;
    }
}
