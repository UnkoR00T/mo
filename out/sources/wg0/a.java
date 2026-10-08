package wg0;

import iy.c0;
import iy.q;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pg0.DecryptedUserKeyData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lwg0/a;", "Lqg0/a;", "Lwg0/d;", "createPassKeyAndParamsUC", "Lwg0/i;", "loadAndDecryptUserKeyDataUC", "Lwg0/f;", "encryptAndSaveUserKeyDataUC", "Liy/g;", "cipherAes", "Lpx/d;", "logger", "Lmx/c;", "labelProvider", "<init>", "(Lwg0/d;Lwg0/i;Lwg0/f;Liy/g;Lpx/d;Lmx/c;)V", "Ldx/b$c;", "d", "()Ldx/b$c;", "Lqg0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Lqg0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwg0/d;", "b", "Lwg0/i;", "c", "Lwg0/f;", "Liy/g;", "Lpx/d;", "f", "Lmx/c;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements qg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d createPassKeyAndParamsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i loadAndDecryptUserKeyDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f encryptAndSaveUserKeyDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: wg0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5628a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213007h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213009k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213010l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f213011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f213012n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213013p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213014q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213015r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f213016s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f213017t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f213018v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f213019w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f213021y;

        C5628a(tq.e<? super C5628a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213019w = obj;
            this.f213021y |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(d dVar, i iVar, f fVar, iy.g gVar, px.d dVar2, mx.c cVar) {
        this.createPassKeyAndParamsUC = dVar;
        this.loadAndDecryptUserKeyDataUC = iVar;
        this.encryptAndSaveUserKeyDataUC = fVar;
        this.cipherAes = gVar;
        this.logger = dVar2;
        this.labelProvider = cVar;
    }

    private final dx.b.Business d() {
        return new dx.b.Business(pg0.d.SET_PIN_ERROR, null, this.labelProvider.c(og0.a.f145334c), null, null, this.labelProvider.c(og0.a.f145333b), this.labelProvider.c(og0.a.f145332a), 26, null);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0454  */
    /* JADX WARN: Code duplicated, block: B:106:0x0465  */
    /* JADX WARN: Code duplicated, block: B:107:0x0473  */
    /* JADX WARN: Code duplicated, block: B:109:0x0477  */
    /* JADX WARN: Code duplicated, block: B:113:0x0488  */
    /* JADX WARN: Code duplicated, block: B:115:0x0498  */
    /* JADX WARN: Code duplicated, block: B:116:0x049b  */
    /* JADX WARN: Code duplicated, block: B:118:0x049e  */
    /* JADX WARN: Code duplicated, block: B:119:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x04be  */
    /* JADX WARN: Code duplicated, block: B:126:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0216 A[Catch: Exception -> 0x005d, c -> 0x0060, CancellationException -> 0x0063, TRY_LEAVE, TryCatch #6 {Exception -> 0x005d, blocks: (B:13:0x0058, B:94:0x0418, B:97:0x043a, B:100:0x044b, B:71:0x020c, B:73:0x0216, B:95:0x0425, B:96:0x0439, B:67:0x01d4), top: B:129:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x024e  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:83:0x031a  */
    /* JADX WARN: Code duplicated, block: B:84:0x031c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0395  */
    /* JADX WARN: Code duplicated, block: B:88:0x0397  */
    /* JADX WARN: Code duplicated, block: B:93:0x0417  */
    /* JADX WARN: Code duplicated, block: B:95:0x0425 A[Catch: Exception -> 0x005d, c -> 0x0060, CancellationException -> 0x0063, TryCatch #6 {Exception -> 0x005d, blocks: (B:13:0x0058, B:94:0x0418, B:97:0x043a, B:100:0x044b, B:71:0x020c, B:73:0x0216, B:95:0x0425, B:96:0x0439, B:67:0x01d4), top: B:129:0x0025 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(qg0.a.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        C5628a c5628a;
        String message;
        dx.i iVarA;
        Object objB;
        Object left;
        dx.b bVar;
        dx.b.Generic generic;
        Throwable e15;
        dx.j<dx.b> jVarA;
        qg0.a.Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i19;
        DecryptedUserKeyData decryptedUserKeyData;
        ex.b bVar5;
        Object objH;
        dx.j<dx.b> jVar;
        qg0.a.Params params3;
        int i25;
        int i26;
        ex.b bVar6;
        DecryptedUserKeyData decryptedUserKeyData2;
        ex.b bVar7;
        PassKeyAndParams passKeyAndParams;
        ex.b bVar8;
        Object objJ;
        PassKeyAndParams passKeyAndParams2;
        ex.b bVar9;
        DecryptedUserKeyData decryptedUserKeyData3;
        ex.b bVar10;
        SecretKey secretKey;
        PassKeyAndParams passKeyAndParams3;
        qg0.a.Params params4;
        ex.b bVar11;
        Object objH2;
        DecryptedUserKeyData decryptedUserKeyData4;
        ex.b bVar12;
        qg0.a.Params params5;
        SecretKey secretKey2;
        int i27;
        int i28;
        PassKeyAndParams passKeyAndParams4;
        PassKeyAndParams passKeyAndParams5;
        qg0.a.Params params6;
        PassKeyAndParams passKeyAndParams6;
        Object objC;
        Object obj;
        int i29;
        PassKeyAndParams passKeyAndParams7;
        ex.b bVar13;
        qg0.a.Params params7;
        DecryptedUserKeyData decryptedUserKeyData5;
        PassKeyAndParams passKeyAndParams8;
        ex.b bVar14;
        Object obj2;
        if (eVar instanceof C5628a) {
            c5628a = (C5628a) eVar;
            int i35 = c5628a.f213021y;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                c5628a.f213021y = i35 - PKIFailureInfo.systemUnavail;
            } else {
                c5628a = new C5628a(eVar);
            }
        } else {
            c5628a = new C5628a(eVar);
        }
        Object objA = c5628a.f213019w;
        Object objE = uq.b.e();
        ?? r15 = c5628a.f213021y;
        try {
            try {
                try {
                    switch (r15) {
                        case 0:
                            u.b(objA);
                            jVarA = xw.c.f221622a.a();
                            ex.a aVar = new ex.a();
                            i iVar = this.loadAndDecryptUserKeyDataUC;
                            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                            c5628a.f213003d = params;
                            c5628a.f213004e = jVarA;
                            c5628a.f213005f = vq.j.a(aVar);
                            c5628a.f213006g = aVar;
                            c5628a.f213007h = aVar;
                            c5628a.f213013p = 0;
                            c5628a.f213014q = 0;
                            c5628a.f213015r = 0;
                            c5628a.f213016s = 0;
                            c5628a.f213017t = 0;
                            c5628a.f213021y = 1;
                            objA = iVar.a(c1792a, c5628a);
                            if (objA != objE) {
                                params2 = params;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                bVar2 = aVar;
                                bVar3 = bVar2;
                                bVar4 = bVar3;
                                i19 = 0;
                                decryptedUserKeyData = (DecryptedUserKeyData) bVar2.a((dx.i) objA);
                                if (decryptedUserKeyData != null) {
                                    bVar3.b(new dx.b.Generic(new NullPointerException("ChangeUserPinUCImpl: userKeyData is null")));
                                    throw new oq.g();
                                }
                                d dVar = this.createPassKeyAndParamsUC;
                                bVar5 = bVar4;
                                d.Params bVar15 = new d.Params(params2.getUserPin(), decryptedUserKeyData.getKeyParams());
                                c5628a.f213003d = params2;
                                c5628a.f213004e = jVarA;
                                c5628a.f213005f = vq.j.a(bVar5);
                                c5628a.f213006g = bVar3;
                                c5628a.f213007h = decryptedUserKeyData;
                                c5628a.f213008j = bVar3;
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i17;
                                c5628a.f213016s = i16;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = 0;
                                c5628a.f213021y = 2;
                                objH = dVar.h(bVar15, c5628a);
                                if (objH != objE) {
                                    qg0.a.Params params8 = params2;
                                    jVar = jVarA;
                                    params3 = params8;
                                    int i36 = i17;
                                    i25 = 0;
                                    i26 = i36;
                                    bVar6 = bVar5;
                                    decryptedUserKeyData2 = decryptedUserKeyData;
                                    objA = objH;
                                    bVar7 = bVar3;
                                    passKeyAndParams = (PassKeyAndParams) bVar3.a((dx.i) objA);
                                    iy.g gVar = this.cipherAes;
                                    bVar8 = bVar6;
                                    byte[] data = decryptedUserKeyData2.getWrappedMasterKey().getData();
                                    SecretKey passwordKey = passKeyAndParams.getPasswordKey();
                                    iy.h.a.c cVar = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                    c5628a.f213003d = params3;
                                    c5628a.f213004e = jVar;
                                    c5628a.f213005f = vq.j.a(bVar8);
                                    c5628a.f213006g = bVar7;
                                    c5628a.f213007h = decryptedUserKeyData2;
                                    c5628a.f213008j = bVar7;
                                    c5628a.f213009k = vq.j.a(passKeyAndParams);
                                    c5628a.f213013p = i19;
                                    c5628a.f213014q = i18;
                                    c5628a.f213015r = i26;
                                    c5628a.f213016s = i16;
                                    c5628a.f213017t = i15;
                                    c5628a.f213018v = i25;
                                    c5628a.f213021y = 3;
                                    objJ = gVar.j(data, passwordKey, cVar, c5628a);
                                    objE = objE;
                                    if (objJ != objE) {
                                        passKeyAndParams2 = passKeyAndParams;
                                        objA = objJ;
                                        bVar9 = bVar8;
                                        decryptedUserKeyData3 = decryptedUserKeyData2;
                                        bVar10 = bVar7;
                                        secretKey = (SecretKey) bVar7.a((dx.i) objA);
                                        passKeyAndParams3 = passKeyAndParams2;
                                        d dVar2 = this.createPassKeyAndParamsUC;
                                        params4 = params3;
                                        bVar11 = bVar9;
                                        d.Params bVar16 = new d.Params(params4.getNewPin(), null);
                                        c5628a.f213003d = vq.j.a(params4);
                                        c5628a.f213004e = jVar;
                                        c5628a.f213005f = vq.j.a(bVar11);
                                        c5628a.f213006g = bVar10;
                                        c5628a.f213007h = decryptedUserKeyData3;
                                        c5628a.f213008j = bVar10;
                                        c5628a.f213009k = vq.j.a(passKeyAndParams3);
                                        c5628a.f213010l = secretKey;
                                        c5628a.f213013p = i19;
                                        c5628a.f213014q = i18;
                                        c5628a.f213015r = i26;
                                        c5628a.f213016s = i16;
                                        c5628a.f213017t = i15;
                                        c5628a.f213018v = i25;
                                        c5628a.f213021y = 4;
                                        objH2 = dVar2.h(bVar16, c5628a);
                                        if (objH2 != objE) {
                                            decryptedUserKeyData4 = decryptedUserKeyData3;
                                            bVar12 = bVar10;
                                            params5 = params4;
                                            secretKey2 = secretKey;
                                            objA = objH2;
                                            i27 = i26;
                                            i28 = i16;
                                            passKeyAndParams4 = passKeyAndParams3;
                                            passKeyAndParams5 = (PassKeyAndParams) bVar10.a((dx.i) objA);
                                            params6 = params5;
                                            iy.g gVar2 = this.cipherAes;
                                            passKeyAndParams6 = passKeyAndParams4;
                                            SecretKey passwordKey2 = passKeyAndParams5.getPasswordKey();
                                            Object obj3 = objE;
                                            iy.h.a.c cVar2 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                            c5628a.f213003d = vq.j.a(params6);
                                            c5628a.f213004e = jVar;
                                            c5628a.f213005f = vq.j.a(bVar11);
                                            c5628a.f213006g = bVar12;
                                            c5628a.f213007h = decryptedUserKeyData4;
                                            c5628a.f213008j = bVar12;
                                            c5628a.f213009k = vq.j.a(passKeyAndParams6);
                                            c5628a.f213010l = vq.j.a(secretKey2);
                                            c5628a.f213011m = passKeyAndParams5;
                                            c5628a.f213013p = i19;
                                            c5628a.f213014q = i18;
                                            c5628a.f213015r = i27;
                                            c5628a.f213016s = i28;
                                            c5628a.f213017t = i15;
                                            c5628a.f213018v = i25;
                                            c5628a.f213021y = 5;
                                            objC = gVar2.c(secretKey2, passwordKey2, cVar2, c5628a);
                                            obj = obj3;
                                            if (objC == obj) {
                                                return obj;
                                            }
                                            i29 = i27;
                                            passKeyAndParams7 = passKeyAndParams6;
                                            bVar13 = bVar11;
                                            params7 = params6;
                                            decryptedUserKeyData5 = decryptedUserKeyData4;
                                            passKeyAndParams8 = passKeyAndParams5;
                                            objA = objC;
                                            bVar14 = bVar12;
                                            byte[] bArr = (byte[]) bVar12.a((dx.i) objA);
                                            qg0.a.Params params9 = params7;
                                            f fVar = this.encryptAndSaveUserKeyDataUC;
                                            PassKeyAndParams passKeyAndParams9 = passKeyAndParams8;
                                            obj2 = obj;
                                            f.Params aVar2 = new f.Params(new DecryptedUserKeyData(c0.f(bArr), passKeyAndParams9.getKeyParams(), decryptedUserKeyData5.getDeviceKey()));
                                            c5628a.f213003d = vq.j.a(params9);
                                            c5628a.f213004e = jVar;
                                            c5628a.f213005f = vq.j.a(bVar13);
                                            c5628a.f213006g = bVar14;
                                            c5628a.f213007h = vq.j.a(decryptedUserKeyData5);
                                            c5628a.f213008j = bVar14;
                                            c5628a.f213009k = vq.j.a(passKeyAndParams7);
                                            c5628a.f213010l = vq.j.a(secretKey2);
                                            c5628a.f213011m = vq.j.a(passKeyAndParams9);
                                            c5628a.f213012n = vq.j.a(bArr);
                                            c5628a.f213013p = i19;
                                            c5628a.f213014q = i18;
                                            c5628a.f213015r = i29;
                                            c5628a.f213016s = i28;
                                            c5628a.f213017t = i15;
                                            c5628a.f213018v = i25;
                                            c5628a.f213021y = 6;
                                            objA = fVar.e(aVar2, c5628a);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            bVar14.a((dx.i) objA);
                                            left = new dx.i.Right(i0.f148189a);
                                            if (!(left instanceof dx.i.Left)) {
                                                if (left instanceof dx.i.Right) {
                                                    return left;
                                                }
                                                throw new p();
                                            }
                                            bVar = (dx.b) ((dx.i.Left) left).b();
                                            px.d dVar3 = this.logger;
                                            if (bVar instanceof dx.b.Generic) {
                                                generic = (dx.b.Generic) bVar;
                                            } else {
                                                generic = null;
                                            }
                                            if (generic != null) {
                                                e15 = generic.getE();
                                            } else {
                                                e15 = null;
                                            }
                                            dVar3.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                                            return new dx.i.Left(d());
                                        }
                                    }
                                }
                            }
                            return objE;
                        case 1:
                            int i37 = c5628a.f213017t;
                            int i38 = c5628a.f213016s;
                            int i39 = c5628a.f213015r;
                            int i45 = c5628a.f213014q;
                            int i46 = c5628a.f213013p;
                            ex.b bVar17 = (ex.b) c5628a.f213007h;
                            ex.b bVar18 = (ex.b) c5628a.f213006g;
                            ex.b bVar19 = (ex.b) c5628a.f213005f;
                            dx.j<dx.b> jVar2 = (dx.j) c5628a.f213004e;
                            params2 = (qg0.a.Params) c5628a.f213003d;
                            try {
                                u.b(objA);
                                i15 = i37;
                                jVarA = jVar2;
                                bVar4 = bVar19;
                                bVar3 = bVar18;
                                bVar2 = bVar17;
                                i19 = i46;
                                i18 = i45;
                                i17 = i39;
                                i16 = i38;
                                decryptedUserKeyData = (DecryptedUserKeyData) bVar2.a((dx.i) objA);
                                if (decryptedUserKeyData != null) {
                                    bVar3.b(new dx.b.Generic(new NullPointerException("ChangeUserPinUCImpl: userKeyData is null")));
                                    throw new oq.g();
                                }
                                d dVar4 = this.createPassKeyAndParamsUC;
                                bVar5 = bVar4;
                                d.Params bVar110 = new d.Params(params2.getUserPin(), decryptedUserKeyData.getKeyParams());
                                c5628a.f213003d = params2;
                                c5628a.f213004e = jVarA;
                                c5628a.f213005f = vq.j.a(bVar5);
                                c5628a.f213006g = bVar3;
                                c5628a.f213007h = decryptedUserKeyData;
                                c5628a.f213008j = bVar3;
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i17;
                                c5628a.f213016s = i16;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = 0;
                                c5628a.f213021y = 2;
                                objH = dVar4.h(bVar110, c5628a);
                                if (objH != objE) {
                                    qg0.a.Params params10 = params2;
                                    jVar = jVarA;
                                    params3 = params10;
                                    int i310 = i17;
                                    i25 = 0;
                                    i26 = i310;
                                    bVar6 = bVar5;
                                    decryptedUserKeyData2 = decryptedUserKeyData;
                                    objA = objH;
                                    bVar7 = bVar3;
                                    passKeyAndParams = (PassKeyAndParams) bVar3.a((dx.i) objA);
                                    iy.g gVar3 = this.cipherAes;
                                    bVar8 = bVar6;
                                    byte[] data2 = decryptedUserKeyData2.getWrappedMasterKey().getData();
                                    SecretKey passwordKey3 = passKeyAndParams.getPasswordKey();
                                    iy.h.a.c cVar3 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                    c5628a.f213003d = params3;
                                    c5628a.f213004e = jVar;
                                    c5628a.f213005f = vq.j.a(bVar8);
                                    c5628a.f213006g = bVar7;
                                    c5628a.f213007h = decryptedUserKeyData2;
                                    c5628a.f213008j = bVar7;
                                    c5628a.f213009k = vq.j.a(passKeyAndParams);
                                    c5628a.f213013p = i19;
                                    c5628a.f213014q = i18;
                                    c5628a.f213015r = i26;
                                    c5628a.f213016s = i16;
                                    c5628a.f213017t = i15;
                                    c5628a.f213018v = i25;
                                    c5628a.f213021y = 3;
                                    objJ = gVar3.j(data2, passwordKey3, cVar3, c5628a);
                                    objE = objE;
                                    if (objJ != objE) {
                                        passKeyAndParams2 = passKeyAndParams;
                                        objA = objJ;
                                        bVar9 = bVar8;
                                        decryptedUserKeyData3 = decryptedUserKeyData2;
                                        bVar10 = bVar7;
                                        secretKey = (SecretKey) bVar7.a((dx.i) objA);
                                        passKeyAndParams3 = passKeyAndParams2;
                                        d dVar5 = this.createPassKeyAndParamsUC;
                                        params4 = params3;
                                        bVar11 = bVar9;
                                        d.Params bVar111 = new d.Params(params4.getNewPin(), null);
                                        c5628a.f213003d = vq.j.a(params4);
                                        c5628a.f213004e = jVar;
                                        c5628a.f213005f = vq.j.a(bVar11);
                                        c5628a.f213006g = bVar10;
                                        c5628a.f213007h = decryptedUserKeyData3;
                                        c5628a.f213008j = bVar10;
                                        c5628a.f213009k = vq.j.a(passKeyAndParams3);
                                        c5628a.f213010l = secretKey;
                                        c5628a.f213013p = i19;
                                        c5628a.f213014q = i18;
                                        c5628a.f213015r = i26;
                                        c5628a.f213016s = i16;
                                        c5628a.f213017t = i15;
                                        c5628a.f213018v = i25;
                                        c5628a.f213021y = 4;
                                        objH2 = dVar5.h(bVar111, c5628a);
                                        if (objH2 != objE) {
                                            decryptedUserKeyData4 = decryptedUserKeyData3;
                                            bVar12 = bVar10;
                                            params5 = params4;
                                            secretKey2 = secretKey;
                                            objA = objH2;
                                            i27 = i26;
                                            i28 = i16;
                                            passKeyAndParams4 = passKeyAndParams3;
                                            passKeyAndParams5 = (PassKeyAndParams) bVar10.a((dx.i) objA);
                                            params6 = params5;
                                            iy.g gVar4 = this.cipherAes;
                                            passKeyAndParams6 = passKeyAndParams4;
                                            SecretKey passwordKey4 = passKeyAndParams5.getPasswordKey();
                                            Object obj4 = objE;
                                            iy.h.a.c cVar4 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                            c5628a.f213003d = vq.j.a(params6);
                                            c5628a.f213004e = jVar;
                                            c5628a.f213005f = vq.j.a(bVar11);
                                            c5628a.f213006g = bVar12;
                                            c5628a.f213007h = decryptedUserKeyData4;
                                            c5628a.f213008j = bVar12;
                                            c5628a.f213009k = vq.j.a(passKeyAndParams6);
                                            c5628a.f213010l = vq.j.a(secretKey2);
                                            c5628a.f213011m = passKeyAndParams5;
                                            c5628a.f213013p = i19;
                                            c5628a.f213014q = i18;
                                            c5628a.f213015r = i27;
                                            c5628a.f213016s = i28;
                                            c5628a.f213017t = i15;
                                            c5628a.f213018v = i25;
                                            c5628a.f213021y = 5;
                                            objC = gVar4.c(secretKey2, passwordKey4, cVar4, c5628a);
                                            obj = obj4;
                                            if (objC == obj) {
                                                return obj;
                                            }
                                            i29 = i27;
                                            passKeyAndParams7 = passKeyAndParams6;
                                            bVar13 = bVar11;
                                            params7 = params6;
                                            decryptedUserKeyData5 = decryptedUserKeyData4;
                                            passKeyAndParams8 = passKeyAndParams5;
                                            objA = objC;
                                            bVar14 = bVar12;
                                            byte[] bArr2 = (byte[]) bVar12.a((dx.i) objA);
                                            qg0.a.Params params11 = params7;
                                            f fVar2 = this.encryptAndSaveUserKeyDataUC;
                                            PassKeyAndParams passKeyAndParams10 = passKeyAndParams8;
                                            obj2 = obj;
                                            f.Params aVar3 = new f.Params(new DecryptedUserKeyData(c0.f(bArr2), passKeyAndParams10.getKeyParams(), decryptedUserKeyData5.getDeviceKey()));
                                            c5628a.f213003d = vq.j.a(params11);
                                            c5628a.f213004e = jVar;
                                            c5628a.f213005f = vq.j.a(bVar13);
                                            c5628a.f213006g = bVar14;
                                            c5628a.f213007h = vq.j.a(decryptedUserKeyData5);
                                            c5628a.f213008j = bVar14;
                                            c5628a.f213009k = vq.j.a(passKeyAndParams7);
                                            c5628a.f213010l = vq.j.a(secretKey2);
                                            c5628a.f213011m = vq.j.a(passKeyAndParams10);
                                            c5628a.f213012n = vq.j.a(bArr2);
                                            c5628a.f213013p = i19;
                                            c5628a.f213014q = i18;
                                            c5628a.f213015r = i29;
                                            c5628a.f213016s = i28;
                                            c5628a.f213017t = i15;
                                            c5628a.f213018v = i25;
                                            c5628a.f213021y = 6;
                                            objA = fVar2.e(aVar3, c5628a);
                                            if (objA == obj2) {
                                                return obj2;
                                            }
                                            bVar14.a((dx.i) objA);
                                            left = new dx.i.Right(i0.f148189a);
                                            if (!(left instanceof dx.i.Left)) {
                                                if (left instanceof dx.i.Right) {
                                                    return left;
                                                }
                                                throw new p();
                                            }
                                            bVar = (dx.b) ((dx.i.Left) left).b();
                                            px.d dVar6 = this.logger;
                                            if (bVar instanceof dx.b.Generic) {
                                                generic = (dx.b.Generic) bVar;
                                            } else {
                                                generic = null;
                                            }
                                            if (generic != null) {
                                                e15 = generic.getE();
                                            } else {
                                                e15 = null;
                                            }
                                            dVar6.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                                            return new dx.i.Left(d());
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e16) {
                                e = e16;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e17) {
                                throw e17;
                            } catch (Exception e18) {
                                e = e18;
                                r15 = jVar2;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                            break;
                        case 2:
                            int i47 = c5628a.f213018v;
                            int i48 = c5628a.f213017t;
                            int i49 = c5628a.f213016s;
                            int i55 = c5628a.f213015r;
                            int i56 = c5628a.f213014q;
                            int i57 = c5628a.f213013p;
                            ex.b bVar20 = (ex.b) c5628a.f213008j;
                            DecryptedUserKeyData decryptedUserKeyData6 = (DecryptedUserKeyData) c5628a.f213007h;
                            ex.b bVar21 = (ex.b) c5628a.f213006g;
                            ex.b bVar22 = (ex.b) c5628a.f213005f;
                            jVar = (dx.j) c5628a.f213004e;
                            qg0.a.Params params12 = (qg0.a.Params) c5628a.f213003d;
                            try {
                                u.b(objA);
                                i15 = i48;
                                params3 = params12;
                                bVar6 = bVar22;
                                decryptedUserKeyData2 = decryptedUserKeyData6;
                                bVar7 = bVar21;
                                bVar3 = bVar20;
                                i19 = i57;
                                i18 = i56;
                                i25 = i47;
                                i26 = i55;
                                i16 = i49;
                                passKeyAndParams = (PassKeyAndParams) bVar3.a((dx.i) objA);
                                iy.g gVar5 = this.cipherAes;
                                bVar8 = bVar6;
                                byte[] data3 = decryptedUserKeyData2.getWrappedMasterKey().getData();
                                SecretKey passwordKey5 = passKeyAndParams.getPasswordKey();
                                iy.h.a.c cVar5 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                c5628a.f213003d = params3;
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar8);
                                c5628a.f213006g = bVar7;
                                c5628a.f213007h = decryptedUserKeyData2;
                                c5628a.f213008j = bVar7;
                                c5628a.f213009k = vq.j.a(passKeyAndParams);
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i26;
                                c5628a.f213016s = i16;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 3;
                                objJ = gVar5.j(data3, passwordKey5, cVar5, c5628a);
                                objE = objE;
                                if (objJ != objE) {
                                    passKeyAndParams2 = passKeyAndParams;
                                    objA = objJ;
                                    bVar9 = bVar8;
                                    decryptedUserKeyData3 = decryptedUserKeyData2;
                                    bVar10 = bVar7;
                                    secretKey = (SecretKey) bVar7.a((dx.i) objA);
                                    passKeyAndParams3 = passKeyAndParams2;
                                    d dVar7 = this.createPassKeyAndParamsUC;
                                    params4 = params3;
                                    bVar11 = bVar9;
                                    d.Params bVar112 = new d.Params(params4.getNewPin(), null);
                                    c5628a.f213003d = vq.j.a(params4);
                                    c5628a.f213004e = jVar;
                                    c5628a.f213005f = vq.j.a(bVar11);
                                    c5628a.f213006g = bVar10;
                                    c5628a.f213007h = decryptedUserKeyData3;
                                    c5628a.f213008j = bVar10;
                                    c5628a.f213009k = vq.j.a(passKeyAndParams3);
                                    c5628a.f213010l = secretKey;
                                    c5628a.f213013p = i19;
                                    c5628a.f213014q = i18;
                                    c5628a.f213015r = i26;
                                    c5628a.f213016s = i16;
                                    c5628a.f213017t = i15;
                                    c5628a.f213018v = i25;
                                    c5628a.f213021y = 4;
                                    objH2 = dVar7.h(bVar112, c5628a);
                                    if (objH2 != objE) {
                                        decryptedUserKeyData4 = decryptedUserKeyData3;
                                        bVar12 = bVar10;
                                        params5 = params4;
                                        secretKey2 = secretKey;
                                        objA = objH2;
                                        i27 = i26;
                                        i28 = i16;
                                        passKeyAndParams4 = passKeyAndParams3;
                                        passKeyAndParams5 = (PassKeyAndParams) bVar10.a((dx.i) objA);
                                        params6 = params5;
                                        iy.g gVar6 = this.cipherAes;
                                        passKeyAndParams6 = passKeyAndParams4;
                                        SecretKey passwordKey6 = passKeyAndParams5.getPasswordKey();
                                        Object obj5 = objE;
                                        iy.h.a.c cVar6 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                        c5628a.f213003d = vq.j.a(params6);
                                        c5628a.f213004e = jVar;
                                        c5628a.f213005f = vq.j.a(bVar11);
                                        c5628a.f213006g = bVar12;
                                        c5628a.f213007h = decryptedUserKeyData4;
                                        c5628a.f213008j = bVar12;
                                        c5628a.f213009k = vq.j.a(passKeyAndParams6);
                                        c5628a.f213010l = vq.j.a(secretKey2);
                                        c5628a.f213011m = passKeyAndParams5;
                                        c5628a.f213013p = i19;
                                        c5628a.f213014q = i18;
                                        c5628a.f213015r = i27;
                                        c5628a.f213016s = i28;
                                        c5628a.f213017t = i15;
                                        c5628a.f213018v = i25;
                                        c5628a.f213021y = 5;
                                        objC = gVar6.c(secretKey2, passwordKey6, cVar6, c5628a);
                                        obj = obj5;
                                        if (objC == obj) {
                                            return obj;
                                        }
                                        i29 = i27;
                                        passKeyAndParams7 = passKeyAndParams6;
                                        bVar13 = bVar11;
                                        params7 = params6;
                                        decryptedUserKeyData5 = decryptedUserKeyData4;
                                        passKeyAndParams8 = passKeyAndParams5;
                                        objA = objC;
                                        bVar14 = bVar12;
                                        byte[] bArr3 = (byte[]) bVar12.a((dx.i) objA);
                                        qg0.a.Params params13 = params7;
                                        f fVar4 = this.encryptAndSaveUserKeyDataUC;
                                        PassKeyAndParams passKeyAndParams11 = passKeyAndParams8;
                                        obj2 = obj;
                                        f.Params aVar4 = new f.Params(new DecryptedUserKeyData(c0.f(bArr3), passKeyAndParams11.getKeyParams(), decryptedUserKeyData5.getDeviceKey()));
                                        c5628a.f213003d = vq.j.a(params13);
                                        c5628a.f213004e = jVar;
                                        c5628a.f213005f = vq.j.a(bVar13);
                                        c5628a.f213006g = bVar14;
                                        c5628a.f213007h = vq.j.a(decryptedUserKeyData5);
                                        c5628a.f213008j = bVar14;
                                        c5628a.f213009k = vq.j.a(passKeyAndParams7);
                                        c5628a.f213010l = vq.j.a(secretKey2);
                                        c5628a.f213011m = vq.j.a(passKeyAndParams11);
                                        c5628a.f213012n = vq.j.a(bArr3);
                                        c5628a.f213013p = i19;
                                        c5628a.f213014q = i18;
                                        c5628a.f213015r = i29;
                                        c5628a.f213016s = i28;
                                        c5628a.f213017t = i15;
                                        c5628a.f213018v = i25;
                                        c5628a.f213021y = 6;
                                        objA = fVar4.e(aVar4, c5628a);
                                        if (objA == obj2) {
                                            return obj2;
                                        }
                                        bVar14.a((dx.i) objA);
                                        left = new dx.i.Right(i0.f148189a);
                                        if (!(left instanceof dx.i.Left)) {
                                            if (left instanceof dx.i.Right) {
                                                return left;
                                            }
                                            throw new p();
                                        }
                                        bVar = (dx.b) ((dx.i.Left) left).b();
                                        px.d dVar8 = this.logger;
                                        if (bVar instanceof dx.b.Generic) {
                                            generic = (dx.b.Generic) bVar;
                                        } else {
                                            generic = null;
                                        }
                                        if (generic != null) {
                                            e15 = generic.getE();
                                        } else {
                                            e15 = null;
                                        }
                                        dVar8.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                                        return new dx.i.Left(d());
                                    }
                                }
                                return objE;
                            } catch (ex.c e19) {
                                e = e19;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e25) {
                                throw e25;
                            } catch (Exception e26) {
                                e = e26;
                                r15 = jVar;
                                px.f fVar5 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar5.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                            break;
                        case 3:
                            int i58 = c5628a.f213018v;
                            i15 = c5628a.f213017t;
                            i16 = c5628a.f213016s;
                            i26 = c5628a.f213015r;
                            int i59 = c5628a.f213014q;
                            int i65 = c5628a.f213013p;
                            PassKeyAndParams passKeyAndParams12 = (PassKeyAndParams) c5628a.f213009k;
                            bVar7 = (ex.b) c5628a.f213008j;
                            decryptedUserKeyData3 = (DecryptedUserKeyData) c5628a.f213007h;
                            bVar10 = (ex.b) c5628a.f213006g;
                            ex.b bVar23 = (ex.b) c5628a.f213005f;
                            dx.j<dx.b> jVar3 = (dx.j) c5628a.f213004e;
                            params3 = (qg0.a.Params) c5628a.f213003d;
                            try {
                                u.b(objA);
                                bVar9 = bVar23;
                                jVar = jVar3;
                                passKeyAndParams2 = passKeyAndParams12;
                                i19 = i65;
                                i18 = i59;
                                i25 = i58;
                                secretKey = (SecretKey) bVar7.a((dx.i) objA);
                                passKeyAndParams3 = passKeyAndParams2;
                                d dVar9 = this.createPassKeyAndParamsUC;
                                params4 = params3;
                                bVar11 = bVar9;
                                d.Params bVar113 = new d.Params(params4.getNewPin(), null);
                                c5628a.f213003d = vq.j.a(params4);
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar11);
                                c5628a.f213006g = bVar10;
                                c5628a.f213007h = decryptedUserKeyData3;
                                c5628a.f213008j = bVar10;
                                c5628a.f213009k = vq.j.a(passKeyAndParams3);
                                c5628a.f213010l = secretKey;
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i26;
                                c5628a.f213016s = i16;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 4;
                                objH2 = dVar9.h(bVar113, c5628a);
                                if (objH2 != objE) {
                                    return objE;
                                }
                                decryptedUserKeyData4 = decryptedUserKeyData3;
                                bVar12 = bVar10;
                                params5 = params4;
                                secretKey2 = secretKey;
                                objA = objH2;
                                i27 = i26;
                                i28 = i16;
                                passKeyAndParams4 = passKeyAndParams3;
                                passKeyAndParams5 = (PassKeyAndParams) bVar10.a((dx.i) objA);
                                params6 = params5;
                                iy.g gVar7 = this.cipherAes;
                                passKeyAndParams6 = passKeyAndParams4;
                                SecretKey passwordKey7 = passKeyAndParams5.getPasswordKey();
                                Object obj6 = objE;
                                iy.h.a.c cVar7 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                c5628a.f213003d = vq.j.a(params6);
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar11);
                                c5628a.f213006g = bVar12;
                                c5628a.f213007h = decryptedUserKeyData4;
                                c5628a.f213008j = bVar12;
                                c5628a.f213009k = vq.j.a(passKeyAndParams6);
                                c5628a.f213010l = vq.j.a(secretKey2);
                                c5628a.f213011m = passKeyAndParams5;
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i27;
                                c5628a.f213016s = i28;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 5;
                                objC = gVar7.c(secretKey2, passwordKey7, cVar7, c5628a);
                                obj = obj6;
                                if (objC == obj) {
                                    return obj;
                                }
                                i29 = i27;
                                passKeyAndParams7 = passKeyAndParams6;
                                bVar13 = bVar11;
                                params7 = params6;
                                decryptedUserKeyData5 = decryptedUserKeyData4;
                                passKeyAndParams8 = passKeyAndParams5;
                                objA = objC;
                                bVar14 = bVar12;
                                byte[] bArr4 = (byte[]) bVar12.a((dx.i) objA);
                                qg0.a.Params params14 = params7;
                                f fVar6 = this.encryptAndSaveUserKeyDataUC;
                                PassKeyAndParams passKeyAndParams13 = passKeyAndParams8;
                                obj2 = obj;
                                f.Params aVar5 = new f.Params(new DecryptedUserKeyData(c0.f(bArr4), passKeyAndParams13.getKeyParams(), decryptedUserKeyData5.getDeviceKey()));
                                c5628a.f213003d = vq.j.a(params14);
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar13);
                                c5628a.f213006g = bVar14;
                                c5628a.f213007h = vq.j.a(decryptedUserKeyData5);
                                c5628a.f213008j = bVar14;
                                c5628a.f213009k = vq.j.a(passKeyAndParams7);
                                c5628a.f213010l = vq.j.a(secretKey2);
                                c5628a.f213011m = vq.j.a(passKeyAndParams13);
                                c5628a.f213012n = vq.j.a(bArr4);
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i29;
                                c5628a.f213016s = i28;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 6;
                                objA = fVar6.e(aVar5, c5628a);
                                if (objA == obj2) {
                                    return obj2;
                                }
                                bVar14.a((dx.i) objA);
                                left = new dx.i.Right(i0.f148189a);
                                if (!(left instanceof dx.i.Left)) {
                                    if (left instanceof dx.i.Right) {
                                        return left;
                                    }
                                    throw new p();
                                }
                                bVar = (dx.b) ((dx.i.Left) left).b();
                                px.d dVar10 = this.logger;
                                if (bVar instanceof dx.b.Generic) {
                                    generic = (dx.b.Generic) bVar;
                                } else {
                                    generic = null;
                                }
                                if (generic != null) {
                                    e15 = generic.getE();
                                } else {
                                    e15 = null;
                                }
                                dVar10.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                                return new dx.i.Left(d());
                            } catch (ex.c e27) {
                                e = e27;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e28) {
                                throw e28;
                            } catch (Exception e29) {
                                e = e29;
                                r15 = jVar3;
                                px.f fVar7 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar7.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                            break;
                        case 4:
                            int i66 = c5628a.f213018v;
                            int i67 = c5628a.f213017t;
                            i28 = c5628a.f213016s;
                            int i68 = c5628a.f213015r;
                            i18 = c5628a.f213014q;
                            i19 = c5628a.f213013p;
                            SecretKey secretKey3 = (SecretKey) c5628a.f213010l;
                            PassKeyAndParams passKeyAndParams14 = (PassKeyAndParams) c5628a.f213009k;
                            bVar10 = (ex.b) c5628a.f213008j;
                            DecryptedUserKeyData decryptedUserKeyData7 = (DecryptedUserKeyData) c5628a.f213007h;
                            bVar12 = (ex.b) c5628a.f213006g;
                            ex.b bVar24 = (ex.b) c5628a.f213005f;
                            dx.j<dx.b> jVar4 = (dx.j) c5628a.f213004e;
                            params5 = (qg0.a.Params) c5628a.f213003d;
                            try {
                                u.b(objA);
                                bVar11 = bVar24;
                                i15 = i67;
                                i27 = i68;
                                passKeyAndParams4 = passKeyAndParams14;
                                i25 = i66;
                                secretKey2 = secretKey3;
                                decryptedUserKeyData4 = decryptedUserKeyData7;
                                jVar = jVar4;
                                passKeyAndParams5 = (PassKeyAndParams) bVar10.a((dx.i) objA);
                                params6 = params5;
                                iy.g gVar8 = this.cipherAes;
                                passKeyAndParams6 = passKeyAndParams4;
                                SecretKey passwordKey8 = passKeyAndParams5.getPasswordKey();
                                Object obj7 = objE;
                                iy.h.a.c cVar8 = new iy.h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                                c5628a.f213003d = vq.j.a(params6);
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar11);
                                c5628a.f213006g = bVar12;
                                c5628a.f213007h = decryptedUserKeyData4;
                                c5628a.f213008j = bVar12;
                                c5628a.f213009k = vq.j.a(passKeyAndParams6);
                                c5628a.f213010l = vq.j.a(secretKey2);
                                c5628a.f213011m = passKeyAndParams5;
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i27;
                                c5628a.f213016s = i28;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 5;
                                objC = gVar8.c(secretKey2, passwordKey8, cVar8, c5628a);
                                obj = obj7;
                                if (objC == obj) {
                                    return obj;
                                }
                                i29 = i27;
                                passKeyAndParams7 = passKeyAndParams6;
                                bVar13 = bVar11;
                                params7 = params6;
                                decryptedUserKeyData5 = decryptedUserKeyData4;
                                passKeyAndParams8 = passKeyAndParams5;
                                objA = objC;
                                bVar14 = bVar12;
                                byte[] bArr5 = (byte[]) bVar12.a((dx.i) objA);
                                qg0.a.Params params15 = params7;
                                f fVar8 = this.encryptAndSaveUserKeyDataUC;
                                PassKeyAndParams passKeyAndParams15 = passKeyAndParams8;
                                obj2 = obj;
                                f.Params aVar6 = new f.Params(new DecryptedUserKeyData(c0.f(bArr5), passKeyAndParams15.getKeyParams(), decryptedUserKeyData5.getDeviceKey()));
                                c5628a.f213003d = vq.j.a(params15);
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar13);
                                c5628a.f213006g = bVar14;
                                c5628a.f213007h = vq.j.a(decryptedUserKeyData5);
                                c5628a.f213008j = bVar14;
                                c5628a.f213009k = vq.j.a(passKeyAndParams7);
                                c5628a.f213010l = vq.j.a(secretKey2);
                                c5628a.f213011m = vq.j.a(passKeyAndParams15);
                                c5628a.f213012n = vq.j.a(bArr5);
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i29;
                                c5628a.f213016s = i28;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 6;
                                objA = fVar8.e(aVar6, c5628a);
                                if (objA == obj2) {
                                    return obj2;
                                }
                                bVar14.a((dx.i) objA);
                                left = new dx.i.Right(i0.f148189a);
                                if (!(left instanceof dx.i.Left)) {
                                    if (left instanceof dx.i.Right) {
                                        return left;
                                    }
                                    throw new p();
                                }
                                bVar = (dx.b) ((dx.i.Left) left).b();
                                px.d dVar11 = this.logger;
                                if (bVar instanceof dx.b.Generic) {
                                    generic = (dx.b.Generic) bVar;
                                } else {
                                    generic = null;
                                }
                                if (generic != null) {
                                    e15 = generic.getE();
                                } else {
                                    e15 = null;
                                }
                                dVar11.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                                return new dx.i.Left(d());
                            } catch (ex.c e35) {
                                e = e35;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e36) {
                                throw e36;
                            } catch (Exception e37) {
                                e = e37;
                                r15 = jVar4;
                                px.f fVar9 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar9.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                            break;
                        case 5:
                            int i69 = c5628a.f213018v;
                            i15 = c5628a.f213017t;
                            i28 = c5628a.f213016s;
                            int i75 = c5628a.f213015r;
                            i18 = c5628a.f213014q;
                            i19 = c5628a.f213013p;
                            passKeyAndParams8 = (PassKeyAndParams) c5628a.f213011m;
                            secretKey2 = (SecretKey) c5628a.f213010l;
                            passKeyAndParams7 = (PassKeyAndParams) c5628a.f213009k;
                            ex.b bVar25 = (ex.b) c5628a.f213008j;
                            DecryptedUserKeyData decryptedUserKeyData8 = (DecryptedUserKeyData) c5628a.f213007h;
                            ex.b bVar26 = (ex.b) c5628a.f213006g;
                            bVar13 = (ex.b) c5628a.f213005f;
                            dx.j<dx.b> jVar5 = (dx.j) c5628a.f213004e;
                            qg0.a.Params params16 = (qg0.a.Params) c5628a.f213003d;
                            try {
                                u.b(objA);
                                bVar12 = bVar25;
                                jVar = jVar5;
                                decryptedUserKeyData5 = decryptedUserKeyData8;
                                params7 = params16;
                                obj = objE;
                                bVar14 = bVar26;
                                i29 = i75;
                                i25 = i69;
                                byte[] bArr6 = (byte[]) bVar12.a((dx.i) objA);
                                qg0.a.Params params17 = params7;
                                f fVar10 = this.encryptAndSaveUserKeyDataUC;
                                PassKeyAndParams passKeyAndParams16 = passKeyAndParams8;
                                obj2 = obj;
                                f.Params aVar7 = new f.Params(new DecryptedUserKeyData(c0.f(bArr6), passKeyAndParams16.getKeyParams(), decryptedUserKeyData5.getDeviceKey()));
                                c5628a.f213003d = vq.j.a(params17);
                                c5628a.f213004e = jVar;
                                c5628a.f213005f = vq.j.a(bVar13);
                                c5628a.f213006g = bVar14;
                                c5628a.f213007h = vq.j.a(decryptedUserKeyData5);
                                c5628a.f213008j = bVar14;
                                c5628a.f213009k = vq.j.a(passKeyAndParams7);
                                c5628a.f213010l = vq.j.a(secretKey2);
                                c5628a.f213011m = vq.j.a(passKeyAndParams16);
                                c5628a.f213012n = vq.j.a(bArr6);
                                c5628a.f213013p = i19;
                                c5628a.f213014q = i18;
                                c5628a.f213015r = i29;
                                c5628a.f213016s = i28;
                                c5628a.f213017t = i15;
                                c5628a.f213018v = i25;
                                c5628a.f213021y = 6;
                                objA = fVar10.e(aVar7, c5628a);
                                if (objA == obj2) {
                                    return obj2;
                                }
                                bVar14.a((dx.i) objA);
                                left = new dx.i.Right(i0.f148189a);
                                if (!(left instanceof dx.i.Left)) {
                                    if (left instanceof dx.i.Right) {
                                        return left;
                                    }
                                    throw new p();
                                }
                                bVar = (dx.b) ((dx.i.Left) left).b();
                                px.d dVar12 = this.logger;
                                if (bVar instanceof dx.b.Generic) {
                                    generic = (dx.b.Generic) bVar;
                                } else {
                                    generic = null;
                                }
                                if (generic != null) {
                                    e15 = generic.getE();
                                } else {
                                    e15 = null;
                                }
                                dVar12.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                                return new dx.i.Left(d());
                            } catch (ex.c e38) {
                                e = e38;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e39) {
                                throw e39;
                            } catch (Exception e45) {
                                e = e45;
                                r15 = jVar5;
                                px.f fVar11 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar11.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                            break;
                        case 6:
                            bVar14 = (ex.b) c5628a.f213008j;
                            u.b(objA);
                            bVar14.a((dx.i) objA);
                            left = new dx.i.Right(i0.f148189a);
                            if (!(left instanceof dx.i.Left)) {
                                if (left instanceof dx.i.Right) {
                                    return left;
                                }
                                throw new p();
                            }
                            bVar = (dx.b) ((dx.i.Left) left).b();
                            px.d dVar13 = this.logger;
                            if (bVar instanceof dx.b.Generic) {
                                generic = (dx.b.Generic) bVar;
                            } else {
                                generic = null;
                            }
                            if (generic != null) {
                                e15 = generic.getE();
                            } else {
                                e15 = null;
                            }
                            dVar13.T6("ChangeUserPinUC failure", e15, px.c.a(this));
                            return new dx.i.Left(d());
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception e46) {
                    e = e46;
                }
            } catch (CancellationException e47) {
                throw e47;
            }
        } catch (ex.c e48) {
            e = e48;
        } catch (CancellationException e49) {
            throw e49;
        }
    }
}
