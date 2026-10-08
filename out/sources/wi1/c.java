package wi1;

import dx.j;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import zp0.AvailableDefenceTrainings;
import zp0.BEGroupedAvailableDefenceTrainingsResponse;
import zp0.BEUnitDefenceTrainingsByType;
import zp0.DefenceTraining;
import zp0.DefenceTrainingDay;
import zp0.UserDefenceTrainingsRegistration;
import zp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwi1/c;", "", "Lgz/b$a$a;", "Lvi1/c;", "Laq0/a;", "beAvailableDefenceTrainings", "Laq0/d;", "beGetUserDefenceTrainingsRegistrations", "<init>", "(Laq0/a;Laq0/d;)V", "Ldx/i;", "Ldx/b;", "", "Lzp0/s;", "e", "(Ltq/e;)Ljava/lang/Object;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Laq0/a;", "getBeAvailableDefenceTrainings", "()Laq0/a;", "b", "Laq0/d;", "getBeGetUserDefenceTrainingsRegistrations", "()Laq0/d;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aq0.a beAvailableDefenceTrainings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final aq0.d beGetUserDefenceTrainingsRegistrations;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f213619d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213621f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213619d = obj;
            this.f213621f |= PKIFailureInfo.systemUnavail;
            return c.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            List<DefenceTrainingDay> listA;
            DefenceTrainingDay defenceTrainingDay;
            fz.b.OffsetDateTime startDate;
            List<DefenceTrainingDay> listA2;
            DefenceTrainingDay defenceTrainingDay2;
            fz.b.OffsetDateTime startDate2;
            DefenceTraining defenceTraining = (DefenceTraining) v.n0(((AvailableDefenceTrainings) t15).a());
            OffsetDateTime date = null;
            OffsetDateTime date2 = (defenceTraining == null || (listA2 = defenceTraining.a()) == null || (defenceTrainingDay2 = (DefenceTrainingDay) v.n0(listA2)) == null || (startDate2 = defenceTrainingDay2.getStartDate()) == null) ? null : startDate2.getDate();
            DefenceTraining defenceTraining2 = (DefenceTraining) v.n0(((AvailableDefenceTrainings) t16).a());
            if (defenceTraining2 != null && (listA = defenceTraining2.a()) != null && (defenceTrainingDay = (DefenceTrainingDay) v.n0(listA)) != null && (startDate = defenceTrainingDay.getStartDate()) != null) {
                date = startDate.getDate();
            }
            return sq.a.e(date2, date);
        }
    }

    /* JADX INFO: renamed from: wi1.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C5647c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f213622a;

        public C5647c(Comparator comparator) {
            this.f213622a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            int iCompare = this.f213622a.compare(t15, t16);
            return iCompare != 0 ? iCompare : sq.a.e(((AvailableDefenceTrainings) t15).getUnit().getName(), ((AvailableDefenceTrainings) t16).getUnit().getName());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213626g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213627h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213628j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213629k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213630l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213631m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213632n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213633p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213634q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f213635r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f213637t;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213635r = obj;
            this.f213637t |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    public c(aq0.a aVar, aq0.d dVar) {
        this.beAvailableDefenceTrainings = aVar;
        this.beGetUserDefenceTrainingsRegistrations = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tq.e<? super dx.i<? extends dx.b, ? extends List<BEUnitDefenceTrainingsByType>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f213621f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f213621f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f213619d;
        Object objE = uq.b.e();
        int i16 = aVar.f213621f;
        if (i16 == 0) {
            u.b(objC);
            aq0.a aVar2 = this.beAvailableDefenceTrainings;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f213621f = 1;
            objC = aVar2.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        List<BEUnitDefenceTrainingsByType> listA = ((BEGroupedAvailableDefenceTrainingsResponse) ((dx.i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType : listA) {
            arrayList.add(BEUnitDefenceTrainingsByType.b(bEUnitDefenceTrainingsByType, null, v.U0(bEUnitDefenceTrainingsByType.d(), new C5647c(new b())), 1, null));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0134 A[Catch: Exception -> 0x004d, c -> 0x0050, CancellationException -> 0x0053, TryCatch #0 {Exception -> 0x004d, blocks: (B:13:0x0048, B:43:0x011a, B:45:0x012a, B:47:0x0134, B:50:0x0145, B:49:0x013c, B:51:0x014b, B:52:0x0150, B:53:0x0151, B:56:0x0160, B:37:0x00d7, B:39:0x00e9, B:44:0x0124, B:33:0x00a0), top: B:71:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c A[Catch: Exception -> 0x004d, c -> 0x0050, CancellationException -> 0x0053, TryCatch #0 {Exception -> 0x004d, blocks: (B:13:0x0048, B:43:0x011a, B:45:0x012a, B:47:0x0134, B:50:0x0145, B:49:0x013c, B:51:0x014b, B:52:0x0150, B:53:0x0151, B:56:0x0160, B:37:0x00d7, B:39:0x00e9, B:44:0x0124, B:33:0x00a0), top: B:71:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x014b A[Catch: Exception -> 0x004d, c -> 0x0050, CancellationException -> 0x0053, TryCatch #0 {Exception -> 0x004d, blocks: (B:13:0x0048, B:43:0x011a, B:45:0x012a, B:47:0x0134, B:50:0x0145, B:49:0x013c, B:51:0x014b, B:52:0x0150, B:53:0x0151, B:56:0x0160, B:37:0x00d7, B:39:0x00e9, B:44:0x0124, B:33:0x00a0), top: B:71:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends vi1.c>> eVar) throws Throwable {
        d dVar;
        Object objB;
        int i15;
        gz.b.a.C1792a c1792a2;
        int i16;
        j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar;
        int i17;
        int i18;
        int i19;
        y yVar;
        UserDefenceTrainingsRegistration userDefenceTrainingsRegistration;
        ex.b bVar3;
        y registrationDisabledReason;
        List listN;
        boolean zIsEmpty;
        Object registrations;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i25 = dVar.f213637t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f213637t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f213635r;
        Object objE = uq.b.e();
        int i26 = dVar.f213637t;
        try {
            try {
                if (i26 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    aq0.d dVar2 = this.beGetUserDefenceTrainingsRegistrations;
                    gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                    dVar.f213623d = vq.j.a(c1792a);
                    dVar.f213624e = jVarA;
                    dVar.f213625f = vq.j.a(aVar);
                    dVar.f213626g = aVar;
                    dVar.f213627h = aVar;
                    i16 = 0;
                    dVar.f213630l = 0;
                    dVar.f213631m = 0;
                    dVar.f213632n = 0;
                    dVar.f213633p = 0;
                    dVar.f213634q = 0;
                    dVar.f213637t = 1;
                    objC = dVar2.c(c1792a3, dVar);
                    if (objC != objE) {
                        c1792a2 = c1792a;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        i17 = 0;
                        bVar2 = aVar;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (i26 == 1) {
                        i15 = dVar.f213634q;
                        int i27 = dVar.f213633p;
                        int i28 = dVar.f213632n;
                        int i29 = dVar.f213631m;
                        int i35 = dVar.f213630l;
                        ex.b bVar4 = (ex.b) dVar.f213627h;
                        ex.b bVar5 = (ex.b) dVar.f213626g;
                        ex.b bVar6 = (ex.b) dVar.f213625f;
                        j<dx.b> jVar = (j) dVar.f213624e;
                        c1792a2 = (gz.b.a.C1792a) dVar.f213623d;
                        try {
                            u.b(objC);
                            i16 = i27;
                            jVarA = jVar;
                            bVar = bVar6;
                            bVar2 = bVar4;
                            aVar = bVar5;
                            i17 = i35;
                            i18 = i29;
                            i19 = i28;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(jVar));
                            dx.i iVarA = jVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yVar = (y) dVar.f213629k;
                        userDefenceTrainingsRegistration = (UserDefenceTrainingsRegistration) dVar.f213628j;
                        bVar3 = (ex.b) dVar.f213627h;
                        u.b(objC);
                    }
                    listN = (List) bVar3.a((dx.i) objC);
                    registrationDisabledReason = yVar;
                    zIsEmpty = userDefenceTrainingsRegistration.c().isEmpty();
                    if (zIsEmpty) {
                        registrations = new vi1.c.Empty(listN, registrationDisabledReason);
                    } else {
                        if (!zIsEmpty) {
                            throw new p();
                        }
                        registrations = new vi1.c.Registrations(userDefenceTrainingsRegistration.c(), listN, registrationDisabledReason);
                    }
                    return new dx.i.Right(registrations);
                } catch (CancellationException e18) {
                    throw e18;
                }
                UserDefenceTrainingsRegistration userDefenceTrainingsRegistration2 = (UserDefenceTrainingsRegistration) bVar2.a((dx.i) objC);
                registrationDisabledReason = userDefenceTrainingsRegistration2.getRegistrationDisabledReason();
                if (userDefenceTrainingsRegistration2.getRegistrationAvailable()) {
                    dVar.f213623d = vq.j.a(c1792a2);
                    dVar.f213624e = jVarA;
                    dVar.f213625f = vq.j.a(bVar);
                    dVar.f213626g = vq.j.a(aVar);
                    dVar.f213627h = aVar;
                    dVar.f213628j = userDefenceTrainingsRegistration2;
                    dVar.f213629k = registrationDisabledReason;
                    dVar.f213630l = i17;
                    dVar.f213631m = i18;
                    dVar.f213632n = i19;
                    dVar.f213633p = i16;
                    dVar.f213634q = i15;
                    dVar.f213637t = 2;
                    Object objE2 = e(dVar);
                    if (objE2 != objE) {
                        userDefenceTrainingsRegistration = userDefenceTrainingsRegistration2;
                        objC = objE2;
                        bVar3 = aVar;
                        yVar = registrationDisabledReason;
                        listN = (List) bVar3.a((dx.i) objC);
                        registrationDisabledReason = yVar;
                    }
                    return objE;
                }
                userDefenceTrainingsRegistration = userDefenceTrainingsRegistration2;
                listN = v.n();
                zIsEmpty = userDefenceTrainingsRegistration.c().isEmpty();
                if (zIsEmpty) {
                    registrations = new vi1.c.Empty(listN, registrationDisabledReason);
                } else {
                    if (!zIsEmpty) {
                        throw new p();
                    }
                    registrations = new vi1.c.Registrations(userDefenceTrainingsRegistration.c(), listN, registrationDisabledReason);
                }
                return new dx.i.Right(registrations);
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
