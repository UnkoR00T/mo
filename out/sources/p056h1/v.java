package p056h1;

import c5.t;
import er.l;
import f3.m;
import fr.p0;
import g4.b0;
import g4.z;
import oq.g;
import oq.i0;
import oq.p;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.h;
import p036e4.j;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00016B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J#\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J5\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\"2\u0006\u0010\u0014\u001a\u00020\u000f2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00018\u00000#H\u0016¢\u0006\u0004\b&\u0010'J-\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lh1/v;", "Lf3/m$c;", "Lg4/z;", "Le4/j;", "Le4/h;", "Lh1/w;", "state", "Lh1/r;", "beyondBoundsInfo", "", "reverseLayout", "Lz0/a2;", "orientation", "<init>", "(Lh1/w;Lh1/r;ZLz0/a2;)V", "Le4/h$b;", "r3", "(I)Z", "Lh1/r$a;", "currentInterval", "direction", "p3", "(Lh1/r$a;I)Lh1/r$a;", "q3", "(Lh1/r$a;I)Z", "s3", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "T", "Lkotlin/Function1;", "Le4/h$a;", "block", "m0", "(ILer/l;)Ljava/lang/Object;", "Loq/i0;", "u3", "r", "Lh1/w;", "s", "Lh1/r;", "t", "Z", "v", "Lz0/a2;", "p2", "()Le4/h;", "beyondBoundsLayout", "w", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends m.c implements z, j, h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f79566x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a f79567y = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private w state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private r beyondBoundsInfo;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean reverseLayout;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"h1/v$a", "Le4/h$a;", "", "a", "Z", "()Z", "hasMoreContent", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMoreContent;

        a() {
        }

        @Override // e4.h.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79573a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79573a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"h1/v$d", "Le4/h$a;", "", "a", "()Z", "hasMoreContent", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements h.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0<r.Interval> f79575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f79576c;

        d(p0<r.Interval> p0Var, int i15) {
            this.f79575b = p0Var;
            this.f79576c = i15;
        }

        @Override // e4.h.a
        /* JADX INFO: renamed from: a */
        public boolean getHasMoreContent() {
            return v.this.q3(this.f79575b.f66410a, this.f79576c);
        }
    }

    public v(w wVar, r rVar, boolean z15, a2 a2Var) {
        this.state = wVar;
        this.beyondBoundsInfo = rVar;
        this.reverseLayout = z15;
        this.orientation = a2Var;
    }

    private final r.Interval p3(r.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (r3(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.a(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q3(r.Interval interval, int i15) {
        if (s3(i15)) {
            return false;
        }
        if (r3(i15)) {
            return interval.getEnd() < this.state.a() - 1;
        }
        return interval.getStart() > 0;
    }

    private final boolean r3(int i15) {
        h.b.Companion companion = h.b.INSTANCE;
        if (h.b.h(i15, companion.c())) {
            return false;
        }
        if (h.b.h(i15, companion.b())) {
            return true;
        }
        if (h.b.h(i15, companion.a())) {
            return this.reverseLayout;
        }
        if (h.b.h(i15, companion.d())) {
            return !this.reverseLayout;
        }
        if (h.b.h(i15, companion.e())) {
            int i16 = c.f79573a[g4.h.r(this).ordinal()];
            if (i16 == 1) {
                return this.reverseLayout;
            }
            if (i16 == 2) {
                return !this.reverseLayout;
            }
            throw new p();
        }
        if (!h.b.h(i15, companion.f())) {
            t.c();
            throw new g();
        }
        int i17 = c.f79573a[g4.h.r(this).ordinal()];
        if (i17 == 1) {
            return !this.reverseLayout;
        }
        if (i17 == 2) {
            return this.reverseLayout;
        }
        throw new p();
    }

    private final boolean s3(int i15) {
        h.b.Companion companion = h.b.INSTANCE;
        if (h.b.h(i15, companion.a()) || h.b.h(i15, companion.d())) {
            return this.orientation == a2.Horizontal;
        }
        if (h.b.h(i15, companion.e()) || h.b.h(i15, companion.f())) {
            return this.orientation == a2.Vertical;
        }
        if (h.b.h(i15, companion.c()) || h.b.h(i15, companion.b())) {
            return false;
        }
        t.c();
        throw new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t3(p036e4.a2 a2Var, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        final p036e4.a2 a2VarO0 = v0Var.o0(j15);
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new l() { // from class: h1.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.t3(a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    @Override // p036e4.h
    public <T> T m0(int direction, l<? super h.a, ? extends T> block) {
        if (this.state.a() <= 0 || !this.state.b() || !getIsAttached()) {
            return block.b(f79567y);
        }
        int iE = r3(direction) ? this.state.e() : this.state.d();
        p0 p0Var = new p0();
        p0Var.f66410a = (T) this.beyondBoundsInfo.a(iE, iE);
        int iJ = lr.m.j(this.state.c() * 2, this.state.a());
        T tB = null;
        int i15 = 0;
        while (tB == null && q3((r.Interval) p0Var.f66410a, direction) && i15 < iJ) {
            T t15 = (T) p3((r.Interval) p0Var.f66410a, direction);
            this.beyondBoundsInfo.e((r.Interval) p0Var.f66410a);
            p0Var.f66410a = t15;
            i15++;
            b0.d(this);
            tB = block.b(new d(p0Var, direction));
        }
        this.beyondBoundsInfo.e((r.Interval) p0Var.f66410a);
        b0.d(this);
        return tB;
    }

    @Override // p036e4.j
    public h p2() {
        return this;
    }

    public final void u3(w state, r beyondBoundsInfo, boolean reverseLayout, a2 orientation) {
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = reverseLayout;
        this.orientation = orientation;
    }
}
