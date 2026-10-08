package wc0;

import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwc0/c;", "Lgz/b;", "Lgz/b$a$a;", "Lgu/b;", "Lvc0/a;", "repository", "<init>", "(Lvc0/a;)V", "params", "d", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvc0/a;", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<gz.b.a.C1792a, gu.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vc0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f212054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212056g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212054e = obj;
            this.f212056g |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    public c(vc0.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(gz.b.a.C1792a c1792a, tq.e<? super gu.b> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f212056g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212056g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f212054e;
        Object objE = uq.b.e();
        int i16 = aVar.f212056g;
        if (i16 == 0) {
            u.b(objD);
            gu.b.Companion companion = gu.b.INSTANCE;
            vc0.a aVar2 = this.repository;
            aVar.f212053d = j.a(c1792a);
            aVar.f212056g = 1;
            objD = aVar2.d(aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        return gu.b.o(gu.d.r(((Number) objD).longValue(), gu.e.MILLISECONDS));
    }
}
