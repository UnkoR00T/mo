package gl;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
final class f implements dl.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f73526f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f73527g = dl.c.a("key").b(gl.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final dl.c f73528h = dl.c.a("value").b(gl.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final dl.d<Map.Entry<Object, Object>> f73529i = new dl.d() { // from class: gl.e
        @Override // dl.d
        public final void a(Object obj, Object obj2) {
            f.c((Map.Entry) obj, (dl.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f73530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, dl.d<?>> f73531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, dl.f<?>> f73532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dl.d<Object> f73533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f73534e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73535a;

        static {
            int[] iArr = new int[d.a.values().length];
            f73535a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73535a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73535a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, dl.d<?>> map, Map<Class<?>, dl.f<?>> map2, dl.d<Object> dVar) {
        this.f73530a = outputStream;
        this.f73531b = map;
        this.f73532c = map2;
        this.f73533d = dVar;
    }

    public static /* synthetic */ void c(Map.Entry entry, dl.e eVar) {
        eVar.d(f73527g, entry.getKey());
        eVar.d(f73528h, entry.getValue());
    }

    private static ByteBuffer m(int i15) {
        return ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long n(dl.d<T> dVar, T t15) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f73530a;
            this.f73530a = bVar;
            try {
                dVar.a(t15, this);
                this.f73530a = outputStream;
                long jB = bVar.b();
                bVar.close();
                return jB;
            } catch (Throwable th4) {
                this.f73530a = outputStream;
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                bVar.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    private <T> f o(dl.d<T> dVar, dl.c cVar, T t15, boolean z15) throws IOException {
        long jN = n(dVar, t15);
        if (z15 && jN == 0) {
            return this;
        }
        t((s(cVar) << 3) | 2);
        u(jN);
        dVar.a(t15, this);
        return this;
    }

    private <T> f p(dl.f<T> fVar, dl.c cVar, T t15, boolean z15) {
        this.f73534e.b(cVar, z15);
        fVar.a(t15, this.f73534e);
        return this;
    }

    private static d r(dl.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private static int s(dl.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private void t(int i15) throws IOException {
        while ((i15 & (-128)) != 0) {
            this.f73530a.write((i15 & CertificateBody.profileType) | 128);
            i15 >>>= 7;
        }
        this.f73530a.write(i15 & CertificateBody.profileType);
    }

    private void u(long j15) throws IOException {
        while (((-128) & j15) != 0) {
            this.f73530a.write((((int) j15) & CertificateBody.profileType) | 128);
            j15 >>>= 7;
        }
        this.f73530a.write(((int) j15) & CertificateBody.profileType);
    }

    @Override // dl.e
    public dl.e d(dl.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    dl.e e(dl.c cVar, double d15, boolean z15) throws IOException {
        if (z15 && d15 == 0.0d) {
            return this;
        }
        t((s(cVar) << 3) | 1);
        this.f73530a.write(m(8).putDouble(d15).array());
        return this;
    }

    dl.e f(dl.c cVar, float f15, boolean z15) throws IOException {
        if (z15 && f15 == 0.0f) {
            return this;
        }
        t((s(cVar) << 3) | 5);
        this.f73530a.write(m(4).putFloat(f15).array());
        return this;
    }

    dl.e g(dl.c cVar, Object obj, boolean z15) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z15 || charSequence.length() != 0) {
                    t((s(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f73526f);
                    t(bytes.length);
                    this.f73530a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it4 = ((Map) obj).entrySet().iterator();
                while (it4.hasNext()) {
                    o(f73529i, cVar, (Map.Entry) it4.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return e(cVar, ((Double) obj).doubleValue(), z15);
                }
                if (obj instanceof Float) {
                    return f(cVar, ((Float) obj).floatValue(), z15);
                }
                if (obj instanceof Number) {
                    return k(cVar, ((Number) obj).longValue(), z15);
                }
                if (obj instanceof Boolean) {
                    return l(cVar, ((Boolean) obj).booleanValue(), z15);
                }
                if (!(obj instanceof byte[])) {
                    dl.d<?> dVar = this.f73531b.get(obj.getClass());
                    if (dVar != null) {
                        return o(dVar, cVar, obj, z15);
                    }
                    dl.f<?> fVar = this.f73532c.get(obj.getClass());
                    if (fVar != null) {
                        return p(fVar, cVar, obj, z15);
                    }
                    if (obj instanceof c) {
                        return a(cVar, ((c) obj).h());
                    }
                    return obj instanceof Enum ? a(cVar, ((Enum) obj).ordinal()) : o(this.f73533d, cVar, obj, z15);
                }
                byte[] bArr = (byte[]) obj;
                if (!z15 || bArr.length != 0) {
                    t((s(cVar) << 3) | 2);
                    t(bArr.length);
                    this.f73530a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // dl.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f a(dl.c cVar, int i15) {
        return i(cVar, i15, true);
    }

    f i(dl.c cVar, int i15, boolean z15) throws IOException {
        if (!z15 || i15 != 0) {
            d dVarR = r(cVar);
            int i16 = a.f73535a[dVarR.intEncoding().ordinal()];
            if (i16 == 1) {
                t(dVarR.tag() << 3);
                t(i15);
                return this;
            }
            if (i16 == 2) {
                t(dVarR.tag() << 3);
                t((i15 << 1) ^ (i15 >> 31));
                return this;
            }
            if (i16 == 3) {
                t((dVarR.tag() << 3) | 5);
                this.f73530a.write(m(4).putInt(i15).array());
                return this;
            }
        }
        return this;
    }

    @Override // dl.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f b(dl.c cVar, long j15) {
        return k(cVar, j15, true);
    }

    f k(dl.c cVar, long j15, boolean z15) throws IOException {
        if (!z15 || j15 != 0) {
            d dVarR = r(cVar);
            int i15 = a.f73535a[dVarR.intEncoding().ordinal()];
            if (i15 == 1) {
                t(dVarR.tag() << 3);
                u(j15);
                return this;
            }
            if (i15 == 2) {
                t(dVarR.tag() << 3);
                u((j15 >> 63) ^ (j15 << 1));
                return this;
            }
            if (i15 == 3) {
                t((dVarR.tag() << 3) | 1);
                this.f73530a.write(m(8).putLong(j15).array());
                return this;
            }
        }
        return this;
    }

    f l(dl.c cVar, boolean z15, boolean z16) {
        return i(cVar, z15 ? 1 : 0, z16);
    }

    f q(Object obj) {
        if (obj == null) {
            return this;
        }
        dl.d<?> dVar = this.f73531b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new dl.b("No encoder for " + obj.getClass());
    }
}
