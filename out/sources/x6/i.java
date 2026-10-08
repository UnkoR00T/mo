package x6;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends x<i, a> implements s0 {
    private static final i DEFAULT_INSTANCE;
    private static volatile z0<i> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z.f<String> strings_ = x.z();

    public static final class a extends x.a<i, a> implements s0 {
        /* synthetic */ a(g gVar) {
            this();
        }

        public a I(Iterable<String> iterable) {
            x();
            ((i) this.f12206b).W(iterable);
            return this;
        }

        private a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        x.Q(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Iterable<String> iterable) {
        X();
        androidx.datastore.preferences.protobuf.a.a(iterable, this.strings_);
    }

    private void X() {
        z.f<String> fVar = this.strings_;
        if (fVar.c0()) {
            return;
        }
        this.strings_ = x.K(fVar);
    }

    public static i Y() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.v();
    }

    public List<String> Z() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    protected final Object y(x.f fVar, Object obj, Object obj2) {
        z0 bVar;
        g gVar = null;
        switch (g.f216958a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new a(gVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<i> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (i.class) {
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
