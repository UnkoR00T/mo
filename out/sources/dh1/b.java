package dh1;

import dx.i;
import iq0.AnonymousFeatureFlag;
import iq0.AnonymousFeatureFlags;
import java.util.Iterator;
import jq0.h;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ldh1/b;", "Lgz/b;", "Lgz/b$a$a;", "", "Ljq0/h;", "loadAnonymousFeatureFlagsUseCase", "<init>", "(Ljq0/h;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljq0/h;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h loadAnonymousFeatureFlagsUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f42557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f42558e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f42560g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f42558e = obj;
            this.f42560g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(h hVar) {
        this.loadAnonymousFeatureFlagsUseCase = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, e<? super Boolean> eVar) throws Throwable {
        a aVar;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f42560g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f42560g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f42558e;
        Object objE = uq.b.e();
        int i16 = aVar.f42560g;
        if (i16 == 0) {
            u.b(objC);
            h hVar = this.loadAnonymousFeatureFlagsUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f42557d = j.a(c1792a);
            aVar.f42560g = 1;
            objC = hVar.c(c1792a2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return vq.b.a(false);
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        Iterator<T> it = ((AnonymousFeatureFlags) ((i.Right) iVar).b()).a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AnonymousFeatureFlag) next).getType() != iq0.e.SHOW_SEARCH_ICON);
        AnonymousFeatureFlag anonymousFeatureFlag = (AnonymousFeatureFlag) next;
        return vq.b.a(anonymousFeatureFlag != null ? anonymousFeatureFlag.getFeatureActive() : false);
    }
}
