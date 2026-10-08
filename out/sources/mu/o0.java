package mu;

import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lmu/o0;", "Lmu/l0;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "Lmu/p0;", "", "subscriptionCount", "Lmu/g;", "Lmu/j0;", "a", "(Lmu/p0;)Lmu/g;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "J", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o0 implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long stopTimeout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long replayExpiration;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/h;", "Lmu/j0;", "", "count", "Loq/i0;", "<anonymous>", "(Lmu/h;I)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.q<h<? super j0>, Integer, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f128297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ int f128298g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:29:0x007d A[PHI: r1
          0x007d: PHI (r1v4 mu.h) = (r1v3 mu.h), (r1v9 mu.h) binds: [B:27:0x007a, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x008e A[PHI: r1
          0x008e: PHI (r1v5 mu.h) = (r1v3 mu.h), (r1v4 mu.h), (r1v11 mu.h) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.F(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.F(r10, r9) == r0) goto L34;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r9.f128296e
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f128297f
                mu.h r1 = (mu.h) r1
                oq.u.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f128297f
                mu.h r1 = (mu.h) r1
                oq.u.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f128297f
                mu.h r1 = (mu.h) r1
                oq.u.b(r10)
                goto L64
            L38:
                oq.u.b(r10)
                goto L9c
            L3c:
                oq.u.b(r10)
                java.lang.Object r10 = r9.f128297f
                r1 = r10
                mu.h r1 = (mu.h) r1
                int r10 = r9.f128298g
                if (r10 <= 0) goto L53
                mu.j0 r10 = mu.j0.START
                r9.f128296e = r6
                java.lang.Object r10 = r1.F(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                mu.o0 r10 = mu.o0.this
                long r6 = mu.o0.c(r10)
                r9.f128297f = r1
                r9.f128296e = r5
                java.lang.Object r10 = ju.z0.b(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                mu.o0 r10 = mu.o0.this
                long r5 = mu.o0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                mu.j0 r10 = mu.j0.STOP
                r9.f128297f = r1
                r9.f128296e = r4
                java.lang.Object r10 = r1.F(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                mu.o0 r10 = mu.o0.this
                long r4 = mu.o0.b(r10)
                r9.f128297f = r1
                r9.f128296e = r3
                java.lang.Object r10 = ju.z0.b(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                mu.j0 r10 = mu.j0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f128297f = r3
                r9.f128296e = r2
                java.lang.Object r10 = r1.F(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.o0.a.J(java.lang.Object):java.lang.Object");
        }

        public final Object M(h<? super j0> hVar, int i15, tq.e<? super oq.i0> eVar) {
            a aVar = o0.this.new a(eVar);
            aVar.f128297f = hVar;
            aVar.f128298g = i15;
            return aVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(h<? super j0> hVar, Integer num, tq.e<? super oq.i0> eVar) {
            return M(hVar, num.intValue(), eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/j0;", "it", "", "<anonymous>", "(Lmu/j0;)Z"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<j0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128301f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f128300e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return vq.b.a(((j0) this.f128301f) != j0.START);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(j0 j0Var, tq.e<? super Boolean> eVar) {
            return ((b) v(j0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f128301f = obj;
            return bVar;
        }
    }

    public o0(long j15, long j16) {
        this.stopTimeout = j15;
        this.replayExpiration = j16;
        if (j15 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j15 + " ms) cannot be negative").toString());
        }
        if (j16 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j16 + " ms) cannot be negative").toString());
    }

    @Override // mu.l0
    public g<j0> a(p0<Integer> subscriptionCount) {
        return i.p(i.s(i.d0(subscriptionCount, new a(null)), new b(null)));
    }

    public boolean equals(Object other) {
        if (!(other instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) other;
        return this.stopTimeout == o0Var.stopTimeout && this.replayExpiration == o0Var.replayExpiration;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.stopTimeout) * 31) + Long.hashCode(this.replayExpiration);
    }

    public String toString() {
        List listD = pq.v.d(2);
        if (this.stopTimeout > 0) {
            listD.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + pq.v.v0(pq.v.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
