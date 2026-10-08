package ae3;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.s0;
import tv0.BESavedDraftCollision;
import tv0.BEVehicleCollisionDescriptionConception;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\r\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\r\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lae3/m;", "", "Lae3/m$a;", "Lyd3/f;", "Lae3/i;", "getSavedCollisionDataUC", "Law0/d;", "getReadyToSignStatementDataUC", "Lae3/f;", "getDescriptionUC", "<init>", "(Lae3/i;Law0/d;Lae3/f;)V", "Lsv0/g;", "collision", "Ltv0/g;", "d", "(Lsv0/g;Ltq/e;)Ljava/lang/Object;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lae3/m$a;Ltq/e;)Ljava/lang/Object;", "Lsv0/g$a;", "f", "(Lsv0/g$a;Ltq/e;)Ljava/lang/Object;", "Lsv0/g$b;", "g", "(Lsv0/g$b;Ltq/e;)Ljava/lang/Object;", "a", "Lae3/i;", "b", "Law0/d;", "c", "Lae3/f;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i getSavedCollisionDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final aw0.d getReadyToSignStatementDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f getDescriptionUC;

    /* JADX INFO: renamed from: ae3.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/m$a;", "Lgz/b$a;", "Lsv0/g;", "collision", "<init>", "(Lsv0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/g;", "()Lsv0/g;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sv0.g collision;

        public Params(sv0.g gVar) {
            this.collision = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final sv0.g getCollision() {
            return this.collision;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.collision, ((Params) other).collision);
        }

        public int hashCode() {
            return this.collision.hashCode();
        }

        public String toString() {
            return "Params(collision=" + this.collision + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5835a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.ReadyToSignRejectedByMe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.InitialInfoConfirmed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.ReadyToSignRejectedByOther.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.StatementFilledByMe.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.ReadyToSign.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s0.ReadyToSignConfirmedByMe.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s0.ReadyToSignConfirmed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s0.Created.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s0.InitialInfoRejected.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s0.StatementCreatingError.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s0.Initialized.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s0.InitialInfoConfirmedByMe.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s0.StatementCreated.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[s0.StatementCreatedNotReported.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[s0.ReportedToUfg.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[s0.ReportedToUfgFormFilled.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[s0.ReportedToUfgToFillForm.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[s0.Unknown.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f5835a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5840h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5841j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5842k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5843l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5844m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5845n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5846p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f5847q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5849s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5847q = obj;
            this.f5849s |= PKIFailureInfo.systemUnavail;
            return m.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5854h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5858m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5859n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5860p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f5861q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5863s;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5861q = obj;
            this.f5863s |= PKIFailureInfo.systemUnavail;
            return m.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5868h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5869j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5870k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5871l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5872m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5873n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5874p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5875q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5876r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5877s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5878t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f5880w;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5878t = obj;
            this.f5880w |= PKIFailureInfo.systemUnavail;
            return m.this.g(null, this);
        }
    }

    public m(i iVar, aw0.d dVar, f fVar) {
        this.getSavedCollisionDataUC = iVar;
        this.getReadyToSignStatementDataUC = dVar;
        this.getDescriptionUC = fVar;
    }

    private final Object d(sv0.g gVar, tq.e<? super BESavedDraftCollision> eVar) {
        return this.getSavedCollisionDataUC.d(new i.Params(gVar.getProcessId()), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ae3.m] */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, ? extends yd3.f>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        yd3.f fVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f5849s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f5849s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f5847q;
        ?? E = uq.b.e();
        int i16 = cVar.f5849s;
        try {
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            sv0.g collision = params.getCollision();
                            if (collision instanceof sv0.g.Grouped) {
                                cVar.f5836d = vq.j.a(params);
                                cVar.f5837e = jVarA;
                                cVar.f5838f = vq.j.a(aVar);
                                cVar.f5839g = vq.j.a(aVar);
                                cVar.f5840h = vq.j.a(collision);
                                cVar.f5841j = aVar;
                                cVar.f5842k = 0;
                                cVar.f5843l = 0;
                                cVar.f5844m = 0;
                                cVar.f5845n = 0;
                                cVar.f5846p = 0;
                                cVar.f5849s = 1;
                                Object objF = f((sv0.g.Grouped) collision, cVar);
                                if (objF != E) {
                                    obj = objF;
                                    bVar2 = aVar;
                                    fVar = (yd3.f) bVar2.a((dx.i) obj);
                                }
                            } else {
                                if (!(collision instanceof sv0.g.Started)) {
                                    throw new oq.p();
                                }
                                cVar.f5836d = vq.j.a(params);
                                cVar.f5837e = jVarA;
                                cVar.f5838f = vq.j.a(aVar);
                                cVar.f5839g = vq.j.a(aVar);
                                cVar.f5840h = vq.j.a(collision);
                                cVar.f5841j = aVar;
                                cVar.f5842k = 0;
                                cVar.f5843l = 0;
                                cVar.f5844m = 0;
                                cVar.f5845n = 0;
                                cVar.f5846p = 0;
                                cVar.f5849s = 2;
                                Object objG = g((sv0.g.Started) collision, cVar);
                                if (objG != E) {
                                    obj = objG;
                                    bVar = aVar;
                                    fVar = (yd3.f) bVar.a((dx.i) obj);
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar2 = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar2 = (ex.b) cVar.f5841j;
                        oq.u.b(obj);
                        fVar = (yd3.f) bVar2.a((dx.i) obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) cVar.f5841j;
                        oq.u.b(obj);
                        fVar = (yd3.f) bVar.a((dx.i) obj);
                    }
                    return new dx.i.Right(fVar);
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0282  */
    /* JADX WARN: Code duplicated, block: B:104:0x0293  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [ae3.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    public final Object f(sv0.g.Grouped grouped, tq.e<? super dx.i<? extends dx.b, ? extends yd3.f>> eVar) throws Throwable {
        d dVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        int i15;
        Object readyToSignRejectedByOther;
        dx.j<dx.b> jVar;
        sv0.g.Grouped grouped2;
        ex.b bVar;
        int i16;
        int i17;
        int i18;
        int i19;
        BESavedDraftCollision bESavedDraftCollision;
        Object objC;
        BESavedDraftCollision bESavedDraftCollision2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i25 = dVar.f5863s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f5863s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f5861q;
        ?? E = uq.b.e();
        ?? r15 = dVar.f5863s;
        try {
            try {
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(obj);
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                aVar = new ex.a();
                                i15 = 0;
                                switch (b.f5835a[grouped.getCollisionStatus().ordinal()]) {
                                    case 1:
                                    case 2:
                                        dVar.f5850d = vq.j.a(grouped);
                                        dVar.f5851e = jVarA;
                                        dVar.f5852f = vq.j.a(aVar);
                                        dVar.f5853g = vq.j.a(aVar);
                                        dVar.f5856k = 0;
                                        dVar.f5857l = 0;
                                        dVar.f5858m = 0;
                                        dVar.f5859n = 0;
                                        dVar.f5860p = 0;
                                        dVar.f5863s = 1;
                                        Object objD = d(grouped, dVar);
                                        if (objD != E) {
                                            obj = objD;
                                            readyToSignRejectedByOther = new yd3.f.InitialInfoConfirmed((BESavedDraftCollision) obj);
                                            break;
                                        }
                                        return E;
                                    case 3:
                                        readyToSignRejectedByOther = new yd3.f.ReadyToSignRejectedByOther(grouped.getProcessId());
                                        break;
                                    case 4:
                                        dVar.f5850d = vq.j.a(grouped);
                                        dVar.f5851e = jVarA;
                                        dVar.f5852f = vq.j.a(aVar);
                                        dVar.f5853g = vq.j.a(aVar);
                                        dVar.f5856k = 0;
                                        dVar.f5857l = 0;
                                        dVar.f5858m = 0;
                                        dVar.f5859n = 0;
                                        dVar.f5860p = 0;
                                        dVar.f5863s = 2;
                                        Object objD2 = d(grouped, dVar);
                                        if (objD2 != E) {
                                            obj = objD2;
                                            readyToSignRejectedByOther = new yd3.f.StatementFilledByMe((BESavedDraftCollision) obj);
                                            break;
                                        }
                                        return E;
                                    case 5:
                                        dVar.f5850d = grouped;
                                        dVar.f5851e = jVarA;
                                        dVar.f5852f = vq.j.a(aVar);
                                        dVar.f5853g = aVar;
                                        dVar.f5856k = 0;
                                        dVar.f5857l = 0;
                                        dVar.f5858m = 0;
                                        dVar.f5859n = 0;
                                        dVar.f5860p = 0;
                                        dVar.f5863s = 3;
                                        Object objD3 = d(grouped, dVar);
                                        if (objD3 != E) {
                                            jVar = jVarA;
                                            obj = objD3;
                                            grouped2 = grouped;
                                            bVar = aVar;
                                            i16 = 0;
                                            i17 = 0;
                                            i18 = 0;
                                            i19 = 0;
                                            bESavedDraftCollision = (BESavedDraftCollision) obj;
                                            aw0.d dVar2 = this.getReadyToSignStatementDataUC;
                                            aw0.d.Params params = new aw0.d.Params(grouped2.getProcessId());
                                            dVar.f5850d = vq.j.a(grouped2);
                                            dVar.f5851e = jVar;
                                            dVar.f5852f = vq.j.a(aVar);
                                            dVar.f5853g = vq.j.a(bVar);
                                            dVar.f5854h = bESavedDraftCollision;
                                            dVar.f5855j = bVar;
                                            dVar.f5856k = i19;
                                            dVar.f5857l = i18;
                                            dVar.f5858m = i17;
                                            dVar.f5859n = i16;
                                            dVar.f5860p = i15;
                                            dVar.f5863s = 4;
                                            objC = dVar2.c(params, dVar);
                                            if (objC != E) {
                                                bESavedDraftCollision2 = bESavedDraftCollision;
                                                obj = objC;
                                                r15 = jVar;
                                                readyToSignRejectedByOther = new yd3.f.ReadyToSign(bESavedDraftCollision2, (sv0.c0) bVar.a((dx.i) obj));
                                                break;
                                            }
                                        }
                                        return E;
                                    case 6:
                                        dVar.f5850d = vq.j.a(grouped);
                                        dVar.f5851e = jVarA;
                                        dVar.f5852f = vq.j.a(aVar);
                                        dVar.f5853g = vq.j.a(aVar);
                                        dVar.f5856k = 0;
                                        dVar.f5857l = 0;
                                        dVar.f5858m = 0;
                                        dVar.f5859n = 0;
                                        dVar.f5860p = 0;
                                        dVar.f5863s = 5;
                                        Object objD4 = d(grouped, dVar);
                                        if (objD4 != E) {
                                            obj = objD4;
                                            readyToSignRejectedByOther = new yd3.f.ReadyToSignConfirmedByMe((BESavedDraftCollision) obj);
                                            break;
                                        }
                                        return E;
                                    case 7:
                                        readyToSignRejectedByOther = new yd3.f.ReadyToSignConfirmed(grouped.getProcessId());
                                        break;
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                        aVar.b(new dx.b.Generic(new IllegalStateException("Recovering collision for status " + grouped.getCollisionStatus() + " is not supported")));
                                        throw new oq.g();
                                    default:
                                        throw new oq.p();
                                }
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else if (r15 == 1) {
                            oq.u.b(obj);
                            readyToSignRejectedByOther = new yd3.f.InitialInfoConfirmed((BESavedDraftCollision) obj);
                        } else if (r15 != 2) {
                            if (r15 == 3) {
                                int i26 = dVar.f5860p;
                                int i27 = dVar.f5859n;
                                int i28 = dVar.f5858m;
                                int i29 = dVar.f5857l;
                                int i35 = dVar.f5856k;
                                ex.b bVar2 = (ex.b) dVar.f5853g;
                                aVar = (ex.b) dVar.f5852f;
                                dx.j<dx.b> jVar2 = (dx.j) dVar.f5851e;
                                grouped2 = (sv0.g.Grouped) dVar.f5850d;
                                try {
                                    oq.u.b(obj);
                                    i15 = i26;
                                    bVar = bVar2;
                                    i19 = i35;
                                    i18 = i29;
                                    i17 = i28;
                                    i16 = i27;
                                    jVar = jVar2;
                                    bESavedDraftCollision = (BESavedDraftCollision) obj;
                                    aw0.d dVar3 = this.getReadyToSignStatementDataUC;
                                    aw0.d.Params params2 = new aw0.d.Params(grouped2.getProcessId());
                                    dVar.f5850d = vq.j.a(grouped2);
                                    dVar.f5851e = jVar;
                                    dVar.f5852f = vq.j.a(aVar);
                                    dVar.f5853g = vq.j.a(bVar);
                                    dVar.f5854h = bESavedDraftCollision;
                                    dVar.f5855j = bVar;
                                    dVar.f5856k = i19;
                                    dVar.f5857l = i18;
                                    dVar.f5858m = i17;
                                    dVar.f5859n = i16;
                                    dVar.f5860p = i15;
                                    dVar.f5863s = 4;
                                    objC = dVar3.c(params2, dVar);
                                    if (objC != E) {
                                        return E;
                                    }
                                    bESavedDraftCollision2 = bESavedDraftCollision;
                                    obj = objC;
                                    r15 = jVar;
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    E = jVar2;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(E));
                                    iVarA = E.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } else if (r15 == 4) {
                                bVar = (ex.b) dVar.f5855j;
                                bESavedDraftCollision2 = (BESavedDraftCollision) dVar.f5854h;
                                dx.j jVar3 = (dx.j) dVar.f5851e;
                                oq.u.b(obj);
                                r15 = jVar3;
                            } else {
                                if (r15 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                oq.u.b(obj);
                                readyToSignRejectedByOther = new yd3.f.ReadyToSignConfirmedByMe((BESavedDraftCollision) obj);
                            }
                            readyToSignRejectedByOther = new yd3.f.ReadyToSign(bESavedDraftCollision2, (sv0.c0) bVar.a((dx.i) obj));
                        } else {
                            oq.u.b(obj);
                            readyToSignRejectedByOther = new yd3.f.StatementFilledByMe((BESavedDraftCollision) obj);
                        }
                        return new dx.i.Right(readyToSignRejectedByOther);
                    } catch (Exception e26) {
                        e = e26;
                    }
                } catch (CancellationException e27) {
                    throw e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            }
        } catch (ex.c e35) {
            e = e35;
        } catch (CancellationException e36) {
            throw e36;
        } catch (Exception e37) {
            e = e37;
            E = r15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:102:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:98:0x02cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [ae3.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object g(sv0.g.Started started, tq.e<? super dx.i<? extends dx.b, ? extends yd3.f>> eVar) throws Throwable {
        e eVar2;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        sv0.g.Started started2;
        ex.b bVar;
        int i15;
        int i16;
        int i17;
        int i18;
        dx.j<dx.b> jVar;
        int i19;
        Object created;
        ProcessId processId;
        sv0.o author;
        BEVehicleCollisionDescriptionConception description;
        BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception;
        dx.j<dx.b> jVar2;
        ProcessId processId2;
        sv0.o oVar;
        sv0.g.Started started3 = started;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i25 = eVar2.f5880w;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f5880w = i25 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objD = eVar2.f5878t;
        ?? E = uq.b.e();
        int i26 = eVar2.f5880w;
        try {
            try {
                try {
                    if (i26 == 0) {
                        oq.u.b(objD);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            switch (b.f5835a[started3.getCollisionStatus().ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 10:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    aVar.b(new dx.b.Generic(new IllegalStateException("Recovering collision for status " + started3.getCollisionStatus() + " is not supported")));
                                    throw new oq.g();
                                case 8:
                                    eVar2.f5864d = started3;
                                    eVar2.f5865e = jVarA;
                                    eVar2.f5866f = vq.j.a(aVar);
                                    eVar2.f5867g = vq.j.a(aVar);
                                    eVar2.f5873n = 0;
                                    eVar2.f5874p = 0;
                                    eVar2.f5875q = 0;
                                    eVar2.f5876r = 0;
                                    eVar2.f5877s = 0;
                                    eVar2.f5880w = 1;
                                    Object objD2 = d(started3, eVar2);
                                    if (objD2 != E) {
                                        objD = objD2;
                                        created = new yd3.f.a.Created(started3.getProcessId(), started3.getAuthor(), ((BESavedDraftCollision) objD).getNewCollisionData().getChapterDescription().getDescription());
                                        break;
                                    }
                                    return E;
                                case 9:
                                    eVar2.f5864d = started3;
                                    eVar2.f5865e = jVarA;
                                    eVar2.f5866f = vq.j.a(aVar);
                                    eVar2.f5867g = vq.j.a(aVar);
                                    eVar2.f5873n = 0;
                                    eVar2.f5874p = 0;
                                    eVar2.f5875q = 0;
                                    eVar2.f5876r = 0;
                                    eVar2.f5877s = 0;
                                    eVar2.f5880w = 5;
                                    Object objD3 = d(started3, eVar2);
                                    if (objD3 != E) {
                                        objD = objD3;
                                        created = new yd3.f.a.InitialInfoRejected(started3.getProcessId(), started3.getAuthor(), ((BESavedDraftCollision) objD).getNewCollisionData().getChapterDescription().getDescription());
                                        break;
                                    }
                                    return E;
                                case 11:
                                    eVar2.f5864d = started3;
                                    eVar2.f5865e = jVarA;
                                    eVar2.f5866f = vq.j.a(aVar);
                                    eVar2.f5867g = aVar;
                                    eVar2.f5873n = 0;
                                    eVar2.f5874p = 0;
                                    eVar2.f5875q = 0;
                                    eVar2.f5876r = 0;
                                    eVar2.f5877s = 0;
                                    eVar2.f5880w = 2;
                                    Object objD4 = d(started3, eVar2);
                                    if (objD4 != E) {
                                        started2 = started3;
                                        bVar = aVar;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        jVar = jVarA;
                                        objD = objD4;
                                        i19 = 0;
                                        BESavedDraftCollision bESavedDraftCollision = (BESavedDraftCollision) objD;
                                        processId = started2.getProcessId();
                                        author = started2.getAuthor();
                                        description = bESavedDraftCollision.getNewCollisionData().getChapterDescription().getDescription();
                                        f fVar = this.getDescriptionUC;
                                        ex.b bVar2 = aVar;
                                        sv0.g.Started started4 = started2;
                                        f.Params params = new f.Params(started4.getProcessId());
                                        eVar2.f5864d = vq.j.a(started4);
                                        eVar2.f5865e = jVar;
                                        eVar2.f5866f = vq.j.a(bVar2);
                                        eVar2.f5867g = vq.j.a(bVar);
                                        eVar2.f5868h = vq.j.a(bESavedDraftCollision);
                                        eVar2.f5869j = bVar;
                                        eVar2.f5870k = description;
                                        eVar2.f5871l = author;
                                        eVar2.f5872m = processId;
                                        eVar2.f5873n = i18;
                                        eVar2.f5874p = i17;
                                        eVar2.f5875q = i16;
                                        eVar2.f5876r = i19;
                                        eVar2.f5877s = i15;
                                        eVar2.f5880w = 3;
                                        objD = fVar.d(params, eVar2);
                                        if (objD != E) {
                                            bEVehicleCollisionDescriptionConception = description;
                                            jVar2 = jVar;
                                            processId2 = processId;
                                            oVar = author;
                                            created = new yd3.f.a.Initialized(processId2, oVar, bEVehicleCollisionDescriptionConception, (yd3.a) bVar.a((dx.i) objD));
                                        }
                                        break;
                                    }
                                    return E;
                                case 12:
                                    eVar2.f5864d = started3;
                                    eVar2.f5865e = jVarA;
                                    eVar2.f5866f = vq.j.a(aVar);
                                    eVar2.f5867g = vq.j.a(aVar);
                                    eVar2.f5873n = 0;
                                    eVar2.f5874p = 0;
                                    eVar2.f5875q = 0;
                                    eVar2.f5876r = 0;
                                    eVar2.f5877s = 0;
                                    eVar2.f5880w = 4;
                                    Object objD5 = d(started3, eVar2);
                                    if (objD5 != E) {
                                        objD = objD5;
                                        created = new yd3.f.a.InitialInfoConfirmedByMe(started3.getProcessId(), started3.getAuthor(), ((BESavedDraftCollision) objD).getNewCollisionData().getChapterDescription().getDescription());
                                        break;
                                    }
                                    return E;
                                default:
                                    throw new oq.p();
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i26 == 1) {
                        started3 = (sv0.g.Started) eVar2.f5864d;
                        oq.u.b(objD);
                        created = new yd3.f.a.Created(started3.getProcessId(), started3.getAuthor(), ((BESavedDraftCollision) objD).getNewCollisionData().getChapterDescription().getDescription());
                    } else {
                        if (i26 == 2) {
                            i15 = eVar2.f5877s;
                            i19 = eVar2.f5876r;
                            int i27 = eVar2.f5875q;
                            int i28 = eVar2.f5874p;
                            int i29 = eVar2.f5873n;
                            ex.b bVar3 = (ex.b) eVar2.f5867g;
                            aVar = (ex.b) eVar2.f5866f;
                            jVar = (dx.j) eVar2.f5865e;
                            started2 = (sv0.g.Started) eVar2.f5864d;
                            try {
                                oq.u.b(objD);
                                i16 = i27;
                                bVar = bVar3;
                                i18 = i29;
                                i17 = i28;
                                BESavedDraftCollision bESavedDraftCollision2 = (BESavedDraftCollision) objD;
                                processId = started2.getProcessId();
                                author = started2.getAuthor();
                                description = bESavedDraftCollision2.getNewCollisionData().getChapterDescription().getDescription();
                                f fVar3 = this.getDescriptionUC;
                                ex.b bVar4 = aVar;
                                sv0.g.Started started5 = started2;
                                f.Params params2 = new f.Params(started5.getProcessId());
                                eVar2.f5864d = vq.j.a(started5);
                                eVar2.f5865e = jVar;
                                eVar2.f5866f = vq.j.a(bVar4);
                                eVar2.f5867g = vq.j.a(bVar);
                                eVar2.f5868h = vq.j.a(bESavedDraftCollision2);
                                eVar2.f5869j = bVar;
                                eVar2.f5870k = description;
                                eVar2.f5871l = author;
                                eVar2.f5872m = processId;
                                eVar2.f5873n = i18;
                                eVar2.f5874p = i17;
                                eVar2.f5875q = i16;
                                eVar2.f5876r = i19;
                                eVar2.f5877s = i15;
                                eVar2.f5880w = 3;
                                objD = fVar3.d(params2, eVar2);
                                if (objD != E) {
                                    bEVehicleCollisionDescriptionConception = description;
                                    jVar2 = jVar;
                                    processId2 = processId;
                                    oVar = author;
                                    created = new yd3.f.a.Initialized(processId2, oVar, bEVehicleCollisionDescriptionConception, (yd3.a) bVar.a((dx.i) objD));
                                }
                                return E;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                E = jVar;
                                px.f fVar4 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar4.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i26 == 3) {
                            processId2 = (ProcessId) eVar2.f5872m;
                            oVar = (sv0.o) eVar2.f5871l;
                            bEVehicleCollisionDescriptionConception = (BEVehicleCollisionDescriptionConception) eVar2.f5870k;
                            bVar = (ex.b) eVar2.f5869j;
                            jVar2 = (dx.j) eVar2.f5865e;
                            try {
                                oq.u.b(objD);
                                created = new yd3.f.a.Initialized(processId2, oVar, bEVehicleCollisionDescriptionConception, (yd3.a) bVar.a((dx.i) objD));
                            } catch (ex.c e26) {
                                e = e26;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                E = jVar2;
                                px.f fVar5 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar5.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else if (i26 == 4) {
                            started3 = (sv0.g.Started) eVar2.f5864d;
                            oq.u.b(objD);
                            created = new yd3.f.a.InitialInfoConfirmedByMe(started3.getProcessId(), started3.getAuthor(), ((BESavedDraftCollision) objD).getNewCollisionData().getChapterDescription().getDescription());
                        } else {
                            if (i26 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            started3 = (sv0.g.Started) eVar2.f5864d;
                            oq.u.b(objD);
                            created = new yd3.f.a.InitialInfoRejected(started3.getProcessId(), started3.getAuthor(), ((BESavedDraftCollision) objD).getNewCollisionData().getChapterDescription().getDescription());
                        }
                    }
                    return new dx.i.Right(created);
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
