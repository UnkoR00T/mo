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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0015B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"La2/p0;", "", "La2/q0;", "initialValue", "Lc5/d;", "density", "Lu0/l;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "<init>", "(La2/q0;Lc5/d;Lu0/l;Ler/l;)V", "Loq/i0;", "f", "(Ltq/e;)Ljava/lang/Object;", "e", "k", "()F", "La2/i;", "a", "La2/i;", "g", "()La2/i;", "anchoredDraggableState", "h", "()La2/q0;", "currentValue", "j", "()Z", "isExpanded", "i", "isCollapsed", "b", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i<q0> anchoredDraggableState;

    /* JADX INFO: renamed from: a2.p0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u00030\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La2/p0$a;", "", "<init>", "()V", "Lu0/l;", "", "animationSpec", "Lkotlin/Function1;", "La2/q0;", "", "confirmStateChange", "Lc5/d;", "density", "Lb3/x;", "La2/p0;", "c", "(Lu0/l;Ler/l;Lc5/d;)Lb3/x;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q0 d(b0 b0Var, p0 p0Var) {
            return p0Var.g().t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p0 e(d dVar, l lVar, er.l lVar2, q0 q0Var) {
            return new p0(q0Var, dVar, lVar, lVar2);
        }

        public final x<p0, ?> c(final l<Float> animationSpec, final er.l<? super q0, Boolean> confirmStateChange, final d density) {
            return a0.e(new p() { // from class: a2.n0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p0.Companion.d((b0) obj, (p0) obj2);
                }
            }, new er.l() { // from class: a2.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.Companion.e(density, animationSpec, confirmStateChange, (q0) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public p0(q0 q0Var, final d dVar, l<Float> lVar, er.l<? super q0, Boolean> lVar2) {
        this.anchoredDraggableState = new i<>(q0Var, new er.l() { // from class: a2.l0
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(p0.c(dVar, ((Float) obj).floatValue()));
            }
        }, new a() { // from class: a2.m0
            @Override // er.a
            public final Object a() {
                return Float.valueOf(p0.d(dVar));
            }
        }, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(d dVar, float f15) {
        return dVar.l2(i0.f1674b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(d dVar) {
        return dVar.l2(i0.f1675c);
    }

    public final Object e(e<? super i0> eVar) {
        Object objG = c.g(this.anchoredDraggableState, q0.Collapsed, 0.0f, eVar, 2, null);
        return objG == b.e() ? objG : i0.f148189a;
    }

    public final Object f(e<? super i0> eVar) {
        r1<q0> r1VarP = this.anchoredDraggableState.p();
        q0 q0Var = q0.Expanded;
        if (!r1VarP.d(q0Var)) {
            q0Var = q0.Collapsed;
        }
        Object objG = c.g(this.anchoredDraggableState, q0Var, 0.0f, eVar, 2, null);
        return objG == b.e() ? objG : i0.f148189a;
    }

    public final i<q0> g() {
        return this.anchoredDraggableState;
    }

    public final q0 h() {
        return this.anchoredDraggableState.t();
    }

    public final boolean i() {
        return this.anchoredDraggableState.t() == q0.Collapsed;
    }

    public final boolean j() {
        return this.anchoredDraggableState.t() == q0.Expanded;
    }

    public final float k() {
        return this.anchoredDraggableState.C();
    }
}
