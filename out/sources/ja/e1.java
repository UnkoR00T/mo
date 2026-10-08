package ja;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012.\u0010\b\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0003*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\b\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u0016\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u0016\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH\u0086@¢\u0006\u0004\b \u0010!J$\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0086@¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R?\u0010\b\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0,8\u0006¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010:\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b\u001a\u0010<\u001a\u0004\b=\u0010>R$\u0010F\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010P\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\"\u0010S\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R\"\u0010V\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\bT\u00104\"\u0004\bU\u00106¨\u0006W"}, d2 = {"Lja/e1;", "", "R", "T", "Lja/l1;", "terminalSeparatorType", "Lkotlin/Function3;", "Ltq/e;", "generator", "<init>", "(Lja/l1;Ler/q;)V", "Lja/m1;", "originalPage", "k", "(Lja/m1;)Lja/m1;", "Lja/f0;", "event", "e", "(Lja/f0;Ltq/e;)Ljava/lang/Object;", "Lja/f0$b;", "b", "(Lja/f0$b;)Lja/f0$b;", "", "j", "(Lja/f0$b;Lja/l1;)Z", "i", "f", "(Lja/f0$b;Ltq/e;)Ljava/lang/Object;", "Lja/f0$a;", "c", "(Lja/f0$a;)Lja/f0$a;", "Lja/f0$c;", "g", "(Lja/f0$c;Ltq/e;)Ljava/lang/Object;", "Lja/f0$d;", "h", "(Lja/f0$d;Ltq/e;)Ljava/lang/Object;", "a", "Lja/l1;", "getTerminalSeparatorType", "()Lja/l1;", "Ler/q;", "getGenerator", "()Ler/q;", "", "Ljava/util/List;", "getPageStash", "()Ljava/util/List;", "pageStash", "d", "Z", "getEndTerminalSeparatorDeferred", "()Z", "setEndTerminalSeparatorDeferred", "(Z)V", "endTerminalSeparatorDeferred", "getStartTerminalSeparatorDeferred", "setStartTerminalSeparatorDeferred", "startTerminalSeparatorDeferred", "Lja/e0;", "Lja/e0;", "getSourceStates", "()Lja/e0;", "sourceStates", "Lja/x;", "Lja/x;", "getMediatorStates", "()Lja/x;", "setMediatorStates", "(Lja/x;)V", "mediatorStates", "", "I", "getPlaceholdersBefore", "()I", "setPlaceholdersBefore", "(I)V", "placeholdersBefore", "getPlaceholdersAfter", "setPlaceholdersAfter", "placeholdersAfter", "getFooterAdded", "setFooterAdded", "footerAdded", "getHeaderAdded", "setHeaderAdded", "headerAdded", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e1<R, T extends R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l1 terminalSeparatorType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.q<T, T, tq.e<? super R>, Object> generator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean endTerminalSeparatorDeferred;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean startTerminalSeparatorDeferred;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private LoadStates mediatorStates;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean footerAdded;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean headerAdded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<TransformablePage<T>> pageStash = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e0 sourceStates = new e0();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100641a;

        static {
            int[] iArr = new int[l1.values().length];
            try {
                iArr[l1.FULLY_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.SOURCE_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100641a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f100642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e1<R, T> f100643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f100644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e1<R, T> e1Var, tq.e<? super b> eVar) {
            super(eVar);
            this.f100643e = e1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100642d = obj;
            this.f100644f |= PKIFailureInfo.systemUnavail;
            return this.f100643e.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f100649h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f100650j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f100651k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f100652l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f100653m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f100654n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f100655p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f100656q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f100657r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f100658s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ e1<R, T> f100659t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f100660v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e1<R, T> e1Var, tq.e<? super c> eVar) {
            super(eVar);
            this.f100659t = e1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100658s = obj;
            this.f100660v |= PKIFailureInfo.systemUnavail;
            return this.f100659t.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f100664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100665h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f100666j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ e1<R, T> f100667k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f100668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e1<R, T> e1Var, tq.e<? super d> eVar) {
            super(eVar);
            this.f100667k = e1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100666j = obj;
            this.f100668l |= PKIFailureInfo.systemUnavail;
            return this.f100667k.h(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1(l1 l1Var, er.q<? super T, ? super T, ? super tq.e<? super R>, ? extends Object> qVar) {
        this.terminalSeparatorType = l1Var;
        this.generator = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(lr.i iVar, TransformablePage transformablePage) {
        for (int i15 : transformablePage.getOriginalPageOffsets()) {
            if (iVar.q(i15)) {
                return true;
            }
        }
        return false;
    }

    private final <T> TransformablePage<T> k(TransformablePage<T> originalPage) {
        int[] originalPageOffsets = originalPage.getOriginalPageOffsets();
        List listQ = pq.v.q(pq.v.l0(originalPage.b()), pq.v.x0(originalPage.b()));
        int hintOriginalPageOffset = originalPage.getHintOriginalPageOffset();
        List<Integer> listC = originalPage.c();
        Integer numValueOf = Integer.valueOf(listC != null ? ((Number) pq.v.l0(listC)).intValue() : 0);
        List<Integer> listC2 = originalPage.c();
        return new TransformablePage<>(originalPageOffsets, listQ, hintOriginalPageOffset, pq.v.q(numValueOf, Integer.valueOf(listC2 != null ? ((Number) pq.v.x0(listC2)).intValue() : pq.v.p(originalPage.b()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0.b<R> b(f0.b<T> bVar) {
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0.a<R> c(f0.a<T> event) {
        this.sourceStates.c(event.getLoadType(), w.NotLoading.INSTANCE.b());
        y loadType = event.getLoadType();
        y yVar = y.PREPEND;
        if (loadType == yVar) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            this.headerAdded = false;
        } else if (event.getLoadType() == y.APPEND) {
            this.placeholdersAfter = event.getPlaceholdersRemaining();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (event.getLoadType() == yVar) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        final lr.i iVar = new lr.i(event.getMinPageOffset(), event.getMaxPageOffset());
        pq.v.J(this.pageStash, new er.l() { // from class: ja.d1
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(e1.d(iVar, (TransformablePage) obj));
            }
        });
        return event;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ja.f0<T> r7, tq.e<? super ja.f0<R>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ja.e1.b
            if (r0 == 0) goto L13
            r0 = r8
            ja.e1$b r0 = (ja.e1.b) r0
            int r1 = r0.f100644f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100644f = r1
            goto L18
        L13:
            ja.e1$b r0 = new ja.e1$b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f100642d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f100644f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            oq.u.b(r8)
            goto L80
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            oq.u.b(r8)
            goto L6e
        L3b:
            oq.u.b(r8)
            goto L51
        L3f:
            oq.u.b(r8)
            boolean r8 = r7 instanceof ja.f0.b
            if (r8 == 0) goto L54
            ja.f0$b r7 = (ja.f0.b) r7
            r0.f100644f = r5
            java.lang.Object r8 = r6.f(r7, r0)
            if (r8 != r1) goto L51
            goto L7f
        L51:
            ja.f0 r8 = (ja.f0) r8
            goto L82
        L54:
            boolean r8 = r7 instanceof ja.f0.a
            if (r8 == 0) goto L5f
            ja.f0$a r7 = (ja.f0.a) r7
            ja.f0$a r8 = r6.c(r7)
            goto L82
        L5f:
            boolean r8 = r7 instanceof ja.f0.c
            if (r8 == 0) goto L71
            ja.f0$c r7 = (ja.f0.c) r7
            r0.f100644f = r4
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto L6e
            goto L7f
        L6e:
            ja.f0 r8 = (ja.f0) r8
            goto L82
        L71:
            boolean r8 = r7 instanceof ja.f0.d
            if (r8 == 0) goto Lad
            ja.f0$d r7 = (ja.f0.d) r7
            r0.f100644f = r3
            java.lang.Object r8 = r6.h(r7, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            ja.f0 r8 = (ja.f0) r8
        L82:
            boolean r7 = r6.endTerminalSeparatorDeferred
            if (r7 == 0) goto L97
            java.util.List<ja.m1<T extends R>> r7 = r6.pageStash
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L8f
            goto L97
        L8f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "deferred endTerm, page stash should be empty"
            r7.<init>(r8)
            throw r7
        L97:
            boolean r7 = r6.startTerminalSeparatorDeferred
            if (r7 == 0) goto Lac
            java.util.List<ja.m1<T extends R>> r7 = r6.pageStash
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto La4
            goto Lac
        La4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "deferred startTerm, page stash should be empty"
            r7.<init>(r8)
            throw r7
        Lac:
            return r8
        Lad:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e1.e(ja.f0, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:136:0x0424  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0424 -> B:137:0x042a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x060d -> B:193:0x060e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x06ec -> B:218:0x06ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(ja.f0.b<T> r21, tq.e<? super ja.f0.b<R>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e1.f(ja.f0$b, tq.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(f0.c<T> cVar, tq.e<? super f0<R>> eVar) {
        LoadStates loadStates = this.mediatorStates;
        if (fr.t.c(this.sourceStates.d(), cVar.getSource()) && fr.t.c(loadStates, cVar.getMediator())) {
            return cVar;
        }
        this.sourceStates.b(cVar.getSource());
        this.mediatorStates = cVar.getMediator();
        if (cVar.getMediator() != null && cVar.getMediator().getPrepend().getEndOfPaginationReached()) {
            if (!fr.t.c(loadStates != null ? loadStates.getPrepend() : null, cVar.getMediator().getPrepend())) {
                return f(f0.b.INSTANCE.b(pq.v.n(), this.placeholdersBefore, cVar.getSource(), cVar.getMediator()), eVar);
            }
        }
        if (cVar.getMediator() == null || !cVar.getMediator().getAppend().getEndOfPaginationReached()) {
            return cVar;
        }
        return !fr.t.c(loadStates != null ? loadStates.getAppend() : null, cVar.getMediator().getAppend()) ? f(f0.b.INSTANCE.a(pq.v.n(), this.placeholdersAfter, cVar.getSource(), cVar.getMediator()), eVar) : cVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(ja.f0.d<T> r10, tq.e<? super ja.f0<R>> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ja.e1.d
            if (r0 == 0) goto L13
            r0 = r11
            ja.e1$d r0 = (ja.e1.d) r0
            int r1 = r0.f100668l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100668l = r1
            goto L18
        L13:
            ja.e1$d r0 = new ja.e1$d
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f100666j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f100668l
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r10 = r0.f100665h
            int r2 = r0.f100664g
            java.lang.Object r4 = r0.f100663f
            java.lang.Object r5 = r0.f100662e
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f100661d
            ja.f0$d r6 = (ja.f0.d) r6
            oq.u.b(r11)
            r8 = r4
            r4 = r10
            r10 = r6
            r6 = r8
            goto L81
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            oq.u.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r2 = r10.c()
            int r2 = r2.size()
            if (r2 < 0) goto L94
            r4 = 0
            r5 = r11
        L57:
            java.util.List r11 = r10.c()
            int r6 = r4 + (-1)
            java.lang.Object r11 = pq.v.o0(r11, r6)
            java.util.List r6 = r10.c()
            java.lang.Object r6 = pq.v.o0(r6, r4)
            er.q<T extends R, T extends R, tq.e<? super R>, java.lang.Object> r7 = r9.generator
            r0.f100661d = r10
            r0.f100662e = r5
            r0.f100663f = r6
            r0.f100664g = r4
            r0.f100665h = r2
            r0.f100668l = r3
            java.lang.Object r11 = r7.w(r11, r6, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r8 = r4
            r4 = r2
            r2 = r8
        L81:
            if (r11 == 0) goto L86
            r5.add(r11)
        L86:
            if (r6 == 0) goto L8b
            r5.add(r6)
        L8b:
            if (r2 == r4) goto L92
            int r11 = r2 + 1
            r2 = r4
            r4 = r11
            goto L57
        L92:
            r1 = r5
            goto L95
        L94:
            r1 = r11
        L95:
            ja.f0$d r0 = new ja.f0$d
            ja.x r2 = r10.getSourceLoadStates()
            ja.x r3 = r10.getMediatorLoadStates()
            r6 = 24
            r7 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e1.h(ja.f0$d, tq.e):java.lang.Object");
    }

    public final <T> boolean i(f0.b<T> bVar, l1 l1Var) {
        w append;
        if (bVar.getLoadType() == y.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i15 = a.f100641a[l1Var.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return bVar.getSourceLoadStates().getAppend().getEndOfPaginationReached();
            }
            throw new oq.p();
        }
        if (!bVar.getSourceLoadStates().getAppend().getEndOfPaginationReached()) {
            return false;
        }
        LoadStates mediatorLoadStates = bVar.getMediatorLoadStates();
        return mediatorLoadStates == null || (append = mediatorLoadStates.getAppend()) == null || append.getEndOfPaginationReached();
    }

    public final <T> boolean j(f0.b<T> bVar, l1 l1Var) {
        w prepend;
        if (bVar.getLoadType() == y.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i15 = a.f100641a[l1Var.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return bVar.getSourceLoadStates().getPrepend().getEndOfPaginationReached();
            }
            throw new oq.p();
        }
        if (!bVar.getSourceLoadStates().getPrepend().getEndOfPaginationReached()) {
            return false;
        }
        LoadStates mediatorLoadStates = bVar.getMediatorLoadStates();
        return mediatorLoadStates == null || (prepend = mediatorLoadStates.getPrepend()) == null || prepend.getEndOfPaginationReached();
    }
}
