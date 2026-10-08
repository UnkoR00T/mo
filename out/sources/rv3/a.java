package rv3;

import dx.i;
import er.p;
import fr.k;
import j44.Access;
import jb4.PayloadErrorData;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJR\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\f2.\u0010\u0013\u001a*\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016JV\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\f*\u00020\u00112.\u0010\u0017\u001a*\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJR\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\f2.\u0010\u0013\u001a*\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rH\u0096B¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006$"}, d2 = {"Lrv3/a;", "Ll44/a;", "Lnv3/c;", "interactor", "Lk54/a;", "callActionWithKeycloakAccessTokenUC", "Lrv3/d;", "refreshEdorAuthOwTokenUC", "Ll44/c;", "getOwAccessTokenUC", "<init>", "(Lnv3/c;Lk54/a;Lrv3/d;Ll44/c;)V", "T", "Lkotlin/Function2;", "Lj44/f;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "", "block", "Lk44/a;", "d", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "retryAction", "f", "(Ldx/b;Ler/p;Ltq/e;)Ljava/lang/Object;", "Ljb4/f;", "e", "(Ldx/b;)Ljb4/f;", "a", "Lnv3/c;", "b", "Lk54/a;", "c", "Lrv3/d;", "Ll44/c;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements l44.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C4502a f176434e = new C4502a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f176435f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nv3.c interactor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k54.a callActionWithKeycloakAccessTokenUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rv3.d refreshEdorAuthOwTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l44.c getOwAccessTokenUC;

    /* JADX INFO: renamed from: rv3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lrv3/a$a;", "", "<init>", "()V", "", "TOKEN_EXPIRED_CODE_EDOR", "Ljava/lang/String;", "TOKEN_EXPIRED_CODE_DEFAULT", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4502a {
        public /* synthetic */ C4502a(k kVar) {
            this();
        }

        private C4502a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f176442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f176443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f176444h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f176445j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f176446k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f176447l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f176449n;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176447l = obj;
            this.f176449n |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c<T> extends vq.k implements p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> f176452g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super Access, ? super tq.e<? super i<? extends dx.b, ? extends T>>, ? extends Object> pVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f176452g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f176451f;
            Object objE = uq.b.e();
            int i15 = this.f176450e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> pVar = this.f176452g;
            this.f176451f = j.a(access);
            this.f176450e = 1;
            Object objB = pVar.B(access, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super i<? extends dx.b, ? extends T>> eVar) {
            return ((c) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f176452g, eVar);
            cVar.f176451f = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f176455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f176456g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f176457h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f176458j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f176459k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f176460l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f176462n;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176460l = obj;
            this.f176462n |= PKIFailureInfo.systemUnavail;
            return a.this.f(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f176464e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f176466g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176464e = obj;
            this.f176466g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class f<T> extends vq.k implements p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> f176469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(p<? super Access, ? super tq.e<? super i<? extends dx.b, ? extends T>>, ? extends Object> pVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f176469g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f176468f;
            Object objE = uq.b.e();
            int i15 = this.f176467e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> pVar = this.f176469g;
            this.f176468f = j.a(access);
            this.f176467e = 1;
            Object objB = pVar.B(access, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super i<? extends dx.b, ? extends T>> eVar) {
            return ((f) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(this.f176469g, eVar);
            fVar.f176468f = obj;
            return fVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Li54/b$a;", "accessToken", "Ldx/i;", "Ldx/b;", "<anonymous>", "(Li54/b$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class g<T> extends vq.k implements p<i54.b.Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> f176472g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(p<? super Access, ? super tq.e<? super i<? extends dx.b, ? extends T>>, ? extends Object> pVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f176472g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i54.b.Access access = (i54.b.Access) this.f176471f;
            Object objE = uq.b.e();
            int i15 = this.f176470e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p<Access, tq.e<? super i<? extends dx.b, ? extends T>>, Object> pVar = this.f176472g;
            Access access2 = new Access(access.getValue(), access.getExpiration());
            this.f176471f = j.a(access);
            this.f176470e = 1;
            Object objB = pVar.B(access2, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i54.b.Access access, tq.e<? super i<? extends dx.b, ? extends T>> eVar) {
            return ((g) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = new g(this.f176472g, eVar);
            gVar.f176471f = obj;
            return gVar;
        }
    }

    public a(nv3.c cVar, k54.a aVar, rv3.d dVar, l44.c cVar2) {
        this.interactor = cVar;
        this.callActionWithKeycloakAccessTokenUC = aVar;
        this.refreshEdorAuthOwTokenUC = dVar;
        this.getOwAccessTokenUC = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r11 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object d(er.p<? super j44.Access, ? super tq.e<? super dx.i<? extends dx.b, ? extends T>>, ? extends java.lang.Object> r10, tq.e<? super dx.i<? extends k44.a, ? extends T>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.a.d(er.p, tq.e):java.lang.Object");
    }

    private final PayloadErrorData e(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        if (r14 == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object f(dx.b r12, er.p<? super j44.Access, ? super tq.e<? super dx.i<? extends dx.b, ? extends T>>, ? extends java.lang.Object> r13, tq.e<? super dx.i<? extends k44.a, ? extends T>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.a.f(dx.b, er.p, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r7 == r1) goto L25;
     */
    @Override // l44.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object a(er.p<? super j44.Access, ? super tq.e<? super dx.i<? extends dx.b, ? extends T>>, ? extends java.lang.Object> r6, tq.e<? super dx.i<? extends k44.a, ? extends T>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rv3.a.e
            if (r0 == 0) goto L13
            r0 = r7
            rv3.a$e r0 = (rv3.a.e) r0
            int r1 = r0.f176466g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f176466g = r1
            goto L18
        L13:
            rv3.a$e r0 = new rv3.a$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f176464e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f176466g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f176463d
            er.p r6 = (er.p) r6
            oq.u.b(r7)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f176463d
            er.p r6 = (er.p) r6
            oq.u.b(r7)
            return r7
        L40:
            oq.u.b(r7)
            nv3.c r7 = r5.interactor
            boolean r7 = r7.L()
            r2 = 0
            if (r7 != r4) goto L61
            rv3.a$f r7 = new rv3.a$f
            r7.<init>(r6, r2)
            java.lang.Object r6 = vq.j.a(r6)
            r0.f176463d = r6
            r0.f176466g = r4
            java.lang.Object r6 = r5.d(r7, r0)
            if (r6 != r1) goto L60
            goto L76
        L60:
            return r6
        L61:
            k54.a r7 = r5.callActionWithKeycloakAccessTokenUC
            rv3.a$g r4 = new rv3.a$g
            r4.<init>(r6, r2)
            java.lang.Object r6 = vq.j.a(r6)
            r0.f176463d = r6
            r0.f176466g = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            dx.i r7 = (dx.i) r7
            boolean r6 = r7 instanceof dx.i.Left
            if (r6 == 0) goto La7
            dx.i$b r7 = (dx.i.Left) r7
            java.lang.Object r6 = r7.b()
            j54.a r6 = (j54.a) r6
            boolean r7 = r6 instanceof j54.a.Domain
            if (r7 == 0) goto L95
            k44.a$a r7 = new k44.a$a
            j54.a$a r6 = (j54.a.Domain) r6
            dx.b r6 = r6.getDomain()
            r7.<init>(r6)
            goto L9b
        L95:
            boolean r6 = r6 instanceof j54.a.b
            if (r6 == 0) goto La1
            k44.a$b r7 = k44.a.b.f108417a
        L9b:
            dx.i$b r6 = new dx.i$b
            r6.<init>(r7)
            return r6
        La1:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        La7:
            boolean r6 = r7 instanceof dx.i.Right
            if (r6 == 0) goto Lac
            return r7
        Lac:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.a.a(er.p, tq.e):java.lang.Object");
    }
}
