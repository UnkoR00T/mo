package rc3;

import ay.h;
import ay.j;
import dx.i;
import fr.q0;
import java.nio.charset.Charset;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p10.e;
import pc3.PassportsDataEntity;
import pl.gov.coi.common.network.deserializer.StrictNonNullAdapterFactory;
import pl.gov.coi.mobywatel.feature.userdata.data.database.PassportsDatabase;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportsDataDto;
import pq.v;
import px.d;
import px.f;
import uc3.PassportsData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u0012H\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ&\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00122\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b$\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lrc3/a;", "Lvc3/a;", "Lp10/e;", "dbProvider", "Liy/a;", "base64Coder", "Lez/a;", "currentTimeProvider", "Lay/j;", "jsonSerializer", "Lq10/a;", "databaseRegistry", "Lpx/d;", "remoteLogger", "Lay/h;", "jsonFactory", "<init>", "(Lp10/e;Liy/a;Lez/a;Lay/j;Lq10/a;Lpx/d;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/feature/userdata/data/database/PassportsDatabase;", "f", "()Ldx/i;", "Luc3/i;", "passportsData", "Loq/i0;", "d", "(Luc3/i;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "c", "", "passportData", "e", "([BLtq/e;)Ljava/lang/Object;", "a", "Lp10/e;", "Liy/a;", "Lez/a;", "Lay/j;", "Lq10/a;", "Lpx/d;", "g", "strictNonNullSerializer", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements vc3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j strictNonNullSerializer;

    /* JADX INFO: renamed from: rc3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4420a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f173113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f173115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f173116g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f173117h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f173120l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f173121m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f173123p;

        C4420a(tq.e<? super C4420a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173121m = obj;
            this.f173123p |= PKIFailureInfo.systemUnavail;
            return a.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f173124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f173126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f173127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f173128h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173129j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173130k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f173131l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f173132m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f173134p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173132m = obj;
            this.f173134p |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173139h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f173141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f173142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f173143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f173144n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f173145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f173146q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f173148s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173146q = obj;
            this.f173148s |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(e eVar, iy.a aVar, ez.a aVar2, j jVar, q10.a aVar3, d dVar, h hVar) {
        this.dbProvider = eVar;
        this.base64Coder = aVar;
        this.currentTimeProvider = aVar2;
        this.jsonSerializer = jVar;
        this.databaseRegistry = aVar3;
        this.remoteLogger = dVar;
        this.strictNonNullSerializer = hVar.a(new StrictNonNullAdapterFactory());
    }

    private final i<dx.b, PassportsDatabase> f() {
        e eVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        List<? extends ra.b> listN2 = v.n();
        PassportsDatabase.Companion aVar = PassportsDatabase.INSTANCE;
        i<dx.b, PassportsDatabase> iVarB = eVar.b(PassportsDatabase.class, listN, listN2, aVar.a());
        if (iVarB instanceof i.Right) {
            if (!this.databaseRegistry.d().contains(aVar.a())) {
                this.databaseRegistry.c(aVar.a());
                this.remoteLogger.F8("Database added to tracking register: " + aVar.a(), d.a.GENERAL);
            }
        }
        return iVarB;
    }

    @Override // vc3.a
    public Object a(PassportsData passportsData, tq.e<? super i<? extends dx.b, byte[]>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    String strB = this.strictNonNullSerializer.b(qc3.a.t(passportsData), q0.n(PassportsDataDto.class));
                    iy.a aVar = this.base64Coder;
                    Charset charset = fu.d.UTF_8;
                    return new i.Right(iy.a.e(aVar, strB.getBytes(charset), null, 2, null).getBytes(charset));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [rc3.a$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [oc3.a] */
    @Override // vc3.a
    public Object b(tq.e<? super i<? extends dx.b, PassportsData>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        ex.b bVar2;
        PassportsDataEntity passportsDataEntity;
        byte[] passportData;
        if (eVar instanceof b) {
            b bVar3 = (b) eVar;
            int i15 = bVar3.f173134p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar3.f173134p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar3;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f173132m;
        Object objE = uq.b.e();
        int i16 = bVar.f173134p;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f173131l;
                    try {
                        u.b(obj);
                        passportsDataEntity = (PassportsDataEntity) obj;
                        if (passportsDataEntity != null || (passportData = passportsDataEntity.getPassportData()) == null) {
                            bVar2.b(new dx.b.Generic(new NoSuchElementException("No passport data found in database")));
                            throw new g();
                        }
                        PassportsDataDto passportsDataDto = (PassportsDataDto) this.strictNonNullSerializer.a(new String((byte[]) bVar2.a(iy.a.a(this.base64Coder, passportData, null, 2, null)), fu.d.UTF_8), q0.g(PassportsDataDto.class));
                        return new i.Right(passportsDataDto != null ? qc3.a.i(passportsDataDto) : null);
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    ?? A0 = ((PassportsDatabase) aVar.a(f())).a0();
                    bVar.f173129j = jVarA;
                    bVar.f173130k = vq.j.a(aVar);
                    bVar.f173131l = aVar;
                    bVar.f173124d = 0;
                    bVar.f173125e = 0;
                    bVar.f173126f = 0;
                    bVar.f173127g = 0;
                    bVar.f173128h = 0;
                    bVar.f173134p = 1;
                    Object objB2 = A0.b(bVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    obj = objB2;
                    bVar2 = aVar;
                    passportsDataEntity = (PassportsDataEntity) obj;
                    if (passportsDataEntity != null) {
                    }
                    bVar2.b(new dx.b.Generic(new NoSuchElementException("No passport data found in database")));
                    throw new g();
                } catch (ex.c e18) {
                    e15 = e18;
                    return new i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    bVar = jVarA;
                    e = e25;
                    f fVar = f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(bVar));
                    i iVarA = bVar.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #4 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x0084, B:29:0x0088, B:30:0x0097, B:31:0x00ab, B:38:0x00bb, B:41:0x00c9), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #4 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x0084, B:29:0x0088, B:30:0x0097, B:31:0x00ab, B:38:0x00bb, B:41:0x00c9), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [rc3.a$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [oc3.a] */
    @Override // vc3.a
    public Object c(tq.e<? super i<? extends dx.b, Long>> eVar) throws Throwable {
        ?? c4420a;
        Object objB;
        ex.c e15;
        ex.b bVar;
        Long l15;
        if (eVar instanceof C4420a) {
            C4420a c4420a2 = (C4420a) eVar;
            int i15 = c4420a2.f173123p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4420a2.f173123p = i15 - PKIFailureInfo.systemUnavail;
                c4420a = c4420a2;
            } else {
                c4420a = new C4420a(eVar);
            }
        } else {
            c4420a = new C4420a(eVar);
        }
        Object obj = c4420a.f173121m;
        Object objE = uq.b.e();
        int i16 = c4420a.f173123p;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) c4420a.f173120l;
                    try {
                        u.b(obj);
                        l15 = (Long) obj;
                        if (l15 != null) {
                            return new i.Right(vq.b.f(l15.longValue()));
                        }
                        bVar.b(new dx.b.Generic(new NoSuchElementException("No passport data found in database")));
                        throw new g();
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    ?? A0 = ((PassportsDatabase) aVar.a(f())).a0();
                    c4420a.f173118j = jVarA;
                    c4420a.f173119k = vq.j.a(aVar);
                    c4420a.f173120l = aVar;
                    c4420a.f173113d = 0;
                    c4420a.f173114e = 0;
                    c4420a.f173115f = 0;
                    c4420a.f173116g = 0;
                    c4420a.f173117h = 0;
                    c4420a.f173123p = 1;
                    Object objC = A0.c(c4420a);
                    if (objC == objE) {
                        return objE;
                    }
                    obj = objC;
                    bVar = aVar;
                    l15 = (Long) obj;
                    if (l15 != null) {
                        return new i.Right(vq.b.f(l15.longValue()));
                    }
                    bVar.b(new dx.b.Generic(new NoSuchElementException("No passport data found in database")));
                    throw new g();
                } catch (ex.c e18) {
                    e15 = e18;
                    return new i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    c4420a = jVarA;
                    e = e25;
                    f fVar = f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(c4420a));
                    i iVarA = c4420a.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // vc3.a
    public Object d(PassportsData passportsData, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f173148s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f173148s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f173146q;
        ?? E = uq.b.e();
        int i16 = cVar.f173148s;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        String strB = this.strictNonNullSerializer.b(qc3.a.t(passportsData), q0.n(PassportsDataDto.class));
                        iy.a aVar2 = this.base64Coder;
                        Charset charset = fu.d.UTF_8;
                        byte[] bytes = iy.a.e(aVar2, strB.getBytes(charset), null, 2, null).getBytes(charset);
                        oc3.a aVarA0 = ((PassportsDatabase) aVar.a(f())).a0();
                        PassportsDataEntity passportsDataEntity = new PassportsDataEntity(0, this.currentTimeProvider.a(), bytes, 1, null);
                        cVar.f173135d = vq.j.a(passportsData);
                        cVar.f173136e = jVarA;
                        cVar.f173137f = vq.j.a(aVar);
                        cVar.f173138g = vq.j.a(aVar);
                        cVar.f173139h = vq.j.a(bytes);
                        cVar.f173140j = vq.j.a(strB);
                        cVar.f173141k = 0;
                        cVar.f173142l = 0;
                        cVar.f173143m = 0;
                        cVar.f173144n = 0;
                        cVar.f173145p = 0;
                        cVar.f173148s = 1;
                        if (aVarA0.f(passportsDataEntity, cVar) == E) {
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        i iVarA = E.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    @Override // vc3.a
    public Object e(byte[] bArr, tq.e<? super i<? extends dx.b, PassportsData>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    PassportsDataDto passportsDataDto = (PassportsDataDto) this.jsonSerializer.a(new String((byte[]) new ex.a().a(iy.a.a(this.base64Coder, bArr, null, 2, null)), fu.d.UTF_8), q0.g(PassportsDataDto.class));
                    return new i.Right(passportsDataDto != null ? qc3.a.i(passportsDataDto) : null);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
