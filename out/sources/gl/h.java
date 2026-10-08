package gl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, dl.d<?>> f73536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, dl.f<?>> f73537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d<Object> f73538c;

    public static final class a implements el.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final dl.d<Object> f73539d = new dl.d() { // from class: gl.g
            @Override // dl.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (dl.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, dl.d<?>> f73540a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, dl.f<?>> f73541b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private dl.d<Object> f73542c = f73539d;

        public static /* synthetic */ void b(Object obj, dl.e eVar) {
            throw new dl.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f73540a), new HashMap(this.f73541b), this.f73542c);
        }

        public a d(el.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // el.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, dl.d<? super U> dVar) {
            this.f73540a.put(cls, dVar);
            this.f73541b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, dl.d<?>> map, Map<Class<?>, dl.f<?>> map2, dl.d<Object> dVar) {
        this.f73536a = map;
        this.f73537b = map2;
        this.f73538c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f73536a, this.f73537b, this.f73538c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
