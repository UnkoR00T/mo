package b74;

import iy.a0;
import iy.b0;
import iy.f0;
import java.security.Key;
import java.security.KeyStore;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb74/f;", "Lb74/e;", "La74/a;", "userRepository", "Lf10/c;", "masterKeyGenerator", "Liy/t;", "keyStoreProvider", "Lpx/d;", "remoteLogger", "<init>", "(La74/a;Lf10/c;Liy/t;Lpx/d;)V", "Lb74/e$a;", "params", "Ldx/i;", "Ldx/b;", "Lb74/e$b;", "d", "(Lb74/e$a;Ltq/e;)Ljava/lang/Object;", "a", "La74/a;", "b", "Lf10/c;", "c", "Liy/t;", "Lpx/d;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

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
        Object f17082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17086h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f17087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f17088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f17089l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17090m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17091n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f17092p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17093q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17094r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f17095s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f17097v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17095s = obj;
            this.f17097v |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(a74.a aVar, f10.c cVar, iy.t tVar, px.d dVar) {
        this.userRepository = aVar;
        this.masterKeyGenerator = cVar;
        this.keyStoreProvider = tVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(e.Params params, tq.e<? super dx.i<? extends dx.b, ? extends e.b>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        Object obj;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f17097v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17097v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj2 = aVar2.f17095s;
        Object objE = uq.b.e();
        ?? r15 = aVar2.f17097v;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(obj2);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        Object objA = iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null);
                        if (!(objA instanceof dx.i.Left)) {
                            if (!(objA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            Key key = ((KeyStore) ((dx.i.Right) objA).b()).getKey("mobKeyAlias", null);
                            objA = new dx.i.Right(key instanceof SecretKey ? (SecretKey) key : null);
                        }
                        if (objA instanceof dx.i.Left) {
                            obj = e.b.a.f17075a;
                        } else {
                            SecretKey secretKey = (SecretKey) aVar3.a(objA);
                            if (secretKey == null) {
                                aVar3.b(dx.b.j.d.f45088a);
                                throw new oq.g();
                            }
                            px.d dVar = this.remoteLogger;
                            px.d.a aVar4 = px.d.a.GENERAL;
                            dVar.F8("DeviceKey loaded", aVar4);
                            dx.i<dx.b, qy.b> iVarE = this.userRepository.e();
                            if (iVarE instanceof dx.i.Left) {
                                obj = e.b.a.f17075a;
                            } else {
                                a0 value = ((qy.b) aVar3.a(iVarE)).getValue();
                                this.remoteLogger.F8("MasterKey loaded from repository", aVar4);
                                dx.i<dx.b, sy.a> iVarI = this.userRepository.i();
                                if (iVarI instanceof dx.i.Left) {
                                    obj = e.b.a.f17075a;
                                } else {
                                    byte[] data = ((sy.a) aVar3.a(iVarI)).getValue().getData();
                                    this.remoteLogger.F8("KeyParams loaded from repository", aVar4);
                                    f10.c cVar = this.masterKeyGenerator;
                                    b0 password = params.getPassword();
                                    aVar2.f17082d = vq.j.a(params);
                                    aVar2.f17083e = jVarA;
                                    aVar2.f17084f = vq.j.a(aVar3);
                                    aVar2.f17085g = vq.j.a(aVar3);
                                    aVar2.f17086h = vq.j.a(data);
                                    aVar2.f17087j = aVar3;
                                    aVar2.f17088k = vq.j.a(value);
                                    aVar2.f17089l = vq.j.a(secretKey);
                                    aVar2.f17090m = 0;
                                    aVar2.f17091n = 0;
                                    aVar2.f17092p = 0;
                                    aVar2.f17093q = 0;
                                    aVar2.f17094r = 0;
                                    aVar2.f17097v = 1;
                                    Object objD = cVar.d(password, value, data, secretKey, aVar2);
                                    if (objD == objE) {
                                        return objE;
                                    }
                                    bVar = aVar3;
                                    obj2 = objD;
                                }
                            }
                        }
                        return new dx.i.Right(obj);
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r15));
                        dx.i iVarA = r15.a(e);
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
                }
                if (r15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) aVar2.f17087j;
                try {
                    oq.u.b(obj2);
                } catch (ex.c e18) {
                    e = e18;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e19) {
                    throw e19;
                }
                dx.i iVar = (dx.i) obj2;
                if (iVar instanceof dx.i.Left) {
                    obj = e.b.c.f17077a;
                } else {
                    bVar.a(iVar);
                    obj = e.b.C0421b.f17076a;
                }
                return new dx.i.Right(obj);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
