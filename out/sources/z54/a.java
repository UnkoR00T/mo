package z54;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import r54.LocalDocumentNotification;
import r54.LocalVehicleNotification;
import vq.j;
import w54.k;
import y54.LocalDocumentNotificationEntity;
import y54.LocalVehicleNotificationEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130 H\u0096@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u0096@¢\u0006\u0004\b#\u0010\"J\u0018\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nH\u0096@¢\u0006\u0004\b'\u0010\"J\u0018\u0010(\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b(\u0010&J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b*\u0010\u0016J\u0018\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b.\u0010\u001fJ\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00130 H\u0096@¢\u0006\u0004\b/\u0010\"J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0096@¢\u0006\u0004\b0\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00102¨\u00063"}, d2 = {"Lz54/a;", "Le64/b;", "Lw54/a;", "documentsDao", "Lw54/k;", "vehiclesDao", "<init>", "(Lw54/a;Lw54/k;)V", "Lrq0/b;", "documentType", "Loq/i0;", "m", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Lr54/b;", "documentSubType", "i", "(Lr54/b;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "", "Lr54/a;", "a", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "localDocumentNotification", "n", "(Lr54/a;Ltq/e;)Ljava/lang/Object;", "", "reminderId", "Lr54/e;", "status", "c", "(Ljava/lang/String;Lr54/e;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "o", "(Ltq/e;)Ljava/lang/Object;", "d", "registerNo", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "k", "b", "Lr54/d;", "e", "localVehicleNotification", "j", "(Lr54/d;Ltq/e;)Ljava/lang/Object;", "g", "l", "f", "Lw54/a;", "Lw54/k;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e64.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w54.a documentsDao;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k vehiclesDao;

    /* JADX INFO: renamed from: z54.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C6267a implements g<List<? extends LocalDocumentNotification>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f233076a;

        /* JADX INFO: renamed from: z54.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6268a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f233077a;

            /* JADX INFO: renamed from: z54.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6269a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f233078d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f233079e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f233080f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f233082h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f233083j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f233084k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f233085l;

                public C6269a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f233078d = obj;
                    this.f233079e |= PKIFailureInfo.systemUnavail;
                    return C6268a.this.F(null, this);
                }
            }

            public C6268a(h hVar) {
                this.f233077a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6269a c6269a;
                if (eVar instanceof C6269a) {
                    c6269a = (C6269a) eVar;
                    int i15 = c6269a.f233079e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6269a.f233079e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6269a = new C6269a(eVar);
                    }
                } else {
                    c6269a = new C6269a(eVar);
                }
                Object obj2 = c6269a.f233078d;
                Object objE = uq.b.e();
                int i16 = c6269a.f233079e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f233077a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(x54.a.a((LocalDocumentNotificationEntity) it.next()));
                    }
                    c6269a.f233080f = j.a(obj);
                    c6269a.f233082h = j.a(c6269a);
                    c6269a.f233083j = j.a(obj);
                    c6269a.f233084k = j.a(hVar);
                    c6269a.f233085l = 0;
                    c6269a.f233079e = 1;
                    if (hVar.F(arrayList, c6269a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public C6267a(g gVar) {
            this.f233076a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super List<? extends LocalDocumentNotification>> hVar, tq.e eVar) {
            Object objA = this.f233076a.a(new C6268a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f233086d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f233088f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f233086d = obj;
            this.f233088f |= PKIFailureInfo.systemUnavail;
            return a.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements g<List<? extends LocalVehicleNotification>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f233089a;

        /* JADX INFO: renamed from: z54.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6270a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f233090a;

            /* JADX INFO: renamed from: z54.a$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6271a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f233091d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f233092e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f233093f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f233095h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f233096j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f233097k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f233098l;

                public C6271a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f233091d = obj;
                    this.f233092e |= PKIFailureInfo.systemUnavail;
                    return C6270a.this.F(null, this);
                }
            }

            public C6270a(h hVar) {
                this.f233090a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6271a c6271a;
                if (eVar instanceof C6271a) {
                    c6271a = (C6271a) eVar;
                    int i15 = c6271a.f233092e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6271a.f233092e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6271a = new C6271a(eVar);
                    }
                } else {
                    c6271a = new C6271a(eVar);
                }
                Object obj2 = c6271a.f233091d;
                Object objE = uq.b.e();
                int i16 = c6271a.f233092e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f233090a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(x54.a.b((LocalVehicleNotificationEntity) it.next()));
                    }
                    c6271a.f233093f = j.a(obj);
                    c6271a.f233095h = j.a(c6271a);
                    c6271a.f233096j = j.a(obj);
                    c6271a.f233097k = j.a(hVar);
                    c6271a.f233098l = 0;
                    c6271a.f233092e = 1;
                    if (hVar.F(arrayList, c6271a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(g gVar) {
            this.f233089a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super List<? extends LocalVehicleNotification>> hVar, tq.e eVar) {
            Object objA = this.f233089a.a(new C6270a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f233099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f233100e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f233102g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f233100e = obj;
            this.f233102g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f233103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f233104e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f233106g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f233104e = obj;
            this.f233106g |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    public a(w54.a aVar, k kVar) {
        this.documentsDao = aVar;
        this.vehiclesDao = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e64.b
    public Object a(LocalDate localDate, tq.e<? super List<LocalDocumentNotification>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f233102g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f233102g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objA = dVar.f233100e;
        Object objE = uq.b.e();
        int i16 = dVar.f233102g;
        if (i16 == 0) {
            u.b(objA);
            w54.a aVar = this.documentsDao;
            dVar.f233099d = j.a(localDate);
            dVar.f233102g = 1;
            objA = aVar.a(localDate, dVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(x54.a.a((LocalDocumentNotificationEntity) it.next()));
        }
        return arrayList;
    }

    @Override // e64.b
    public Object b(String str, tq.e<? super i0> eVar) {
        Object objB = this.vehiclesDao.b(str, eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    @Override // e64.b
    public Object c(String str, r54.e eVar, tq.e<? super i0> eVar2) {
        Object objC = this.documentsDao.c(str, eVar, eVar2);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    @Override // e64.b
    public Object d(tq.e<? super i0> eVar) {
        Object objD = this.documentsDao.d(eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e64.b
    public Object e(LocalDate localDate, tq.e<? super List<LocalVehicleNotification>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f233106g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f233106g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objE = eVar2.f233104e;
        Object objE2 = uq.b.e();
        int i16 = eVar2.f233106g;
        if (i16 == 0) {
            u.b(objE);
            k kVar = this.vehiclesDao;
            eVar2.f233103d = j.a(localDate);
            eVar2.f233106g = 1;
            objE = kVar.e(localDate, eVar2);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        Iterable iterable = (Iterable) objE;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(x54.a.b((LocalVehicleNotificationEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e64.b
    public Object f(tq.e<? super List<LocalVehicleNotification>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f233088f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f233088f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f233086d;
        Object objE = uq.b.e();
        int i16 = bVar.f233088f;
        if (i16 == 0) {
            u.b(objF);
            k kVar = this.vehiclesDao;
            bVar.f233088f = 1;
            objF = kVar.f(bVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objF);
        }
        Iterable iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(x54.a.b((LocalVehicleNotificationEntity) it.next()));
        }
        return arrayList;
    }

    @Override // e64.b
    public Object g(String str, r54.e eVar, tq.e<? super i0> eVar2) {
        Object objG = this.vehiclesDao.g(str, eVar, eVar2);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // e64.b
    public Object h(String str, tq.e<? super i0> eVar) {
        Object objD = this.vehiclesDao.d(str, eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // e64.b
    public Object i(r54.b bVar, tq.e<? super i0> eVar) {
        Object objE = this.documentsDao.e(bVar.toString(), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // e64.b
    public Object j(LocalVehicleNotification localVehicleNotification, tq.e<? super i0> eVar) {
        Object objA = this.vehiclesDao.a(x54.a.d(localVehicleNotification), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // e64.b
    public Object k(tq.e<? super i0> eVar) {
        Object objI = this.vehiclesDao.i(eVar);
        return objI == uq.b.e() ? objI : i0.f148189a;
    }

    @Override // e64.b
    public Object l(tq.e<? super g<? extends List<LocalVehicleNotification>>> eVar) {
        return new c(this.vehiclesDao.h());
    }

    @Override // e64.b
    public Object m(rq0.b bVar, tq.e<? super i0> eVar) {
        Object objJ = this.documentsDao.j(bVar.toString(), eVar);
        return objJ == uq.b.e() ? objJ : i0.f148189a;
    }

    @Override // e64.b
    public Object n(LocalDocumentNotification localDocumentNotification, tq.e<? super i0> eVar) {
        Object objF = this.documentsDao.f(x54.a.c(localDocumentNotification), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // e64.b
    public Object o(tq.e<? super g<? extends List<LocalDocumentNotification>>> eVar) {
        return new C6267a(this.documentsDao.b());
    }
}
