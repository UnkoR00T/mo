package r1;

import a4.c;
import a4.k0;
import er.l;
import er.p;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p143z0.g1;
import tq.e;
import vq.d;
import vq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"La4/k0;", "Lkotlin/Function1;", "Lm3/e;", "Loq/i0;", "onDown", "c", "(La4/k0;Ler/l;Ltq/e;)Ljava/lang/Object;", "La4/c;", "La4/b0;", "b", "(La4/c;Ltq/e;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C4313a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f170377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f170378f;

        C4313a(e<? super C4313a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170377e = obj;
            this.f170378f |= PKIFailureInfo.systemUnavail;
            return a.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends i implements p<c, e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f170379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f170380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<m3.e, i0> f170381e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super m3.e, i0> lVar, e<? super b> eVar) {
            super(2, eVar);
            this.f170381e = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f170379c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f170380d
                a4.c r1 = (a4.c) r1
                oq.u.b(r8)
                goto L35
            L22:
                oq.u.b(r8)
                java.lang.Object r8 = r7.f170380d
                r1 = r8
                a4.c r1 = (a4.c) r1
                r7.f170380d = r1
                r7.f170379c = r3
                java.lang.Object r8 = r1.a.a(r1, r7)
                if (r8 != r0) goto L35
                goto L52
            L35:
                a4.b0 r8 = (a4.PointerInputChange) r8
                r8.a()
                er.l<m3.e, oq.i0> r4 = r7.f170381e
                long r5 = r8.getPosition()
                m3.e r8 = m3.e.d(r5)
                r4.b(r8)
                r8 = 0
                r7.f170380d = r8
                r7.f170379c = r2
                java.lang.Object r8 = p143z0.b3.r(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                a4.b0 r8 = (a4.PointerInputChange) r8
                if (r8 == 0) goto L5a
                r8.a()
            L5a:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.a.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(c cVar, e<? super i0> eVar) {
            return ((b) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f170381e, eVar);
            bVar.f170380d = obj;
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[LOOP:0: B:21:0x005d->B:25:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(a4.c r8, tq.e<? super a4.PointerInputChange> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof r1.a.C4313a
            if (r0 == 0) goto L13
            r0 = r9
            r1.a$a r0 = (r1.a.C4313a) r0
            int r1 = r0.f170378f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f170378f = r1
            goto L18
        L13:
            r1.a$a r0 = new r1.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f170377e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f170378f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f170376d
            a4.c r8 = (a4.c) r8
            oq.u.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            oq.u.b(r9)
        L38:
            r0.f170376d = r8
            r0.f170378f = r3
            r9 = 0
            java.lang.Object r9 = a4.c.Q0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            a4.o r9 = (a4.o) r9
            int r2 = r9.getButtons()
            boolean r2 = a4.t.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L6f
            java.lang.Object r7 = r2.get(r6)
            a4.b0 r7 = (a4.PointerInputChange) r7
            boolean r7 = a4.p.a(r7)
            if (r7 != 0) goto L6c
            goto L38
        L6c:
            int r6 = r6 + 1
            goto L5d
        L6f:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a.b(a4.c, tq.e):java.lang.Object");
    }

    public static final Object c(k0 k0Var, l<? super m3.e, i0> lVar, e<? super i0> eVar) {
        Object objD = g1.d(k0Var, new b(lVar, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
