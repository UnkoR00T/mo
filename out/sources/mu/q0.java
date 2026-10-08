package mu;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030#2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J-\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010\tR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00109\u001a\b\u0012\u0004\u0012\u00020\u0005088\u0002X\u0082\u0004¨\u0006:"}, d2 = {"Lmu/q0;", "T", "Lnu/b;", "Lmu/s0;", "Lmu/b0;", "", "Lnu/r;", "initialState", "<init>", "(Ljava/lang/Object;)V", "expectedState", "newState", "", "q", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "s", "value", "f", "(Ljava/lang/Object;)Z", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "u", "()V", "Lmu/h;", "collector", "", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "n", "()Lmu/s0;", "", "size", "", "o", "(I)[Lmu/s0;", "Ltq/i;", "context", "capacity", "Llu/a;", "onBufferOverflow", "Lmu/g;", "b", "(Ltq/i;ILlu/a;)Lmu/g;", "e", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "", "c", "()Ljava/util/List;", "replayCache", "Liu/e;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q0<T> extends p086nu.b<s0> implements b0<T>, g, p086nu.r<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f128302f = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int sequence;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f128307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f128308h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f128309j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q0<T> f128310k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f128311l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q0<T> q0Var, tq.e<? super a> eVar) {
            super(eVar);
            this.f128310k = q0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128309j = obj;
            this.f128311l |= PKIFailureInfo.systemUnavail;
            return this.f128310k.a(null, this);
        }
    }

    public q0(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean q(Object expectedState, Object newState) {
        int i15;
        s0[] s0VarArrL;
        synchronized (this) {
            Object obj = f128302f.get(this);
            if (expectedState != null && !fr.t.c(obj, expectedState)) {
                return false;
            }
            if (fr.t.c(obj, newState)) {
                return true;
            }
            f128302f.set(this, newState);
            int i16 = this.sequence;
            if ((i16 & 1) != 0) {
                this.sequence = i16 + 2;
                return true;
            }
            int i17 = i16 + 1;
            this.sequence = i17;
            s0[] s0VarArrL2 = l();
            oq.i0 i0Var = oq.i0.f148189a;
            while (true) {
                s0[] s0VarArr = s0VarArrL2;
                if (s0VarArr != null) {
                    for (s0 s0Var : s0VarArr) {
                        if (s0Var != null) {
                            s0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i15 = this.sequence;
                    if (i15 == i17) {
                        this.sequence = i17 + 1;
                        return true;
                    }
                    s0VarArrL = l();
                    oq.i0 i0Var2 = oq.i0.f148189a;
                }
                s0VarArrL2 = s0VarArrL;
                i17 = i15;
            }
        }
    }

    @Override // mu.a0, mu.h
    public Object F(T t15, tq.e<? super oq.i0> eVar) {
        setValue(t15);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x0043, PHI: r2 r6 r7 r8 r11
      0x00ac: PHI (r2v8 ju.d2) = (r2v6 ju.d2), (r2v7 ju.d2), (r2v7 ju.d2), (r2v13 ju.d2) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r6v7 ??) = (r6v14 ??), (r6v15 ??), (r6v16 ??), (r6v17 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 ??) = (r7v0 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v6 mu.q0<T>) = (r8v4 mu.q0<T>), (r8v5 mu.q0<T>), (r8v5 mu.q0<T>), (r8v12 mu.q0<T>) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v19 java.lang.Object) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [nu.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, mu.s0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, mu.h] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // mu.f0, mu.g
    public java.lang.Object a(mu.h<? super T> r11, tq.e<?> r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.q0.a(mu.h, tq.e):java.lang.Object");
    }

    @Override // p086nu.r
    public g<T> b(tq.i context, int capacity, lu.a onBufferOverflow) {
        return r0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // mu.f0
    public List<T> c() {
        return pq.v.e(getValue());
    }

    @Override // mu.a0
    public boolean f(T value) {
        setValue(value);
        return true;
    }

    @Override // mu.b0, mu.p0
    public T getValue() {
        ou.e0 e0Var = p086nu.u.f138790a;
        T t15 = (T) f128302f.get(this);
        if (t15 == e0Var) {
            return null;
        }
        return t15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p086nu.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public s0 h() {
        return new s0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p086nu.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s0[] i(int size) {
        return new s0[size];
    }

    @Override // mu.b0
    public boolean s(T expect, T update) {
        if (expect == null) {
            expect = (T) p086nu.u.f138790a;
        }
        if (update == null) {
            update = (T) p086nu.u.f138790a;
        }
        return q(expect, update);
    }

    @Override // mu.b0
    public void setValue(T t15) {
        if (t15 == null) {
            t15 = (T) p086nu.u.f138790a;
        }
        q(null, t15);
    }

    @Override // mu.a0
    public void u() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }
}
