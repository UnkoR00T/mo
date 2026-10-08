package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rn0.BEGradeDetails;
import rn0.BESemesterDetails;
import rn0.BESemesters;
import rn0.BESubjectGrades;
import w94.GradeDetails;
import w94.SemesterDetails;
import w94.SubjectGrades;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpc4/t7;", "", "<init>", "()V", "Ltn0/n;", "getSemestersByParentUC", "Ltn0/l;", "getSemesterDetailsByParentUC", "Ltn0/p;", "getSubjectGradesByParentUC", "Ltn0/h;", "getGradeDetailsByParentUC", "Lv94/a;", "a", "(Ltn0/n;Ltn0/l;Ltn0/p;Ltn0/h;)Lv94/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t7 f156394a = new t7();

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"pc4/t7$a", "Lv94/a;", "", "studentId", "Ldx/i;", "Ldx/b;", "Lw94/e;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Lw94/h;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lw94/l;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "gradeId", "Lw94/a;", "d", "Lu94/a;", "Lu94/a;", "b", "()Lu94/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements v94.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u94.a featureConfig = u94.a.MOBYWATEL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tn0.n f156396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tn0.l f156397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ tn0.p f156398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ tn0.h f156399e;

        /* JADX INFO: renamed from: pc4.t7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3873a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156400d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156401e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f156402f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156404h;

            C3873a(tq.e<? super C3873a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156402f = obj;
                this.f156404h |= PKIFailureInfo.systemUnavail;
                return a.this.d(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156405d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156406e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f156407f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156409h;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156407f = obj;
                this.f156409h |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156410d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f156411e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156413g;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156411e = obj;
                this.f156413g |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156414d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156415e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156416f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f156417g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156419j;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156417g = obj;
                this.f156419j |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, null, null, this);
            }
        }

        a(tn0.n nVar, tn0.l lVar, tn0.p pVar, tn0.h hVar) {
            this.f156396b = nVar;
            this.f156397c = lVar;
            this.f156398d = pVar;
            this.f156399e = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends w94.e>> eVar) throws Throwable {
            c cVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f156413g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f156413g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objA = cVar.f156411e;
            Object objE = uq.b.e();
            int i16 = cVar.f156413g;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.n nVar = this.f156396b;
                if (str == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                cVar.f156410d = vq.j.a(str);
                cVar.f156413g = 1;
                objA = nVar.a(str, cVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(s7.f156199a.e((BESemesters) ((dx.i.Right) iVar).b()));
        }

        @Override // v94.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public u94.a getFeatureConfig() {
            return this.featureConfig;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object c(String str, String str2, tq.e<? super dx.i<? extends dx.b, SemesterDetails>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156409h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156409h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f156407f;
            Object objE = uq.b.e();
            int i16 = bVar.f156409h;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.l lVar = this.f156397c;
                if (str2 == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                bVar.f156405d = vq.j.a(str);
                bVar.f156406e = vq.j.a(str2);
                bVar.f156409h = 1;
                objA = lVar.a(str2, str, bVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(s7.f156199a.h((BESemesterDetails) ((dx.i.Right) iVar).b()));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object d(String str, String str2, tq.e<? super dx.i<? extends dx.b, GradeDetails>> eVar) throws Throwable {
            C3873a c3873a;
            if (eVar instanceof C3873a) {
                c3873a = (C3873a) eVar;
                int i15 = c3873a.f156404h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3873a.f156404h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3873a = new C3873a(eVar);
                }
            } else {
                c3873a = new C3873a(eVar);
            }
            Object objA = c3873a.f156402f;
            Object objE = uq.b.e();
            int i16 = c3873a.f156404h;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.h hVar = this.f156399e;
                if (str2 == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                c3873a.f156400d = vq.j.a(str);
                c3873a.f156401e = vq.j.a(str2);
                c3873a.f156404h = 1;
                objA = hVar.a(str2, str, c3873a);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(s7.f156199a.a((BEGradeDetails) ((dx.i.Right) iVar).b()));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object e(String str, String str2, String str3, tq.e<? super dx.i<? extends dx.b, SubjectGrades>> eVar) throws Throwable {
            d dVar;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f156419j;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f156419j = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objA = dVar.f156417g;
            Object objE = uq.b.e();
            int i16 = dVar.f156419j;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.p pVar = this.f156398d;
                if (str3 == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                dVar.f156414d = vq.j.a(str);
                dVar.f156415e = vq.j.a(str2);
                dVar.f156416f = vq.j.a(str3);
                dVar.f156419j = 1;
                objA = pVar.a(str3, str, str2, dVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(s7.f156199a.l((BESubjectGrades) ((dx.i.Right) iVar).b()));
        }
    }

    private t7() {
    }

    public final v94.a a(tn0.n getSemestersByParentUC, tn0.l getSemesterDetailsByParentUC, tn0.p getSubjectGradesByParentUC, tn0.h getGradeDetailsByParentUC) {
        return new a(getSemestersByParentUC, getSemesterDetailsByParentUC, getSubjectGradesByParentUC, getGradeDetailsByParentUC);
    }
}
