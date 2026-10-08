package wg1;

import ah1.DocumentsSequenceOrder;
import ay.j;
import fr.q0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lwg1/b;", "Lbh1/b;", "Lay/j;", "jsonSerializer", "Lcz/a;", "storage", "<init>", "(Lay/j;Lcz/a;)V", "", "documentTypeName", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lah1/c;", "documentsSequenceOrder", "c", "(Lah1/c;Ltq/e;)Ljava/lang/Object;", "Lah1/b;", "documentLsLayoutType", "f", "(Lah1/b;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "a", "Lay/j;", "Lcz/a;", "Lmu/g;", "Lmu/g;", "()Lmu/g;", "e", "documentsLayoutType", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements bh1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f213188f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ah1.b f213189g = ah1.b.BigCards;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cz.a storage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mu.g<DocumentsSequenceOrder> documentsSequenceOrder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<ah1.b> documentsLayoutType;

    /* JADX INFO: renamed from: wg1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5630b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f213194d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213196f;

        C5630b(tq.e<? super C5630b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213194d = obj;
            this.f213196f |= PKIFailureInfo.systemUnavail;
            return b.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f213200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f213201h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f213202j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213204l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213202j = obj;
            this.f213204l |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<DocumentsSequenceOrder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f213205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f213206b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f213207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f213208b;

            /* JADX INFO: renamed from: wg1.b$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5631a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f213209d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f213210e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213211f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213213h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213214j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213215k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f213216l;

                public C5631a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f213209d = obj;
                    this.f213210e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b bVar) {
                this.f213207a = hVar;
                this.f213208b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5631a c5631a;
                if (eVar instanceof C5631a) {
                    c5631a = (C5631a) eVar;
                    int i15 = c5631a.f213210e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5631a.f213210e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5631a = new C5631a(eVar);
                    }
                } else {
                    c5631a = new C5631a(eVar);
                }
                Object obj2 = c5631a.f213209d;
                Object objE = uq.b.e();
                int i16 = c5631a.f213210e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f213207a;
                    String str = (String) obj;
                    DocumentsSequenceOrder documentsSequenceOrder = str.length() > 0 ? (DocumentsSequenceOrder) this.f213208b.jsonSerializer.a(str, q0.g(DocumentsSequenceOrder.class)) : null;
                    c5631a.f213211f = vq.j.a(obj);
                    c5631a.f213213h = vq.j.a(c5631a);
                    c5631a.f213214j = vq.j.a(obj);
                    c5631a.f213215k = vq.j.a(hVar);
                    c5631a.f213216l = 0;
                    c5631a.f213210e = 1;
                    if (hVar.F(documentsSequenceOrder, c5631a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, b bVar) {
            this.f213205a = gVar;
            this.f213206b = bVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super DocumentsSequenceOrder> hVar, tq.e eVar) {
            Object objA = this.f213205a.a(new a(hVar, this.f213206b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<ah1.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f213217a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f213218a;

            /* JADX INFO: renamed from: wg1.b$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5632a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f213219d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f213220e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213221f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213223h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213224j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213225k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f213226l;

                public C5632a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f213219d = obj;
                    this.f213220e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f213218a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5632a c5632a;
                if (eVar instanceof C5632a) {
                    c5632a = (C5632a) eVar;
                    int i15 = c5632a.f213220e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5632a.f213220e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5632a = new C5632a(eVar);
                    }
                } else {
                    c5632a = new C5632a(eVar);
                }
                Object obj2 = c5632a.f213219d;
                Object objE = uq.b.e();
                int i16 = c5632a.f213220e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f213218a;
                    ah1.b bVarValueOf = ah1.b.valueOf((String) obj);
                    c5632a.f213221f = vq.j.a(obj);
                    c5632a.f213223h = vq.j.a(c5632a);
                    c5632a.f213224j = vq.j.a(obj);
                    c5632a.f213225k = vq.j.a(hVar);
                    c5632a.f213226l = 0;
                    c5632a.f213220e = 1;
                    if (hVar.F(bVarValueOf, c5632a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public e(mu.g gVar) {
            this.f213217a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ah1.b> hVar, tq.e eVar) {
            Object objA = this.f213217a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public b(j jVar, cz.a aVar) {
        this.jsonSerializer = jVar;
        this.storage = aVar;
        aVar.c("DOCUMENTS_DATA_STORE_FILE_NAME");
        this.documentsSequenceOrder = new d(aVar.e(cz.a.C0833a.a("DATA_STORE_DOCS_ORDER_KEY"), ""), this);
        this.documentsLayoutType = new e(aVar.e(cz.a.C0833a.a("DATA_STORE_DOCS_LAYOUT_TYPE_KEY"), f213189g.name()));
    }

    @Override // bh1.b
    public mu.g<DocumentsSequenceOrder> a() {
        return this.documentsSequenceOrder;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (c(r4, r0) == r1) goto L23;
     */
    @Override // bh1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wg1.b.c
            if (r0 == 0) goto L13
            r0 = r7
            wg1.b$c r0 = (wg1.b.c) r0
            int r1 = r0.f213204l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213204l = r1
            goto L18
        L13:
            wg1.b$c r0 = new wg1.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f213202j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f213204l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f213199f
            ah1.c r6 = (ah1.DocumentsSequenceOrder) r6
            java.lang.Object r6 = r0.f213198e
            ah1.c r6 = (ah1.DocumentsSequenceOrder) r6
            java.lang.Object r6 = r0.f213197d
            java.lang.String r6 = (java.lang.String) r6
            oq.u.b(r7)
            goto L90
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f213197d
            java.lang.String r6 = (java.lang.String) r6
            oq.u.b(r7)
            goto L5a
        L48:
            oq.u.b(r7)
            mu.g r7 = r5.a()
            r0.f213197d = r6
            r0.f213204l = r4
            java.lang.Object r7 = mu.i.z(r7, r0)
            if (r7 != r1) goto L5a
            goto L8f
        L5a:
            ah1.c r7 = (ah1.DocumentsSequenceOrder) r7
            if (r7 == 0) goto L90
            java.util.List r2 = r7.a()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = pq.v.i1(r2)
            r2.remove(r6)
            ah1.c r4 = new ah1.c
            r4.<init>(r2)
            java.lang.Object r6 = vq.j.a(r6)
            r0.f213197d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f213198e = r6
            java.lang.Object r6 = vq.j.a(r4)
            r0.f213199f = r6
            r6 = 0
            r0.f213200g = r6
            r0.f213201h = r6
            r0.f213204l = r3
            java.lang.Object r6 = r5.c(r4, r0)
            if (r6 != r1) goto L90
        L8f:
            return r1
        L90:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.b.b(java.lang.String, tq.e):java.lang.Object");
    }

    @Override // bh1.b
    public Object c(DocumentsSequenceOrder documentsSequenceOrder, tq.e<? super i0> eVar) {
        Object objD = this.storage.d(cz.a.C0833a.a("DATA_STORE_DOCS_ORDER_KEY"), this.jsonSerializer.b(documentsSequenceOrder, q0.n(DocumentsSequenceOrder.class)), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    @Override // bh1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wg1.b.C5630b
            if (r0 == 0) goto L13
            r0 = r6
            wg1.b$b r0 = (wg1.b.C5630b) r0
            int r1 = r0.f213196f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213196f = r1
            goto L18
        L13:
            wg1.b$b r0 = new wg1.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f213194d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f213196f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            oq.u.b(r6)
            goto L46
        L38:
            oq.u.b(r6)
            ah1.b r6 = wg1.b.f213189g
            r0.f213196f = r4
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            cz.a r6 = r5.storage
            r0.f213196f = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.b.d(tq.e):java.lang.Object");
    }

    @Override // bh1.b
    public mu.g<ah1.b> e() {
        return this.documentsLayoutType;
    }

    @Override // bh1.b
    public Object f(ah1.b bVar, tq.e<? super i0> eVar) {
        Object objD = this.storage.d(cz.a.C0833a.a("DATA_STORE_DOCS_LAYOUT_TYPE_KEY"), bVar.name(), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
