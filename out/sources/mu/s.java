package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\u000e\u0010\t\u001a\u0017\u0010\u000f\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\\\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lmu/g;", "Lkotlin/Function2;", "Lmu/h;", "Ltq/e;", "Loq/i0;", "", "action", "f", "(Lmu/g;Ler/p;)Lmu/g;", "Lkotlin/Function3;", "", "d", "(Lmu/g;Ler/q;)Lmu/g;", "e", "b", "(Lmu/h;)V", "cause", "c", "(Lmu/h;Ler/q;Ljava/lang/Throwable;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f128317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f128318f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128317e = obj;
            this.f128318f |= PKIFailureInfo.systemUnavail;
            return s.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/s$b", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.q f128320b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128321d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128322e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f128324g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128325h;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128321d = obj;
                this.f128322e |= PKIFailureInfo.systemUnavail;
                return b.this.a(null, this);
            }
        }

        public b(g gVar, er.q qVar) {
            this.f128319a = gVar;
            this.f128320b = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.g
        public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            b<T> bVar;
            v0 v0Var;
            er.q qVar;
            p086nu.w wVar;
            Throwable th4;
            p086nu.w wVar2;
            Object objW;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128322e;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128322e = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f128321d;
            Object objE = uq.b.e();
            int i16 = aVar.f128322e;
            if (i16 == 0) {
                oq.u.b(obj);
                try {
                    g gVar = this.f128319a;
                    aVar.f128324g = this;
                    aVar.f128325h = hVar;
                    aVar.f128322e = 1;
                    if (gVar.a(hVar, aVar) != objE) {
                        bVar = this;
                        wVar = new p086nu.w(hVar, aVar.getContext());
                        er.q qVar2 = bVar.f128320b;
                        aVar.f128324g = wVar;
                        aVar.f128325h = null;
                        aVar.f128322e = 3;
                        fr.r.c(6);
                        objW = qVar2.w(wVar, null, aVar);
                        fr.r.c(7);
                        if (objW != objE) {
                            wVar2 = wVar;
                            wVar2.K();
                            return oq.i0.f148189a;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    bVar = this;
                    v0Var = new v0(th);
                    qVar = bVar.f128320b;
                    aVar.f128324g = th;
                    aVar.f128325h = null;
                    aVar.f128322e = 2;
                    if (s.c(v0Var, qVar, th, aVar) == objE) {
                        throw th;
                    }
                }
                return objE;
            }
            if (i16 != 1) {
                if (i16 == 2) {
                    Throwable th6 = (Throwable) aVar.f128324g;
                    oq.u.b(obj);
                    throw th6;
                }
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar2 = (p086nu.w) aVar.f128324g;
                try {
                    oq.u.b(obj);
                    wVar2.K();
                    return oq.i0.f148189a;
                } catch (Throwable th7) {
                    th4 = th7;
                    wVar2.K();
                    throw th4;
                }
            }
            hVar = (h) aVar.f128325h;
            bVar = (b) aVar.f128324g;
            try {
                oq.u.b(obj);
                wVar = new p086nu.w(hVar, aVar.getContext());
                try {
                    er.q qVar3 = bVar.f128320b;
                    aVar.f128324g = wVar;
                    aVar.f128325h = null;
                    aVar.f128322e = 3;
                    fr.r.c(6);
                    objW = qVar3.w(wVar, null, aVar);
                    fr.r.c(7);
                    if (objW != objE) {
                        wVar2 = wVar;
                        wVar2.K();
                        return oq.i0.f148189a;
                    }
                    return objE;
                } catch (Throwable th8) {
                    th4 = th8;
                    wVar2 = wVar;
                    wVar2.K();
                    throw th4;
                }
            } catch (Throwable th9) {
                th = th9;
                v0Var = new v0(th);
                qVar = bVar.f128320b;
                aVar.f128324g = th;
                aVar.f128325h = null;
                aVar.f128322e = 2;
                if (s.c(v0Var, qVar, th, aVar) == objE) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/s$c", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f128327b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128328d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128329e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f128331g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128332h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f128333j;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128328d = obj;
                this.f128329e |= PKIFailureInfo.systemUnavail;
                return c.this.a(null, this);
            }
        }

        public c(g gVar, er.p pVar) {
            this.f128326a = gVar;
            this.f128327b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        
            if (r8 == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [mu.h] */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, mu.h, mu.h<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [nu.w] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [nu.w] */
        @Override // mu.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(mu.h<? super T> r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.s.c.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.s$c$a r0 = (mu.s.c.a) r0
                int r1 = r0.f128329e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128329e = r1
                goto L18
            L13:
                mu.s$c$a r0 = new mu.s$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f128328d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128329e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.f128331g
                nu.w r7 = (p086nu.w) r7
                oq.u.b(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.f128333j
                fr.l0 r7 = (fr.l0) r7
                java.lang.Object r2 = r0.f128332h
                mu.h r2 = (mu.h) r2
                java.lang.Object r4 = r0.f128331g
                mu.s$c r4 = (mu.s.c) r4
                oq.u.b(r8)
                goto L6d
            L4a:
                oq.u.b(r8)
                fr.l0 r8 = new fr.l0
                r8.<init>()
                r8.f66404a = r4
                mu.g r2 = r6.f128326a
                mu.s$d r5 = new mu.s$d
                r5.<init>(r8, r7)
                r0.f128331g = r6
                r0.f128332h = r7
                r0.f128333j = r8
                r0.f128329e = r4
                java.lang.Object r2 = r2.a(r5, r0)
                if (r2 != r1) goto L6a
                goto L93
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.f66404a
                if (r7 == 0) goto L9c
                nu.w r7 = new nu.w
                tq.i r8 = r0.getContext()
                r7.<init>(r2, r8)
                er.p r8 = r4.f128327b     // Catch: java.lang.Throwable -> L30
                r0.f128331g = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.f128332h = r2     // Catch: java.lang.Throwable -> L30
                r0.f128333j = r2     // Catch: java.lang.Throwable -> L30
                r0.f128329e = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                fr.r.c(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.B(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                fr.r.c(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
            L93:
                return r1
            L94:
                r7.K()
                goto L9c
            L98:
                r7.K()
                throw r8
            L9c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.s.c.a(mu.h, tq.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.l0 f128334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<T> f128335b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128336d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d<T> f128337e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128338f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128337e = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128336d = obj;
                this.f128338f |= PKIFailureInfo.systemUnavail;
                return this.f128337e.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(fr.l0 l0Var, h<? super T> hVar) {
            this.f128334a = l0Var;
            this.f128335b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128338f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128338f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(this, eVar);
                }
            } else {
                aVar = new a(this, eVar);
            }
            Object obj = aVar.f128336d;
            Object objE = uq.b.e();
            int i16 = aVar.f128338f;
            if (i16 == 0) {
                oq.u.b(obj);
                this.f128334a.f66404a = false;
                h<T> hVar = this.f128335b;
                aVar.f128338f = 1;
                if (hVar.F(t15, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/s$e", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p f128339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f128340b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128341d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128342e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f128344g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128345h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f128346j;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128341d = obj;
                this.f128342e |= PKIFailureInfo.systemUnavail;
                return e.this.a(null, this);
            }
        }

        public e(er.p pVar, g gVar) {
            this.f128339a = pVar;
            this.f128340b = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.a(r2, r0) == r1) goto L27;
         */
        @Override // mu.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(mu.h<? super T> r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.s.e.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.s$e$a r0 = (mu.s.e.a) r0
                int r1 = r0.f128342e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128342e = r1
                goto L18
            L13:
                mu.s$e$a r0 = new mu.s$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f128341d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128342e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f128346j
                nu.w r7 = (p086nu.w) r7
                java.lang.Object r2 = r0.f128345h
                mu.h r2 = (mu.h) r2
                java.lang.Object r4 = r0.f128344g
                mu.s$e r4 = (mu.s.e) r4
                oq.u.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                oq.u.b(r8)
                nu.w r8 = new nu.w
                tq.i r2 = r0.getContext()
                r8.<init>(r7, r2)
                er.p r2 = r6.f128339a     // Catch: java.lang.Throwable -> L86
                r0.f128344g = r6     // Catch: java.lang.Throwable -> L86
                r0.f128345h = r7     // Catch: java.lang.Throwable -> L86
                r0.f128346j = r8     // Catch: java.lang.Throwable -> L86
                r0.f128342e = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                fr.r.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.B(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                fr.r.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.K()
                mu.g r7 = r4.f128340b
                r8 = 0
                r0.f128344g = r8
                r0.f128345h = r8
                r0.f128346j = r8
                r0.f128342e = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.K()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.s.e.a(mu.h, tq.e):java.lang.Object");
        }
    }

    public static final void b(h<?> hVar) {
        if (hVar instanceof v0) {
            throw ((v0) hVar).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(h<? super T> hVar, er.q<? super h<? super T>, ? super Throwable, ? super tq.e<? super oq.i0>, ? extends Object> qVar, Throwable th4, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f128318f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f128318f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f128317e;
        Object objE = uq.b.e();
        int i16 = aVar.f128318f;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                aVar.f128316d = th4;
                aVar.f128318f = 1;
                if (qVar.w(hVar, th4, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th4 = (Throwable) aVar.f128316d;
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        } catch (Throwable th5) {
            if (th4 != null && th4 != th5) {
                oq.c.a(th5, th4);
            }
            throw th5;
        }
    }

    public static final <T> g<T> d(g<? extends T> gVar, er.q<? super h<? super T>, ? super Throwable, ? super tq.e<? super oq.i0>, ? extends Object> qVar) {
        return new b(gVar, qVar);
    }

    public static final <T> g<T> e(g<? extends T> gVar, er.p<? super h<? super T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        return new c(gVar, pVar);
    }

    public static final <T> g<T> f(g<? extends T> gVar, er.p<? super h<? super T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        return new e(pVar, gVar);
    }
}
