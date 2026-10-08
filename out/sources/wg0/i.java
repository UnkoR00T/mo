package wg0;

import fr.q0;
import iy.c0;
import iy.f0;
import iy.r;
import iy.t;
import java.security.Key;
import java.security.KeyStore;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pg0.DecryptedUserKeyData;
import pg0.EncryptedUserKeyData;
import pg0.KeyParamsData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwg0/i;", "", "Lgz/b$a$a;", "Lpg0/a;", "Liy/g;", "cipherAes", "Lvg0/a;", "userRepository", "Lay/j;", "jsonSerializer", "Liy/t;", "keyStoreProvider", "<init>", "(Liy/g;Lvg0/a;Lay/j;Liy/t;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Liy/g;", "b", "Lvg0/a;", "c", "Lay/j;", "d", "Liy/t;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vg0.a userRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213141h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213142j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213143k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213144l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213145m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213146n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213147p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213148q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213149r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f213150s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f213152v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213150s = obj;
            this.f213152v |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    public i(iy.g gVar, vg0.a aVar, ay.j jVar, t tVar) {
        this.cipherAes = gVar;
        this.userRepository = aVar;
        this.jsonSerializer = jVar;
        this.keyStoreProvider = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c7 A[Catch: Exception -> 0x0206, c -> 0x020a, CancellationException -> 0x020e, TryCatch #6 {c -> 0x020a, CancellationException -> 0x020e, Exception -> 0x0206, blocks: (B:58:0x01be, B:61:0x01c7, B:63:0x01cb, B:54:0x0173), top: B:101:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01cb A[Catch: Exception -> 0x0206, c -> 0x020a, CancellationException -> 0x020e, TRY_LEAVE, TryCatch #6 {c -> 0x020a, CancellationException -> 0x020e, Exception -> 0x0206, blocks: (B:58:0x01be, B:61:0x01c7, B:63:0x01cb, B:54:0x0173), top: B:101:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0212 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #9 {Exception -> 0x0051, blocks: (B:13:0x004c, B:66:0x01f0, B:67:0x01ff, B:65:0x01d5, B:74:0x0212, B:75:0x0219, B:80:0x0235, B:83:0x0244, B:52:0x0152, B:33:0x00ad, B:36:0x00c4, B:46:0x00f6, B:48:0x00fe, B:76:0x021a, B:77:0x022e, B:39:0x00d5, B:41:0x00d9, B:43:0x00ec, B:45:0x00f0, B:78:0x022f, B:79:0x0234), top: B:98:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x024d  */
    /* JADX WARN: Code duplicated, block: B:89:0x025e  */
    /* JADX WARN: Code duplicated, block: B:90:0x026c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0270  */
    /* JADX WARN: Code duplicated, block: B:95:0x027c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, DecryptedUserKeyData>> eVar) {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        EncryptedUserKeyData encryptedUserKeyData;
        gz.b.a.C1792a c1792a2;
        SecretKey secretKey;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        DecryptedUserKeyData decryptedUserKeyData;
        byte[] bArr;
        iy.g gVar;
        gz.b.a.C1792a c1792a3;
        byte[] data;
        ex.b bVar3;
        EncryptedUserKeyData encryptedUserKeyData2;
        byte[] bArr2;
        SecretKey secretKey2;
        dx.i right;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f213152v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f213152v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f213150s;
        Object objE = uq.b.e();
        int i26 = aVar.f213152v;
        ?? r15 = 1;
        try {
            try {
                try {
                    try {
                        if (i26 == 0) {
                            u.b(obj);
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            aVar2 = new ex.a();
                            encryptedUserKeyData = (EncryptedUserKeyData) aVar2.a(this.userRepository.e());
                            if (encryptedUserKeyData == null) {
                                decryptedUserKeyData = null;
                            } else {
                                dx.i iVarA2 = t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null);
                                if (!(iVarA2 instanceof dx.i.Left)) {
                                    if (!(iVarA2 instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    Key key = ((KeyStore) ((dx.i.Right) iVarA2).b()).getKey("mjKeyAlias", null);
                                    iVarA2 = new dx.i.Right(key instanceof SecretKey ? (SecretKey) key : null);
                                }
                                SecretKey secretKey3 = (SecretKey) aVar2.a(iVarA2);
                                if (secretKey3 == null) {
                                    aVar2.b(new dx.b.Generic(new NullPointerException("LoadAndDecryptUserKeyDataUC: deviceKey is null")));
                                    throw new oq.g();
                                }
                                iy.g gVar2 = this.cipherAes;
                                byte[] data2 = encryptedUserKeyData.getEncryptedMasterKey().getData();
                                iy.h.a.b bVar4 = new iy.h.a.b(0, new r.a(0, 1, null), 16, 1, null);
                                aVar.f213137d = vq.j.a(c1792a);
                                aVar.f213138e = jVarA;
                                aVar.f213139f = vq.j.a(aVar2);
                                aVar.f213140g = aVar2;
                                aVar.f213141h = secretKey3;
                                aVar.f213142j = encryptedUserKeyData;
                                aVar.f213143k = aVar2;
                                aVar.f213145m = 0;
                                aVar.f213146n = 0;
                                aVar.f213147p = 0;
                                aVar.f213148q = 0;
                                aVar.f213149r = 0;
                                aVar.f213152v = 1;
                                Object objD = gVar2.d(data2, secretKey3, bVar4, aVar);
                                if (objD == objE) {
                                    return objE;
                                }
                                c1792a2 = c1792a;
                                secretKey = secretKey3;
                                obj = objD;
                                bVar = aVar2;
                                bVar2 = bVar;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                r15 = jVarA;
                            }
                            return new dx.i.Right(decryptedUserKeyData);
                        }
                        if (i26 == 1) {
                            int i27 = aVar.f213149r;
                            i16 = aVar.f213148q;
                            i17 = aVar.f213147p;
                            i18 = aVar.f213146n;
                            i19 = aVar.f213145m;
                            ex.b bVar5 = (ex.b) aVar.f213143k;
                            encryptedUserKeyData = (EncryptedUserKeyData) aVar.f213142j;
                            secretKey = (SecretKey) aVar.f213141h;
                            ex.b bVar6 = (ex.b) aVar.f213140g;
                            ex.b bVar7 = (ex.b) aVar.f213139f;
                            dx.j jVar = (dx.j) aVar.f213138e;
                            c1792a2 = (gz.b.a.C1792a) aVar.f213137d;
                            try {
                                u.b(obj);
                                i15 = i27;
                                bVar = bVar6;
                                aVar2 = bVar7;
                                r15 = jVar;
                                bVar2 = bVar5;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            if (i26 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bArr2 = (byte[]) aVar.f213144l;
                            bVar = (ex.b) aVar.f213143k;
                            secretKey2 = (SecretKey) aVar.f213141h;
                            dx.j jVar2 = (dx.j) aVar.f213138e;
                            u.b(obj);
                            r15 = jVar2;
                        }
                        right = (dx.i) obj;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new p();
                            }
                            right = new dx.i.Right((KeyParamsData) this.jsonSerializer.a(new String((byte[]) ((dx.i.Right) right).b(), fu.d.UTF_8), q0.n(KeyParamsData.class)));
                        }
                        decryptedUserKeyData = new DecryptedUserKeyData(c0.f(bArr2), (KeyParamsData) bVar.a(right), secretKey2);
                        return new dx.i.Right(decryptedUserKeyData);
                        iy.h.a.b bVar8 = new iy.h.a.b(0, new r.a(0, 1, null), 16, 1, null);
                        aVar.f213137d = vq.j.a(c1792a3);
                        aVar.f213138e = r15;
                        aVar.f213139f = vq.j.a(bVar3);
                        aVar.f213140g = vq.j.a(bVar);
                        aVar.f213141h = secretKey;
                        aVar.f213142j = vq.j.a(encryptedUserKeyData2);
                        aVar.f213143k = bVar;
                        aVar.f213144l = bArr;
                        aVar.f213145m = i19;
                        aVar.f213146n = i18;
                        aVar.f213147p = i17;
                        aVar.f213148q = i16;
                        aVar.f213149r = i15;
                        aVar.f213152v = 2;
                        Object objD2 = gVar.d(data, secretKey, bVar8, aVar);
                        if (objD2 == objE) {
                            return objE;
                        }
                        bArr2 = bArr;
                        obj = objD2;
                        secretKey2 = secretKey;
                        r15 = r15;
                        right = (dx.i) obj;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new p();
                            }
                            right = new dx.i.Right((KeyParamsData) this.jsonSerializer.a(new String((byte[]) ((dx.i.Right) right).b(), fu.d.UTF_8), q0.n(KeyParamsData.class)));
                        }
                        decryptedUserKeyData = new DecryptedUserKeyData(c0.f(bArr2), (KeyParamsData) bVar.a(right), secretKey2);
                        return new dx.i.Right(decryptedUserKeyData);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                    bArr = (byte[]) bVar2.a((dx.i) obj);
                    gVar = this.cipherAes;
                    c1792a3 = c1792a2;
                    data = encryptedUserKeyData.getKeyParams().getData();
                    bVar3 = aVar2;
                    encryptedUserKeyData2 = encryptedUserKeyData;
                } catch (CancellationException e26) {
                    throw e26;
                }
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
