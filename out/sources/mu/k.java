package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"T", "Lmu/h;", "Llu/y;", "channel", "Loq/i0;", "c", "(Lmu/h;Llu/y;Ltq/e;)Ljava/lang/Object;", "", "consume", "d", "(Lmu/h;Llu/y;ZLtq/e;)Ljava/lang/Object;", "Lmu/g;", "e", "(Llu/y;)Lmu/g;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f128226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f128227h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f128228j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128227h = obj;
            this.f128228j |= PKIFailureInfo.systemUnavail;
            return k.d(null, null, false, this);
        }
    }

    public static final <T> g<T> b(lu.y<? extends T> yVar) {
        return new c(yVar, true, null, 0, null, 28, null);
    }

    public static final <T> Object c(h<? super T> hVar, lu.y<? extends T> yVar, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objD = d(hVar, yVar, true, eVar);
        return objD == uq.b.e() ? objD : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.F(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(mu.h<? super T> r6, lu.y<? extends T> r7, boolean r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof mu.k.a
            if (r0 == 0) goto L13
            r0 = r9
            mu.k$a r0 = (mu.k.a) r0
            int r1 = r0.f128228j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128228j = r1
            goto L18
        L13:
            mu.k$a r0 = new mu.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f128227h
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f128228j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f128226g
            java.lang.Object r6 = r0.f128225f
            lu.i r6 = (lu.i) r6
            java.lang.Object r7 = r0.f128224e
            lu.y r7 = (lu.y) r7
            java.lang.Object r2 = r0.f128223d
            mu.h r2 = (mu.h) r2
            oq.u.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f128226g
            java.lang.Object r6 = r0.f128225f
            lu.i r6 = (lu.i) r6
            java.lang.Object r7 = r0.f128224e
            lu.y r7 = (lu.y) r7
            java.lang.Object r2 = r0.f128223d
            mu.h r2 = (mu.h) r2
            oq.u.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            oq.u.b(r9)
            mu.i.w(r6)
            lu.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f128223d = r6     // Catch: java.lang.Throwable -> L3c
            r0.f128224e = r7     // Catch: java.lang.Throwable -> L3c
            r0.f128225f = r9     // Catch: java.lang.Throwable -> L3c
            r0.f128226g = r8     // Catch: java.lang.Throwable -> L3c
            r0.f128228j = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f128223d = r2     // Catch: java.lang.Throwable -> L3c
            r0.f128224e = r7     // Catch: java.lang.Throwable -> L3c
            r0.f128225f = r6     // Catch: java.lang.Throwable -> L3c
            r0.f128226g = r8     // Catch: java.lang.Throwable -> L3c
            r0.f128228j = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.F(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            lu.n.a(r7, r6)
        L9a:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            lu.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.k.d(mu.h, lu.y, boolean, tq.e):java.lang.Object");
    }

    public static final <T> g<T> e(lu.y<? extends T> yVar) {
        return new c(yVar, false, null, 0, null, 28, null);
    }
}
