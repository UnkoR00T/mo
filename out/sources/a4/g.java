package a4;

import androidx.compose.ui.platform.g1;
import g4.DpTouchBoundsExpansion;
import g4.f1;
import g4.n1;
import g4.p1;
import g4.q1;
import g4.r1;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b&\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010'R*\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0016\u0010?\u001a\u0004\u0018\u00010<8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"La4/g;", "Lf3/m$c;", "Lg4/q1;", "Lg4/f1;", "Lg4/e;", "La4/w;", "icon", "", "overrideDescendants", "Lg4/p;", "dpTouchBoundsExpansion", "<init>", "(La4/w;ZLg4/p;)V", "Loq/i0;", "y3", "()V", "z3", "o3", "s3", "t3", "()La4/g;", "r3", "u3", "q3", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Z1", "X2", "La4/p0;", "pointerType", "x3", "(I)Z", "p3", "(La4/w;)V", "r", "Lg4/p;", "getDpTouchBoundsExpansion", "()Lg4/p;", "A3", "(Lg4/p;)V", "value", "s", "La4/w;", "getIcon", "()La4/w;", "B3", "t", "Z", "v3", "()Z", "C3", "(Z)V", "v", "cursorInBoundsOfNode", "La4/y;", "w3", "()La4/y;", "pointerIconService", "Lg4/n1;", "B1", "()J", "touchBoundsExpansion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g extends f3.m.c implements q1, f1, g4.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private w icon;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean overrideDescendants;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean cursorInBoundsOfNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La4/g;", "it", "", "c", "(La4/g;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<g, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<g> f2663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fr.p0<g> p0Var) {
            super(1);
            this.f2663b = p0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(g gVar) {
            if (this.f2663b.f66410a == null && gVar.cursorInBoundsOfNode) {
                this.f2663b.f66410a = gVar;
            } else if (this.f2663b.f66410a != null && gVar.getOverrideDescendants() && gVar.cursorInBoundsOfNode) {
                this.f2663b.f66410a = gVar;
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La4/g;", "it", "Lg4/p1;", "c", "(La4/g;)Lg4/p1;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<g, p1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.l0 f2664b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fr.l0 l0Var) {
            super(1);
            this.f2664b = l0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p1 b(g gVar) {
            if (!gVar.cursorInBoundsOfNode) {
                return p1.ContinueTraversal;
            }
            this.f2664b.f66404a = false;
            return p1.CancelTraversal;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La4/g;", "it", "Lg4/p1;", "c", "(La4/g;)Lg4/p1;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<g, p1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<g> f2665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fr.p0<g> p0Var) {
            super(1);
            this.f2665b = p0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p1 b(g gVar) {
            p1 p1Var = p1.ContinueTraversal;
            if (gVar.cursorInBoundsOfNode) {
                this.f2665b.f66410a = gVar;
                if (gVar.getOverrideDescendants()) {
                    return p1.SkipSubtreeAndContinueTraversal;
                }
            }
            return p1Var;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La4/g;", "it", "", "c", "(La4/g;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.l<g, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<g> f2666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(fr.p0<g> p0Var) {
            super(1);
            this.f2666b = p0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(g gVar) {
            if (gVar.getOverrideDescendants() && gVar.cursorInBoundsOfNode) {
                this.f2666b.f66410a = gVar;
            }
            return Boolean.TRUE;
        }
    }

    public g(w wVar, boolean z15, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = wVar;
        this.overrideDescendants = z15;
    }

    private final void o3() {
        w wVar;
        g gVarU3 = u3();
        if (gVarU3 == null || (wVar = gVarU3.icon) == null) {
            wVar = this.icon;
        }
        p3(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void q3() {
        fr.p0 p0Var = new fr.p0();
        r1.d(this, new a(p0Var));
        g gVar = (g) p0Var.f66410a;
        if (gVar != null) {
            gVar.o3();
        } else {
            p3(null);
        }
    }

    private final void r3() {
        g gVarT3;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (gVarT3 = t3()) == null) {
                gVarT3 = this;
            }
            gVarT3.o3();
        }
    }

    private final void s3() {
        fr.l0 l0Var = new fr.l0();
        l0Var.f66404a = true;
        if (!this.overrideDescendants) {
            r1.f(this, new b(l0Var));
        }
        if (l0Var.f66404a) {
            o3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final g t3() {
        fr.p0 p0Var = new fr.p0();
        r1.f(this, new c(p0Var));
        return (g) p0Var.f66410a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final g u3() {
        fr.p0 p0Var = new fr.p0();
        r1.d(this, new d(p0Var));
        return (g) p0Var.f66410a;
    }

    private final void y3() {
        this.cursorInBoundsOfNode = true;
        s3();
    }

    private final void z3() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (getIsAttached()) {
                q3();
            }
        }
    }

    public final void A3(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    @Override // g4.f1
    public long B1() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.a(g4.h.o(this)) : n1.INSTANCE.b();
    }

    public final void B3(w wVar) {
        if (fr.t.c(this.icon, wVar)) {
            return;
        }
        this.icon = wVar;
        if (this.cursorInBoundsOfNode) {
            s3();
        }
    }

    public final void C3(boolean z15) {
        if (this.overrideDescendants != z15) {
            this.overrideDescendants = z15;
            if (z15) {
                if (this.cursorInBoundsOfNode) {
                    o3();
                }
            } else if (this.cursorInBoundsOfNode) {
                r3();
            }
        }
    }

    @Override // f3.m.c
    public void X2() {
        z3();
        super.X2();
    }

    @Override // g4.f1
    public void Y(o pointerEvent, q pass, long bounds) {
        if (pass == q.Main) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (x3(listC.get(i15).getType())) {
                    int type = pointerEvent.getType();
                    s.Companion companion = s.INSTANCE;
                    if (s.o(type, companion.a())) {
                        y3();
                        return;
                    } else {
                        if (s.o(pointerEvent.getType(), companion.b())) {
                            z3();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // g4.f1
    public void Z1() {
        z3();
    }

    public abstract void p3(w icon);

    /* JADX INFO: renamed from: v3, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    protected final y w3() {
        return (y) g4.f.a(this, g1.o());
    }

    public abstract boolean x3(int pointerType);

    public /* synthetic */ g(w wVar, boolean z15, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i15, fr.k kVar) {
        this(wVar, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }
}
