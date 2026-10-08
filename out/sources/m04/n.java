package m04;

import iy.a0;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lm04/n;", "Lg04/o;", "Lf04/a;", "repository", "Lg04/m;", "hashPinUseCase", "Liy/a;", "base64Coder", "Lf10/b;", "masterKeyCipher", "<init>", "(Lf04/a;Lg04/m;Liy/a;Lf10/b;)V", "Lg04/o$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lg04/o$a;Ltq/e;)Ljava/lang/Object;", "a", "Lf04/a;", "b", "Lg04/m;", "c", "Liy/a;", "Lf10/b;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements g04.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f04.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g04.m hashPinUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f10.b masterKeyCipher;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122320h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f122321j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f122322k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f122323l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122324m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122325n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f122326p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122327q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f122328r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f122329s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f122330t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f122332w;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122330t = obj;
            this.f122332w |= PKIFailureInfo.systemUnavail;
            return n.this.c(null, this);
        }
    }

    public n(f04.a aVar, g04.m mVar, iy.a aVar2, f10.b bVar) {
        this.repository = aVar;
        this.hashPinUseCase = mVar;
        this.base64Coder = aVar2;
        this.masterKeyCipher = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0183  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x020a  */
    /* JADX WARN: Code duplicated, block: B:71:0x021b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0229  */
    /* JADX WARN: Code duplicated, block: B:74:0x022d  */
    /* JADX WARN: Code duplicated, block: B:77:0x023a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(g04.o.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        g04.o.Params params2;
        int i15;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        String str;
        ex.b bVar4;
        ex.b bVar5;
        g04.o.Params params3;
        ex.b bVar6;
        String strE;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i29 = aVar.f122332w;
            if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f122332w = i29 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objM = aVar.f122330t;
        Object objE = uq.b.e();
        ?? r15 = aVar.f122332w;
        try {
            try {
                if (r15 == 0) {
                    u.b(objM);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    if (c0.c(params.getPin()) == null) {
                        strE = c0.e(params.getPin());
                        params2 = params;
                        i15 = 0;
                        i19 = 0;
                        i26 = 0;
                        i28 = 0;
                        bVar2 = aVar2;
                        bVar5 = bVar2;
                        i27 = 0;
                        str = strE;
                        f10.b bVar7 = this.masterKeyCipher;
                        a0 a0VarF = c0.f(str.getBytes(fu.d.UTF_8));
                        aVar.f122316d = vq.j.a(params2);
                        aVar.f122317e = jVarA;
                        aVar.f122318f = vq.j.a(bVar5);
                        aVar.f122319g = bVar2;
                        aVar.f122320h = vq.j.a(str);
                        aVar.f122321j = bVar2;
                        aVar.f122324m = i28;
                        aVar.f122325n = i27;
                        aVar.f122326p = i26;
                        aVar.f122327q = i19;
                        aVar.f122328r = i15;
                        aVar.f122329s = 0;
                        aVar.f122332w = 2;
                        objM = bVar7.b(a0VarF, aVar);
                        if (objM == objE) {
                            params3 = params2;
                            i25 = 0;
                            bVar4 = bVar2;
                            a0 a0Var = (a0) bVar2.a((dx.i) objM);
                            g04.o.Params params4 = params3;
                            b0 b0VarG = c0.g(iy.a.e(this.base64Coder, a0Var.getData(), null, 2, null));
                            f04.a aVar3 = this.repository;
                            aVar.f122316d = vq.j.a(params4);
                            aVar.f122317e = jVarA;
                            aVar.f122318f = vq.j.a(bVar5);
                            aVar.f122319g = vq.j.a(bVar4);
                            aVar.f122320h = vq.j.a(str);
                            aVar.f122321j = bVar4;
                            aVar.f122322k = vq.j.a(b0VarG);
                            aVar.f122323l = vq.j.a(a0Var);
                            aVar.f122324m = i28;
                            aVar.f122325n = i27;
                            aVar.f122326p = i26;
                            aVar.f122327q = i19;
                            aVar.f122328r = i15;
                            aVar.f122329s = i25;
                            aVar.f122332w = 3;
                            objM = aVar3.M(b0VarG, aVar);
                            if (objM != objE) {
                                bVar6 = bVar4;
                                bVar6.a((dx.i) objM);
                                return new dx.i.Right(i0.f148189a);
                            }
                        }
                    } else {
                        g04.m mVar = this.hashPinUseCase;
                        b0 pin = params.getPin();
                        aVar.f122316d = vq.j.a(params);
                        aVar.f122317e = jVarA;
                        aVar.f122318f = vq.j.a(aVar2);
                        aVar.f122319g = aVar2;
                        aVar.f122320h = aVar2;
                        aVar.f122324m = 0;
                        aVar.f122325n = 0;
                        aVar.f122326p = 0;
                        aVar.f122327q = 0;
                        aVar.f122328r = 0;
                        aVar.f122332w = 1;
                        objM = mVar.c(pin, aVar);
                        if (objM != objE) {
                            params2 = params;
                            i15 = 0;
                            i19 = 0;
                            i18 = 0;
                            i17 = 0;
                            bVar3 = aVar2;
                            bVar2 = bVar3;
                            bVar = bVar2;
                            i16 = 0;
                        }
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            i25 = aVar.f122329s;
                            int i35 = aVar.f122328r;
                            i19 = aVar.f122327q;
                            i26 = aVar.f122326p;
                            i27 = aVar.f122325n;
                            i28 = aVar.f122324m;
                            bVar2 = (ex.b) aVar.f122321j;
                            str = (String) aVar.f122320h;
                            bVar4 = (ex.b) aVar.f122319g;
                            bVar5 = (ex.b) aVar.f122318f;
                            dx.j<dx.b> jVar = (dx.j) aVar.f122317e;
                            params3 = (g04.o.Params) aVar.f122316d;
                            try {
                                u.b(objM);
                                i15 = i35;
                                jVarA = jVar;
                                a0 a0Var2 = (a0) bVar2.a((dx.i) objM);
                                g04.o.Params params5 = params3;
                                b0 b0VarG2 = c0.g(iy.a.e(this.base64Coder, a0Var2.getData(), null, 2, null));
                                f04.a aVar4 = this.repository;
                                aVar.f122316d = vq.j.a(params5);
                                aVar.f122317e = jVarA;
                                aVar.f122318f = vq.j.a(bVar5);
                                aVar.f122319g = vq.j.a(bVar4);
                                aVar.f122320h = vq.j.a(str);
                                aVar.f122321j = bVar4;
                                aVar.f122322k = vq.j.a(b0VarG2);
                                aVar.f122323l = vq.j.a(a0Var2);
                                aVar.f122324m = i28;
                                aVar.f122325n = i27;
                                aVar.f122326p = i26;
                                aVar.f122327q = i19;
                                aVar.f122328r = i15;
                                aVar.f122329s = i25;
                                aVar.f122332w = 3;
                                objM = aVar4.M(b0VarG2, aVar);
                                if (objM != objE) {
                                    bVar6 = bVar4;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
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
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar6 = (ex.b) aVar.f122321j;
                        u.b(objM);
                        bVar6.a((dx.i) objM);
                        return new dx.i.Right(i0.f148189a);
                    }
                    int i36 = aVar.f122328r;
                    int i37 = aVar.f122327q;
                    int i38 = aVar.f122326p;
                    int i39 = aVar.f122325n;
                    int i45 = aVar.f122324m;
                    ex.b bVar8 = (ex.b) aVar.f122320h;
                    ex.b bVar9 = (ex.b) aVar.f122319g;
                    ex.b bVar10 = (ex.b) aVar.f122318f;
                    dx.j<dx.b> jVar2 = (dx.j) aVar.f122317e;
                    params2 = (g04.o.Params) aVar.f122316d;
                    try {
                        u.b(objM);
                        i15 = i36;
                        jVarA = jVar2;
                        bVar = bVar10;
                        bVar2 = bVar9;
                        bVar3 = bVar8;
                        i16 = i45;
                        i17 = i39;
                        i18 = i38;
                        i19 = i37;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar2;
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
                } catch (CancellationException e26) {
                    throw e26;
                }
                strE = (String) bVar3.a((dx.i) objM);
                i28 = i16;
                bVar5 = bVar;
                i27 = i17;
                i26 = i18;
                str = strE;
                f10.b bVar11 = this.masterKeyCipher;
                a0 a0VarF2 = c0.f(str.getBytes(fu.d.UTF_8));
                aVar.f122316d = vq.j.a(params2);
                aVar.f122317e = jVarA;
                aVar.f122318f = vq.j.a(bVar5);
                aVar.f122319g = bVar2;
                aVar.f122320h = vq.j.a(str);
                aVar.f122321j = bVar2;
                aVar.f122324m = i28;
                aVar.f122325n = i27;
                aVar.f122326p = i26;
                aVar.f122327q = i19;
                aVar.f122328r = i15;
                aVar.f122329s = 0;
                aVar.f122332w = 2;
                objM = bVar11.b(a0VarF2, aVar);
                if (objM == objE) {
                    params3 = params2;
                    i25 = 0;
                    bVar4 = bVar2;
                    a0 a0Var3 = (a0) bVar2.a((dx.i) objM);
                    g04.o.Params params6 = params3;
                    b0 b0VarG3 = c0.g(iy.a.e(this.base64Coder, a0Var3.getData(), null, 2, null));
                    f04.a aVar5 = this.repository;
                    aVar.f122316d = vq.j.a(params6);
                    aVar.f122317e = jVarA;
                    aVar.f122318f = vq.j.a(bVar5);
                    aVar.f122319g = vq.j.a(bVar4);
                    aVar.f122320h = vq.j.a(str);
                    aVar.f122321j = bVar4;
                    aVar.f122322k = vq.j.a(b0VarG3);
                    aVar.f122323l = vq.j.a(a0Var3);
                    aVar.f122324m = i28;
                    aVar.f122325n = i27;
                    aVar.f122326p = i26;
                    aVar.f122327q = i19;
                    aVar.f122328r = i15;
                    aVar.f122329s = i25;
                    aVar.f122332w = 3;
                    objM = aVar5.M(b0VarG3, aVar);
                    if (objM != objE) {
                        bVar6 = bVar4;
                        bVar6.a((dx.i) objM);
                        return new dx.i.Right(i0.f148189a);
                    }
                }
                return objE;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
