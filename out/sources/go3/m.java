package go3;

import co3.EncodedDocumentWithAdditionalScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgo3/m;", "", "Lgo3/m$a;", "Lco3/b;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "Lk34/a0;", "scope", "", "documentId", "Ldx/i;", "Ldx/b;", "j", "(Lk34/a0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "k", "id", "l", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "i", "m", "params", "n", "(Lgo3/m$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.m$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgo3/m$a;", "Lgz/b$a;", "Lco3/n;", "subDocument", "Loq/r;", "Lk34/a0;", "scope", "<init>", "(Lco3/n;Loq/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/n;", "b", "()Lco3/n;", "Loq/r;", "()Loq/r;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(co3.n nVar, oq.r<? extends k34.a0, ? extends k34.a0> rVar) {
            this.subDocument = nVar;
            this.scope = rVar;
        }

        public final oq.r<k34.a0, k34.a0> a() {
            return this.scope;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.subDocument, params.subDocument) && fr.t.c(this.scope, params.scope);
        }

        public int hashCode() {
            return (this.subDocument.hashCode() * 31) + this.scope.hashCode();
        }

        public String toString() {
            return "Params(subDocument=" + this.subDocument + ", scope=" + this.scope + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75589e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75591g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75589e = obj;
            this.f75591g |= PKIFailureInfo.systemUnavail;
            return m.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75594f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75596h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75594f = obj;
            this.f75596h |= PKIFailureInfo.systemUnavail;
            return m.this.j(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75599f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75601h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75599f = obj;
            this.f75601h |= PKIFailureInfo.systemUnavail;
            return m.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75603e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75605g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75603e = obj;
            this.f75605g |= PKIFailureInfo.systemUnavail;
            return m.this.l(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75607e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75609g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75607e = obj;
            this.f75609g |= PKIFailureInfo.systemUnavail;
            return m.this.m(null, this);
        }
    }

    public m(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, tq.e<? super dx.i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f75591g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75591g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objN = bVar.f75589e;
        Object objE = uq.b.e();
        int i16 = bVar.f75591g;
        if (i16 == 0) {
            oq.u.b(objN);
            bo3.a aVar = this.verificationContainersInteractor;
            bVar.f75588d = vq.j.a(str);
            bVar.f75591g = 1;
            objN = aVar.n(str, bVar);
            if (objN == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objN);
        }
        dx.i iVar = (dx.i) objN;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new EncodedDocumentWithAdditionalScope((String) ((dx.i.Right) iVar).b(), null, 2, null));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f75596h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f75596h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f75594f;
        Object objE = uq.b.e();
        int i16 = cVar.f75596h;
        if (i16 == 0) {
            oq.u.b(objB);
            bo3.a aVar = this.verificationContainersInteractor;
            cVar.f75592d = vq.j.a(a0Var);
            cVar.f75593e = vq.j.a(str);
            cVar.f75596h = 1;
            objB = aVar.B(a0Var, str, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new EncodedDocumentWithAdditionalScope((String) ((dx.i.Right) iVar).b(), null, 2, null));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f75601h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f75601h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objO = dVar.f75599f;
        Object objE = uq.b.e();
        int i16 = dVar.f75601h;
        if (i16 == 0) {
            oq.u.b(objO);
            bo3.a aVar = this.verificationContainersInteractor;
            dVar.f75597d = vq.j.a(a0Var);
            dVar.f75598e = vq.j.a(str);
            dVar.f75601h = 1;
            objO = aVar.o(a0Var, str, dVar);
            if (objO == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objO);
        }
        dx.i iVar = (dx.i) objO;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new EncodedDocumentWithAdditionalScope((String) ((dx.i.Right) iVar).b(), null, 2, null));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, tq.e<? super dx.i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f75605g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f75605g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objP = eVar2.f75603e;
        Object objE = uq.b.e();
        int i16 = eVar2.f75605g;
        if (i16 == 0) {
            oq.u.b(objP);
            bo3.a aVar = this.verificationContainersInteractor;
            k34.a0.i iVar = k34.a0.i.f107870a;
            eVar2.f75602d = vq.j.a(str);
            eVar2.f75605g = 1;
            objP = aVar.p(iVar, str, eVar2);
            if (objP == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objP);
        }
        dx.i iVar2 = (dx.i) objP;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(new EncodedDocumentWithAdditionalScope((String) ((dx.i.Right) iVar2).b(), null, 2, null));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, tq.e<? super dx.i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f75609g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f75609g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objP = fVar.f75607e;
        Object objE = uq.b.e();
        int i16 = fVar.f75609g;
        if (i16 == 0) {
            oq.u.b(objP);
            bo3.a aVar = this.verificationContainersInteractor;
            k34.a0.x0 x0Var = k34.a0.x0.f107901a;
            fVar.f75606d = vq.j.a(str);
            fVar.f75609g = 1;
            objP = aVar.p(x0Var, str, fVar);
            if (objP == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objP);
        }
        dx.i iVar = (dx.i) objP;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new EncodedDocumentWithAdditionalScope((String) ((dx.i.Right) iVar).b(), null, 2, null));
        }
        throw new oq.p();
    }

    public Object n(Params params, tq.e<? super dx.i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) {
        co3.n subDocument = params.getSubDocument();
        if (subDocument instanceof co3.n.DiiaDocument) {
            return i(((co3.n.DiiaDocument) params.getSubDocument()).getId(), eVar);
        }
        if (subDocument instanceof co3.n.KdrDocument) {
            return l(((co3.n.KdrDocument) params.getSubDocument()).getId(), eVar);
        }
        if (subDocument instanceof co3.n.RailwayDocument) {
            return m(((co3.n.RailwayDocument) params.getSubDocument()).getId(), eVar);
        }
        if (subDocument instanceof co3.n.DynamicDocument) {
            return j(params.a().c(), ((co3.n.DynamicDocument) params.getSubDocument()).getId(), eVar);
        }
        if (subDocument instanceof co3.n.d) {
            return k(params.a().c(), ((co3.n.d) params.getSubDocument()).getId(), eVar);
        }
        return new dx.i.Left(new dx.b.Generic(new Exception("There's no family document for " + params.getSubDocument())));
    }
}
