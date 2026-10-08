package a44;

import fr0.DocumentConfig;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La44/y;", "Lq34/y;", "Lz34/a;", "repository", "Lkr0/a;", "bEFetchDocumentsConfigsUC", "<init>", "(Lz34/a;Lkr0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lfr0/g;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lz34/a;", "b", "Lkr0/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements q34.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z34.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kr0.a bEFetchDocumentsConfigsUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3361f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3363h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3361f = obj;
            this.f3363h |= PKIFailureInfo.systemUnavail;
            return y.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Lfr0/g;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends DocumentConfig>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f3365f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ dx.i<dx.b, List<DocumentConfig>> f3367h;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Lfr0/g;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends DocumentConfig>>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f3368e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f3369f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ dx.i<dx.b, List<DocumentConfig>> f3370g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(y yVar, dx.i<? extends dx.b, ? extends List<DocumentConfig>> iVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f3369f = yVar;
                this.f3370g = iVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f3368e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    z34.a aVar = this.f3369f.repository;
                    List<DocumentConfig> list = (List) ((dx.i.Right) this.f3370g).b();
                    this.f3368e = 1;
                    obj = aVar.d(list, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    return iVar;
                }
                if (iVar instanceof dx.i.Right) {
                    return this.f3370g;
                }
                throw new oq.p();
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f3369f, this.f3370g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(dx.i<? extends dx.b, ? extends List<DocumentConfig>> iVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f3367h = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju.p0 p0Var = (ju.p0) this.f3365f;
            Object objE = uq.b.e();
            int i15 = this.f3364e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0 w0VarB = ju.k.b(p0Var, ju.g1.b(), null, new a(y.this, this.f3367h, null), 2, null);
            this.f3365f = vq.j.a(p0Var);
            this.f3364e = 1;
            Object objI = w0VarB.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = y.this.new b(this.f3367h, eVar);
            bVar.f3365f = obj;
            return bVar;
        }
    }

    public y(z34.a aVar, kr0.a aVar2) {
        this.repository = aVar;
        this.bEFetchDocumentsConfigsUC = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3363h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3363h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f3361f;
        Object objE = uq.b.e();
        int i16 = aVar.f3363h;
        if (i16 == 0) {
            oq.u.b(objC);
            kr0.a aVar2 = this.bEFetchDocumentsConfigsUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f3359d = vq.j.a(c1792a);
            aVar.f3363h = 1;
            objC = aVar2.c(c1792a2, aVar);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
            return objC;
        }
        c1792a = (gz.b.a.C1792a) aVar.f3359d;
        oq.u.b(objC);
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        b bVar = new b(iVar, null);
        aVar.f3359d = vq.j.a(c1792a);
        aVar.f3360e = vq.j.a(iVar);
        aVar.f3363h = 2;
        Object objE2 = ju.q0.e(bVar, aVar);
        return objE2 == objE ? objE : objE2;
    }
}
