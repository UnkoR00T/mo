package ch;

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
final class r2 implements dl.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f26298f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f26299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final dl.c f26300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final dl.d f26301i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f26302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dl.d f26305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v2 f26306e = new v2(this);

    static {
        dl.c.b bVarA = dl.c.a("key");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26299g = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("value");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26300h = bVarA2.b(l2Var2.b()).a();
        f26301i = new dl.d() { // from class: ch.q2
            @Override // dl.d
            public final void a(Object obj, Object obj2) {
                r2.j((Map.Entry) obj, (dl.e) obj2);
            }
        };
    }

    r2(OutputStream outputStream, Map map, Map map2, dl.d dVar) {
        this.f26302a = outputStream;
        this.f26303b = map;
        this.f26304c = map2;
        this.f26305d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, dl.e eVar) {
        eVar.d(f26299g, entry.getKey());
        eVar.d(f26300h, entry.getValue());
    }

    private static int k(dl.c cVar) {
        p2 p2Var = (p2) cVar.c(p2.class);
        if (p2Var != null) {
            return p2Var.zza();
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private final long l(dl.d dVar, Object obj) throws IOException {
        m2 m2Var = new m2();
        try {
            OutputStream outputStream = this.f26302a;
            this.f26302a = m2Var;
            try {
                dVar.a(obj, this);
                this.f26302a = outputStream;
                long jB = m2Var.b();
                m2Var.close();
                return jB;
            } catch (Throwable th4) {
                this.f26302a = outputStream;
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                m2Var.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    private static p2 m(dl.c cVar) {
        p2 p2Var = (p2) cVar.c(p2.class);
        if (p2Var != null) {
            return p2Var;
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private final r2 n(dl.d dVar, dl.c cVar, Object obj, boolean z15) throws IOException {
        long jL = l(dVar, obj);
        if (z15 && jL == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(jL);
        dVar.a(obj, this);
        return this;
    }

    private final r2 o(dl.f fVar, dl.c cVar, Object obj, boolean z15) {
        this.f26306e.a(cVar, z15);
        fVar.a(obj, this.f26306e);
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
                this.f26302a.write(i16);
                return;
            } else {
                this.f26302a.write(i16 | 128);
                i15 >>>= 7;
            }
        }
    }

    private final void r(long j15) throws IOException {
        while (true) {
            long j16 = (-128) & j15;
            int i15 = ((int) j15) & CertificateBody.profileType;
            if (j16 == 0) {
                this.f26302a.write(i15);
                return;
            } else {
                this.f26302a.write(i15 | 128);
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
        this.f26302a.write(p(8).putDouble(d15).array());
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
        this.f26302a.write(p(4).putFloat(f15).array());
        return this;
    }

    final dl.e f(dl.c cVar, Object obj, boolean z15) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z15 || charSequence.length() != 0) {
                    q((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f26298f);
                    q(bytes.length);
                    this.f26302a.write(bytes);
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
                    n(f26301i, cVar, (Map.Entry) it4.next(), false);
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
                    dl.d dVar = (dl.d) this.f26303b.get(obj.getClass());
                    if (dVar != null) {
                        n(dVar, cVar, obj, z15);
                        return this;
                    }
                    dl.f fVar = (dl.f) this.f26304c.get(obj.getClass());
                    if (fVar != null) {
                        o(fVar, cVar, obj, z15);
                        return this;
                    }
                    if (obj instanceof n2) {
                        g(cVar, ((n2) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        g(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    n(this.f26305d, cVar, obj, z15);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z15 || bArr.length != 0) {
                    q((k(cVar) << 3) | 2);
                    q(bArr.length);
                    this.f26302a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final r2 g(dl.c cVar, int i15, boolean z15) throws IOException {
        if (!z15 || i15 != 0) {
            p2 p2VarM = m(cVar);
            int iOrdinal = p2VarM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(p2VarM.zza() << 3);
                q(i15);
                return this;
            }
            if (iOrdinal == 1) {
                q(p2VarM.zza() << 3);
                q((i15 + i15) ^ (i15 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                q((p2VarM.zza() << 3) | 5);
                this.f26302a.write(p(4).putInt(i15).array());
                return this;
            }
        }
        return this;
    }

    final r2 h(dl.c cVar, long j15, boolean z15) throws IOException {
        if (!z15 || j15 != 0) {
            p2 p2VarM = m(cVar);
            int iOrdinal = p2VarM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(p2VarM.zza() << 3);
                r(j15);
                return this;
            }
            if (iOrdinal == 1) {
                q(p2VarM.zza() << 3);
                r((j15 >> 63) ^ (j15 + j15));
                return this;
            }
            if (iOrdinal == 2) {
                q((p2VarM.zza() << 3) | 1);
                this.f26302a.write(p(8).putLong(j15).array());
                return this;
            }
        }
        return this;
    }

    final r2 i(Object obj) {
        if (obj == null) {
            return this;
        }
        dl.d dVar = (dl.d) this.f26303b.get(obj.getClass());
        if (dVar == null) {
            throw new dl.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
