package u4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r0.g1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006%"}, d2 = {"Lu4/h;", "", "<init>", "()V", "Lu4/k;", "font", "Lu4/k0;", "platformFontLoader", "result", "", "forever", "Loq/i0;", "e", "(Lu4/k;Lu4/k0;Ljava/lang/Object;Z)V", "Lu4/h$a;", "d", "(Lu4/k;Lu4/k0;)Lu4/h$a;", "Lkotlin/Function1;", "Ltq/e;", "block", "g", "(Lu4/k;Lu4/k0;ZLer/l;Ltq/e;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "Lr0/c0;", "Lu4/h$b;", "b", "Lr0/c0;", "resultCache", "Lr0/t0;", "c", "Lr0/t0;", "permanentCache", "Ly4/t;", "Ly4/t;", "cacheLock", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object PermanentFailure = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0.c0<Key, a> resultCache = new r0.c0<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r0.t0<Key, a> permanentCache = g1.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y4.t cacheLock = new y4.t();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0015"}, d2 = {"Lu4/h$a;", "", "result", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "e", "isPermanentFailure", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object result;

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && fr.t.c(obj, ((a) obj2).getResult());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object other) {
            return c(this.result, other);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final /* synthetic */ Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return d(this.result);
        }

        public String toString() {
            return f(this.result);
        }
    }

    /* JADX INFO: renamed from: u4.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lu4/h$b;", "", "Lu4/k;", "font", "loaderKey", "<init>", "(Lu4/k;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu4/k;", "getFont", "()Lu4/k;", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k font;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object loaderKey;

        public Key(k kVar, Object obj) {
            this.font = kVar;
            this.loaderKey = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return fr.t.c(this.font, key.font) && fr.t.c(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f195249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f195251f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195253h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195251f = obj;
            this.f195253h |= PKIFailureInfo.systemUnavail;
            return h.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(h hVar, k kVar, k0 k0Var, Object obj, boolean z15, int i15, Object obj2) {
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        hVar.e(kVar, k0Var, obj, z15);
    }

    public final a d(k font, k0 platformFontLoader) {
        a aVarD;
        Key key = new Key(font, platformFontLoader.b());
        synchronized (this.cacheLock) {
            aVarD = this.resultCache.d(key);
            if (aVarD == null) {
                aVarD = this.permanentCache.e(key);
            }
        }
        return aVarD;
    }

    public final void e(k font, k0 platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.b());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.x(key, a.a(this.PermanentFailure));
                    oq.i0 i0Var = oq.i0.f148189a;
                } else if (forever) {
                    this.permanentCache.x(key, a.a(a.b(result)));
                    oq.i0 i0Var2 = oq.i0.f148189a;
                } else {
                    this.resultCache.e(key, a.a(a.b(result)));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(k kVar, k0 k0Var, boolean z15, er.l<? super tq.e<Object>, ? extends Object> lVar, tq.e<Object> eVar) throws Throwable {
        c cVar;
        Key key;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f195253h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f195253h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f195251f;
        Object objE = uq.b.e();
        int i16 = cVar.f195253h;
        if (i16 == 0) {
            oq.u.b(obj);
            Key key2 = new Key(kVar, k0Var.b());
            synchronized (this.cacheLock) {
                try {
                    a aVarD = this.resultCache.d(key2);
                    if (aVarD == null) {
                        aVarD = this.permanentCache.e(key2);
                    }
                    if (aVarD != null) {
                        return aVarD.getResult();
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                    cVar.f195250e = key2;
                    cVar.f195249d = z15;
                    cVar.f195253h = 1;
                    Object objB = lVar.b(cVar);
                    if (objB == objE) {
                        return objE;
                    }
                    obj = objB;
                    key = key2;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = cVar.f195249d;
            key = (Key) cVar.f195250e;
            oq.u.b(obj);
        }
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.x(key, a.a(this.PermanentFailure));
                } else if (z15) {
                    this.permanentCache.x(key, a.a(a.b(obj)));
                } else {
                    this.resultCache.e(key, a.a(a.b(obj)));
                }
                oq.i0 i0Var2 = oq.i0.f148189a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return obj;
    }
}
