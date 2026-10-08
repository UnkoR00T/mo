package fk;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import sk.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f64400a = Logger.getLogger(x.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<j> f64401b = new AtomicReference<>(new j());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f64402c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f64403d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f64404e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<String, l> f64405f = new ConcurrentHashMap();

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ nk.d f64406a;

        a(nk.d dVar) {
            this.f64406a = dVar;
        }
    }

    private interface b {
    }

    private x() {
    }

    private static <KeyProtoT extends r0> b a(nk.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private static synchronized <KeyProtoT extends r0, KeyFormatProtoT extends r0> void b(String str, Map<String, nk.d.a.C3379a<KeyFormatProtoT>> map, boolean z15) {
        if (z15) {
            try {
                ConcurrentMap<String, Boolean> concurrentMap = f64403d;
                if (concurrentMap.containsKey(str) && !concurrentMap.get(str).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            if (f64401b.get().j(str)) {
                for (Map.Entry<String, nk.d.a.C3379a<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!f64405f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + entry.getKey() + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry<String, nk.d.a.C3379a<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (f64405f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + entry2.getKey());
                    }
                }
            }
        }
    }

    static <KeyT extends g, P> P c(KeyT keyt, Class<P> cls) {
        return (P) nk.h.c().b(keyt, cls);
    }

    public static Class<?> d(Class<?> cls) {
        try {
            return nk.h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P e(String str, com.google.crypto.tink.shaded.protobuf.h hVar, Class<P> cls) {
        return f64401b.get().c(str, cls).c(hVar);
    }

    public static <P> P f(String str, byte[] bArr, Class<P> cls) {
        return (P) e(str, com.google.crypto.tink.shaded.protobuf.h.i(bArr), cls);
    }

    public static <P> P g(sk.y yVar, Class<P> cls) {
        return (P) e(yVar.b0(), yVar.c0(), cls);
    }

    public static h<?> h(String str) {
        return f64401b.get().f(str);
    }

    static synchronized Map<String, l> i() {
        return Collections.unmodifiableMap(f64405f);
    }

    public static synchronized r0 j(a0 a0Var) {
        h<?> hVarH;
        hVarH = h(a0Var.b0());
        if (!f64403d.get(a0Var.b0()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.b0());
        }
        return hVarH.d(a0Var.c0());
    }

    public static synchronized sk.y k(a0 a0Var) {
        h<?> hVarH;
        hVarH = h(a0Var.b0());
        if (!f64403d.get(a0Var.b0()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.b0());
        }
        return hVarH.a(a0Var.c0());
    }

    public static synchronized <KeyProtoT extends r0> void l(nk.d<KeyProtoT> dVar, boolean z15) {
        try {
            if (dVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<j> atomicReference = f64401b;
            j jVar = new j(atomicReference.get());
            jVar.g(dVar);
            String strD = dVar.d();
            b(strD, z15 ? dVar.f().c() : Collections.EMPTY_MAP, z15);
            if (!atomicReference.get().j(strD)) {
                f64402c.put(strD, a(dVar));
                if (z15) {
                    m(strD, dVar.f().c());
                }
            }
            f64403d.put(strD, Boolean.valueOf(z15));
            atomicReference.set(jVar);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private static <KeyFormatProtoT extends r0> void m(String str, Map<String, nk.d.a.C3379a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, nk.d.a.C3379a<KeyFormatProtoT>> entry : map.entrySet()) {
            f64405f.put(entry.getKey(), l.a(str, entry.getValue().f137045a.toByteArray(), entry.getValue().f137046b));
        }
    }

    public static synchronized <B, P> void n(w<B, P> wVar) {
        nk.h.c().e(wVar);
    }

    public static <B, P> P o(v<B> vVar, Class<P> cls) {
        return (P) nk.h.c().f(vVar, cls);
    }
}
