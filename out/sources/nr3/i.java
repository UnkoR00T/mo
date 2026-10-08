package nr3;

import cj0.ZusEVisitTerm;
import fr.t;
import java.util.List;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnr3/i;", "", "Lnr3/i$a;", "", "Lcj0/m;", "Lkj0/e;", "getZusEVisitDepartmentTerms", "Lez/a;", "currentTimeProvider", "Lac4/a;", "callActionWithLoaderUseCase", "Lmx/c;", "labelProvider", "<init>", "(Lkj0/e;Lez/a;Lac4/a;Lmx/c;)V", "Ldx/b;", "Ljb4/f;", "h", "(Ldx/b;)Ljb4/f;", "params", "Ldx/i;", "i", "(Lnr3/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkj0/e;", "b", "Lez/a;", "c", "Lac4/a;", "d", "Lmx/c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kj0.e getZusEVisitDepartmentTerms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: nr3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnr3/i$a;", "Lgz/b$a;", "", "topicId", "", "departmentId", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String topicId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long departmentId;

        public Params(String str, long j15) {
            this.topicId = str;
            this.departmentId = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDepartmentId() {
            return this.departmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTopicId() {
            return this.topicId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.topicId, params.topicId) && this.departmentId == params.departmentId;
        }

        public int hashCode() {
            return (this.topicId.hashCode() * 31) + Long.hashCode(this.departmentId);
        }

        public String toString() {
            return "Params(topicId=" + this.topicId + ", departmentId=" + this.departmentId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldx/i;", "Ldx/b;", "", "Lcj0/m;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends List<? extends ZusEVisitTerm>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138032e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f138034g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f138034g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Label labelC;
            Label labelC2;
            Object objE = uq.b.e();
            int i15 = this.f138032e;
            if (i15 == 0) {
                u.b(obj);
                kj0.e eVar = i.this.getZusEVisitDepartmentTerms;
                kj0.e.Params params = new kj0.e.Params(this.f138034g.getTopicId(), this.f138034g.getDepartmentId(), i.this.currentTimeProvider.c());
                this.f138032e = 1;
                obj = eVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            i iVar2 = i.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (iVar instanceof dx.i.Right) {
                    return new dx.i.Right((List) ((dx.i.Right) iVar).b());
                }
                throw new p();
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            if (!(bVar instanceof dx.b.g.Http)) {
                return new dx.i.Left(bVar);
            }
            PayloadErrorData payloadErrorDataH = iVar2.h(bVar);
            if (!t.c(payloadErrorDataH != null ? payloadErrorDataH.getCode() : null, "ZUS_EVISIT_NO_AVAILABLE_TERMS")) {
                return new dx.i.Left(bVar);
            }
            c cVar = c.ZUS_EVISIT_NO_AVAILABLE_TERMS;
            dx.b.f fVar = dx.b.f.WARNING;
            String title = payloadErrorDataH.getTitle();
            if (title == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
                labelC = iVar2.labelProvider.c(ir3.a.f96802m);
            }
            String message = payloadErrorDataH.getMessage();
            if (message == null || (labelC2 = mx.b.b(message, "errorMessage")) == null) {
                labelC2 = Label.INSTANCE.c();
            }
            return new dx.i.Left(new dx.b.Business(cVar, fVar, labelC, labelC2, null, iVar2.labelProvider.c(ir3.a.B), iVar2.labelProvider.c(ir3.a.f96787h), 16, null));
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new b(this.f138034g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<ZusEVisitTerm>>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public i(kj0.e eVar, ez.a aVar, ac4.a aVar2, mx.c cVar) {
        this.getZusEVisitDepartmentTerms = eVar;
        this.currentTimeProvider = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData h(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    public Object i(Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<ZusEVisitTerm>>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, null), eVar, 1, null);
    }
}
