package y2;

import p071kotlin.Metadata;
import p076m2.f0;
import p076m2.o6;
import p076m2.v3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u000e\u0017B3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Ly2/q;", "Lv2/d;", "Lm2/z;", "", "Lm2/o6;", "Lm2/v3;", "Lv2/t;", "node", "", "size", "<init>", "(Lv2/t;I)V", "T", "key", "a", "(Lm2/z;)Ljava/lang/Object;", "value", "n1", "(Lm2/z;Lm2/o6;)Lm2/v3;", "Ly2/q$a;", "u", "()Ly2/q$a;", "g", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends v2.d<p076m2.z<Object>, o6<Object>> implements v3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f223405h = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final q f223406j = new q(v2.t.INSTANCE.a(), 0);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Ly2/q$a;", "Lv2/f;", "Lm2/z;", "", "Lm2/o6;", "Lm2/v3$a;", "Ly2/q;", "map", "<init>", "(Ly2/q;)V", "n", "()Ly2/q;", "g", "Ly2/q;", "getMap$runtime", "setMap$runtime", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends v2.f<p076m2.z<Object>, o6<Object>> implements v3.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private q map;

        public a(q qVar) {
            super(qVar);
            this.map = qVar;
        }

        @Override // v2.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof p076m2.z) {
                return o((p076m2.z) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof o6) {
                return p((o6) obj);
            }
            return false;
        }

        @Override // v2.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof p076m2.z) {
                return q((p076m2.z) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof p076m2.z) ? obj2 : r((p076m2.z) obj, (o6) obj2);
        }

        @Override // v2.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public q build() {
            q qVar;
            if (g() == this.map.p()) {
                qVar = this.map;
            } else {
                l(new x2.e());
                qVar = new q(g(), size());
            }
            this.map = qVar;
            return qVar;
        }

        public /* bridge */ boolean o(p076m2.z<Object> zVar) {
            return super.containsKey(zVar);
        }

        public /* bridge */ boolean p(o6<Object> o6Var) {
            return super.containsValue(o6Var);
        }

        public /* bridge */ o6<Object> q(p076m2.z<Object> zVar) {
            return (o6) super.get(zVar);
        }

        public /* bridge */ o6<Object> r(p076m2.z<Object> zVar, o6<Object> o6Var) {
            return (o6) super.getOrDefault(zVar, o6Var);
        }

        @Override // v2.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof p076m2.z) {
                return s((p076m2.z) obj);
            }
            return null;
        }

        public /* bridge */ o6<Object> s(p076m2.z<Object> zVar) {
            return (o6) super.remove(zVar);
        }
    }

    /* JADX INFO: renamed from: y2.q$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ly2/q$b;", "", "<init>", "()V", "Ly2/q;", "Empty", "Ly2/q;", "a", "()Ly2/q;", "getEmpty$annotations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final q a() {
            return q.f223406j;
        }

        private Companion() {
        }
    }

    public q(v2.t<p076m2.z<Object>, o6<Object>> tVar, int i15) {
        super(tVar, i15);
    }

    @Override // p076m2.e0
    public <T> T a(p076m2.z<T> key) {
        return (T) f0.b(this, key);
    }

    @Override // v2.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof p076m2.z) {
            return v((p076m2.z) obj);
        }
        return false;
    }

    @Override // pq.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof o6) {
            return w((o6) obj);
        }
        return false;
    }

    @Override // v2.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof p076m2.z) {
            return x((p076m2.z) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p076m2.z) ? obj2 : y((p076m2.z) obj, (o6) obj2);
    }

    @Override // p076m2.v3
    public v3 n1(p076m2.z<Object> key, o6<Object> value) {
        v2.t.b<p076m2.z<Object>, o6<Object>> bVarP = p().P(key.hashCode(), key, value, 0);
        return bVarP == null ? this : new q(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    @Override // v2.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    public /* bridge */ boolean v(p076m2.z<Object> zVar) {
        return super.containsKey(zVar);
    }

    public /* bridge */ boolean w(o6<Object> o6Var) {
        return super.containsValue(o6Var);
    }

    public /* bridge */ o6<Object> x(p076m2.z<Object> zVar) {
        return (o6) super.get(zVar);
    }

    public /* bridge */ o6<Object> y(p076m2.z<Object> zVar, o6<Object> o6Var) {
        return (o6) super.getOrDefault(zVar, o6Var);
    }
}
