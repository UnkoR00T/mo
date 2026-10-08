package l14;

import er.l;
import oq.i0;
import oq.k;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ll14/b;", "Ln14/a;", "Lcz/c;", "storageFactory", "Ld00/a;", "inMemoryCache", "<init>", "(Lcz/c;Ld00/a;)V", "", "version", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "c", "Ld00/a;", "Lcz/b;", "Loq/k;", "g", "()Lcz/b;", "storage", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements n14.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f114248d = cz.b.a.b("SHARED_PREFERENCES_APP_VERSION_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    /* JADX INFO: renamed from: l14.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2783b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f114251d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f114253f;

        C2783b(e<? super C2783b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f114251d = obj;
            this.f114253f |= PKIFailureInfo.systemUnavail;
            return b.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.k implements l<e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f114254e;

        c(e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f114254e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            cz.b bVarG = b.this.g();
            String str = b.f114248d;
            this.f114254e = 1;
            Object objJ = bVarG.j(str, this);
            return objJ == objE ? objE : objJ;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super String> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f114256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f114257e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f114259g;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f114257e = obj;
            this.f114259g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    public b(final cz.c cVar, d00.a aVar) {
        this.inMemoryCache = aVar;
        this.storage = oq.l.a(new er.a() { // from class: l14.a
            @Override // er.a
            public final Object a() {
                return b.h(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cz.b g() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b h(cz.c cVar) {
        return cVar.a("shared_prefs_common_app_version", cz.d.PLAIN);
    }

    @Override // n14.a
    public Object a(e<? super String> eVar) {
        return d00.a.p(this.inMemoryCache, 334433, 0L, new c(null), eVar, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (a(r0) == r1) goto L21;
     */
    @Override // n14.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l14.b.d
            if (r0 == 0) goto L13
            r0 = r8
            l14.b$d r0 = (l14.b.d) r0
            int r1 = r0.f114259g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114259g = r1
            goto L18
        L13:
            l14.b$d r0 = new l14.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f114257e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f114259g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f114256d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L6f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f114256d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L60
        L40:
            oq.u.b(r8)
            d00.a r8 = r6.inMemoryCache
            r2 = 334433(0x51a61, float:4.6864E-40)
            r8.n(r2)
            cz.b r8 = r6.g()
            java.lang.String r2 = l14.b.f114248d
            java.lang.Object r5 = vq.j.a(r7)
            r0.f114256d = r5
            r0.f114259g = r4
            java.lang.Object r8 = r8.e(r2, r7, r0)
            if (r8 != r1) goto L60
            goto L6e
        L60:
            java.lang.Object r7 = vq.j.a(r7)
            r0.f114256d = r7
            r0.f114259g = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l14.b.b(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n14.a
    public Object c(e<? super i0> eVar) throws Throwable {
        C2783b c2783b;
        if (eVar instanceof C2783b) {
            c2783b = (C2783b) eVar;
            int i15 = c2783b.f114253f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2783b.f114253f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2783b = new C2783b(eVar);
            }
        } else {
            c2783b = new C2783b(eVar);
        }
        Object obj = c2783b.f114251d;
        Object objE = uq.b.e();
        int i16 = c2783b.f114253f;
        if (i16 == 0) {
            u.b(obj);
            cz.b bVarG = g();
            c2783b.f114253f = 1;
            if (bVarG.a(c2783b) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        this.inMemoryCache.n(334433);
        return i0.f148189a;
    }
}
