package o90;

import java.time.LocalDate;
import oa4.LessonDetails;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u80.BELessonDetails;
import u80.BETimetableWeek;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo90/v0;", "", "<init>", "()V", "Lw80/q;", "getTimetableForStudentUC", "Lw80/i;", "getLessonDetailsForStudentUC", "Lna4/a;", "a", "(Lw80/q;Lw80/i;)Lna4/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f143498a = new v0();

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"o90/v0$a", "Lna4/a;", "Ljava/time/LocalDate;", "date", "", "studentId", "Ldx/i;", "Ldx/b;", "Loa4/k;", "a", "(Ljava/time/LocalDate;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "lessonId", "Loa4/b;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lma4/a;", "Lma4/a;", "b", "()Lma4/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements na4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ma4.a featureConfig = ma4.a.MJUNIOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w80.q f143500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w80.i f143501c;

        /* JADX INFO: renamed from: o90.v0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3560a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143502d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143503e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f143504f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143506h;

            C3560a(tq.e<? super C3560a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143504f = obj;
                this.f143506h |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143507d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143508e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f143509f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143511h;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143509f = obj;
                this.f143511h |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, null, this);
            }
        }

        a(w80.q qVar, w80.i iVar) {
            this.f143500b = qVar;
            this.f143501c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // na4.a
        public Object a(LocalDate localDate, String str, tq.e<? super dx.i<? extends dx.b, ? extends oa4.k>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f143511h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f143511h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f143509f;
            Object objE = uq.b.e();
            int i16 = bVar.f143511h;
            if (i16 == 0) {
                oq.u.b(objA);
                w80.q qVar = this.f143500b;
                bVar.f143507d = vq.j.a(localDate);
                bVar.f143508e = vq.j.a(str);
                bVar.f143511h = 1;
                objA = qVar.a(localDate, bVar);
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
            return new dx.i.Right(u0.f143492a.k((BETimetableWeek) ((dx.i.Right) iVar).b()));
        }

        @Override // na4.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public ma4.a getFeatureConfig() {
            return this.featureConfig;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // na4.a
        public Object c(String str, String str2, tq.e<? super dx.i<? extends dx.b, LessonDetails>> eVar) throws Throwable {
            C3560a c3560a;
            if (eVar instanceof C3560a) {
                c3560a = (C3560a) eVar;
                int i15 = c3560a.f143506h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3560a.f143506h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3560a = new C3560a(eVar);
                }
            } else {
                c3560a = new C3560a(eVar);
            }
            Object objA = c3560a.f143504f;
            Object objE = uq.b.e();
            int i16 = c3560a.f143506h;
            if (i16 == 0) {
                oq.u.b(objA);
                w80.i iVar = this.f143501c;
                c3560a.f143502d = vq.j.a(str);
                c3560a.f143503e = vq.j.a(str2);
                c3560a.f143506h = 1;
                objA = iVar.a(str, c3560a);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar2 = (dx.i) objA;
            if (iVar2 instanceof dx.i.Left) {
                return iVar2;
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(u0.f143492a.b((BELessonDetails) ((dx.i.Right) iVar2).b()));
        }
    }

    private v0() {
    }

    public final na4.a a(w80.q getTimetableForStudentUC, w80.i getLessonDetailsForStudentUC) {
        return new a(getTimetableForStudentUC, getLessonDetailsForStudentUC);
    }
}
