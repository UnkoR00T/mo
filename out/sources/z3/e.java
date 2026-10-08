package z3;

import c5.y;
import f3.m;
import fr.t;
import fr.w;
import g4.q1;
import g4.r1;
import ju.p0;
import ju.q0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b \u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010$R\u001a\u0010=\u001a\u0002098BX\u0082\u0004¢\u0006\f\u0012\u0004\b<\u0010\u000e\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010-¨\u0006@"}, d2 = {"Lz3/e;", "Lg4/q1;", "Lz3/a;", "Lf3/m$c;", "connection", "Lz3/b;", "dispatcher", "<init>", "(Lz3/a;Lz3/b;)V", "newDispatcher", "Loq/i0;", "s3", "(Lz3/b;)V", "t3", "()V", "r3", "Lm3/e;", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "Lc5/y;", "r2", "(JLtq/e;)Ljava/lang/Object;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "W2", "X2", "u3", "r", "Lz3/a;", "getConnection", "()Lz3/a;", "setConnection", "(Lz3/a;)V", "s", "Lz3/b;", "resolvedDispatcher", "t", "Lz3/e;", "getLastKnownParentNode$ui", "()Lz3/e;", "setLastKnownParentNode$ui", "(Lz3/e;)V", "lastKnownParentNode", "", "v", "Ljava/lang/Object;", "T", "()Ljava/lang/Object;", "traverseKey", "p3", "parentConnection", "Lju/p0;", "o3", "()Lju/p0;", "getNestedCoroutineScope$annotations", "nestedCoroutineScope", "q3", "parentNestedScrollNode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends m.c implements q1, z3.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private z3.a connection;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private z3.b resolvedDispatcher;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private e lastKnownParentNode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f232742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f232743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232744f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f232746h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232744f = obj;
            this.f232746h |= PKIFailureInfo.systemUnavail;
            return e.this.W0(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f232747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f232748e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232750g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232748e = obj;
            this.f232750g |= PKIFailureInfo.systemUnavail;
            return e.this.r2(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lju/p0;", "c", "()Lju/p0;"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.a<p0> {
        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p0 a() {
            return e.this.o3();
        }
    }

    public e(z3.a aVar, z3.b bVar) {
        this.connection = aVar;
        this.resolvedDispatcher = bVar == null ? new z3.b() : bVar;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 o3() {
        e eVarQ3 = q3();
        p0 p0VarO3 = eVarQ3 != null ? eVarQ3.o3() : null;
        if (p0VarO3 != null && q0.g(p0VarO3)) {
            return p0VarO3;
        }
        p0 scope = this.resolvedDispatcher.getScope();
        if (scope != null) {
            return scope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final z3.a p3() {
        if (getIsAttached()) {
            return q3();
        }
        return null;
    }

    private final void r3() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.k(null);
        }
    }

    private final void s3(z3.b newDispatcher) {
        r3();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new z3.b();
        } else if (!t.c(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            t3();
        }
    }

    private final void t3() {
        this.resolvedDispatcher.k(this);
        this.resolvedDispatcher.j(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.i(new c());
        this.resolvedDispatcher.l(M2());
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // z3.a
    public Object W0(long j15, long j16, tq.e<? super y> eVar) {
        a aVar;
        long j17;
        long j18;
        long packedValue;
        long jA;
        long j19;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f232746h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f232746h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objW0 = aVar2.f232744f;
        Object objE = uq.b.e();
        int i16 = aVar2.f232746h;
        if (i16 == 0) {
            u.b(objW0);
            z3.a aVar3 = this.connection;
            aVar2.f232742d = j15;
            aVar2.f232743e = j16;
            aVar2.f232746h = 1;
            objW0 = aVar3.W0(j15, j16, aVar2);
            if (objW0 != objE) {
                j17 = j15;
                j18 = j16;
            }
            return objE;
        }
        if (i16 == 1) {
            j18 = aVar2.f232743e;
            j17 = aVar2.f232742d;
            u.b(objW0);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j19 = aVar2.f232742d;
            u.b(objW0);
        }
        jA = ((y) objW0).getPackedValue();
        packedValue = j19;
        return y.b(y.l(packedValue, jA));
        packedValue = ((y) objW0).getPackedValue();
        z3.a aVarP3 = getIsAttached() ? p3() : this.lastKnownParentNode;
        if (aVarP3 != null) {
            long jL = y.l(j17, packedValue);
            long jK = y.k(j18, packedValue);
            aVar2.f232742d = packedValue;
            aVar2.f232746h = 2;
            objW0 = aVarP3.W0(jL, jK, aVar2);
            if (objW0 != objE) {
                j19 = packedValue;
                jA = ((y) objW0).getPackedValue();
                packedValue = j19;
            }
            return objE;
        }
        jA = y.INSTANCE.a();
        return y.b(y.l(packedValue, jA));
    }

    @Override // f3.m.c
    public void W2() {
        t3();
    }

    @Override // f3.m.c
    public void X2() {
        e eVar = (e) f.b(this);
        this.lastKnownParentNode = eVar;
        this.resolvedDispatcher.j(eVar);
        r3();
    }

    @Override // z3.a
    public long d1(long consumed, long available, int source) {
        long jD1 = this.connection.d1(consumed, available, source);
        z3.a aVarP3 = p3();
        return m3.e.q(jD1, aVarP3 != null ? aVarP3.d1(m3.e.q(consumed, jD1), m3.e.p(available, jD1), source) : m3.e.INSTANCE.c());
    }

    @Override // z3.a
    public long h2(long available, int source) {
        z3.a aVarP3 = p3();
        long jH2 = aVarP3 != null ? aVarP3.h2(available, source) : m3.e.INSTANCE.c();
        return m3.e.q(jH2, this.connection.h2(m3.e.p(available, jH2), source));
    }

    public final e q3() {
        if (getIsAttached()) {
            return (e) r1.b(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r11 == r1) goto L26;
     */
    @Override // z3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r2(long r9, tq.e<? super c5.y> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof z3.e.b
            if (r0 == 0) goto L13
            r0 = r11
            z3.e$b r0 = (z3.e.b) r0
            int r1 = r0.f232750g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f232750g = r1
            goto L18
        L13:
            z3.e$b r0 = new z3.e$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f232748e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f232750g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f232747d
            oq.u.b(r11)
            goto L72
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f232747d
            oq.u.b(r11)
            goto L50
        L3c:
            oq.u.b(r11)
            z3.a r11 = r8.p3()
            if (r11 == 0) goto L5a
            r0.f232747d = r9
            r0.f232750g = r4
            java.lang.Object r11 = r11.r2(r9, r0)
            if (r11 != r1) goto L50
            goto L71
        L50:
            c5.y r11 = (c5.y) r11
            long r4 = r11.getPackedValue()
        L56:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L61
        L5a:
            c5.y$a r11 = c5.y.INSTANCE
            long r4 = r11.a()
            goto L56
        L61:
            z3.a r11 = r8.connection
            long r4 = c5.y.k(r4, r9)
            r0.f232747d = r9
            r0.f232750g = r3
            java.lang.Object r11 = r11.r2(r4, r0)
            if (r11 != r1) goto L72
        L71:
            return r1
        L72:
            c5.y r11 = (c5.y) r11
            long r0 = r11.getPackedValue()
            long r9 = c5.y.l(r9, r0)
            c5.y r9 = c5.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.e.r2(long, tq.e):java.lang.Object");
    }

    public final void u3(z3.a connection, z3.b dispatcher) {
        this.connection = connection;
        s3(dispatcher);
    }
}
