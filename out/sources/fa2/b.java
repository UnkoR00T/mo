package fa2;

import ay.j;
import dx.i;
import er.l;
import fr.q0;
import fu.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.history.data.model.LogItem;
import pl.gov.coi.mobywatel.feature.history.data.model.LogType;
import pq.v;
import vq.k;
import y92.LocalAppActivityLog;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 12\u00020\u0001:\u0001\u001aB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u0013J(\u0010!\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J \u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lfa2/b;", "Lja2/b;", "Laz/f;", "fileManager", "Lay/j;", "jsonSerializer", "Ld00/a;", "inMemoryCache", "Lez/b;", "dateCalculator", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "<init>", "(Laz/f;Lay/j;Ld00/a;Lez/b;Lez/a;Lmx/c;)V", "", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogItem;", "h", "(Ltq/e;)Ljava/lang/Object;", "", "logs", "Loq/i0;", "i", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ly92/d;", "a", "Ly92/e;", "logLevel", "Ly92/f;", "logType", "", "data", "c", "(Ly92/e;Ly92/f;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "olderThanDays", "exceedingCount", "b", "(IILtq/e;)Ljava/lang/Object;", "Laz/f;", "Lay/j;", "Ld00/a;", "d", "Lez/b;", "e", "Lez/a;", "f", "Lmx/c;", "g", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ja2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60469h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: fa2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1365b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f60476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60480h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f60481j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f60482k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f60483l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f60484m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f60486p;

        C1365b(tq.e<? super C1365b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60484m = obj;
            this.f60486p |= PKIFailureInfo.systemUnavail;
            return b.this.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lpl/gov/coi/mobywatel/feature/history/data/model/LogItem;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends k implements l<tq.e<? super List<? extends LogItem>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f60487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60489g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f60491j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ex.b<? super dx.b> bVar, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f60491j = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0096  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            ex.b<dx.b> bVar;
            String str;
            Object objE = uq.b.e();
            int i15 = this.f60489g;
            if (i15 == 0) {
                u.b(obj);
                az.f fVar = b.this.fileManager;
                az.g.File file = new az.g.File("appLog.log");
                this.f60489g = 1;
                obj = fVar.j(file, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) this.f60488f;
                u.b(obj);
            }
            str = new String((byte[]) bVar.a((i) obj), fu.d.UTF_8);
            if (r.t0(str)) {
                str = "[]";
            }
            px.f.f163100a.b("Get logs file: " + str, px.c.a(this.f60491j));
            return b.this.jsonSerializer.a(str, q0.o(List.class, mr.r.INSTANCE.d(q0.n(LogItem.class))));
            i iVar = (i) obj;
            if (iVar instanceof i.Left) {
                objB = vq.b.a(false);
            } else {
                if (!(iVar instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) iVar).b();
            }
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            if (!zBooleanValue) {
                return v.n();
            }
            ex.b<dx.b> bVar2 = this.f60491j;
            az.f fVar2 = b.this.fileManager;
            az.g.File file2 = new az.g.File("appLog.log");
            this.f60488f = bVar2;
            this.f60487e = zBooleanValue;
            this.f60489g = 2;
            obj = fVar2.l(file2, this);
            if (obj != objE) {
                bVar = bVar2;
                str = new String((byte[]) bVar.a((i) obj), fu.d.UTF_8);
                if (r.t0(str)) {
                    str = "[]";
                }
                px.f.f163100a.b("Get logs file: " + str, px.c.a(this.f60491j));
                return b.this.jsonSerializer.a(str, q0.o(List.class, mr.r.INSTANCE.d(q0.n(LogItem.class))));
            }
            return objE;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new c(this.f60491j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super List<LogItem>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f60492d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60494f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60492d = obj;
            this.f60494f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Long.valueOf(((LogItem) t16).getTimestamp()), Long.valueOf(((LogItem) t15).getTimestamp()));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f60495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f60498g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f60500j;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60498g = obj;
            this.f60500j |= PKIFailureInfo.systemUnavail;
            return b.this.b(0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f60502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60503f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60505h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60503f = obj;
            this.f60505h |= PKIFailureInfo.systemUnavail;
            return b.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f60507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f60509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f60510h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f60512k;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60510h = obj;
            this.f60512k |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, null, null, this);
        }
    }

    public b(az.f fVar, j jVar, d00.a aVar, ez.b bVar, ez.a aVar2, mx.c cVar) {
        this.fileManager = fVar;
        this.jsonSerializer = jVar;
        this.inMemoryCache = aVar;
        this.dateCalculator = bVar;
        this.currentTimeProvider = aVar2;
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final Object h(tq.e<? super List<LogItem>> eVar) throws Throwable {
        C1365b c1365b;
        Object objB;
        i left;
        if (eVar instanceof C1365b) {
            c1365b = (C1365b) eVar;
            int i15 = c1365b.f60486p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1365b.f60486p = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1365b = new C1365b(eVar);
            }
        } else {
            c1365b = new C1365b(eVar);
        }
        C1365b c1365b2 = c1365b;
        Object obj = c1365b2.f60484m;
        Object objE = uq.b.e();
        ?? r15 = c1365b2.f60486p;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        px.f.f163100a.b("Get logs...", px.c.a(aVar));
                        d00.a aVar2 = this.inMemoryCache;
                        c cVar = new c(aVar, null);
                        c1365b2.f60481j = jVarA;
                        c1365b2.f60482k = vq.j.a(aVar);
                        c1365b2.f60483l = vq.j.a(aVar);
                        c1365b2.f60476d = 0;
                        c1365b2.f60477e = 0;
                        c1365b2.f60478f = 0;
                        c1365b2.f60479g = 0;
                        c1365b2.f60480h = 0;
                        c1365b2.f60486p = 1;
                        Object objP = d00.a.p(aVar2, 24985, 0L, cVar, c1365b2, 2, null);
                        if (objP == objE) {
                            return objE;
                        }
                        obj = objP;
                    } catch (ex.c e15) {
                        e = e15;
                        left = new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        e = e16;
                        throw e;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVarA;
                        Exception exc = e;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        i iVarA = r15.a(exc);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        left = new i.Left(objB);
                    }
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        left = new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        e = e19;
                        throw e;
                    }
                }
                left = new i.Right((List) obj);
            } catch (Exception e25) {
                e = e25;
            }
            if (left instanceof i.Left) {
                dx.b bVar = (dx.b) ((i.Left) left).b();
                px.f.f163100a.b("Get logs error: " + bVar, px.c.a(this));
                return v.n();
            }
            if (!(left instanceof i.Right)) {
                throw new p();
            }
            List list = (List) ((i.Right) left).b();
            px.f.f163100a.b("Get logs: " + list, px.c.a(this));
            return list;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(List<? extends Object> list, tq.e<? super i0> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f60505h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f60505h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f60503f;
        Object objE = uq.b.e();
        int i16 = gVar.f60505h;
        if (i16 == 0) {
            u.b(obj);
            px.f.f163100a.b("Store: " + list, px.c.a(this));
            byte[] bytes = this.jsonSerializer.b(list, q0.o(List.class, mr.r.INSTANCE.d(q0.n(Object.class)))).getBytes(fu.d.UTF_8);
            az.f fVar = this.fileManager;
            gVar.f60501d = vq.j.a(list);
            gVar.f60502e = vq.j.a(bytes);
            gVar.f60505h = 1;
            if (fVar.c(bytes, "appLog.log", true, gVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        this.inMemoryCache.n(24985);
        px.f.f163100a.b("Cache cleared", px.c.a(this));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ja2.b
    public Object a(tq.e<? super List<LocalAppActivityLog>> eVar) throws Throwable {
        d dVar;
        Label labelB;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f60494f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f60494f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objH = dVar.f60492d;
        Object objE = uq.b.e();
        int i16 = dVar.f60494f;
        if (i16 == 0) {
            u.b(objH);
            dVar.f60494f = 1;
            objH = h(dVar);
            if (objH == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objH);
        }
        Iterable<LogItem> iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        for (LogItem logItem : iterable) {
            LogType type = logItem.getType();
            if (type != null) {
                labelB = this.labelProvider.c(da2.a.f40584a.g(type));
                if (labelB == null) {
                    labelB = Label.INSTANCE.b();
                }
            } else {
                labelB = Label.INSTANCE.b();
            }
            arrayList.add(da2.a.f40584a.a(logItem, labelB));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (i(r2, r0) == r1) goto L33;
     */
    @Override // ja2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r12, int r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa2.b.b(int, int, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
    
        if (i(r3, r5) == r6) goto L22;
     */
    @Override // ja2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(y92.e r19, y92.f r20, java.lang.String r21, tq.e<? super oq.i0> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa2.b.c(y92.e, y92.f, java.lang.String, tq.e):java.lang.Object");
    }
}
