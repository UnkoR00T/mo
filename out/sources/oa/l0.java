package oa;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import ju.CoroutineName;
import ju.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Loa/l0;", "", "Loa/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "Loq/i0;", "onInvalidatedTablesIds", "<init>", "(Loa/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLer/l;)V", "names", "t", "([Ljava/lang/String;)[Ljava/lang/String;", "Loa/m;", "connection", "tableId", "v", "(Loa/m;ILtq/e;)Ljava/lang/Object;", "w", "n", "(Ltq/e;)Ljava/lang/Object;", "j", "(Loa/m;Ltq/e;)Ljava/lang/Object;", "Lya/b;", "l", "(Lya/b;)V", "resolvedTableNames", "", "tableIds", "emitInitialState", "Lmu/g;", "m", "([Ljava/lang/String;[IZ)Lmu/g;", "Loq/r;", "y", "([Ljava/lang/String;)Loq/r;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Ler/a;Ler/a;)V", "s", "()V", "a", "Loa/u;", "b", "Ljava/util/Map;", "c", "d", "Z", "e", "Ler/l;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Loa/k;", "h", "Loa/k;", "observedTableStates", "Loa/l;", "i", "Loa/l;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Ler/a;", "getOnAllowRefresh$room_runtime", "()Ler/a;", "u", "(Ler/a;)V", "onAllowRefresh", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f143669m = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useTempTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<Set<Integer>, oq.i0> onInvalidatedTablesIds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String[] tablesNames;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k observedTableStates;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l observedTableVersions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean pendingRefresh = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private er.a<Boolean> onAllowRefresh = new er.a() { // from class: oa.k0
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(l0.o());
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> tableIdLookup = new LinkedHashMap();

    /* JADX INFO: renamed from: oa.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Loa/l0$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f143681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f143682e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f143684g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f143682e = obj;
            this.f143684g |= PKIFailureInfo.systemUnavail;
            return l0.this.j(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/h;", "", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<mu.h<? super Set<? extends String>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f143685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f143686f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int[] f143688h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f143689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String[] f143690k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f143691e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l0 f143692f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f143692f = l0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f143691e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    l0 l0Var = this.f143692f;
                    this.f143691e = 1;
                    if (l0Var.x(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f143692f, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fr.p0<int[]> f143693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f143694b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ mu.h<Set<String>> f143695c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String[] f143696d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int[] f143697e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f143698d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f143699e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ b<T> f143700f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f143701g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(b<? super T> bVar, tq.e<? super a> eVar) {
                    super(eVar);
                    this.f143700f = bVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f143699e = obj;
                    this.f143701g |= PKIFailureInfo.systemUnavail;
                    return this.f143700f.F(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(fr.p0<int[]> p0Var, boolean z15, mu.h<? super Set<String>> hVar, String[] strArr, int[] iArr) {
                this.f143693a = p0Var;
                this.f143694b = z15;
                this.f143695c = hVar;
                this.f143696d = strArr;
                this.f143697e = iArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r14.F(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
            
                if (r14.F(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
            
                r13 = r13;
                r13 = r13;
                r13 = r13;
                return r1;
             */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(int[] r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof oa.l0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    oa.l0$c$b$a r0 = (oa.l0.c.b.a) r0
                    int r1 = r0.f143701g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f143701g = r1
                    goto L18
                L13:
                    oa.l0$c$b$a r0 = new oa.l0$c$b$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f143699e
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f143701g
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L39
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    java.lang.Object r13 = r0.f143698d
                    int[] r13 = (int[]) r13
                    oq.u.b(r14)
                    goto L9f
                L39:
                    oq.u.b(r14)
                    fr.p0<int[]> r14 = r12.f143693a
                    T r2 = r14.f66410a
                    if (r2 != 0) goto L59
                    boolean r14 = r12.f143694b
                    if (r14 == 0) goto L9f
                    mu.h<java.util.Set<java.lang.String>> r14 = r12.f143695c
                    java.lang.String[] r2 = r12.f143696d
                    java.util.Set r2 = pq.n.B1(r2)
                    r0.f143698d = r13
                    r0.f143701g = r4
                    java.lang.Object r14 = r14.F(r2, r0)
                    if (r14 != r1) goto L9f
                    goto L9e
                L59:
                    java.lang.String[] r2 = r12.f143696d
                    int[] r4 = r12.f143697e
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    int r6 = r2.length
                    r7 = 0
                    r8 = r7
                L65:
                    if (r7 >= r6) goto L88
                    r9 = r2[r7]
                    int r10 = r8 + 1
                    T r11 = r14.f66410a
                    if (r11 == 0) goto L80
                    int[] r11 = (int[]) r11
                    r8 = r4[r8]
                    r11 = r11[r8]
                    r8 = r13[r8]
                    if (r11 == r8) goto L7c
                    r5.add(r9)
                L7c:
                    int r7 = r7 + 1
                    r8 = r10
                    goto L65
                L80:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "Required value was null."
                    r13.<init>(r14)
                    throw r13
                L88:
                    boolean r14 = r5.isEmpty()
                    if (r14 != 0) goto L9f
                    mu.h<java.util.Set<java.lang.String>> r14 = r12.f143695c
                    java.util.Set r2 = pq.v.k1(r5)
                    r0.f143698d = r13
                    r0.f143701g = r3
                    java.lang.Object r14 = r14.F(r2, r0)
                    if (r14 != r1) goto L9f
                L9e:
                    return r1
                L9f:
                    fr.p0<int[]> r14 = r12.f143693a
                    r14.f66410a = r13
                    oq.i0 r13 = oq.i0.f148189a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: oa.l0.c.b.F(int[], tq.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int[] iArr, boolean z15, String[] strArr, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f143688h = iArr;
            this.f143689j = z15;
            this.f143690k = strArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (ju.i.g((tq.i) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.a(r4, r11) == r0) goto L28;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f143685e
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                oq.u.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L95
            L1f:
                r0 = move-exception
                r12 = r0
                goto L9b
            L23:
                java.lang.Object r1 = r11.f143686f
                mu.h r1 = (mu.h) r1
                oq.u.b(r12)
                goto L71
            L2b:
                java.lang.Object r1 = r11.f143686f
                mu.h r1 = (mu.h) r1
                oq.u.b(r12)
                goto L5d
            L33:
                oq.u.b(r12)
                java.lang.Object r12 = r11.f143686f
                mu.h r12 = (mu.h) r12
                oa.l0 r1 = oa.l0.this
                oa.k r1 = oa.l0.e(r1)
                int[] r6 = r11.f143688h
                boolean r1 = r1.i(r6)
                if (r1 == 0) goto L73
                oa.l0 r1 = oa.l0.this
                oa.u r1 = oa.l0.d(r1)
                r11.f143686f = r12
                r11.f143685e = r5
                r5 = 0
                java.lang.Object r1 = ta.a.b(r1, r5, r11)
                if (r1 != r0) goto L5a
                goto L94
            L5a:
                r10 = r1
                r1 = r12
                r12 = r10
            L5d:
                tq.i r12 = (tq.i) r12
                oa.l0$c$a r5 = new oa.l0$c$a
                oa.l0 r6 = oa.l0.this
                r5.<init>(r6, r2)
                r11.f143686f = r1
                r11.f143685e = r4
                java.lang.Object r12 = ju.i.g(r12, r5, r11)
                if (r12 != r0) goto L71
                goto L94
            L71:
                r7 = r1
                goto L74
            L73:
                r7 = r12
            L74:
                fr.p0 r5 = new fr.p0     // Catch: java.lang.Throwable -> L1f
                r5.<init>()     // Catch: java.lang.Throwable -> L1f
                oa.l0 r12 = oa.l0.this     // Catch: java.lang.Throwable -> L1f
                oa.l r12 = oa.l0.f(r12)     // Catch: java.lang.Throwable -> L1f
                oa.l0$c$b r4 = new oa.l0$c$b     // Catch: java.lang.Throwable -> L1f
                boolean r6 = r11.f143689j     // Catch: java.lang.Throwable -> L1f
                java.lang.String[] r8 = r11.f143690k     // Catch: java.lang.Throwable -> L1f
                int[] r9 = r11.f143688h     // Catch: java.lang.Throwable -> L1f
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
                r11.f143686f = r2     // Catch: java.lang.Throwable -> L1f
                r11.f143685e = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L95
            L94:
                return r0
            L95:
                oq.g r12 = new oq.g     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L9b:
                oa.l0 r0 = oa.l0.this
                oa.k r0 = oa.l0.e(r0)
                int[] r1 = r11.f143688h
                r0.j(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: oa.l0.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Set<String>> hVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = l0.this.new c(this.f143688h, this.f143689j, this.f143690k, eVar);
            cVar.f143686f = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f143702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f143703e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f143705g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f143703e = obj;
            this.f143705g |= PKIFailureInfo.systemUnavail;
            return l0.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loa/g0;", "connection", "", "", "<anonymous>", "(Loa/g0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<g0, tq.e<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f143706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f143707f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/f0;", "", "", "<anonymous>", "(Loa/f0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<f0<Set<? extends Integer>>, tq.e<? super Set<? extends Integer>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f143709e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f143710f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l0 f143711g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f143711g = l0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f143709e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                f0 f0Var = (f0) this.f143710f;
                l0 l0Var = this.f143711g;
                this.f143709e = 1;
                Object objJ = l0Var.j(f0Var, this);
                return objJ == objE ? objE : objJ;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(f0<Set<Integer>> f0Var, tq.e<? super Set<Integer>> eVar) {
                return ((a) v(f0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f143711g, eVar);
                aVar.f143710f = obj;
                return aVar;
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
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
                int r1 = r6.f143706e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)     // Catch: android.database.SQLException -> L5a
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f143707f
                oa.g0 r1 = (oa.g0) r1
                oq.u.b(r7)
                goto L35
            L22:
                oq.u.b(r7)
                java.lang.Object r7 = r6.f143707f
                r1 = r7
                oa.g0 r1 = (oa.g0) r1
                r6.f143707f = r1
                r6.f143706e = r3
                java.lang.Object r7 = r1.c(r6)
                if (r7 != r0) goto L35
                goto L56
            L35:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L42
                java.util.Set r7 = pq.e1.e()
                return r7
            L42:
                oa.g0$a r7 = oa.g0.a.IMMEDIATE     // Catch: android.database.SQLException -> L5a
                oa.l0$e$a r3 = new oa.l0$e$a     // Catch: android.database.SQLException -> L5a
                oa.l0 r4 = oa.l0.this     // Catch: android.database.SQLException -> L5a
                r5 = 0
                r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
                r6.f143707f = r5     // Catch: android.database.SQLException -> L5a
                r6.f143706e = r2     // Catch: android.database.SQLException -> L5a
                java.lang.Object r7 = r1.a(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
                return r7
            L5a:
                java.util.Set r7 = pq.e1.e()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oa.l0.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(g0 g0Var, tq.e<? super Set<Integer>> eVar) {
            return ((e) v(g0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = l0.this.new e(eVar);
            eVar2.f143707f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f143712e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f143714g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(er.a<oq.i0> aVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f143714g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f143712e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    l0 l0Var = l0.this;
                    this.f143712e = 1;
                    obj = l0Var.n(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                this.f143714g.a();
                return oq.i0.f148189a;
            } catch (Throwable th4) {
                this.f143714g.a();
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l0.this.new f(this.f143714g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f143715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f143716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f143717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f143718g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f143719h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f143720j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f143721k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f143723m;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f143721k = obj;
            this.f143723m |= PKIFailureInfo.systemUnavail;
            return l0.this.v(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f143724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f143725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f143726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f143727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f143728h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f143729j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f143731l;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f143729j = obj;
            this.f143731l |= PKIFailureInfo.systemUnavail;
            return l0.this.w(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f143732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f143733e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f143735g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f143733e = obj;
            this.f143735g |= PKIFailureInfo.systemUnavail;
            return l0.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/g0;", "connection", "Loq/i0;", "<anonymous>", "(Loa/g0;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends vq.k implements er.p<g0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f143736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f143737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f143738g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loa/f0;", "Loq/i0;", "<anonymous>", "(Loa/f0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<f0<oq.i0>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143740e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f143741f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f143742g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143743h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f143744j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f143745k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f143746l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k.a[] f143747m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ l0 f143748n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ g0 f143749p;

            /* JADX INFO: renamed from: oa.l0$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class C3569a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f143750a;

                static {
                    int[] iArr = new int[k.a.values().length];
                    try {
                        iArr[k.a.NO_OP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k.a.ADD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k.a.REMOVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f143750a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k.a[] aVarArr, l0 l0Var, g0 g0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f143747m = aVarArr;
                this.f143748n = l0Var;
                this.f143749p = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:26:0x0086  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f143746l
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f143745k
                    int r4 = r11.f143744j
                    int r5 = r11.f143743h
                    java.lang.Object r6 = r11.f143742g
                    oa.g0 r6 = (oa.g0) r6
                    java.lang.Object r7 = r11.f143741f
                    oa.l0 r7 = (oa.l0) r7
                    java.lang.Object r8 = r11.f143740e
                    oa.k$a[] r8 = (oa.k.a[]) r8
                    oq.u.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    oq.u.b(r12)
                    oa.k$a[] r12 = r11.f143747m
                    oa.l0 r1 = r11.f143748n
                    oa.g0 r4 = r11.f143749p
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3c:
                    if (r4 >= r1) goto L89
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = oa.l0.j.a.C3569a.f143750a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f143740e = r8
                    r11.f143741f = r7
                    r11.f143742g = r12
                    r11.f143743h = r9
                    r11.f143744j = r4
                    r11.f143745k = r1
                    r11.f143746l = r2
                    java.lang.Object r5 = oa.l0.i(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                    goto L85
                L66:
                    r6 = r12
                    r5 = r9
                L68:
                    r12 = r6
                    r6 = r5
                    goto L87
                L6b:
                    oq.p r12 = new oq.p
                    r12.<init>()
                    throw r12
                L71:
                    r11.f143740e = r8
                    r11.f143741f = r7
                    r11.f143742g = r12
                    r11.f143743h = r9
                    r11.f143744j = r4
                    r11.f143745k = r1
                    r11.f143746l = r3
                    java.lang.Object r5 = oa.l0.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: oa.l0.j.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(f0<oq.i0> f0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(f0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f143747m, this.f143748n, this.f143749p, eVar);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g0 g0Var;
            Object objC;
            k kVar;
            ReentrantLock reentrantLock;
            k.a[] aVarArr;
            k.a aVar;
            k kVar2;
            ReentrantLock reentrantLock2;
            Object objE = uq.b.e();
            int i15 = this.f143737f;
            boolean z15 = true;
            if (i15 == 0) {
                oq.u.b(obj);
                g0Var = (g0) this.f143738g;
                this.f143738g = g0Var;
                this.f143737f = 1;
                objC = g0Var.c(this);
                if (objC != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reentrantLock2 = (ReentrantLock) this.f143736e;
                kVar2 = (k) this.f143738g;
                try {
                    oq.u.b(obj);
                    reentrantLock = reentrantLock2;
                    kVar = kVar2;
                    kVar.inProgressSync = false;
                    oq.i0 i0Var = oq.i0.f148189a;
                    reentrantLock.unlock();
                    return oq.i0.f148189a;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        kVar2.inProgressSync = false;
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            }
            g0Var = (g0) this.f143738g;
            oq.u.b(obj);
            objC = obj;
            if (((Boolean) objC).booleanValue()) {
                return oq.i0.f148189a;
            }
            kVar = l0.this.observedTableStates;
            l0 l0Var = l0.this;
            reentrantLock = kVar.onSyncLock;
            reentrantLock.lock();
            try {
                kVar.inProgressSync = true;
                ReentrantLock reentrantLock3 = kVar.lock;
                reentrantLock3.lock();
                try {
                    if (kVar.needsSync) {
                        kVar.needsSync = false;
                        int length = kVar.tableObserversCount.length;
                        aVarArr = new k.a[length];
                        int i16 = 0;
                        boolean z16 = false;
                        while (i16 < length) {
                            boolean z17 = kVar.tableObserversCount[i16] > 0 ? z15 : false;
                            if (z17 != kVar.tableObservedState[i16]) {
                                kVar.tableObservedState[i16] = z17;
                                aVar = z17 ? k.a.ADD : k.a.REMOVE;
                                z16 = true;
                            } else {
                                aVar = k.a.NO_OP;
                            }
                            aVarArr[i16] = aVar;
                            i16++;
                            z15 = true;
                        }
                        if (!z16) {
                            aVarArr = null;
                        }
                    } else {
                        aVarArr = null;
                    }
                    reentrantLock3.unlock();
                    if (aVarArr != null) {
                        try {
                            if (aVarArr.length != 0) {
                                g0.a aVar2 = g0.a.IMMEDIATE;
                                a aVar3 = new a(aVarArr, l0Var, g0Var, null);
                                this.f143738g = kVar;
                                this.f143736e = reentrantLock;
                                this.f143737f = 2;
                                if (g0Var.a(aVar2, aVar3, this) != objE) {
                                    kVar2 = kVar;
                                    reentrantLock2 = reentrantLock;
                                    reentrantLock = reentrantLock2;
                                    kVar = kVar2;
                                }
                                return objE;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            kVar2 = kVar;
                            reentrantLock2 = reentrantLock;
                            kVar2.inProgressSync = false;
                            throw th;
                        }
                    }
                    kVar.inProgressSync = false;
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    reentrantLock.unlock();
                    return oq.i0.f148189a;
                } catch (Throwable th7) {
                    reentrantLock3.unlock();
                    throw th7;
                }
            } catch (Throwable th8) {
                th = th8;
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(g0 g0Var, tq.e<? super oq.i0> eVar) {
            return ((j) v(g0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = l0.this.new j(eVar);
            jVar.f143738g = obj;
            return jVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(u uVar, Map<String, String> map, Map<String, ? extends Set<String>> map2, String[] strArr, boolean z15, er.l<? super Set<Integer>, oq.i0> lVar) {
        this.database = uVar;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.useTempTable = z15;
        this.onInvalidatedTablesIds = lVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i15 = 0; i15 < length; i15++) {
            String str = strArr[i15];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i15));
            String str2 = this.shadowTablesMap.get(strArr[i15]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i15] = lowerCase;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = value.toLowerCase(locale2);
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(locale2);
                Map<String, Integer> map3 = this.tableIdLookup;
                map3.put(lowerCase4, (Integer) v0.j(map3, lowerCase3));
            }
        }
        this.observedTableStates = new k(this.tablesNames.length);
        this.observedTableVersions = new l(this.tablesNames.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(m mVar, tq.e<? super Set<Integer>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f143684g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f143684g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f143682e;
        Object objE = uq.b.e();
        int i16 = bVar.f143684g;
        if (i16 == 0) {
            oq.u.b(objB);
            er.l lVar = new er.l() { // from class: oa.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.k((ya.d) obj);
                }
            };
            bVar.f143681d = mVar;
            bVar.f143684g = 1;
            objB = mVar.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", lVar, bVar);
            if (objB != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) bVar.f143681d;
            oq.u.b(objB);
            return set;
        }
        mVar = (m) bVar.f143681d;
        oq.u.b(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            bVar.f143681d = set2;
            bVar.f143684g = 2;
            if (i0.b(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", bVar) == objE) {
                return objE;
            }
        }
        return set2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(ya.d dVar) {
        Set setB = e1.b();
        while (dVar.Y3()) {
            setB.add(Integer.valueOf((int) dVar.getLong(0)));
        }
        return e1.a(setB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(tq.e<? super Set<Integer>> eVar) throws Throwable {
        d dVar;
        pa.a aVar;
        Throwable th4;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f143705g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f143705g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f143703e;
        Object objE = uq.b.e();
        int i16 = dVar.f143705g;
        if (i16 == 0) {
            oq.u.b(obj);
            pa.a closeBarrier = this.database.getCloseBarrier();
            if (!closeBarrier.a()) {
                return e1.e();
            }
            try {
                if (!this.pendingRefresh.compareAndSet(true, false)) {
                    Set setE = e1.e();
                    closeBarrier.d();
                    return setE;
                }
                if (!this.onAllowRefresh.a().booleanValue()) {
                    Set setE2 = e1.e();
                    closeBarrier.d();
                    return setE2;
                }
                u uVar = this.database;
                e eVar2 = new e(null);
                dVar.f143702d = closeBarrier;
                dVar.f143705g = 1;
                Object objY = uVar.Y(false, eVar2, dVar);
                if (objY == objE) {
                    return objE;
                }
                aVar = closeBarrier;
                obj = objY;
            } catch (Throwable th5) {
                aVar = closeBarrier;
                th4 = th5;
                aVar.d();
                throw th4;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (pa.a) dVar.f143702d;
            try {
                oq.u.b(obj);
            } catch (Throwable th6) {
                th4 = th6;
                aVar.d();
                throw th4;
            }
        }
        Set<Integer> set = (Set) obj;
        if (!set.isEmpty()) {
            this.observedTableVersions.b(set);
            this.onInvalidatedTablesIds.b(set);
        }
        aVar.d();
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o() {
        return true;
    }

    private final String[] t(String[] names) {
        Set setB = e1.b();
        for (String str : names) {
            Set<String> set = this.viewTables.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) e1.a(setB).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (oa.i0.b(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (oa.i0.b(r7, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:28:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(oa.m r13, int r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.l0.v(oa.m, int, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object w(oa.m r10, int r11, tq.e<? super oq.i0> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof oa.l0.h
            if (r0 == 0) goto L13
            r0 = r12
            oa.l0$h r0 = (oa.l0.h) r0
            int r1 = r0.f143731l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143731l = r1
            goto L18
        L13:
            oa.l0$h r0 = new oa.l0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f143729j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f143731l
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f143728h
            int r11 = r0.f143727g
            java.lang.Object r2 = r0.f143726f
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f143725e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f143724d
            oa.m r5 = (oa.m) r5
            oq.u.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            oq.u.b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = oa.l0.f143669m
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            oa.l0$a r6 = oa.l0.INSTANCE
            java.lang.String r5 = oa.l0.Companion.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f143724d = r11
            r0.f143725e = r12
            r0.f143726f = r2
            r0.f143727g = r4
            r0.f143728h = r10
            r0.f143731l = r3
            java.lang.Object r5 = oa.i0.b(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            oq.i0 r10 = oq.i0.f148189a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.l0.w(oa.m, int, tq.e):java.lang.Object");
    }

    public final void l(ya.b connection) throws Exception {
        ya.d dVarE4 = connection.e4("PRAGMA query_only");
        try {
            dVarE4.Y3();
            boolean zM2 = dVarE4.M2(0);
            cr.a.a(dVarE4, null);
            if (zM2) {
                return;
            }
            ya.a.a(connection, "PRAGMA temp_store = MEMORY");
            ya.a.a(connection, "PRAGMA recursive_triggers = 1");
            ya.a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                ya.a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                ya.a.a(connection, fu.r.P("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.observedTableStates.h();
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    public final mu.g<Set<String>> m(String[] resolvedTableNames, int[] tableIds, boolean emitInitialState) {
        return mu.i.I(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    public final boolean p(int[] tableIds) {
        return this.observedTableStates.i(tableIds);
    }

    public final boolean q(int[] tableIds) {
        return this.observedTableStates.j(tableIds);
    }

    public final void r(er.a<oq.i0> onRefreshScheduled, er.a<oq.i0> onRefreshCompleted) {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.a();
            ju.k.d(this.database.t(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.observedTableStates.k();
    }

    public final void u(er.a<Boolean> aVar) {
        this.onAllowRefresh = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(tq.e<? super oq.i0> eVar) throws Throwable {
        i iVar;
        pa.a aVar;
        Throwable th4;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f143735g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f143735g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f143733e;
        Object objE = uq.b.e();
        int i16 = iVar.f143735g;
        if (i16 == 0) {
            oq.u.b(obj);
            pa.a closeBarrier = this.database.getCloseBarrier();
            if (closeBarrier.a()) {
                try {
                    u uVar = this.database;
                    j jVar = new j(null);
                    iVar.f143732d = closeBarrier;
                    iVar.f143735g = 1;
                    if (uVar.Y(false, jVar, iVar) == objE) {
                        return objE;
                    }
                    aVar = closeBarrier;
                    aVar.d();
                } catch (Throwable th5) {
                    aVar = closeBarrier;
                    th4 = th5;
                    aVar.d();
                    throw th4;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (pa.a) iVar.f143732d;
            try {
                oq.u.b(obj);
                aVar.d();
            } catch (Throwable th6) {
                th4 = th6;
                aVar.d();
                throw th4;
            }
        }
        return oq.i0.f148189a;
    }

    public final oq.r<String[], int[]> y(String[] names) {
        String[] strArrT = t(names);
        int length = strArrT.length;
        int[] iArr = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            String str = strArrT[i15];
            Integer num = this.tableIdLookup.get(str.toLowerCase(Locale.ROOT));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i15] = num.intValue();
        }
        return oq.y.a(strArrT, iArr);
    }
}
