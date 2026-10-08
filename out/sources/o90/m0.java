package o90;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s84.AttendanceStatusDetails;
import u80.BEAttendanceStatusDetails;
import u80.BEAttendanceSummary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo90/m0;", "", "<init>", "()V", "Lw80/c;", "getAttendanceSummaryForStudentUC", "Lw80/a;", "getAttendanceStatusDetailsForStudentUC", "Lr84/a;", "a", "(Lw80/c;Lw80/a;)Lr84/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f143441a = new m0();

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"o90/m0$a", "Lr84/a;", "", "studentId", "Ldx/i;", "Ldx/b;", "Ls84/f;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Ls84/c;", "status", "Ls84/d;", "c", "(Ljava/lang/String;Ljava/lang/String;Ls84/c;Ltq/e;)Ljava/lang/Object;", "Lq84/a;", "Lq84/a;", "b", "()Lq84/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r84.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q84.a featureConfig = q84.a.MJUNIOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w80.c f143443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w80.a f143444c;

        /* JADX INFO: renamed from: o90.m0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3557a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143445d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143446e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f143447f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f143448g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f143450j;

            C3557a(tq.e<? super C3557a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143448g = obj;
                this.f143450j |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143451d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f143452e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f143454g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143452e = obj;
                this.f143454g |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        a(w80.c cVar, w80.a aVar) {
            this.f143443b = cVar;
            this.f143444c = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r84.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends s84.f>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f143454g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f143454g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f143452e;
            Object objE = uq.b.e();
            int i16 = bVar.f143454g;
            if (i16 == 0) {
                oq.u.b(objC);
                w80.c cVar = this.f143443b;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                bVar.f143451d = vq.j.a(str);
                bVar.f143454g = 1;
                objC = cVar.c(c1792a, bVar);
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
                return new dx.i.Right(l0.f((BEAttendanceSummary) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        @Override // r84.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public q84.a getFeatureConfig() {
            return this.featureConfig;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r84.a
        public Object c(String str, String str2, s84.c cVar, tq.e<? super dx.i<? extends dx.b, AttendanceStatusDetails>> eVar) throws Throwable {
            C3557a c3557a;
            if (eVar instanceof C3557a) {
                c3557a = (C3557a) eVar;
                int i15 = c3557a.f143450j;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3557a.f143450j = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3557a = new C3557a(eVar);
                }
            } else {
                c3557a = new C3557a(eVar);
            }
            Object objA = c3557a.f143448g;
            Object objE = uq.b.e();
            int i16 = c3557a.f143450j;
            if (i16 == 0) {
                oq.u.b(objA);
                w80.a aVar = this.f143444c;
                u80.b bVarG = l0.g(cVar);
                c3557a.f143445d = vq.j.a(str);
                c3557a.f143446e = vq.j.a(str2);
                c3557a.f143447f = vq.j.a(cVar);
                c3557a.f143450j = 1;
                objA = aVar.a(bVarG, str2, c3557a);
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
                return new dx.i.Right(l0.d((BEAttendanceStatusDetails) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }
    }

    private m0() {
    }

    public final r84.a a(w80.c getAttendanceSummaryForStudentUC, w80.a getAttendanceStatusDetailsForStudentUC) {
        return new a(getAttendanceSummaryForStudentUC, getAttendanceStatusDetailsForStudentUC);
    }
}
