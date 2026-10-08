package sk;

import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends com.google.crypto.tink.shaded.protobuf.y<c0, b> implements s0 {
    private static final c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile z0<c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.a0.i<c> key_ = com.google.crypto.tink.shaded.protobuf.y.x();
    private int primaryKeyId_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f182054a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f182054a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f182054a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f182054a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f182054a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f182054a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f182054a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f182054a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<c0, b> implements s0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0.a D1(r0 r0Var) {
            return super.D1(r0Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0 E() {
            return super.E();
        }

        public b G(c cVar) {
            v();
            ((c0) this.f36318b).Y(cVar);
            return this;
        }

        public c H(int i15) {
            return ((c0) this.f36318b).a0(i15);
        }

        public int I() {
            return ((c0) this.f36318b).b0();
        }

        public List<c> J() {
            return Collections.unmodifiableList(((c0) this.f36318b).c0());
        }

        public b K(int i15) {
            v();
            ((c0) this.f36318b).h0(i15);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0 build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ r0 i() {
            return super.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a n(com.google.crypto.tink.shaded.protobuf.a aVar) {
            return super.n((com.google.crypto.tink.shaded.protobuf.y) aVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0.a o1(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.o1(iVar, pVar);
        }

        private b() {
            super(c0.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends com.google.crypto.tink.shaded.protobuf.y<c, a> implements s0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile z0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class a extends com.google.crypto.tink.shaded.protobuf.y.a<c, a> implements s0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a, com.google.crypto.tink.shaded.protobuf.r0.a
            public /* bridge */ /* synthetic */ r0.a D1(r0 r0Var) {
                return super.D1(r0Var);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
            public /* bridge */ /* synthetic */ r0 E() {
                return super.E();
            }

            public a G(y yVar) {
                v();
                ((c) this.f36318b).g0(yVar);
                return this;
            }

            public a H(int i15) {
                v();
                ((c) this.f36318b).h0(i15);
                return this;
            }

            public a I(i0 i0Var) {
                v();
                ((c) this.f36318b).i0(i0Var);
                return this;
            }

            public a J(z zVar) {
                v();
                ((c) this.f36318b).j0(zVar);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
            public /* bridge */ /* synthetic */ r0 build() {
                return super.build();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a
            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0
            public /* bridge */ /* synthetic */ r0 i() {
                return super.i();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a
            protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a n(com.google.crypto.tink.shaded.protobuf.a aVar) {
                return super.n((com.google.crypto.tink.shaded.protobuf.y) aVar);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
            public /* bridge */ /* synthetic */ r0.a o1(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
                return super.o1(iVar, pVar);
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.crypto.tink.shaded.protobuf.y.S(c.class, cVar);
        }

        private c() {
        }

        public static a f0() {
            return DEFAULT_INSTANCE.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(int i15) {
            this.keyId_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(i0 i0Var) {
            this.outputPrefixType_ = i0Var.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(z zVar) {
            this.status_ = zVar.h();
        }

        public y a0() {
            y yVar = this.keyData_;
            return yVar == null ? y.Z() : yVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a b() {
            return super.b();
        }

        public int b0() {
            return this.keyId_;
        }

        public i0 c0() {
            i0 i0VarB = i0.b(this.outputPrefixType_);
            return i0VarB == null ? i0.UNRECOGNIZED : i0VarB;
        }

        public z d0() {
            z zVarB = z.b(this.status_);
            return zVarB == null ? z.UNRECOGNIZED : zVarB;
        }

        public boolean e0() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a g() {
            return super.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ r0 i() {
            return super.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y
        protected final Object w(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
            z0 bVar;
            a aVar = null;
            switch (a.f182054a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    z0<c> z0Var = PARSER;
                    if (z0Var != null) {
                        return z0Var;
                    }
                    synchronized (c.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new com.google.crypto.tink.shaded.protobuf.y.b(DEFAULT_INSTANCE);
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

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.crypto.tink.shaded.protobuf.y.S(c0.class, c0Var);
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(c cVar) {
        cVar.getClass();
        Z();
        this.key_.add(cVar);
    }

    private void Z() {
        com.google.crypto.tink.shaded.protobuf.a0.i<c> iVar = this.key_;
        if (iVar.c0()) {
            return;
        }
        this.key_ = com.google.crypto.tink.shaded.protobuf.y.I(iVar);
    }

    public static b e0() {
        return DEFAULT_INSTANCE.t();
    }

    public static c0 f0(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (c0) com.google.crypto.tink.shaded.protobuf.y.N(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static c0 g0(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (c0) com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, bArr, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i15) {
        this.primaryKeyId_ = i15;
    }

    public c a0(int i15) {
        return this.key_.get(i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
    public /* bridge */ /* synthetic */ r0.a b() {
        return super.b();
    }

    public int b0() {
        return this.key_.size();
    }

    public List<c> c0() {
        return this.key_;
    }

    public int d0() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
    public /* bridge */ /* synthetic */ r0.a g() {
        return super.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ r0 i() {
        return super.i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object w(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        z0 bVar;
        a aVar = null;
        switch (a.f182054a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<c0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (c0.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new com.google.crypto.tink.shaded.protobuf.y.b(DEFAULT_INSTANCE);
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
