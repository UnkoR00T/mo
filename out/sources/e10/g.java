package e10;

import er.p;
import java.security.Provider;
import java.util.concurrent.CancellationException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;
import p071kotlin.Metadata;
import y00.c0;
import y00.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Le10/g;", "Lpy/b;", "Ly00/h0;", "securityProviderFactory", "Ly00/c0;", "securityExceptionParser", "Lxw/d;", "dispatcherProvider", "<init>", "(Ly00/h0;Ly00/c0;Lxw/d;)V", "Lpy/c;", "spec", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "a", "(Lpy/c;Ltq/e;)Ljava/lang/Object;", "Ly00/c0;", "b", "Lxw/d;", "Ljava/security/Provider;", "c", "Ljava/security/Provider;", "provider", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements py.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Provider provider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46735e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ py.c f46737g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(py.c cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f46737g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            SecretKey secretKeyGenerateKey;
            uq.b.e();
            if (this.f46735e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c0 c0Var = g.this.securityExceptionParser;
            py.c cVar = this.f46737g;
            g gVar = g.this;
            try {
                try {
                    try {
                        new ex.a();
                        if (cVar instanceof py.d.PBEKeySpec) {
                            secretKeyGenerateKey = SecretKeyFactory.getInstance(((py.d.PBEKeySpec) cVar).getAlgorithm(), gVar.provider).generateSecret(new PBEKeySpec(((py.d.PBEKeySpec) cVar).getPassword().getData(), ((py.d.PBEKeySpec) cVar).getSalt().getData(), ((py.d.PBEKeySpec) cVar).getIterationCount(), ((py.d.PBEKeySpec) cVar).getKeyLength()));
                        } else if (cVar instanceof py.d.a) {
                            Argon2BytesGenerator argon2BytesGenerator = new Argon2BytesGenerator();
                            argon2BytesGenerator.init(new Argon2Parameters.Builder(2).withSalt(((py.d.a) cVar).f().getData()).withParallelism(((py.d.a) cVar).d()).withMemoryAsKB(((py.d.a) cVar).c()).withIterations(((py.d.a) cVar).b()).build());
                            int keyLength = ((py.d.a) cVar).getKeyLength() / 8;
                            byte[] bArr = new byte[keyLength];
                            argon2BytesGenerator.generateBytes(((py.d.a) cVar).e().getData(), bArr, 0, keyLength);
                            secretKeyGenerateKey = new SecretKeySpec(bArr, ((py.d.a) cVar).getAlgorithm());
                        } else {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance(cVar.getAlgorithm());
                            keyGenerator.init(cVar.getKeyLength());
                            secretKeyGenerateKey = keyGenerator.generateKey();
                        }
                        return new dx.i.Right(secretKeyGenerateKey);
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(c0Var));
                        dx.i<Exception, dx.b> iVarA = c0Var.a(e15);
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
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new a(this.f46737g, eVar);
        }
    }

    public g(h0 h0Var, c0 c0Var, xw.d dVar) {
        this.securityExceptionParser = c0Var;
        this.dispatcherProvider = dVar;
        this.provider = h0Var.b();
    }

    @Override // py.b
    public Object a(py.c cVar, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) {
        return this.dispatcherProvider.d(new a(cVar, null), eVar);
    }
}
