package p012a2;

import b3.a0;
import b3.b0;
import b3.x;
import c5.d;
import er.a;
import er.p;
import fr.k;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import u0.l;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001\u0018BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0013\u0010\u0011J\"\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010,\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0014\u0010.\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001f¨\u00060"}, d2 = {"La2/m3;", "", "La2/n3;", "initialValue", "Lc5/d;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "Lu0/l;", "", "animationSpec", "isSkipHalfExpanded", "<init>", "(La2/n3;Lc5/d;Ler/l;Lu0/l;Z)V", "Loq/i0;", "l", "(Ltq/e;)Ljava/lang/Object;", "m", "g", "target", "velocity", "e", "(La2/n3;FLtq/e;)Ljava/lang/Object;", "a", "Lu0/l;", "getAnimationSpec$material", "()Lu0/l;", "b", "Z", "n", "()Z", "La2/i;", "c", "La2/i;", "h", "()La2/i;", "anchoredDraggableState", "i", "()La2/n3;", "currentValue", "k", "targetValue", "o", "isVisible", "j", "hasHalfExpandedState", "d", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1790e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSkipHalfExpanded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i<n3> anchoredDraggableState;

    /* JADX INFO: renamed from: a2.m3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u00030\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La2/m3$a;", "", "<init>", "()V", "Lu0/l;", "", "animationSpec", "Lkotlin/Function1;", "La2/n3;", "", "confirmValueChange", "skipHalfExpanded", "Lc5/d;", "density", "Lb3/x;", "La2/m3;", "c", "(Lu0/l;Ler/l;ZLc5/d;)Lb3/x;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n3 d(b0 b0Var, m3 m3Var) {
            return m3Var.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m3 e(d dVar, er.l lVar, l lVar2, boolean z15, n3 n3Var) {
            return new m3(n3Var, dVar, lVar, lVar2, z15);
        }

        public final x<m3, ?> c(final l<Float> animationSpec, final er.l<? super n3, Boolean> confirmValueChange, final boolean skipHalfExpanded, final d density) {
            return a0.e(new p() { // from class: a2.k3
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m3.Companion.d((b0) obj, (m3) obj2);
                }
            }, new er.l() { // from class: a2.l3
                @Override // er.l
                public final Object b(Object obj) {
                    return m3.Companion.e(density, confirmValueChange, animationSpec, skipHalfExpanded, (n3) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public m3(n3 n3Var, final d dVar, er.l<? super n3, Boolean> lVar, l<Float> lVar2, boolean z15) {
        this.animationSpec = lVar2;
        this.isSkipHalfExpanded = z15;
        this.anchoredDraggableState = new i<>(n3Var, new er.l() { // from class: a2.i3
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(m3.c(dVar, ((Float) obj).floatValue()));
            }
        }, new a() { // from class: a2.j3
            @Override // er.a
            public final Object a() {
                return Float.valueOf(m3.d(dVar));
            }
        }, lVar2, lVar);
        if (z15 && n3Var == n3.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(d dVar, float f15) {
        return dVar.l2(g3.f1566a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(d dVar) {
        return dVar.l2(g3.f1567b);
    }

    public static /* synthetic */ Object f(m3 m3Var, n3 n3Var, float f15, e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f15 = m3Var.anchoredDraggableState.w();
        }
        return m3Var.e(n3Var, f15, eVar);
    }

    public final Object e(n3 n3Var, float f15, e<? super i0> eVar) {
        Object objF = c.f(this.anchoredDraggableState, n3Var, f15, eVar);
        return objF == b.e() ? objF : i0.f148189a;
    }

    public final Object g(e<? super i0> eVar) {
        Object objF;
        r1<n3> r1VarP = this.anchoredDraggableState.p();
        n3 n3Var = n3.Expanded;
        return (r1VarP.d(n3Var) && (objF = f(this, n3Var, 0.0f, eVar, 2, null)) == b.e()) ? objF : i0.f148189a;
    }

    public final i<n3> h() {
        return this.anchoredDraggableState;
    }

    public final n3 i() {
        return this.anchoredDraggableState.t();
    }

    public final boolean j() {
        return this.anchoredDraggableState.p().d(n3.HalfExpanded);
    }

    public final n3 k() {
        return this.anchoredDraggableState.y();
    }

    public final Object l(e<? super i0> eVar) {
        Object objF;
        return (j() && (objF = f(this, n3.HalfExpanded, 0.0f, eVar, 2, null)) == b.e()) ? objF : i0.f148189a;
    }

    public final Object m(e<? super i0> eVar) {
        Object objF = f(this, n3.Hidden, 0.0f, eVar, 2, null);
        return objF == b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final boolean o() {
        return this.anchoredDraggableState.t() != n3.Hidden;
    }
}
