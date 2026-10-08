package ja;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ad\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aK\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u0017\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aw\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u0019\"\b\b\u0000\u0010\u0002*\u00028\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "R", "T", "Lja/m1;", "Lkotlin/Function3;", "Ltq/e;", "generator", "d", "(Lja/m1;Ler/q;Ltq/e;)Ljava/lang/Object;", "separator", "", "originalPageOffsets", "", "hintOriginalPageOffset", "hintOriginalIndex", "e", "(Ljava/lang/Object;[III)Lja/m1;", "", "Loq/i0;", "b", "(Ljava/util/List;Ljava/lang/Object;[III)V", "adjacentPageBefore", "adjacentPageAfter", "a", "(Ljava/util/List;Ljava/lang/Object;Lja/m1;Lja/m1;II)V", "Lmu/g;", "Lja/f0;", "Lja/l1;", "terminalSeparatorType", "c", "(Lmu/g;Lja/l1;Ler/q;)Lmu/g;", "paging-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<R> implements mu.g<f0<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f100714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f100715b;

        /* JADX INFO: renamed from: ja.f1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2373a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f100716a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f100717b;

            /* JADX INFO: renamed from: ja.f1$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2374a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f100718d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100719e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f100720f;

                public C2374a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100718d = obj;
                    this.f100719e |= PKIFailureInfo.systemUnavail;
                    return C2373a.this.F(null, this);
                }
            }

            public C2373a(mu.h hVar, e1 e1Var) {
                this.f100716a = hVar;
                this.f100717b = e1Var;
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
                    boolean r0 = r8 instanceof ja.f1.a.C2373a.C2374a
                    if (r0 == 0) goto L13
                    r0 = r8
                    ja.f1$a$a$a r0 = (ja.f1.a.C2373a.C2374a) r0
                    int r1 = r0.f100719e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f100719e = r1
                    goto L18
                L13:
                    ja.f1$a$a$a r0 = new ja.f1$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f100718d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f100719e
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
                    java.lang.Object r7 = r0.f100720f
                    mu.h r7 = (mu.h) r7
                    oq.u.b(r8)
                    goto L53
                L3c:
                    oq.u.b(r8)
                    mu.h r8 = r6.f100716a
                    ja.f0 r7 = (ja.f0) r7
                    ja.e1 r2 = r6.f100717b
                    r0.f100720f = r8
                    r0.f100719e = r4
                    java.lang.Object r7 = r2.e(r7, r0)
                    if (r7 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f100720f = r2
                    r0.f100719e = r3
                    java.lang.Object r7 = r7.F(r8, r0)
                    if (r7 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ja.f1.a.C2373a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public a(mu.g gVar, e1 e1Var) {
            this.f100714a = gVar;
            this.f100715b = e1Var;
        }

        @Override // mu.g
        public Object a(mu.h hVar, tq.e eVar) {
            Object objA = this.f100714a.a(new C2373a(hVar, this.f100715b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\n"}, d2 = {"<anonymous>", "R", "", "T", "before", "after"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<R, T> extends vq.k implements er.q<T, T, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<T, T, tq.e<? super R>, Object> f100725h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.q<? super T, ? super T, ? super tq.e<? super R>, ? extends Object> qVar, tq.e<? super b> eVar) {
            super(3, eVar);
            this.f100725h = qVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to ja.f1$b<R, T> for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f100722e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r6)
                return r6
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                java.lang.Object r6 = r5.f100723f
                java.lang.Object r1 = r5.f100724g
                er.q<T, T, tq.e<? super R>, java.lang.Object> r3 = r5.f100725h
                r4 = 0
                r5.f100723f = r4
                r5.f100722e = r2
                java.lang.Object r6 = r3.w(r6, r1, r5)
                if (r6 != r0) goto L2c
                return r0
            L2c:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.f1.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(T t15, T t16, tq.e<? super R> eVar) {
            b bVar = new b(this.f100725h, eVar);
            bVar.f100723f = t15;
            bVar.f100724g = t16;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<R, T extends R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f100730h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f100731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f100732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f100733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f100734m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100733l = obj;
            this.f100734m |= PKIFailureInfo.systemUnavail;
            return f1.d(null, null, this);
        }
    }

    public static final <R, T extends R> void a(List<TransformablePage<R>> list, R r15, TransformablePage<T> transformablePage, TransformablePage<T> transformablePage2, int i15, int i16) {
        int[] originalPageOffsets = transformablePage != null ? transformablePage.getOriginalPageOffsets() : null;
        int[] originalPageOffsets2 = transformablePage2 != null ? transformablePage2.getOriginalPageOffsets() : null;
        if (originalPageOffsets != null && originalPageOffsets2 != null) {
            originalPageOffsets = pq.v.e1(pq.v.T0(pq.n.h0(pq.n.K(originalPageOffsets, originalPageOffsets2))));
        } else if (originalPageOffsets == null && originalPageOffsets2 != null) {
            originalPageOffsets = originalPageOffsets2;
        } else if (originalPageOffsets == null || originalPageOffsets2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        b(list, r15, originalPageOffsets, i15, i16);
    }

    public static final <T> void b(List<TransformablePage<T>> list, T t15, int[] iArr, int i15, int i16) {
        if (t15 == null) {
            return;
        }
        list.add(e(t15, iArr, i15, i16));
    }

    public static final <T extends R, R> mu.g<f0<R>> c(mu.g<? extends f0<T>> gVar, l1 l1Var, er.q<? super T, ? super T, ? super tq.e<? super R>, ? extends Object> qVar) {
        return new a(gVar, new e1(l1Var, new b(qVar, null)));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cc -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <R, T extends R> java.lang.Object d(ja.TransformablePage<T> r10, er.q<? super T, ? super T, ? super tq.e<? super R>, ? extends java.lang.Object> r11, tq.e<? super ja.TransformablePage<R>> r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.f1.d(ja.m1, er.q, tq.e):java.lang.Object");
    }

    public static final <T> TransformablePage<T> e(T t15, int[] iArr, int i15, int i16) {
        return new TransformablePage<>(iArr, pq.v.e(t15), i15, pq.v.e(Integer.valueOf(i16)));
    }
}
