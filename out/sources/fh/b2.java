package fh;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
final class b2 implements dl.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f62940f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f62941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final dl.c f62942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final dl.d f62943i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f62944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f62945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f62946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dl.d f62947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g2 f62948e = new g2(this);

    static {
        dl.c.b bVarA = dl.c.a("key");
        v1 v1Var = new v1();
        v1Var.a(1);
        f62941g = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("value");
        v1 v1Var2 = new v1();
        v1Var2.a(2);
        f62942h = bVarA2.b(v1Var2.b()).a();
        f62943i = new dl.d() { // from class: fh.a2
            @Override // dl.d
            public final void a(Object obj, Object obj2) {
                b2.j((Map.Entry) obj, (dl.e) obj2);
            }
        };
    }

    b2(OutputStream outputStream, Map map, Map map2, dl.d dVar) {
        this.f62944a = outputStream;
        this.f62945b = map;
        this.f62946c = map2;
        this.f62947d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, dl.e eVar) {
        eVar.d(f62941g, entry.getKey());
        eVar.d(f62942h, entry.getValue());
    }

    private static int k(dl.c cVar) {
        z1 z1Var = (z1) cVar.c(z1.class);
        if (z1Var != null) {
            return z1Var.zza();
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private final long l(dl.d dVar, Object obj) throws IOException {
        w1 w1Var = new w1();
        try {
            OutputStream outputStream = this.f62944a;
            this.f62944a = w1Var;
            try {
                dVar.a(obj, this);
                this.f62944a = outputStream;
                long jB = w1Var.b();
                w1Var.close();
                return jB;
            } catch (Throwable th4) {
                this.f62944a = outputStream;
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                w1Var.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    private static z1 m(dl.c cVar) {
        z1 z1Var = (z1) cVar.c(z1.class);
        if (z1Var != null) {
            return z1Var;
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private final b2 n(dl.d dVar, dl.c cVar, Object obj, boolean z15) throws IOException {
        long jL = l(dVar, obj);
        if (z15 && jL == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(jL);
        dVar.a(obj, this);
        return this;
    }

    private final b2 o(dl.f fVar, dl.c cVar, Object obj, boolean z15) {
        this.f62948e.a(cVar, z15);
        fVar.a(obj, this.f62948e);
        return this;
    }

    private static ByteBuffer p(int i15) {
        return ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i15) throws IOException {
        while (true) {
            long j15 = i15 & (-128);
            int i16 = i15 & CertificateBody.profileType;
            if (j15 == 0) {
                this.f62944a.write(i16);
                return;
            } else {
                this.f62944a.write(i16 | 128);
                i15 >>>= 7;
            }
        }
    }

    private final void r(long j15) throws IOException {
        while (true) {
            long j16 = (-128) & j15;
            int i15 = ((int) j15) & CertificateBody.profileType;
            if (j16 == 0) {
                this.f62944a.write(i15);
                return;
            } else {
                this.f62944a.write(i15 | 128);
                j15 >>>= 7;
            }
        }
    }

    @Override // dl.e
    public final /* synthetic */ dl.e a(dl.c cVar, int i15) throws IOException {
        g(cVar, i15, true);
        return this;
    }

    @Override // dl.e
    public final /* synthetic */ dl.e b(dl.c cVar, long j15) throws IOException {
        h(cVar, j15, true);
        return this;
    }

    final dl.e c(dl.c cVar, double d15, boolean z15) throws IOException {
        if (z15 && d15 == 0.0d) {
            return this;
        }
        q((k(cVar) << 3) | 1);
        this.f62944a.write(p(8).putDouble(d15).array());
        return this;
    }

    @Override // dl.e
    public final dl.e d(dl.c cVar, Object obj) throws IOException {
        f(cVar, obj, true);
        return this;
    }

    final dl.e e(dl.c cVar, float f15, boolean z15) throws IOException {
        if (z15 && f15 == 0.0f) {
            return this;
        }
        q((k(cVar) << 3) | 5);
        this.f62944a.write(p(4).putFloat(f15).array());
        return this;
    }

    final dl.e f(dl.c cVar, Object obj, boolean z15) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z15 || charSequence.length() != 0) {
                    q((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f62940f);
                    q(bytes.length);
                    this.f62944a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it4 = ((Map) obj).entrySet().iterator();
                while (it4.hasNext()) {
                    n(f62943i, cVar, (Map.Entry) it4.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    c(cVar, ((Double) obj).doubleValue(), z15);
                    return this;
                }
                if (obj instanceof Float) {
                    e(cVar, ((Float) obj).floatValue(), z15);
                    return this;
                }
                if (obj instanceof Number) {
                    h(cVar, ((Number) obj).longValue(), z15);
                    return this;
                }
                if (obj instanceof Boolean) {
                    g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z15);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    dl.d dVar = (dl.d) this.f62945b.get(obj.getClass());
                    if (dVar != null) {
                        n(dVar, cVar, obj, z15);
                        return this;
                    }
                    dl.f fVar = (dl.f) this.f62946c.get(obj.getClass());
                    if (fVar != null) {
                        o(fVar, cVar, obj, z15);
                        return this;
                    }
                    if (obj instanceof x1) {
                        g(cVar, ((x1) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        g(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    n(this.f62947d, cVar, obj, z15);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z15 || bArr.length != 0) {
                    q((k(cVar) << 3) | 2);
                    q(bArr.length);
                    this.f62944a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final b2 g(dl.c cVar, int i15, boolean z15) throws IOException {
        if (!z15 || i15 != 0) {
            z1 z1VarM = m(cVar);
            int iOrdinal = z1VarM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(z1VarM.zza() << 3);
                q(i15);
                return this;
            }
            if (iOrdinal == 1) {
                q(z1VarM.zza() << 3);
                q((i15 + i15) ^ (i15 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                q((z1VarM.zza() << 3) | 5);
                this.f62944a.write(p(4).putInt(i15).array());
                return this;
            }
        }
        return this;
    }

    final b2 h(dl.c cVar, long j15, boolean z15) throws IOException {
        if (!z15 || j15 != 0) {
            z1 z1VarM = m(cVar);
            int iOrdinal = z1VarM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(z1VarM.zza() << 3);
                r(j15);
                return this;
            }
            if (iOrdinal == 1) {
                q(z1VarM.zza() << 3);
                r((j15 >> 63) ^ (j15 + j15));
                return this;
            }
            if (iOrdinal == 2) {
                q((z1VarM.zza() << 3) | 1);
                this.f62944a.write(p(8).putLong(j15).array());
                return this;
            }
        }
        return this;
    }

    final b2 i(Object obj) {
        if (obj == null) {
            return this;
        }
        dl.d dVar = (dl.d) this.f62945b.get(obj.getClass());
        if (dVar == null) {
            throw new dl.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
