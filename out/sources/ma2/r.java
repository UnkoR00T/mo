package ma2;

import androidx.p016lifecycle.u0;
import fr.q0;
import ia2.UserActivityLog;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.Comparator;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001LB1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00160\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R.\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00160\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lma2/r;", "Ll00/g;", "Lma2/k;", "Lma2/j;", "Lma2/l;", "", "Lyy/a;", "stateMachineFactory", "Lna2/a;", "mapper", "Lna2/b;", "pagingMapper", "Lib4/c;", "domainErrorMapper", "Lka2/c;", "loadUserActivityLogsUseCase", "<init>", "(Lyy/a;Lna2/a;Lna2/b;Lib4/c;Lka2/c;)V", "state", "Lma2/l$a;", "w9", "(Lma2/k;)Lma2/l$a;", "Lja/n0;", "Lia2/b;", "pagingData", "Loa2/a;", "v9", "(Lja/n0;)Lja/n0;", "Lmu/g;", "r9", "(Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Ljb4/b;", "t9", "(Ldx/b;)Ljb4/b;", "Loq/i0;", "d", "()V", "b", "Lna2/a;", "c", "Lna2/b;", "Lib4/c;", "e", "Lka2/c;", "Lma2/k$a;", "f", "Lma2/k$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lma2/j$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "j", "Lmu/g;", "C8", "()Lmu/g;", "y9", "(Lmu/g;)V", "activityLogs", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "l", "a", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<k, j> implements l, zx.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f125125m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final na2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final na2.b pagingMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ka2.c loadUserActivityLogsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<k, j> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private mu.g<n0<oa2.a>> activityLogs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<l.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n0<oa2.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f125135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f125136b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f125137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f125138b;

            /* JADX INFO: renamed from: ma2.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3078a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f125139d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f125140e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f125141f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f125143h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f125144j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f125145k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f125146l;

                public C3078a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f125139d = obj;
                    this.f125140e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f125137a = hVar;
                this.f125138b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3078a c3078a;
                if (eVar instanceof C3078a) {
                    c3078a = (C3078a) eVar;
                    int i15 = c3078a.f125140e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3078a.f125140e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3078a = new C3078a(eVar);
                    }
                } else {
                    c3078a = new C3078a(eVar);
                }
                Object obj2 = c3078a.f125139d;
                Object objE = uq.b.e();
                int i16 = c3078a.f125140e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f125137a;
                    n0 n0VarV9 = this.f125138b.v9((n0) obj);
                    c3078a.f125141f = vq.j.a(obj);
                    c3078a.f125143h = vq.j.a(c3078a);
                    c3078a.f125144j = vq.j.a(obj);
                    c3078a.f125145k = vq.j.a(hVar);
                    c3078a.f125146l = 0;
                    c3078a.f125140e = 1;
                    if (hVar.F(n0VarV9, c3078a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, r rVar) {
            this.f125135a = gVar;
            this.f125136b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<oa2.a>> hVar, tq.e eVar) {
            Object objA = this.f125135a.a(new a(hVar, this.f125136b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ma2/r$c", "Lja/x0;", "", "Lia2/b;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x0<Integer, UserActivityLog> {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f125148d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f125149e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f125150f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f125151g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f125152h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f125153j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            /* synthetic */ Object f125154k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f125156m;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f125154k = obj;
                this.f125156m |= PKIFailureInfo.systemUnavail;
                return c.this.g(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t15, T t16) {
                return sq.a.e(((UserActivityLog) t16).getDate(), ((UserActivityLog) t15).getDate());
            }
        }

        c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
        
            if (r6.F(r7, r0) == r1) goto L27;
         */
        @Override // ja.x0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(ja.x0.a<java.lang.Integer> r10, tq.e<? super ja.x0.b<java.lang.Integer, ia2.UserActivityLog>> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ma2.r.c.g(ja.x0$a, tq.e):java.lang.Object");
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer d(PagingState<Integer, UserActivityLog> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, UserActivityLog> c2395bC = state.c(anchorPosition.intValue());
                if (c2395bC != null && (numI = c2395bC.i()) != null) {
                    iIntValue = numI.intValue() + 1;
                } else if (c2395bC != null && (numH = c2395bC.h()) != null) {
                    iIntValue = numH.intValue() - 1;
                }
                return Integer.valueOf(iIntValue);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<l.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f125157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f125158b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f125159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f125160b;

            /* JADX INFO: renamed from: ma2.r$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3079a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f125161d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f125162e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f125163f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f125165h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f125166j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f125167k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f125168l;

                public C3079a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f125161d = obj;
                    this.f125162e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f125159a = hVar;
                this.f125160b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3079a c3079a;
                if (eVar instanceof C3079a) {
                    c3079a = (C3079a) eVar;
                    int i15 = c3079a.f125162e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3079a.f125162e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3079a = new C3079a(eVar);
                    }
                } else {
                    c3079a = new C3079a(eVar);
                }
                Object obj2 = c3079a.f125161d;
                Object objE = uq.b.e();
                int i16 = c3079a.f125162e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f125159a;
                    l.a aVarW9 = this.f125160b.w9((k) obj);
                    c3079a.f125163f = vq.j.a(obj);
                    c3079a.f125165h = vq.j.a(c3079a);
                    c3079a.f125166j = vq.j.a(obj);
                    c3079a.f125167k = vq.j.a(hVar);
                    c3079a.f125168l = 0;
                    c3079a.f125162e = 1;
                    if (hVar.F(aVarW9, c3079a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, r rVar) {
            this.f125157a = gVar;
            this.f125158b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l.a> hVar, tq.e eVar) {
            Object objA = this.f125157a.a(new a(hVar, this.f125158b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lma2/k$a;", "it", "Loq/i0;", "<anonymous>", "(Lma2/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125169e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f125169e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(j.c.f125114a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lma2/j$c;", "<unused var>", "Lma2/k$a;", "Loq/i0;", "<anonymous>", "(Lma2/j$c;Lma2/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<j.c, k.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f125171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f125172f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r rVar;
            Object objE = uq.b.e();
            int i15 = this.f125172f;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar2 = r.this;
                this.f125171e = rVar2;
                this.f125172f = 1;
                Object objR9 = rVar2.r9(this);
                if (objR9 == objE) {
                    return objE;
                }
                rVar = rVar2;
                obj = objR9;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.f125171e;
                oq.u.b(obj);
            }
            rVar.y9(ja.d.a((mu.g) obj, u0.a(r.this)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j.c cVar, k.a aVar, tq.e<? super i0> eVar) {
            return r.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lma2/j$a;", "<unused var>", "Lma2/k$a;", "Loq/i0;", "<anonymous>", "(Lma2/j$a;Lma2/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<j.a, k.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125174e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f125174e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j.b> bVarY1 = r.this.Y1();
                j.b.a aVar = j.b.a.f125112a;
                this.f125174e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j.a aVar, k.a aVar2, tq.e<? super i0> eVar) {
            return r.this.new g(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, na2.a aVar2, na2.b bVar, ib4.c cVar, ka2.c cVar2) {
        this.mapper = aVar2;
        this.pagingMapper = bVar;
        this.domainErrorMapper = cVar;
        this.loadUserActivityLogsUseCase = cVar2;
        k.a aVar3 = k.a.f125115a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: ma2.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f125119a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.activityLogs = mu.i.v();
        this.state = a9(new d(e9().getState(), this), w9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(k.a.class), new er.l() { // from class: ma2.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f125120a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, z zVar) {
        zVar.C(rVar.new e(null));
        f fVar = rVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j.c.class), oVar, fVar);
        zVar.x(q0.c(j.a.class), oVar, rVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(tq.e<? super mu.g<n0<oa2.a>>> eVar) {
        return new b(new l0(new m0(50, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: ma2.p
            @Override // er.a
            public final Object a() {
                return r.s9(this.f125122a);
            }
        }, 2, null).a(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 s9(r rVar) {
        return rVar.new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b t9(dx.b domainError) {
        return this.domainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ma2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f125123a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            rVar.d();
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            rVar.d9(j.c.f125114a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<oa2.a> v9(n0<UserActivityLog> pagingData) {
        return this.pagingMapper.b(new na2.b.Params(pagingData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.a w9(k state) {
        return this.mapper.b(new na2.a.Params(state, new er.a() { // from class: ma2.o
            @Override // er.a
            public final Object a() {
                return r.x9(this.f125121a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar) {
        rVar.d();
        return i0.f148189a;
    }

    @Override // ma2.l
    public mu.g<n0<oa2.a>> C8() {
        return this.activityLogs;
    }

    @Override // zx.b
    public xw.b<j.b> Y1() {
        return this.navAction;
    }

    @Override // ma2.l
    public void d() {
        d9(j.a.f125111a);
    }

    @Override // l00.g
    protected k10.t<k, j> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l.a> getState() {
        return this.state;
    }

    public void y9(mu.g<n0<oa2.a>> gVar) {
        this.activityLogs = gVar;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
