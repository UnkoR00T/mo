package wg1;

import ah1.FavouriteServices;
import ay.j;
import fr.q0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Lwg1/d;", "Lbh1/d;", "Lcz/a;", "storage", "Lcz/c;", "persistentStorageFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/a;Lcz/c;Lay/j;)V", "Lah1/d;", "favouriteServices", "Loq/i0;", "b", "(Lah1/d;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lcz/a;", "Lay/j;", "Lcz/b;", "c", "Loq/k;", "f", "()Lcz/b;", "persistentStorage", "Lmu/g;", "d", "Lmu/g;", "()Lmu/g;", "e", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements bh1.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f213229f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cz.a storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k persistentStorage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<FavouriteServices> favouriteServices;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f213234d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213236f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213234d = obj;
            this.f213236f |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<FavouriteServices> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f213237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f213238b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f213239a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f213240b;

            /* JADX INFO: renamed from: wg1.d$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5633a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f213241d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f213242e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213243f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213245h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213246j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213247k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f213248l;

                public C5633a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f213241d = obj;
                    this.f213242e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d dVar) {
                this.f213239a = hVar;
                this.f213240b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5633a c5633a;
                if (eVar instanceof C5633a) {
                    c5633a = (C5633a) eVar;
                    int i15 = c5633a.f213242e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5633a.f213242e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5633a = new C5633a(eVar);
                    }
                } else {
                    c5633a = new C5633a(eVar);
                }
                Object obj2 = c5633a.f213241d;
                Object objE = uq.b.e();
                int i16 = c5633a.f213242e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f213239a;
                    String str = (String) obj;
                    FavouriteServices favouriteServices = str.length() > 0 ? (FavouriteServices) this.f213240b.jsonSerializer.a(str, q0.g(FavouriteServices.class)) : null;
                    c5633a.f213243f = vq.j.a(obj);
                    c5633a.f213245h = vq.j.a(c5633a);
                    c5633a.f213246j = vq.j.a(obj);
                    c5633a.f213247k = vq.j.a(hVar);
                    c5633a.f213248l = 0;
                    c5633a.f213242e = 1;
                    if (hVar.F(favouriteServices, c5633a) == objE) {
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

        public c(mu.g gVar, d dVar) {
            this.f213237a = gVar;
            this.f213238b = dVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super FavouriteServices> hVar, tq.e eVar) {
            Object objA = this.f213237a.a(new a(hVar, this.f213238b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public d(cz.a aVar, final cz.c cVar, j jVar) {
        this.storage = aVar;
        this.jsonSerializer = jVar;
        aVar.c("SERVICES_DATA_STORE_FILE_NAME");
        this.persistentStorage = l.a(new er.a() { // from class: wg1.c
            @Override // er.a
            public final Object a() {
                return d.g(cVar);
            }
        });
        this.favouriteServices = new c(aVar.e(cz.a.C0833a.a("FAVOURITE_SERVICES_KEY"), ""), this);
    }

    private final cz.b f() {
        return (cz.b) this.persistentStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b g(cz.c cVar) {
        return cVar.a("SERVICES_SHARED_PREFERENCES", cz.d.PLAIN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r7.a(r0) == r1) goto L26;
     */
    @Override // bh1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof wg1.d.b
            if (r0 == 0) goto L13
            r0 = r7
            wg1.d$b r0 = (wg1.d.b) r0
            int r1 = r0.f213236f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213236f = r1
            goto L18
        L13:
            wg1.d$b r0 = new wg1.d$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f213234d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f213236f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            oq.u.b(r7)
            goto L6c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            oq.u.b(r7)
            goto L5f
        L3b:
            oq.u.b(r7)
            goto L54
        L3f:
            oq.u.b(r7)
            ah1.d r7 = new ah1.d
            java.util.List r2 = pq.v.n()
            r7.<init>(r2)
            r0.f213236f = r5
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 != r1) goto L54
            goto L6b
        L54:
            cz.a r7 = r6.storage
            r0.f213236f = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5f
            goto L6b
        L5f:
            cz.b r7 = r6.f()
            r0.f213236f = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.d.a(tq.e):java.lang.Object");
    }

    @Override // bh1.d
    public Object b(FavouriteServices favouriteServices, tq.e<? super i0> eVar) {
        Object objD = this.storage.d(cz.a.C0833a.a("FAVOURITE_SERVICES_KEY"), this.jsonSerializer.b(favouriteServices, q0.n(FavouriteServices.class)), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // bh1.d
    public mu.g<FavouriteServices> c() {
        return this.favouriteServices;
    }
}
