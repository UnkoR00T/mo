package nk;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import sk.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<KeyProtoT extends r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<KeyProtoT> f137041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, m<?, KeyProtoT>> f137042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f137043c;

    public static abstract class a<KeyFormatProtoT extends r0, KeyProtoT extends r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<KeyFormatProtoT> f137044a;

        /* JADX INFO: renamed from: nk.d$a$a, reason: collision with other inner class name */
        public static final class C3379a<KeyFormatProtoT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public KeyFormatProtoT f137045a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public fk.l.b f137046b;

            public C3379a(KeyFormatProtoT keyformatprotot, fk.l.b bVar) {
                this.f137045a = keyformatprotot;
                this.f137046b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f137044a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f137044a;
        }

        public Map<String, C3379a<KeyFormatProtoT>> c() {
            return Collections.EMPTY_MAP;
        }

        public abstract KeyFormatProtoT d(com.google.crypto.tink.shaded.protobuf.h hVar);

        public abstract void e(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    protected d(Class<KeyProtoT> cls, m<?, KeyProtoT>... mVarArr) {
        this.f137041a = cls;
        HashMap map = new HashMap();
        for (m<?, KeyProtoT> mVar : mVarArr) {
            if (map.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            map.put(mVar.b(), mVar);
        }
        if (mVarArr.length > 0) {
            this.f137043c = mVarArr[0].b();
        } else {
            this.f137043c = Void.class;
        }
        this.f137042b = Collections.unmodifiableMap(map);
    }

    public kk.b.EnumC2684b a() {
        return kk.b.EnumC2684b.f111285a;
    }

    public final Class<?> b() {
        return this.f137043c;
    }

    public final Class<KeyProtoT> c() {
        return this.f137041a;
    }

    public abstract String d();

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        m<?, KeyProtoT> mVar = this.f137042b.get(cls);
        if (mVar != null) {
            return (P) mVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> f();

    public abstract y.c g();

    public abstract KeyProtoT h(com.google.crypto.tink.shaded.protobuf.h hVar);

    public final Set<Class<?>> i() {
        return this.f137042b.keySet();
    }

    public abstract void j(KeyProtoT keyprotot);
}
