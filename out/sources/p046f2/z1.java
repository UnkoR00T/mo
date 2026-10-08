package p046f2;

import b1.c;
import b1.d;
import b1.g;
import b1.i;
import b1.j;
import b1.n;
import c3.SnapshotStateList;
import er.p;
import ju.p0;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import pq.v;
import tq.e;
import u0.s3;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001e"}, d2 = {"Lf2/z1;", "", "Lc5/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLfr/k;)V", "", "enabled", "Lb1/j;", "interactionSource", "Lm2/f6;", "e", "(ZLb1/j;Lm2/r;I)Lm2/f6;", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float draggedElevation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f58452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<i> f58453g;

        /* JADX INFO: renamed from: f2.z1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1311a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<i> f58454a;

            C1311a(SnapshotStateList<i> snapshotStateList) {
                this.f58454a = snapshotStateList;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, e<? super i0> eVar) {
                if (iVar instanceof g) {
                    this.f58454a.add(iVar);
                } else if (iVar instanceof b1.h) {
                    this.f58454a.remove(((b1.h) iVar).getEnter());
                } else if (iVar instanceof d) {
                    this.f58454a.add(iVar);
                } else if (iVar instanceof b1.e) {
                    this.f58454a.remove(((b1.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f58454a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f58454a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f58454a.remove(((n.a) iVar).getPress());
                } else if (iVar instanceof b1.b) {
                    this.f58454a.add(iVar);
                } else if (iVar instanceof c) {
                    this.f58454a.remove(((c) iVar).getStart());
                } else if (iVar instanceof b1.a) {
                    this.f58454a.remove(((b1.a) iVar).getStart());
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, SnapshotStateList<i> snapshotStateList, e<? super a> eVar) {
            super(2, eVar);
            this.f58452f = jVar;
            this.f58453g = snapshotStateList;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f58451e;
            if (i15 == 0) {
                u.b(obj);
                mu.g<i> gVarC = this.f58452f.c();
                C1311a c1311a = new C1311a(this.f58453g);
                this.f58451e = 1;
                if (gVarC.a(c1311a, this) == objE) {
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f58452f, this.f58453g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0.c<c5.h, u0.p> f58456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f58457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f58458h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1 f58459j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ i f58460k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u0.c<c5.h, u0.p> cVar, float f15, boolean z15, z1 z1Var, i iVar, e<? super b> eVar) {
            super(2, eVar);
            this.f58456f = cVar;
            this.f58457g = f15;
            this.f58458h = z15;
            this.f58459j = z1Var;
            this.f58460k = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
        
            if (h2.g1.d(r7, r1, r3, r4, r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f58455e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                oq.u.b(r7)
                goto Lb2
            L1c:
                oq.u.b(r7)
                u0.c<c5.h, u0.p> r7 = r6.f58456f
                java.lang.Object r7 = r7.k()
                c5.h r7 = (c5.h) r7
                float r7 = r7.getValue()
                float r1 = r6.f58457g
                boolean r7 = c5.h.p(r7, r1)
                if (r7 != 0) goto Lb2
                boolean r7 = r6.f58458h
                if (r7 != 0) goto L48
                u0.c<c5.h, u0.p> r7 = r6.f58456f
                float r1 = r6.f58457g
                c5.h r1 = c5.h.j(r1)
                r6.f58455e = r3
                java.lang.Object r7 = r7.t(r1, r6)
                if (r7 != r0) goto Lb2
                goto Lb1
            L48:
                u0.c<c5.h, u0.p> r7 = r6.f58456f
                java.lang.Object r7 = r7.k()
                c5.h r7 = (c5.h) r7
                float r7 = r7.getValue()
                f2.z1 r1 = r6.f58459j
                float r1 = p046f2.z1.d(r1)
                boolean r1 = c5.h.p(r7, r1)
                r3 = 0
                if (r1 == 0) goto L6e
                b1.n$b r7 = new b1.n$b
                m3.e$a r1 = m3.e.INSTANCE
                long r4 = r1.c()
                r7.<init>(r4, r3)
                r3 = r7
                goto La3
            L6e:
                f2.z1 r1 = r6.f58459j
                float r1 = p046f2.z1.c(r1)
                boolean r1 = c5.h.p(r7, r1)
                if (r1 == 0) goto L80
                b1.g r3 = new b1.g
                r3.<init>()
                goto La3
            L80:
                f2.z1 r1 = r6.f58459j
                float r1 = p046f2.z1.b(r1)
                boolean r1 = c5.h.p(r7, r1)
                if (r1 == 0) goto L92
                b1.d r3 = new b1.d
                r3.<init>()
                goto La3
            L92:
                f2.z1 r1 = r6.f58459j
                float r1 = p046f2.z1.a(r1)
                boolean r7 = c5.h.p(r7, r1)
                if (r7 == 0) goto La3
                b1.b r3 = new b1.b
                r3.<init>()
            La3:
                u0.c<c5.h, u0.p> r7 = r6.f58456f
                float r1 = r6.f58457g
                b1.i r4 = r6.f58460k
                r6.f58455e = r2
                java.lang.Object r7 = h2.g1.d(r7, r1, r3, r4, r6)
                if (r7 != r0) goto Lb2
            Lb1:
                return r0
            Lb2:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.z1.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f58456f, this.f58457g, this.f58458h, this.f58459j, this.f58460k, eVar);
        }
    }

    public /* synthetic */ z1(float f15, float f16, float f17, float f18, float f19, float f25, fr.k kVar) {
        this(f15, f16, f17, f18, f19, f25);
    }

    private final f6<c5.h> e(boolean z15, j jVar, r rVar, int i15) {
        float f15;
        u0.c cVar;
        if (t.k()) {
            t.o(-1421890746, i15, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:666)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = x5.f();
            rVar.v(objE);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objE;
        boolean z16 = true;
        boolean z17 = (((i15 & 112) ^ 48) > 32 && rVar.W(jVar)) || (i15 & 48) == 32;
        Object objE2 = rVar.E();
        if (z17 || objE2 == companion.a()) {
            objE2 = new a(jVar, snapshotStateList, null);
            rVar.v(objE2);
        }
        Function0.d(jVar, (p) objE2, rVar, (i15 >> 3) & 14);
        i iVar = (i) v.z0(snapshotStateList);
        if (!z15) {
            f15 = this.disabledElevation;
        } else if (iVar instanceof n.b) {
            f15 = this.pressedElevation;
        } else if (iVar instanceof g) {
            f15 = this.hoveredElevation;
        } else if (iVar instanceof d) {
            f15 = this.focusedElevation;
        } else {
            f15 = iVar instanceof b1.b ? this.draggedElevation : this.defaultElevation;
        }
        Object objE3 = rVar.E();
        if (objE3 == companion.a()) {
            Object cVar2 = new u0.c(c5.h.j(f15), s3.L(c5.h.INSTANCE), null, null, 12, null);
            rVar.v(cVar2);
            objE3 = cVar2;
        }
        u0.c cVar3 = (u0.c) objE3;
        c5.h hVarJ = c5.h.j(f15);
        boolean zG = rVar.G(cVar3) | rVar.b(f15) | ((((i15 & 14) ^ 6) > 4 && rVar.a(z15)) || (i15 & 6) == 4);
        if ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !rVar.W(this)) && (i15 & MLKEMEngine.KyberPolyBytes) != 256) {
            z16 = false;
        }
        boolean zG2 = zG | z16 | rVar.G(iVar);
        Object objE4 = rVar.E();
        if (zG2 || objE4 == companion.a()) {
            cVar = cVar3;
            Object bVar = new b(cVar, f15, z15, this, iVar, null);
            rVar.v(bVar);
            objE4 = bVar;
        } else {
            cVar = cVar3;
        }
        Function0.d(hVarJ, (p) objE4, rVar, 0);
        f6<c5.h> f6VarG = cVar.g();
        if (t.k()) {
            t.n();
        }
        return f6VarG;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) other;
        return c5.h.p(this.defaultElevation, z1Var.defaultElevation) && c5.h.p(this.pressedElevation, z1Var.pressedElevation) && c5.h.p(this.focusedElevation, z1Var.focusedElevation) && c5.h.p(this.hoveredElevation, z1Var.hoveredElevation) && c5.h.p(this.disabledElevation, z1Var.disabledElevation);
    }

    public final f6<c5.h> f(boolean z15, j jVar, r rVar, int i15) {
        rVar.X(-1763481333);
        if (t.k()) {
            t.o(-1763481333, i15, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:655)");
        }
        if (jVar != null) {
            rVar.X(167799447);
            rVar.R();
            f6<c5.h> f6VarE = e(z15, jVar, rVar, i15 & 1022);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return f6VarE;
        }
        rVar.X(167726411);
        Object objE = rVar.E();
        if (objE == r.INSTANCE.a()) {
            objE = c6.e(c5.h.j(this.defaultElevation), null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        rVar.R();
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return a3Var;
    }

    public int hashCode() {
        return (((((((c5.h.q(this.defaultElevation) * 31) + c5.h.q(this.pressedElevation)) * 31) + c5.h.q(this.focusedElevation)) * 31) + c5.h.q(this.hoveredElevation)) * 31) + c5.h.q(this.disabledElevation);
    }

    private z1(float f15, float f16, float f17, float f18, float f19, float f25) {
        this.defaultElevation = f15;
        this.pressedElevation = f16;
        this.focusedElevation = f17;
        this.hoveredElevation = f18;
        this.draggedElevation = f19;
        this.disabledElevation = f25;
    }
}
