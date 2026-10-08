package androidx.compose.foundation;

import a4.PointerInputChange;
import a4.o;
import a4.p;
import a4.q;
import android.view.KeyEvent;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.g1;
import b1.l;
import fr.k;
import fr.t;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p143z0.b3;
import p143z0.i1;
import w0.g0;
import w0.r1;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010%J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\"2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00104JS\u00106\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00062\u0006\u00100\u001a\u000208H\u0004¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00062\u0006\u00100\u001a\u000208H\u0004¢\u0006\u0004\b;\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/foundation/c;", "Landroidx/compose/foundation/a;", "Lb1/l;", "interactionSource", "Lw0/r1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Ln4/l;", "role", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lb1/l;Lw0/r1;ZZLjava/lang/String;Ln4/l;Ler/a;Lfr/k;)V", "La4/b0;", "down", "m4", "(La4/b0;)V", "Lx3/f;", "n4", "(Lx3/f;)V", "up", "q4", "r4", "La4/o;", "pointerEvent", "Lc5/r;", "bounds", "p4", "(La4/o;J)V", "Lx3/c;", "indirectPointerEvent", "o4", "(Lx3/c;)V", "k4", "(La4/o;)V", "l4", "indirectPointer", "j4", "(Z)V", "La4/q;", "pass", "Y", "(La4/o;La4/q;J)V", "event", "v2", "(Lx3/c;La4/q;)V", "Z1", "()V", "m2", "s4", "(Lb1/l;Lw0/r1;ZZLjava/lang/String;Ln4/l;Ler/a;)V", "Ly3/b;", "b4", "(Landroid/view/KeyEvent;)Z", "c4", "r0", "La4/b0;", "downEvent", "s0", "Lx3/f;", "indirectDownEvent", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends a {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private PointerInputChange downEvent;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private IndirectPointerInputChange indirectDownEvent;

    public /* synthetic */ c(l lVar, r1 r1Var, boolean z15, boolean z16, String str, n4.l lVar2, er.a aVar, k kVar) {
        this(lVar, r1Var, z15, z16, str, lVar2, aVar);
    }

    private final void j4(boolean indirectPointer) {
        if (indirectPointer) {
            this.indirectDownEvent = null;
        } else {
            this.downEvent = null;
        }
        S3(indirectPointer);
    }

    private final void k4(o pointerEvent) {
        if (this.downEvent != null) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i15 = 0; i15 < size; i15++) {
                PointerInputChange pointerInputChange = listC.get(i15);
                if (pointerInputChange.q() && !t.c(pointerInputChange, this.downEvent)) {
                    j4(false);
                    return;
                }
            }
        }
    }

    private final void l4(x3.c indirectPointerEvent) {
        if (this.indirectDownEvent != null) {
            List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
            int size = listB.size();
            for (int i15 = 0; i15 < size; i15++) {
                IndirectPointerInputChange indirectPointerInputChange = listB.get(i15);
                if (indirectPointerInputChange.getIsConsumed() && !t.c(indirectPointerInputChange, this.indirectDownEvent)) {
                    j4(true);
                    return;
                }
            }
        }
    }

    private final void m4(PointerInputChange down) {
        down.a();
        this.downEvent = down;
        if (getEnabled()) {
            if (g0.isDelayPressesUsingGestureConsumptionEnabled) {
                V3(down);
            } else {
                X3(down.getPosition(), false);
            }
        }
    }

    private final void n4(IndirectPointerInputChange down) {
        down.a();
        this.indirectDownEvent = down;
        if (getEnabled()) {
            if (g0.isDelayPressesUsingGestureConsumptionEnabled) {
                W3(down);
            } else {
                X3(down.getPosition(), true);
            }
        }
    }

    private final void o4(x3.c indirectPointerEvent) {
        float fG = ((f3) g4.f.a(this, g1.u())).g();
        List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
        int size = listB.size();
        for (int i15 = 0; i15 < size; i15++) {
            IndirectPointerInputChange indirectPointerInputChange = listB.get(i15);
            boolean z15 = Math.abs(m3.e.k(m3.e.p(indirectPointerInputChange.getPosition(), this.indirectDownEvent.getPosition()))) > fG;
            if (indirectPointerInputChange.getIsConsumed() || z15) {
                j4(true);
                return;
            }
        }
    }

    private final void p4(o pointerEvent, long bounds) {
        long jP3 = P3(bounds);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            PointerInputChange pointerInputChange = listC.get(i15);
            if (pointerInputChange.q() || p.f(pointerInputChange, bounds, jP3)) {
                j4(false);
                return;
            }
        }
    }

    private final void q4(PointerInputChange up4) {
        up4.a();
        if (getEnabled()) {
            U3(this.downEvent.getPosition(), false);
            Q3().a();
        }
        this.downEvent = null;
    }

    private final void r4(IndirectPointerInputChange up4) {
        up4.a();
        if (getEnabled()) {
            U3(this.indirectDownEvent.getPosition(), true);
            Q3().a();
        }
        this.indirectDownEvent = null;
    }

    @Override // androidx.compose.foundation.a, g4.f1
    public void Y(o pointerEvent, q pass, long bounds) {
        super.Y(pointerEvent, pass, bounds);
        if (pass != q.Main) {
            if (pass == q.Final) {
                k4(pointerEvent);
            }
        } else {
            if (this.downEvent == null) {
                if (b3.k(pointerEvent, true, false, 2, null)) {
                    m4(pointerEvent.c().get(0));
                    return;
                }
                return;
            }
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (!p.c(listC.get(i15))) {
                    p4(pointerEvent, bounds);
                    return;
                }
            }
            q4(pointerEvent.c().get(0));
        }
    }

    @Override // androidx.compose.foundation.a, g4.f1
    public void Z1() {
        super.Z1();
        j4(false);
    }

    @Override // androidx.compose.foundation.a
    protected final boolean b4(KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.foundation.a
    protected final boolean c4(KeyEvent event) {
        Q3().a();
        return true;
    }

    @Override // x3.g
    public void m2() {
        j4(true);
    }

    public final void s4(l interactionSource, r1 indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, n4.l role, er.a<i0> onClick) {
        i4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, onClickLabel, role, onClick);
    }

    @Override // androidx.compose.foundation.a, x3.g
    public void v2(x3.c event, q pass) {
        super.v2(event, pass);
        if (pass != q.Main) {
            if (pass == q.Final) {
                l4(event);
                return;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List<IndirectPointerInputChange> listB = event.b();
            int size = listB.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (i1.g(listB.get(i15))) {
                    n4(event.b().get(0));
                    return;
                }
            }
            return;
        }
        List<IndirectPointerInputChange> listB2 = event.b();
        int size2 = listB2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            if (!b.i(listB2.get(i16))) {
                o4(event);
                return;
            }
        }
        r4(event.b().get(0));
    }

    private c(l lVar, r1 r1Var, boolean z15, boolean z16, String str, n4.l lVar2, er.a<i0> aVar) {
        super(lVar, r1Var, z15, z16, str, lVar2, aVar, null);
    }
}
