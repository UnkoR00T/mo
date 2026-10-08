package l61;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll61/u;", "Lgz/b;", "Lgz/b$a$a;", "Loq/i0;", "Le61/b;", "repository", "Lez/a;", "currentTimeProvider", "<init>", "(Le61/b;Lez/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Le61/b;", "b", "Lez/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements gz.b<gz.b.a.C1792a, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e61.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f116481e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116483g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116481e = obj;
            this.f116483g |= PKIFailureInfo.systemUnavail;
            return u.this.a(null, this);
        }
    }

    public u(e61.b bVar, ez.a aVar) {
        this.repository = bVar;
        this.currentTimeProvider = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f116483g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f116483g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f116481e;
        Object objE = uq.b.e();
        int i16 = aVar.f116483g;
        if (i16 == 0) {
            oq.u.b(obj);
            e61.b bVar = this.repository;
            String strValueOf = String.valueOf(this.currentTimeProvider.a());
            aVar.f116480d = vq.j.a(c1792a);
            aVar.f116483g = 1;
            if (bVar.c(strValueOf, aVar) == objE) {
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
