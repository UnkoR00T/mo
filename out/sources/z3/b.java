package z3;

import c5.y;
import fr.w;
import ju.p0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lz3/b;", "", "<init>", "()V", "Lm3/e;", "available", "Lz3/g;", "source", "d", "(JI)J", "consumed", "b", "(JJI)J", "Lc5/y;", "c", "(JLtq/e;)Ljava/lang/Object;", "a", "(JJLtq/e;)Ljava/lang/Object;", "Lz3/e;", "Lz3/e;", "f", "()Lz3/e;", "k", "(Lz3/e;)V", "nestedScrollNode", "getLastKnownParentNode$ui", "j", "lastKnownParentNode", "Lkotlin/Function0;", "Lju/p0;", "Ler/a;", "getCalculateNestedScrollScope$ui", "()Ler/a;", "i", "(Ler/a;)V", "calculateNestedScrollScope", "Lju/p0;", "h", "()Lju/p0;", "l", "(Lju/p0;)V", "scope", "e", "coroutineScope", "Lz3/a;", "g", "()Lz3/a;", "parent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private e nestedScrollNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e lastKnownParentNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private er.a<? extends p0> calculateNestedScrollScope = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p0 scope;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lju/p0;", "c", "()Lju/p0;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<p0> {
        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p0 a() {
            return b.this.getScope();
        }
    }

    /* JADX INFO: renamed from: z3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C6248b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f232730d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232732f;

        C6248b(tq.e<? super C6248b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232730d = obj;
            this.f232732f |= PKIFailureInfo.systemUnavail;
            return b.this.a(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f232733d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232735f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232733d = obj;
            this.f232735f |= PKIFailureInfo.systemUnavail;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, tq.e<? super c5.y> r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof z3.b.C6248b
            if (r0 == 0) goto L14
            r0 = r12
            z3.b$b r0 = (z3.b.C6248b) r0
            int r1 = r0.f232732f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f232732f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            z3.b$b r0 = new z3.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f232730d
            java.lang.Object r0 = uq.b.e()
            int r1 = r6.f232732f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            oq.u.b(r12)
            goto L71
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            oq.u.b(r12)
            goto L52
        L3a:
            oq.u.b(r12)
            z3.a r12 = r7.g()
            if (r12 != 0) goto L60
            z3.e r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L59
            r6.f232732f = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.W0(r2, r4, r6)
            if (r12 != r0) goto L52
            goto L70
        L52:
            c5.y r12 = (c5.y) r12
            long r8 = r12.getPackedValue()
            goto L7e
        L59:
            c5.y$a r8 = c5.y.INSTANCE
            long r8 = r8.a()
            goto L7e
        L60:
            r4 = r10
            z3.a r1 = r7.g()
            if (r1 == 0) goto L78
            r6.f232732f = r2
            r2 = r8
            java.lang.Object r12 = r1.W0(r2, r4, r6)
            if (r12 != r0) goto L71
        L70:
            return r0
        L71:
            c5.y r12 = (c5.y) r12
            long r8 = r12.getPackedValue()
            goto L7e
        L78:
            c5.y$a r8 = c5.y.INSTANCE
            long r8 = r8.a()
        L7e:
            c5.y r8 = c5.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.b.a(long, long, tq.e):java.lang.Object");
    }

    public final long b(long consumed, long available, int source) {
        z3.a aVarG = g();
        return aVarG != null ? aVarG.d1(consumed, available, source) : m3.e.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j15, tq.e<? super y> eVar) throws Throwable {
        c cVar;
        long jA;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f232735f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f232735f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objR2 = cVar.f232733d;
        Object objE = uq.b.e();
        int i16 = cVar.f232735f;
        if (i16 == 0) {
            u.b(objR2);
            z3.a aVarG = g();
            if (aVarG != null) {
                cVar.f232735f = 1;
                objR2 = aVarG.r2(j15, cVar);
                if (objR2 == objE) {
                    return objE;
                }
            } else {
                jA = y.INSTANCE.a();
            }
            return y.b(jA);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(objR2);
        jA = ((y) objR2).getPackedValue();
        return y.b(jA);
    }

    public final long d(long available, int source) {
        z3.a aVarG = g();
        return aVarG != null ? aVarG.h2(available, source) : m3.e.INSTANCE.c();
    }

    public final p0 e() {
        p0 p0VarA = this.calculateNestedScrollScope.a();
        if (p0VarA != null) {
            return p0VarA;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final z3.a g() {
        e eVar = this.nestedScrollNode;
        if (eVar != null) {
            return eVar.q3();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final p0 getScope() {
        return this.scope;
    }

    public final void i(er.a<? extends p0> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void j(e eVar) {
        this.lastKnownParentNode = eVar;
    }

    public final void k(e eVar) {
        this.nestedScrollNode = eVar;
    }

    public final void l(p0 p0Var) {
        this.scope = p0Var;
    }
}
