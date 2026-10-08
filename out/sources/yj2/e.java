package yj2;

import er.l;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v64.p;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyj2/e;", "Luj2/b;", "Lv64/p;", "loginUserToAppUseCase", "Lyj2/a;", "afterAppLoginUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lv64/p;Lyj2/a;Lac4/a;)V", "Ldx/i;", "Ldx/b;", "Luj2/b$b;", "f", "(Ltq/e;)Ljava/lang/Object;", "Luj2/b$a;", "params", "g", "(Luj2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv64/p;", "b", "Lyj2/a;", "c", "Lac4/a;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements uj2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p loginUserToAppUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yj2.a afterAppLoginUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f227373d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f227375f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227373d = obj;
            this.f227375f |= PKIFailureInfo.systemUnavail;
            return e.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Luj2/b$b;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements l<tq.e<? super dx.i<? extends dx.b, ? extends uj2.b.Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227376e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ uj2.b.Params f227378g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uj2.b.Params params, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f227378g = params;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f227376e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r6)
                goto L4e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                oq.u.b(r6)
                goto L3b
            L1e:
                oq.u.b(r6)
                yj2.e r6 = yj2.e.this
                v64.p r6 = yj2.e.e(r6)
                v64.p$a r1 = new v64.p$a
                uj2.b$a r4 = r5.f227378g
                iy.b0 r4 = r4.getPassword()
                r1.<init>(r4)
                r5.f227376e = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L3b
                goto L4d
            L3b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r3) goto L51
                yj2.e r6 = yj2.e.this
                r5.f227376e = r2
                java.lang.Object r6 = yj2.e.d(r6, r5)
                if (r6 != r0) goto L4e
            L4d:
                return r0
            L4e:
                dx.i r6 = (dx.i) r6
                return r6
            L51:
                dx.i$c r6 = new dx.i$c
                uj2.b$b r0 = new uj2.b$b
                r1 = 0
                r0.<init>(r1)
                r6.<init>(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: yj2.e.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return e.this.new b(this.f227378g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, uj2.b.Result>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public e(p pVar, yj2.a aVar, ac4.a aVar2) {
        this.loginUserToAppUseCase = pVar;
        this.afterAppLoginUseCase = aVar;
        this.callActionWithLoaderUseCase = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tq.e<? super dx.i<? extends dx.b, uj2.b.Result>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f227375f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f227375f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f227373d;
        Object objE = uq.b.e();
        int i16 = aVar.f227375f;
        if (i16 == 0) {
            u.b(objC);
            yj2.a aVar2 = this.afterAppLoginUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f227375f = 1;
            objC = aVar2.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new uj2.b.Result(((Boolean) ((dx.i.Right) iVar).b()).booleanValue()));
        }
        throw new oq.p();
    }

    @Override // gz.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(uj2.b.Params params, tq.e<? super dx.i<? extends dx.b, uj2.b.Result>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, null), eVar, 1, null);
    }
}
