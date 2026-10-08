package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/n1;", "", "<init>", "()V", "Loq/i0;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "c", "sent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f10678a = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean sent = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10681d = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f10683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ lu.g<oq.i0> f10685h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(lu.g<oq.i0> gVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f10685h = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f10684g
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f10683f
                lu.i r1 = (lu.i) r1
                java.lang.Object r3 = r5.f10682e
                lu.y r3 = (lu.y) r3
                oq.u.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                oq.u.b(r6)
                lu.g<oq.i0> r3 = r5.f10685h
                lu.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f10682e = r3     // Catch: java.lang.Throwable -> L17
                r5.f10683f = r1     // Catch: java.lang.Throwable -> L17
                r5.f10684g = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                oq.i0 r6 = (oq.i0) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.n1.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                c3.l$a r6 = c3.l.INSTANCE     // Catch: java.lang.Throwable -> L17
                r6.m()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                oq.i0 r6 = oq.i0.f148189a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                lu.n.a(r3, r6)
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                lu.n.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.n1.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f10685h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<Object, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lu.g<oq.i0> f10686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(lu.g<oq.i0> gVar) {
            super(1);
            this.f10686b = gVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Object obj) {
            c(obj);
            return oq.i0.f148189a;
        }

        public final void c(Object obj) {
            if (n1.sent.compareAndSet(false, true)) {
                this.f10686b.d(oq.i0.f148189a);
            }
        }
    }

    private n1() {
    }

    public final void b() {
        if (started.compareAndSet(false, true)) {
            lu.g gVarB = lu.j.b(1, null, null, 6, null);
            ju.k.d(ju.q0.a(j0.INSTANCE.b()), null, null, new a(gVarB, null), 3, null);
            c3.l.INSTANCE.j(new b(gVarB));
        }
    }
}
