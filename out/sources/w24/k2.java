package w24;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lw24/k2;", "Lk24/m;", "Lv24/a;", "certificateRepository", "<init>", "(Lv24/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k2 implements k24.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209730h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f209731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209734m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209735n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f209736p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209738r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209736p = obj;
            this.f209738r |= PKIFailureInfo.systemUnavail;
            return k2.this.c(null, this);
        }
    }

    public k2(v24.a aVar) {
        this.certificateRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        gz.b.a.C1792a c1792a2;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f209738r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209738r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objE = aVar.f209736p;
        ?? E = uq.b.e();
        int i26 = aVar.f209738r;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objE);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        v24.a aVar3 = this.certificateRepository;
                        aVar.f209726d = vq.j.a(c1792a);
                        aVar.f209727e = jVarA;
                        aVar.f209728f = vq.j.a(aVar2);
                        aVar.f209729g = vq.j.a(aVar2);
                        aVar.f209730h = aVar2;
                        i15 = 0;
                        aVar.f209731j = 0;
                        aVar.f209732k = 0;
                        aVar.f209733l = 0;
                        aVar.f209734m = 0;
                        aVar.f209735n = 0;
                        aVar.f209738r = 1;
                        objE = aVar3.e(true, aVar);
                        if (objE != E) {
                            c1792a2 = c1792a;
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
                        oq.u.b(objE);
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                i16 = aVar.f209735n;
                i17 = aVar.f209734m;
                i15 = aVar.f209733l;
                i18 = aVar.f209732k;
                i19 = aVar.f209731j;
                aVar2 = (ex.b) aVar.f209730h;
                bVar = (ex.b) aVar.f209729g;
                bVar2 = (ex.b) aVar.f209728f;
                jVar = (dx.j) aVar.f209727e;
                c1792a2 = (gz.b.a.C1792a) aVar.f209726d;
                try {
                    oq.u.b(objE);
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
                f24.c cVar = (f24.c) aVar2.a((dx.i) objE);
                v24.a aVar4 = this.certificateRepository;
                f24.b bVar3 = f24.b.INACTIVE;
                aVar.f209726d = vq.j.a(c1792a2);
                aVar.f209727e = jVar;
                aVar.f209728f = vq.j.a(bVar2);
                aVar.f209729g = vq.j.a(bVar);
                aVar.f209730h = vq.j.a(cVar);
                aVar.f209731j = i19;
                aVar.f209732k = i18;
                aVar.f209733l = i15;
                aVar.f209734m = i17;
                aVar.f209735n = i16;
                aVar.f209738r = 2;
                if (aVar4.i(cVar, bVar3, aVar) != E) {
                    return new dx.i.Right(oq.i0.f148189a);
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
