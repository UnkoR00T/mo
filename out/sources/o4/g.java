package o4;

import c5.n;
import er.l;
import fr.t;
import g4.g0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import r0.j0;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u00002\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001a\u001a\u00060\u0004R\u00020\u0000*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\u00020\u0013*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$JA\u0010.\u001a\u00020-2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b7\u00105J3\u00108\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b8\u00109R!\u0010>\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00168\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R(\u0010E\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010J\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bK\u0010H\"\u0004\bL\u00105R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u00105R\"\u0010Q\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010F\u001a\u0004\bO\u0010H\"\u0004\bP\u00105R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lo4/g;", "", "<init>", "()V", "Lo4/g$a;", "entry", "Lc5/n;", "windowOffset", "screenOffset", "Ln3/g2;", "viewToWindowMatrix", "", "currentMillis", "Loq/i0;", "d", "(Lo4/g$a;JJ[FJ)V", "minDeadline", "c", "(Lo4/g$a;JJ[FJJ)J", "", "o", "(Lo4/g$a;)Z", "Lr0/j0;", "", "key", "value", "l", "(Lr0/j0;ILo4/g$a;)Lo4/g$a;", "m", "(Lr0/j0;ILo4/g$a;)Z", "screen", "window", "matrix", "windowWidth", "windowHeight", "q", "(JJ[FII)Z", "id", "throttleMillis", "debounceMillis", "Lg4/g;", "node", "Lkotlin/Function1;", "Lo4/f;", "callback", "Lg4/g$a;", "n", "(IJJLg4/g;Ler/l;)Lg4/g$a;", "topLeft", "bottomRight", "g", "(IJJJ)V", "f", "(J)V", "e", "p", "h", "(Lo4/g$a;JJJ)V", "a", "Lr0/j0;", "j", "()Lr0/j0;", "rectChangedMap", "b", "Lo4/g$a;", "getGlobalChangeEntries", "()Lo4/g$a;", "setGlobalChangeEntries", "(Lo4/g$a;)V", "globalChangeEntries", "J", "i", "()J", "setMinDebounceDeadline", "minDebounceDeadline", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "k", "setWindowSize", "windowSize", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a globalChangeEntries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long windowOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long screenOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long windowSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0<a> rectChangedMap = r.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long minDebounceDeadline = -1;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u00100\u001a\b\u0018\u00010\u0000R\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u00103R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\u001f\"\u0004\b4\u00103R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b5\u00103R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b7\u00103¨\u00069"}, d2 = {"Lo4/g$a;", "Lg4/g$a;", "", "id", "", "throttleMillis", "debounceMillis", "Lg4/g;", "node", "Lkotlin/Function1;", "Lo4/f;", "Loq/i0;", "callback", "<init>", "(Lo4/g;IJJLg4/g;Ler/l;)V", "a", "()V", "topLeft", "bottomRight", "Lc5/n;", "windowOffset", "screenOffset", "Ln3/g2;", "viewToWindowMatrix", "b", "(JJJJ[F)V", "I", "getId", "()I", "J", "i", "()J", "c", "d", "Lg4/g;", "h", "()Lg4/g;", "e", "Ler/l;", "getCallback", "()Ler/l;", "Lo4/g;", "f", "Lo4/g$a;", "g", "()Lo4/g$a;", "n", "(Lo4/g$a;)V", "next", "j", "o", "(J)V", "k", "l", "lastInvokeMillis", "m", "lastUninvokedFireMillis", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements g4.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long throttleMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long debounceMillis;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final g4.g node;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final l<f, i0> callback;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private a next;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long topLeft;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long bottomRight;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long lastInvokeMillis = Long.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long lastUninvokedFireMillis = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i15, long j15, long j16, g4.g gVar, l<? super f, i0> lVar) {
            this.id = i15;
            this.throttleMillis = j15;
            this.debounceMillis = j16;
            this.node = gVar;
            this.callback = lVar;
        }

        @Override // g4.g.a
        public void a() {
            g gVar = g.this;
            if (gVar.m(gVar.j(), this.id, this)) {
                return;
            }
            g.this.o(this);
        }

        public final void b(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            f fVarA = h.a(this.node, topLeft, bottomRight, windowOffset, screenOffset, g.this.getWindowSize(), viewToWindowMatrix);
            if (fVarA == null) {
                return;
            }
            this.callback.b(fVarA);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getBottomRight() {
            return this.bottomRight;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final g4.g getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void k(long j15) {
            this.bottomRight = j15;
        }

        public final void l(long j15) {
            this.lastInvokeMillis = j15;
        }

        public final void m(long j15) {
            this.lastUninvokedFireMillis = j15;
        }

        public final void n(a aVar) {
            this.next = aVar;
        }

        public final void o(long j15) {
            this.topLeft = j15;
        }
    }

    public g() {
        n.Companion companion = n.INSTANCE;
        this.windowOffset = companion.b();
        this.screenOffset = companion.b();
    }

    private final long c(a entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() < entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.l(currentMillis);
        entry.m(-1L);
        entry.b(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    private final void d(a entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean z15 = currentMillis - lastInvokeMillis > entry.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z16 = entry.getDebounceMillis() == 0;
        entry.m(currentMillis);
        if (z15 && z16) {
            entry.l(currentMillis);
            entry.b(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z16) {
            return;
        }
        long j15 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j15 <= 0 || debounceMillis >= j15) {
            return;
        }
        this.minDebounceDeadline = j15;
    }

    private final a l(j0<a> j0Var, int i15, a aVar) {
        a aVarB = j0Var.b(i15);
        if (aVarB == null) {
            j0Var.r(i15, aVar);
            aVarB = aVar;
        }
        a next = aVarB;
        if (next != aVar) {
            while (next.getNext() != null) {
                next = next.getNext();
            }
            next.n(aVar);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(j0<a> j0Var, int i15, a aVar) {
        a aVarO = j0Var.o(i15);
        if (aVarO == null) {
            return false;
        }
        if (t.c(aVarO, aVar)) {
            a next = aVar.getNext();
            aVar.n(null);
            if (next != null) {
                j0Var.n(i15, next);
            } else {
                androidx.compose.ui.node.g gVarS = g4.h.s(aVar.getNode().getNode());
                if (gVarS.getAddedToRectList()) {
                    g0.b(gVarS).getRectManager().s(gVarS);
                }
            }
            return true;
        }
        j0Var.n(i15, aVarO);
        while (aVarO != null) {
            a next2 = aVarO.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == aVar) {
                aVarO.n(aVar.getNext());
                aVar.n(null);
                break;
            }
            aVarO = aVarO.getNext();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(a entry) {
        a aVar = this.globalChangeEntries;
        if (aVar == entry) {
            this.globalChangeEntries = aVar.getNext();
            entry.n(null);
            return true;
        }
        a next = aVar != null ? aVar.getNext() : null;
        while (true) {
            a aVar2 = next;
            a aVar3 = aVar;
            aVar = aVar2;
            if (aVar == null) {
                return false;
            }
            if (aVar == entry) {
                if (aVar3 != null) {
                    aVar3.n(aVar.getNext());
                }
                entry.n(null);
                return true;
            }
            next = aVar.getNext();
        }
    }

    public final void e(long currentMillis) {
        long j15 = this.windowOffset;
        long j16 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        a next = this.globalChangeEntries;
        if (next != null) {
            while (next != null) {
                androidx.compose.ui.node.g gVarS = g4.h.s(next.getNode());
                long jD = g0.b(gVarS).getRectManager().d(gVarS);
                next.o(jD);
                int i15 = n.i(jD) + gVarS.I0();
                next.k((((long) (n.j(jD) + gVarS.a0())) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
                d(next, j15, j16, fArr, currentMillis);
                next = next.getNext();
            }
        }
    }

    public final void f(long currentMillis) {
        g gVar = this;
        long j15 = gVar.windowOffset;
        long j16 = gVar.screenOffset;
        float[] fArr = gVar.viewToWindowMatrix;
        j0<a> j0Var = gVar.rectChangedMap;
        Object[] objArr = j0Var.values;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j17 = jArr[i15];
            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                long j18 = j17;
                int i17 = 0;
                while (i17 < i16) {
                    if ((j18 & 255) < 128) {
                        a next = (a) objArr[(i15 << 3) + i17];
                        while (next != null) {
                            int i18 = i17;
                            a aVar = next;
                            gVar.d(aVar, j15, j16, fArr, currentMillis);
                            next = aVar.getNext();
                            gVar = this;
                            i17 = i18;
                        }
                    }
                    j18 >>= 8;
                    i17++;
                    gVar = this;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            }
            i15++;
            gVar = this;
        }
    }

    public final void g(int id5, long topLeft, long bottomRight, long currentMillis) {
        a aVarB = this.rectChangedMap.b(id5);
        while (true) {
            a aVar = aVarB;
            if (aVar == null) {
                return;
            }
            aVarB = aVar.getNext();
            h(aVar, topLeft, bottomRight, currentMillis);
        }
    }

    public final void h(a entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z15 = currentMillis - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z16 = debounceMillis == 0;
        boolean z17 = throttleMillis == 0;
        entry.o(topLeft);
        entry.k(bottomRight);
        boolean z18 = !(z16 || z17) || z16;
        if (z15 && z18) {
            entry.m(-1L);
            entry.l(currentMillis);
            entry.b(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z16) {
                return;
            }
            entry.m(currentMillis);
            long j15 = this.minDebounceDeadline;
            long j16 = currentMillis + debounceMillis;
            if (j15 <= 0 || j16 >= j15) {
                return;
            }
            this.minDebounceDeadline = j15;
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final j0<a> j() {
        return this.rectChangedMap;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getWindowSize() {
        return this.windowSize;
    }

    public final g4.g.a n(int id5, long throttleMillis, long debounceMillis, g4.g node, l<? super f, i0> callback) {
        return l(this.rectChangedMap, id5, new a(id5, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    public final void p(long currentMillis) {
        long j15;
        long jC;
        int i15;
        if (this.minDebounceDeadline > currentMillis) {
            return;
        }
        long j16 = this.windowOffset;
        long j17 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        j0<a> j0Var = this.rectChangedMap;
        Object[] objArr = j0Var.values;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i16 = 0;
            jC = Long.MAX_VALUE;
            while (true) {
                long j18 = jArr[i16];
                j15 = Long.MAX_VALUE;
                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i16 != length) {
                        break;
                        break;
                    }
                    i16++;
                } else {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    long j19 = j18;
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j19 & 255) < 128) {
                            a next = (a) objArr[(i16 << 3) + i18];
                            while (next != null) {
                                int i19 = i16;
                                a aVar = next;
                                jC = c(aVar, j16, j17, fArr, currentMillis, jC);
                                i18 = i18;
                                next = aVar.getNext();
                                i16 = i19;
                            }
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                        j19 >>= 8;
                        i18 = i15 + 1;
                        i16 = i16;
                    }
                    int i25 = i16;
                    if (i17 != 8) {
                        break;
                    }
                    i16 = i25;
                    if (i16 != length) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
        } else {
            j15 = Long.MAX_VALUE;
            jC = Long.MAX_VALUE;
        }
        a next2 = this.globalChangeEntries;
        if (next2 != null) {
            long jC2 = jC;
            while (next2 != null) {
                jC2 = c(next2, j16, j17, fArr, currentMillis, jC2);
                next2 = next2.getNext();
            }
            jC = jC2;
        }
        if (jC == j15) {
            jC = -1;
        }
        this.minDebounceDeadline = jC;
    }

    public final boolean q(long screen, long window, float[] matrix, int windowWidth, int windowHeight) {
        boolean z15;
        if (n.h(window, this.windowOffset)) {
            z15 = false;
        } else {
            this.windowOffset = window;
            z15 = true;
        }
        if (!n.h(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z15 = true;
        }
        if (matrix != null) {
            this.viewToWindowMatrix = matrix;
            z15 = true;
        }
        long j15 = (((long) windowWidth) << 32) | (((long) windowHeight) & BodyPartID.bodyIdMax);
        if (j15 == this.windowSize) {
            return z15;
        }
        this.windowSize = j15;
        return true;
    }
}
