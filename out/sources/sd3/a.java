package sd3;

import ay.h;
import ay.j;
import dx.i;
import fr.q0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p10.e;
import pd3.CollisionDraftDataEntity;
import pl.gov.coi.common.network.deserializer.StrictNonNullAdapterFactory;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.CollisionDraftDatabase;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftDamageDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftDescriptionDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftPersonalDataDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftPhotoDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftStepDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehicleDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehicleOwnerDetailsDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehiclesPageDto;
import pq.v;
import pq.v0;
import px.f;
import sv0.ProcessId;
import tv0.BENewCollisionData;
import tv0.BEPersonalData;
import tv0.BESavedDraftCollision;
import tv0.BEVehicleCollisionDescriptionConception;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;
import tv0.Description;
import tv0.YourDetails;
import tv0.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001e0\u0010H\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b!\u0010\u001dJ,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b&\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(¨\u0006-"}, d2 = {"Lsd3/a;", "Lzd3/a;", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Lp10/e;", "dbProvider", "Lpx/d;", "remoteLogger", "Lq10/a;", "databaseRegistry", "Lay/h;", "jsonFactory", "<init>", "(Liy/a;Lay/j;Lp10/e;Lpx/d;Lq10/a;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/database/CollisionDraftDatabase;", "g", "()Ldx/i;", "Lsv0/y;", "processId", "Ltv0/g;", "savedDraftCollision", "Loq/i0;", "e", "(Lsv0/y;Ltv0/g;Ltq/e;)Ljava/lang/Object;", "c", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "d", "", "collisionDraftData", "a", "(Lsv0/y;[BLtq/e;)Ljava/lang/Object;", "f", "Liy/a;", "Lay/j;", "Lp10/e;", "Lpx/d;", "Lq10/a;", "strictNonNullSerializer", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements zd3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dbProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j strictNonNullSerializer;

    /* JADX INFO: renamed from: sd3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4651a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f180475h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f180476j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f180477k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f180478l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f180479m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f180481p;

        C4651a(tq.e<? super C4651a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180479m = obj;
            this.f180481p |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f180484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f180485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f180486h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f180487j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f180488k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f180489l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f180490m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f180491n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f180493q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180491n = obj;
            this.f180493q |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f180496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f180497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f180498h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f180499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f180500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f180501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f180502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f180503n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f180505q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180503n = obj;
            this.f180505q |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f180508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f180509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f180510h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f180511j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f180512k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f180513l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f180514m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f180515n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f180516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f180517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f180518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f180519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f180520t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f180521v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f180523x;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180521v = obj;
            this.f180523x |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, null, this);
        }
    }

    public a(iy.a aVar, j jVar, e eVar, px.d dVar, q10.a aVar2, h hVar) {
        this.base64Coder = aVar;
        this.jsonSerializer = jVar;
        this.dbProvider = eVar;
        this.remoteLogger = dVar;
        this.databaseRegistry = aVar2;
        this.strictNonNullSerializer = hVar.a(new StrictNonNullAdapterFactory());
    }

    private final i<dx.b, CollisionDraftDatabase> g() {
        e eVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        List<? extends ra.b> listN2 = v.n();
        CollisionDraftDatabase.Companion companion = CollisionDraftDatabase.INSTANCE;
        i<dx.b, CollisionDraftDatabase> iVarB = eVar.b(CollisionDraftDatabase.class, listN, listN2, companion.a());
        if (iVarB instanceof i.Right) {
            if (!this.databaseRegistry.d().contains(companion.a())) {
                this.databaseRegistry.c(companion.a());
                this.remoteLogger.F8("Database added to tracking register: " + companion.a(), px.d.a.GENERAL);
            }
        }
        return iVarB;
    }

    @Override // zd3.a
    public Object a(ProcessId processId, byte[] bArr, tq.e<? super i<? extends dx.b, BESavedDraftCollision>> eVar) {
        Object objB;
        BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    CollisionDraftDto collisionDraftDto = (CollisionDraftDto) this.jsonSerializer.a(new String((byte[]) new ex.a().a(iy.a.a(this.base64Coder, bArr, null, 2, null)), fu.d.UTF_8), q0.n(CollisionDraftDto.class));
                    CollisionDraftStepDto step = collisionDraftDto.getStep();
                    tv0.c cVarE = step != null ? qd3.a.e(step) : null;
                    i.Right right = new i.Right(processId);
                    CollisionDraftDescriptionDto description = collisionDraftDto.getDescription();
                    if (description == null || (bEVehicleCollisionDescriptionConception = qd3.a.j(description)) == null) {
                        bEVehicleCollisionDescriptionConception = new BEVehicleCollisionDescriptionConception(null, null, null, 7, null);
                    }
                    Description description2 = new Description(null, null, bEVehicleCollisionDescriptionConception, 3, null);
                    CollisionDraftDamageDto damage = collisionDraftDto.getDamage();
                    tv0.h hVarH = damage != null ? qd3.a.h(damage) : null;
                    Map<String, CollisionDraftVehiclesPageDto> vehiclesPages = collisionDraftDto.getVehiclesPages();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(vehiclesPages.size()));
                    for (Object obj : vehiclesPages.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), qd3.a.p((CollisionDraftVehiclesPageDto) ((Map.Entry) obj).getValue()));
                    }
                    BEVehiclesPages bEVehiclesPages = new BEVehiclesPages(linkedHashMap);
                    CollisionDraftVehicleDto selectedVehicle = collisionDraftDto.getSelectedVehicle();
                    BEVehicleDataWithType bEVehicleDataWithTypeM = selectedVehicle != null ? qd3.a.m(selectedVehicle) : null;
                    CollisionDraftVehicleOwnerDetailsDto selectedVehicleOwnerDetails = collisionDraftDto.getSelectedVehicleOwnerDetails();
                    l lVarO = selectedVehicleOwnerDetails != null ? qd3.a.o(selectedVehicleOwnerDetails) : null;
                    BEPersonalData bEPersonalDataG = qd3.a.g(collisionDraftDto.getPersonalDetails());
                    List<CollisionDraftPhotoDto> photos = collisionDraftDto.getPhotos();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = photos.iterator();
                    while (it.hasNext()) {
                        YourDetails.Photo photoD = qd3.a.d((CollisionDraftPhotoDto) it.next());
                        if (photoD != null) {
                            arrayList.add(photoD);
                        }
                    }
                    List<CollisionDraftVehicleDto> additionalVehicles = collisionDraftDto.getAdditionalVehicles();
                    ArrayList arrayList2 = new ArrayList(v.y(additionalVehicles, 10));
                    Iterator<T> it4 = additionalVehicles.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(qd3.a.m((CollisionDraftVehicleDto) it4.next()));
                    }
                    return new i.Right(new BESavedDraftCollision(cVarE, new BENewCollisionData(right, description2, new YourDetails(bEVehicleDataWithTypeM, lVarO, hVarH, bEPersonalDataG, arrayList2, arrayList, bEVehiclesPages, null, 128, null))));
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
    /* JADX WARN: Type inference failed for: r0v2, types: [sd3.a$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [od3.a] */
    @Override // zd3.a
    public Object b(tq.e<? super i<? extends dx.b, ? extends List<ProcessId>>> eVar) throws Throwable {
        ?? c4651a;
        Object objB;
        ex.c e15;
        if (eVar instanceof C4651a) {
            C4651a c4651a2 = (C4651a) eVar;
            int i15 = c4651a2.f180481p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4651a2.f180481p = i15 - PKIFailureInfo.systemUnavail;
                c4651a = c4651a2;
            } else {
                c4651a = new C4651a(eVar);
            }
        } else {
            c4651a = new C4651a(eVar);
        }
        Object obj = c4651a.f180479m;
        Object objE = uq.b.e();
        int i16 = c4651a.f180481p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? A0 = ((CollisionDraftDatabase) aVar.a(g())).a0();
                        c4651a.f180476j = jVarA;
                        c4651a.f180477k = vq.j.a(aVar);
                        c4651a.f180478l = vq.j.a(aVar);
                        c4651a.f180471d = 0;
                        c4651a.f180472e = 0;
                        c4651a.f180473f = 0;
                        c4651a.f180474g = 0;
                        c4651a.f180475h = 0;
                        c4651a.f180481p = 1;
                        Object objN = A0.n(c4651a);
                        if (objN == objE) {
                            return objE;
                        }
                        obj = objN;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        c4651a = jVarA;
                        e = e18;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c4651a));
                        i iVarA = c4651a.a(e);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ProcessId((String) it.next()));
                }
                return new i.Right(arrayList);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // zd3.a
    public Object c(ProcessId processId, tq.e<? super i<? extends dx.b, BESavedDraftCollision>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        ProcessId processId2;
        byte[] draftData;
        BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConceptionJ;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f180493q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f180493q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f180491n;
        Object objE = uq.b.e();
        ?? r15 = bVar.f180493q;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    od3.a aVarA0 = ((CollisionDraftDatabase) aVar.a(g())).a0();
                    String processId3 = processId.getProcessId();
                    bVar.f180482d = processId;
                    bVar.f180483e = jVarA;
                    bVar.f180484f = vq.j.a(aVar);
                    bVar.f180485g = aVar;
                    bVar.f180486h = 0;
                    bVar.f180487j = 0;
                    bVar.f180488k = 0;
                    bVar.f180489l = 0;
                    bVar.f180490m = 0;
                    bVar.f180493q = 1;
                    Object objM = aVarA0.m(processId3, bVar);
                    if (objM == objE) {
                        return objE;
                    }
                    bVar2 = aVar;
                    obj = objM;
                    processId2 = processId;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f180485g;
                    processId2 = (ProcessId) bVar.f180482d;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                CollisionDraftDataEntity collisionDraftDataEntity = (CollisionDraftDataEntity) obj;
                if (collisionDraftDataEntity == null || (draftData = collisionDraftDataEntity.getDraftData()) == null) {
                    bVar2.b(new dx.b.Generic(new NoSuchElementException("No collision draft data with id " + processId2 + " found in database")));
                    throw new g();
                }
                CollisionDraftDto collisionDraftDto = (CollisionDraftDto) this.strictNonNullSerializer.a(new String((byte[]) bVar2.a(iy.a.a(this.base64Coder, draftData, null, 2, null)), fu.d.UTF_8), q0.n(CollisionDraftDto.class));
                CollisionDraftStepDto step = collisionDraftDto.getStep();
                tv0.c cVarE = step != null ? qd3.a.e(step) : null;
                i.Right right = new i.Right(processId2);
                CollisionDraftDescriptionDto description = collisionDraftDto.getDescription();
                Description description2 = new Description(null, null, (description == null || (bEVehicleCollisionDescriptionConceptionJ = qd3.a.j(description)) == null) ? new BEVehicleCollisionDescriptionConception(null, null, null, 7, null) : bEVehicleCollisionDescriptionConceptionJ, 3, null);
                CollisionDraftDamageDto damage = collisionDraftDto.getDamage();
                tv0.h hVarH = damage != null ? qd3.a.h(damage) : null;
                Map<String, CollisionDraftVehiclesPageDto> vehiclesPages = collisionDraftDto.getVehiclesPages();
                LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(vehiclesPages.size()));
                for (Object obj2 : vehiclesPages.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj2).getKey(), qd3.a.p((CollisionDraftVehiclesPageDto) ((Map.Entry) obj2).getValue()));
                }
                BEVehiclesPages bEVehiclesPages = new BEVehiclesPages(linkedHashMap);
                CollisionDraftVehicleDto selectedVehicle = collisionDraftDto.getSelectedVehicle();
                BEVehicleDataWithType bEVehicleDataWithTypeM = selectedVehicle != null ? qd3.a.m(selectedVehicle) : null;
                CollisionDraftVehicleOwnerDetailsDto selectedVehicleOwnerDetails = collisionDraftDto.getSelectedVehicleOwnerDetails();
                l lVarO = selectedVehicleOwnerDetails != null ? qd3.a.o(selectedVehicleOwnerDetails) : null;
                BEPersonalData bEPersonalDataG = qd3.a.g(collisionDraftDto.getPersonalDetails());
                List<CollisionDraftPhotoDto> photos = collisionDraftDto.getPhotos();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = photos.iterator();
                while (it.hasNext()) {
                    YourDetails.Photo photoD = qd3.a.d((CollisionDraftPhotoDto) it.next());
                    if (photoD != null) {
                        arrayList.add(photoD);
                    }
                }
                List<CollisionDraftVehicleDto> additionalVehicles = collisionDraftDto.getAdditionalVehicles();
                ArrayList arrayList2 = new ArrayList(v.y(additionalVehicles, 10));
                Iterator<T> it4 = additionalVehicles.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(qd3.a.m((CollisionDraftVehicleDto) it4.next()));
                }
                return new i.Right(new BESavedDraftCollision(cVarE, new BENewCollisionData(right, description2, new YourDetails(bEVehicleDataWithTypeM, lVarO, hVarH, bEPersonalDataG, arrayList2, arrayList, bEVehiclesPages, null, 128, null))));
            } catch (Exception e16) {
                f fVar = f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                i iVarA = r15.a(e16);
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
        } catch (ex.c e17) {
            return new i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, sv0.y] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // zd3.a
    public Object d(ProcessId processId, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f180505q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f180505q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f180503n;
        Object objE = uq.b.e();
        int i16 = cVar.f180505q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        od3.a aVarA0 = ((CollisionDraftDatabase) aVar.a(g())).a0();
                        String processId2 = processId.getProcessId();
                        cVar.f180494d = vq.j.a(processId);
                        cVar.f180495e = jVarA;
                        cVar.f180496f = vq.j.a(aVar);
                        cVar.f180497g = vq.j.a(aVar);
                        cVar.f180498h = 0;
                        cVar.f180499j = 0;
                        cVar.f180500k = 0;
                        cVar.f180501l = 0;
                        cVar.f180502m = 0;
                        cVar.f180505q = 1;
                        if (aVarA0.o(processId2, cVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        processId = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(processId));
                        i iVarA = processId.a(e);
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
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // zd3.a
    public Object e(ProcessId processId, BESavedDraftCollision bESavedDraftCollision, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        d dVar;
        Object objB;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f180523x;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f180523x = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f180521v;
        ?? E = uq.b.e();
        int i16 = dVar.f180523x;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        YourDetails yourDetails = bESavedDraftCollision.getNewCollisionData().getYourDetails();
                        Description chapterDescription = bESavedDraftCollision.getNewCollisionData().getChapterDescription();
                        String processId2 = processId.getProcessId();
                        tv0.c collisionStep = bESavedDraftCollision.getCollisionStep();
                        CollisionDraftStepDto collisionDraftStepDtoA = collisionStep != null ? qd3.a.A(collisionStep) : null;
                        List<BEVehicleDataWithType> listC = yourDetails.c();
                        ArrayList arrayList = new ArrayList(v.y(listC, 10));
                        Iterator it = listC.iterator();
                        while (it.hasNext()) {
                            arrayList.add(qd3.a.C((BEVehicleDataWithType) it.next()));
                        }
                        Map<String, BEVehiclesPages.BEVehiclesPageWithTypes> mapC = yourDetails.getVehiclesPages().c();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapC.size()));
                        for (Object obj2 : mapC.entrySet()) {
                            linkedHashMap.put(((Map.Entry) obj2).getKey(), qd3.a.E((BEVehiclesPages.BEVehiclesPageWithTypes) ((Map.Entry) obj2).getValue()));
                        }
                        tv0.h selectedDamage = yourDetails.getSelectedDamage();
                        CollisionDraftDamageDto collisionDraftDamageDtoS = selectedDamage != null ? qd3.a.s(selectedDamage) : null;
                        List<YourDetails.Photo> listI = yourDetails.i();
                        ArrayList arrayList2 = new ArrayList(v.y(listI, 10));
                        Iterator it4 = listI.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(qd3.a.x((YourDetails.Photo) it4.next()));
                        }
                        CollisionDraftPersonalDataDto collisionDraftPersonalDataDtoV = qd3.a.v(yourDetails.getPersonalData());
                        BEVehicleDataWithType selectedVehicle = yourDetails.getSelectedVehicle();
                        CollisionDraftVehicleDto collisionDraftVehicleDtoC = selectedVehicle != null ? qd3.a.C(selectedVehicle) : null;
                        l selectedVehicleOwnerDetails = yourDetails.getSelectedVehicleOwnerDetails();
                        CollisionDraftDto collisionDraftDto = new CollisionDraftDto(processId2, collisionDraftStepDtoA, collisionDraftDamageDtoS, linkedHashMap, collisionDraftVehicleDtoC, selectedVehicleOwnerDetails != null ? qd3.a.D(selectedVehicleOwnerDetails) : null, arrayList2, collisionDraftPersonalDataDtoV, arrayList, null, qd3.a.t(chapterDescription.getDescription()), 512, null);
                        String strB = this.strictNonNullSerializer.b(collisionDraftDto, q0.n(CollisionDraftDto.class));
                        iy.a aVar2 = this.base64Coder;
                        Charset charset = fu.d.UTF_8;
                        byte[] bytes = iy.a.e(aVar2, strB.getBytes(charset), null, 2, null).getBytes(charset);
                        od3.a aVarA0 = ((CollisionDraftDatabase) aVar.a(g())).a0();
                        CollisionDraftDataEntity collisionDraftDataEntity = new CollisionDraftDataEntity(processId.getProcessId(), bytes);
                        dVar.f180506d = vq.j.a(processId);
                        dVar.f180507e = vq.j.a(bESavedDraftCollision);
                        dVar.f180508f = jVarA;
                        dVar.f180509g = vq.j.a(aVar);
                        dVar.f180510h = vq.j.a(aVar);
                        dVar.f180511j = vq.j.a(yourDetails);
                        dVar.f180512k = vq.j.a(chapterDescription);
                        dVar.f180513l = vq.j.a(strB);
                        dVar.f180514m = vq.j.a(bytes);
                        dVar.f180515n = vq.j.a(collisionDraftDto);
                        dVar.f180516p = 0;
                        dVar.f180517q = 0;
                        dVar.f180518r = 0;
                        dVar.f180519s = 0;
                        dVar.f180520t = 0;
                        dVar.f180523x = 1;
                        if (aVarA0.p(collisionDraftDataEntity, dVar) == E) {
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
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    @Override // zd3.a
    public Object f(ProcessId processId, BESavedDraftCollision bESavedDraftCollision, tq.e<? super i<? extends dx.b, byte[]>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    YourDetails yourDetails = bESavedDraftCollision.getNewCollisionData().getYourDetails();
                    Description chapterDescription = bESavedDraftCollision.getNewCollisionData().getChapterDescription();
                    String processId2 = processId.getProcessId();
                    tv0.c collisionStep = bESavedDraftCollision.getCollisionStep();
                    CollisionDraftStepDto collisionDraftStepDtoA = collisionStep != null ? qd3.a.A(collisionStep) : null;
                    List<BEVehicleDataWithType> listC = yourDetails.c();
                    ArrayList arrayList = new ArrayList(v.y(listC, 10));
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(qd3.a.C((BEVehicleDataWithType) it.next()));
                    }
                    Map<String, BEVehiclesPages.BEVehiclesPageWithTypes> mapC = yourDetails.getVehiclesPages().c();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapC.size()));
                    for (Object obj : mapC.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), qd3.a.E((BEVehiclesPages.BEVehiclesPageWithTypes) ((Map.Entry) obj).getValue()));
                    }
                    tv0.h selectedDamage = yourDetails.getSelectedDamage();
                    CollisionDraftDamageDto collisionDraftDamageDtoS = selectedDamage != null ? qd3.a.s(selectedDamage) : null;
                    List<YourDetails.Photo> listI = yourDetails.i();
                    ArrayList arrayList2 = new ArrayList(v.y(listI, 10));
                    Iterator<T> it4 = listI.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(qd3.a.x((YourDetails.Photo) it4.next()));
                    }
                    CollisionDraftPersonalDataDto collisionDraftPersonalDataDtoV = qd3.a.v(yourDetails.getPersonalData());
                    BEVehicleDataWithType selectedVehicle = yourDetails.getSelectedVehicle();
                    CollisionDraftVehicleDto collisionDraftVehicleDtoC = selectedVehicle != null ? qd3.a.C(selectedVehicle) : null;
                    l selectedVehicleOwnerDetails = yourDetails.getSelectedVehicleOwnerDetails();
                    String strB = this.jsonSerializer.b(new CollisionDraftDto(processId2, collisionDraftStepDtoA, collisionDraftDamageDtoS, linkedHashMap, collisionDraftVehicleDtoC, selectedVehicleOwnerDetails != null ? qd3.a.D(selectedVehicleOwnerDetails) : null, arrayList2, collisionDraftPersonalDataDtoV, arrayList, null, qd3.a.t(chapterDescription.getDescription()), 512, null), q0.n(CollisionDraftDto.class));
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
}
