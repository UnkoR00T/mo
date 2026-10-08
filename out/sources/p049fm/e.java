package p049fm;

import b3.a0;
import b3.b0;
import b3.x;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import er.l;
import er.p;
import fr.k;
import ip.a;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.n;
import lh.c;
import oq.i0;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import vq.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002#\u001bB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0087@¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010-\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0005R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0016R/\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR/\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001c\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010+\"\u0004\bB\u0010\u0005¨\u0006D"}, d2 = {"Lfm/e;", "", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "<init>", "(Lcom/google/android/gms/maps/model/CameraPosition;)V", "Lfm/e$b;", "callback", "Loq/i0;", "o", "(Lfm/e$b;)V", "Llh/c;", "map", "Llh/a;", "update", "", "durationMs", "Lju/n;", "continuation", "w", "(Llh/c;Llh/a;ILju/n;)V", "A", "(Llh/c;)V", "n", "(Llh/a;ILtq/e;)Ljava/lang/Object;", "", "<set-?>", "a", "Lm2/a3;", "v", "()Z", "C", "(Z)V", "isMoving", "Lfm/a;", "b", "p", "()Lfm/a;", "y", "(Lfm/a;)V", "cameraMoveStartedReason", "c", "u", "()Lcom/google/android/gms/maps/model/CameraPosition;", "F", "rawPosition", "d", "Loq/i0;", "lock", "e", "q", "()Llh/c;", "z", "f", "s", "()Lfm/e$b;", a.f96138c, "onMapChanged", "g", "r", "()Ljava/lang/Object;", "B", "(Ljava/lang/Object;)V", "movementOwner", "value", "t", "E", "h", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f65033i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 isMoving;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 cameraMoveStartedReason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 rawPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i0 lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3 map;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 onMapChanged;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 movementOwner;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final x<e, CameraPosition> f65034j = a0.e(new p() { // from class: fm.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return e.d((b0) obj, (e) obj2);
        }
    }, new l() { // from class: fm.c
        @Override // er.l
        public final Object b(Object obj) {
            return e.e((CameraPosition) obj);
        }
    });

    /* JADX INFO: renamed from: fm.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfm/e$a;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "Lfm/e;", "b", "(Lcom/google/android/gms/maps/model/CameraPosition;)Lfm/e;", "Lb3/x;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ e c(Companion companion, CameraPosition cameraPosition, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cameraPosition = new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f);
            }
            return companion.b(cameraPosition);
        }

        public final x<e, CameraPosition> a() {
            return e.f65034j;
        }

        public final e b(CameraPosition position) {
            return new e(position, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lfm/e$b;", "", "Llh/c;", "newMap", "Loq/i0;", "b", "(Llh/c;)V", "a", "()V", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    interface b {
        default void a() {
        }

        void b(lh.c newMap);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f65042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f65043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f65044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f65045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f65046h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f65048k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f65046h = obj;
            this.f65048k |= PKIFailureInfo.systemUnavail;
            return e.this.n(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final class d implements l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1448e f65050b;

        d(C1448e c1448e) {
            this.f65050b = c1448e;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            e.this.lock;
            i0 i0Var = i0.f148189a;
            e eVar = e.this;
            C1448e c1448e = this.f65050b;
            synchronized (i0Var) {
                if (eVar.s() == c1448e) {
                    eVar.D(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: fm.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"fm/e$e", "Lfm/e$b;", "Llh/c;", "newMap", "Loq/i0;", "b", "(Llh/c;)V", "a", "()V", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1448e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<i0> f65051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f65052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ lh.a f65053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f65054d;

        /* JADX WARN: Multi-variable type inference failed */
        C1448e(n<? super i0> nVar, e eVar, lh.a aVar, int i15) {
            this.f65051a = nVar;
            this.f65052b = eVar;
            this.f65053c = aVar;
            this.f65054d = i15;
        }

        @Override // fm.e.b
        public void a() {
            n<i0> nVar = this.f65051a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(u.a(new CancellationException("Animation cancelled"))));
        }

        @Override // fm.e.b
        public void b(lh.c newMap) {
            if (newMap != null) {
                this.f65052b.w(newMap, this.f65053c, this.f65054d, this.f65051a);
                return;
            }
            n<i0> nVar = this.f65051a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(u.a(new CancellationException("internal error; no GoogleMap available"))));
            throw new IllegalStateException("internal error; no GoogleMap available to animate position");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"fm/e$f", "Llh/c$a;", "Loq/i0;", "onCancel", "()V", "a", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements lh.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<i0> f65055a;

        /* JADX WARN: Multi-variable type inference failed */
        f(n<? super i0> nVar) {
            this.f65055a = nVar;
        }

        @Override // lh.c.a
        public void a() {
            n<i0> nVar = this.f65055a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(i0.f148189a));
        }

        @Override // lh.c.a
        public void onCancel() {
            n<i0> nVar = this.f65055a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(u.a(new CancellationException("Animation cancelled"))));
        }
    }

    public /* synthetic */ e(CameraPosition cameraPosition, k kVar) {
        this(cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Object obj) {
        this.movementOwner.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(b bVar) {
        this.onMapChanged.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPosition d(b0 b0Var, e eVar) {
        return eVar.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(CameraPosition cameraPosition) {
        return new e(cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(b callback) {
        b bVarS = s();
        if (bVarS != null) {
            bVarS.a();
        }
        D(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final lh.c q() {
        return (lh.c) this.map.getValue();
    }

    private final Object r() {
        return this.movementOwner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b s() {
        return (b) this.onMapChanged.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final lh.c map, lh.a update, int durationMs, n<? super i0> continuation) {
        f fVar = new f(continuation);
        if (durationMs == Integer.MAX_VALUE) {
            map.d(update, fVar);
        } else {
            map.c(update, durationMs, fVar);
        }
        o(new b() { // from class: fm.d
            @Override // fm.e.b
            public final void b(c cVar) {
                e.x(map, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(lh.c cVar, lh.c cVar2) {
        if (cVar2 != null) {
            throw new IllegalStateException("New GoogleMap unexpectedly set while an animation was still running");
        }
        cVar.R();
    }

    private final void z(lh.c cVar) {
        this.map.setValue(cVar);
    }

    public final void A(lh.c map) {
        synchronized (this.lock) {
            try {
                if (q() == null && map == null) {
                    return;
                }
                if (q() != null && map != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                z(map);
                if (map == null) {
                    C(false);
                } else {
                    map.i(lh.b.a(t()));
                }
                b bVarS = s();
                if (bVarS != null) {
                    D(null);
                    bVarS.b(map);
                    i0 i0Var = i0.f148189a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void C(boolean z15) {
        this.isMoving.setValue(Boolean.valueOf(z15));
    }

    public final void E(CameraPosition cameraPosition) {
        synchronized (this.lock) {
            try {
                lh.c cVarQ = q();
                if (cVarQ == null) {
                    F(cameraPosition);
                } else {
                    cVarQ.i(lh.b.a(cameraPosition));
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void F(CameraPosition cameraPosition) {
        this.rawPosition.setValue(cameraPosition);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: all -> 0x00b6, TryCatch #2 {, blocks: (B:40:0x00a3, B:42:0x00a9, B:44:0x00b2), top: B:72:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #2 {, blocks: (B:40:0x00a3, B:42:0x00a9, B:44:0x00b2), top: B:72:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca A[Catch: all -> 0x00d7, TryCatch #4 {all -> 0x00d7, blocks: (B:57:0x00c4, B:59:0x00ca, B:61:0x00d3, B:64:0x00d9), top: B:75:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3 A[Catch: all -> 0x00d7, TryCatch #4 {all -> 0x00d7, blocks: (B:57:0x00c4, B:59:0x00ca, B:61:0x00d3, B:64:0x00d9), top: B:75:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(lh.a aVar, int i15, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        d2 d2Var;
        lh.c cVarQ;
        lh.c cVarQ2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f65048k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f65048k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f65046h;
        Object objE = uq.b.e();
        int i17 = cVar.f65048k;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2Var = (d2) cVar.f65043e;
            try {
                u.b(obj);
                synchronized (this.lock) {
                    if (d2Var != null) {
                        if (r() == d2Var) {
                            B(null);
                            cVarQ2 = q();
                            if (cVarQ2 != null) {
                                cVarQ2.R();
                            }
                        }
                    }
                }
                return i0.f148189a;
            } catch (Throwable th4) {
                th = th4;
                synchronized (this.lock) {
                    if (d2Var != null) {
                        try {
                            if (r() == d2Var) {
                                B(null);
                                cVarQ = q();
                                if (cVarQ != null) {
                                    cVarQ.R();
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    i0 i0Var = i0.f148189a;
                }
                throw th;
            }
        }
        u.b(obj);
        d2 d2Var2 = (d2) cVar.getContext().m(d2.INSTANCE);
        try {
            cVar.f65042d = aVar;
            cVar.f65043e = d2Var2;
            cVar.f65044f = i15;
            cVar.f65045g = 0;
            cVar.f65048k = 1;
            ju.p pVar = new ju.p(uq.b.c(cVar), 1);
            pVar.D();
            this.lock;
            synchronized (i0.f148189a) {
                try {
                    B(d2Var2);
                    lh.c cVarQ3 = q();
                    if (cVarQ3 == null) {
                        C1448e c1448e = new C1448e(pVar, this, aVar, i15);
                        o(c1448e);
                        pVar.E(new d(c1448e));
                    } else {
                        w(cVarQ3, aVar, i15, pVar);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                g.c(cVar);
            }
            if (objX == objE) {
                return objE;
            }
            d2Var = d2Var2;
            synchronized (this.lock) {
                if (d2Var != null) {
                    if (r() == d2Var) {
                        B(null);
                        cVarQ2 = q();
                        if (cVarQ2 != null) {
                            cVarQ2.R();
                        }
                    }
                }
                return i0.f148189a;
            }
        } catch (Throwable th7) {
            th = th7;
            d2Var = d2Var2;
            synchronized (this.lock) {
                if (d2Var != null) {
                    if (r() == d2Var) {
                        B(null);
                        cVarQ = q();
                        if (cVarQ != null) {
                            cVarQ.R();
                        }
                    }
                }
                i0 i0Var2 = i0.f148189a;
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a p() {
        return (a) this.cameraMoveStartedReason.getValue();
    }

    public final CameraPosition t() {
        return u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraPosition u() {
        return (CameraPosition) this.rawPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isMoving.getValue()).booleanValue();
    }

    public final void y(a aVar) {
        this.cameraMoveStartedReason.setValue(aVar);
    }

    private e(CameraPosition cameraPosition) {
        this.isMoving = c6.e(Boolean.FALSE, null, 2, null);
        this.cameraMoveStartedReason = c6.e(a.NO_MOVEMENT_YET, null, 2, null);
        this.rawPosition = c6.e(cameraPosition, null, 2, null);
        this.lock = i0.f148189a;
        this.map = c6.e(null, null, 2, null);
        this.onMapChanged = c6.e(null, null, 2, null);
        this.movementOwner = c6.e(null, null, 2, null);
    }
}
