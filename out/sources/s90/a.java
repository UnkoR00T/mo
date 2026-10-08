package s90;

import a14.k;
import dx.i;
import dx.j;
import fr.t;
import java.security.KeyPair;
import java.util.List;
import java.util.concurrent.CancellationException;
import jx.d;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import z70.AppActivationWithKeysResponse;
import z70.TokenApplicationActivationRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Ls90/a;", "", "Ls90/a$a;", "Ls90/a$b;", "La80/a;", "activateAppUsingChallengeUC", "La14/k;", "generateRsaKeyPairUseCase", "Ljx/d;", "deviceInfo", "Liy/a;", "base64Coder", "<init>", "(La80/a;La14/k;Ljx/d;Liy/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Ls90/a$a;Ltq/e;)Ljava/lang/Object;", "a", "La80/a;", "b", "La14/k;", "c", "Ljx/d;", "Liy/a;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a80.a activateAppUsingChallengeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k generateRsaKeyPairUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d deviceInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: s90.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ls90/a$b;", "", "Lz70/b;", "response", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Lz70/b;Ljava/security/KeyPair;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz70/b;", "b", "()Lz70/b;", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AppActivationWithKeysResponse response;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        public Result(AppActivationWithKeysResponse appActivationWithKeysResponse, KeyPair keyPair) {
            this.response = appActivationWithKeysResponse;
            this.keyPair = keyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AppActivationWithKeysResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.response, result.response) && t.c(this.keyPair, result.keyPair);
        }

        public int hashCode() {
            return (this.response.hashCode() * 31) + this.keyPair.hashCode();
        }

        public String toString() {
            return "Result(response=" + this.response + ", keyPair=" + this.keyPair + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f179378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f179379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f179380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f179381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f179382h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f179383j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f179384k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f179385l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f179386m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f179387n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f179388p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f179389q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f179391s;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f179389q = obj;
            this.f179391s |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(a80.a aVar, k kVar, d dVar, iy.a aVar2) {
        this.activateAppUsingChallengeUC = aVar;
        this.generateRsaKeyPairUseCase = kVar;
        this.deviceInfo = dVar;
        this.base64Coder = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public Object d(Params params, e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        int i15;
        j<dx.b> jVar;
        Params params2;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i19;
        KeyPair keyPair;
        Object objC;
        KeyPair keyPair2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f179391s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f179391s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC2 = cVar.f179389q;
        Object objE = uq.b.e();
        int i26 = cVar.f179391s;
        ?? r15 = 1;
        try {
            try {
                try {
                    if (i26 == 0) {
                        u.b(objC2);
                        j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            k kVar = this.generateRsaKeyPairUseCase;
                            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                            cVar.f179378d = params;
                            cVar.f179379e = jVarA;
                            cVar.f179380f = vq.j.a(aVar);
                            cVar.f179381g = aVar;
                            cVar.f179382h = aVar;
                            i15 = 0;
                            cVar.f179384k = 0;
                            cVar.f179385l = 0;
                            cVar.f179386m = 0;
                            cVar.f179387n = 0;
                            cVar.f179388p = 0;
                            cVar.f179391s = 1;
                            objC2 = kVar.c(c1792a, cVar);
                            if (objC2 == objE) {
                                return objE;
                            }
                            jVar = jVarA;
                            params2 = params;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            i19 = 0;
                            keyPair = (KeyPair) bVar2.a((i) objC2);
                            a80.a aVar2 = this.activateAppUsingChallengeUC;
                            Params params3 = params2;
                            a80.a.Params params4 = new a80.a.Params(new TokenApplicationActivationRequest(params2.getActivationChallenge(), this.deviceInfo.c(), iy.a.e(this.base64Coder, keyPair.getPublic().getEncoded(), null, 2, null), params3.b()));
                            cVar.f179378d = vq.j.a(params3);
                            cVar.f179379e = jVar;
                            cVar.f179380f = vq.j.a(bVar3);
                            cVar.f179381g = vq.j.a(bVar);
                            cVar.f179382h = bVar;
                            cVar.f179383j = keyPair;
                            cVar.f179384k = i18;
                            cVar.f179385l = i19;
                            cVar.f179386m = i17;
                            cVar.f179387n = i16;
                            cVar.f179388p = i15;
                            cVar.f179391s = 2;
                            objC = aVar2.c(params4, cVar);
                            if (objC == objE) {
                                return objE;
                            }
                            keyPair2 = keyPair;
                            objC2 = objC;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            f fVar = f.f163100a;
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
                    } else if (i26 == 1) {
                        int i27 = cVar.f179388p;
                        int i28 = cVar.f179387n;
                        int i29 = cVar.f179386m;
                        int i35 = cVar.f179385l;
                        int i36 = cVar.f179384k;
                        ex.b bVar4 = (ex.b) cVar.f179382h;
                        ex.b bVar5 = (ex.b) cVar.f179381g;
                        ex.b bVar6 = (ex.b) cVar.f179380f;
                        j<dx.b> jVar2 = (j) cVar.f179379e;
                        params2 = (Params) cVar.f179378d;
                        try {
                            u.b(objC2);
                            i15 = i27;
                            bVar = bVar5;
                            i18 = i36;
                            i16 = i28;
                            jVar = jVar2;
                            bVar3 = bVar6;
                            bVar2 = bVar4;
                            i19 = i35;
                            i17 = i29;
                            keyPair = (KeyPair) bVar2.a((i) objC2);
                            a80.a aVar3 = this.activateAppUsingChallengeUC;
                            Params params5 = params2;
                            a80.a.Params params6 = new a80.a.Params(new TokenApplicationActivationRequest(params2.getActivationChallenge(), this.deviceInfo.c(), iy.a.e(this.base64Coder, keyPair.getPublic().getEncoded(), null, 2, null), params5.b()));
                            cVar.f179378d = vq.j.a(params5);
                            cVar.f179379e = jVar;
                            cVar.f179380f = vq.j.a(bVar3);
                            cVar.f179381g = vq.j.a(bVar);
                            cVar.f179382h = bVar;
                            cVar.f179383j = keyPair;
                            cVar.f179384k = i18;
                            cVar.f179385l = i19;
                            cVar.f179386m = i17;
                            cVar.f179387n = i16;
                            cVar.f179388p = i15;
                            cVar.f179391s = 2;
                            objC = aVar3.c(params6, cVar);
                            if (objC == objE) {
                                return objE;
                            }
                            keyPair2 = keyPair;
                            objC2 = objC;
                        } catch (ex.c e18) {
                            e = e18;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = jVar2;
                            f fVar2 = f.f163100a;
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
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        keyPair2 = (KeyPair) cVar.f179383j;
                        bVar = (ex.b) cVar.f179382h;
                        u.b(objC2);
                    }
                    Object right = (i) objC2;
                    if (!(right instanceof i.Left)) {
                        if (!(right instanceof i.Right)) {
                            throw new p();
                        }
                        right = new i.Right(new Result((AppActivationWithKeysResponse) ((i.Right) right).b(), keyPair2));
                    }
                    return new i.Right((Result) bVar.a(right));
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

    /* JADX INFO: renamed from: s90.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ls90/a$a;", "Lgz/b$a;", "", "activationChallenge", "", "documentsIdsOnDevice", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String activationChallenge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> documentsIdsOnDevice;

        public Params(String str, List<String> list) {
            this.activationChallenge = str;
            this.documentsIdsOnDevice = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivationChallenge() {
            return this.activationChallenge;
        }

        public final List<String> b() {
            return this.documentsIdsOnDevice;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.activationChallenge, params.activationChallenge) && t.c(this.documentsIdsOnDevice, params.documentsIdsOnDevice);
        }

        public int hashCode() {
            int iHashCode = this.activationChallenge.hashCode() * 31;
            List<String> list = this.documentsIdsOnDevice;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Params(activationChallenge=" + this.activationChallenge + ", documentsIdsOnDevice=" + this.documentsIdsOnDevice + ')';
        }

        public /* synthetic */ Params(String str, List list, int i15, fr.k kVar) {
            this(str, (i15 & 2) != 0 ? null : list);
        }
    }
}
