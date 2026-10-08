package b74;

import iy.b0;
import iy.f0;
import java.security.Key;
import java.security.KeyStore;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qy.MasterKeyModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb74/g;", "Lv64/a;", "La74/a;", "userRepository", "Lf10/c;", "masterKeyGenerator", "Liy/t;", "keyStoreProvider", "Lpx/d;", "remoteLogger", "<init>", "(La74/a;Lf10/c;Liy/t;Lpx/d;)V", "Lv64/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lv64/a$a;Ltq/e;)Ljava/lang/Object;", "a", "La74/a;", "b", "Lf10/c;", "c", "Liy/t;", "Lpx/d;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements v64.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a74.a userRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f10.c masterKeyGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17106h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f17107j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f17108k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f17109l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17110m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17111n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f17112p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f17113q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f17115s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17113q = obj;
            this.f17115s |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(a74.a aVar, f10.c cVar, iy.t tVar, px.d dVar) {
        this.userRepository = aVar;
        this.masterKeyGenerator = cVar;
        this.keyStoreProvider = tVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(v64.a.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f17115s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17115s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f17113q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f17115s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    Object objA = iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null);
                    if (!(objA instanceof dx.i.Left)) {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        Key key = ((KeyStore) ((dx.i.Right) objA).b()).getKey("mobKeyAlias", null);
                        objA = new dx.i.Right(key instanceof SecretKey ? (SecretKey) key : null);
                    }
                    SecretKey secretKey = (SecretKey) aVar2.a(objA);
                    if (secretKey == null) {
                        aVar2.b(dx.b.j.d.f45088a);
                        throw new oq.g();
                    }
                    this.remoteLogger.F8("DeviceKey loaded", px.d.a.GENERAL);
                    f10.c cVar = this.masterKeyGenerator;
                    b0 newPassword = params.getNewPassword();
                    aVar.f17102d = vq.j.a(params);
                    aVar.f17103e = jVarA;
                    aVar.f17104f = vq.j.a(aVar2);
                    aVar.f17105g = aVar2;
                    aVar.f17106h = aVar2;
                    aVar.f17107j = vq.j.a(secretKey);
                    aVar.f17108k = 0;
                    aVar.f17109l = 0;
                    aVar.f17110m = 0;
                    aVar.f17111n = 0;
                    aVar.f17112p = 0;
                    aVar.f17115s = 1;
                    Object objB2 = cVar.b(newPassword, secretKey, aVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    bVar = aVar2;
                    obj = objB2;
                    bVar2 = bVar;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) aVar.f17106h;
                    bVar = (ex.b) aVar.f17105g;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                MasterKeyModel masterKeyModel = (MasterKeyModel) bVar2.a((dx.i) obj);
                this.remoteLogger.F8("MasterKey encrypted", px.d.a.GENERAL);
                bVar.a(this.userRepository.g(masterKeyModel.getWrappedMasterKey(), masterKeyModel.getEncryptedPasswordData()));
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                dx.i iVarA = r15.a(e16);
                if (iVarA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                } else {
                    if (!(iVarA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarA).b();
                }
                return new dx.i.Left(objB);
            }
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
