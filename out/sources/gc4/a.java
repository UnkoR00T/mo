package gc4;

import ju.p0;
import ju.p2;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lgc4/a;", "Lac4/a;", "Lox/a;", "loaderManager", "<init>", "(Lox/a;)V", "RESULT", "Ltq/i;", "dispatcher", "Lkotlin/Function1;", "Ltq/e;", "", "block", "b", "(Ltq/i;Ler/l;Ltq/e;)Ljava/lang/Object;", "a", "Lox/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ac4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ox.a loaderManager;

    /* JADX INFO: renamed from: gc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1644a<RESULT> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f71817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f71818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f71819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f71820g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f71822j;

        C1644a(tq.e<? super C1644a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f71820g = obj;
            this.f71822j |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RESULT] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"RESULT", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class b<RESULT> extends vq.k implements er.p<p0, tq.e<? super RESULT>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71823e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super RESULT>, Object> f71825g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super tq.e<? super RESULT>, ? extends Object> lVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f71825g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71823e;
            if (i15 == 0) {
                u.b(obj);
                ox.a aVar = a.this.loaderManager;
                this.f71823e = 1;
                if (aVar.f(this) != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            er.l<tq.e<? super RESULT>, Object> lVar = this.f71825g;
            this.f71823e = 2;
            Object objB = lVar.b(this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super RESULT> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new b(this.f71825g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71826e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71826e;
            if (i15 == 0) {
                u.b(obj);
                ox.a aVar = a.this.loaderManager;
                this.f71826e = 1;
                if (aVar.d(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new c(eVar);
        }
    }

    public a(ox.a aVar) {
        this.loaderManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [er.p, gc4.a$c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, tq.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // ac4.a
    public <RESULT> Object b(tq.i iVar, er.l<? super tq.e<? super RESULT>, ? extends Object> lVar, tq.e<? super RESULT> eVar) throws Throwable {
        C1644a c1644a;
        ?? r15;
        if (eVar instanceof C1644a) {
            c1644a = (C1644a) eVar;
            int i15 = c1644a.f71822j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1644a.f71822j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1644a = new C1644a(eVar);
            }
        } else {
            c1644a = new C1644a(eVar);
        }
        Object objG = c1644a.f71820g;
        Object objE = uq.b.e();
        int i16 = c1644a.f71822j;
        ?? cVar = 3;
        try {
            if (i16 == 0) {
                u.b(objG);
                b bVar = new b(lVar, null);
                c1644a.f71817d = vq.j.a(iVar);
                c1644a.f71818e = vq.j.a(lVar);
                c1644a.f71822j = 1;
                objG = ju.i.g(iVar, bVar, c1644a);
                r15 = iVar;
                if (objG != objE) {
                }
            }
            if (i16 != 1) {
                if (i16 == 2) {
                    Object obj = c1644a.f71819f;
                    u.b(objG);
                    return obj;
                }
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th4 = (Throwable) c1644a.f71819f;
                u.b(objG);
                throw th4;
            }
            lVar = (er.l) c1644a.f71818e;
            tq.i iVar2 = (tq.i) c1644a.f71817d;
            u.b(objG);
            r15 = iVar2;
            p2 p2Var = p2.f105770b;
            cVar = new c(null);
            c1644a.f71817d = vq.j.a(r15);
            c1644a.f71818e = vq.j.a(lVar);
            c1644a.f71819f = objG;
            c1644a.f71822j = 2;
            iVar = ju.i.g(p2Var, cVar, c1644a);
            return iVar == objE ? objE : objG;
        } catch (Throwable th5) {
            er.l<? super tq.e<? super RESULT>, ? extends Object> lVar2 = lVar;
            ?? r16 = iVar;
            p2 p2Var2 = p2.f105770b;
            c cVar2 = new c(null);
            c1644a.f71817d = vq.j.a(r16);
            c1644a.f71818e = vq.j.a(lVar2);
            c1644a.f71819f = th5;
            c1644a.f71822j = cVar;
            if (ju.i.g(p2Var2, cVar2, c1644a) != objE) {
                throw th5;
            }
        }
    }
}
