package t1;

import a4.k0;
import a4.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ju.p0;
import oq.i0;
import p036e4.b0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.x5;
import q1.TextContextMenuData;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001e\u001fB-\u0012$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\u00072$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R4\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R/\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0013¨\u0006 "}, d2 = {"Lt1/h;", "Lg4/j;", "Lg4/e;", "Lg4/s;", "Lkotlin/Function2;", "Lm3/e;", "Ltq/e;", "Loq/i0;", "", "onPreShowContextMenu", "<init>", "(Ler/p;)V", "localClickOffset", "y3", "(J)V", "z3", "Le4/b0;", "coordinates", "h", "(Le4/b0;)V", "v", "Ler/p;", "<set-?>", "w", "Lm2/a3;", "w3", "()Le4/b0;", "x3", "localCoordinates", "x", "c", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends g4.j implements g4.e, g4.s {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final c f186831x = new c(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.p<? super m3.e, ? super tq.e<? super i0>, ? extends Object> onPreShowContextMenu;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final a3 localCoordinates = x5.i(null, x5.k());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: t1.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final /* synthetic */ class C4852a extends fr.q implements er.l<m3.e, i0> {
            C4852a(Object obj) {
                super(1, obj, h.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
            }

            public final void E(long j15) {
                ((h) this.f66391b).y3(j15);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(m3.e eVar) {
                E(eVar.getPackedValue());
                return i0.f148189a;
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            Object objC = r1.a.c(k0Var, new C4852a(h.this), eVar);
            return objC == uq.b.e() ? objC : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lt1/h$b;", "Lu1/j;", "Lm3/e;", "localClickOffset", "<init>", "(Lt1/h;JLfr/k;)V", "Le4/b0;", "destinationCoordinates", "L0", "(Le4/b0;)J", "Lm3/g;", "S0", "(Le4/b0;)Lm3/g;", "Lq1/c;", "A0", "()Lq1/c;", "a", "J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b implements u1.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long localClickOffset;

        public /* synthetic */ b(h hVar, long j15, fr.k kVar) {
            this(j15);
        }

        @Override // u1.j
        public TextContextMenuData A0() {
            return l.c(h.this);
        }

        @Override // u1.j
        public long L0(b0 destinationCoordinates) {
            b0 b0VarW3 = h.this.w3();
            if (b0VarW3 != null) {
                return destinationCoordinates.r(b0VarW3, this.localClickOffset);
            }
            c1.e.d("Tried to open context menu before the anchor was placed.");
            throw new oq.g();
        }

        @Override // u1.j
        public m3.g S0(b0 destinationCoordinates) {
            return m3.h.c(L0(destinationCoordinates), m3.k.INSTANCE.b());
        }

        private b(long j15) {
            this.localClickOffset = j15;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt1/h$c;", "", "<init>", "()V", "", "MESSAGE", "Ljava/lang/String;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(fr.k kVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186837e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f186839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u1.k f186840h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b f186841j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j15, u1.k kVar, b bVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f186839g = j15;
            this.f186840h = kVar;
            this.f186841j = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r7.a(r1, r6) == r0) goto L17;
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
                int r1 = r6.f186837e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L45
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L38
            L1e:
                oq.u.b(r7)
                t1.h r7 = t1.h.this
                er.p r7 = t1.h.u3(r7)
                if (r7 == 0) goto L38
                long r4 = r6.f186839g
                m3.e r1 = m3.e.d(r4)
                r6.f186837e = r3
                java.lang.Object r7 = r7.B(r1, r6)
                if (r7 != r0) goto L38
                goto L44
            L38:
                u1.k r7 = r6.f186840h
                t1.h$b r1 = r6.f186841j
                r6.f186837e = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L45
            L44:
                return r0
            L45:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.h.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return h.this.new d(this.f186839g, this.f186840h, this.f186841j, eVar);
        }
    }

    public h(er.p<? super m3.e, ? super tq.e<? super i0>, ? extends Object> pVar) {
        this.onPreShowContextMenu = pVar;
        n3(w0.a(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 w3() {
        return (b0) this.localCoordinates.getValue();
    }

    private final void x3(b0 b0Var) {
        this.localCoordinates.setValue(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3(long localClickOffset) {
        u1.k kVar = (u1.k) g4.f.a(this, u1.n.e());
        if (kVar == null) {
            return;
        }
        ju.k.d(M2(), null, null, new d(localClickOffset, kVar, new b(this, localClickOffset, null), null), 3, null);
    }

    @Override // g4.s
    public void h(b0 coordinates) {
        x3(coordinates);
    }

    public final void z3(er.p<? super m3.e, ? super tq.e<? super i0>, ? extends Object> onPreShowContextMenu) {
        this.onPreShowContextMenu = onPreShowContextMenu;
    }
}
