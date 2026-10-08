package nv0;

import dx.i;
import er.l;
import fv0.BEFile;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnv0/a;", "Lgv0/a;", "Lmv0/a;", "repository", "Lnv0/c;", "longPollUC", "<init>", "(Lmv0/a;Lnv0/c;)V", "Lgv0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Lfv0/f;", "e", "(Lgv0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmv0/a;", "b", "Lnv0/c;", "universityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gv0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mv0.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c longPollUC;

    /* JADX INFO: renamed from: nv0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lfv0/f;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C3436a extends k implements l<e<? super i<? extends dx.b, ? extends BEFile>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139091e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ gv0.a.Params f139093g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3436a(gv0.a.Params params, e<? super C3436a> eVar) {
            super(1, eVar);
            this.f139093g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139091e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mv0.a aVar = a.this.repository;
            fv0.c diplomaType = this.f139093g.getDiplomaType();
            fv0.b diplomaSubtype = this.f139093g.getDiplomaSubtype();
            String diplomaUuid = this.f139093g.getDiplomaUuid();
            this.f139091e = 1;
            Object objA = aVar.a(diplomaType, diplomaSubtype, diplomaUuid, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return a.this.new C3436a(this.f139093g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i<? extends dx.b, BEFile>> eVar) {
            return ((C3436a) M(eVar)).J(i0.f148189a);
        }
    }

    public a(mv0.a aVar, c cVar) {
        this.repository = aVar;
        this.longPollUC = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(gv0.a.Params params, e<? super i<? extends dx.b, BEFile>> eVar) {
        return this.longPollUC.a(new C3436a(params, null), eVar);
    }
}
