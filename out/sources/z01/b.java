package z01;

import ay.Challenge;
import ay.j;
import dx.i;
import er.l;
import fr.q0;
import fr.t;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import jo2.SignedAuthorizationRequestDto;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;
import px.f;
import vq.k;
import wz3.d;
import wz3.e;
import y01.TrustedProfileAuthorizationParameters;
import y01.TrustedProfileAuthorizationRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lz01/b;", "", "Lz01/b$a;", "Loq/i0;", "Lwz3/e;", "getChallengeUC", "Lwz3/d;", "getBase64SignedValueUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lw01/b;", "trustedProfileAuthorizationRepository", "Lay/j;", "jsonSerializer", "<init>", "(Lwz3/e;Lwz3/d;Lac4/a;Lw01/b;Lay/j;)V", "params", "Ldx/i;", "Ldx/b;", "h", "(Lz01/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwz3/e;", "b", "Lwz3/d;", "c", "Lac4/a;", "d", "Lw01/b;", "e", "Lay/j;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getChallengeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w01.b trustedProfileAuthorizationRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: z01.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lz01/b$a;", "Lgz/b$a;", "Ly01/a;", "action", "", "authId", "<init>", "(Ly01/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly01/a;", "()Ly01/a;", "b", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y01.a action;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authId;

        public Params(y01.a aVar, String str) {
            this.action = aVar;
            this.authId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y01.a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.action == params.action && t.c(this.authId, params.authId);
        }

        public int hashCode() {
            return (this.action.hashCode() * 31) + this.authId.hashCode();
        }

        public String toString() {
            return "Params(action=" + this.action + ", authId=" + this.authId + ')';
        }
    }

    /* JADX INFO: renamed from: z01.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C6226b extends k implements l<tq.e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f231856h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f231857j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f231858k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f231859l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f231860m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f231861n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f231862p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f231863q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f231864r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f231865s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f231866t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Params f231868w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6226b(Params params, tq.e<? super C6226b> eVar) {
            super(1, eVar);
            this.f231868w = params;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0182  */
        /* JADX WARN: Code duplicated, block: B:44:0x0183  */
        /* JADX WARN: Code duplicated, block: B:48:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:63:0x0207  */
        /* JADX WARN: Code duplicated, block: B:66:0x0218  */
        /* JADX WARN: Code duplicated, block: B:67:0x0226  */
        /* JADX WARN: Code duplicated, block: B:69:0x022a  */
        /* JADX WARN: Code duplicated, block: B:72:0x0236  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            i iVarA;
            Object objB;
            int i15;
            Object objC;
            b bVar;
            Params params;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            ex.b bVar3;
            ex.b bVar4;
            int i16;
            int i17;
            int i18;
            int i19;
            Challenge challenge;
            ex.b bVar5;
            TrustedProfileAuthorizationRequest trustedProfileAuthorizationRequest;
            Object objC2;
            int i25;
            int i26;
            int i27;
            ex.b bVar6;
            ex.b bVar7;
            ex.b bVar8;
            Challenge challenge2;
            Object objA;
            ex.b bVar9;
            Object objE = uq.b.e();
            ?? r15 = this.f231866t;
            try {
                try {
                    try {
                        if (r15 == 0) {
                            u.b(obj);
                            b bVar10 = b.this;
                            Params params2 = this.f231868w;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                e eVar = bVar10.getChallengeUC;
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                this.f231853e = bVar10;
                                this.f231854f = params2;
                                this.f231855g = jVarA;
                                this.f231856h = vq.j.a(aVar);
                                this.f231857j = aVar;
                                this.f231858k = aVar;
                                i15 = 0;
                                this.f231861n = 0;
                                this.f231862p = 0;
                                this.f231863q = 0;
                                this.f231864r = 0;
                                this.f231865s = 0;
                                this.f231866t = 1;
                                objC = eVar.c(c1792a, this);
                                if (objC != objE) {
                                    bVar = bVar10;
                                    params = params2;
                                    jVar = jVarA;
                                    bVar2 = aVar;
                                    bVar3 = bVar2;
                                    bVar4 = bVar3;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    challenge = (Challenge) bVar2.a((i) objC);
                                    bVar5 = bVar4;
                                    TrustedProfileAuthorizationRequest trustedProfileAuthorizationRequest2 = new TrustedProfileAuthorizationRequest(challenge.getChallenge(), new TrustedProfileAuthorizationParameters(params.getAction(), params.getAuthId()));
                                    d dVar = bVar.getBase64SignedValueUseCase;
                                    trustedProfileAuthorizationRequest = trustedProfileAuthorizationRequest2;
                                    d.Params params3 = new d.Params(c0.g(bVar.jsonSerializer.b(w01.a.d(trustedProfileAuthorizationRequest2), q0.n(SignedAuthorizationRequestDto.class))));
                                    this.f231853e = bVar;
                                    this.f231854f = params;
                                    this.f231855g = jVar;
                                    this.f231856h = vq.j.a(bVar5);
                                    this.f231857j = bVar3;
                                    this.f231858k = bVar3;
                                    this.f231859l = vq.j.a(challenge);
                                    this.f231860m = vq.j.a(trustedProfileAuthorizationRequest);
                                    this.f231861n = i19;
                                    this.f231862p = i18;
                                    this.f231863q = i17;
                                    this.f231864r = i16;
                                    this.f231865s = i15;
                                    this.f231866t = 2;
                                    objC2 = dVar.c(params3, this);
                                    if (objC2 == objE) {
                                        i25 = i17;
                                        i26 = i19;
                                        i27 = i15;
                                        bVar6 = bVar3;
                                        bVar7 = bVar6;
                                        bVar8 = bVar5;
                                        challenge2 = challenge;
                                        b0 data = ((ry.a) bVar6.a((i) objC2)).getData();
                                        w01.b bVar11 = bVar.trustedProfileAuthorizationRepository;
                                        y01.a action = params.getAction();
                                        this.f231853e = jVar;
                                        this.f231854f = vq.j.a(bVar8);
                                        this.f231855g = vq.j.a(bVar7);
                                        this.f231856h = bVar7;
                                        this.f231857j = vq.j.a(challenge2);
                                        this.f231858k = vq.j.a(data);
                                        this.f231859l = vq.j.a(trustedProfileAuthorizationRequest);
                                        this.f231860m = null;
                                        this.f231861n = i26;
                                        this.f231862p = i18;
                                        this.f231863q = i25;
                                        this.f231864r = i16;
                                        this.f231865s = i27;
                                        this.f231866t = 3;
                                        objA = bVar11.a(action, data, this);
                                        if (objA != objE) {
                                            bVar9 = bVar7;
                                            bVar9.a((i) objA);
                                            return new i.Right(i0.f148189a);
                                        }
                                    }
                                }
                                return objE;
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
                                    if (!(iVarA instanceof i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        }
                        if (r15 != 1) {
                            if (r15 == 2) {
                                int i28 = this.f231865s;
                                int i29 = this.f231864r;
                                i25 = this.f231863q;
                                int i35 = this.f231862p;
                                i26 = this.f231861n;
                                TrustedProfileAuthorizationRequest trustedProfileAuthorizationRequest3 = (TrustedProfileAuthorizationRequest) this.f231860m;
                                challenge2 = (Challenge) this.f231859l;
                                bVar6 = (ex.b) this.f231858k;
                                bVar7 = (ex.b) this.f231857j;
                                bVar8 = (ex.b) this.f231856h;
                                dx.j<dx.b> jVar2 = (dx.j) this.f231855g;
                                params = (Params) this.f231854f;
                                bVar = (b) this.f231853e;
                                try {
                                    u.b(obj);
                                    objC2 = obj;
                                    trustedProfileAuthorizationRequest = trustedProfileAuthorizationRequest3;
                                    i18 = i35;
                                    i16 = i29;
                                    i27 = i28;
                                    jVar = jVar2;
                                    b0 data2 = ((ry.a) bVar6.a((i) objC2)).getData();
                                    w01.b bVar12 = bVar.trustedProfileAuthorizationRepository;
                                    y01.a action2 = params.getAction();
                                    this.f231853e = jVar;
                                    this.f231854f = vq.j.a(bVar8);
                                    this.f231855g = vq.j.a(bVar7);
                                    this.f231856h = bVar7;
                                    this.f231857j = vq.j.a(challenge2);
                                    this.f231858k = vq.j.a(data2);
                                    this.f231859l = vq.j.a(trustedProfileAuthorizationRequest);
                                    this.f231860m = null;
                                    this.f231861n = i26;
                                    this.f231862p = i18;
                                    this.f231863q = i25;
                                    this.f231864r = i16;
                                    this.f231865s = i27;
                                    this.f231866t = 3;
                                    objA = bVar12.a(action2, data2, this);
                                    if (objA != objE) {
                                        bVar9 = bVar7;
                                    }
                                    return objE;
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
                                        if (!(iVarA instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            }
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar9 = (ex.b) this.f231856h;
                            u.b(obj);
                            objA = obj;
                            bVar9.a((i) objA);
                            return new i.Right(i0.f148189a);
                        }
                        int i36 = this.f231865s;
                        int i37 = this.f231864r;
                        int i38 = this.f231863q;
                        int i39 = this.f231862p;
                        int i45 = this.f231861n;
                        ex.b bVar13 = (ex.b) this.f231858k;
                        ex.b bVar14 = (ex.b) this.f231857j;
                        ex.b bVar15 = (ex.b) this.f231856h;
                        dx.j<dx.b> jVar3 = (dx.j) this.f231855g;
                        Params params4 = (Params) this.f231854f;
                        b bVar16 = (b) this.f231853e;
                        try {
                            u.b(obj);
                            bVar = bVar16;
                            params = params4;
                            bVar4 = bVar15;
                            i15 = i36;
                            jVar = jVar3;
                            bVar3 = bVar14;
                            bVar2 = bVar13;
                            i19 = i45;
                            i18 = i39;
                            i17 = i38;
                            i16 = i37;
                            objC = obj;
                            challenge = (Challenge) bVar2.a((i) objC);
                            bVar5 = bVar4;
                            TrustedProfileAuthorizationRequest trustedProfileAuthorizationRequest4 = new TrustedProfileAuthorizationRequest(challenge.getChallenge(), new TrustedProfileAuthorizationParameters(params.getAction(), params.getAuthId()));
                            d dVar2 = bVar.getBase64SignedValueUseCase;
                            trustedProfileAuthorizationRequest = trustedProfileAuthorizationRequest4;
                            d.Params params5 = new d.Params(c0.g(bVar.jsonSerializer.b(w01.a.d(trustedProfileAuthorizationRequest4), q0.n(SignedAuthorizationRequestDto.class))));
                            this.f231853e = bVar;
                            this.f231854f = params;
                            this.f231855g = jVar;
                            this.f231856h = vq.j.a(bVar5);
                            this.f231857j = bVar3;
                            this.f231858k = bVar3;
                            this.f231859l = vq.j.a(challenge);
                            this.f231860m = vq.j.a(trustedProfileAuthorizationRequest);
                            this.f231861n = i19;
                            this.f231862p = i18;
                            this.f231863q = i17;
                            this.f231864r = i16;
                            this.f231865s = i15;
                            this.f231866t = 2;
                            objC2 = dVar2.c(params5, this);
                            if (objC2 == objE) {
                                i25 = i17;
                                i26 = i19;
                                i27 = i15;
                                bVar6 = bVar3;
                                bVar7 = bVar6;
                                bVar8 = bVar5;
                                challenge2 = challenge;
                                b0 data3 = ((ry.a) bVar6.a((i) objC2)).getData();
                                w01.b bVar17 = bVar.trustedProfileAuthorizationRepository;
                                y01.a action3 = params.getAction();
                                this.f231853e = jVar;
                                this.f231854f = vq.j.a(bVar8);
                                this.f231855g = vq.j.a(bVar7);
                                this.f231856h = bVar7;
                                this.f231857j = vq.j.a(challenge2);
                                this.f231858k = vq.j.a(data3);
                                this.f231859l = vq.j.a(trustedProfileAuthorizationRequest);
                                this.f231860m = null;
                                this.f231861n = i26;
                                this.f231862p = i18;
                                this.f231863q = i25;
                                this.f231864r = i16;
                                this.f231865s = i27;
                                this.f231866t = 3;
                                objA = bVar17.a(action3, data3, this);
                                if (objA != objE) {
                                    bVar9 = bVar7;
                                    bVar9.a((i) objA);
                                    return new i.Right(i0.f148189a);
                                }
                            }
                            return objE;
                        } catch (ex.c e26) {
                            e = e26;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            r15 = jVar3;
                            f fVar3 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } catch (CancellationException e29) {
                        throw e29;
                    }
                } catch (Exception e35) {
                    e = e35;
                }
            } catch (ex.c e36) {
                e = e36;
            } catch (CancellationException e37) {
                throw e37;
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C6226b(this.f231868w, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i<? extends dx.b, i0>> eVar) {
            return ((C6226b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(e eVar, d dVar, ac4.a aVar, w01.b bVar, j jVar) {
        this.getChallengeUC = eVar;
        this.getBase64SignedValueUseCase = dVar;
        this.callActionWithLoaderUseCase = aVar;
        this.trustedProfileAuthorizationRepository = bVar;
        this.jsonSerializer = jVar;
    }

    public Object h(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new C6226b(params, null), eVar, 1, null);
    }
}
