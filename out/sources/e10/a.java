package e10;

import android.security.keystore.KeyGenParameterSpec;
import er.p;
import iy.f0;
import java.security.ProviderException;
import java.util.concurrent.CancellationException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import py.KeyStoreKeySpec;
import py.o;
import y00.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Le10/a;", "Lpy/i;", "Ly00/c0;", "securityExceptionParser", "Le10/m;", "keyStoreKeySpecMapper", "Lpx/d;", "remoteLogger", "Lxw/d;", "dispatcherProvider", "<init>", "(Ly00/c0;Le10/m;Lpx/d;Lxw/d;)V", "Lpy/j;", "spec", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "a", "(Lpy/j;Ltq/e;)Ljava/lang/Object;", "Ljavax/crypto/KeyGenerator;", "b", "Ly00/c0;", "Le10/m;", "c", "Lpx/d;", "d", "Lxw/d;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements py.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m keyStoreKeySpecMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: e10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C1058a extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46697h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f46698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f46699k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f46701m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46702n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f46703p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f46704q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ KeyStoreKeySpec f46706s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1058a(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super C1058a> eVar) {
            super(2, eVar);
            this.f46706s = keyStoreKeySpec;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[Catch: Exception -> 0x00d3, c -> 0x00d7, CancellationException -> 0x00db, TRY_LEAVE, TryCatch #9 {c -> 0x00d7, CancellationException -> 0x00db, Exception -> 0x00d3, blocks: (B:35:0x00c1, B:47:0x00ec, B:49:0x00f4, B:55:0x0142, B:29:0x008e, B:31:0x0094), top: B:83:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:52:0x013e  */
        /* JADX WARN: Code duplicated, block: B:55:0x0142 A[Catch: Exception -> 0x00d3, c -> 0x00d7, CancellationException -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #9 {c -> 0x00d7, CancellationException -> 0x00db, Exception -> 0x00d3, blocks: (B:35:0x00c1, B:47:0x00ec, B:49:0x00f4, B:55:0x0142, B:29:0x008e, B:31:0x0094), top: B:83:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0165  */
        /* JADX WARN: Code duplicated, block: B:67:0x0176  */
        /* JADX WARN: Code duplicated, block: B:68:0x0184  */
        /* JADX WARN: Code duplicated, block: B:70:0x0188  */
        /* JADX WARN: Code duplicated, block: B:73:0x0194  */
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
            a aVar2;
            ex.b bVar2;
            int i18;
            Object objB2;
            int i19;
            a aVar3;
            ex.b bVar3;
            Object objA;
            ?? E = uq.b.e();
            int i25 = this.f46704q;
            try {
                try {
                    if (i25 == 0) {
                        u.b(obj);
                        jVar = a.this.securityExceptionParser;
                        a aVar4 = a.this;
                        KeyStoreKeySpec keyStoreKeySpec2 = this.f46706s;
                        try {
                            aVar = new ex.a();
                            i15 = 0;
                            try {
                                this.f46694e = jVar;
                                this.f46695f = aVar4;
                                this.f46696g = keyStoreKeySpec2;
                                this.f46697h = vq.j.a(aVar);
                                this.f46698j = vq.j.a(aVar);
                                this.f46699k = aVar;
                                this.f46700l = 0;
                                this.f46701m = 0;
                                this.f46702n = 0;
                                this.f46703p = 0;
                                this.f46704q = 1;
                                objB2 = aVar4.b(keyStoreKeySpec2, this);
                                if (objB2 != E) {
                                    i16 = 0;
                                    i19 = 0;
                                    i17 = 0;
                                    keyStoreKeySpec = keyStoreKeySpec2;
                                    aVar3 = aVar4;
                                    bVar3 = aVar;
                                    bVar2 = bVar3;
                                    return new dx.i.Right(((KeyGenerator) aVar.a((dx.i) objB2)).generateKey());
                                }
                            } catch (ProviderException e15) {
                                e = e15;
                                bVar = aVar;
                                i16 = 0;
                                i17 = 0;
                                keyStoreKeySpec = keyStoreKeySpec2;
                                aVar2 = aVar4;
                                bVar2 = bVar;
                                i18 = 0;
                                if (keyStoreKeySpec.getStrongBox() != o.PREFERRED) {
                                    return new dx.i.Left(new dx.b.Generic(e));
                                }
                                aVar2.remoteLogger.F8("StrongBox is unavailable, falling back to software-backed KeyStore.", px.d.a.GENERAL);
                                KeyStoreKeySpec keyStoreKeySpecB = KeyStoreKeySpec.b(keyStoreKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null);
                                this.f46694e = jVar;
                                this.f46695f = vq.j.a(bVar2);
                                this.f46696g = vq.j.a(bVar);
                                this.f46697h = vq.j.a(e);
                                this.f46698j = null;
                                this.f46699k = null;
                                this.f46700l = i17;
                                this.f46701m = i18;
                                this.f46702n = i15;
                                this.f46703p = i16;
                                this.f46704q = 2;
                                objA = aVar2.a(keyStoreKeySpecB, this);
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
                    i16 = this.f46703p;
                    int i26 = this.f46702n;
                    i18 = this.f46701m;
                    int i27 = this.f46700l;
                    ex.b bVar4 = (ex.b) this.f46699k;
                    bVar = (ex.b) this.f46698j;
                    ex.b bVar5 = (ex.b) this.f46697h;
                    KeyStoreKeySpec keyStoreKeySpec3 = (KeyStoreKeySpec) this.f46696g;
                    a aVar5 = (a) this.f46695f;
                    dx.j jVar2 = (dx.j) this.f46694e;
                    try {
                        u.b(obj);
                        aVar3 = aVar5;
                        bVar2 = bVar5;
                        i17 = i27;
                        i15 = i26;
                        jVar = jVar2;
                        keyStoreKeySpec = keyStoreKeySpec3;
                        bVar3 = bVar;
                        i19 = i18;
                        aVar = bVar4;
                        objB2 = obj;
                        try {
                            return new dx.i.Right(((KeyGenerator) aVar.a((dx.i) objB2)).generateKey());
                        } catch (ProviderException e26) {
                            e = e26;
                            i18 = i19;
                            bVar = bVar3;
                            aVar2 = aVar3;
                            if (keyStoreKeySpec.getStrongBox() != o.PREFERRED) {
                                return new dx.i.Left(new dx.b.Generic(e));
                            }
                            aVar2.remoteLogger.F8("StrongBox is unavailable, falling back to software-backed KeyStore.", px.d.a.GENERAL);
                            KeyStoreKeySpec keyStoreKeySpecB2 = KeyStoreKeySpec.b(keyStoreKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null);
                            this.f46694e = jVar;
                            this.f46695f = vq.j.a(bVar2);
                            this.f46696g = vq.j.a(bVar);
                            this.f46697h = vq.j.a(e);
                            this.f46698j = null;
                            this.f46699k = null;
                            this.f46700l = i17;
                            this.f46701m = i18;
                            this.f46702n = i15;
                            this.f46703p = i16;
                            this.f46704q = 2;
                            objA = aVar2.a(keyStoreKeySpecB2, this);
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
                        aVar2 = aVar5;
                        bVar2 = bVar5;
                        i17 = i27;
                        if (keyStoreKeySpec.getStrongBox() != o.PREFERRED) {
                            return new dx.i.Left(new dx.b.Generic(e));
                        }
                        aVar2.remoteLogger.F8("StrongBox is unavailable, falling back to software-backed KeyStore.", px.d.a.GENERAL);
                        KeyStoreKeySpec keyStoreKeySpecB3 = KeyStoreKeySpec.b(keyStoreKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null);
                        this.f46694e = jVar;
                        this.f46695f = vq.j.a(bVar2);
                        this.f46696g = vq.j.a(bVar);
                        this.f46697h = vq.j.a(e);
                        this.f46698j = null;
                        this.f46699k = null;
                        this.f46700l = i17;
                        this.f46701m = i18;
                        this.f46702n = i15;
                        this.f46703p = i16;
                        this.f46704q = 2;
                        objA = aVar2.a(keyStoreKeySpecB3, this);
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
                } catch (Exception e36) {
                    e = e36;
                }
            } catch (CancellationException e37) {
                throw e37;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) {
            return ((C1058a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new C1058a(this.f46706s, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/KeyGenerator;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends KeyGenerator>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46707e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ KeyStoreKeySpec f46709g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f46709g = keyStoreKeySpec;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f46707e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c0 c0Var = a.this.securityExceptionParser;
            a aVar = a.this;
            KeyStoreKeySpec keyStoreKeySpec = this.f46709g;
            try {
                try {
                    try {
                        new ex.a();
                        KeyGenParameterSpec keyGenParameterSpecB = aVar.keyStoreKeySpecMapper.b(keyStoreKeySpec);
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", f0.ANDROID_KEY_STORE.getAlias());
                        keyGenerator.init(keyGenParameterSpecB);
                        return new dx.i.Right(keyGenerator);
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
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends KeyGenerator>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new b(this.f46709g, eVar);
        }
    }

    public a(c0 c0Var, m mVar, px.d dVar, xw.d dVar2) {
        this.securityExceptionParser = c0Var;
        this.keyStoreKeySpecMapper = mVar;
        this.remoteLogger = dVar;
        this.dispatcherProvider = dVar2;
    }

    @Override // py.i
    public Object a(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) {
        return this.dispatcherProvider.a(new C1058a(keyStoreKeySpec, null), eVar);
    }

    @Override // py.i
    public Object b(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends KeyGenerator>> eVar) {
        return this.dispatcherProvider.a(new b(keyStoreKeySpec, null), eVar);
    }
}
