package b74;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lb74/p;", "Lv64/m;", "Lu64/b;", "repository", "<init>", "(Lu64/b;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lu64/b;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements v64.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u64.b repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f17206e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17208g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17206e = obj;
            this.f17208g |= PKIFailureInfo.systemUnavail;
            return p.this.c(null, this);
        }
    }

    public p(u64.b bVar) {
        this.repository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f17208g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17208g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f17206e;
        Object objE = uq.b.e();
        int i16 = aVar.f17208g;
        if (i16 == 0) {
            oq.u.b(obj);
            u64.b bVar = this.repository;
            aVar.f17205d = vq.j.a(c1792a);
            aVar.f17208g = 1;
            if (bVar.f(aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return i0.f148189a;
    }
}
