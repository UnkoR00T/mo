package androidx.compose.ui.viewinterop;

import er.p;
import fr.q;
import fr.w;
import g4.v0;
import g4.w0;
import l3.l0;
import l3.p0;
import oq.i0;
import p036e4.y1;
import p036e4.z1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/viewinterop/l;", "Lg4/j;", "Lg4/v0;", "Lg4/e;", "<init>", "()V", "Ll3/l0;", "previousState", "currentState", "Loq/i0;", "u3", "(Ll3/l0;Ll3/l0;)V", "Le4/y1;", "v3", "()Le4/y1;", "T0", "Ll3/p0;", "v", "Ll3/p0;", "focusTargetNode", "Le4/y1$a;", "w", "Le4/y1$a;", "pinnedHandle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l extends g4.j implements v0, g4.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0 focusTargetNode = (p0) n3(new p0(0, true, new a(this), null, 9, null));

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private y1.a pinnedHandle;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements p<l0, l0, i0> {
        a(Object obj) {
            super(2, obj, l.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(l0 l0Var, l0 l0Var2) {
            E(l0Var, l0Var2);
            return i0.f148189a;
        }

        public final void E(l0 l0Var, l0 l0Var2) {
            ((l) this.f66391b).u3(l0Var, l0Var2);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<y1> f11017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f11018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fr.p0<y1> p0Var, l lVar) {
            super(0);
            this.f11017b = p0Var;
            this.f11018c = lVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        public final void c() {
            this.f11017b.f66410a = g4.f.a(this.f11018c, z1.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u3(l0 previousState, l0 currentState) {
        boolean zB;
        if (getIsAttached() && (zB = currentState.b()) != previousState.b()) {
            if (zB) {
                y1 y1VarV3 = v3();
                this.pinnedHandle = y1VarV3 != null ? y1VarV3.a() : null;
            } else {
                y1.a aVar = this.pinnedHandle;
                if (aVar != null) {
                    aVar.b();
                }
                this.pinnedHandle = null;
            }
        }
    }

    private final y1 v3() {
        fr.p0 p0Var = new fr.p0();
        w0.a(this, new b(p0Var, this));
        return (y1) p0Var.f66410a;
    }

    @Override // g4.v0
    public void T0() {
        y1 y1VarV3 = v3();
        if (this.focusTargetNode.d0().b()) {
            y1.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.b();
            }
            this.pinnedHandle = y1VarV3 != null ? y1VarV3.a() : null;
        }
    }
}
