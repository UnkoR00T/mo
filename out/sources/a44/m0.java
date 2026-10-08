package a44;

import java.util.Comparator;
import java.util.List;
import jr0.DrivingLicenceScope;
import k34.DrivingLicenceScopes;
import k34.UserDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La44/m0;", "Lq34/m0;", "Lp34/a;", "repository", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "<init>", "(Lp34/a;Lq34/x0;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lk34/p;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lp34/a;", "b", "Lq34/x0;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 implements q34.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.x0 getMostImportantUserDocumentDataUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3132h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f3133j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3135l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3133j = obj;
            this.f3135l |= PKIFailureInfo.systemUnavail;
            return m0.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((DrivingLicenceScope) t16).getDrivingLicenceDataContainer().getReleaseDate(), ((DrivingLicenceScope) t15).getDrivingLicenceDataContainer().getReleaseDate());
        }
    }

    public m0(p34.a aVar, q34.x0 x0Var) {
        this.repository = aVar;
        this.getMostImportantUserDocumentDataUseCase = x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, DrivingLicenceScopes>> eVar) throws Throwable {
        a aVar;
        DrivingLicenceScopes drivingLicenceScopes;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3135l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3135l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f3133j;
        Object objE = uq.b.e();
        int i16 = aVar.f3135l;
        if (i16 == 0) {
            oq.u.b(objC);
            dx.i<dx.b, DrivingLicenceScopes> iVarQ = this.repository.Q();
            if (iVarQ instanceof dx.i.Left) {
                return iVarQ;
            }
            if (!(iVarQ instanceof dx.i.Right)) {
                throw new oq.p();
            }
            DrivingLicenceScopes drivingLicenceScopes2 = (DrivingLicenceScopes) ((dx.i.Right) iVarQ).b();
            q34.x0 x0Var = this.getMostImportantUserDocumentDataUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f3128d = vq.j.a(c1792a);
            aVar.f3129e = vq.j.a(iVarQ);
            aVar.f3130f = drivingLicenceScopes2;
            aVar.f3131g = 0;
            aVar.f3132h = 0;
            aVar.f3135l = 1;
            objC = x0Var.c(c1792a2, aVar);
            if (objC == objE) {
                return objE;
            }
            drivingLicenceScopes = drivingLicenceScopes2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DrivingLicenceScopes drivingLicenceScopes3 = (DrivingLicenceScopes) aVar.f3130f;
            oq.u.b(objC);
            drivingLicenceScopes = drivingLicenceScopes3;
        }
        dx.i right = (dx.i) objC;
        if (!(right instanceof dx.i.Left)) {
            if (!(right instanceof dx.i.Right)) {
                throw new oq.p();
            }
            right = new dx.i.Right(iy.c0.e(((UserDocumentData) ((dx.i.Right) right).b()).getPhoto()));
        }
        String str = (String) right.a();
        iy.b0 b0VarG = str != null ? iy.c0.g(str) : null;
        List<DrivingLicenceScope> listE = drivingLicenceScopes.e();
        return new dx.i.Right(DrivingLicenceScopes.b(drivingLicenceScopes, null, null, listE != null ? pq.v.U0(listE, new b()) : null, b0VarG, 3, null));
    }
}
