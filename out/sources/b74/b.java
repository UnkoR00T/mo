package b74;

import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb74/b;", "Lb74/a;", "Lu64/b;", "repository", "Lz92/g;", "storeLocalAppActivityLogUC", "Lv64/n;", "generateAndSaveAppActivationKeysUC", "Lpx/d;", "remoteLogger", "<init>", "(Lu64/b;Lz92/g;Lv64/n;Lpx/d;)V", "Lb74/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lb74/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu64/b;", "b", "Lz92/g;", "c", "Lv64/n;", "Lpx/d;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b74.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u64.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z92.g storeLocalAppActivityLogUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v64.n generateAndSaveAppActivationKeysUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17047h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f17048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f17049k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f17050l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17051m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f17052n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f17053p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17055r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17053p = obj;
            this.f17055r |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(u64.b bVar, z92.g gVar, v64.n nVar, px.d dVar) {
        this.repository = bVar;
        this.storeLocalAppActivityLogUC = gVar;
        this.generateAndSaveAppActivationKeysUC = nVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f9 A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TryCatch #8 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:34:0x00a0, B:47:0x00f3, B:49:0x00f9, B:51:0x0129, B:53:0x012d, B:54:0x0140), top: B:99:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d A[Catch: Exception -> 0x00a4, c -> 0x00a8, CancellationException -> 0x00ac, TryCatch #8 {c -> 0x00a8, CancellationException -> 0x00ac, Exception -> 0x00a4, blocks: (B:34:0x00a0, B:47:0x00f3, B:49:0x00f9, B:51:0x0129, B:53:0x012d, B:54:0x0140), top: B:99:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x016a  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c A[Catch: Exception -> 0x007a, c -> 0x007e, CancellationException -> 0x0082, TRY_LEAVE, TryCatch #7 {c -> 0x007e, CancellationException -> 0x0082, Exception -> 0x007a, blocks: (B:25:0x0073, B:58:0x0174, B:60:0x017c), top: B:101:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01af  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0205  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00f9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(b74.a.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        dx.j<dx.b> jVar;
        b74.a.Params params2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        dx.i iVar;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        ex.b bVar2;
        dx.j<dx.b> jVar2;
        b74.a.Params params3;
        ex.b bVar3;
        boolean zBooleanValue;
        z92.g gVar;
        z92.g.Params params4;
        boolean z15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i35 = aVar.f17055r;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17055r = i35 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f17053p;
        Object objE = uq.b.e();
        int i36 = aVar.f17055r;
        ?? r15 = 3;
        try {
            try {
                if (i36 == 0) {
                    oq.u.b(objC);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        v64.n nVar = this.generateAndSaveAppActivationKeysUC;
                        v64.n.Params params5 = new v64.n.Params(params.getPassword());
                        aVar.f17043d = params;
                        aVar.f17044e = jVarA;
                        aVar.f17045f = vq.j.a(aVar2);
                        aVar.f17046g = aVar2;
                        i15 = 0;
                        aVar.f17047h = 0;
                        aVar.f17048j = 0;
                        aVar.f17049k = 0;
                        aVar.f17050l = 0;
                        aVar.f17051m = 0;
                        aVar.f17055r = 1;
                        objC = nVar.c(params5, aVar);
                        if (objC != objE) {
                            jVar = jVarA;
                            params2 = params;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            iVar = (dx.i) objC;
                            if (iVar instanceof dx.i.Left) {
                                dx.b bVar4 = (dx.b) ((dx.i.Left) iVar).b();
                                px.b.y5(this.remoteLogger, "MasterKey generation error: " + bVar4, null, px.c.a(aVar2), 2, null);
                            }
                            if (iVar instanceof dx.i.Right) {
                                px.f.f163100a.g("Activation, MasterKey successfully generated", px.c.a(aVar2));
                            }
                            u64.b bVar5 = this.repository;
                            b0 password = params2.getPassword();
                            aVar.f17043d = vq.j.a(params2);
                            aVar.f17044e = jVar;
                            aVar.f17045f = vq.j.a(bVar);
                            aVar.f17046g = aVar2;
                            aVar.f17047h = i15;
                            aVar.f17048j = i19;
                            aVar.f17049k = i18;
                            aVar.f17050l = i17;
                            aVar.f17051m = i16;
                            aVar.f17055r = 2;
                            objC = bVar5.d(password, aVar);
                            if (objC != objE) {
                                i25 = i16;
                                i26 = i17;
                                i27 = i18;
                                i28 = i19;
                                i29 = i15;
                                bVar2 = aVar2;
                                jVar2 = jVar;
                                params3 = params2;
                                bVar3 = bVar;
                                zBooleanValue = ((Boolean) objC).booleanValue();
                                if (zBooleanValue) {
                                    gVar = this.storeLocalAppActivityLogUC;
                                    params4 = new z92.g.Params(y92.f.APP_ACTIVATION, y92.e.INFO, "");
                                    aVar.f17043d = vq.j.a(params3);
                                    aVar.f17044e = jVar2;
                                    aVar.f17045f = vq.j.a(bVar3);
                                    aVar.f17046g = bVar2;
                                    aVar.f17047h = i29;
                                    aVar.f17048j = i28;
                                    aVar.f17049k = i27;
                                    aVar.f17050l = i26;
                                    aVar.f17051m = i25;
                                    aVar.f17052n = zBooleanValue;
                                    aVar.f17055r = 3;
                                    if (gVar.c(params4, aVar) != objE) {
                                        z15 = zBooleanValue;
                                        zBooleanValue = z15;
                                    }
                                }
                            }
                        }
                        return objE;
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
                        fVar.d(message != null ? message : "", e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                if (i36 == 1) {
                    i16 = aVar.f17051m;
                    i17 = aVar.f17050l;
                    i18 = aVar.f17049k;
                    i19 = aVar.f17048j;
                    i15 = aVar.f17047h;
                    aVar2 = (ex.b) aVar.f17046g;
                    bVar = (ex.b) aVar.f17045f;
                    jVar = (dx.j) aVar.f17044e;
                    params2 = (b74.a.Params) aVar.f17043d;
                    try {
                        oq.u.b(objC);
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            dx.b bVar6 = (dx.b) ((dx.i.Left) iVar).b();
                            px.b.y5(this.remoteLogger, "MasterKey generation error: " + bVar6, null, px.c.a(aVar2), 2, null);
                        }
                        if (iVar instanceof dx.i.Right) {
                            px.f.f163100a.g("Activation, MasterKey successfully generated", px.c.a(aVar2));
                        }
                        u64.b bVar7 = this.repository;
                        b0 password2 = params2.getPassword();
                        aVar.f17043d = vq.j.a(params2);
                        aVar.f17044e = jVar;
                        aVar.f17045f = vq.j.a(bVar);
                        aVar.f17046g = aVar2;
                        aVar.f17047h = i15;
                        aVar.f17048j = i19;
                        aVar.f17049k = i18;
                        aVar.f17050l = i17;
                        aVar.f17051m = i16;
                        aVar.f17055r = 2;
                        objC = bVar7.d(password2, aVar);
                        if (objC != objE) {
                            i25 = i16;
                            i26 = i17;
                            i27 = i18;
                            i28 = i19;
                            i29 = i15;
                            bVar2 = aVar2;
                            jVar2 = jVar;
                            params3 = params2;
                            bVar3 = bVar;
                            zBooleanValue = ((Boolean) objC).booleanValue();
                            if (zBooleanValue) {
                                gVar = this.storeLocalAppActivityLogUC;
                                params4 = new z92.g.Params(y92.f.APP_ACTIVATION, y92.e.INFO, "");
                                aVar.f17043d = vq.j.a(params3);
                                aVar.f17044e = jVar2;
                                aVar.f17045f = vq.j.a(bVar3);
                                aVar.f17046g = bVar2;
                                aVar.f17047h = i29;
                                aVar.f17048j = i28;
                                aVar.f17049k = i27;
                                aVar.f17050l = i26;
                                aVar.f17051m = i25;
                                aVar.f17052n = zBooleanValue;
                                aVar.f17055r = 3;
                                if (gVar.c(params4, aVar) != objE) {
                                    z15 = zBooleanValue;
                                    zBooleanValue = z15;
                                }
                            }
                        }
                        return objE;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar;
                        px.f fVar2 = px.f.f163100a;
                        String message2 = e.getMessage();
                        fVar2.d(message2 != null ? message2 : "", e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                if (i36 == 2) {
                    int i37 = aVar.f17051m;
                    i26 = aVar.f17050l;
                    i27 = aVar.f17049k;
                    i28 = aVar.f17048j;
                    i29 = aVar.f17047h;
                    ex.b bVar8 = (ex.b) aVar.f17046g;
                    bVar3 = (ex.b) aVar.f17045f;
                    jVar2 = (dx.j) aVar.f17044e;
                    params3 = (b74.a.Params) aVar.f17043d;
                    try {
                        oq.u.b(objC);
                        i25 = i37;
                        bVar2 = bVar8;
                        zBooleanValue = ((Boolean) objC).booleanValue();
                        if (zBooleanValue) {
                            gVar = this.storeLocalAppActivityLogUC;
                            params4 = new z92.g.Params(y92.f.APP_ACTIVATION, y92.e.INFO, "");
                            aVar.f17043d = vq.j.a(params3);
                            aVar.f17044e = jVar2;
                            aVar.f17045f = vq.j.a(bVar3);
                            aVar.f17046g = bVar2;
                            aVar.f17047h = i29;
                            aVar.f17048j = i28;
                            aVar.f17049k = i27;
                            aVar.f17050l = i26;
                            aVar.f17051m = i25;
                            aVar.f17052n = zBooleanValue;
                            aVar.f17055r = 3;
                            if (gVar.c(params4, aVar) != objE) {
                                z15 = zBooleanValue;
                            }
                            return objE;
                        }
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        r15 = jVar2;
                        px.f fVar3 = px.f.f163100a;
                        String message3 = e.getMessage();
                        fVar3.d(message3 != null ? message3 : "", e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                    if (i36 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z15 = aVar.f17052n;
                    bVar2 = (ex.b) aVar.f17046g;
                    try {
                        oq.u.b(objC);
                    } catch (ex.c e29) {
                        e = e29;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    }
                }
                zBooleanValue = z15;
                if (zBooleanValue) {
                    return new dx.i.Right(i0.f148189a);
                }
                bVar2.b(new dx.b.Generic(new IllegalStateException("Activation failed")));
                throw new oq.g();
            } catch (Exception e36) {
                e = e36;
            }
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
