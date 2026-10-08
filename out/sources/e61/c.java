package e61;

import a61.ChildPassportApplicationDraftDataEntity;
import ay.h;
import ay.j;
import dx.i;
import fr.q0;
import i61.ChildPassportApplicationDraft;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p10.e;
import pl.gov.coi.common.network.deserializer.StrictNonNullAdapterFactory;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.database.ChildPassportApplicationDraftDatabase;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDraftDto;
import pq.v;
import px.d;
import px.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u0010H\u0096@¢\u0006\u0004\b\u001c\u0010\u001bJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b!\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$¨\u0006*"}, d2 = {"Le61/c;", "Lk61/b;", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Lp10/e;", "dbProvider", "Lq10/a;", "databaseRegistry", "Lpx/d;", "remoteLogger", "Lay/h;", "jsonFactory", "<init>", "(Liy/a;Lay/j;Lp10/e;Lq10/a;Lpx/d;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/database/ChildPassportApplicationDraftDatabase;", "a", "()Ldx/i;", "Li61/e;", "draft", "Loq/i0;", "h", "(Li61/e;Ltq/e;)Ljava/lang/Object;", "e", "(Ltq/e;)Ljava/lang/Object;", "c", "", "draftData", "g", "([BLtq/e;)Ljava/lang/Object;", "f", "Liy/a;", "b", "Lay/j;", "Lp10/e;", "d", "Lq10/a;", "Lpx/d;", "strictNonNullSerializer", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements k61.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dbProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j strictNonNullSerializer;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f47692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f47694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f47695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f47696h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f47697j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f47698k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f47699l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f47700m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f47702p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f47700m = obj;
            this.f47702p |= PKIFailureInfo.systemUnavail;
            return c.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f47703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f47705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f47706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f47707h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f47708j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f47709k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f47710l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f47711m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f47713p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f47711m = obj;
            this.f47713p |= PKIFailureInfo.systemUnavail;
            return c.this.c(this);
        }
    }

    /* JADX INFO: renamed from: e61.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1100c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f47714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f47715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f47716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f47717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f47718h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f47719j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f47720k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f47721l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f47722m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f47723n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f47724p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f47725q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f47727s;

        C1100c(tq.e<? super C1100c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f47725q = obj;
            this.f47727s |= PKIFailureInfo.systemUnavail;
            return c.this.h(null, this);
        }
    }

    public c(iy.a aVar, j jVar, e eVar, q10.a aVar2, d dVar, h hVar) {
        this.base64Coder = aVar;
        this.jsonSerializer = jVar;
        this.dbProvider = eVar;
        this.databaseRegistry = aVar2;
        this.remoteLogger = dVar;
        this.strictNonNullSerializer = hVar.a(new StrictNonNullAdapterFactory());
    }

    private final i<dx.b, ChildPassportApplicationDraftDatabase> a() {
        e eVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        List<? extends ra.b> listN2 = v.n();
        ChildPassportApplicationDraftDatabase.Companion aVar = ChildPassportApplicationDraftDatabase.INSTANCE;
        i<dx.b, ChildPassportApplicationDraftDatabase> iVarB = eVar.b(ChildPassportApplicationDraftDatabase.class, listN, listN2, aVar.a());
        if (iVarB instanceof i.Right) {
            if (!this.databaseRegistry.d().contains(aVar.a())) {
                this.databaseRegistry.c(aVar.a());
                this.remoteLogger.F8("Database added to tracking register: " + aVar.a(), d.a.GENERAL);
            }
        }
        return iVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e61.c$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [z51.a] */
    @Override // k61.b
    public Object c(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            b bVar2 = (b) eVar;
            int i15 = bVar2.f47713p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f47713p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar2;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f47711m;
        Object objE = uq.b.e();
        int i16 = bVar.f47713p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? A0 = ((ChildPassportApplicationDraftDatabase) aVar.a(a())).a0();
                        bVar.f47708j = jVarA;
                        bVar.f47709k = vq.j.a(aVar);
                        bVar.f47710l = vq.j.a(aVar);
                        bVar.f47703d = 0;
                        bVar.f47704e = 0;
                        bVar.f47705f = 0;
                        bVar.f47706g = 0;
                        bVar.f47707h = 0;
                        bVar.f47713p = 1;
                        if (A0.d(bVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
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
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e61.c$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [z51.a] */
    @Override // k61.b
    public Object e(tq.e<? super i<? extends dx.b, ChildPassportApplicationDraft>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        byte[] draftData;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f47702p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f47702p = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f47700m;
        Object objE = uq.b.e();
        int i16 = aVar.f47702p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        ?? A0 = ((ChildPassportApplicationDraftDatabase) aVar3.a(a())).a0();
                        aVar.f47697j = jVarA;
                        aVar.f47698k = vq.j.a(aVar3);
                        aVar.f47699l = aVar3;
                        aVar.f47692d = 0;
                        aVar.f47693e = 0;
                        aVar.f47694f = 0;
                        aVar.f47695g = 0;
                        aVar.f47696h = 0;
                        aVar.f47702p = 1;
                        Object objE2 = A0.e(aVar);
                        if (objE2 == objE) {
                            return objE;
                        }
                        obj = objE2;
                        bVar = aVar3;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        aVar = jVarA;
                        e = e18;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        i iVarA = aVar.a(e);
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
                    bVar = (ex.b) aVar.f47699l;
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity = (ChildPassportApplicationDraftDataEntity) obj;
                ChildPassportApplicationDraft eVarP = null;
                if (childPassportApplicationDraftDataEntity != null && (draftData = childPassportApplicationDraftDataEntity.getDraftData()) != null) {
                    eVarP = b61.a.p((ChildPassportApplicationDraftDto) this.strictNonNullSerializer.a(new String((byte[]) bVar.a(iy.a.a(this.base64Coder, draftData, null, 2, null)), fu.d.UTF_8), q0.n(ChildPassportApplicationDraftDto.class)));
                }
                return new i.Right(eVarP);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // k61.b
    public Object f(ChildPassportApplicationDraft eVar, tq.e<? super i<? extends dx.b, byte[]>> eVar2) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    String strB = this.jsonSerializer.b(b61.a.Z(eVar), q0.n(ChildPassportApplicationDraftDto.class));
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

    @Override // k61.b
    public Object g(byte[] bArr, tq.e<? super i<? extends dx.b, ChildPassportApplicationDraft>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(b61.a.p((ChildPassportApplicationDraftDto) this.jsonSerializer.a(new String((byte[]) new ex.a().a(iy.a.a(this.base64Coder, bArr, null, 2, null)), fu.d.UTF_8), q0.n(ChildPassportApplicationDraftDto.class))));
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
    /* JADX WARN: Type inference failed for: r12v0, types: [i61.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dx.j, java.lang.Object] */
    @Override // k61.b
    public Object h(ChildPassportApplicationDraft eVar, tq.e<? super i<? extends dx.b, i0>> eVar2) throws Throwable {
        C1100c c1100c;
        Object objB;
        ex.c e15;
        if (eVar2 instanceof C1100c) {
            c1100c = (C1100c) eVar2;
            int i15 = c1100c.f47727s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1100c.f47727s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1100c = new C1100c(eVar2);
            }
        } else {
            c1100c = new C1100c(eVar2);
        }
        Object obj = c1100c.f47725q;
        Object objE = uq.b.e();
        int i16 = c1100c.f47727s;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        String strB = this.strictNonNullSerializer.b(b61.a.Z(eVar), q0.n(ChildPassportApplicationDraftDto.class));
                        iy.a aVar2 = this.base64Coder;
                        Charset charset = fu.d.UTF_8;
                        byte[] bytes = iy.a.e(aVar2, strB.getBytes(charset), null, 2, null).getBytes(charset);
                        z51.a aVarA0 = ((ChildPassportApplicationDraftDatabase) aVar.a(a())).a0();
                        ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity = new ChildPassportApplicationDraftDataEntity(0, bytes, 1, null);
                        c1100c.f47714d = vq.j.a(eVar);
                        c1100c.f47715e = jVarA;
                        c1100c.f47716f = vq.j.a(aVar);
                        c1100c.f47717g = vq.j.a(aVar);
                        c1100c.f47718h = vq.j.a(bytes);
                        c1100c.f47719j = vq.j.a(strB);
                        c1100c.f47720k = 0;
                        c1100c.f47721l = 0;
                        c1100c.f47722m = 0;
                        c1100c.f47723n = 0;
                        c1100c.f47724p = 0;
                        c1100c.f47727s = 1;
                        if (aVarA0.a(childPassportApplicationDraftDataEntity, c1100c) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        eVar = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(eVar));
                        i iVarA = eVar.a(e);
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
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
