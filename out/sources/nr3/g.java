package nr3;

import cj0.AccessibleZusEVisitDepartments;
import fr.t;
import iy.b0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnr3/g;", "", "Lnr3/g$a;", "Lcj0/a;", "Lac4/a;", "callActionWithLoaderUseCase", "Lkj0/b;", "getAccessibleZusEVisitDepartmentsUseCase", "<init>", "(Lac4/a;Lkj0/b;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lnr3/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lac4/a;", "b", "Lkj0/b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kj0.b getAccessibleZusEVisitDepartmentsUseCase;

    /* JADX INFO: renamed from: nr3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnr3/g$a;", "Lgz/b$a;", "", "topicCode", "Liy/b0;", "postCode", "<init>", "(Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "()Liy/b0;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f138016c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String topicCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 postCode;

        public Params(String str, b0 b0Var) {
            this.topicCode = str;
            this.postCode = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getPostCode() {
            return this.postCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTopicCode() {
            return this.topicCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.topicCode, params.topicCode) && t.c(this.postCode, params.postCode);
        }

        public int hashCode() {
            return (this.topicCode.hashCode() * 31) + this.postCode.hashCode();
        }

        public String toString() {
            return "Params(topicCode=" + this.topicCode + ", postCode=" + this.postCode + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lcj0/a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends AccessibleZusEVisitDepartments>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138019e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f138021g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f138021g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138019e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kj0.b bVar = g.this.getAccessibleZusEVisitDepartmentsUseCase;
            kj0.b.Params params = new kj0.b.Params(this.f138021g.getTopicCode(), this.f138021g.getPostCode());
            this.f138019e = 1;
            Object objC = bVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new b(this.f138021g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, AccessibleZusEVisitDepartments>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public g(ac4.a aVar, kj0.b bVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.getAccessibleZusEVisitDepartmentsUseCase = bVar;
    }

    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, AccessibleZusEVisitDepartments>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, null), eVar, 1, null);
    }
}
