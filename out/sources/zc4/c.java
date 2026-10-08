package zc4;

import dx.i;
import dx.j;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import v64.l;
import vq.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lzc4/c;", "Lzy3/c;", "Lc54/b;", "isFeatureEnabledUseCase", "Lb74/c;", "activateAppUseCase", "Lb74/a;", "activateAppLegacyUseCase", "Lv64/l;", "deactivateAppUseCase", "Lv64/b;", "changeUserPasswordUseCase", "<init>", "(Lc54/b;Lb74/c;Lb74/a;Lv64/l;Lv64/b;)V", "Liy/b0;", "password", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "newPassword", "a", "Lc54/b;", "Lb74/c;", "c", "Lb74/a;", "Lv64/l;", "e", "Lv64/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements zy3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b74.c activateAppUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b74.a activateAppLegacyUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l deactivateAppUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v64.b changeUserPasswordUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f234317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f234318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f234319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f234320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f234321h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f234322j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f234323k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f234324l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f234325m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f234326n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f234328q;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f234326n = obj;
            this.f234328q |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f234329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f234331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f234332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f234333h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f234334j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f234335k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f234336l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f234337m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f234339p;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f234337m = obj;
            this.f234339p |= PKIFailureInfo.systemUnavail;
            return c.this.b(this);
        }
    }

    public c(c54.b bVar, b74.c cVar, b74.a aVar, l lVar, v64.b bVar2) {
        this.isFeatureEnabledUseCase = bVar;
        this.activateAppUseCase = cVar;
        this.activateAppLegacyUseCase = aVar;
        this.deactivateAppUseCase = lVar;
        this.changeUserPasswordUseCase = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [iy.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // zy3.c
    public Object a(b0 b0Var, e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f234328q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f234328q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f234326n;
        Object objE = uq.b.e();
        int i16 = aVar.f234328q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        v64.b bVar = this.changeUserPasswordUseCase;
                        v64.b.Params params = new v64.b.Params(b0Var);
                        aVar.f234317d = vq.j.a(b0Var);
                        aVar.f234318e = jVarA;
                        aVar.f234319f = vq.j.a(aVar2);
                        aVar.f234320g = vq.j.a(aVar2);
                        aVar.f234321h = 0;
                        aVar.f234322j = 0;
                        aVar.f234323k = 0;
                        aVar.f234324l = 0;
                        aVar.f234325m = 0;
                        aVar.f234328q = 1;
                        if (bVar.c(params, aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        b0Var = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(b0Var));
                        i iVarA = b0Var.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tq.e, zc4.c$b] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // zy3.c
    public Object b(e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            b bVar2 = (b) eVar;
            int i15 = bVar2.f234339p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f234339p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar2;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f234337m;
        Object objE = uq.b.e();
        int i16 = bVar.f234339p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l lVar = this.deactivateAppUseCase;
                        l.Params params = new l.Params(t64.a.OFFLINE);
                        bVar.f234334j = jVarA;
                        bVar.f234335k = vq.j.a(aVar);
                        bVar.f234336l = vq.j.a(aVar);
                        bVar.f234329d = 0;
                        bVar.f234330e = 0;
                        bVar.f234331f = 0;
                        bVar.f234332g = 0;
                        bVar.f234333h = 0;
                        bVar.f234339p = 1;
                        if (lVar.c(params, bVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        i iVarA = bVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // zy3.c
    public Object d(b0 b0Var, e<? super i<? extends dx.b, i0>> eVar) {
        return this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue() ? this.activateAppUseCase.c(new b74.c.Params(b0Var), eVar) : this.activateAppLegacyUseCase.c(new b74.a.Params(b0Var), eVar);
    }
}
