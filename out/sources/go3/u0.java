package go3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lgo3/u0;", "", "Lgz/b$a$a;", "Loq/i0;", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lbo3/a;", "verificationContainersInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lq34/j0;Lbo3/a;Lmx/c;)V", "Ldx/i;", "Ldx/b;", "Lrq0/b;", "f", "(Ltq/e;)Ljava/lang/Object;", "documentType", "g", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq34/j0;", "b", "Lbo3/a;", "Ldx/b$c;", "c", "Ldx/b$c;", "inactiveDocumentError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q34.j0 getDocumentValidityStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business inactiveDocumentError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f75716d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f75718f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75716d = obj;
            this.f75718f |= PKIFailureInfo.systemUnavail;
            return u0.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75722g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75723h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f75724j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75726l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75724j = obj;
            this.f75726l |= PKIFailureInfo.systemUnavail;
            return u0.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75728e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75730g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75728e = obj;
            this.f75730g |= PKIFailureInfo.systemUnavail;
            return u0.this.g(null, this);
        }
    }

    public u0(q34.j0 j0Var, bo3.a aVar, mx.c cVar) {
        this.getDocumentValidityStatusUseCase = j0Var;
        this.verificationContainersInteractor = aVar;
        this.inactiveDocumentError = new dx.b.Business(co3.a.DOCUMENT_NOT_FOUND, null, cVar.c(un3.b.M), cVar.c(un3.b.N), null, cVar.c(un3.b.f199406d), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tq.e<? super dx.i<? extends dx.b, ? extends rq0.b>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f75718f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f75718f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objE = aVar.f75716d;
        Object objE2 = uq.b.e();
        int i16 = aVar.f75718f;
        if (i16 == 0) {
            oq.u.b(objE);
            bo3.a aVar2 = this.verificationContainersInteractor;
            aVar.f75718f = 1;
            objE = aVar2.e(aVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objE);
        }
        rq0.b bVar = (rq0.b) ((dx.i) objE).a();
        return bVar == null ? new dx.i.Left(this.inactiveDocumentError) : new dx.i.Right(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f75730g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f75730g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f75728e;
        Object objE = uq.b.e();
        int i16 = cVar.f75730g;
        if (i16 == 0) {
            oq.u.b(objC);
            q34.j0 j0Var = this.getDocumentValidityStatusUseCase;
            q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(bVar, null);
            cVar.f75727d = vq.j.a(bVar);
            cVar.f75730g = 1;
            objC = j0Var.c(allDocumentStatus, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ((er0.h) ((dx.i.Right) iVar).b()) == er0.h.ACTIVE ? new dx.i.Right(oq.i0.f148189a) : new dx.i.Left(this.inactiveDocumentError);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r7 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r6, tq.e<? super dx.i<? extends dx.b, oq.i0>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof go3.u0.b
            if (r0 == 0) goto L13
            r0 = r7
            go3.u0$b r0 = (go3.u0.b) r0
            int r1 = r0.f75726l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75726l = r1
            goto L18
        L13:
            go3.u0$b r0 = new go3.u0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f75724j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f75726l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f75721f
            rq0.b r6 = (rq0.b) r6
            java.lang.Object r6 = r0.f75720e
            dx.i r6 = (dx.i) r6
            java.lang.Object r6 = r0.f75719d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L9c
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f75719d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L5a
        L48:
            oq.u.b(r7)
            java.lang.Object r7 = vq.j.a(r6)
            r0.f75719d = r7
            r0.f75726l = r4
            java.lang.Object r7 = r5.f(r0)
            if (r7 != r1) goto L5a
            goto L9b
        L5a:
            dx.i r7 = (dx.i) r7
            boolean r2 = r7 instanceof dx.i.Left
            if (r2 == 0) goto L61
            return r7
        L61:
            boolean r2 = r7 instanceof dx.i.Right
            if (r2 == 0) goto L9f
            r2 = r7
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            rq0.b r2 = (rq0.b) r2
            boolean r4 = r2.e()
            if (r4 != 0) goto L7c
            dx.i$c r6 = new dx.i$c
            oq.i0 r7 = oq.i0.f148189a
            r6.<init>(r7)
            return r6
        L7c:
            java.lang.Object r6 = vq.j.a(r6)
            r0.f75719d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f75720e = r6
            java.lang.Object r6 = vq.j.a(r2)
            r0.f75721f = r6
            r6 = 0
            r0.f75722g = r6
            r0.f75723h = r6
            r0.f75726l = r3
            java.lang.Object r7 = r5.g(r2, r0)
            if (r7 != r1) goto L9c
        L9b:
            return r1
        L9c:
            dx.i r7 = (dx.i) r7
            return r7
        L9f:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.u0.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
