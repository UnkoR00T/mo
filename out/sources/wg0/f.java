package wg0;

import fr.q0;
import fr.t;
import iy.a0;
import iy.c0;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pg0.DecryptedUserKeyData;
import pg0.EncryptedUserKeyData;
import pg0.KeyParamsData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lwg0/f;", "", "Lwg0/f$a;", "Loq/i0;", "Lvg0/a;", "userRepository", "Lay/j;", "jsonSerializer", "Liy/g;", "cipherAes", "<init>", "(Lvg0/a;Lay/j;Liy/g;)V", "Liy/a0;", "salt", "", "iterationCount", "", "d", "(Liy/a0;I)[B", "params", "Ldx/i;", "Ldx/b;", "e", "(Lwg0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvg0/a;", "b", "Lay/j;", "c", "Liy/g;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vg0.a userRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: wg0.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwg0/f$a;", "Lgz/b$a;", "Lpg0/a;", "userKeyData", "<init>", "(Lpg0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpg0/a;", "()Lpg0/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DecryptedUserKeyData userKeyData;

        public Params(DecryptedUserKeyData decryptedUserKeyData) {
            this.userKeyData = decryptedUserKeyData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DecryptedUserKeyData getUserKeyData() {
            return this.userKeyData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.userKeyData, ((Params) other).userKeyData);
        }

        public int hashCode() {
            return this.userKeyData.hashCode();
        }

        public String toString() {
            return "Params(userKeyData=" + this.userKeyData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213065h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213066j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213067k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213068l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f213069m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f213070n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213071p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213072q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213073r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f213074s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f213075t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f213076v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f213078x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213076v = obj;
            this.f213078x |= PKIFailureInfo.systemUnavail;
            return f.this.e(null, this);
        }
    }

    public f(vg0.a aVar, ay.j jVar, iy.g gVar) {
        this.userRepository = aVar;
        this.jsonSerializer = jVar;
        this.cipherAes = gVar;
    }

    private final byte[] d(a0 salt, int iterationCount) {
        return this.jsonSerializer.b(new KeyParamsData(salt, iterationCount), q0.n(KeyParamsData.class)).getBytes(fu.d.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x033b  */
    /* JADX WARN: Code duplicated, block: B:103:0x034c  */
    /* JADX WARN: Code duplicated, block: B:104:0x035a  */
    /* JADX WARN: Code duplicated, block: B:106:0x035e  */
    /* JADX WARN: Code duplicated, block: B:109:0x036b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0280  */
    /* JADX WARN: Code duplicated, block: B:67:0x0281  */
    /* JADX WARN: Code duplicated, block: B:71:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        int i15;
        Object obj;
        int i16;
        int i17;
        Params params2;
        byte[] bArr;
        ex.b bVar2;
        ex.b bVar3;
        iy.h.a.b bVar4;
        dx.j<dx.b> jVar;
        iy.g gVar;
        ex.b bVar5;
        int i18;
        int i19;
        CancellationException e15;
        Params params3;
        Object obj2;
        dx.j<dx.b> jVar2;
        ex.b bVar6;
        ex.b bVar7;
        int i25;
        int i26;
        iy.h.a.b bVar8;
        byte[] bArr2;
        iy.g gVar2;
        byte[] data;
        ex.b bVar9;
        Params params4;
        Object objI;
        ex.b bVar10;
        Object obj3;
        iy.g gVar3;
        int i27;
        ex.b bVar11;
        byte[] bArr3;
        int i28;
        ex.b bVar12;
        int i29;
        int i35;
        iy.h.a.b bVar13;
        int i36;
        ex.b bVar14;
        byte[] bArr4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i37 = bVar.f213078x;
            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f213078x = i37 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f213076v;
        Object objE = uq.b.e();
        int i38 = bVar.f213078x;
        ?? r15 = 4;
        try {
            try {
                try {
                    try {
                        if (i38 == 0) {
                            u.b(objG);
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            aVar = new ex.a();
                            i15 = 0;
                            iy.h.a.b bVar15 = new iy.h.a.b(0, new r.a(0, 1, null), 16, 1, null);
                            iy.g gVar4 = this.cipherAes;
                            byte[] bArrD = d(params.getUserKeyData().getKeyParams().getSalt(), params.getUserKeyData().getKeyParams().getIterationCount());
                            iy.g gVar5 = this.cipherAes;
                            SecretKey deviceKey = params.getUserKeyData().getDeviceKey();
                            bVar.f213061d = params;
                            bVar.f213062e = jVarA;
                            bVar.f213063f = vq.j.a(aVar);
                            bVar.f213064g = aVar;
                            bVar.f213065h = bVar15;
                            bVar.f213066j = aVar;
                            bVar.f213067k = aVar;
                            bVar.f213068l = bArrD;
                            bVar.f213069m = gVar4;
                            bVar.f213071p = 0;
                            bVar.f213072q = 0;
                            bVar.f213073r = 0;
                            bVar.f213074s = 0;
                            bVar.f213075t = 0;
                            bVar.f213078x = 1;
                            Object objI2 = gVar5.i(deviceKey, bVar15, bVar);
                            if (objI2 != objE) {
                                obj = objI2;
                                i16 = 0;
                                i17 = 0;
                                params2 = params;
                                bArr = bArrD;
                                bVar2 = aVar;
                                bVar3 = bVar2;
                                bVar4 = bVar15;
                                jVar = jVarA;
                                gVar = gVar4;
                                bVar5 = bVar3;
                                i18 = 0;
                                i19 = 0;
                            }
                            return objE;
                        }
                        if (i38 != 1) {
                            if (i38 != 2) {
                                if (i38 != 3) {
                                    if (i38 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bArr4 = (byte[]) bVar.f213067k;
                                    bVar14 = (ex.b) bVar.f213066j;
                                    dx.j jVar3 = (dx.j) bVar.f213062e;
                                    u.b(objG);
                                    r15 = jVar3;
                                    try {
                                        this.userRepository.f(new EncryptedUserKeyData(c0.f((byte[]) bVar14.a((dx.i) objG)), c0.f(bArr4)));
                                        return new dx.i.Right(i0.f148189a);
                                    } catch (ex.c e16) {
                                        e = e16;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e17) {
                                        throw e17;
                                    } catch (Exception e18) {
                                        e = e18;
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
                                }
                                int i39 = bVar.f213075t;
                                int i45 = bVar.f213074s;
                                int i46 = bVar.f213073r;
                                int i47 = bVar.f213072q;
                                int i48 = bVar.f213071p;
                                bArr3 = (byte[]) bVar.f213070n;
                                iy.g gVar6 = (iy.g) bVar.f213069m;
                                byte[] bArr5 = (byte[]) bVar.f213068l;
                                ex.b bVar16 = (ex.b) bVar.f213067k;
                                ex.b bVar17 = (ex.b) bVar.f213066j;
                                iy.h.a.b bVar18 = (iy.h.a.b) bVar.f213065h;
                                ex.b bVar19 = (ex.b) bVar.f213064g;
                                ex.b bVar20 = (ex.b) bVar.f213063f;
                                dx.j<dx.b> jVar4 = (dx.j) bVar.f213062e;
                                Params params5 = (Params) bVar.f213061d;
                                try {
                                    u.b(objG);
                                    bVar10 = bVar20;
                                    obj3 = objG;
                                    params4 = params5;
                                    bVar12 = bVar16;
                                    gVar3 = gVar6;
                                    i27 = i48;
                                    bVar11 = bVar19;
                                    i28 = i47;
                                    i29 = i46;
                                    i35 = i45;
                                    bVar13 = bVar18;
                                    i36 = i39;
                                    bVar14 = bVar17;
                                    data = bArr5;
                                    jVar2 = jVar4;
                                    Cipher cipher = (Cipher) bVar12.a((dx.i) obj3);
                                    bVar.f213061d = vq.j.a(params4);
                                    bVar.f213062e = jVar2;
                                    bVar.f213063f = vq.j.a(bVar10);
                                    bVar.f213064g = vq.j.a(bVar11);
                                    bVar.f213065h = vq.j.a(bVar13);
                                    bVar.f213066j = bVar14;
                                    bVar.f213067k = bArr3;
                                    bVar.f213068l = null;
                                    bVar.f213069m = null;
                                    bVar.f213070n = null;
                                    bVar.f213071p = i27;
                                    bVar.f213072q = i28;
                                    bVar.f213073r = i29;
                                    bVar.f213074s = i35;
                                    bVar.f213075t = i36;
                                    bVar.f213078x = 4;
                                    objG = gVar3.g(data, cipher, bVar13, bVar);
                                    if (objG != objE) {
                                        bArr4 = bArr3;
                                        r15 = jVar2;
                                        this.userRepository.f(new EncryptedUserKeyData(c0.f((byte[]) bVar14.a((dx.i) objG)), c0.f(bArr4)));
                                        return new dx.i.Right(i0.f148189a);
                                    }
                                    return objE;
                                } catch (ex.c e19) {
                                    e = e19;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e25) {
                                    throw e25;
                                } catch (Exception e26) {
                                    e = e26;
                                    r15 = jVar4;
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
                            }
                            int i49 = bVar.f213075t;
                            int i55 = bVar.f213074s;
                            int i56 = bVar.f213073r;
                            int i57 = bVar.f213072q;
                            int i58 = bVar.f213071p;
                            bVar3 = (ex.b) bVar.f213066j;
                            iy.h.a.b bVar21 = (iy.h.a.b) bVar.f213065h;
                            bVar6 = (ex.b) bVar.f213064g;
                            bVar7 = (ex.b) bVar.f213063f;
                            jVar2 = (dx.j) bVar.f213062e;
                            params3 = (Params) bVar.f213061d;
                            try {
                                u.b(objG);
                                i25 = i56;
                                bVar8 = bVar21;
                                i19 = i58;
                                i17 = i57;
                                i26 = i55;
                                i15 = i49;
                                obj2 = objG;
                                try {
                                    bArr2 = (byte[]) bVar3.a((dx.i) obj2);
                                    gVar2 = this.cipherAes;
                                    data = params3.getUserKeyData().getWrappedMasterKey().getData();
                                    bVar9 = bVar7;
                                    iy.g gVar7 = this.cipherAes;
                                    params4 = params3;
                                    SecretKey deviceKey2 = params3.getUserKeyData().getDeviceKey();
                                    bVar.f213061d = vq.j.a(params4);
                                    bVar.f213062e = jVar2;
                                    bVar.f213063f = vq.j.a(bVar9);
                                    bVar.f213064g = vq.j.a(bVar6);
                                    bVar.f213065h = bVar8;
                                    bVar.f213066j = bVar6;
                                    bVar.f213067k = bVar6;
                                    bVar.f213068l = data;
                                    bVar.f213069m = gVar2;
                                    bVar.f213070n = bArr2;
                                    bVar.f213071p = i19;
                                    bVar.f213072q = i17;
                                    bVar.f213073r = i25;
                                    bVar.f213074s = i26;
                                    bVar.f213075t = i15;
                                    bVar.f213078x = 3;
                                    objI = gVar7.i(deviceKey2, bVar8, bVar);
                                    if (objI == objE) {
                                        bVar10 = bVar9;
                                        obj3 = objI;
                                        gVar3 = gVar2;
                                        i27 = i19;
                                        bVar11 = bVar6;
                                        bArr3 = bArr2;
                                        i28 = i17;
                                        bVar12 = bVar11;
                                        i29 = i25;
                                        i35 = i26;
                                        bVar13 = bVar8;
                                        i36 = i15;
                                        bVar14 = bVar12;
                                        Cipher cipher2 = (Cipher) bVar12.a((dx.i) obj3);
                                        bVar.f213061d = vq.j.a(params4);
                                        bVar.f213062e = jVar2;
                                        bVar.f213063f = vq.j.a(bVar10);
                                        bVar.f213064g = vq.j.a(bVar11);
                                        bVar.f213065h = vq.j.a(bVar13);
                                        bVar.f213066j = bVar14;
                                        bVar.f213067k = bArr3;
                                        bVar.f213068l = null;
                                        bVar.f213069m = null;
                                        bVar.f213070n = null;
                                        bVar.f213071p = i27;
                                        bVar.f213072q = i28;
                                        bVar.f213073r = i29;
                                        bVar.f213074s = i35;
                                        bVar.f213075t = i36;
                                        bVar.f213078x = 4;
                                        objG = gVar3.g(data, cipher2, bVar13, bVar);
                                        if (objG != objE) {
                                            bArr4 = bArr3;
                                            r15 = jVar2;
                                            this.userRepository.f(new EncryptedUserKeyData(c0.f((byte[]) bVar14.a((dx.i) objG)), c0.f(bArr4)));
                                            return new dx.i.Right(i0.f148189a);
                                        }
                                    }
                                    return objE;
                                } catch (ex.c e27) {
                                    e = e27;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e28) {
                                    e = e28;
                                    throw e;
                                } catch (Exception e29) {
                                    e = e29;
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
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } catch (ex.c e35) {
                                e = e35;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e36) {
                                e = e36;
                                throw e;
                            } catch (Exception e37) {
                                e = e37;
                                r15 = jVar2;
                                px.f fVar4 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar4.d(message, e, px.c.a(r15));
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
                        }
                        obj = objG;
                        int i59 = bVar.f213075t;
                        int i65 = bVar.f213074s;
                        int i66 = bVar.f213073r;
                        i17 = bVar.f213072q;
                        int i67 = bVar.f213071p;
                        iy.g gVar8 = (iy.g) bVar.f213069m;
                        byte[] bArr6 = (byte[]) bVar.f213068l;
                        ex.b bVar22 = (ex.b) bVar.f213067k;
                        ex.b bVar23 = (ex.b) bVar.f213066j;
                        iy.h.a.b bVar24 = (iy.h.a.b) bVar.f213065h;
                        ex.b bVar25 = (ex.b) bVar.f213064g;
                        ex.b bVar26 = (ex.b) bVar.f213063f;
                        jVar = (dx.j) bVar.f213062e;
                        params2 = (Params) bVar.f213061d;
                        try {
                            u.b(obj);
                            i15 = i59;
                            bVar2 = bVar26;
                            i16 = i66;
                            i18 = i65;
                            i19 = i67;
                            bVar3 = bVar23;
                            bArr = bArr6;
                            gVar = gVar8;
                            bVar5 = bVar22;
                            aVar = bVar25;
                            bVar4 = bVar24;
                        } catch (ex.c e38) {
                            e = e38;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e39) {
                            e15 = e39;
                            throw e15;
                        } catch (Exception e45) {
                            e = e45;
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
                                if (iVarA instanceof dx.i.Right) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                        Cipher cipher3 = (Cipher) bVar5.a((dx.i) obj);
                        bVar.f213061d = params2;
                        bVar.f213062e = jVar;
                        bVar.f213063f = vq.j.a(bVar2);
                        bVar.f213064g = aVar;
                        bVar.f213065h = bVar4;
                        bVar.f213066j = bVar3;
                        bVar.f213067k = null;
                        bVar.f213068l = null;
                        bVar.f213069m = null;
                        bVar.f213071p = i19;
                        bVar.f213072q = i17;
                        bVar.f213073r = i16;
                        bVar.f213074s = i18;
                        bVar.f213075t = i15;
                        bVar.f213078x = 2;
                        Object objG2 = gVar.g(bArr, cipher3, bVar4, bVar);
                        if (objG2 != objE) {
                            params3 = params2;
                            obj2 = objG2;
                            jVar2 = jVar;
                            bVar6 = aVar;
                            bVar7 = bVar2;
                            i25 = i16;
                            i26 = i18;
                            bVar8 = bVar4;
                            bArr2 = (byte[]) bVar3.a((dx.i) obj2);
                            gVar2 = this.cipherAes;
                            data = params3.getUserKeyData().getWrappedMasterKey().getData();
                            bVar9 = bVar7;
                            iy.g gVar9 = this.cipherAes;
                            params4 = params3;
                            SecretKey deviceKey3 = params3.getUserKeyData().getDeviceKey();
                            bVar.f213061d = vq.j.a(params4);
                            bVar.f213062e = jVar2;
                            bVar.f213063f = vq.j.a(bVar9);
                            bVar.f213064g = vq.j.a(bVar6);
                            bVar.f213065h = bVar8;
                            bVar.f213066j = bVar6;
                            bVar.f213067k = bVar6;
                            bVar.f213068l = data;
                            bVar.f213069m = gVar2;
                            bVar.f213070n = bArr2;
                            bVar.f213071p = i19;
                            bVar.f213072q = i17;
                            bVar.f213073r = i25;
                            bVar.f213074s = i26;
                            bVar.f213075t = i15;
                            bVar.f213078x = 3;
                            objI = gVar9.i(deviceKey3, bVar8, bVar);
                            if (objI == objE) {
                                bVar10 = bVar9;
                                obj3 = objI;
                                gVar3 = gVar2;
                                i27 = i19;
                                bVar11 = bVar6;
                                bArr3 = bArr2;
                                i28 = i17;
                                bVar12 = bVar11;
                                i29 = i25;
                                i35 = i26;
                                bVar13 = bVar8;
                                i36 = i15;
                                bVar14 = bVar12;
                                Cipher cipher4 = (Cipher) bVar12.a((dx.i) obj3);
                                bVar.f213061d = vq.j.a(params4);
                                bVar.f213062e = jVar2;
                                bVar.f213063f = vq.j.a(bVar10);
                                bVar.f213064g = vq.j.a(bVar11);
                                bVar.f213065h = vq.j.a(bVar13);
                                bVar.f213066j = bVar14;
                                bVar.f213067k = bArr3;
                                bVar.f213068l = null;
                                bVar.f213069m = null;
                                bVar.f213070n = null;
                                bVar.f213071p = i27;
                                bVar.f213072q = i28;
                                bVar.f213073r = i29;
                                bVar.f213074s = i35;
                                bVar.f213075t = i36;
                                bVar.f213078x = 4;
                                objG = gVar3.g(data, cipher4, bVar13, bVar);
                                if (objG != objE) {
                                    bArr4 = bArr3;
                                    r15 = jVar2;
                                    this.userRepository.f(new EncryptedUserKeyData(c0.f((byte[]) bVar14.a((dx.i) objG)), c0.f(bArr4)));
                                    return new dx.i.Right(i0.f148189a);
                                }
                            }
                        }
                        return objE;
                    } catch (ex.c e46) {
                        e = e46;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e47) {
                        e15 = e47;
                        throw e15;
                    } catch (Exception e48) {
                        e = e48;
                        r15 = jVar;
                        px.f fVar6 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar6.d(message, e, px.c.a(r15));
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
                } catch (Exception e49) {
                    e = e49;
                }
            } catch (CancellationException e55) {
                throw e55;
            }
        } catch (ex.c e56) {
            e = e56;
        } catch (CancellationException e57) {
            throw e57;
        }
    }
}
