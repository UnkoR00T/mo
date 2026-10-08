package e10;

import android.security.keystore.KeyGenParameterSpec;
import er.p;
import iy.f0;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.ProviderException;
import java.util.concurrent.CancellationException;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import py.KeyStoreKeySpec;
import py.o;
import y00.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le10/b;", "Lpy/k;", "Ly00/c0;", "securityExceptionParser", "Le10/m;", "keyStoreKeySpecMapper", "Lxw/d;", "dispatcherProvider", "<init>", "(Ly00/c0;Le10/m;Lxw/d;)V", "Lpy/j;", "spec", "Ldx/i;", "Ldx/b;", "Ljava/security/KeyPair;", "a", "(Lpy/j;Ltq/e;)Ljava/lang/Object;", "Ljava/security/KeyPairGenerator;", "d", "Ly00/c0;", "b", "Le10/m;", "c", "Lxw/d;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements py.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m keyStoreKeySpecMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Ljava/security/KeyPair;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends KeyPair>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46716h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f46717j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f46718k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46719l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f46720m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46721n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f46722p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f46723q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ KeyStoreKeySpec f46725s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f46725s = keyStoreKeySpec;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[Catch: Exception -> 0x00d3, c -> 0x00d7, CancellationException -> 0x00db, TRY_LEAVE, TryCatch #9 {c -> 0x00d7, CancellationException -> 0x00db, Exception -> 0x00d3, blocks: (B:35:0x00c1, B:47:0x00ec, B:49:0x00f4, B:55:0x0137, B:29:0x008e, B:31:0x0094), top: B:83:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0133  */
        /* JADX WARN: Code duplicated, block: B:55:0x0137 A[Catch: Exception -> 0x00d3, c -> 0x00d7, CancellationException -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #9 {c -> 0x00d7, CancellationException -> 0x00db, Exception -> 0x00d3, blocks: (B:35:0x00c1, B:47:0x00ec, B:49:0x00f4, B:55:0x0137, B:29:0x008e, B:31:0x0094), top: B:83:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:64:0x015a  */
        /* JADX WARN: Code duplicated, block: B:67:0x016b  */
        /* JADX WARN: Code duplicated, block: B:68:0x0179  */
        /* JADX WARN: Code duplicated, block: B:70:0x017d  */
        /* JADX WARN: Code duplicated, block: B:73:0x0189  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            dx.j jVar;
            ex.b aVar;
            int i15;
            ex.b bVar;
            int i16;
            int i17;
            KeyStoreKeySpec keyStoreKeySpec;
            b bVar2;
            ex.b bVar3;
            int i18;
            Object objD;
            int i19;
            b bVar4;
            ex.b bVar5;
            Object objA;
            ?? E = uq.b.e();
            int i25 = this.f46723q;
            try {
                try {
                    if (i25 == 0) {
                        u.b(obj);
                        jVar = b.this.securityExceptionParser;
                        b bVar6 = b.this;
                        KeyStoreKeySpec keyStoreKeySpec2 = this.f46725s;
                        try {
                            aVar = new ex.a();
                            i15 = 0;
                            try {
                                this.f46713e = jVar;
                                this.f46714f = bVar6;
                                this.f46715g = keyStoreKeySpec2;
                                this.f46716h = vq.j.a(aVar);
                                this.f46717j = vq.j.a(aVar);
                                this.f46718k = aVar;
                                this.f46719l = 0;
                                this.f46720m = 0;
                                this.f46721n = 0;
                                this.f46722p = 0;
                                this.f46723q = 1;
                                objD = bVar6.d(keyStoreKeySpec2, this);
                                if (objD != E) {
                                    i16 = 0;
                                    i19 = 0;
                                    i17 = 0;
                                    keyStoreKeySpec = keyStoreKeySpec2;
                                    bVar4 = bVar6;
                                    bVar5 = aVar;
                                    bVar3 = bVar5;
                                    return new dx.i.Right(((KeyPairGenerator) aVar.a((dx.i) objD)).generateKeyPair());
                                }
                            } catch (ProviderException e15) {
                                e = e15;
                                bVar = aVar;
                                i16 = 0;
                                i17 = 0;
                                keyStoreKeySpec = keyStoreKeySpec2;
                                bVar2 = bVar6;
                                bVar3 = bVar;
                                i18 = 0;
                                if (keyStoreKeySpec.getStrongBox() != o.PREFERRED) {
                                    return new dx.i.Left(new dx.b.Generic(e));
                                }
                                KeyStoreKeySpec keyStoreKeySpecB = KeyStoreKeySpec.b(keyStoreKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null);
                                this.f46713e = jVar;
                                this.f46714f = vq.j.a(bVar3);
                                this.f46715g = vq.j.a(bVar);
                                this.f46716h = vq.j.a(e);
                                this.f46717j = null;
                                this.f46718k = null;
                                this.f46719l = i17;
                                this.f46720m = i18;
                                this.f46721n = i15;
                                this.f46722p = i16;
                                this.f46723q = 2;
                                objA = bVar2.a(keyStoreKeySpecB, this);
                                if (objA != E) {
                                    return (dx.i) objA;
                                }
                                return E;
                            }
                            return E;
                        } catch (ex.c e16) {
                            e = e16;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e17) {
                            throw e17;
                        } catch (Exception e18) {
                            e = e18;
                            E = jVar;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i25 != 1) {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            u.b(obj);
                            objA = obj;
                            return (dx.i) objA;
                        } catch (ex.c e19) {
                            e = e19;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e25) {
                            throw e25;
                        }
                    }
                    i16 = this.f46722p;
                    int i26 = this.f46721n;
                    i18 = this.f46720m;
                    int i27 = this.f46719l;
                    ex.b bVar7 = (ex.b) this.f46718k;
                    bVar = (ex.b) this.f46717j;
                    ex.b bVar8 = (ex.b) this.f46716h;
                    KeyStoreKeySpec keyStoreKeySpec3 = (KeyStoreKeySpec) this.f46715g;
                    b bVar9 = (b) this.f46714f;
                    dx.j jVar2 = (dx.j) this.f46713e;
                    try {
                        u.b(obj);
                        bVar4 = bVar9;
                        bVar3 = bVar8;
                        i17 = i27;
                        i15 = i26;
                        jVar = jVar2;
                        keyStoreKeySpec = keyStoreKeySpec3;
                        bVar5 = bVar;
                        i19 = i18;
                        aVar = bVar7;
                        objD = obj;
                        try {
                            return new dx.i.Right(((KeyPairGenerator) aVar.a((dx.i) objD)).generateKeyPair());
                        } catch (ProviderException e26) {
                            e = e26;
                            i18 = i19;
                            bVar = bVar5;
                            bVar2 = bVar4;
                            if (keyStoreKeySpec.getStrongBox() != o.PREFERRED) {
                                return new dx.i.Left(new dx.b.Generic(e));
                            }
                            KeyStoreKeySpec keyStoreKeySpecB2 = KeyStoreKeySpec.b(keyStoreKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null);
                            this.f46713e = jVar;
                            this.f46714f = vq.j.a(bVar3);
                            this.f46715g = vq.j.a(bVar);
                            this.f46716h = vq.j.a(e);
                            this.f46717j = null;
                            this.f46718k = null;
                            this.f46719l = i17;
                            this.f46720m = i18;
                            this.f46721n = i15;
                            this.f46722p = i16;
                            this.f46723q = 2;
                            objA = bVar2.a(keyStoreKeySpecB2, this);
                            if (objA != E) {
                                return (dx.i) objA;
                            }
                            return E;
                        }
                    } catch (ex.c e27) {
                        e = e27;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (ProviderException e28) {
                        e = e28;
                        i15 = i26;
                        jVar = jVar2;
                        keyStoreKeySpec = keyStoreKeySpec3;
                        bVar2 = bVar9;
                        bVar3 = bVar8;
                        i17 = i27;
                        if (keyStoreKeySpec.getStrongBox() != o.PREFERRED) {
                            return new dx.i.Left(new dx.b.Generic(e));
                        }
                        KeyStoreKeySpec keyStoreKeySpecB3 = KeyStoreKeySpec.b(keyStoreKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null);
                        this.f46713e = jVar;
                        this.f46714f = vq.j.a(bVar3);
                        this.f46715g = vq.j.a(bVar);
                        this.f46716h = vq.j.a(e);
                        this.f46717j = null;
                        this.f46718k = null;
                        this.f46719l = i17;
                        this.f46720m = i18;
                        this.f46721n = i15;
                        this.f46722p = i16;
                        this.f46723q = 2;
                        objA = bVar2.a(keyStoreKeySpecB3, this);
                        if (objA != E) {
                            return (dx.i) objA;
                        }
                        return E;
                    } catch (CancellationException e29) {
                        throw e29;
                    } catch (Exception e35) {
                        e = e35;
                        E = jVar2;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e36) {
                    throw e36;
                }
            } catch (Exception e37) {
                e = e37;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, KeyPair>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new a(this.f46725s, eVar);
        }
    }

    /* JADX INFO: renamed from: e10.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Ljava/security/KeyPairGenerator;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C1059b extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends KeyPairGenerator>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46726e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ KeyStoreKeySpec f46728g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1059b(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super C1059b> eVar) {
            super(2, eVar);
            this.f46728g = keyStoreKeySpec;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f46726e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c0 c0Var = b.this.securityExceptionParser;
            b bVar = b.this;
            KeyStoreKeySpec keyStoreKeySpec = this.f46728g;
            try {
                try {
                    try {
                        new ex.a();
                        KeyGenParameterSpec keyGenParameterSpecB = bVar.keyStoreKeySpecMapper.b(keyStoreKeySpec);
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", f0.ANDROID_KEY_STORE.getAlias());
                        keyPairGenerator.initialize(keyGenParameterSpecB);
                        return new dx.i.Right(keyPairGenerator);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(c0Var));
                dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
                if (iVarA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                } else {
                    if (!(iVarA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends KeyPairGenerator>> eVar) {
            return ((C1059b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new C1059b(this.f46728g, eVar);
        }
    }

    public b(c0 c0Var, m mVar, xw.d dVar) {
        this.securityExceptionParser = c0Var;
        this.keyStoreKeySpecMapper = mVar;
        this.dispatcherProvider = dVar;
    }

    @Override // py.k
    public Object a(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super dx.i<? extends dx.b, KeyPair>> eVar) {
        return this.dispatcherProvider.a(new a(keyStoreKeySpec, null), eVar);
    }

    public Object d(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends KeyPairGenerator>> eVar) {
        return this.dispatcherProvider.a(new C1059b(keyStoreKeySpec, null), eVar);
    }
}
