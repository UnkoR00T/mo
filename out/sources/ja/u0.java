package ja;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001am\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\n\u001a\u00020\t2.\u0010\f\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "R", "Lja/n0;", "Lkotlin/Function2;", "Ltq/e;", "transform", "c", "(Lja/n0;Ler/p;)Lja/n0;", "Lja/l1;", "terminalSeparatorType", "Lkotlin/Function3;", "generator", "a", "(Lja/n0;Lja/l1;Ler/q;)Lja/n0;", "paging-common"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/paging/PagingDataTransforms")
public final /* synthetic */ class u0 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements mu.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f101191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f101192b;

        /* JADX INFO: renamed from: ja.u0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2391a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f101193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.p f101194b;

            /* JADX INFO: renamed from: ja.u0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2392a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f101195d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f101196e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f101197f;

                public C2392a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f101195d = obj;
                    this.f101196e |= PKIFailureInfo.systemUnavail;
                    return C2391a.this.F(null, this);
                }
            }

            public C2391a(mu.h hVar, er.p pVar) {
                this.f101193a = hVar;
                this.f101194b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r7.F(r8, r0) == r1) goto L22;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r7, tq.e r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof ja.u0.a.C2391a.C2392a
                    if (r0 == 0) goto L13
                    r0 = r8
                    ja.u0$a$a$a r0 = (ja.u0.a.C2391a.C2392a) r0
                    int r1 = r0.f101196e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f101196e = r1
                    goto L18
                L13:
                    ja.u0$a$a$a r0 = new ja.u0$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f101195d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f101196e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    oq.u.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f101197f
                    mu.h r7 = (mu.h) r7
                    oq.u.b(r8)
                    goto L53
                L3c:
                    oq.u.b(r8)
                    mu.h r8 = r6.f101193a
                    ja.f0 r7 = (ja.f0) r7
                    er.p r2 = r6.f101194b
                    r0.f101197f = r8
                    r0.f101196e = r4
                    java.lang.Object r7 = r7.a(r2, r0)
                    if (r7 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f101197f = r2
                    r0.f101196e = r3
                    java.lang.Object r7 = r7.F(r8, r0)
                    if (r7 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ja.u0.a.C2391a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public a(mu.g gVar, er.p pVar) {
            this.f101191a = gVar;
            this.f101192b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h hVar, tq.e eVar) {
            Object objA = this.f101191a.a(new C2391a(hVar, this.f101192b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public static final /* synthetic */ n0 a(n0 n0Var, l1 l1Var, er.q qVar) {
        return new n0(f1.c(n0Var.d(), l1Var, qVar), n0Var.getUiReceiver(), n0Var.getHintReceiver(), null, 8, null);
    }

    public static /* synthetic */ n0 b(n0 n0Var, l1 l1Var, er.q qVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            l1Var = l1.FULLY_COMPLETE;
        }
        return a(n0Var, l1Var, qVar);
    }

    public static final /* synthetic */ n0 c(n0 n0Var, er.p pVar) {
        return new n0(new a(n0Var.d(), pVar), n0Var.getUiReceiver(), n0Var.getHintReceiver(), null, 8, null);
    }
}
