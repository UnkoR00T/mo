package kx3;

import dx.i;
import er.p;
import fr.k;
import jb4.PayloadErrorData;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JV\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b*\u00020\t2.\u0010\u000f\u001a*\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2.\u0010\u0016\u001a*\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkx3/a;", "Lk54/a;", "Lkx3/f;", "refreshKeycloakTokenUC", "Lk54/c;", "getKeycloakAccessTokenUC", "<init>", "(Lkx3/f;Lk54/c;)V", "T", "Ldx/b;", "Lkotlin/Function2;", "Li54/b$a;", "Ltq/e;", "Ldx/i;", "", "retryAction", "Lj54/a;", "d", "(Ldx/b;Ler/p;Ltq/e;)Ljava/lang/Object;", "Ljb4/f;", "c", "(Ldx/b;)Ljb4/f;", "block", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "Lkx3/f;", "b", "Lk54/c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements k54.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2738a f113017c = new C2738a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f113018d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f refreshKeycloakTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k54.c getKeycloakAccessTokenUC;

    /* JADX INFO: renamed from: kx3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lkx3/a$a;", "", "<init>", "()V", "", "TOKEN_EXPIRED_CODE_EDOR", "Ljava/lang/String;", "TOKEN_EXPIRED_CODE_DEFAULT", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C2738a {
        public /* synthetic */ C2738a(k kVar) {
            this();
        }

        private C2738a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f113024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f113025h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f113026j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113027k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f113028l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f113029m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113030n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f113031p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f113033r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113031p = obj;
            this.f113033r |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f113037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f113038h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f113039j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113040k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f113041l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113043n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113041l = obj;
            this.f113043n |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Li54/b$a;", "accessToken", "Ldx/i;", "Ldx/b;", "<anonymous>", "(Li54/b$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d<T> extends vq.k implements p<i54.b.Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<i54.b.Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> f113046g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super i54.b.Access, ? super tq.e<? super i<? extends dx.b, ? extends T>>, ? extends Object> pVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f113046g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i54.b.Access access = (i54.b.Access) this.f113045f;
            Object objE = uq.b.e();
            int i15 = this.f113044e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p<i54.b.Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> pVar = this.f113046g;
            this.f113045f = j.a(access);
            this.f113044e = 1;
            Object objB = pVar.B(access, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i54.b.Access access, tq.e<? super i<? extends dx.b, ? extends T>> eVar) {
            return ((d) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f113046g, eVar);
            dVar.f113045f = obj;
            return dVar;
        }
    }

    public a(f fVar, k54.c cVar) {
        this.refreshKeycloakTokenUC = fVar;
        this.getKeycloakAccessTokenUC = cVar;
    }

    private final PayloadErrorData c(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if (r13 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object d(dx.b r11, er.p<? super i54.b.Access, ? super tq.e<? super dx.i<? extends dx.b, ? extends T>>, ? extends java.lang.Object> r12, tq.e<? super dx.i<? extends j54.a, ? extends T>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx3.a.d(dx.b, er.p, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r12 == r1) goto L26;
     */
    @Override // k54.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object a(er.p<? super i54.b.Access, ? super tq.e<? super dx.i<? extends dx.b, ? extends T>>, ? extends java.lang.Object> r11, tq.e<? super dx.i<? extends j54.a, ? extends T>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx3.a.a(er.p, tq.e):java.lang.Object");
    }
}
