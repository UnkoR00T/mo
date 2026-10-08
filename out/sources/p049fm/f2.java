package p049fm;

import c5.d;
import c5.t;
import d1.d3;
import lh.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lfm/f2;", "Lfm/x1;", "Llh/c;", "map", "Lfm/e;", "cameraPositionState", "", "contentDescription", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Ld1/d3;", "contentPadding", "<init>", "(Llh/c;Lfm/e;Ljava/lang/String;Lc5/d;Lc5/t;Ld1/d3;)V", "Loq/i0;", "f", "()V", "e", "a", "Llh/c;", "getMap", "()Llh/c;", "b", "Lc5/d;", "h", "()Lc5/d;", "p", "(Lc5/d;)V", "c", "Lc5/t;", "i", "()Lc5/t;", "q", "(Lc5/t;)V", "value", "d", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "Lfm/e;", "getCameraPositionState", "()Lfm/e;", "n", "(Lfm/e;)V", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f2 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String contentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private e cameraPositionState;

    public f2(c cVar, e eVar, String str, d dVar, t tVar, d3 d3Var) {
        this.map = cVar;
        this.density = dVar;
        this.layoutDirection = tVar;
        l3.b(this, cVar, d3Var);
        eVar.A(cVar);
        if (str != null) {
            cVar.k(str);
        }
        this.contentDescription = str;
        this.cameraPositionState = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(f2 f2Var) {
        f2Var.cameraPositionState.C(false);
        f2Var.cameraPositionState.F(f2Var.map.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f2 f2Var) {
        f2Var.cameraPositionState.C(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(f2 f2Var, int i15) {
        f2Var.cameraPositionState.y(a.INSTANCE.a(i15));
        f2Var.cameraPositionState.C(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(f2 f2Var) {
        f2Var.cameraPositionState.F(f2Var.map.f());
    }

    @Override // p049fm.x1
    public void a() {
        this.cameraPositionState.A(null);
    }

    @Override // p049fm.x1
    public void e() {
        this.cameraPositionState.A(null);
    }

    @Override // p049fm.x1
    public void f() {
        this.map.v(new c.InterfaceC2868c() { // from class: fm.b2
            @Override // lh.c.InterfaceC2868c
            public final void a() {
                f2.j(this.f64999a);
            }
        });
        this.map.w(new c.d() { // from class: fm.c2
            @Override // lh.c.d
            public final void a() {
                f2.k(this.f65004a);
            }
        });
        this.map.y(new c.f() { // from class: fm.d2
            @Override // lh.c.f
            public final void a(int i15) {
                f2.l(this.f65008a, i15);
            }
        });
        this.map.x(new c.e() { // from class: fm.e2
            @Override // lh.c.e
            public final void a() {
                f2.m(this.f65057a);
            }
        });
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final t getLayoutDirection() {
        return this.layoutDirection;
    }

    public final void n(e eVar) {
        if (fr.t.c(eVar, this.cameraPositionState)) {
            return;
        }
        this.cameraPositionState.A(null);
        this.cameraPositionState = eVar;
        eVar.A(this.map);
    }

    public final void o(String str) {
        this.contentDescription = str;
        this.map.k(str);
    }

    public final void p(d dVar) {
        this.density = dVar;
    }

    public final void q(t tVar) {
        this.layoutDirection = tVar;
    }
}
