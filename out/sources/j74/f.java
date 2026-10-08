package j74;

import dx.i;
import dx.j;
import er.p;
import fr.t;
import iy.b0;
import iy.c0;
import java.security.PrivateKey;
import java.util.concurrent.CancellationException;
import ju.p0;
import ky.JweHeader;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSSignerData;
import ny.JWSETokenPair;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import ry.EC;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lj74/f;", "", "Lj74/f$a;", "Lny/b;", "Lxw/d;", "dispatcherProvider", "Lly/a;", "jwsSigner", "Ljy/a;", "jweEncrypterStrategy", "Liy/a;", "base64Coder", "<init>", "(Lxw/d;Lly/a;Ljy/a;Liy/a;)V", "params", "Ldx/i;", "Ldx/b;", "g", "(Lj74/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lxw/d;", "b", "Lly/a;", "c", "Ljy/a;", "d", "Liy/a;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ly.a jwsSigner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jy.a jweEncrypterStrategy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: j74.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lj74/f$a;", "Lgz/b$a;", "Lmy/a;", "headerData", "Lmy/c;", "payloadData", "Liy/b0;", "encryptionKeyId", "encryptionKey", "Ljava/security/PrivateKey;", "privateKey", "<init>", "(Lmy/a;Lmy/c;Liy/b0;Liy/b0;Ljava/security/PrivateKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmy/a;", "c", "()Lmy/a;", "b", "Lmy/c;", "d", "()Lmy/c;", "Liy/b0;", "()Liy/b0;", "e", "Ljava/security/PrivateKey;", "f", "()Ljava/security/PrivateKey;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final JWSHeaderData headerData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final JWSPayloadData payloadData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 encryptionKeyId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 encryptionKey;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrivateKey privateKey;

        public Params(JWSHeaderData jWSHeaderData, JWSPayloadData jWSPayloadData, b0 b0Var, b0 b0Var2, PrivateKey privateKey) {
            this.headerData = jWSHeaderData;
            this.payloadData = jWSPayloadData;
            this.encryptionKeyId = b0Var;
            this.encryptionKey = b0Var2;
            this.privateKey = privateKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getEncryptionKey() {
            return this.encryptionKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final JWSHeaderData getHeaderData() {
            return this.headerData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final JWSPayloadData getPayloadData() {
            return this.payloadData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.headerData, params.headerData) && t.c(this.payloadData, params.payloadData) && t.c(this.encryptionKeyId, params.encryptionKeyId) && t.c(this.encryptionKey, params.encryptionKey) && t.c(this.privateKey, params.privateKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final PrivateKey getPrivateKey() {
            return this.privateKey;
        }

        public int hashCode() {
            return (((((((this.headerData.hashCode() * 31) + this.payloadData.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.encryptionKey.hashCode()) * 31) + this.privateKey.hashCode();
        }

        public String toString() {
            return "Params(headerData=" + this.headerData + ", payloadData=" + this.payloadData + ", encryptionKeyId=" + this.encryptionKeyId + ", encryptionKey=" + this.encryptionKey + ", privateKey=" + this.privateKey + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lny/b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, tq.e<? super i<? extends dx.b, ? extends JWSETokenPair>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f99982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f99983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f99984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f99985h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f99986j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f99987k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f99988l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f99989m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f99990n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f99991p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f99992q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99993r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Params f99995t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f99995t = params;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x013b  */
        /* JADX WARN: Code duplicated, block: B:44:0x014c  */
        /* JADX WARN: Code duplicated, block: B:45:0x015a  */
        /* JADX WARN: Code duplicated, block: B:47:0x015e  */
        /* JADX WARN: Code duplicated, block: B:50:0x016a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            i iVarA;
            Object objB;
            Object objA;
            ex.b bVar;
            f fVar;
            Params params;
            j<dx.b> jVar;
            ex.b bVar2;
            Object objE = uq.b.e();
            int i15 = this.f99993r;
            ?? r15 = 1;
            try {
                try {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) this.f99987k;
                        bVar2 = (ex.b) this.f99986j;
                        j<dx.b> jVar2 = (j) this.f99984g;
                        Params params2 = (Params) this.f99983f;
                        f fVar2 = (f) this.f99982e;
                        try {
                            u.b(obj);
                            fVar = fVar2;
                            params = params2;
                            jVar = jVar2;
                            objA = obj;
                            try {
                                b0 b0VarA = my.e.a(c0.g((String) bVar.a((i) objA)));
                                return new i.Right(new JWSETokenPair(b0VarA, ny.a.b(c0.g((String) bVar2.a(fVar.jweEncrypterStrategy.a(new EC((byte[]) bVar2.a(iy.a.c(fVar.base64Coder, c0.e(params.getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params.getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(b0VarA)))))), null));
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        } catch (ex.c e18) {
                            e = e18;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    u.b(obj);
                    f fVar4 = f.this;
                    Params params3 = this.f99995t;
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ly.a aVar2 = fVar4.jwsSigner;
                        JWSHeaderData headerData = params3.getHeaderData();
                        JWSPayloadData payloadData = params3.getPayloadData();
                        JWSSignerData jWSSignerData = new JWSSignerData(params3.getPrivateKey(), params3.getHeaderData().getAlgorithm());
                        this.f99982e = fVar4;
                        this.f99983f = params3;
                        this.f99984g = jVarA;
                        this.f99985h = vq.j.a(aVar);
                        this.f99986j = aVar;
                        this.f99987k = aVar;
                        this.f99988l = 0;
                        this.f99989m = 0;
                        this.f99990n = 0;
                        this.f99991p = 0;
                        this.f99992q = 0;
                        this.f99993r = 1;
                        objA = aVar2.a(headerData, payloadData, jWSSignerData, this);
                        if (objA == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        fVar = fVar4;
                        params = params3;
                        jVar = jVarA;
                        bVar2 = bVar;
                        b0 b0VarA2 = my.e.a(c0.g((String) bVar.a((i) objA)));
                        return new i.Right(new JWSETokenPair(b0VarA2, ny.a.b(c0.g((String) bVar2.a(fVar.jweEncrypterStrategy.a(new EC((byte[]) bVar2.a(iy.a.c(fVar.base64Coder, c0.e(params.getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params.getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(b0VarA2)))))), null));
                    } catch (ex.c e25) {
                        e = e25;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e26) {
                        throw e26;
                    } catch (Exception e27) {
                        e = e27;
                        r15 = jVarA;
                        px.f fVar5 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar5.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, JWSETokenPair>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new b(this.f99995t, eVar);
        }
    }

    public f(xw.d dVar, ly.a aVar, jy.a aVar2, iy.a aVar3) {
        this.dispatcherProvider = dVar;
        this.jwsSigner = aVar;
        this.jweEncrypterStrategy = aVar2;
        this.base64Coder = aVar3;
    }

    public Object g(Params params, tq.e<? super i<? extends dx.b, JWSETokenPair>> eVar) {
        return this.dispatcherProvider.d(new b(params, null), eVar);
    }
}
