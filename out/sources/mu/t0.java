package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmu/t0;", "T", "Lmu/h;", "collector", "Lkotlin/Function2;", "Ltq/e;", "Loq/i0;", "", "action", "<init>", "(Lmu/h;Ler/p;)V", "a", "(Ltq/e;)Ljava/lang/Object;", "value", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Lmu/h;", "b", "Ler/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<T> collector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.p<h<? super T>, tq.e<? super oq.i0>, Object> action;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ t0<T> f128379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f128380h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0<T> t0Var, tq.e<? super a> eVar) {
            super(eVar);
            this.f128379g = t0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128378f = obj;
            this.f128380h |= PKIFailureInfo.systemUnavail;
            return this.f128379g.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(h<? super T> hVar, er.p<? super h<? super T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        this.collector = hVar;
        this.action = pVar;
    }

    @Override // mu.h
    public Object F(T t15, tq.e<? super oq.i0> eVar) {
        return this.collector.F(t15, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((mu.t0) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [nu.w] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mu.t0.a
            if (r0 == 0) goto L13
            r0 = r7
            mu.t0$a r0 = (mu.t0.a) r0
            int r1 = r0.f128380h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128380h = r1
            goto L18
        L13:
            mu.t0$a r0 = new mu.t0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f128378f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f128380h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f128377e
            nu.w r2 = (p086nu.w) r2
            java.lang.Object r4 = r0.f128376d
            mu.t0 r4 = (mu.t0) r4
            oq.u.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            oq.u.b(r7)
            nu.w r2 = new nu.w
            mu.h<T> r7 = r6.collector
            tq.i r5 = r0.getContext()
            r2.<init>(r7, r5)
            er.p<mu.h<? super T>, tq.e<? super oq.i0>, java.lang.Object> r7 = r6.action     // Catch: java.lang.Throwable -> L40
            r0.f128376d = r6     // Catch: java.lang.Throwable -> L40
            r0.f128377e = r2     // Catch: java.lang.Throwable -> L40
            r0.f128380h = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.B(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.K()
            mu.h<T> r7 = r4.collector
            boolean r2 = r7 instanceof mu.t0
            if (r2 == 0) goto L7c
            mu.t0 r7 = (mu.t0) r7
            r2 = 0
            r0.f128376d = r2
            r0.f128377e = r2
            r0.f128380h = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        L7c:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        L7f:
            r2.K()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.t0.a(tq.e):java.lang.Object");
    }
}
