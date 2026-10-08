package p143z0;

import a4.PointerInputChange;
import a4.c;
import a4.k0;
import a4.q;
import er.p;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000e\u001a\u00020\u0006*\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"La4/c;", "", "a", "(La4/c;)Z", "La4/q;", "pass", "Loq/i0;", "b", "(La4/c;La4/q;Ltq/e;)Ljava/lang/Object;", "La4/k0;", "Lkotlin/Function2;", "Ltq/e;", "", "block", "d", "(La4/k0;Ler/p;Ltq/e;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231265g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231264f = obj;
            this.f231265g |= PKIFailureInfo.systemUnavail;
            return g1.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends i implements p<c, e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f231266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f231267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ tq.i f231268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<c, e<? super i0>, Object> f231269f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(tq.i iVar, p<? super c, ? super e<? super i0>, ? extends Object> pVar, e<? super b> eVar) {
            super(2, eVar);
            this.f231268e = iVar;
            this.f231269f = pVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:40|21|(2:24|25)|34) */
        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        /* JADX WARN: Code duplicated, block: B:32:0x0069  */
        /* JADX WARN: Code duplicated, block: B:35:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x0075  */
        /* JADX WARN: Code duplicated, block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        
            r1 = r9;
            r9 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        
            if (p143z0.g1.c(r1, null, r8, 1, null) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [a4.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [a4.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r8.f231266c
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.f231267d
                a4.c r1 = (a4.c) r1
                oq.u.b(r9)
                goto L29
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f231267d
                a4.c r1 = (a4.c) r1
                oq.u.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            L29:
                r9 = r1
                goto L3c
            L2b:
                r9 = move-exception
                goto L61
            L2d:
                java.lang.Object r1 = r8.f231267d
                a4.c r1 = (a4.c) r1
                oq.u.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
                goto L52
            L35:
                oq.u.b(r9)
                java.lang.Object r9 = r8.f231267d
                a4.c r9 = (a4.c) r9
            L3c:
                tq.i r1 = r8.f231268e
                boolean r1 = ju.g2.n(r1)
                if (r1 == 0) goto L75
                er.p<a4.c, tq.e<? super oq.i0>, java.lang.Object> r1 = r8.f231269f     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.f231267d = r9     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.f231266c = r5     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r1 = r1.B(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5d
                if (r1 != r0) goto L51
                goto L73
            L51:
                r1 = r9
            L52:
                r8.f231267d = r1     // Catch: java.util.concurrent.CancellationException -> L2b
                r8.f231266c = r3     // Catch: java.util.concurrent.CancellationException -> L2b
                java.lang.Object r9 = p143z0.g1.c(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2b
                if (r9 != r0) goto L29
                goto L73
            L5d:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L61:
                tq.i r6 = r8.f231268e
                boolean r6 = ju.g2.n(r6)
                if (r6 == 0) goto L74
                r8.f231267d = r1
                r8.f231266c = r2
                java.lang.Object r9 = p143z0.g1.c(r1, r4, r8, r5, r4)
                if (r9 != r0) goto L29
            L73:
                return r0
            L74:
                throw r9
            L75:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.g1.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(c cVar, e<? super i0> eVar) {
            return ((b) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f231268e, this.f231269f, eVar);
            bVar.f231267d = obj;
            return bVar;
        }
    }

    public static final boolean a(c cVar) {
        List<PointerInputChange> listC = cVar.A1().c();
        int size = listC.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            if (listC.get(i15).getPressed()) {
                z15 = true;
                break;
            }
        }
        return !z15;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[LOOP:0: B:20:0x0060->B:24:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[EDGE_INSN: B:28:0x0045->B:16:0x0045 BREAK  A[LOOP:0: B:20:0x0060->B:24:0x006f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(a4.c r7, a4.q r8, tq.e<? super oq.i0> r9) {
        /*
            boolean r0 = r9 instanceof z0.g1.a
            if (r0 == 0) goto L13
            r0 = r9
            z0.g1$a r0 = (z0.g1.a) r0
            int r1 = r0.f231265g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231265g = r1
            goto L18
        L13:
            z0.g1$a r0 = new z0.g1$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f231264f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f231265g
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f231263e
            a4.q r7 = (a4.q) r7
            java.lang.Object r8 = r0.f231262d
            a4.c r8 = (a4.c) r8
            oq.u.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L52
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            oq.u.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L72
        L45:
            r0.f231262d = r7
            r0.f231263e = r8
            r0.f231265g = r3
            java.lang.Object r9 = r7.k2(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            a4.o r9 = (a4.o) r9
            java.util.List r9 = r9.c()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L60:
            if (r4 >= r2) goto L72
            java.lang.Object r5 = r9.get(r4)
            a4.b0 r5 = (a4.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L6f
            goto L45
        L6f:
            int r4 = r4 + 1
            goto L60
        L72:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.g1.b(a4.c, a4.q, tq.e):java.lang.Object");
    }

    public static /* synthetic */ Object c(c cVar, q qVar, e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            qVar = q.Final;
        }
        return b(cVar, qVar, eVar);
    }

    public static final Object d(k0 k0Var, p<? super c, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) {
        Object objD1 = k0Var.D1(new b(eVar.getContext(), pVar, null), eVar);
        return objD1 == uq.b.e() ? objD1 : i0.f148189a;
    }
}
