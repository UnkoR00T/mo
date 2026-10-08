package t10;

import er.p;
import er.q;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lt10/d;", "Lcz/a;", "Lt10/c;", "dataStorePreferencesFactory", "<init>", "(Lt10/c;)V", "", "identifier", "Loq/i0;", "c", "(Ljava/lang/String;)V", "Lcz/a$a;", "key", "default", "Lmu/g;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lmu/g;", "value", "d", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lt10/c;", "Lu6/i;", "Ly6/h;", "b", "Lu6/i;", "dataStore", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements cz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t10.c dataStorePreferencesFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private u6.i<y6.h> dataStore;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/d;", "preferences", "Loq/i0;", "<anonymous>", "(Ly6/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<y6.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f186873f;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y6.d dVar = (y6.d) this.f186873f;
            uq.b.e();
            if (this.f186872e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            dVar.g();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(y6.d dVar, tq.e<? super i0> eVar) {
            return ((a) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(eVar);
            aVar.f186873f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/h;", "Ly6/h;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<mu.h<? super y6.h>, Throwable, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186874e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186874e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            y6.i.a();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super y6.h> hVar, Throwable th4, tq.e<? super i0> eVar) {
            return new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f186875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f186876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f186877c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f186878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f186879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f186880c;

            /* JADX INFO: renamed from: t10.d$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4853a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f186881d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f186882e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f186883f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f186885h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f186886j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f186887k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f186888l;

                public C4853a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f186881d = obj;
                    this.f186882e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, String str, String str2) {
                this.f186878a = hVar;
                this.f186879b = str;
                this.f186880c = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4853a c4853a;
                if (eVar instanceof C4853a) {
                    c4853a = (C4853a) eVar;
                    int i15 = c4853a.f186882e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4853a.f186882e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4853a = new C4853a(eVar);
                    }
                } else {
                    c4853a = new C4853a(eVar);
                }
                Object obj2 = c4853a.f186881d;
                Object objE = uq.b.e();
                int i16 = c4853a.f186882e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f186878a;
                    String str = (String) ((y6.h) obj).b(y6.k.g(this.f186879b));
                    if (str == null) {
                        str = this.f186880c;
                    }
                    c4853a.f186883f = vq.j.a(obj);
                    c4853a.f186885h = vq.j.a(c4853a);
                    c4853a.f186886j = vq.j.a(obj);
                    c4853a.f186887k = vq.j.a(hVar);
                    c4853a.f186888l = 0;
                    c4853a.f186882e = 1;
                    if (hVar.F(str, c4853a) == objE) {
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

        public c(mu.g gVar, String str, String str2) {
            this.f186875a = gVar;
            this.f186876b = str;
            this.f186877c = str2;
        }

        @Override // mu.g
        public Object a(mu.h<? super String> hVar, tq.e eVar) {
            Object objA = this.f186875a.a(new a(hVar, this.f186876b, this.f186877c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: t10.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/d;", "preferences", "Loq/i0;", "<anonymous>", "(Ly6/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class C4854d extends vq.k implements p<y6.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f186890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f186892h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4854d(String str, String str2, tq.e<? super C4854d> eVar) {
            super(2, eVar);
            this.f186891g = str;
            this.f186892h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y6.d dVar = (y6.d) this.f186890f;
            uq.b.e();
            if (this.f186889e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            dVar.k(y6.k.g(this.f186891g), this.f186892h);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(y6.d dVar, tq.e<? super i0> eVar) {
            return ((C4854d) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C4854d c4854d = new C4854d(this.f186891g, this.f186892h, eVar);
            c4854d.f186890f = obj;
            return c4854d;
        }
    }

    public d(t10.c cVar) {
        this.dataStorePreferencesFactory = cVar;
    }

    @Override // cz.a
    public Object a(tq.e<? super i0> eVar) {
        u6.i<y6.h> iVar = this.dataStore;
        if (iVar == null) {
            iVar = null;
        }
        Object objA = y6.l.a(iVar, new a(null), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // cz.a
    public void c(String identifier) {
        this.dataStore = this.dataStorePreferencesFactory.c(identifier);
    }

    @Override // cz.a
    public Object d(String str, String str2, tq.e<? super i0> eVar) {
        u6.i<y6.h> iVar = this.dataStore;
        if (iVar == null) {
            iVar = null;
        }
        Object objA = y6.l.a(iVar, new C4854d(str, str2, null), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // cz.a
    public mu.g<String> e(String key, String str) {
        u6.i<y6.h> iVar = this.dataStore;
        if (iVar == null) {
            iVar = null;
        }
        return new c(mu.i.f(iVar.getData(), new b(null)), key, str);
    }
}
