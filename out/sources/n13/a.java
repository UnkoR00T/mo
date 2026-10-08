package n13;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ln13/a;", "Li13/a;", "Lm13/a;", "emergencyBackpackRepository", "<init>", "(Lm13/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lm13/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i13.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m13.a emergencyBackpackRepository;

    /* JADX INFO: renamed from: n13.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3243a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f130693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f130694e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f130696g;

        C3243a(tq.e<? super C3243a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f130694e = obj;
            this.f130696g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(m13.a aVar) {
        this.emergencyBackpackRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        C3243a c3243a;
        if (eVar instanceof C3243a) {
            c3243a = (C3243a) eVar;
            int i15 = c3243a.f130696g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3243a.f130696g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3243a = new C3243a(eVar);
            }
        } else {
            c3243a = new C3243a(eVar);
        }
        Object obj = c3243a.f130694e;
        Object objE = uq.b.e();
        int i16 = c3243a.f130696g;
        if (i16 == 0) {
            u.b(obj);
            m13.a aVar = this.emergencyBackpackRepository;
            c3243a.f130693d = j.a(c1792a);
            c3243a.f130696g = 1;
            if (aVar.a(c3243a) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
