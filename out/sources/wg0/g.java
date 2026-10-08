package wg0;

import iy.r;
import iy.s;
import javax.crypto.SecretKey;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import py.KeyStoreKeySpec;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 42\u00020\u0001:\u0001%BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"0\u00182\u0006\u0010!\u001a\u00020 H\u0096B¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lwg0/g;", "Lqg0/e;", "Liy/g;", "cipherAes", "Lpy/b;", "aesKeyGenerator", "Lrg0/a;", "appSessionManager", "Lwg0/d;", "createPassKeyAndParamsUC", "Lwg0/f;", "encryptAndSaveUserKeyDataUC", "Lpy/i;", "keyStoreAesKeyGenerator", "Lpx/d;", "logger", "Liy/s;", "keyInspector", "Lmx/c;", "labelProvider", "<init>", "(Liy/g;Lpy/b;Lrg0/a;Lwg0/d;Lwg0/f;Lpy/i;Lpx/d;Liy/s;Lmx/c;)V", "", "alias", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "e", "()Ldx/b$c;", "Lqg0/e$a;", "params", "Loq/i0;", "g", "(Lqg0/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/g;", "b", "Lpy/b;", "c", "Lrg0/a;", "d", "Lwg0/d;", "Lwg0/f;", "Lpy/i;", "Lpx/d;", "h", "Liy/s;", "i", "Lmx/c;", "j", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements qg0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rg0.a appSessionManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d createPassKeyAndParamsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f encryptAndSaveUserKeyDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final py.i keyStoreAesKeyGenerator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final px.d logger;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s keyInspector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f213092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f213093h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f213094j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213096l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213094j = obj;
            this.f213096l |= PKIFailureInfo.systemUnavail;
            return g.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213101h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213102j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213103k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213104l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f213105m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213106n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213107p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213108q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f213109r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f213110s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f213111t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f213113w;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213111t = obj;
            this.f213113w |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(iy.g gVar, py.b bVar, rg0.a aVar, d dVar, f fVar, py.i iVar, px.d dVar2, s sVar, mx.c cVar) {
        this.cipherAes = gVar;
        this.aesKeyGenerator = bVar;
        this.appSessionManager = aVar;
        this.createPassKeyAndParamsUC = dVar;
        this.encryptAndSaveUserKeyDataUC = fVar;
        this.keyStoreAesKeyGenerator = iVar;
        this.logger = dVar2;
        this.keyInspector = sVar;
        this.labelProvider = cVar;
    }

    private final dx.b.Business e() {
        return new dx.b.Business(pg0.d.SET_PIN_ERROR, null, this.labelProvider.c(og0.a.f145334c), null, null, this.labelProvider.c(og0.a.f145333b), this.labelProvider.c(og0.a.f145332a), 26, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(String str, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) throws Throwable {
        b bVar;
        String str2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f213096l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f213096l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f213094j;
        Object objE = uq.b.e();
        int i16 = bVar.f213096l;
        if (i16 == 0) {
            u.b(objA);
            py.i iVar = this.keyStoreAesKeyGenerator;
            KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec(str, new iy.h.a.b(0, new r.a(0, 1, null), 0, 1, null), 0, null, v.e(py.h.ENCRYPT_AND_DECRYPT), null, false, null, 236, null);
            bVar.f213089d = vq.j.a(str);
            bVar.f213096l = 1;
            objA = iVar.a(keyStoreKeySpec, bVar);
            if (objA != objE) {
                str2 = str;
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dx.i iVar2 = (dx.i) bVar.f213090e;
            u.b(objA);
            return iVar2;
        }
        str2 = (String) bVar.f213089d;
        u.b(objA);
        dx.i iVar3 = (dx.i) objA;
        if (iVar3 instanceof dx.i.Right) {
            SecretKey secretKey = (SecretKey) ((dx.i.Right) iVar3).b();
            s sVar = this.keyInspector;
            bVar.f213089d = vq.j.a(str2);
            bVar.f213090e = iVar3;
            bVar.f213091f = vq.j.a(secretKey);
            bVar.f213092g = 0;
            bVar.f213093h = 0;
            bVar.f213096l = 2;
            if (sVar.d(secretKey, true, bVar) == objE) {
                return objE;
            }
        }
        return iVar3;
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00fd: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:42:0x00fd */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0101: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:44:0x0101 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0105: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:46:0x0105 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(qg0.e.Params r28, tq.e<? super dx.i<? extends dx.b, oq.i0>> r29) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wg0.g.c(qg0.e$a, tq.e):java.lang.Object");
    }
}
