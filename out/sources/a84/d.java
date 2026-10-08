package a84;

import dx.i;
import dx.j;
import fr.t;
import iy.r;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.crypto.spec.SecretKeySpec;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s74.DecryptedMessage;
import y00.h0;
import y74.NotificationRegistrationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"La84/d;", "", "La84/d$a;", "Ls74/a;", "Lz74/a;", "notificationLocalRepository", "Ly00/h0;", "securityProviderFactory", "Liy/g;", "cipherAes", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Ly74/b;", "pushParser", "<init>", "(Lz74/a;Ly00/h0;Liy/g;Lpy/a;Liy/a;Ly74/b;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(La84/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lz74/a;", "b", "Ly00/h0;", "c", "Liy/g;", "Lpy/a;", "e", "Liy/a;", "f", "Ly74/b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z74.a notificationLocalRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y74.b pushParser;

    /* JADX INFO: renamed from: a84.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"La84/d$a;", "Lgz/b$a;", "", "", "messageData", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> messageData;

        public Params(Map<String, String> map) {
            this.messageData = map;
        }

        public final Map<String, String> a() {
            return this.messageData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.messageData, ((Params) other).messageData);
        }

        public int hashCode() {
            return this.messageData.hashCode();
        }

        public String toString() {
            return "Params(messageData=" + this.messageData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f4911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f4912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f4913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f4914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f4915h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f4916j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f4917k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f4918l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f4919m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4920n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f4921p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4922q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4923r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f4924s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4925t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f4926v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f4928x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4926v = obj;
            this.f4928x |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    public d(z74.a aVar, h0 h0Var, iy.g gVar, py.a aVar2, iy.a aVar3, y74.b bVar) {
        this.notificationLocalRepository = aVar;
        this.securityProviderFactory = h0Var;
        this.cipherAes = gVar;
        this.aesKeyDecoder = aVar2;
        this.base64Coder = aVar3;
        this.pushParser = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x021b  */
    /* JADX WARN: Code duplicated, block: B:74:0x022c  */
    /* JADX WARN: Code duplicated, block: B:75:0x023a  */
    /* JADX WARN: Code duplicated, block: B:77:0x023e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x024b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, DecryptedMessage>> eVar) {
        b bVar;
        String message;
        i iVarA;
        Object objB;
        int i15;
        int i16;
        int i17;
        Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        ex.b bVar4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f4928x;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f4928x = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f4926v;
        Object objE = uq.b.e();
        ?? r15 = bVar.f4928x;
        try {
            try {
                try {
                    if (r15 != 0) {
                        if (r15 == 1) {
                            int i26 = bVar.f4925t;
                            int i27 = bVar.f4924s;
                            int i28 = bVar.f4923r;
                            int i29 = bVar.f4922q;
                            int i35 = bVar.f4921p;
                            bVar2 = (ex.b) bVar.f4914g;
                            ex.b bVar5 = (ex.b) bVar.f4913f;
                            j jVar = (j) bVar.f4912e;
                            params2 = (Params) bVar.f4911d;
                            try {
                                u.b(objC);
                                i15 = i26;
                                r15 = jVar;
                                bVar3 = bVar5;
                                i19 = i35;
                                i17 = i29;
                                i16 = i28;
                                i18 = i27;
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
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
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar4 = (ex.b) bVar.f4920n;
                            j jVar2 = (j) bVar.f4912e;
                            u.b(objC);
                            r15 = jVar2;
                        }
                        return new i.Right(this.pushParser.a(new String((byte[]) bVar4.a((i) objC), fu.d.UTF_8)));
                    }
                    u.b(objC);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    z74.a aVar2 = this.notificationLocalRepository;
                    bVar.f4911d = params;
                    bVar.f4912e = jVarA;
                    bVar.f4913f = vq.j.a(aVar);
                    bVar.f4914g = aVar;
                    bVar.f4921p = 0;
                    bVar.f4922q = 0;
                    bVar.f4923r = 0;
                    bVar.f4924s = 0;
                    bVar.f4925t = 0;
                    bVar.f4928x = 1;
                    objC = aVar2.c(bVar);
                    if (objC == objE) {
                        return objE;
                    }
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                    params2 = params;
                    bVar2 = aVar;
                    bVar3 = bVar2;
                    i18 = 0;
                    i19 = 0;
                    r15 = jVarA;
                    String encryptingKey = ((NotificationRegistrationData) objC).getEncryptingKey();
                    if (encryptingKey == null) {
                        return new i.Left(new dx.b.Generic(new Exception("Lack of stored decryption key.")));
                    }
                    String str = params2.a().get("encryptedData");
                    if (str == null) {
                        return new i.Left(new dx.b.Generic(new Exception("Lack of encryptedData.")));
                    }
                    String str2 = params2.a().get("encryptedDataInitialVector");
                    if (str2 == null) {
                        return new i.Left(new dx.b.Generic(new Exception("Lack of encryptedInitialVector.")));
                    }
                    ex.b bVar6 = bVar3;
                    Params params3 = params2;
                    SecretKeySpec secretKeySpec = (SecretKeySpec) bVar2.a(this.aesKeyDecoder.a((byte[]) bVar2.a(iy.a.c(this.base64Coder, encryptingKey, null, 2, null))));
                    String name = this.securityProviderFactory.b().getName();
                    this.cipherAes.a(name);
                    iy.g gVar = this.cipherAes;
                    byte[] bArr = (byte[]) bVar2.a(iy.a.c(this.base64Coder, str, null, 2, null));
                    try {
                        iy.h.a.C2298a c2298a = new iy.h.a.C2298a(new r.b((byte[]) bVar2.a(iy.a.c(this.base64Coder, str2, null, 2, null))), 0);
                        bVar.f4911d = vq.j.a(params3);
                        bVar.f4912e = r15;
                        bVar.f4913f = vq.j.a(bVar6);
                        bVar.f4914g = vq.j.a(bVar2);
                        bVar.f4915h = vq.j.a(str);
                        bVar.f4916j = vq.j.a(encryptingKey);
                        bVar.f4917k = vq.j.a(str2);
                        bVar.f4918l = vq.j.a(secretKeySpec);
                        bVar.f4919m = vq.j.a(name);
                        bVar.f4920n = bVar2;
                        bVar.f4921p = i19;
                        bVar.f4922q = i17;
                        bVar.f4923r = i16;
                        bVar.f4924s = i18;
                        bVar.f4925t = i15;
                        bVar.f4928x = 2;
                        objC = gVar.d(bArr, secretKeySpec, c2298a, bVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar4 = bVar2;
                        r15 = r15;
                        return new i.Right(this.pushParser.a(new String((byte[]) bVar4.a((i) objC), fu.d.UTF_8)));
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
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
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
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
