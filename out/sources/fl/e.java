package fl;

import android.util.Base64;
import android.util.JsonWriter;
import dl.f;
import dl.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class e implements dl.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f64749a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f64750b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f64751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, dl.d<?>> f64752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, f<?>> f64753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dl.d<Object> f64754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f64755g;

    e(Writer writer, Map<Class<?>, dl.d<?>> map, Map<Class<?>, f<?>> map2, dl.d<Object> dVar, boolean z15) {
        this.f64751c = new JsonWriter(writer);
        this.f64752d = map;
        this.f64753e = map2;
        this.f64754f = dVar;
        this.f64755g = z15;
    }

    private boolean n(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e q(String str, Object obj) throws IOException {
        s();
        this.f64751c.name(str);
        if (obj != null) {
            return g(obj, false);
        }
        this.f64751c.nullValue();
        return this;
    }

    private e r(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        s();
        this.f64751c.name(str);
        return g(obj, false);
    }

    private void s() throws IOException {
        if (!this.f64750b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f64749a;
        if (eVar != null) {
            eVar.s();
            this.f64749a.f64750b = false;
            this.f64749a = null;
            this.f64751c.endObject();
        }
    }

    @Override // dl.e
    public dl.e a(dl.c cVar, int i15) {
        return i(cVar.b(), i15);
    }

    @Override // dl.e
    public dl.e b(dl.c cVar, long j15) {
        return j(cVar.b(), j15);
    }

    @Override // dl.e
    public dl.e d(dl.c cVar, Object obj) {
        return k(cVar.b(), obj);
    }

    public e e(int i15) throws IOException {
        s();
        this.f64751c.value(i15);
        return this;
    }

    public e f(long j15) throws IOException {
        s();
        this.f64751c.value(j15);
        return this;
    }

    e g(Object obj, boolean z15) throws IOException {
        if (z15 && n(obj)) {
            throw new dl.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f64751c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f64751c.value((Number) obj);
            return this;
        }
        int i15 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f64751c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next(), false);
                }
                this.f64751c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f64751c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        k((String) key, entry.getValue());
                    } catch (ClassCastException e15) {
                        throw new dl.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e15);
                    }
                }
                this.f64751c.endObject();
                return this;
            }
            dl.d<?> dVar = this.f64752d.get(obj.getClass());
            if (dVar != null) {
                return p(dVar, obj, z15);
            }
            f<?> fVar = this.f64753e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return p(this.f64754f, obj, z15);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m((byte[]) obj);
        }
        this.f64751c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i15 < length) {
                this.f64751c.value(iArr[i15]);
                i15++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i15 < length2) {
                f(jArr[i15]);
                i15++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i15 < length3) {
                this.f64751c.value(dArr[i15]);
                i15++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i15 < length4) {
                this.f64751c.value(zArr[i15]);
                i15++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                g(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                g(obj2, false);
            }
        }
        this.f64751c.endArray();
        return this;
    }

    @Override // dl.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e add(String str) throws IOException {
        s();
        this.f64751c.value(str);
        return this;
    }

    public e i(String str, int i15) throws IOException {
        s();
        this.f64751c.name(str);
        return e(i15);
    }

    public e j(String str, long j15) throws IOException {
        s();
        this.f64751c.name(str);
        return f(j15);
    }

    public e k(String str, Object obj) {
        return this.f64755g ? r(str, obj) : q(str, obj);
    }

    @Override // dl.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e c(boolean z15) throws IOException {
        s();
        this.f64751c.value(z15);
        return this;
    }

    public e m(byte[] bArr) throws IOException {
        s();
        if (bArr == null) {
            this.f64751c.nullValue();
            return this;
        }
        this.f64751c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void o() throws IOException {
        s();
        this.f64751c.flush();
    }

    e p(dl.d<Object> dVar, Object obj, boolean z15) throws IOException {
        if (!z15) {
            this.f64751c.beginObject();
        }
        dVar.a(obj, this);
        if (!z15) {
            this.f64751c.endObject();
        }
        return this;
    }
}
