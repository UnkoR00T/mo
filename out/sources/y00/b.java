package y00;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import ju.g1;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly00/b;", "Liy/v;", "Liy/t;", "keyStoreProvider", "Liy/i0;", "x509CertificateDecoder", "<init>", "(Liy/t;Liy/i0;)V", "Liy/a0;", "pkcs12", "Liy/b0;", "oldPassword", "newPassword", "Ldx/i;", "Ldx/b;", "b", "(Liy/a0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "alias", "password", "Lry/c;", "a", "(Ljava/lang/String;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Liy/t;", "Liy/i0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements iy.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.i0 x509CertificateDecoder;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Liy/a0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b, ? extends iy.a0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222628e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.a0 f222630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f222631h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ iy.b0 f222632j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(iy.a0 a0Var, iy.b0 b0Var, iy.b0 b0Var2, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f222630g = a0Var;
            this.f222631h = b0Var;
            this.f222632j = b0Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i.Left left;
            uq.b.e();
            if (this.f222628e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<dx.b, KeyStore> iVarB = b.this.keyStoreProvider.b(iy.f0.BC_PKCS12_STORE, new ByteArrayInputStream(this.f222630g.getData()), this.f222631h.getData());
            iy.b0 b0Var = this.f222632j;
            if (iVarB instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVarB).b());
            }
            if (!(iVarB instanceof dx.i.Right)) {
                throw new oq.p();
            }
            KeyStore keyStore = (KeyStore) ((dx.i.Right) iVarB).b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                keyStore.store(byteArrayOutputStream, b0Var.getData());
                return new dx.i.Right(new iy.a0(byteArrayOutputStream.toByteArray()));
            } catch (IOException e15) {
                left = new dx.i.Left(new dx.b.Generic(e15));
                return left;
            } catch (KeyStoreException e16) {
                left = new dx.i.Left(new dx.b.Generic(e16));
                return left;
            } catch (NoSuchAlgorithmException e17) {
                left = new dx.i.Left(new dx.b.Generic(e17));
                return left;
            } catch (CertificateException e18) {
                left = new dx.i.Left(new dx.b.Generic(e18));
                return left;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super dx.i<? extends dx.b, iy.a0>> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new a(this.f222630g, this.f222631h, this.f222632j, eVar);
        }
    }

    /* JADX INFO: renamed from: y00.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lry/c;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C5954b extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b, ? extends CertKeyPair>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222633e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.a0 f222635g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f222636h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f222637j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5954b(iy.a0 a0Var, iy.b0 b0Var, String str, tq.e<? super C5954b> eVar) {
            super(2, eVar);
            this.f222635g = a0Var;
            this.f222636h = b0Var;
            this.f222637j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f222633e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b bVar = b.this;
            iy.a0 a0Var = this.f222635g;
            iy.b0 b0Var = this.f222636h;
            String str = this.f222637j;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        KeyStore keyStore = (KeyStore) aVar.a(bVar.keyStoreProvider.b(iy.f0.BC_PKCS12_STORE, new ByteArrayInputStream(a0Var.getData()), b0Var.getData()));
                        return new dx.i.Right(new CertKeyPair((X509Certificate) aVar.a(bVar.x509CertificateDecoder.decode(keyStore.getCertificate(str).getEncoded())), (PrivateKey) keyStore.getKey(str, b0Var.getData())));
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
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            return ((C5954b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new C5954b(this.f222635g, this.f222636h, this.f222637j, eVar);
        }
    }

    public b(iy.t tVar, iy.i0 i0Var) {
        this.keyStoreProvider = tVar;
        this.x509CertificateDecoder = i0Var;
    }

    @Override // iy.v
    public Object a(String str, iy.a0 a0Var, iy.b0 b0Var, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
        return ju.i.g(g1.b(), new C5954b(a0Var, b0Var, str, null), eVar);
    }

    @Override // iy.v
    public Object b(iy.a0 a0Var, iy.b0 b0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, iy.a0>> eVar) {
        return ju.i.g(g1.b(), new a(a0Var, b0Var, b0Var2, null), eVar);
    }
}
