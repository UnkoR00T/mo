package p143z0;

import a4.p0;
import er.l;
import er.p;
import f3.m;
import f3.o;
import fr.m0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.i;
import u0.e2;
import vq.k;
import w0.g2;
import w0.z1;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0015\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\"&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0018\u00100\u001a\u00020\u0007*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lf3/m;", "Lz0/v2;", "state", "Lz0/a2;", "orientation", "Lw0/g2;", "overscrollEffect", "", "enabled", "reverseDirection", "Lz0/e1;", "flingBehavior", "Lb1/l;", "interactionSource", "Lz0/y;", "bringIntoViewSpec", "j", "(Lf3/m;Lz0/v2;Lz0/a2;Lw0/g2;ZZLz0/e1;Lb1/l;Lz0/y;)Lf3/m;", "Lz0/a3;", "Lm3/e;", "offset", "l", "(Lz0/a3;JLtq/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "La4/p0;", "a", "Ler/l;", "f", "()Ler/l;", "CanDragCalculation", "Lz0/h2;", "b", "Lz0/h2;", "NoOpScrollScope", "Lf3/o;", "c", "Lf3/o;", "g", "()Lf3/o;", "DefaultScrollMotionDurationScale", "Lc5/d;", "d", "Lc5/d;", "i", "()Lc5/d;", "UnityDensity", "h", "(Lz0/e1;)Z", "shouldBeTriggeredByMouseWheel", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<p0, Boolean> f231487a = new l() { // from class: z0.m2
        @Override // er.l
        public final Object b(Object obj) {
            return Boolean.valueOf(n2.b((p0) obj));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h2 f231488b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f231489c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c5.d f231490d = new c();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"z0/n2$a", "Lf3/o;", "", "Z", "()F", "scaleFactor", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements o {
        a() {
        }

        @Override // tq.i
        public /* bridge */ i D1(i.c<?> cVar) {
            return o.a.c(this, cVar);
        }

        @Override // f3.o
        public float Z() {
            return 1.0f;
        }

        @Override // tq.i.b, tq.i
        public /* bridge */ <E extends i.b> E m(i.c<E> cVar) {
            return (E) o.a.b(this, cVar);
        }

        @Override // tq.i
        public /* bridge */ i n0(i iVar) {
            return o.a.d(this, iVar);
        }

        @Override // tq.i
        public /* bridge */ <R> R s1(R r15, p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) o.a.a(this, r15, pVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"z0/n2$b", "Lz0/h2;", "", "pixels", "d", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements h2 {
        b() {
        }

        @Override // p143z0.h2
        public float d(float pixels) {
            return pixels;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"z0/n2$c", "Lc5/d;", "", "getDensity", "()F", "density", "i2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements c5.d {
        c() {
        }

        @Override // c5.d
        public float getDensity() {
            return 1.0f;
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2 */
        public float getFontScale() {
            return 1.0f;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231494g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231493f = obj;
            this.f231494g |= PKIFailureInfo.systemUnavail;
            return n2.l(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements p<s1, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3 f231497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f231498h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m0 f231499j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a3 a3Var, long j15, m0 m0Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f231497g = a3Var;
            this.f231498h = j15;
            this.f231499j = m0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m0 m0Var, a3 a3Var, s1 s1Var, float f15, float f16) {
            m0Var.f66406a += a3Var.z(a3Var.G(s1Var.b(a3Var.H(a3Var.z(f15 - m0Var.f66406a)), g.INSTANCE.b())));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231495e;
            if (i15 == 0) {
                u.b(obj);
                final s1 s1Var = (s1) this.f231496f;
                float fG = this.f231497g.G(this.f231498h);
                final m0 m0Var = this.f231499j;
                final a3 a3Var = this.f231497g;
                p pVar = new p() { // from class: z0.o2
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return n2.e.O(m0Var, a3Var, s1Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.f231495e = 1;
                if (e2.m(0.0f, fG, 0.0f, null, pVar, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
            return ((e) v(s1Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f231497g, this.f231498h, this.f231499j, eVar);
            eVar2.f231496f = obj;
            return eVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(p0 p0Var) {
        return !(p0Var == null ? false : p0.i(p0Var.getValue(), p0.INSTANCE.b()));
    }

    public static final l<p0, Boolean> f() {
        return f231487a;
    }

    public static final o g() {
        return f231489c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(e1 e1Var) {
        return !(e1Var instanceof j2);
    }

    public static final c5.d i() {
        return f231490d;
    }

    public static final m j(m mVar, v2 v2Var, a2 a2Var, g2 g2Var, boolean z15, boolean z16, e1 e1Var, b1.l lVar, y yVar) {
        return mVar.u(new l2(v2Var, a2Var, g2Var, z15, z16, e1Var, lVar, yVar));
    }

    public static /* synthetic */ m k(m mVar, v2 v2Var, a2 a2Var, g2 g2Var, boolean z15, boolean z16, e1 e1Var, b1.l lVar, y yVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = true;
        }
        return j(mVar, v2Var, a2Var, g2Var, z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? null : e1Var, (i15 & 64) != 0 ? null : lVar, (i15 & 128) != 0 ? null : yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(a3 a3Var, long j15, tq.e<? super m3.e> eVar) throws Throwable {
        d dVar;
        m0 m0Var;
        a3 a3Var2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f231494g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f231494g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f231493f;
        Object objE = uq.b.e();
        int i16 = dVar.f231494g;
        if (i16 == 0) {
            u.b(obj);
            m0Var = new m0();
            z1 z1Var = z1.Default;
            e eVar2 = new e(a3Var, j15, m0Var, null);
            dVar.f231491d = a3Var;
            dVar.f231492e = m0Var;
            dVar.f231494g = 1;
            if (a3Var.B(z1Var, eVar2, dVar) == objE) {
                return objE;
            }
            a3Var2 = a3Var;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0 m0Var2 = (m0) dVar.f231492e;
            a3 a3Var3 = (a3) dVar.f231491d;
            u.b(obj);
            m0Var = m0Var2;
            a3Var2 = a3Var3;
        }
        return m3.e.d(a3Var2.H(m0Var.f66406a));
    }
}
