package b74;

import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb74/d;", "Lb74/c;", "Lv64/n;", "generateAndSaveAppActivationKeysUC", "Lpx/d;", "remoteLogger", "Lz64/e;", "userHistoryInteractor", "La74/a;", "userRepository", "<init>", "(Lv64/n;Lpx/d;Lz64/e;La74/a;)V", "Lb74/c$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lb74/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv64/n;", "b", "Lpx/d;", "c", "Lz64/e;", "La74/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v64.n generateAndSaveAppActivationKeysUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z64.e userHistoryInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a74.a userRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17065h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f17066j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f17067k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f17068l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17069m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17070n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f17071p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17073r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17071p = obj;
            this.f17073r |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(v64.n nVar, px.d dVar, z64.e eVar, a74.a aVar) {
        this.generateAndSaveAppActivationKeysUC = nVar;
        this.remoteLogger = dVar;
        this.userHistoryInteractor = eVar;
        this.userRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0199  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(c.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        c.Params params2;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f17073r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17073r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f17071p;
        ?? E = uq.b.e();
        int i26 = aVar.f17073r;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objC);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        v64.n nVar = this.generateAndSaveAppActivationKeysUC;
                        v64.n.Params params3 = new v64.n.Params(params.getPassword());
                        aVar.f17061d = vq.j.a(params);
                        aVar.f17062e = jVarA;
                        aVar.f17063f = vq.j.a(aVar2);
                        aVar.f17064g = aVar2;
                        aVar.f17065h = aVar2;
                        i15 = 0;
                        aVar.f17066j = 0;
                        aVar.f17067k = 0;
                        aVar.f17068l = 0;
                        aVar.f17069m = 0;
                        aVar.f17070n = 0;
                        aVar.f17073r = 1;
                        objC = nVar.c(params3, aVar);
                        if (objC != E) {
                            params2 = params;
                            jVar = jVarA;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(objC);
                        this.remoteLogger.F8("Activation, log stored", px.d.a.GENERAL);
                        return new dx.i.Right(i0.f148189a);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                i16 = aVar.f17070n;
                i17 = aVar.f17069m;
                i18 = aVar.f17068l;
                i15 = aVar.f17067k;
                i19 = aVar.f17066j;
                aVar2 = (ex.b) aVar.f17065h;
                bVar = (ex.b) aVar.f17064g;
                bVar2 = (ex.b) aVar.f17063f;
                jVar = (dx.j) aVar.f17062e;
                params2 = (c.Params) aVar.f17061d;
                try {
                    oq.u.b(objC);
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
                dx.i iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                    px.b.y5(this.remoteLogger, "MasterKey generation error: " + bVar3, null, px.c.a(bVar), 2, null);
                }
                aVar2.a(iVar);
                px.d dVar = this.remoteLogger;
                px.d.a aVar3 = px.d.a.GENERAL;
                dVar.F8("Activation, MasterKey successfully generated", aVar3);
                bVar.a(this.userRepository.f());
                this.remoteLogger.F8("Activation, device name saved", aVar3);
                z64.e eVar2 = this.userHistoryInteractor;
                aVar.f17061d = vq.j.a(params2);
                aVar.f17062e = jVar;
                aVar.f17063f = vq.j.a(bVar2);
                aVar.f17064g = vq.j.a(bVar);
                aVar.f17065h = null;
                aVar.f17066j = i19;
                aVar.f17067k = i15;
                aVar.f17068l = i18;
                aVar.f17069m = i17;
                aVar.f17070n = i16;
                aVar.f17073r = 2;
                if (eVar2.a(aVar) != E) {
                    this.remoteLogger.F8("Activation, log stored", px.d.a.GENERAL);
                    return new dx.i.Right(i0.f148189a);
                }
                return E;
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
