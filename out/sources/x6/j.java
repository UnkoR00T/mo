package x6;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends x<j, a> implements s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0<j> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends x.a<j, a> implements s0 {
        /* synthetic */ a(g gVar) {
            this();
        }

        public a I(boolean z15) {
            x();
            ((j) this.f12206b).o0(z15);
            return this;
        }

        public a J(androidx.datastore.preferences.protobuf.g gVar) {
            x();
            ((j) this.f12206b).p0(gVar);
            return this;
        }

        public a K(double d15) {
            x();
            ((j) this.f12206b).q0(d15);
            return this;
        }

        public a N(float f15) {
            x();
            ((j) this.f12206b).r0(f15);
            return this;
        }

        public a O(int i15) {
            x();
            ((j) this.f12206b).s0(i15);
            return this;
        }

        public a P(long j15) {
            x();
            ((j) this.f12206b).t0(j15);
            return this;
        }

        public a Q(String str) {
            x();
            ((j) this.f12206b).u0(str);
            return this;
        }

        public a R(i.a aVar) {
            x();
            ((j) this.f12206b).v0(aVar.build());
            return this;
        }

        private a() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f216970a;

        b(int i15) {
            this.f216970a = i15;
        }

        public static b e(int i15) {
            switch (i15) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        x.Q(j.class, jVar);
    }

    private j() {
    }

    public static j f0() {
        return DEFAULT_INSTANCE;
    }

    public static a n0() {
        return DEFAULT_INSTANCE.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(boolean z15) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(androidx.datastore.preferences.protobuf.g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(double d15) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(float f15) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(int i15) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(long j15) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(i iVar) {
        iVar.getClass();
        this.value_ = iVar;
        this.valueCase_ = 6;
    }

    public boolean d0() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public androidx.datastore.preferences.protobuf.g e0() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.f11949b;
    }

    public double g0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float h0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int i0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long j0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String k0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public i l0() {
        return this.valueCase_ == 6 ? (i) this.value_ : i.Y();
    }

    public b m0() {
        return b.e(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    protected final Object y(x.f fVar, Object obj, Object obj2) {
        z0 bVar;
        g gVar = null;
        switch (g.f216958a[fVar.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new a(gVar);
            case 3:
                return x.M(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<j> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (j.class) {
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
