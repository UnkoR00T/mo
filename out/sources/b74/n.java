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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006\""}, d2 = {"Lb74/n;", "Lv64/j;", "Lu64/b;", "repository", "La74/a;", "userRepository", "Lz64/b;", "userCommonInteractor", "Lf10/c;", "masterKeyGenerator", "Liy/t;", "keyStoreProvider", "<init>", "(Lu64/b;La74/a;Lz64/b;Lf10/c;Liy/t;)V", "Liy/b0;", "password", "Ldx/i;", "Ldx/b;", "", "e", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lv64/j$a;", "params", "f", "(Lv64/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu64/b;", "b", "La74/a;", "c", "Lz64/b;", "d", "Lf10/c;", "Liy/t;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements v64.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u64.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a74.a userRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z64.b userCommonInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f10.c masterKeyGenerator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17172f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17173g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17174h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f17175j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f17176k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f17177l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17178m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17179n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f17180p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17181q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17182r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f17183s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f17185v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17183s = obj;
            this.f17185v |= PKIFailureInfo.systemUnavail;
            return n.this.e(null, this);
        }
    }

    public n(u64.b bVar, a74.a aVar, z64.b bVar2, f10.c cVar, iy.t tVar) {
        this.repository = bVar;
        this.userRepository = aVar;
        this.userCommonInteractor = bVar2;
        this.masterKeyGenerator = cVar;
        this.keyStoreProvider = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final Object e(b0 b0Var, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f17185v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17185v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f17183s;
        Object objE = uq.b.e();
        ?? r15 = aVar2.f17185v;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(obj);
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
                        SecretKey secretKey = (SecretKey) aVar3.a(objA);
                        if (secretKey == null) {
                            aVar3.b(dx.b.j.d.f45088a);
                            throw new oq.g();
                        }
                        a0 value = ((qy.b) aVar3.a(this.userRepository.e())).getValue();
                        byte[] data = ((sy.a) aVar3.a(this.userRepository.i())).getValue().getData();
                        f10.c cVar = this.masterKeyGenerator;
                        aVar2.f17170d = vq.j.a(b0Var);
                        aVar2.f17171e = jVarA;
                        aVar2.f17172f = vq.j.a(aVar3);
                        aVar2.f17173g = vq.j.a(aVar3);
                        aVar2.f17174h = vq.j.a(data);
                        aVar2.f17175j = aVar3;
                        aVar2.f17176k = vq.j.a(value);
                        aVar2.f17177l = vq.j.a(secretKey);
                        aVar2.f17178m = 0;
                        aVar2.f17179n = 0;
                        aVar2.f17180p = 0;
                        aVar2.f17181q = 0;
                        aVar2.f17182r = 0;
                        aVar2.f17185v = 1;
                        Object objA2 = cVar.a(b0Var, value, data, secretKey, aVar2);
                        if (objA2 == objE) {
                            return objE;
                        }
                        bVar = aVar3;
                        obj = objA2;
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
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar2.f17175j;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(vq.b.a(((Boolean) bVar.a((dx.i) obj)).booleanValue()));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(v64.j.Params params, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return this.userCommonInteractor.a() ? e(params.getPassword(), eVar) : this.repository.j(params.getPassword(), eVar);
    }
}
