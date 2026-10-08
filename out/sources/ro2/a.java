package ro2;

import dx.i;
import iq0.AnonymousFeatureFlag;
import iq0.AnonymousFeatureFlags;
import java.util.Iterator;
import jq0.h;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qo2.b;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lro2/a;", "Lqo2/b;", "Ljq0/h;", "loadAnonymousFeatureFlagsUseCase", "<init>", "(Ljq0/h;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljq0/h;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h loadAnonymousFeatureFlagsUseCase;

    /* JADX INFO: renamed from: ro2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4473a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f175381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f175382e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f175384g;

        C4473a(e<? super C4473a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f175382e = obj;
            this.f175384g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(h hVar) {
        this.loadAnonymousFeatureFlagsUseCase = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super Boolean> eVar) throws Throwable {
        C4473a c4473a;
        Object next;
        if (eVar instanceof C4473a) {
            c4473a = (C4473a) eVar;
            int i15 = c4473a.f175384g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4473a.f175384g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4473a = new C4473a(eVar);
            }
        } else {
            c4473a = new C4473a(eVar);
        }
        Object objC = c4473a.f175382e;
        Object objE = uq.b.e();
        int i16 = c4473a.f175384g;
        if (i16 == 0) {
            u.b(objC);
            h hVar = this.loadAnonymousFeatureFlagsUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            c4473a.f175381d = j.a(c1792a);
            c4473a.f175384g = 1;
            objC = hVar.c(c1792a2, c4473a);
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
        } while (((AnonymousFeatureFlag) next).getType() != iq0.e.ACTIVATION_BY_JUNIOR);
        AnonymousFeatureFlag anonymousFeatureFlag = (AnonymousFeatureFlag) next;
        return vq.b.a(anonymousFeatureFlag != null ? anonymousFeatureFlag.getFeatureActive() : false);
    }
}
