package ys0;

import ay.j;
import dx.i;
import er.l;
import fr.q0;
import ge4.x;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import ts0.AuthorizedRequest;
import ts0.DisableRestrictionRequest;
import ts0.Restriction;
import xs0.DisableRestrictionRequestDto;
import xs0.RestrictionDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132.\u0010\u0019\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001c\u0010\u0010J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d0\fH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lys0/b;", "Lat0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lay/j;", "jsonSerializer", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lay/j;)V", "Lts0/a;", "authorizedRequest", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lts0/a;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "challenge", "Ljava/time/OffsetDateTime;", "value", "Lkotlin/Function2;", "Ltq/e;", "Lry/a;", "", "signBase64", "c", "(Liy/b0;Ljava/time/OffsetDateTime;Ler/p;Ltq/e;)Ljava/lang/Object;", "b", "Lts0/f;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lay/j;", "Lvs0/a;", "Loq/k;", "h", "()Lvs0/a;", "client", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements at0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229113e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AuthorizedRequest f229115g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AuthorizedRequest authorizedRequest, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f229115g = authorizedRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229113e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.a aVarH = b.this.h();
            xs0.AuthorizedRequest authorizedRequestT = ws0.a.t(this.f229115g);
            this.f229113e = 1;
            Object objB = aVarH.b(authorizedRequestT, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new a(this.f229115g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ys0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6151b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f229118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f229119g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f229120h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f229121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f229122k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f229123l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f229124m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f229125n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f229126p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f229127q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f229128r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f229129s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f229130t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f229132w;

        C6151b(tq.e<? super C6151b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229130t = obj;
            this.f229132w |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229133e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f229135g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b0 b0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f229135g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229133e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.a aVarH = b.this.h();
            xs0.AuthorizedRequest authorizedRequestT = ws0.a.t(new AuthorizedRequest(this.f229135g));
            this.f229133e = 1;
            Object objD = aVarH.d(authorizedRequestT, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new c(this.f229135g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229136e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AuthorizedRequest f229138g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AuthorizedRequest authorizedRequest, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f229138g = authorizedRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229136e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.a aVarH = b.this.h();
            xs0.AuthorizedRequest authorizedRequestT = ws0.a.t(this.f229138g);
            this.f229136e = 1;
            Object objC = aVarH.c(authorizedRequestT, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(this.f229138g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f229139d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f229141f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229139d = obj;
            this.f229141f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxs0/j;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<RestrictionDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229142e;

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229142e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.a aVarH = b.this.h();
            this.f229142e = 1;
            Object objA = aVarH.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RestrictionDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var, j jVar) {
        this.networkCallMediator = g0Var;
        this.jsonSerializer = jVar;
        this.client = oq.l.a(new er.a() { // from class: ys0.a
            @Override // er.a
            public final Object a() {
                return b.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vs0.a g(w wVar) {
        return (vs0.a) w.b(wVar, null, vs0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vs0.a h() {
        return (vs0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.a
    public Object a(tq.e<? super i<? extends dx.b, Restriction>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f229141f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f229141f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f229139d;
        Object objE = uq.b.e();
        int i16 = eVar2.f229141f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(null);
            eVar2.f229141f = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(ws0.a.d((RestrictionDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // at0.a
    public Object b(AuthorizedRequest authorizedRequest, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new d(authorizedRequest, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // at0.a
    public Object c(b0 b0Var, OffsetDateTime offsetDateTime, er.p<? super b0, ? super tq.e<? super i<? extends dx.b, ry.a>>, ? extends Object> pVar, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        C6151b c6151b;
        Object objB;
        ex.b bVar;
        er.p<? super b0, ? super tq.e<? super i<? extends dx.b, ry.a>>, ? extends Object> pVar2;
        OffsetDateTime offsetDateTime2;
        Object obj;
        int i15;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        b0 b0Var2;
        ex.b bVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        b0 b0Var3;
        ex.b bVar4;
        if (eVar instanceof C6151b) {
            c6151b = (C6151b) eVar;
            int i25 = c6151b.f229132w;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                c6151b.f229132w = i25 - PKIFailureInfo.systemUnavail;
            } else {
                c6151b = new C6151b(eVar);
            }
        } else {
            c6151b = new C6151b(eVar);
        }
        Object objB2 = c6151b.f229130t;
        Object objE = uq.b.e();
        ?? r15 = c6151b.f229132w;
        try {
            try {
                if (r15 == 0) {
                    u.b(objB2);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    b0 b0VarG = c0.g(this.jsonSerializer.b(ws0.a.u(new DisableRestrictionRequest(b0Var, offsetDateTime)), q0.n(DisableRestrictionRequestDto.class)));
                    c6151b.f229116d = vq.j.a(b0Var);
                    c6151b.f229117e = vq.j.a(offsetDateTime);
                    c6151b.f229118f = vq.j.a(pVar);
                    c6151b.f229119g = jVarA;
                    c6151b.f229120h = vq.j.a(aVar);
                    c6151b.f229121j = aVar;
                    c6151b.f229122k = vq.j.a(b0VarG);
                    c6151b.f229123l = aVar;
                    c6151b.f229125n = 0;
                    c6151b.f229126p = 0;
                    c6151b.f229127q = 0;
                    c6151b.f229128r = 0;
                    c6151b.f229129s = 0;
                    c6151b.f229132w = 1;
                    Object objB3 = pVar.B(b0VarG, c6151b);
                    if (objB3 != objE) {
                        i17 = 0;
                        pVar2 = pVar;
                        obj = objB3;
                        b0Var3 = b0Var;
                        offsetDateTime2 = offsetDateTime;
                        bVar = aVar;
                        bVar2 = bVar;
                        b0Var2 = b0VarG;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        i16 = 0;
                        bVar3 = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = c6151b.f229129s;
                        int i27 = c6151b.f229128r;
                        int i28 = c6151b.f229127q;
                        int i29 = c6151b.f229126p;
                        int i35 = c6151b.f229125n;
                        ex.b bVar5 = (ex.b) c6151b.f229123l;
                        b0 b0Var4 = (b0) c6151b.f229122k;
                        bVar = (ex.b) c6151b.f229121j;
                        ex.b bVar6 = (ex.b) c6151b.f229120h;
                        dx.j<dx.b> jVar = (dx.j) c6151b.f229119g;
                        pVar2 = (er.p) c6151b.f229118f;
                        offsetDateTime2 = (OffsetDateTime) c6151b.f229117e;
                        obj = objB2;
                        b0 b0Var5 = (b0) c6151b.f229116d;
                        try {
                            u.b(obj);
                            i15 = i26;
                            jVarA = jVar;
                            bVar2 = bVar6;
                            b0Var2 = b0Var4;
                            bVar3 = bVar5;
                            i16 = i35;
                            i17 = i29;
                            i18 = i28;
                            i19 = i27;
                            b0Var3 = b0Var5;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
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
                            i iVarA = r15.a(e);
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
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) c6151b.f229124m;
                        u.b(objB2);
                    }
                    bVar4.a((i) objB2);
                    return new i.Right(i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                b0 data = ((ry.a) bVar3.a((i) obj)).getData();
                g0 g0Var = this.networkCallMediator;
                OffsetDateTime offsetDateTime3 = offsetDateTime2;
                c cVar = new c(data, null);
                c6151b.f229116d = vq.j.a(b0Var3);
                c6151b.f229117e = vq.j.a(offsetDateTime3);
                c6151b.f229118f = vq.j.a(pVar2);
                c6151b.f229119g = jVarA;
                c6151b.f229120h = vq.j.a(bVar2);
                c6151b.f229121j = vq.j.a(bVar);
                c6151b.f229122k = vq.j.a(data);
                c6151b.f229123l = vq.j.a(b0Var2);
                c6151b.f229124m = bVar;
                c6151b.f229125n = i16;
                c6151b.f229126p = i17;
                c6151b.f229127q = i18;
                c6151b.f229128r = i19;
                c6151b.f229129s = i15;
                c6151b.f229132w = 2;
                objB2 = g0Var.b(cVar, c6151b);
                if (objB2 != objE) {
                    bVar4 = bVar;
                    bVar4.a((i) objB2);
                    return new i.Right(i0.f148189a);
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

    @Override // at0.a
    public Object d(AuthorizedRequest authorizedRequest, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new a(authorizedRequest, null), eVar);
    }
}
