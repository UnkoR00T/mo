package a84;

import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import y74.NotificationRegistrationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"La84/f;", "Lgz/b;", "Lgz/b$a$a;", "", "Lz74/a;", "notificationLocalRepository", "<init>", "(Lz74/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lz74/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z74.a notificationLocalRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f4931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4932e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4934g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4932e = obj;
            this.f4934g |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    public f(z74.a aVar) {
        this.notificationLocalRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f4934g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f4934g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f4932e;
        Object objE = uq.b.e();
        int i16 = aVar.f4934g;
        if (i16 == 0) {
            u.b(objC);
            z74.a aVar2 = this.notificationLocalRepository;
            aVar.f4931d = j.a(c1792a);
            aVar.f4934g = 1;
            objC = aVar2.c(aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return vq.b.a(((NotificationRegistrationData) objC).getToken() != null);
    }
}
