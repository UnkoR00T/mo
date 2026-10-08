package p046f2;

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
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import pq.v;
import tq.e;
import u0.c;
import u0.s3;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001c"}, d2 = {"Lf2/o1;", "", "Lc5/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLfr/k;)V", "", "enabled", "Lb1/j;", "interactionSource", "Lm2/f6;", "d", "(ZLb1/j;Lm2/r;I)Lm2/f6;", "e", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f57091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<i> f57092g;

        /* JADX INFO: renamed from: f2.o1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1307a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<i> f57093a;

            C1307a(SnapshotStateList<i> snapshotStateList) {
                this.f57093a = snapshotStateList;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, e<? super i0> eVar) {
                if (iVar instanceof g) {
                    this.f57093a.add(iVar);
                } else if (iVar instanceof b1.h) {
                    this.f57093a.remove(((b1.h) iVar).getEnter());
                } else if (iVar instanceof d) {
                    this.f57093a.add(iVar);
                } else if (iVar instanceof b1.e) {
                    this.f57093a.remove(((b1.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f57093a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f57093a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f57093a.remove(((n.a) iVar).getPress());
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, SnapshotStateList<i> snapshotStateList, e<? super a> eVar) {
            super(2, eVar);
            this.f57091f = jVar;
            this.f57092g = snapshotStateList;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f57090e;
            if (i15 == 0) {
                u.b(obj);
                mu.g<i> gVarC = this.f57091f.c();
                C1307a c1307a = new C1307a(this.f57092g);
                this.f57090e = 1;
                if (gVarC.a(c1307a, this) == objE) {
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
            return new a(this.f57091f, this.f57092g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<c5.h, u0.p> f57095f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f57096g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f57097h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ o1 f57098j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ i f57099k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<c5.h, u0.p> cVar, float f15, boolean z15, o1 o1Var, i iVar, e<? super b> eVar) {
            super(2, eVar);
            this.f57095f = cVar;
            this.f57096g = f15;
            this.f57097h = z15;
            this.f57098j = o1Var;
            this.f57099k = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (h2.g1.d(r7, r1, r3, r4, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        
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
                int r1 = r6.f57094e
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
                goto La0
            L1c:
                oq.u.b(r7)
                u0.c<c5.h, u0.p> r7 = r6.f57095f
                java.lang.Object r7 = r7.k()
                c5.h r7 = (c5.h) r7
                float r7 = r7.getValue()
                float r1 = r6.f57096g
                boolean r7 = c5.h.p(r7, r1)
                if (r7 != 0) goto La0
                boolean r7 = r6.f57097h
                if (r7 != 0) goto L48
                u0.c<c5.h, u0.p> r7 = r6.f57095f
                float r1 = r6.f57096g
                c5.h r1 = c5.h.j(r1)
                r6.f57094e = r3
                java.lang.Object r7 = r7.t(r1, r6)
                if (r7 != r0) goto La0
                goto L9f
            L48:
                u0.c<c5.h, u0.p> r7 = r6.f57095f
                java.lang.Object r7 = r7.k()
                c5.h r7 = (c5.h) r7
                float r7 = r7.getValue()
                f2.o1 r1 = r6.f57098j
                float r1 = p046f2.o1.c(r1)
                boolean r1 = c5.h.p(r7, r1)
                r3 = 0
                if (r1 == 0) goto L6e
                b1.n$b r7 = new b1.n$b
                m3.e$a r1 = m3.e.INSTANCE
                long r4 = r1.c()
                r7.<init>(r4, r3)
                r3 = r7
                goto L91
            L6e:
                f2.o1 r1 = r6.f57098j
                float r1 = p046f2.o1.b(r1)
                boolean r1 = c5.h.p(r7, r1)
                if (r1 == 0) goto L80
                b1.g r3 = new b1.g
                r3.<init>()
                goto L91
            L80:
                f2.o1 r1 = r6.f57098j
                float r1 = p046f2.o1.a(r1)
                boolean r7 = c5.h.p(r7, r1)
                if (r7 == 0) goto L91
                b1.d r3 = new b1.d
                r3.<init>()
            L91:
                u0.c<c5.h, u0.p> r7 = r6.f57095f
                float r1 = r6.f57096g
                b1.i r4 = r6.f57099k
                r6.f57094e = r2
                java.lang.Object r7 = h2.g1.d(r7, r1, r3, r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.o1.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f57095f, this.f57096g, this.f57097h, this.f57098j, this.f57099k, eVar);
        }
    }

    public /* synthetic */ o1(float f15, float f16, float f17, float f18, float f19, fr.k kVar) {
        this(f15, f16, f17, f18, f19);
    }

    private final f6<c5.h> d(boolean z15, j jVar, r rVar, int i15) {
        float f15;
        c cVar;
        if (t.k()) {
            t.o(-1312510462, i15, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:1818)");
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
        } else {
            f15 = iVar instanceof d ? this.focusedElevation : this.defaultElevation;
        }
        Object objE3 = rVar.E();
        if (objE3 == companion.a()) {
            Object cVar2 = new c(c5.h.j(f15), s3.L(c5.h.INSTANCE), null, null, 12, null);
            rVar.v(cVar2);
            objE3 = cVar2;
        }
        c cVar3 = (c) objE3;
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

    public final f6<c5.h> e(boolean z15, j jVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2045116089, i15, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:1810)");
        }
        f6<c5.h> f6VarD = d(z15, jVar, rVar, i15 & 1022);
        if (t.k()) {
            t.n();
        }
        return f6VarD;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) other;
        return c5.h.p(this.defaultElevation, o1Var.defaultElevation) && c5.h.p(this.pressedElevation, o1Var.pressedElevation) && c5.h.p(this.focusedElevation, o1Var.focusedElevation) && c5.h.p(this.hoveredElevation, o1Var.hoveredElevation) && c5.h.p(this.disabledElevation, o1Var.disabledElevation);
    }

    public int hashCode() {
        return (((((((c5.h.q(this.defaultElevation) * 31) + c5.h.q(this.pressedElevation)) * 31) + c5.h.q(this.focusedElevation)) * 31) + c5.h.q(this.hoveredElevation)) * 31) + c5.h.q(this.disabledElevation);
    }

    private o1(float f15, float f16, float f17, float f18, float f19) {
        this.defaultElevation = f15;
        this.pressedElevation = f16;
        this.focusedElevation = f17;
        this.hoveredElevation = f18;
        this.disabledElevation = f19;
    }
}
