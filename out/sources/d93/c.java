package d93;

import android.content.Context;
import com.scottyab.rootbeer.RootBeer;
import er.p;
import fr.k;
import fr.t;
import iy.n;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ju.a0;
import ju.a2;
import ju.e3;
import ju.g1;
import ju.g3;
import ju.p0;
import ju.q0;
import ju.z2;
import jx.g;
import mu.b0;
import mu.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Ld93/c;", "Ld93/b;", "Landroid/content/Context;", "context", "Lpx/d;", "remoteLogger", "Lez/c;", "dateConverter", "Ljx/g;", "systemInfo", "Liy/n;", "emulatorDetector", "<init>", "(Landroid/content/Context;Lpx/d;Lez/c;Ljx/g;Liy/n;)V", "", "isEmulator", "isRooted", "blueBorneVulnerability", "Loq/i0;", "o", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "n", "()V", "l", "()Z", "b", "m", "Lmu/g;", "Le93/c;", "a", "()Lmu/g;", "Lpx/d;", "Lez/c;", "c", "Ljx/g;", "d", "Liy/n;", "Lju/a0;", "e", "Lju/a0;", "job", "Lju/p0;", "f", "Lju/p0;", "scope", "Lcom/scottyab/rootbeer/RootBeer;", "g", "Lcom/scottyab/rootbeer/RootBeer;", "rootBeer", "", "Le93/a;", "h", "Ljava/util/List;", "detectedSecurityThreats", "Lmu/b0;", "i", "Lmu/b0;", "monitorDetectedSecurityThreats", "j", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements d93.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f40542j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f40543k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f40544l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g systemInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n emulatorDetector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a0 job;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final RootBeer rootBeer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<e93.a> detectedSecurityThreats;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b0<e93.c> monitorDetectedSecurityThreats;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld93/c$a;", "", "<init>", "()V", "Lgu/b;", "SCANNING_TIMEOUT", "J", "", "BLUE_BORNE_MIN_PATH_LVL", "Ljava/lang/String;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f40554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f40555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f40556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f40557h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f40558j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f40559k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f40560l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f40561m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f40563e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f40564f;

            /* JADX INFO: renamed from: d93.c$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
            static final class C0890a extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40565e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f40566f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ c f40567g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0890a(c cVar, tq.e<? super C0890a> eVar) {
                    super(2, eVar);
                    this.f40567g = cVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean O(c cVar) {
                    return cVar.l();
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    p0 p0Var = (p0) this.f40566f;
                    Object objE = uq.b.e();
                    int i15 = this.f40565e;
                    try {
                        if (i15 == 0) {
                            u.b(obj);
                            final c cVar = this.f40567g;
                            er.a aVar = new er.a() { // from class: d93.d
                                @Override // er.a
                                public final Object a() {
                                    return Boolean.valueOf(c.b.a.C0890a.O(cVar));
                                }
                            };
                            this.f40566f = p0Var;
                            this.f40565e = 1;
                            obj = a2.c(null, aVar, this, 1, null);
                            if (obj == objE) {
                                return objE;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            u.b(obj);
                        }
                        return (Boolean) obj;
                    } catch (e3 e15) {
                        this.f40567g.remoteLogger.T6("Error occurred during blue borne vulnerability scanning: " + e15.getMessage(), e15, px.c.a(p0Var));
                        return null;
                    }
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                    return ((C0890a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    C0890a c0890a = new C0890a(this.f40567g, eVar);
                    c0890a.f40566f = obj;
                    return c0890a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f40564f = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f40563e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                long j15 = c.f40544l;
                C0890a c0890a = new C0890a(this.f40564f, null);
                this.f40563e = 1;
                Object objD = g3.d(j15, c0890a, this);
                return objD == objE ? objE : objD;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f40564f, eVar);
            }
        }

        /* JADX INFO: renamed from: d93.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
        static final class C0891b extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f40568e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f40569f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f40570g;

            /* JADX INFO: renamed from: d93.c$b$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
            static final class a extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40571e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ c f40572f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(c cVar, tq.e<? super a> eVar) {
                    super(2, eVar);
                    this.f40572f = cVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean O(c cVar) {
                    return cVar.emulatorDetector.a();
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f40571e;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                        return obj;
                    }
                    u.b(obj);
                    final c cVar = this.f40572f;
                    er.a aVar = new er.a() { // from class: d93.e
                        @Override // er.a
                        public final Object a() {
                            return Boolean.valueOf(c.b.C0891b.a.O(cVar));
                        }
                    };
                    this.f40571e = 1;
                    Object objC = a2.c(null, aVar, this, 1, null);
                    return objC == objE ? objE : objC;
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                    return ((a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new a(this.f40572f, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0891b(c cVar, tq.e<? super C0891b> eVar) {
                super(2, eVar);
                this.f40570g = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                p0 p0Var = (p0) this.f40569f;
                Object objE = uq.b.e();
                int i15 = this.f40568e;
                try {
                    if (i15 == 0) {
                        u.b(obj);
                        long j15 = c.f40544l;
                        a aVar = new a(this.f40570g, null);
                        this.f40569f = p0Var;
                        this.f40568e = 1;
                        obj = g3.d(j15, aVar, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    return (Boolean) obj;
                } catch (e3 e15) {
                    this.f40570g.remoteLogger.T6("Error occurred during emulator scanning: " + e15.getMessage(), e15, px.c.a(p0Var));
                    return null;
                }
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                return ((C0891b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C0891b c0891b = new C0891b(this.f40570g, eVar);
                c0891b.f40569f = obj;
                return c0891b;
            }
        }

        /* JADX INFO: renamed from: d93.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
        static final class C0892c extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f40573e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f40574f;

            /* JADX INFO: renamed from: d93.c$b$c$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
            static final class a extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40575e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f40576f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ c f40577g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(c cVar, tq.e<? super a> eVar) {
                    super(2, eVar);
                    this.f40577g = cVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean O(c cVar) {
                    return cVar.rootBeer.isRooted();
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    p0 p0Var = (p0) this.f40576f;
                    Object objE = uq.b.e();
                    int i15 = this.f40575e;
                    try {
                        if (i15 == 0) {
                            u.b(obj);
                            final c cVar = this.f40577g;
                            er.a aVar = new er.a() { // from class: d93.f
                                @Override // er.a
                                public final Object a() {
                                    return Boolean.valueOf(c.b.C0892c.a.O(cVar));
                                }
                            };
                            this.f40576f = p0Var;
                            this.f40575e = 1;
                            obj = a2.c(null, aVar, this, 1, null);
                            if (obj == objE) {
                                return objE;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            u.b(obj);
                        }
                        return (Boolean) obj;
                    } catch (e3 e15) {
                        this.f40577g.remoteLogger.T6("Error occurred during root detection scanning: " + e15.getMessage(), e15, px.c.a(p0Var));
                        return null;
                    }
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                    return ((a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    a aVar = new a(this.f40577g, eVar);
                    aVar.f40576f = obj;
                    return aVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0892c(c cVar, tq.e<? super C0892c> eVar) {
                super(2, eVar);
                this.f40574f = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f40573e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                long j15 = c.f40544l;
                a aVar = new a(this.f40574f, null);
                this.f40573e = 1;
                Object objD = g3.d(j15, aVar, this);
                return objD == objE ? objE : objD;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                return ((C0892c) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C0892c(this.f40574f, eVar);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0148  */
        /* JADX WARN: Code duplicated, block: B:38:0x014a  */
        /* JADX WARN: Code duplicated, block: B:41:0x0169 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:13:0x0040, B:46:0x01a4, B:18:0x0060, B:39:0x014f, B:41:0x0169, B:43:0x0177, B:42:0x0175, B:21:0x007b, B:35:0x0124, B:24:0x0098, B:31:0x00f9, B:27:0x00a2), top: B:53:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0175 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:13:0x0040, B:46:0x01a4, B:18:0x0060, B:39:0x014f, B:41:0x0169, B:43:0x0177, B:42:0x0175, B:21:0x007b, B:35:0x0124, B:24:0x0098, B:31:0x00f9, B:27:0x00a2), top: B:53:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x01a3  */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01f8, code lost:
        
            if (r3.F(r4, r17) == r8) goto L50;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 510
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d93.c.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = c.this.new b(eVar);
            bVar.f40561m = obj;
            return bVar;
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f40544l = gu.d.q(5, gu.e.SECONDS);
    }

    public c(Context context, px.d dVar, ez.c cVar, g gVar, n nVar) {
        this.remoteLogger = dVar;
        this.dateConverter = cVar;
        this.systemInfo = gVar;
        this.emulatorDetector = nVar;
        a0 a0VarB = z2.b(null, 1, null);
        this.job = a0VarB;
        this.scope = q0.a(g1.b().n0(a0VarB));
        this.rootBeer = new RootBeer(context);
        this.detectedSecurityThreats = new ArrayList();
        this.monitorDetectedSecurityThreats = r0.a(e93.c.b.f48791a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        String strA = this.systemInfo.a();
        ez.c cVar = this.dateConverter;
        fz.c cVar2 = fz.c.DASHED_REVERSED;
        Date dateE = cVar.e(strA, cVar2);
        return dateE == null || dateE.before(this.dateConverter.e("2017-09-01", cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        String string;
        if (this.detectedSecurityThreats.isEmpty()) {
            return;
        }
        String str = "Detected:";
        for (e93.a aVar : this.detectedSecurityThreats) {
            if (t.c(aVar, e93.a.c.f48784a)) {
                string = " root detected,";
            } else if (aVar instanceof e93.a.Malware) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" malware detected: packageName=");
                e93.a.Malware malware = (e93.a.Malware) aVar;
                sb5.append(malware.getPackageName());
                sb5.append(", name =");
                sb5.append(malware.getName());
                sb5.append(',');
                string = sb5.toString();
            } else if (t.c(aVar, e93.a.C1137a.f48781a)) {
                string = " emulator detected,";
            } else {
                if (!t.c(aVar, e93.a.d.C1138a.f48785a)) {
                    throw new oq.p();
                }
                string = " blue borne vulnerability detected,";
            }
            this.remoteLogger.p("THREAT_DETECTED", string);
            str = str + string;
        }
        this.remoteLogger.u6(str, px.c.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Boolean isEmulator, Boolean isRooted, Boolean blueBorneVulnerability) {
        if (isRooted == null || blueBorneVulnerability == null || isEmulator == null) {
            px.b.y5(this.remoteLogger, "Timeout (NULL) error occurred during security threats scanning: isRooted=" + isRooted + ", blueBorneVulnerability=" + blueBorneVulnerability + ", isEmulator=" + isEmulator, null, px.c.a(this), 2, null);
        }
        Boolean bool = Boolean.TRUE;
        if (t.c(isRooted, bool)) {
            this.detectedSecurityThreats.add(e93.a.c.f48784a);
        }
        if (t.c(isEmulator, bool)) {
            this.detectedSecurityThreats.add(e93.a.C1137a.f48781a);
        }
        if (t.c(blueBorneVulnerability, bool)) {
            this.detectedSecurityThreats.add(e93.a.d.C1138a.f48785a);
        }
    }

    @Override // d93.b
    public mu.g<e93.c> a() {
        return this.monitorDetectedSecurityThreats;
    }

    @Override // d93.b
    public void b() {
        ju.k.d(this.scope, null, null, new b(null), 3, null);
    }

    public boolean m() {
        return !this.detectedSecurityThreats.isEmpty();
    }
}
