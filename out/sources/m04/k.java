package m04;

import iy.a0;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm04/k;", "Lg04/k;", "Lf04/a;", "repository", "Lf10/b;", "masterKeyCipher", "Liy/a;", "base64Coder", "<init>", "(Lf04/a;Lf10/b;Liy/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Liy/b0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lf04/a;", "b", "Lf10/b;", "c", "Liy/a;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements g04.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f04.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f10.b masterKeyCipher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122275h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f122276j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f122277k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122278l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122279m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122280n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f122281p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122282q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f122283r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f122285t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122283r = obj;
            this.f122285t |= PKIFailureInfo.systemUnavail;
            return k.this.c(null, this);
        }
    }

    public k(f04.a aVar, f10.b bVar, iy.a aVar2) {
        this.repository = aVar;
        this.masterKeyCipher = bVar;
        this.base64Coder = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, b0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        gz.b.a.C1792a c1792a2;
        int i16;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i17;
        int i18;
        int i19;
        ex.b bVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f122285t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f122285t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f122283r;
        Object objE = uq.b.e();
        ?? r15 = aVar.f122285t;
        try {
            try {
                if (r15 == 0) {
                    u.b(objA);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    f04.a aVar3 = this.repository;
                    aVar.f122271d = vq.j.a(c1792a);
                    aVar.f122272e = jVarA;
                    aVar.f122273f = vq.j.a(aVar2);
                    aVar.f122274g = aVar2;
                    aVar.f122275h = aVar2;
                    i16 = 0;
                    aVar.f122278l = 0;
                    aVar.f122279m = 0;
                    aVar.f122280n = 0;
                    aVar.f122281p = 0;
                    aVar.f122282q = 0;
                    aVar.f122285t = 1;
                    objA = aVar3.e(aVar);
                    if (objA != objE) {
                        c1792a2 = c1792a;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        i17 = 0;
                        bVar2 = aVar2;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f122282q;
                        i15 = aVar.f122281p;
                        int i27 = aVar.f122280n;
                        int i28 = aVar.f122279m;
                        int i29 = aVar.f122278l;
                        ex.b bVar4 = (ex.b) aVar.f122275h;
                        ex.b bVar5 = (ex.b) aVar.f122274g;
                        ex.b bVar6 = (ex.b) aVar.f122273f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f122272e;
                        c1792a2 = (gz.b.a.C1792a) aVar.f122271d;
                        try {
                            u.b(objA);
                            i16 = i26;
                            jVarA = jVar;
                            bVar = bVar6;
                            bVar2 = bVar4;
                            aVar2 = bVar5;
                            i17 = i29;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
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
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) aVar.f122275h;
                        u.b(objA);
                    }
                    return new dx.i.Right(c0.g(new String(((a0) bVar3.a((dx.i) objA)).getData(), fu.d.UTF_8)));
                } catch (CancellationException e18) {
                    throw e18;
                }
                String strE = c0.e((b0) bVar2.a((dx.i) objA));
                a0 a0VarF = c0.f((byte[]) aVar2.a(iy.a.c(this.base64Coder, strE, null, 2, null)));
                f10.b bVar7 = this.masterKeyCipher;
                aVar.f122271d = vq.j.a(c1792a2);
                aVar.f122272e = jVarA;
                aVar.f122273f = vq.j.a(bVar);
                aVar.f122274g = vq.j.a(aVar2);
                aVar.f122275h = aVar2;
                aVar.f122276j = vq.j.a(strE);
                aVar.f122277k = vq.j.a(a0VarF);
                aVar.f122278l = i17;
                aVar.f122279m = i18;
                aVar.f122280n = i19;
                aVar.f122281p = i15;
                aVar.f122282q = i16;
                aVar.f122285t = 2;
                objA = bVar7.a(a0VarF, aVar);
                if (objA != objE) {
                    bVar3 = aVar2;
                    return new dx.i.Right(c0.g(new String(((a0) bVar3.a((dx.i) objA)).getData(), fu.d.UTF_8)));
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
