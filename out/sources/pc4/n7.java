package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rn0.BEBehaviourSemesters;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpc4/n7;", "", "<init>", "()V", "Ltn0/d;", "getBehaviourForStudentByParentUC", "Li94/a;", "a", "(Ltn0/d;)Li94/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n7 f155294a = new n7();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"pc4/n7$a", "Li94/a;", "", "studentId", "Ldx/i;", "Ldx/b;", "Lj94/b;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lh94/a;", "Lh94/a;", "b", "()Lh94/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i94.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h94.a featureConfig = h94.a.MOBYWATEL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tn0.d f155296b;

        /* JADX INFO: renamed from: pc4.n7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3851a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155297d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155298e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155300g;

            C3851a(tq.e<? super C3851a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155298e = obj;
                this.f155300g |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        a(tn0.d dVar) {
            this.f155296b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // i94.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends j94.b>> eVar) throws Throwable {
            C3851a c3851a;
            if (eVar instanceof C3851a) {
                c3851a = (C3851a) eVar;
                int i15 = c3851a.f155300g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3851a.f155300g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3851a = new C3851a(eVar);
                }
            } else {
                c3851a = new C3851a(eVar);
            }
            Object objA = c3851a.f155298e;
            Object objE = uq.b.e();
            int i16 = c3851a.f155300g;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.d dVar = this.f155296b;
                if (str == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                c3851a.f155297d = vq.j.a(str);
                c3851a.f155300g = 1;
                objA = dVar.a(str, c3851a);
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
                return new dx.i.Right(m7.b((BEBehaviourSemesters) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        @Override // i94.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public h94.a getFeatureConfig() {
            return this.featureConfig;
        }
    }

    private n7() {
    }

    public final i94.a a(tn0.d getBehaviourForStudentByParentUC) {
        return new a(getBehaviourForStudentByParentUC);
    }
}
