package l61;

import i61.ChildPassportApplicationDraft;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ll61/o;", "Lgz/b;", "Lgz/b$a$a;", "", "Ll61/l;", "getChildPassportApplicationDraftUC", "<init>", "(Ll61/l;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ll61/l;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l getChildPassportApplicationDraftUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f116456e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116458g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116456e = obj;
            this.f116458g |= PKIFailureInfo.systemUnavail;
            return o.this.a(null, this);
        }
    }

    public o(l lVar) {
        this.getChildPassportApplicationDraftUC = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f116458g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f116458g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f116456e;
        Object objE = uq.b.e();
        int i16 = aVar.f116458g;
        if (i16 == 0) {
            oq.u.b(objA);
            l lVar = this.getChildPassportApplicationDraftUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f116455d = vq.j.a(c1792a);
            aVar.f116458g = 1;
            objA = lVar.a(c1792a2, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
        }
        ChildPassportApplicationDraft childPassportApplicationDraft = (ChildPassportApplicationDraft) ((dx.i) objA).a();
        return vq.b.a((childPassportApplicationDraft != null ? childPassportApplicationDraft.getApplicationId() : null) != null);
    }
}
