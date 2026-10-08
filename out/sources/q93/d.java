package q93;

import dx.i;
import er.l;
import iy.f0;
import iy.h;
import iy.s;
import iy.t;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import px.f;
import py.KeyStoreKeySpec;
import py.g;
import py.k;
import py.o;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lq93/d;", "Lf93/d;", "Lac4/a;", "callActionWithLoaderUseCase", "Lpy/k;", "keyStoreRsaKeyGenerator", "Liy/t;", "keyStoreProvider", "Liy/s;", "keyInspector", "<init>", "(Lac4/a;Lpy/k;Liy/t;Liy/s;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lf93/d$a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lac4/a;", "b", "Lpy/k;", "c", "Liy/t;", "d", "Liy/s;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f93.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k keyStoreRsaKeyGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s keyInspector;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lf93/d$a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements l<e<? super i<? extends dx.b, ? extends f93.d.Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f165410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165411h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f165412j;

        a(e<? super a> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00bf A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:39:0x0102  */
        /* JADX WARN: Code duplicated, block: B:45:0x0159  */
        /* JADX WARN: Code duplicated, block: B:48:0x0162  */
        /* JADX WARN: Code duplicated, block: B:50:0x0168  */
        /* JADX WARN: Code duplicated, block: B:53:0x0170  */
        /* JADX WARN: Code duplicated, block: B:59:0x0105 A[SYNTHETIC] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objA;
            KeyPair keyPair;
            Object objA2;
            i iVar;
            KeyStore keyStore;
            ArrayList arrayList;
            int i15;
            s sVar;
            PrivateKey privateKey;
            KeyPair keyPair2;
            int i16;
            List listN;
            Certificate[] certificateChain;
            ArrayList arrayList2;
            int i17;
            X509Certificate x509Certificate;
            Object objE = uq.b.e();
            int i18 = this.f165412j;
            if (i18 == 0) {
                u.b(obj);
                k kVar = d.this.keyStoreRsaKeyGenerator;
                KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec("test1", h.c.b.f97755b, 0, g.BOTH, v.q(py.h.ENCRYPT_AND_DECRYPT, py.h.SIGN_AND_VERIFY), o.PREFERRED, false, null, 196, null);
                this.f165412j = 1;
                objA = kVar.a(keyStoreKeySpec, this);
                if (objA != objE) {
                }
                return objE;
            }
            if (i18 == 1) {
                u.b(obj);
                objA = obj;
            } else {
                if (i18 == 2) {
                    keyPair = (KeyPair) this.f165408e;
                    u.b(obj);
                    objA2 = obj;
                    iVar = (i) objA2;
                    if (iVar instanceof i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof i.Right) {
                        throw new p();
                    }
                    KeyPair keyPair3 = (KeyPair) ((i.Right) iVar).b();
                    keyStore = (KeyStore) t.a(d.this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null).a();
                    arrayList = null;
                    if (keyStore != null && (certificateChain = keyStore.getCertificateChain("test1")) != null) {
                        arrayList2 = new ArrayList();
                        for (Certificate certificate : certificateChain) {
                            if (certificate instanceof X509Certificate) {
                                x509Certificate = (X509Certificate) certificate;
                            } else {
                                x509Certificate = null;
                            }
                            if (x509Certificate != null) {
                                arrayList2.add(x509Certificate);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    f.f163100a.b("Certificate attestation chain: " + arrayList, px.c.a(d.this));
                    i15 = !Arrays.equals(keyPair.getPublic().getEncoded(), keyPair3.getPublic().getEncoded()) ? 1 : 0;
                    sVar = d.this.keyInspector;
                    privateKey = keyPair.getPrivate();
                    this.f165408e = keyPair;
                    this.f165409f = j.a(keyPair3);
                    this.f165410g = arrayList;
                    this.f165411h = i15;
                    this.f165412j = 3;
                    if (sVar.b(privateKey, true, this) != objE) {
                        keyPair2 = keyPair;
                        i16 = i15;
                        listN = arrayList;
                    }
                    return objE;
                }
                if (i18 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i16 = this.f165411h;
                listN = (List) this.f165410g;
                keyPair2 = (KeyPair) this.f165408e;
                u.b(obj);
            }
            if (listN == null) {
                listN = v.n();
            }
            return new i.Right(new f93.d.Result(keyPair2, listN, i16 != 0));
            i iVar2 = (i) objA;
            if (iVar2 instanceof i.Left) {
                return iVar2;
            }
            if (!(iVar2 instanceof i.Right)) {
                throw new p();
            }
            keyPair = (KeyPair) ((i.Right) iVar2).b();
            k kVar2 = d.this.keyStoreRsaKeyGenerator;
            KeyStoreKeySpec keyStoreKeySpec2 = new KeyStoreKeySpec("test2", h.c.b.f97755b, 0, g.BOTH, v.q(py.h.ENCRYPT_AND_DECRYPT, py.h.SIGN_AND_VERIFY), o.PREFERRED, false, null, 196, null);
            this.f165408e = keyPair;
            this.f165412j = 2;
            objA2 = kVar2.a(keyStoreKeySpec2, this);
            if (objA2 != objE) {
                iVar = (i) objA2;
                if (iVar instanceof i.Left) {
                    return iVar;
                }
                if (iVar instanceof i.Right) {
                    throw new p();
                }
                KeyPair keyPair4 = (KeyPair) ((i.Right) iVar).b();
                keyStore = (KeyStore) t.a(d.this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null).a();
                arrayList = null;
                if (keyStore != null) {
                    arrayList2 = new ArrayList();
                    while (i17 < r10) {
                        if (certificate instanceof X509Certificate) {
                            x509Certificate = (X509Certificate) certificate;
                        } else {
                            x509Certificate = null;
                        }
                        if (x509Certificate != null) {
                            arrayList2.add(x509Certificate);
                        }
                    }
                    arrayList = arrayList2;
                }
                f.f163100a.b("Certificate attestation chain: " + arrayList, px.c.a(d.this));
                i15 = !Arrays.equals(keyPair.getPublic().getEncoded(), keyPair4.getPublic().getEncoded()) ? 1 : 0;
                sVar = d.this.keyInspector;
                privateKey = keyPair.getPrivate();
                this.f165408e = keyPair;
                this.f165409f = j.a(keyPair4);
                this.f165410g = arrayList;
                this.f165411h = i15;
                this.f165412j = 3;
                if (sVar.b(privateKey, true, this) != objE) {
                    keyPair2 = keyPair;
                    i16 = i15;
                    listN = arrayList;
                    if (listN == null) {
                        listN = v.n();
                    }
                    return new i.Right(new f93.d.Result(keyPair2, listN, i16 != 0));
                }
            }
            return objE;
        }

        public final e<i0> M(e<?> eVar) {
            return d.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i<? extends dx.b, f93.d.Result>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public d(ac4.a aVar, k kVar, t tVar, s sVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.keyStoreRsaKeyGenerator = kVar;
        this.keyStoreProvider = tVar;
        this.keyInspector = sVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, f93.d.Result>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }
}
