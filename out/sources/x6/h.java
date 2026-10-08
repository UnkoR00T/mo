package x6;

import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends x<h, a> implements s0 {
    private static final h DEFAULT_INSTANCE;
    private static volatile z0<h> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private l0<String, j> preferences_ = l0.g();

    public static final class a extends x.a<h, a> implements s0 {
        /* synthetic */ a(g gVar) {
            this();
        }

        public a I(String str, j jVar) {
            str.getClass();
            jVar.getClass();
            x();
            ((h) this.f12206b).W().put(str, jVar);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k0<String, j> f216959a = k0.d(s1.b.f12105l, "", s1.b.f12107n, j.f0());
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.Q(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, j> W() {
        return Y();
    }

    private l0<String, j> Y() {
        if (!this.preferences_.o()) {
            this.preferences_ = this.preferences_.t();
        }
        return this.preferences_;
    }

    private l0<String, j> Z() {
        return this.preferences_;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.v();
    }

    public static h b0(InputStream inputStream) {
        return (h) x.O(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, j> X() {
        return Collections.unmodifiableMap(Z());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    protected final Object y(x.f fVar, Object obj, Object obj2) {
        z0 bVar;
        g gVar = null;
        switch (g.f216958a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(gVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f216959a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<h> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
