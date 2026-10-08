package o90;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u80.BEBehaviourSemesters;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo90/p0;", "", "<init>", "()V", "Lw80/e;", "getBehaviourForStudentUC", "Li94/a;", "a", "(Lw80/e;)Li94/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f143457a = new p0();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"o90/p0$a", "Li94/a;", "", "studentId", "Ldx/i;", "Ldx/b;", "Lj94/b;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lh94/a;", "Lh94/a;", "b", "()Lh94/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i94.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h94.a featureConfig = h94.a.MJUNIOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w80.e f143459b;

        /* JADX INFO: renamed from: o90.p0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3558a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143460d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f143461e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f143463g;

            C3558a(tq.e<? super C3558a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143461e = obj;
                this.f143463g |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        a(w80.e eVar) {
            this.f143459b = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // i94.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends j94.b>> eVar) throws Throwable {
            C3558a c3558a;
            if (eVar instanceof C3558a) {
                c3558a = (C3558a) eVar;
                int i15 = c3558a.f143463g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3558a.f143463g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3558a = new C3558a(eVar);
                }
            } else {
                c3558a = new C3558a(eVar);
            }
            Object objC = c3558a.f143461e;
            Object objE = uq.b.e();
            int i16 = c3558a.f143463g;
            if (i16 == 0) {
                oq.u.b(objC);
                w80.e eVar2 = this.f143459b;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                c3558a.f143460d = vq.j.a(str);
                c3558a.f143463g = 1;
                objC = eVar2.c(c1792a, c3558a);
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
                return new dx.i.Right(o0.b((BEBehaviourSemesters) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        @Override // i94.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public h94.a getFeatureConfig() {
            return this.featureConfig;
        }
    }

    private p0() {
    }

    public final i94.a a(w80.e getBehaviourForStudentUC) {
        return new a(getBehaviourForStudentUC);
    }
}
