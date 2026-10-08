package o90;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u80.BEGradeDetails;
import u80.BESemesterDetails;
import u80.BESemesters;
import u80.BESubjectGrades;
import w94.GradeDetails;
import w94.SemesterDetails;
import w94.SubjectGrades;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo90/s0;", "", "<init>", "()V", "Lw80/m;", "getSemestersForStudentUC", "Lw80/k;", "getSemesterDetailsForStudentUC", "Lw80/o;", "getSubjectGradesForStudentUC", "Lw80/g;", "getGradeDetailsForStudentUC", "Lv94/a;", "a", "(Lw80/m;Lw80/k;Lw80/o;Lw80/g;)Lv94/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f143466a = new s0();

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"o90/s0$a", "Lv94/a;", "", "studentId", "Ldx/i;", "Ldx/b;", "Lw94/e;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Lw94/h;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lw94/l;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "gradeId", "Lw94/a;", "d", "Lu94/a;", "Lu94/a;", "b", "()Lu94/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements v94.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u94.a featureConfig = u94.a.MJUNIOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w80.m f143468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w80.k f143469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w80.o f143470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w80.g f143471e;

        /* JADX INFO: renamed from: o90.s0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3559a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143472d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143473e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f143474f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143476h;

            C3559a(tq.e<? super C3559a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143474f = obj;
                this.f143476h |= PKIFailureInfo.systemUnavail;
                return a.this.d(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143477d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143478e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f143479f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143481h;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143479f = obj;
                this.f143481h |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143482d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f143483e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f143485g;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143483e = obj;
                this.f143485g |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143486d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143487e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f143488f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f143489g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f143491j;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143489g = obj;
                this.f143491j |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, null, null, this);
            }
        }

        a(w80.m mVar, w80.k kVar, w80.o oVar, w80.g gVar) {
            this.f143468b = mVar;
            this.f143469c = kVar;
            this.f143470d = oVar;
            this.f143471e = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends w94.e>> eVar) throws Throwable {
            c cVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f143485g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f143485g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f143483e;
            Object objE = uq.b.e();
            int i16 = cVar.f143485g;
            if (i16 == 0) {
                oq.u.b(objC);
                w80.m mVar = this.f143468b;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                cVar.f143482d = vq.j.a(str);
                cVar.f143485g = 1;
                objC = mVar.c(c1792a, cVar);
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
                return new dx.i.Right(r0.e((BESemesters) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
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
                int i15 = bVar.f143481h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f143481h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f143479f;
            Object objE = uq.b.e();
            int i16 = bVar.f143481h;
            if (i16 == 0) {
                oq.u.b(objA);
                w80.k kVar = this.f143469c;
                bVar.f143477d = vq.j.a(str);
                bVar.f143478e = vq.j.a(str2);
                bVar.f143481h = 1;
                objA = kVar.a(str, bVar);
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
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(r0.i((BESemesterDetails) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object d(String str, String str2, tq.e<? super dx.i<? extends dx.b, GradeDetails>> eVar) throws Throwable {
            C3559a c3559a;
            if (eVar instanceof C3559a) {
                c3559a = (C3559a) eVar;
                int i15 = c3559a.f143476h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3559a.f143476h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3559a = new C3559a(eVar);
                }
            } else {
                c3559a = new C3559a(eVar);
            }
            Object objA = c3559a.f143474f;
            Object objE = uq.b.e();
            int i16 = c3559a.f143476h;
            if (i16 == 0) {
                oq.u.b(objA);
                w80.g gVar = this.f143471e;
                c3559a.f143472d = vq.j.a(str);
                c3559a.f143473e = vq.j.a(str2);
                c3559a.f143476h = 1;
                objA = gVar.a(str, c3559a);
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
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(r0.a((BEGradeDetails) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v94.a
        public Object e(String str, String str2, String str3, tq.e<? super dx.i<? extends dx.b, SubjectGrades>> eVar) throws Throwable {
            d dVar;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f143491j;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f143491j = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objA = dVar.f143489g;
            Object objE = uq.b.e();
            int i16 = dVar.f143491j;
            if (i16 == 0) {
                oq.u.b(objA);
                w80.o oVar = this.f143470d;
                dVar.f143486d = vq.j.a(str);
                dVar.f143487e = vq.j.a(str2);
                dVar.f143488f = vq.j.a(str3);
                dVar.f143491j = 1;
                objA = oVar.a(str, str2, dVar);
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
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(r0.m((BESubjectGrades) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }
    }

    private s0() {
    }

    public final v94.a a(w80.m getSemestersForStudentUC, w80.k getSemesterDetailsForStudentUC, w80.o getSubjectGradesForStudentUC, w80.g getGradeDetailsForStudentUC) {
        return new a(getSemestersForStudentUC, getSemesterDetailsForStudentUC, getSubjectGradesForStudentUC, getGradeDetailsForStudentUC);
    }
}
