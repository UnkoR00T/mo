package pc4;

import java.time.LocalDate;
import oa4.LessonDetails;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rn0.BELessonDetails;
import rn0.BETimetableWeek;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpc4/w7;", "", "<init>", "()V", "Ltn0/r;", "getTimetableForStudentByParentUC", "Ltn0/j;", "getLessonDetailsByParentUC", "Lna4/a;", "a", "(Ltn0/r;Ltn0/j;)Lna4/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w7 f156606a = new w7();

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"pc4/w7$a", "Lna4/a;", "Ljava/time/LocalDate;", "date", "", "studentId", "Ldx/i;", "Ldx/b;", "Loa4/k;", "a", "(Ljava/time/LocalDate;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "lessonId", "Loa4/b;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lma4/a;", "Lma4/a;", "b", "()Lma4/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements na4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ma4.a featureConfig = ma4.a.MOBYWATEL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tn0.r f156608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tn0.j f156609c;

        /* JADX INFO: renamed from: pc4.w7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3880a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156610d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156611e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f156612f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156614h;

            C3880a(tq.e<? super C3880a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156612f = obj;
                this.f156614h |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156616e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f156617f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156619h;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156617f = obj;
                this.f156619h |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, null, this);
            }
        }

        a(tn0.r rVar, tn0.j jVar) {
            this.f156608b = rVar;
            this.f156609c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // na4.a
        public Object a(LocalDate localDate, String str, tq.e<? super dx.i<? extends dx.b, ? extends oa4.k>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156619h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156619h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f156617f;
            Object objE = uq.b.e();
            int i16 = bVar.f156619h;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.r rVar = this.f156608b;
                if (str == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                bVar.f156615d = vq.j.a(localDate);
                bVar.f156616e = vq.j.a(str);
                bVar.f156619h = 1;
                objA = rVar.a(str, localDate, bVar);
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
            return new dx.i.Right(v7.f156490a.k((BETimetableWeek) ((dx.i.Right) iVar).b()));
        }

        @Override // na4.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public ma4.a getFeatureConfig() {
            return this.featureConfig;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // na4.a
        public Object c(String str, String str2, tq.e<? super dx.i<? extends dx.b, LessonDetails>> eVar) throws Throwable {
            C3880a c3880a;
            if (eVar instanceof C3880a) {
                c3880a = (C3880a) eVar;
                int i15 = c3880a.f156614h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3880a.f156614h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3880a = new C3880a(eVar);
                }
            } else {
                c3880a = new C3880a(eVar);
            }
            Object objA = c3880a.f156612f;
            Object objE = uq.b.e();
            int i16 = c3880a.f156614h;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.j jVar = this.f156609c;
                if (str2 == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                c3880a.f156610d = vq.j.a(str);
                c3880a.f156611e = vq.j.a(str2);
                c3880a.f156614h = 1;
                objA = jVar.a(str2, str, c3880a);
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
            return new dx.i.Right(v7.f156490a.b((BELessonDetails) ((dx.i.Right) iVar).b()));
        }
    }

    private w7() {
    }

    public final na4.a a(tn0.r getTimetableForStudentByParentUC, tn0.j getLessonDetailsByParentUC) {
        return new a(getTimetableForStudentByParentUC, getLessonDetailsByParentUC);
    }
}
