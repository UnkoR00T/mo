package nr3;

import cj0.ZusEVisitDetails;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnr3/j;", "", "Lnr3/j$a;", "Lcj0/i;", "Lac4/a;", "callActionWithLoaderUseCase", "Lkj0/f;", "getZusEVisitDetailUseCase", "<init>", "(Lac4/a;Lkj0/f;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lnr3/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lac4/a;", "b", "Lkj0/f;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kj0.f getZusEVisitDetailUseCase;

    /* JADX INFO: renamed from: nr3.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnr3/j$a;", "Lgz/b$a;", "", "visitId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long visitId;

        public Params(long j15) {
            this.visitId = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getVisitId() {
            return this.visitId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.visitId == ((Params) other).visitId;
        }

        public int hashCode() {
            return Long.hashCode(this.visitId);
        }

        public String toString() {
            return "Params(visitId=" + this.visitId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lcj0/i;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends ZusEVisitDetails>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138038e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f138040g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f138040g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138038e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kj0.f fVar = j.this.getZusEVisitDetailUseCase;
            kj0.f.Params params = new kj0.f.Params(this.f138040g.getVisitId());
            this.f138038e = 1;
            Object objC = fVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new b(this.f138040g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ZusEVisitDetails>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public j(ac4.a aVar, kj0.f fVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.getZusEVisitDetailUseCase = fVar;
    }

    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, ZusEVisitDetails>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, null), eVar, 1, null);
    }
}
