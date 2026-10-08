package p012a2;

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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"La2/o1;", "La2/t0;", "Lc5/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFFLfr/k;)V", "", "enabled", "Lb1/j;", "interactionSource", "Lm2/f6;", "a", "(ZLb1/j;Lm2/r;I)Lm2/f6;", "F", "b", "c", "d", "e", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class o1 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f1840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<i> f1841g;

        /* JADX INFO: renamed from: a2.o1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0024a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<i> f1842a;

            C0024a(SnapshotStateList<i> snapshotStateList) {
                this.f1842a = snapshotStateList;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, e<? super i0> eVar) {
                if (iVar instanceof g) {
                    this.f1842a.add(iVar);
                } else if (iVar instanceof b1.h) {
                    this.f1842a.remove(((b1.h) iVar).getEnter());
                } else if (iVar instanceof d) {
                    this.f1842a.add(iVar);
                } else if (iVar instanceof b1.e) {
                    this.f1842a.remove(((b1.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f1842a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f1842a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f1842a.remove(((n.a) iVar).getPress());
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, SnapshotStateList<i> snapshotStateList, e<? super a> eVar) {
            super(2, eVar);
            this.f1840f = jVar;
            this.f1841g = snapshotStateList;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1839e;
            if (i15 == 0) {
                u.b(obj);
                mu.g<i> gVarC = this.f1840f.c();
                C0024a c0024a = new C0024a(this.f1841g);
                this.f1839e = 1;
                if (gVarC.a(c0024a, this) == objE) {
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
            return new a(this.f1840f, this.f1841g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<c5.h, u0.p> f1844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f1845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f1846h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ o1 f1847j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ i f1848k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<c5.h, u0.p> cVar, float f15, boolean z15, o1 o1Var, i iVar, e<? super b> eVar) {
            super(2, eVar);
            this.f1844f = cVar;
            this.f1845g = f15;
            this.f1846h = z15;
            this.f1847j = o1Var;
            this.f1848k = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (p012a2.x1.d(r7, r1, r3, r4, r6) == r0) goto L28;
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
                int r1 = r6.f1843e
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
                u0.c<c5.h, u0.p> r7 = r6.f1844f
                java.lang.Object r7 = r7.k()
                c5.h r7 = (c5.h) r7
                float r7 = r7.getValue()
                float r1 = r6.f1845g
                boolean r7 = c5.h.p(r7, r1)
                if (r7 != 0) goto La0
                boolean r7 = r6.f1846h
                if (r7 != 0) goto L48
                u0.c<c5.h, u0.p> r7 = r6.f1844f
                float r1 = r6.f1845g
                c5.h r1 = c5.h.j(r1)
                r6.f1843e = r3
                java.lang.Object r7 = r7.t(r1, r6)
                if (r7 != r0) goto La0
                goto L9f
            L48:
                u0.c<c5.h, u0.p> r7 = r6.f1844f
                java.lang.Object r7 = r7.k()
                c5.h r7 = (c5.h) r7
                float r7 = r7.getValue()
                a2.o1 r1 = r6.f1847j
                float r1 = p012a2.o1.d(r1)
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
                a2.o1 r1 = r6.f1847j
                float r1 = p012a2.o1.c(r1)
                boolean r1 = c5.h.p(r7, r1)
                if (r1 == 0) goto L80
                b1.g r3 = new b1.g
                r3.<init>()
                goto L91
            L80:
                a2.o1 r1 = r6.f1847j
                float r1 = p012a2.o1.b(r1)
                boolean r7 = c5.h.p(r7, r1)
                if (r7 == 0) goto L91
                b1.d r3 = new b1.d
                r3.<init>()
            L91:
                u0.c<c5.h, u0.p> r7 = r6.f1844f
                float r1 = r6.f1845g
                b1.i r4 = r6.f1848k
                r6.f1843e = r2
                java.lang.Object r7 = p012a2.x1.d(r7, r1, r3, r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.o1.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f1844f, this.f1845g, this.f1846h, this.f1847j, this.f1848k, eVar);
        }
    }

    public /* synthetic */ o1(float f15, float f16, float f17, float f18, float f19, fr.k kVar) {
        this(f15, f16, f17, f18, f19);
    }

    @Override // p012a2.t0
    public f6<c5.h> a(boolean z15, j jVar, r rVar, int i15) {
        float f15;
        c cVar;
        rVar.X(-1588756907);
        if (t.k()) {
            t.o(-1588756907, i15, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:500)");
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
        rVar.R();
        return f6VarG;
    }

    private o1(float f15, float f16, float f17, float f18, float f19) {
        this.defaultElevation = f15;
        this.pressedElevation = f16;
        this.disabledElevation = f17;
        this.hoveredElevation = f18;
        this.focusedElevation = f19;
    }
}
