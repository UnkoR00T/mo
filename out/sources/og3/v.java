package og3;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import sv0.BEVehicleData;
import sv0.ProcessId;
import sv0.Uploader;
import tv0.BENewCollisionData;
import tv0.BEPersonalData;
import tv0.BEVehicleCollisionDescriptionConception;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;
import tv0.Description;
import tv0.YourDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\r\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0004H\u0096@¢\u0006\u0004\b\r\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b!\u0010\u0019J$\u0010$\u001a\u00020\u00072\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\u0004H\u0096@¢\u0006\u0004\b$\u0010\tJ$\u0010'\u001a\u00020\u00072\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u0004H\u0096@¢\u0006\u0004\b'\u0010\tJ\u0018\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000100H\u0096@¢\u0006\u0004\b2\u00103J$\u00106\u001a\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002040\u0004H\u0096@¢\u0006\u0004\b6\u0010\tJ\u0010\u00107\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0096@¢\u0006\u0004\b;\u0010<J\u0018\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0096@¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010AH\u0096@¢\u0006\u0004\bC\u0010DJ(\u0010F\u001a\u00020\u00072\u0016\u0010E\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0006\u0012\u0004\u0018\u00010A0\u0004H\u0096@¢\u0006\u0004\bF\u0010\tJ\u001e\u0010I\u001a\u00020\u00072\f\u0010H\u001a\b\u0012\u0004\u0012\u00020 0GH\u0096@¢\u0006\u0004\bI\u0010JJ\u0013\u0010L\u001a\u00020K*\u00020\u0005H\u0002¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0007H\u0082@¢\u0006\u0004\bN\u00108J\u0010\u0010O\u001a\u00020\u0007H\u0082@¢\u0006\u0004\bO\u00108R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020,0W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0G0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020 0G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010]R\u0014\u0010e\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010]R\u0014\u0010i\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010\u000f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010)\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u00101\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020K0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010]R\u0014\u0010t\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020u0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010]R\u0014\u0010z\u001a\u00020u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010]R\u0016\u0010~\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u001e\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u007f0[8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010]¨\u0006\u0082\u0001"}, d2 = {"Log3/v;", "Log3/a;", "<init>", "()V", "Lkotlin/Function1;", "Ltv0/e;", "update", "Loq/i0;", "e7", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltv0/a;", "J6", "Ltv0/b;", "f3", "Lsv0/l;", "collisionRole", "U3", "(Lsv0/l;Ltq/e;)Ljava/lang/Object;", "Lsv0/q0;", "fileImageConfiguration", "x1", "(Lsv0/q0;Ltq/e;)Ljava/lang/Object;", "Lo04/c;", "photo", "a3", "(Lo04/c;Ltq/e;)Ljava/lang/Object;", "Lwx/k$a;", "", "originalName", "originalUri", "g8", "(Lwx/k$a;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ltv0/b$a;", "y6", "Ltv0/f;", "personalData", "D3", "Ltv0/i;", "description", "D4", "Lsv0/o;", "author", "B", "(Lsv0/o;Ltq/e;)Ljava/lang/Object;", "Lsv0/y;", "processId", ip.a.f96138c, "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Ltv0/i$a;", "address", "b6", "(Ltv0/i$a;Ltq/e;)Ljava/lang/Object;", "Ltv0/m;", "pages", "J3", "X5", "(Ltq/e;)Ljava/lang/Object;", "Ltv0/k;", "vehicle", "b4", "(Ltv0/k;Ltq/e;)Ljava/lang/Object;", "Ltv0/h;", "damage", "T0", "(Ltv0/h;Ltq/e;)Ljava/lang/Object;", "Ltv0/l;", "vehicleOwnerDetails", "e8", "(Ltv0/l;Ltq/e;)Ljava/lang/Object;", "details", "j2", "", "photos", "w3", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lth3/a$a;", "K", "(Ltv0/e;)Lth3/a$a;", "I", "F", "Lmu/b0;", "a", "Lmu/b0;", "data", "X", "()Ltv0/e;", "currentData", "Ldx/i;", "Ldx/b;", "e", "()Ldx/i;", "Lmu/g;", "G3", "()Lmu/g;", "vehiclePhotos", "C1", "()Ljava/util/List;", "currentVehiclePhotos", "i", "g6", "()Ltv0/f;", "currentPersonalData", "getDescription", "w1", "()Ltv0/i;", "currentDescription", "M", "()Lsv0/l;", "C", "()Lsv0/o;", "o", "()Ltv0/i$a;", "M3", "vehicleListData", "O2", "()Lth3/a$a;", "currentVehicleListData", "Lqh3/a$a;", "J5", "vehicleDamageDetailsData", "x6", "()Lqh3/a$a;", "currentVehicleDamageDetailsData", "z5", "R5", "()Ltv0/l;", "currentVehicleOwnerDetails", "Lsv0/e;", "C6", "selectedVehicle", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements og3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<BENewCollisionData> data = mu.r0.a(new BENewCollisionData(null, null, null, 7, null));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f145586d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f145588f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145586d = obj;
            this.f145588f |= PKIFailureInfo.systemUnavail;
            return v.this.X5(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f145589d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f145591f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145589d = obj;
            this.f145591f |= PKIFailureInfo.systemUnavail;
            return v.this.I(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f145593e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145595g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145593e = obj;
            this.f145595g |= PKIFailureInfo.systemUnavail;
            return v.this.b4(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<List<? extends YourDetails.Photo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145596a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145597a;

            /* JADX INFO: renamed from: og3.v$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3610a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145598d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145599e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145600f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145602h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145603j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145604k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145605l;

                public C3610a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145598d = obj;
                    this.f145599e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f145597a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3610a c3610a;
                if (eVar instanceof C3610a) {
                    c3610a = (C3610a) eVar;
                    int i15 = c3610a.f145599e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3610a.f145599e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3610a = new C3610a(eVar);
                    }
                } else {
                    c3610a = new C3610a(eVar);
                }
                Object obj2 = c3610a.f145598d;
                Object objE = uq.b.e();
                int i16 = c3610a.f145599e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145597a;
                    List<YourDetails.Photo> listI = ((BENewCollisionData) obj).getYourDetails().i();
                    c3610a.f145600f = vq.j.a(obj);
                    c3610a.f145602h = vq.j.a(c3610a);
                    c3610a.f145603j = vq.j.a(obj);
                    c3610a.f145604k = vq.j.a(hVar);
                    c3610a.f145605l = 0;
                    c3610a.f145599e = 1;
                    if (hVar.F(listI, c3610a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public d(mu.g gVar) {
            this.f145596a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends YourDetails.Photo>> hVar, tq.e eVar) {
            Object objA = this.f145596a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<BEPersonalData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145606a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145607a;

            /* JADX INFO: renamed from: og3.v$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3611a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145608d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145609e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145610f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145612h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145613j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145614k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145615l;

                public C3611a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145608d = obj;
                    this.f145609e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f145607a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3611a c3611a;
                if (eVar instanceof C3611a) {
                    c3611a = (C3611a) eVar;
                    int i15 = c3611a.f145609e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3611a.f145609e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3611a = new C3611a(eVar);
                    }
                } else {
                    c3611a = new C3611a(eVar);
                }
                Object obj2 = c3611a.f145608d;
                Object objE = uq.b.e();
                int i16 = c3611a.f145609e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145607a;
                    BEPersonalData personalData = ((BENewCollisionData) obj).getYourDetails().getPersonalData();
                    c3611a.f145610f = vq.j.a(obj);
                    c3611a.f145612h = vq.j.a(c3611a);
                    c3611a.f145613j = vq.j.a(obj);
                    c3611a.f145614k = vq.j.a(hVar);
                    c3611a.f145615l = 0;
                    c3611a.f145609e = 1;
                    if (hVar.F(personalData, c3611a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public e(mu.g gVar) {
            this.f145606a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super BEPersonalData> hVar, tq.e eVar) {
            Object objA = this.f145606a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<BEVehicleCollisionDescriptionConception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145616a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145617a;

            /* JADX INFO: renamed from: og3.v$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3612a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145618d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145619e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145620f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145622h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145623j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145624k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145625l;

                public C3612a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145618d = obj;
                    this.f145619e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f145617a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3612a c3612a;
                if (eVar instanceof C3612a) {
                    c3612a = (C3612a) eVar;
                    int i15 = c3612a.f145619e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3612a.f145619e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3612a = new C3612a(eVar);
                    }
                } else {
                    c3612a = new C3612a(eVar);
                }
                Object obj2 = c3612a.f145618d;
                Object objE = uq.b.e();
                int i16 = c3612a.f145619e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145617a;
                    BEVehicleCollisionDescriptionConception description = ((BENewCollisionData) obj).getChapterDescription().getDescription();
                    c3612a.f145620f = vq.j.a(obj);
                    c3612a.f145622h = vq.j.a(c3612a);
                    c3612a.f145623j = vq.j.a(obj);
                    c3612a.f145624k = vq.j.a(hVar);
                    c3612a.f145625l = 0;
                    c3612a.f145619e = 1;
                    if (hVar.F(description, c3612a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public f(mu.g gVar) {
            this.f145616a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super BEVehicleCollisionDescriptionConception> hVar, tq.e eVar) {
            Object objA = this.f145616a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<th3.a.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f145627b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f145629b;

            /* JADX INFO: renamed from: og3.v$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3613a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145630d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145631e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145632f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145634h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145635j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145636k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145637l;

                public C3613a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145630d = obj;
                    this.f145631e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f145628a = hVar;
                this.f145629b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3613a c3613a;
                if (eVar instanceof C3613a) {
                    c3613a = (C3613a) eVar;
                    int i15 = c3613a.f145631e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3613a.f145631e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3613a = new C3613a(eVar);
                    }
                } else {
                    c3613a = new C3613a(eVar);
                }
                Object obj2 = c3613a.f145630d;
                Object objE = uq.b.e();
                int i16 = c3613a.f145631e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145628a;
                    th3.a.Data dataK = this.f145629b.K((BENewCollisionData) obj);
                    c3613a.f145632f = vq.j.a(obj);
                    c3613a.f145634h = vq.j.a(c3613a);
                    c3613a.f145635j = vq.j.a(obj);
                    c3613a.f145636k = vq.j.a(hVar);
                    c3613a.f145637l = 0;
                    c3613a.f145631e = 1;
                    if (hVar.F(dataK, c3613a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public g(mu.g gVar, v vVar) {
            this.f145626a = gVar;
            this.f145627b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super th3.a.Data> hVar, tq.e eVar) {
            Object objA = this.f145626a.a(new a(hVar, this.f145627b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements mu.g<qh3.a.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145638a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145639a;

            /* JADX INFO: renamed from: og3.v$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3614a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145640d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145641e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145642f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145644h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145645j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145646k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145647l;

                public C3614a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145640d = obj;
                    this.f145641e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f145639a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3614a c3614a;
                if (eVar instanceof C3614a) {
                    c3614a = (C3614a) eVar;
                    int i15 = c3614a.f145641e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3614a.f145641e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3614a = new C3614a(eVar);
                    }
                } else {
                    c3614a = new C3614a(eVar);
                }
                Object obj2 = c3614a.f145640d;
                Object objE = uq.b.e();
                int i16 = c3614a.f145641e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145639a;
                    BENewCollisionData bENewCollisionData = (BENewCollisionData) obj;
                    tv0.h selectedDamage = bENewCollisionData.getYourDetails().getSelectedDamage();
                    BEVehicleDataWithType selectedVehicle = bENewCollisionData.getYourDetails().getSelectedVehicle();
                    qh3.a.Data data = new qh3.a.Data(selectedDamage, selectedVehicle != null ? selectedVehicle.getVehicleData() : null);
                    c3614a.f145642f = vq.j.a(obj);
                    c3614a.f145644h = vq.j.a(c3614a);
                    c3614a.f145645j = vq.j.a(obj);
                    c3614a.f145646k = vq.j.a(hVar);
                    c3614a.f145647l = 0;
                    c3614a.f145641e = 1;
                    if (hVar.F(data, c3614a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public h(mu.g gVar) {
            this.f145638a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qh3.a.Data> hVar, tq.e eVar) {
            Object objA = this.f145638a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements mu.g<tv0.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145648a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145649a;

            /* JADX INFO: renamed from: og3.v$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3615a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145650d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145651e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145652f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145654h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145655j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145656k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145657l;

                public C3615a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145650d = obj;
                    this.f145651e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f145649a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3615a c3615a;
                if (eVar instanceof C3615a) {
                    c3615a = (C3615a) eVar;
                    int i15 = c3615a.f145651e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3615a.f145651e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3615a = new C3615a(eVar);
                    }
                } else {
                    c3615a = new C3615a(eVar);
                }
                Object obj2 = c3615a.f145650d;
                Object objE = uq.b.e();
                int i16 = c3615a.f145651e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145649a;
                    tv0.l selectedVehicleOwnerDetails = ((BENewCollisionData) obj).getYourDetails().getSelectedVehicleOwnerDetails();
                    c3615a.f145652f = vq.j.a(obj);
                    c3615a.f145654h = vq.j.a(c3615a);
                    c3615a.f145655j = vq.j.a(obj);
                    c3615a.f145656k = vq.j.a(hVar);
                    c3615a.f145657l = 0;
                    c3615a.f145651e = 1;
                    if (hVar.F(selectedVehicleOwnerDetails, c3615a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public i(mu.g gVar) {
            this.f145648a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super tv0.l> hVar, tq.e eVar) {
            Object objA = this.f145648a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements mu.g<BEVehicleData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145658a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145659a;

            /* JADX INFO: renamed from: og3.v$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3616a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145660d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145661e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145662f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145664h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145665j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145666k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145667l;

                public C3616a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145660d = obj;
                    this.f145661e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f145659a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3616a c3616a;
                if (eVar instanceof C3616a) {
                    c3616a = (C3616a) eVar;
                    int i15 = c3616a.f145661e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3616a.f145661e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3616a = new C3616a(eVar);
                    }
                } else {
                    c3616a = new C3616a(eVar);
                }
                Object obj2 = c3616a.f145660d;
                Object objE = uq.b.e();
                int i16 = c3616a.f145661e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145659a;
                    BEVehicleDataWithType selectedVehicle = ((BENewCollisionData) obj).getYourDetails().getSelectedVehicle();
                    BEVehicleData vehicleData = selectedVehicle != null ? selectedVehicle.getVehicleData() : null;
                    c3616a.f145662f = vq.j.a(obj);
                    c3616a.f145664h = vq.j.a(c3616a);
                    c3616a.f145665j = vq.j.a(obj);
                    c3616a.f145666k = vq.j.a(hVar);
                    c3616a.f145667l = 0;
                    c3616a.f145661e = 1;
                    if (hVar.F(vehicleData, c3616a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public j(mu.g gVar) {
            this.f145658a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super BEVehicleData> hVar, tq.e eVar) {
            Object objA = this.f145658a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails E(List list, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, list, null, null, 223, null);
    }

    private final Object F(tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.G((YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails G(YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, null, null, null, 251, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails H(YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, null, BEVehiclesPages.INSTANCE.a(), null, 190, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (F(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof og3.v.b
            if (r0 == 0) goto L13
            r0 = r6
            og3.v$b r0 = (og3.v.b) r0
            int r1 = r0.f145591f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145591f = r1
            goto L18
        L13:
            og3.v$b r0 = new og3.v$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f145589d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f145591f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            oq.u.b(r6)
            goto L49
        L38:
            oq.u.b(r6)
            og3.f r6 = new og3.f
            r6.<init>()
            r0.f145591f = r4
            java.lang.Object r6 = r5.f3(r6, r0)
            if (r6 != r1) goto L49
            goto L51
        L49:
            r0.f145591f = r3
            java.lang.Object r6 = r5.F(r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.v.I(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails J(YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, null, null, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final th3.a.Data K(BENewCollisionData bENewCollisionData) {
        Object objB;
        dx.i<dx.b, ProcessId> iVarD = bENewCollisionData.d();
        if (iVarD instanceof dx.i.Left) {
            objB = new ProcessId("");
        } else {
            if (!(iVarD instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarD).b();
        }
        return new th3.a.Data((ProcessId) objB, X().getYourDetails().getVehiclesPages(), X().getYourDetails().c(), X().getYourDetails().getSelectedVehicle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails L(List list, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, list, null, null, 223, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEVehicleCollisionDescriptionConception N(BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        return BEVehicleCollisionDescriptionConception.b(bEVehicleCollisionDescriptionConception, null, locationDetails, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails O(tv0.h hVar, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, hVar, null, null, null, null, null, 251, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails P(Uploader uploader, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, null, null, uploader, CertificateBody.profileType, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData Q(ProcessId processId, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, new dx.i.Right(processId), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails R(BEVehicleDataWithType bEVehicleDataWithType, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, bEVehicleDataWithType, null, null, null, null, null, null, null, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails S(tv0.l lVar, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, lVar, null, null, null, null, null, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Description T(sv0.o oVar, Description description) {
        return Description.b(description, null, oVar, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData U(er.l lVar, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, null, (Description) lVar.b(bENewCollisionData.getChapterDescription()), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Description V(er.l lVar, Description description) {
        return Description.b(description, null, null, (BEVehicleCollisionDescriptionConception) lVar.b(description.getDescription()), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails W(er.l lVar, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, (BEPersonalData) lVar.b(yourDetails.getPersonalData()), null, null, null, null, 247, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails Y(List list, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, list, null, null, 223, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Description Z(sv0.l lVar, Description description) {
        return Description.b(description, lVar, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails a0(er.l lVar, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, (tv0.l) lVar.b(yourDetails.getSelectedVehicleOwnerDetails()), null, null, null, null, null, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails b0(er.l lVar, YourDetails yourDetails) {
        return YourDetails.b(yourDetails, null, null, null, null, null, null, (BEVehiclesPages) lVar.b(yourDetails.getVehiclesPages()), null, 191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData c0(er.l lVar, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, null, null, (YourDetails) lVar.b(bENewCollisionData.getYourDetails()), 3, null);
    }

    @Override // cg3.a, hh3.a, kh3.a
    public Object B(final sv0.o oVar, tq.e<? super oq.i0> eVar) {
        Object objJ6 = J6(new er.l() { // from class: og3.b
            @Override // er.l
            public final Object b(Object obj) {
                return v.T(oVar, (Description) obj);
            }
        }, eVar);
        return objJ6 == uq.b.e() ? objJ6 : oq.i0.f148189a;
    }

    @Override // hh3.a, kh3.a
    public sv0.o C() {
        return X().getChapterDescription().getAuthor();
    }

    @Override // bi3.a
    public List<YourDetails.Photo> C1() {
        return X().getYourDetails().i();
    }

    @Override // lg3.a
    public mu.g<BEVehicleData> C6() {
        return new j(this.data);
    }

    @Override // hh3.a, tf3.c, kh3.a
    public Object D(final ProcessId processId, tq.e<? super oq.i0> eVar) {
        Object objE7 = e7(new er.l() { // from class: og3.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.Q(processId, (BENewCollisionData) obj);
            }
        }, eVar);
        return objE7 == uq.b.e() ? objE7 : oq.i0.f148189a;
    }

    @Override // wf3.a
    public Object D3(final er.l<? super BEPersonalData, BEPersonalData> lVar, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.i
            @Override // er.l
            public final Object b(Object obj) {
                return v.W(lVar, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // pf3.a
    public Object D4(final er.l<? super BEVehicleCollisionDescriptionConception, BEVehicleCollisionDescriptionConception> lVar, tq.e<? super oq.i0> eVar) {
        Object objJ6 = J6(new er.l() { // from class: og3.h
            @Override // er.l
            public final Object b(Object obj) {
                return v.V(lVar, (Description) obj);
            }
        }, eVar);
        return objJ6 == uq.b.e() ? objJ6 : oq.i0.f148189a;
    }

    @Override // bi3.a
    public mu.g<List<YourDetails.Photo>> G3() {
        return new d(this.data);
    }

    @Override // th3.a
    public Object J3(final er.l<? super BEVehiclesPages, BEVehiclesPages> lVar, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.g
            @Override // er.l
            public final Object b(Object obj) {
                return v.b0(lVar, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // qh3.a
    public mu.g<qh3.a.Data> J5() {
        return new h(this.data);
    }

    @Override // og3.a
    public Object J6(final er.l<? super Description, Description> lVar, tq.e<? super oq.i0> eVar) {
        Object objE7 = e7(new er.l() { // from class: og3.j
            @Override // er.l
            public final Object b(Object obj) {
                return v.U(lVar, (BENewCollisionData) obj);
            }
        }, eVar);
        return objE7 == uq.b.e() ? objE7 : oq.i0.f148189a;
    }

    @Override // hh3.a, kh3.a
    public sv0.l M() {
        return X().getChapterDescription().getCollisionRole();
    }

    @Override // th3.a
    public mu.g<th3.a.Data> M3() {
        return new g(this.data, this);
    }

    @Override // th3.a
    public th3.a.Data O2() {
        return K(X());
    }

    @Override // xh3.a
    public tv0.l R5() {
        return X().getYourDetails().getSelectedVehicleOwnerDetails();
    }

    @Override // nh3.a, qh3.a
    public Object T0(final tv0.h hVar, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.O(hVar, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // if3.a
    public Object U3(final sv0.l lVar, tq.e<? super oq.i0> eVar) {
        Object objJ6 = J6(new er.l() { // from class: og3.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.Z(lVar, (Description) obj);
            }
        }, eVar);
        return objJ6 == uq.b.e() ? objJ6 : oq.i0.f148189a;
    }

    @Override // og3.a, wf3.a
    public BENewCollisionData X() {
        return this.data.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (I(r0) == r1) goto L21;
     */
    @Override // th3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object X5(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof og3.v.a
            if (r0 == 0) goto L13
            r0 = r6
            og3.v$a r0 = (og3.v.a) r0
            int r1 = r0.f145588f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145588f = r1
            goto L18
        L13:
            og3.v$a r0 = new og3.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f145586d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f145588f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            oq.u.b(r6)
            goto L49
        L38:
            oq.u.b(r6)
            og3.d r6 = new og3.d
            r6.<init>()
            r0.f145588f = r4
            java.lang.Object r6 = r5.f3(r6, r0)
            if (r6 != r1) goto L49
            goto L51
        L49:
            r0.f145588f = r3
            java.lang.Object r6 = r5.I(r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.v.X5(tq.e):java.lang.Object");
    }

    @Override // bi3.a
    public Object a3(o04.c cVar, tq.e<? super oq.i0> eVar) {
        Object next;
        final List listI1 = pq.v.i1(C1());
        Iterator it = listI1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((YourDetails.Photo) next).getImage().getMetadata(), cVar.getOriginalMetadata()));
        YourDetails.Photo photo = (YourDetails.Photo) next;
        if (photo != null) {
            vq.b.a(listI1.remove(photo));
        }
        Object objF3 = f3(new er.l() { // from class: og3.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.L(listI1, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (I(r0) == r1) goto L31;
     */
    @Override // th3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b4(final tv0.BEVehicleDataWithType r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof og3.v.c
            if (r0 == 0) goto L13
            r0 = r7
            og3.v$c r0 = (og3.v.c) r0
            int r1 = r0.f145595g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145595g = r1
            goto L18
        L13:
            og3.v$c r0 = new og3.v$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f145593e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f145595g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f145592d
            tv0.k r6 = (tv0.BEVehicleDataWithType) r6
            oq.u.b(r7)
            goto L98
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f145592d
            tv0.k r6 = (tv0.BEVehicleDataWithType) r6
            oq.u.b(r7)
            goto L89
        L40:
            oq.u.b(r7)
            sv0.e r7 = r6.getVehicleData()
            iy.b0 r7 = r7.getRegistrationNumber()
            java.lang.String r7 = iy.c0.e(r7)
            tv0.e r2 = r5.X()
            tv0.b r2 = r2.getYourDetails()
            tv0.k r2 = r2.getSelectedVehicle()
            if (r2 == 0) goto L6e
            sv0.e r2 = r2.getVehicleData()
            if (r2 == 0) goto L6e
            iy.b0 r2 = r2.getRegistrationNumber()
            if (r2 == 0) goto L6e
            java.lang.String r2 = iy.c0.e(r2)
            goto L6f
        L6e:
            r2 = 0
        L6f:
            boolean r7 = fr.t.c(r7, r2)
            if (r7 != 0) goto L9b
            og3.u r7 = new og3.u
            r7.<init>()
            java.lang.Object r2 = vq.j.a(r6)
            r0.f145592d = r2
            r0.f145595g = r4
            java.lang.Object r7 = r5.f3(r7, r0)
            if (r7 != r1) goto L89
            goto L97
        L89:
            java.lang.Object r6 = vq.j.a(r6)
            r0.f145592d = r6
            r0.f145595g = r3
            java.lang.Object r6 = r5.I(r0)
            if (r6 != r1) goto L98
        L97:
            return r1
        L98:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L9b:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.v.b4(tv0.k, tq.e):java.lang.Object");
    }

    @Override // lf3.c
    public Object b6(final BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, tq.e<? super oq.i0> eVar) {
        Object objD4 = D4(new er.l() { // from class: og3.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.N(locationDetails, (BEVehicleCollisionDescriptionConception) obj);
            }
        }, eVar);
        return objD4 == uq.b.e() ? objD4 : oq.i0.f148189a;
    }

    @Override // og3.a, pf3.a, wf3.a, bi3.a, kh3.a
    public dx.i<dx.b, ProcessId> e() {
        return X().d();
    }

    @Override // og3.a
    public Object e7(er.l<? super BENewCollisionData, BENewCollisionData> lVar, tq.e<? super oq.i0> eVar) {
        Object objF;
        BENewCollisionData value = this.data.getValue();
        BENewCollisionData bENewCollisionDataB = lVar.b(value);
        return (fr.t.c(bENewCollisionDataB, value) || (objF = this.data.F(bENewCollisionDataB, eVar)) != uq.b.e()) ? oq.i0.f148189a : objF;
    }

    @Override // xh3.a
    public Object e8(final tv0.l lVar, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.S(lVar, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // og3.a
    public Object f3(final er.l<? super YourDetails, YourDetails> lVar, tq.e<? super oq.i0> eVar) {
        Object objE7 = e7(new er.l() { // from class: og3.c
            @Override // er.l
            public final Object b(Object obj) {
                return v.c0(lVar, (BENewCollisionData) obj);
            }
        }, eVar);
        return objE7 == uq.b.e() ? objE7 : oq.i0.f148189a;
    }

    @Override // wf3.a
    public BEPersonalData g6() {
        return X().getYourDetails().getPersonalData();
    }

    @Override // bi3.a
    public Object g8(wx.k.Image image, String str, String str2, tq.e<? super oq.i0> eVar) {
        final List listI1 = pq.v.i1(C1());
        listI1.add(new YourDetails.Photo(image, str, str2, null));
        Object objF3 = f3(new er.l() { // from class: og3.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.E(listI1, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // pf3.a
    public mu.g<BEVehicleCollisionDescriptionConception> getDescription() {
        return new f(this.data);
    }

    @Override // wf3.a
    public mu.g<BEPersonalData> i() {
        return new e(this.data);
    }

    @Override // xh3.a
    public Object j2(final er.l<? super tv0.l, ? extends tv0.l> lVar, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.k
            @Override // er.l
            public final Object b(Object obj) {
                return v.a0(lVar, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // lf3.c
    public BEVehicleCollisionDescriptionConception.LocationDetails o() {
        return X().getChapterDescription().getDescription().getAddress();
    }

    @Override // pf3.a
    public BEVehicleCollisionDescriptionConception w1() {
        return X().getChapterDescription().getDescription();
    }

    @Override // wf3.a
    public Object w3(final List<YourDetails.Photo> list, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.Y(list, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // bi3.a
    public Object x1(final Uploader uploader, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.e
            @Override // er.l
            public final Object b(Object obj) {
                return v.P(uploader, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    @Override // qh3.a
    public qh3.a.Data x6() {
        tv0.h selectedDamage = X().getYourDetails().getSelectedDamage();
        BEVehicleDataWithType selectedVehicle = X().getYourDetails().getSelectedVehicle();
        return new qh3.a.Data(selectedDamage, selectedVehicle != null ? selectedVehicle.getVehicleData() : null);
    }

    @Override // bi3.a
    public Object y6(o04.c cVar, tq.e<? super YourDetails.Photo> eVar) {
        for (Object obj : C1()) {
            if (fr.t.c(((YourDetails.Photo) obj).getImage().getMetadata(), cVar.getOriginalMetadata())) {
                return obj;
            }
        }
        return null;
    }

    @Override // xh3.a
    public mu.g<tv0.l> z5() {
        return new i(this.data);
    }
}
