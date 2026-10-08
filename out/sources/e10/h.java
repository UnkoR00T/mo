package e10;

import er.p;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u001c\u0010'\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&¨\u0006)"}, d2 = {"Le10/h;", "Lpy/e;", "Ly00/h0;", "securityProviderFactory", "Ly00/c0;", "securityExceptionParser", "Liy/a;", "base64Coder", "Lxw/d;", "dispatcherProvider", "<init>", "(Ly00/h0;Ly00/c0;Liy/a;Lxw/d;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i$b;", "Ldx/b;", "d", "(Ljava/lang/Exception;)Ldx/i$b;", "Ljava/security/spec/EncodedKeySpec;", "encodedKeySpec", "Ldx/i;", "Ljava/security/PublicKey;", "c", "(Ljava/security/spec/EncodedKeySpec;Ltq/e;)Ljava/lang/Object;", "", "x509", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ly00/c0;", "b", "Liy/a;", "Lxw/d;", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "Ljava/security/KeyFactory;", "kotlin.jvm.PlatformType", "Ljava/security/KeyFactory;", "keyFactory", "f", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements py.e {

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
        Object f46744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f46745e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46747g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46745e = obj;
            this.f46747g |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Ljava/security/PublicKey;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super dx.i.Right<PublicKey>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46748e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ EncodedKeySpec f46750g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EncodedKeySpec encodedKeySpec, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f46750g = encodedKeySpec;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46748e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return new dx.i.Right(h.this.keyFactory.generatePublic(this.f46750g));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i.Right<PublicKey>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return h.this.new c(this.f46750g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46755h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46756j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f46757k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46758l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f46759m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46760n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f46761p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f46763r;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46761p = obj;
            this.f46763r |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    public h(h0 h0Var, c0 c0Var, iy.a aVar, xw.d dVar) {
        this.securityExceptionParser = c0Var;
        this.base64Coder = aVar;
        this.dispatcherProvider = dVar;
        Provider providerB = h0Var.b();
        this.provider = providerB;
        this.keyFactory = KeyFactory.getInstance("EC", providerB);
    }

    private final dx.i.Left<? extends dx.b> d(Exception e15) {
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
    /* JADX WARN: Type inference failed for: r8v0, types: [e10.h] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // py.e
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends PublicKey>> eVar) throws Throwable {
        d dVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f46763r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f46763r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f46761p;
        Object objE = uq.b.e();
        int i16 = dVar.f46763r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, str, null, 2, null));
                        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
                        dVar.f46751d = vq.j.a(str);
                        dVar.f46752e = jVarA;
                        dVar.f46753f = vq.j.a(aVar);
                        dVar.f46754g = vq.j.a(aVar);
                        dVar.f46755h = vq.j.a(bArr);
                        dVar.f46756j = 0;
                        dVar.f46757k = 0;
                        dVar.f46758l = 0;
                        dVar.f46759m = 0;
                        dVar.f46760n = 0;
                        dVar.f46763r = 1;
                        Object objC = c(x509EncodedKeySpec, dVar);
                        return objC == objE ? objE : objC;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(EncodedKeySpec encodedKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends PublicKey>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f46747g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f46747g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f46745e;
        Object objE = uq.b.e();
        int i16 = bVar.f46747g;
        try {
            if (i16 == 0) {
                u.b(objD);
                xw.d dVar = this.dispatcherProvider;
                c cVar = new c(encodedKeySpec, null);
                bVar.f46744d = vq.j.a(encodedKeySpec);
                bVar.f46747g = 1;
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
            return d(e15);
        } catch (InvalidKeySpecException e16) {
            return d(e16);
        }
    }
}
