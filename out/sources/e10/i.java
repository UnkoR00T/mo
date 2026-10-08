package e10;

import er.p;
import fu.o;
import fu.r;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.CancellationException;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y00.c0;
import y00.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0012\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001d\u0010\u001bJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\"\u0010#J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010$\u001a\u00020\fH\u0096@¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/¨\u00061"}, d2 = {"Le10/i;", "Lpy/m;", "Ly00/h0;", "securityProviderFactory", "Ly00/c0;", "securityExceptionParser", "Liy/a;", "base64Coder", "Lxw/d;", "dispatcherProvider", "<init>", "(Ly00/h0;Ly00/c0;Liy/a;Lxw/d;)V", "", "pem", "g", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i$b;", "Ldx/b;", "h", "(Ljava/lang/Exception;)Ldx/i$b;", "Ljava/security/spec/EncodedKeySpec;", "encodedKeySpec", "Ldx/i;", "Ljava/security/PrivateKey;", "(Ljava/security/spec/EncodedKeySpec;Ltq/e;)Ljava/lang/Object;", "Ljava/security/PublicKey;", "f", "", "encodedBytes", "b", "([BLtq/e;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "x509", "a", "Ly00/c0;", "Liy/a;", "Lxw/d;", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "Ljava/security/KeyFactory;", "kotlin.jvm.PlatformType", "Ljava/security/KeyFactory;", "keyFactory", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements py.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Provider provider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final KeyFactory keyFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f46771e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46773g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46771e = obj;
            this.f46773g |= PKIFailureInfo.systemUnavail;
            return i.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Ljava/security/PrivateKey;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super dx.i.Right<PrivateKey>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46774e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ EncodedKeySpec f46776g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EncodedKeySpec encodedKeySpec, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f46776g = encodedKeySpec;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46774e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return new dx.i.Right(i.this.keyFactory.generatePrivate(this.f46776g));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i.Right<PrivateKey>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i.this.new c(this.f46776g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f46778e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46780g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46778e = obj;
            this.f46780g |= PKIFailureInfo.systemUnavail;
            return i.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Ljava/security/PublicKey;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super dx.i.Right<PublicKey>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46781e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ EncodedKeySpec f46783g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EncodedKeySpec encodedKeySpec, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f46783g = encodedKeySpec;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46781e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return new dx.i.Right(i.this.keyFactory.generatePublic(this.f46783g));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i.Right<PublicKey>> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i.this.new e(this.f46783g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46787g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46788h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f46789j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f46790k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46791l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f46792m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46793n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f46794p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f46795q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f46797s;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46795q = obj;
            this.f46797s |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46802h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46803j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f46804k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46805l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f46806m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46807n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f46808p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f46810r;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46808p = obj;
            this.f46810r |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    public i(h0 h0Var, c0 c0Var, iy.a aVar, xw.d dVar) {
        this.securityExceptionParser = c0Var;
        this.base64Coder = aVar;
        this.dispatcherProvider = dVar;
        Provider providerB = h0Var.b();
        this.provider = providerB;
        this.keyFactory = KeyFactory.getInstance("RSA", providerB);
    }

    private final String g(String pem) {
        int iR0 = r.r0(pem, "-----BEGIN PUBLIC KEY-----", 0, false, 6, null);
        return new o("\\s+").h(pem.substring(iR0 + 26, r.r0(pem, "-----END PUBLIC KEY-----", 0, false, 6, null)), "");
    }

    private final dx.i.Left<? extends dx.b> h(Exception e15) {
        dx.i<Exception, dx.b> iVarA = this.securityExceptionParser.a(e15);
        if (iVarA instanceof dx.i.Left) {
            return new dx.i.Left<>(new dx.b.Generic(e15));
        }
        if (iVarA instanceof dx.i.Right) {
            return new dx.i.Left<>(((dx.i.Right) iVarA).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [e10.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // py.m
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends PublicKey>> eVar) throws Throwable {
        g gVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f46810r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f46810r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f46808p;
        Object objE = uq.b.e();
        int i16 = gVar.f46810r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, str, null, 2, null));
                        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
                        gVar.f46798d = vq.j.a(str);
                        gVar.f46799e = jVarA;
                        gVar.f46800f = vq.j.a(aVar);
                        gVar.f46801g = vq.j.a(aVar);
                        gVar.f46802h = vq.j.a(bArr);
                        gVar.f46803j = 0;
                        gVar.f46804k = 0;
                        gVar.f46805l = 0;
                        gVar.f46806m = 0;
                        gVar.f46807n = 0;
                        gVar.f46810r = 1;
                        Object objF = f(x509EncodedKeySpec, gVar);
                        return objF == objE ? objE : objF;
                    } catch (ex.c e16) {
                        e15 = e16;
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
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
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        return obj;
                    } catch (ex.c e19) {
                        e15 = e19;
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Left((dx.b) ex.d.a(e15));
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    @Override // py.m
    public Object b(byte[] bArr, tq.e<? super dx.i<? extends dx.b, ? extends PrivateKey>> eVar) {
        return e(new PKCS8EncodedKeySpec(bArr), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [e10.i] */
    @Override // py.m
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, ? extends PublicKey>> eVar) throws Throwable {
        f fVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f46797s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f46797s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f46795q;
        Object objE = uq.b.e();
        int i16 = fVar.f46797s;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        String strG = g(str);
                        byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, strG, null, 2, null));
                        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
                        fVar.f46784d = vq.j.a(str);
                        fVar.f46785e = jVarA;
                        fVar.f46786f = vq.j.a(aVar);
                        fVar.f46787g = vq.j.a(aVar);
                        fVar.f46788h = vq.j.a(strG);
                        fVar.f46789j = vq.j.a(bArr);
                        fVar.f46790k = 0;
                        fVar.f46791l = 0;
                        fVar.f46792m = 0;
                        fVar.f46793n = 0;
                        fVar.f46794p = 0;
                        fVar.f46797s = 1;
                        Object objF = f(x509EncodedKeySpec, fVar);
                        return objF == objE ? objE : objF;
                    } catch (ex.c e16) {
                        e15 = e16;
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
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
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        return obj;
                    } catch (ex.c e19) {
                        e15 = e19;
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Left((dx.b) ex.d.a(e15));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(EncodedKeySpec encodedKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends PrivateKey>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f46773g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f46773g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f46771e;
        Object objE = uq.b.e();
        int i16 = bVar.f46773g;
        try {
            if (i16 == 0) {
                u.b(objD);
                xw.d dVar = this.dispatcherProvider;
                c cVar = new c(encodedKeySpec, null);
                bVar.f46770d = vq.j.a(encodedKeySpec);
                bVar.f46773g = 1;
                objD = dVar.d(cVar, bVar);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objD);
            }
            return (dx.i) objD;
        } catch (NoSuchAlgorithmException e15) {
            return h(e15);
        } catch (InvalidKeySpecException e16) {
            return h(e16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(EncodedKeySpec encodedKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends PublicKey>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f46780g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f46780g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objD = dVar.f46778e;
        Object objE = uq.b.e();
        int i16 = dVar.f46780g;
        try {
            if (i16 == 0) {
                u.b(objD);
                xw.d dVar2 = this.dispatcherProvider;
                e eVar2 = new e(encodedKeySpec, null);
                dVar.f46777d = vq.j.a(encodedKeySpec);
                dVar.f46780g = 1;
                objD = dVar2.d(eVar2, dVar);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objD);
            }
            return (dx.i) objD;
        } catch (NoSuchAlgorithmException e15) {
            return h(e15);
        } catch (InvalidKeySpecException e16) {
            return h(e16);
        }
    }
}
