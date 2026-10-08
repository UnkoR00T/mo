package dh;

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
final class l implements dl.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f41991f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f41992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final dl.c f41993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final dl.d f41994i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f41995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f41996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f41997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dl.d f41998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f41999e = new p(this);

    static {
        dl.c.b bVarA = dl.c.a("key");
        f fVar = new f();
        fVar.a(1);
        f41992g = bVarA.b(fVar.b()).a();
        dl.c.b bVarA2 = dl.c.a("value");
        f fVar2 = new f();
        fVar2.a(2);
        f41993h = bVarA2.b(fVar2.b()).a();
        f41994i = new dl.d() { // from class: dh.k
            @Override // dl.d
            public final void a(Object obj, Object obj2) {
                l.j((Map.Entry) obj, (dl.e) obj2);
            }
        };
    }

    l(OutputStream outputStream, Map map, Map map2, dl.d dVar) {
        this.f41995a = outputStream;
        this.f41996b = map;
        this.f41997c = map2;
        this.f41998d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, dl.e eVar) {
        eVar.d(f41992g, entry.getKey());
        eVar.d(f41993h, entry.getValue());
    }

    private static int k(dl.c cVar) {
        j jVar = (j) cVar.c(j.class);
        if (jVar != null) {
            return jVar.zza();
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private final long l(dl.d dVar, Object obj) throws IOException {
        g gVar = new g();
        try {
            OutputStream outputStream = this.f41995a;
            this.f41995a = gVar;
            try {
                dVar.a(obj, this);
                this.f41995a = outputStream;
                long jB = gVar.b();
                gVar.close();
                return jB;
            } catch (Throwable th4) {
                this.f41995a = outputStream;
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                gVar.close();
            } catch (Throwable th6) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                } catch (Exception unused) {
                }
            }
            throw th5;
        }
    }

    private static j m(dl.c cVar) {
        j jVar = (j) cVar.c(j.class);
        if (jVar != null) {
            return jVar;
        }
        throw new dl.b("Field has no @Protobuf config");
    }

    private final l n(dl.d dVar, dl.c cVar, Object obj, boolean z15) throws IOException {
        long jL = l(dVar, obj);
        if (z15 && jL == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(jL);
        dVar.a(obj, this);
        return this;
    }

    private final l o(dl.f fVar, dl.c cVar, Object obj, boolean z15) {
        this.f41999e.a(cVar, z15);
        fVar.a(obj, this.f41999e);
        return this;
    }

    private static ByteBuffer p(int i15) {
        return ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i15) throws IOException {
        while ((i15 & (-128)) != 0) {
            this.f41995a.write((i15 & CertificateBody.profileType) | 128);
            i15 >>>= 7;
        }
        this.f41995a.write(i15 & CertificateBody.profileType);
    }

    private final void r(long j15) throws IOException {
        while (((-128) & j15) != 0) {
            this.f41995a.write((((int) j15) & CertificateBody.profileType) | 128);
            j15 >>>= 7;
        }
        this.f41995a.write(((int) j15) & CertificateBody.profileType);
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
        this.f41995a.write(p(8).putDouble(d15).array());
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
        this.f41995a.write(p(4).putFloat(f15).array());
        return this;
    }

    final dl.e f(dl.c cVar, Object obj, boolean z15) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z15 || charSequence.length() != 0) {
                    q((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f41991f);
                    q(bytes.length);
                    this.f41995a.write(bytes);
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
                    n(f41994i, cVar, (Map.Entry) it4.next(), false);
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
                    dl.d dVar = (dl.d) this.f41996b.get(obj.getClass());
                    if (dVar != null) {
                        n(dVar, cVar, obj, z15);
                        return this;
                    }
                    dl.f fVar = (dl.f) this.f41997c.get(obj.getClass());
                    if (fVar != null) {
                        o(fVar, cVar, obj, z15);
                        return this;
                    }
                    if (obj instanceof h) {
                        g(cVar, ((h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        g(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    n(this.f41998d, cVar, obj, z15);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z15 || bArr.length != 0) {
                    q((k(cVar) << 3) | 2);
                    q(bArr.length);
                    this.f41995a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final l g(dl.c cVar, int i15, boolean z15) throws IOException {
        if (!z15 || i15 != 0) {
            j jVarM = m(cVar);
            i iVar = i.DEFAULT;
            int iOrdinal = jVarM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(jVarM.zza() << 3);
                q(i15);
                return this;
            }
            if (iOrdinal == 1) {
                q(jVarM.zza() << 3);
                q((i15 + i15) ^ (i15 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                q((jVarM.zza() << 3) | 5);
                this.f41995a.write(p(4).putInt(i15).array());
                return this;
            }
        }
        return this;
    }

    final l h(dl.c cVar, long j15, boolean z15) throws IOException {
        if (!z15 || j15 != 0) {
            j jVarM = m(cVar);
            i iVar = i.DEFAULT;
            int iOrdinal = jVarM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(jVarM.zza() << 3);
                r(j15);
                return this;
            }
            if (iOrdinal == 1) {
                q(jVarM.zza() << 3);
                r((j15 >> 63) ^ (j15 + j15));
                return this;
            }
            if (iOrdinal == 2) {
                q((jVarM.zza() << 3) | 1);
                this.f41995a.write(p(8).putLong(j15).array());
                return this;
            }
        }
        return this;
    }

    final l i(Object obj) {
        if (obj == null) {
            return this;
        }
        dl.d dVar = (dl.d) this.f41996b.get(obj.getClass());
        if (dVar == null) {
            throw new dl.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
