package wc3;

import er.l;
import oq.i0;
import p071kotlin.Metadata;
import uc3.PassportsData;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwc3/b;", "", "Lgz/b$a$a;", "Luc3/i;", "Lwc3/e;", "getPassportUC", "Lwc3/a;", "fetchAndSavePassportsUC", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lwc3/e;Lwc3/a;Lac4/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lwc3/e;", "b", "Lwc3/a;", "c", "Lac4/a;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getPassportUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wc3.a fetchAndSavePassportsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Luc3/i;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super dx.i<? extends dx.b, ? extends PassportsData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212084h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f212085j;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r7 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
        
            if (r7 == r0) goto L33;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f212085j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L32
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r6.f212082f
                uc3.i r0 = (uc3.PassportsData) r0
                java.lang.Object r0 = r6.f212081e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto Lbd
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                java.lang.Object r0 = r6.f212082f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r6.f212081e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto L7b
            L32:
                oq.u.b(r7)
                goto L4a
            L36:
                oq.u.b(r7)
                wc3.b r7 = wc3.b.this
                wc3.e r7 = wc3.b.e(r7)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r6.f212085j = r4
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L4a
                goto Lbc
            L4a:
                dx.i r7 = (dx.i) r7
                wc3.b r1 = wc3.b.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L7e
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                wc3.a r1 = wc3.b.d(r1)
                gz.b$a$a r4 = gz.b.a.C1792a.f78542a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f212081e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f212082f = r7
                r6.f212083g = r5
                r6.f212084h = r5
                r6.f212085j = r3
                java.lang.Object r7 = r1.a(r4, r6)
                if (r7 != r0) goto L7b
                goto Lbc
            L7b:
                dx.i r7 = (dx.i) r7
                return r7
            L7e:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto Lc0
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                uc3.i r3 = (uc3.PassportsData) r3
                if (r3 == 0) goto L9e
                uc3.a r4 = r3.getGroupedPassports()
                boolean r4 = r4.d()
                if (r4 == 0) goto L98
                goto L9e
            L98:
                dx.i$c r7 = new dx.i$c
                r7.<init>(r3)
                return r7
            L9e:
                wc3.a r1 = wc3.b.d(r1)
                gz.b$a$a r4 = gz.b.a.C1792a.f78542a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f212081e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f212082f = r7
                r6.f212083g = r5
                r6.f212084h = r5
                r6.f212085j = r2
                java.lang.Object r7 = r1.a(r4, r6)
                if (r7 != r0) goto Lbd
            Lbc:
                return r0
            Lbd:
                dx.i r7 = (dx.i) r7
                return r7
            Lc0:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: wc3.b.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, PassportsData>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public b(e eVar, wc3.a aVar, ac4.a aVar2) {
        this.getPassportUC = eVar;
        this.fetchAndSavePassportsUC = aVar;
        this.callActionWithLoaderUseCase = aVar2;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, PassportsData>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }
}
