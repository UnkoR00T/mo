package c3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;
import p076m2.w3;
import p076m2.w5;
import p076m2.x5;
import r0.h1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00020\u0004\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010)j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0018078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0018\u0010<\u001a\u00060\u0001j\u0002`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010>R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u0010B\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010D¨\u0006F"}, d2 = {"Lc3/m0;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loq/i0;", "onChangedExecutor", "<init>", "(Ler/l;)V", "", "i", "()Z", "o", "()V", "", "set", "d", "(Ljava/util/Set;)V", "m", "()Ljava/util/Set;", "", "n", "()Ljava/lang/Void;", "T", "onChanged", "Lc3/m0$a;", "j", "(Ler/l;)Lc3/m0$a;", "scope", "onValueChangedForScope", "block", "k", "(Ljava/lang/Object;Ler/l;Ler/a;)V", "g", "(Ljava/lang/Object;)V", "predicate", "h", "q", "r", "f", "a", "Ler/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "Lc3/l;", "Ler/p;", "applyObserver", "e", "readObserver", "Ln2/c;", "Ln2/c;", "observedScopeMaps", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "observedScopeMapsLock", "Lc3/g;", "Lc3/g;", "applyUnsubscribe", "isPaused", "Lc3/m0$a;", "currentMap", "", "J", "currentMapThreadId", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22837l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<er.a<oq.i0>, oq.i0> onChangedExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sendingNotifications;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private g applyUnsubscribe;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a currentMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.p<Set<? extends Object>, l, oq.i0> applyObserver = new er.p() { // from class: c3.j0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return m0.e(this.f22826a, (Set) obj, (l) obj2);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> readObserver = new er.l() { // from class: c3.k0
        @Override // er.l
        public final Object b(Object obj) {
            return m0.l(this.f22828a, obj);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n2.c<a> observedScopeMaps = new n2.c<>(new a[16], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object observedScopeMapsLock = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long currentMapThreadId = -1;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00032\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0003¢\u0006\u0004\b%\u0010\u001cR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010K\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R$\u0010M\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030!018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R<\u0010Q\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\u00010Nj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\u0001`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010P¨\u0006R"}, d2 = {"Lc3/m0$a;", "", "Lkotlin/Function1;", "Loq/i0;", "onChanged", "<init>", "(Ler/l;)V", "value", "", "currentToken", "currentScope", "Lr0/p0;", "recordedValues", "t", "(Ljava/lang/Object;ILjava/lang/Object;Lr0/p0;)V", "scope", "l", "(Ljava/lang/Object;)V", "u", "(Ljava/lang/Object;Ljava/lang/Object;)V", "s", "m", "", "predicate", "v", "p", "()Z", "k", "()V", "", "changes", "r", "(Ljava/util/Set;)Z", "Lm2/o0;", "derivedState", "w", "(Lm2/o0;)V", "q", "a", "Ler/l;", "o", "()Ler/l;", "b", "Ljava/lang/Object;", "c", "Lr0/p0;", "currentScopeReads", "d", "I", "Ln2/g;", "e", "Lr0/t0;", "valueToScopes", "Lr0/t0;", "f", "scopeToValues", "Lr0/u0;", "g", "Lr0/u0;", "invalidated", "Ln2/c;", "h", "Ln2/c;", "statesToReread", "Lm2/p0;", "i", "Lm2/p0;", "n", "()Lm2/p0;", "derivedStateObserver", "j", "Z", "getReadingDerivedStates", "setReadingDerivedStates", "(Z)V", "readingDerivedStates", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.l<Object, oq.i0> onChanged;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Object currentScope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private r0.p0<Object> currentScopeReads;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean readingDerivedStates;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private int deriveStateScopeCount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int currentToken = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final r0.t0<Object, Object> valueToScopes = n2.g.e(null, 1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final r0.t0<Object, r0.p0<Object>> scopeToValues = new r0.t0<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final r0.u0<Object> invalidated = new r0.u0<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final n2.c<p076m2.o0<?>> statesToReread = new n2.c<>(new p076m2.o0[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final p076m2.p0 derivedStateObserver = new C0604a();

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final r0.t0<Object, Object> dependencyToDerivedStates = n2.g.e(null, 1, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final HashMap<p076m2.o0<?>, Object> recordedDerivedStateValues = new HashMap<>();

        /* JADX INFO: renamed from: c3.m0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"c3/m0$a$a", "Lm2/p0;", "Lm2/o0;", "derivedState", "Loq/i0;", "b", "(Lm2/o0;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0604a implements p076m2.p0 {
            C0604a() {
            }

            @Override // p076m2.p0
            public void a(p076m2.o0<?> derivedState) {
                a.this.deriveStateScopeCount--;
            }

            @Override // p076m2.p0
            public void b(p076m2.o0<?> derivedState) {
                a.this.deriveStateScopeCount++;
            }
        }

        public a(er.l<Object, oq.i0> lVar) {
            this.onChanged = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l(Object scope) {
            int i15 = this.currentToken;
            r0.p0<Object> p0Var = this.currentScopeReads;
            if (p0Var == null) {
                return;
            }
            long[] jArr = p0Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j15 = jArr[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((255 & j15) < 128) {
                            int i19 = (i16 << 3) + i18;
                            Object obj = p0Var.keys[i19];
                            boolean z15 = p0Var.values[i19] != i15;
                            if (z15) {
                                u(scope, obj);
                            }
                            if (z15) {
                                p0Var.s(i19);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length) {
                    return;
                } else {
                    i16++;
                }
            }
        }

        private final void t(Object value, int currentToken, Object currentScope, r0.p0<Object> recordedValues) {
            int i15;
            int i16;
            int i17;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iQ = recordedValues.q(value, currentToken, -1);
            int i18 = 2;
            if (!(value instanceof p076m2.o0) || iQ == currentToken) {
                i15 = 2;
                i16 = -1;
            } else {
                m2.o0.a aVarX = ((p076m2.o0) value).x();
                this.recordedDerivedStateValues.put(value, aVarX.a());
                r0.y0<u0> y0VarB = aVarX.b();
                r0.t0<Object, Object> t0Var = this.dependencyToDerivedStates;
                n2.g.n(t0Var, value);
                Object[] objArr = y0VarB.keys;
                long[] jArr = y0VarB.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i19 = 0;
                    while (true) {
                        long j15 = jArr[i19];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i25 = 8 - ((~(i19 - length)) >>> 31);
                            int i26 = 0;
                            while (i26 < i25) {
                                if ((j15 & 255) < 128) {
                                    i17 = i18;
                                    u0 u0Var = (u0) objArr[(i19 << 3) + i26];
                                    if (u0Var instanceof v0) {
                                        ((v0) u0Var).z(h.a(i17));
                                    }
                                    n2.g.a(t0Var, u0Var, value);
                                } else {
                                    i17 = i18;
                                }
                                j15 >>= 8;
                                i26++;
                                i18 = i17;
                            }
                            i15 = i18;
                            if (i25 != 8) {
                                break;
                            }
                        } else {
                            i15 = i18;
                        }
                        if (i19 == length) {
                            break;
                        }
                        i19++;
                        i18 = i15;
                    }
                } else {
                    i15 = 2;
                }
                i16 = -1;
            }
            if (iQ == i16) {
                if (value instanceof v0) {
                    ((v0) value).z(h.a(i15));
                }
                n2.g.a(this.valueToScopes, value, currentScope);
            }
        }

        private final void u(Object scope, Object value) {
            n2.g.m(this.valueToScopes, value, scope);
            if (!(value instanceof p076m2.o0) || n2.g.f(this.valueToScopes, value)) {
                return;
            }
            n2.g.n(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void k() {
            n2.g.c(this.valueToScopes);
            this.scopeToValues.k();
            n2.g.c(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void m(Object scope) {
            r0.p0<Object> p0VarU = this.scopeToValues.u(scope);
            if (p0VarU == null) {
                return;
            }
            Object[] objArr = p0VarU.keys;
            int[] iArr = p0VarU.values;
            long[] jArr = p0VarU.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = objArr[i18];
                            int i19 = iArr[i18];
                            u(scope, obj);
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length) {
                    return;
                } else {
                    i15++;
                }
            }
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final p076m2.p0 getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final er.l<Object, oq.i0> o() {
            return this.onChanged;
        }

        public final boolean p() {
            return this.scopeToValues.i();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void q() {
            r0.u0<Object> u0Var = this.invalidated;
            er.l<Object, oq.i0> lVar = this.onChanged;
            Object[] objArr = u0Var.elements;
            long[] jArr = u0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                lVar.b(objArr[(i15 << 3) + i17]);
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            u0Var.n();
        }

        /* JADX WARN: Code duplicated, block: B:100:0x022f A[DONT_INVERT, PHI: r20
          0x022f: PHI (r20v38 boolean) = (r20v37 boolean), (r20v39 boolean) binds: [B:91:0x0207, B:99:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:101:0x0231 A[Catch: all -> 0x00da, LOOP:8: B:90:0x01fd->B:101:0x0231, LOOP_END, TryCatch #0 {all -> 0x00da, blocks: (B:23:0x0081, B:25:0x0087, B:27:0x008b, B:30:0x009d, B:32:0x00ad, B:34:0x00b7, B:36:0x00bd, B:38:0x00d5, B:41:0x00de, B:43:0x00ee, B:45:0x00f4, B:47:0x00f8, B:50:0x0108, B:52:0x0118, B:54:0x0122, B:56:0x0128, B:58:0x0138, B:66:0x015f, B:70:0x017f, B:62:0x0143, B:63:0x014c, B:67:0x0164, B:76:0x01a6, B:78:0x01bb, B:80:0x01d5, B:81:0x01d9, B:83:0x01e7, B:85:0x01ed, B:87:0x01f1, B:90:0x01fd, B:92:0x0209, B:94:0x0215, B:96:0x021b, B:97:0x0225, B:101:0x0231, B:102:0x0234, B:103:0x0239, B:104:0x023d), top: B:291:0x0081 }] */
        /* JADX WARN: Code duplicated, block: B:130:0x02b4 A[DONT_INVERT, PHI: r20
          0x02b4: PHI (r20v30 boolean) = (r20v29 boolean), (r20v31 boolean) binds: [B:121:0x028b, B:129:0x02b2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:131:0x02b6 A[LOOP:6: B:120:0x0281->B:131:0x02b6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:245:0x04f4 A[Catch: all -> 0x039d, LOOP:18: B:232:0x04bb->B:245:0x04f4, LOOP_END, TryCatch #1 {all -> 0x039d, blocks: (B:158:0x0346, B:160:0x034c, B:162:0x0350, B:165:0x035d, B:167:0x036a, B:169:0x0376, B:171:0x037c, B:173:0x0394, B:177:0x03a1, B:179:0x03b1, B:181:0x03b7, B:183:0x03bb, B:186:0x03ca, B:188:0x03da, B:190:0x03e7, B:192:0x03ed, B:195:0x0400, B:201:0x0414, B:207:0x042d, B:211:0x044b, B:203:0x041d, B:208:0x0432, B:218:0x0472, B:220:0x0482, B:222:0x0492, B:223:0x0496, B:225:0x04a4, B:227:0x04aa, B:229:0x04ae, B:232:0x04bb, B:234:0x04c7, B:236:0x04d5, B:238:0x04db, B:239:0x04e4, B:245:0x04f4, B:247:0x04f9, B:248:0x04fd, B:249:0x0501), top: B:293:0x0346 }] */
        /* JADX WARN: Code duplicated, block: B:251:0x0508  */
        /* JADX WARN: Code duplicated, block: B:304:0x015d A[EDGE_INSN: B:304:0x015d->B:65:0x015d BREAK  A[LOOP:4: B:50:0x0108->B:62:0x0143], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:309:0x02be A[EDGE_INSN: B:309:0x02be->B:133:0x02be BREAK  A[LOOP:6: B:120:0x0281->B:131:0x02b6], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:314:0x0239 A[EDGE_INSN: B:314:0x0239->B:103:0x0239 BREAK  A[LOOP:8: B:90:0x01fd->B:101:0x0231], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:336:0x04f7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x0141 A[DONT_INVERT, PHI: r20
          0x0141: PHI (r20v49 boolean) = (r20v48 boolean), (r20v50 boolean) binds: [B:51:0x0116, B:60:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:62:0x0143 A[Catch: all -> 0x00da, LOOP:4: B:50:0x0108->B:62:0x0143, LOOP_END, TryCatch #0 {all -> 0x00da, blocks: (B:23:0x0081, B:25:0x0087, B:27:0x008b, B:30:0x009d, B:32:0x00ad, B:34:0x00b7, B:36:0x00bd, B:38:0x00d5, B:41:0x00de, B:43:0x00ee, B:45:0x00f4, B:47:0x00f8, B:50:0x0108, B:52:0x0118, B:54:0x0122, B:56:0x0128, B:58:0x0138, B:66:0x015f, B:70:0x017f, B:62:0x0143, B:63:0x014c, B:67:0x0164, B:76:0x01a6, B:78:0x01bb, B:80:0x01d5, B:81:0x01d9, B:83:0x01e7, B:85:0x01ed, B:87:0x01f1, B:90:0x01fd, B:92:0x0209, B:94:0x0215, B:96:0x021b, B:97:0x0225, B:101:0x0231, B:102:0x0234, B:103:0x0239, B:104:0x023d), top: B:291:0x0081 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0157  */
        public final boolean r(Set<? extends Object> changes) {
            boolean z15;
            Iterator it;
            r0.t0<Object, Object> t0Var;
            int i15;
            Object[] objArr;
            long[] jArr;
            Iterator it4;
            r0.t0<Object, Object> t0Var2;
            int i16;
            Object[] objArr2;
            long j15;
            long[] jArr2;
            boolean z16;
            long[] jArr3;
            long[] jArr4;
            Object[] objArr3;
            int i17;
            long[] jArr5;
            Object[] objArr4;
            int i18;
            int i19;
            long j16;
            int i25;
            int i26;
            Object obj;
            long[] jArr6;
            long[] jArr7;
            Object obj2;
            int i27;
            int i28;
            long j17;
            int i29;
            boolean z17;
            r0.t0<Object, Object> t0Var3 = this.dependencyToDerivedStates;
            HashMap<p076m2.o0<?>, Object> map = this.recordedDerivedStateValues;
            r0.t0<Object, Object> t0Var4 = this.valueToScopes;
            r0.u0<Object> u0Var = this.invalidated;
            int i35 = 8;
            if (changes instanceof n2.e) {
                h1 h1VarE = ((n2.e) changes).e();
                Object[] objArr5 = h1VarE.elements;
                long[] jArr8 = h1VarE.metadata;
                int length = jArr8.length - 2;
                if (length >= 0) {
                    int i36 = 0;
                    z15 = false;
                    while (true) {
                        long j18 = jArr8[i36];
                        if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i37 = 8 - ((~(i36 - length)) >>> 31);
                            int i38 = 0;
                            while (i38 < i37) {
                                if ((j18 & 255) < 128) {
                                    Object obj3 = objArr5[(i36 << 3) + i38];
                                    int i39 = i35;
                                    if (!(obj3 instanceof v0) || ((v0) obj3).y(h.a(2))) {
                                        if (this.readingDerivedStates || !n2.g.f(t0Var3, obj3)) {
                                            jArr5 = jArr8;
                                            objArr4 = objArr5;
                                            obj = obj3;
                                            i18 = length;
                                            i19 = i36;
                                            j16 = j18;
                                            i25 = i38;
                                        } else {
                                            this.readingDerivedStates = true;
                                            try {
                                                Object objE = t0Var3.e(obj3);
                                                if (objE != null) {
                                                    if (objE instanceof r0.u0) {
                                                        r0.u0 u0Var2 = (r0.u0) objE;
                                                        Object[] objArr6 = u0Var2.elements;
                                                        long[] jArr9 = u0Var2.metadata;
                                                        jArr5 = jArr8;
                                                        int length2 = jArr9.length - 2;
                                                        objArr4 = objArr5;
                                                        if (length2 >= 0) {
                                                            j16 = j18;
                                                            int i45 = 0;
                                                            while (true) {
                                                                long j19 = jArr9[i45];
                                                                i25 = i38;
                                                                Object[] objArr7 = objArr6;
                                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i46 = 8 - ((~(i45 - length2)) >>> 31);
                                                                    int i47 = 0;
                                                                    while (i47 < i46) {
                                                                        if ((j19 & 255) < 128) {
                                                                            jArr7 = jArr9;
                                                                            p076m2.o0<?> o0Var = (p076m2.o0) objArr7[(i45 << 3) + i47];
                                                                            j17 = j19;
                                                                            Object obj4 = map.get(o0Var);
                                                                            w5<?> w5VarC = o0Var.c();
                                                                            if (w5VarC == null) {
                                                                                w5VarC = x5.r();
                                                                            }
                                                                            i29 = i47;
                                                                            if (w5VarC.b(o0Var.x().a(), obj4)) {
                                                                                obj2 = obj3;
                                                                                i27 = length;
                                                                                i28 = i36;
                                                                                this.statesToReread.d(o0Var);
                                                                            } else {
                                                                                Object objE2 = t0Var4.e(o0Var);
                                                                                if (objE2 == null) {
                                                                                    obj2 = obj3;
                                                                                    i27 = length;
                                                                                    i28 = i36;
                                                                                    z17 = z15;
                                                                                } else if (objE2 instanceof r0.u0) {
                                                                                    r0.u0 u0Var3 = (r0.u0) objE2;
                                                                                    Object[] objArr8 = u0Var3.elements;
                                                                                    long[] jArr10 = u0Var3.metadata;
                                                                                    int length3 = jArr10.length - 2;
                                                                                    if (length3 >= 0) {
                                                                                        i27 = length;
                                                                                        i28 = i36;
                                                                                        int i48 = 0;
                                                                                        while (true) {
                                                                                            long j25 = jArr10[i48];
                                                                                            long[] jArr11 = jArr10;
                                                                                            obj2 = obj3;
                                                                                            if ((((~j25) << 7) & j25 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                                if (i48 != length3) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i48++;
                                                                                                obj3 = obj2;
                                                                                                jArr10 = jArr11;
                                                                                                i39 = 8;
                                                                                            } else {
                                                                                                int i49 = 8 - ((~(i48 - length3)) >>> 31);
                                                                                                for (int i55 = 0; i55 < i49; i55++) {
                                                                                                    if ((j25 & 255) < 128) {
                                                                                                        u0Var.i(objArr8[(i48 << 3) + i55]);
                                                                                                        z15 = true;
                                                                                                    }
                                                                                                    j25 >>= i39;
                                                                                                }
                                                                                                if (i49 != i39) {
                                                                                                    break;
                                                                                                }
                                                                                                if (i48 != length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i48++;
                                                                                                obj3 = obj2;
                                                                                                jArr10 = jArr11;
                                                                                                i39 = 8;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        obj2 = obj3;
                                                                                        i27 = length;
                                                                                        i28 = i36;
                                                                                    }
                                                                                    z17 = z15;
                                                                                } else {
                                                                                    obj2 = obj3;
                                                                                    i27 = length;
                                                                                    i28 = i36;
                                                                                    u0Var.i(objE2);
                                                                                    z17 = true;
                                                                                }
                                                                                oq.i0 i0Var = oq.i0.f148189a;
                                                                                z15 = z17;
                                                                            }
                                                                        } else {
                                                                            jArr7 = jArr9;
                                                                            obj2 = obj3;
                                                                            i27 = length;
                                                                            i28 = i36;
                                                                            j17 = j19;
                                                                            i29 = i47;
                                                                        }
                                                                        j19 = j17 >> 8;
                                                                        i47 = i29 + 1;
                                                                        i39 = 8;
                                                                        length = i27;
                                                                        jArr9 = jArr7;
                                                                        i36 = i28;
                                                                        obj3 = obj2;
                                                                    }
                                                                    jArr6 = jArr9;
                                                                    obj = obj3;
                                                                    i18 = length;
                                                                    i19 = i36;
                                                                    if (i46 != i39) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr6 = jArr9;
                                                                    obj = obj3;
                                                                    i18 = length;
                                                                    i19 = i36;
                                                                }
                                                                if (i45 == length2) {
                                                                    break;
                                                                }
                                                                i45++;
                                                                i38 = i25;
                                                                objArr6 = objArr7;
                                                                length = i18;
                                                                jArr9 = jArr6;
                                                                i36 = i19;
                                                                obj3 = obj;
                                                                i39 = 8;
                                                            }
                                                        }
                                                    } else {
                                                        jArr5 = jArr8;
                                                        objArr4 = objArr5;
                                                        obj = obj3;
                                                        i18 = length;
                                                        i19 = i36;
                                                        j16 = j18;
                                                        i25 = i38;
                                                        p076m2.o0<?> o0Var2 = (p076m2.o0) objE;
                                                        Object obj5 = map.get(o0Var2);
                                                        w5<?> w5VarC2 = o0Var2.c();
                                                        if (w5VarC2 == null) {
                                                            w5VarC2 = x5.r();
                                                        }
                                                        if (w5VarC2.b(o0Var2.x().a(), obj5)) {
                                                            this.statesToReread.d(o0Var2);
                                                        } else {
                                                            Object objE3 = t0Var4.e(o0Var2);
                                                            if (objE3 != null) {
                                                                if (objE3 instanceof r0.u0) {
                                                                    r0.u0 u0Var4 = (r0.u0) objE3;
                                                                    Object[] objArr9 = u0Var4.elements;
                                                                    long[] jArr12 = u0Var4.metadata;
                                                                    int length4 = jArr12.length - 2;
                                                                    if (length4 >= 0) {
                                                                        int i56 = 0;
                                                                        while (true) {
                                                                            long j26 = jArr12[i56];
                                                                            if ((((~j26) << 7) & j26 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i56 != length4) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i56++;
                                                                            } else {
                                                                                int i57 = 8 - ((~(i56 - length4)) >>> 31);
                                                                                for (int i58 = 0; i58 < i57; i58++) {
                                                                                    if ((j26 & 255) < 128) {
                                                                                        u0Var.i(objArr9[(i56 << 3) + i58]);
                                                                                        z15 = true;
                                                                                    }
                                                                                    j26 >>= 8;
                                                                                }
                                                                                if (i57 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i56 != length4) {
                                                                                    break;
                                                                                }
                                                                                i56++;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    u0Var.i(objE3);
                                                                    z15 = true;
                                                                }
                                                            }
                                                            oq.i0 i0Var2 = oq.i0.f148189a;
                                                        }
                                                    }
                                                    this.readingDerivedStates = false;
                                                } else {
                                                    jArr5 = jArr8;
                                                    objArr4 = objArr5;
                                                }
                                                obj = obj3;
                                                i18 = length;
                                                i19 = i36;
                                                j16 = j18;
                                                i25 = i38;
                                                this.readingDerivedStates = false;
                                            } catch (Throwable th4) {
                                                this.readingDerivedStates = false;
                                                throw th4;
                                            }
                                        }
                                        Object objE4 = t0Var4.e(obj);
                                        if (objE4 != null) {
                                            if (objE4 instanceof r0.u0) {
                                                r0.u0 u0Var5 = (r0.u0) objE4;
                                                Object[] objArr10 = u0Var5.elements;
                                                long[] jArr13 = u0Var5.metadata;
                                                int length5 = jArr13.length - 2;
                                                if (length5 >= 0) {
                                                    int i59 = 0;
                                                    while (true) {
                                                        long j27 = jArr13[i59];
                                                        if ((((~j27) << 7) & j27 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                            if (i59 != length5) {
                                                                break;
                                                                break;
                                                            }
                                                            i59++;
                                                        } else {
                                                            int i65 = 8 - ((~(i59 - length5)) >>> 31);
                                                            long j28 = j27;
                                                            for (int i66 = 0; i66 < i65; i66++) {
                                                                if ((j28 & 255) < 128) {
                                                                    u0Var.i(objArr10[(i59 << 3) + i66]);
                                                                    z15 = true;
                                                                }
                                                                j28 >>= 8;
                                                            }
                                                            if (i65 != 8) {
                                                                break;
                                                            }
                                                            if (i59 != length5) {
                                                                break;
                                                            }
                                                            i59++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                u0Var.i(objE4);
                                                z15 = true;
                                            }
                                        }
                                    } else {
                                        jArr5 = jArr8;
                                        objArr4 = objArr5;
                                        i18 = length;
                                        i19 = i36;
                                        j16 = j18;
                                        i25 = i38;
                                    }
                                    i26 = 8;
                                } else {
                                    jArr5 = jArr8;
                                    objArr4 = objArr5;
                                    i18 = length;
                                    i19 = i36;
                                    j16 = j18;
                                    i25 = i38;
                                    i26 = i35;
                                }
                                j18 = j16 >> i26;
                                i38 = i25 + 1;
                                jArr8 = jArr5;
                                i35 = i26;
                                objArr5 = objArr4;
                                length = i18;
                                i36 = i19;
                            }
                            jArr4 = jArr8;
                            objArr3 = objArr5;
                            int i67 = length;
                            int i68 = i36;
                            if (i37 != i35) {
                                break;
                            }
                            length = i67;
                            i17 = i68;
                        } else {
                            jArr4 = jArr8;
                            objArr3 = objArr5;
                            i17 = i36;
                        }
                        if (i17 == length) {
                            break;
                        }
                        i36 = i17 + 1;
                        jArr8 = jArr4;
                        objArr5 = objArr3;
                        i35 = 8;
                    }
                } else {
                    z15 = false;
                }
            } else {
                Iterator it5 = changes.iterator();
                boolean z18 = false;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (!(next instanceof v0) || ((v0) next).y(h.a(2))) {
                        if (this.readingDerivedStates || !n2.g.f(t0Var3, next)) {
                            it = it5;
                            t0Var = t0Var3;
                            i15 = 0;
                        } else {
                            this.readingDerivedStates = true;
                            try {
                                Object objE5 = t0Var3.e(next);
                                if (objE5 == null) {
                                    it = it5;
                                    t0Var = t0Var3;
                                } else if (objE5 instanceof r0.u0) {
                                    r0.u0 u0Var6 = (r0.u0) objE5;
                                    Object[] objArr11 = u0Var6.elements;
                                    long[] jArr14 = u0Var6.metadata;
                                    int length6 = jArr14.length - 2;
                                    if (length6 >= 0) {
                                        boolean z19 = z18;
                                        int i69 = 0;
                                        while (true) {
                                            long j29 = jArr14[i69];
                                            long[] jArr15 = jArr14;
                                            if ((((~j29) << 7) & j29 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i75 = 8 - ((~(i69 - length6)) >>> 31);
                                                int i76 = 0;
                                                while (i76 < i75) {
                                                    if ((j29 & 255) < 128) {
                                                        it4 = it5;
                                                        p076m2.o0<?> o0Var3 = (p076m2.o0) objArr11[(i69 << 3) + i76];
                                                        t0Var2 = t0Var3;
                                                        Object obj6 = map.get(o0Var3);
                                                        w5<?> w5VarC3 = o0Var3.c();
                                                        if (w5VarC3 == null) {
                                                            w5VarC3 = x5.r();
                                                        }
                                                        i16 = i76;
                                                        objArr2 = objArr11;
                                                        if (w5VarC3.b(o0Var3.x().a(), obj6)) {
                                                            j15 = j29;
                                                            jArr2 = jArr15;
                                                            this.statesToReread.d(o0Var3);
                                                        } else {
                                                            Object objE6 = t0Var4.e(o0Var3);
                                                            if (objE6 != null) {
                                                                if (objE6 instanceof r0.u0) {
                                                                    r0.u0 u0Var7 = (r0.u0) objE6;
                                                                    Object[] objArr12 = u0Var7.elements;
                                                                    long[] jArr16 = u0Var7.metadata;
                                                                    int length7 = jArr16.length - 2;
                                                                    j15 = j29;
                                                                    if (length7 >= 0) {
                                                                        int i77 = 0;
                                                                        boolean z25 = z19;
                                                                        while (true) {
                                                                            long j35 = jArr16[i77];
                                                                            z16 = z25;
                                                                            jArr2 = jArr15;
                                                                            if ((((~j35) << 7) & j35 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i78 = 8 - ((~(i77 - length7)) >>> 31);
                                                                                long j36 = j35;
                                                                                int i79 = 0;
                                                                                while (i79 < i78) {
                                                                                    if ((j36 & 255) < 128) {
                                                                                        u0Var.i(objArr12[(i77 << 3) + i79]);
                                                                                        z16 = true;
                                                                                    }
                                                                                    j36 >>= 8;
                                                                                    i79++;
                                                                                    jArr16 = jArr16;
                                                                                }
                                                                                jArr3 = jArr16;
                                                                                if (i78 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr16;
                                                                            }
                                                                            z25 = z16;
                                                                            if (i77 != length7) {
                                                                                i77++;
                                                                                jArr15 = jArr2;
                                                                                jArr16 = jArr3;
                                                                            } else {
                                                                                z19 = z25;
                                                                            }
                                                                        }
                                                                    }
                                                                    z16 = z19;
                                                                    break;
                                                                } else {
                                                                    j15 = j29;
                                                                    jArr2 = jArr15;
                                                                    u0Var.i(objE6);
                                                                    z16 = true;
                                                                }
                                                                oq.i0 i0Var3 = oq.i0.f148189a;
                                                                z19 = z16;
                                                            } else {
                                                                j15 = j29;
                                                            }
                                                            jArr2 = jArr15;
                                                            z16 = z19;
                                                            oq.i0 i0Var4 = oq.i0.f148189a;
                                                            z19 = z16;
                                                        }
                                                    } else {
                                                        it4 = it5;
                                                        t0Var2 = t0Var3;
                                                        i16 = i76;
                                                        objArr2 = objArr11;
                                                        j15 = j29;
                                                        jArr2 = jArr15;
                                                    }
                                                    j29 = j15 >> 8;
                                                    i76 = i16 + 1;
                                                    it5 = it4;
                                                    t0Var3 = t0Var2;
                                                    jArr15 = jArr2;
                                                    objArr11 = objArr2;
                                                }
                                                it = it5;
                                                t0Var = t0Var3;
                                                objArr = objArr11;
                                                jArr = jArr15;
                                                if (i75 != 8) {
                                                    break;
                                                }
                                            } else {
                                                it = it5;
                                                t0Var = t0Var3;
                                                objArr = objArr11;
                                                jArr = jArr15;
                                            }
                                            if (i69 == length6) {
                                                break;
                                            }
                                            i69++;
                                            it5 = it;
                                            t0Var3 = t0Var;
                                            jArr14 = jArr;
                                            objArr11 = objArr;
                                        }
                                        z18 = z19;
                                    } else {
                                        it = it5;
                                        t0Var = t0Var3;
                                    }
                                } else {
                                    it = it5;
                                    t0Var = t0Var3;
                                    p076m2.o0<?> o0Var4 = (p076m2.o0) objE5;
                                    Object obj7 = map.get(o0Var4);
                                    w5<?> w5VarC4 = o0Var4.c();
                                    if (w5VarC4 == null) {
                                        w5VarC4 = x5.r();
                                    }
                                    if (w5VarC4.b(o0Var4.x().a(), obj7)) {
                                        this.statesToReread.d(o0Var4);
                                    } else {
                                        Object objE7 = t0Var4.e(o0Var4);
                                        if (objE7 != null) {
                                            if (objE7 instanceof r0.u0) {
                                                r0.u0 u0Var8 = (r0.u0) objE7;
                                                Object[] objArr13 = u0Var8.elements;
                                                long[] jArr17 = u0Var8.metadata;
                                                int length8 = jArr17.length - 2;
                                                if (length8 >= 0) {
                                                    boolean z26 = z18;
                                                    int i85 = 0;
                                                    while (true) {
                                                        long j37 = jArr17[i85];
                                                        if ((((~j37) << 7) & j37 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                            if (i85 != length8) {
                                                                z18 = z26;
                                                                break;
                                                            }
                                                            i85++;
                                                        } else {
                                                            int i86 = 8 - ((~(i85 - length8)) >>> 31);
                                                            long j38 = j37;
                                                            boolean z27 = z26;
                                                            for (int i87 = 0; i87 < i86; i87++) {
                                                                if ((j38 & 255) < 128) {
                                                                    u0Var.i(objArr13[(i85 << 3) + i87]);
                                                                    z27 = true;
                                                                }
                                                                j38 >>= 8;
                                                            }
                                                            if (i86 != 8) {
                                                                z18 = z27;
                                                                break;
                                                            }
                                                            z26 = z27;
                                                            if (i85 != length8) {
                                                                z18 = z26;
                                                                break;
                                                            }
                                                            i85++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                u0Var.i(objE7);
                                                z18 = true;
                                            }
                                        }
                                        oq.i0 i0Var5 = oq.i0.f148189a;
                                    }
                                }
                                i15 = 0;
                                this.readingDerivedStates = false;
                            } catch (Throwable th5) {
                                this.readingDerivedStates = false;
                                throw th5;
                            }
                        }
                        Object objE8 = t0Var4.e(next);
                        if (objE8 != null) {
                            if (objE8 instanceof r0.u0) {
                                r0.u0 u0Var9 = (r0.u0) objE8;
                                Object[] objArr14 = u0Var9.elements;
                                long[] jArr18 = u0Var9.metadata;
                                int length9 = jArr18.length - 2;
                                if (length9 >= 0) {
                                    boolean z28 = z18;
                                    int i88 = i15;
                                    while (true) {
                                        long j39 = jArr18[i88];
                                        if ((((~j39) << 7) & j39 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i89 = 8 - ((~(i88 - length9)) >>> 31);
                                            long j45 = j39;
                                            boolean z29 = z28;
                                            for (int i95 = i15; i95 < i89; i95++) {
                                                if ((j45 & 255) < 128) {
                                                    u0Var.i(objArr14[(i88 << 3) + i95]);
                                                    z29 = true;
                                                }
                                                j45 >>= 8;
                                            }
                                            if (i89 != 8) {
                                                z18 = z29;
                                                break;
                                            }
                                            z28 = z29;
                                        }
                                        if (i88 == length9) {
                                            z18 = z28;
                                            break;
                                        }
                                        i88++;
                                    }
                                }
                            } else {
                                u0Var.i(objE8);
                                z18 = true;
                            }
                        }
                        it5 = it;
                        t0Var3 = t0Var;
                    } else {
                        it = it5;
                        t0Var = t0Var3;
                    }
                    it5 = it;
                    t0Var3 = t0Var;
                }
                z15 = z18;
            }
            if (!this.readingDerivedStates && this.statesToReread.getSize() != 0) {
                n2.c<p076m2.o0<?>> cVar = this.statesToReread;
                p076m2.o0<?>[] o0VarArr = cVar.content;
                int size = cVar.getSize();
                for (int i96 = 0; i96 < size; i96++) {
                    w(o0VarArr[i96]);
                }
                this.statesToReread.j();
            }
            return z15;
        }

        public final void s(Object value) {
            Object obj = this.currentScope;
            int i15 = this.currentToken;
            r0.p0<Object> p0Var = this.currentScopeReads;
            if (p0Var == null) {
                p0Var = new r0.p0<>(0, 1, null);
                this.currentScopeReads = p0Var;
                this.scopeToValues.x(obj, p0Var);
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t(value, i15, obj, p0Var);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void v(er.l<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j15;
            char c15;
            long j16;
            int i15;
            r0.t0<Object, r0.p0<Object>> t0Var = this.scopeToValues;
            long[] jArr3 = t0Var.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j17 = jArr3[i16];
                char c16 = 7;
                long j18 = -9187201950435737472L;
                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j17 & 255) < 128) {
                            int i25 = (i16 << 3) + i19;
                            c15 = c16;
                            Object obj = t0Var.keys[i25];
                            j16 = j18;
                            r0.p0 p0Var = (r0.p0) t0Var.values[i25];
                            Boolean boolB = predicate.b(obj);
                            if (boolB.booleanValue()) {
                                Object[] objArr = p0Var.keys;
                                int[] iArr = p0Var.values;
                                long[] jArr4 = p0Var.metadata;
                                int i26 = i17;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j15 = j17;
                                    int i27 = 0;
                                    while (true) {
                                        long j19 = jArr4[i27];
                                        long[] jArr5 = jArr4;
                                        if ((((~j19) << c15) & j19 & j16) != j16) {
                                            int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                            for (int i29 = 0; i29 < i28; i29++) {
                                                if ((j19 & 255) < 128) {
                                                    int i35 = (i27 << 3) + i29;
                                                    Object obj2 = objArr[i35];
                                                    int i36 = iArr[i35];
                                                    u(obj, obj2);
                                                }
                                                j19 >>= i26;
                                            }
                                            if (i28 != i26) {
                                                break;
                                            }
                                            if (i27 != length2) {
                                                break;
                                            }
                                            i27++;
                                            jArr4 = jArr5;
                                            i26 = 8;
                                        } else if (i27 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i27++;
                                            jArr4 = jArr5;
                                            i26 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j15 = j17;
                                }
                            } else {
                                jArr2 = jArr3;
                                j15 = j17;
                            }
                            if (boolB.booleanValue()) {
                                t0Var.v(i25);
                            }
                            i15 = 8;
                        } else {
                            jArr2 = jArr3;
                            j15 = j17;
                            c15 = c16;
                            j16 = j18;
                            i15 = i17;
                        }
                        i19++;
                        i17 = i15;
                        j17 = j15 >> i15;
                        c16 = c15;
                        j18 = j16;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i18 != i17) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i16 == length) {
                    return;
                }
                i16++;
                jArr3 = jArr;
            }
        }

        public final void w(p076m2.o0<?> derivedState) {
            long[] jArr;
            r0.p0<Object> p0Var;
            r0.t0<Object, r0.p0<Object>> t0Var = this.scopeToValues;
            int iHashCode = Long.hashCode(w.K().getSnapshotId());
            Object objE = this.valueToScopes.e(derivedState);
            if (objE == null) {
                return;
            }
            if (!(objE instanceof r0.u0)) {
                r0.p0<Object> p0VarE = t0Var.e(objE);
                if (p0VarE == null) {
                    p0VarE = new r0.p0<>(0, 1, null);
                    t0Var.x(objE, p0VarE);
                    oq.i0 i0Var = oq.i0.f148189a;
                }
                t(derivedState, iHashCode, objE, p0VarE);
                return;
            }
            r0.u0 u0Var = (r0.u0) objE;
            Object[] objArr = u0Var.elements;
            long[] jArr2 = u0Var.metadata;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j15 = jArr2[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j15 & 255) < 128) {
                            Object obj = objArr[(i15 << 3) + i18];
                            r0.p0<Object> p0VarE2 = t0Var.e(obj);
                            if (p0VarE2 == null) {
                                p0Var = new r0.p0<>(0, 1, null);
                                t0Var.x(obj, p0Var);
                                oq.i0 i0Var2 = oq.i0.f148189a;
                            } else {
                                p0Var = p0VarE2;
                            }
                            t(derivedState, iHashCode, obj, p0Var);
                        }
                        j15 >>= i16;
                        i18++;
                        i16 = i16;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i17 != i16) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i15 == length) {
                    return;
                }
                i15++;
                jArr2 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(er.l<? super er.a<oq.i0>, oq.i0> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Set<? extends Object> set) {
        Object obj;
        List listL0;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listL0 = set;
            } else if (obj instanceof Set) {
                listL0 = pq.v.q(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new oq.g();
                }
                listL0 = pq.v.L0((Collection) obj, pq.v.e(set));
            }
        } while (!androidx.camera.view.i.a(this.pendingChanges, obj, listL0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(m0 m0Var, Set set, l lVar) {
        m0Var.d(set);
        if (m0Var.i()) {
            m0Var.o();
        }
        return oq.i0.f148189a;
    }

    private final boolean i() {
        boolean z15;
        synchronized (this.observedScopeMapsLock) {
            z15 = this.sendingNotifications;
        }
        if (z15) {
            return false;
        }
        boolean z16 = false;
        while (true) {
            Set<? extends Object> setM = m();
            if (setM == null) {
                return z16;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    n2.c<a> cVar = this.observedScopeMaps;
                    a[] aVarArr = cVar.content;
                    int size = cVar.getSize();
                    for (int i15 = 0; i15 < size; i15++) {
                        z16 = aVarArr[i15].r(setM) || z16;
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private final <T> a j(er.l<? super T, oq.i0> onChanged) {
        a aVar;
        n2.c<a> cVar = this.observedScopeMaps;
        a[] aVarArr = cVar.content;
        int size = cVar.getSize();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i15];
            if (aVar.o() == onChanged) {
                break;
            }
            i15++;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        a aVar3 = new a((er.l) fr.w0.g(onChanged, 1));
        this.observedScopeMaps.d(aVar3);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(m0 m0Var, Object obj) {
        if (!m0Var.isPaused) {
            synchronized (m0Var.observedScopeMapsLock) {
                m0Var.currentMap.s(obj);
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }
        return oq.i0.f148189a;
    }

    private final Set<Object> m() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new oq.g();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!androidx.camera.view.i.a(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void n() {
        p076m2.t.c("Unexpected notification");
        throw new oq.g();
    }

    private final void o() {
        this.onChangedExecutor.b(new er.a() { // from class: c3.l0
            @Override // er.a
            public final Object a() {
                return m0.p(this.f22835a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(m0 m0Var) {
        do {
            synchronized (m0Var.observedScopeMapsLock) {
                try {
                    if (!m0Var.sendingNotifications) {
                        m0Var.sendingNotifications = true;
                        try {
                            n2.c<a> cVar = m0Var.observedScopeMaps;
                            a[] aVarArr = cVar.content;
                            int size = cVar.getSize();
                            for (int i15 = 0; i15 < size; i15++) {
                                aVarArr[i15].q();
                            }
                            m0Var.sendingNotifications = false;
                        } catch (Throwable th4) {
                            m0Var.sendingNotifications = false;
                            throw th4;
                        }
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        } while (m0Var.i());
        return oq.i0.f148189a;
    }

    public final void f() {
        synchronized (this.observedScopeMapsLock) {
            try {
                n2.c<a> cVar = this.observedScopeMaps;
                a[] aVarArr = cVar.content;
                int size = cVar.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    aVarArr[i15].k();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void g(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                n2.c<a> cVar = this.observedScopeMaps;
                int size = cVar.getSize();
                int i15 = 0;
                for (int i16 = 0; i16 < size; i16++) {
                    a aVar = cVar.content[i16];
                    aVar.m(scope);
                    if (!aVar.p()) {
                        i15++;
                    } else if (i15 > 0) {
                        a[] aVarArr = cVar.content;
                        aVarArr[i16 - i15] = aVarArr[i16];
                    }
                }
                int i17 = size - i15;
                pq.n.z(cVar.content, null, i17, size);
                cVar.A(i17);
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void h(er.l<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                n2.c<a> cVar = this.observedScopeMaps;
                int size = cVar.getSize();
                int i15 = 0;
                for (int i16 = 0; i16 < size; i16++) {
                    a aVar = cVar.content[i16];
                    aVar.v(predicate);
                    if (!aVar.p()) {
                        i15++;
                    } else if (i15 > 0) {
                        a[] aVarArr = cVar.content;
                        aVarArr[i16 - i15] = aVarArr[i16];
                    }
                }
                int i17 = size - i15;
                pq.n.z(cVar.content, null, i17, size);
                cVar.A(i17);
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149 A[Catch: all -> 0x0115, TryCatch #9 {all -> 0x0115, blocks: (B:39:0x0107, B:47:0x0123, B:48:0x012e, B:53:0x013c, B:56:0x0141, B:57:0x0149, B:59:0x014f), top: B:124:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014f A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #9 {all -> 0x0115, blocks: (B:39:0x0107, B:47:0x0123, B:48:0x012e, B:53:0x013c, B:56:0x0141, B:57:0x0149, B:59:0x014f), top: B:124:0x00ca }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final <T> void k(T scope, er.l<? super T, oq.i0> onValueChangedForScope, er.a<oq.i0> block) {
        a aVarJ;
        boolean z15;
        a aVar;
        long j15;
        n2.c<p076m2.p0> cVar;
        long j16;
        l y0Var;
        l lVarL;
        long jA = y2.a0.a();
        synchronized (this.observedScopeMapsLock) {
            aVarJ = j(onValueChangedForScope);
            z15 = this.isPaused;
            aVar = this.currentMap;
            j15 = this.currentMapThreadId;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        long j17 = 0;
        if (j15 != -1) {
            if (!(j15 == jA)) {
                w3.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j15 + "), currentThread={id=" + jA + ", name=" + y2.a0.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            synchronized (this.observedScopeMapsLock) {
                try {
                    this.isPaused = false;
                    this.currentMap = aVarJ;
                    this.currentMapThreadId = jA;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            er.l<Object, oq.i0> lVar = this.readObserver;
            Object obj = aVarJ.currentScope;
            r0.p0 p0Var = aVarJ.currentScopeReads;
            int i15 = aVarJ.currentToken;
            aVarJ.currentScope = scope;
            aVarJ.currentScopeReads = (r0.p0) aVarJ.scopeToValues.e(scope);
            if (aVarJ.currentToken == -1) {
                aVarJ.currentToken = Long.hashCode(w.K().getSnapshotId());
            }
            p076m2.p0 derivedStateObserver = aVarJ.getDerivedStateObserver();
            n2.c<p076m2.p0> cVarC = x5.c();
            try {
                cVarC.d(derivedStateObserver);
                l.Companion companion = l.INSTANCE;
                if (lVar == null) {
                    block.a();
                    j16 = j15;
                    cVar = cVarC;
                } else {
                    l lVar2 = (l) w.f22909c.a();
                    try {
                        if (!(lVar2 instanceof y0)) {
                            j16 = j15;
                            if (lVar2 != null) {
                                cVar = cVarC;
                                y0Var = new y0(lVar2 instanceof d ? (d) lVar2 : null, lVar, null, true, false);
                                lVarL = y0Var.l();
                                block.a();
                                y0Var.s(lVarL);
                                y0Var.d();
                            } else {
                                cVar = cVarC;
                                y0Var = new y0(lVar2 instanceof d ? (d) lVar2 : null, lVar, null, true, false);
                                lVarL = y0Var.l();
                                block.a();
                                y0Var.s(lVarL);
                                y0Var.d();
                            }
                            synchronized (this.observedScopeMapsLock) {
                                this.currentMap = aVar;
                                this.isPaused = z15;
                                this.currentMapThreadId = j17;
                                oq.i0 i0Var2 = oq.i0.f148189a;
                            }
                            throw th;
                        }
                        try {
                            if (((y0) lVar2).getThreadId() == y2.a0.a()) {
                                er.l<Object, oq.i0> lVarG = ((y0) lVar2).g();
                                er.l<Object, oq.i0> lVarK = ((y0) lVar2).k();
                                try {
                                    j16 = j15;
                                    try {
                                        ((y0) lVar2).Y(w.O(lVar, lVarG, false, 4, null));
                                        ((y0) lVar2).Z(w.Q(null, lVarK));
                                        block.a();
                                        ((y0) lVar2).Y(lVarG);
                                        ((y0) lVar2).Z(lVarK);
                                        cVar = cVarC;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        ((y0) lVar2).Y(lVarG);
                                        ((y0) lVar2).Z(lVarK);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } else {
                                j16 = j15;
                                if (lVar2 != null || (lVar2 instanceof d)) {
                                    cVar = cVarC;
                                    try {
                                        y0Var = new y0(lVar2 instanceof d ? (d) lVar2 : null, lVar, null, true, false);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cVar.v(cVar.getSize() - 1);
                                        throw th;
                                    }
                                } else {
                                    y0Var = lVar2.x(lVar);
                                    cVar = cVarC;
                                }
                                try {
                                    lVarL = y0Var.l();
                                    try {
                                        block.a();
                                        y0Var.s(lVarL);
                                        y0Var.d();
                                    } catch (Throwable th8) {
                                        try {
                                            y0Var.s(lVarL);
                                            throw th8;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            try {
                                                y0Var.d();
                                                throw th;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                cVar.v(cVar.getSize() - 1);
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            j16 = j15;
                            cVar = cVarC;
                            cVar.v(cVar.getSize() - 1);
                            throw th;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                    }
                }
                try {
                    cVar.v(cVar.getSize() - 1);
                    aVarJ.l(aVarJ.currentScope);
                    aVarJ.currentScope = obj;
                    aVarJ.currentScopeReads = p0Var;
                    aVarJ.currentToken = i15;
                    synchronized (this.observedScopeMapsLock) {
                        this.currentMap = aVar;
                        this.isPaused = z15;
                        this.currentMapThreadId = j16;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    j17 = j16;
                }
            } catch (Throwable th15) {
                th = th15;
                cVar = cVarC;
            }
        } catch (Throwable th16) {
            th = th16;
            j17 = j15;
        }
    }

    public final void q() {
        this.applyUnsubscribe = l.INSTANCE.h(this.applyObserver);
    }

    public final void r() {
        g gVar = this.applyUnsubscribe;
        if (gVar != null) {
            gVar.j();
        }
    }
}
