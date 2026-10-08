package ce3;

import dx.i;
import er.l;
import er.p;
import fr.t;
import iy.b0;
import ju.p0;
import lu.w;
import mu.g;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import px.c;
import px.f;
import tq.e;
import vq.k;
import xi0.ContactDetails;
import yd3.PersonalDataContainer;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lce3/a;", "", "Lgz/b$a$a;", "Lce3/a$a;", "Lui0/a;", "contactDetailsDownloadManager", "Lac4/a;", "loaderUseCase", "Lvd3/a;", "vehicleCollisionContainersInteractor", "<init>", "(Lui0/a;Lac4/a;Lvd3/a;)V", "params", "Lmu/g;", "e", "(Lgz/b$a$a;)Lmu/g;", "a", "Lui0/a;", "b", "Lac4/a;", "c", "Lvd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ui0.a contactDetailsDownloadManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vd3.a vehicleCollisionContainersInteractor;

    /* JADX INFO: renamed from: ce3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lce3/a$a;", "", "b", "c", "a", "Lce3/a$a$a;", "Lce3/a$a$b;", "Lce3/a$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0680a {

        /* JADX INFO: renamed from: ce3.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lce3/a$a$a;", "Lce3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0681a implements InterfaceC0680a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0681a f25553a = new C0681a();

            private C0681a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0681a);
            }

            public int hashCode() {
                return -2131024121;
            }

            public String toString() {
                return "Finished";
            }
        }

        /* JADX INFO: renamed from: ce3.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lce3/a$a$b;", "Lce3/a$a;", "Lyd3/e;", "scope", "<init>", "(Lyd3/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyd3/e;", "()Lyd3/e;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MIdCardData implements InterfaceC0680a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f25554b = b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PersonalDataContainer scope;

            public MIdCardData(PersonalDataContainer personalDataContainer) {
                this.scope = personalDataContainer;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PersonalDataContainer getScope() {
                return this.scope;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MIdCardData) && t.c(this.scope, ((MIdCardData) other).scope);
            }

            public int hashCode() {
                return this.scope.hashCode();
            }

            public String toString() {
                return "MIdCardData(scope=" + this.scope + ')';
            }
        }

        /* JADX INFO: renamed from: ce3.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lce3/a$a$c;", "Lce3/a$a;", "Lxi0/e;", "rdkContactDetails", "<init>", "(Lxi0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxi0/e;", "()Lxi0/e;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RdkData implements InterfaceC0680a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContactDetails rdkContactDetails;

            public RdkData(ContactDetails contactDetails) {
                this.rdkContactDetails = contactDetails;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ContactDetails getRdkContactDetails() {
                return this.rdkContactDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RdkData) && t.c(this.rdkContactDetails, ((RdkData) other).rdkContactDetails);
            }

            public int hashCode() {
                return this.rdkContactDetails.hashCode();
            }

            public String toString() {
                return "RdkData(rdkContactDetails=" + this.rdkContactDetails + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lce3/a$a;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<w<? super InterfaceC0680a>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f25558f;

        /* JADX INFO: renamed from: ce3.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C0682a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f25560e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f25561f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w<InterfaceC0680a> f25562g;

            /* JADX INFO: renamed from: ce3.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
            static final class C0683a extends k implements l<e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f25563e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ a f25564f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ w<InterfaceC0680a> f25565g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0683a(a aVar, w<? super InterfaceC0680a> wVar, e<? super C0683a> eVar) {
                    super(1, eVar);
                    this.f25564f = aVar;
                    this.f25565g = wVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f25563e;
                    if (i15 == 0) {
                        u.b(obj);
                        vd3.a aVar = this.f25564f.vehicleCollisionContainersInteractor;
                        this.f25563e = 1;
                        obj = aVar.e(this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    i iVar = (i) obj;
                    w<InterfaceC0680a> wVar = this.f25565g;
                    if (iVar instanceof i.Right) {
                        wVar.d(new InterfaceC0680a.MIdCardData((PersonalDataContainer) ((i.Right) iVar).b()));
                    }
                    return i0.f148189a;
                }

                public final e<i0> M(e<?> eVar) {
                    return new C0683a(this.f25564f, this.f25565g, eVar);
                }

                @Override // er.l
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object b(e<? super i0> eVar) {
                    return ((C0683a) M(eVar)).J(i0.f148189a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0682a(a aVar, w<? super InterfaceC0680a> wVar, e<? super C0682a> eVar) {
                super(2, eVar);
                this.f25561f = aVar;
                this.f25562g = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f25560e;
                if (i15 == 0) {
                    u.b(obj);
                    ac4.a aVar = this.f25561f.loaderUseCase;
                    C0683a c0683a = new C0683a(this.f25561f, this.f25562g, null);
                    this.f25560e = 1;
                    if (ac4.a.a(aVar, null, c0683a, this, 1, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C0682a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C0682a(this.f25561f, this.f25562g, eVar);
            }
        }

        /* JADX INFO: renamed from: ce3.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C0684b extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f25566e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f25567f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w<InterfaceC0680a> f25568g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0684b(a aVar, w<? super InterfaceC0680a> wVar, e<? super C0684b> eVar) {
                super(2, eVar);
                this.f25567f = aVar;
                this.f25568g = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f25566e;
                if (i15 == 0) {
                    u.b(obj);
                    ui0.a aVar = this.f25567f.contactDetailsDownloadManager;
                    this.f25566e = 1;
                    obj = aVar.b(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                i iVar = (i) obj;
                w<InterfaceC0680a> wVar = this.f25568g;
                if (iVar instanceof i.Right) {
                    wVar.d(new InterfaceC0680a.RdkData((ContactDetails) ((i.Right) iVar).b()));
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C0684b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C0684b(this.f25567f, this.f25568g, eVar);
            }
        }

        b(e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(w wVar) {
            f.f163100a.b("Channel closed", c.a(wVar));
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        
            if (lu.u.b(r1, r11, r10) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f25558f
                r1 = r0
                lu.w r1 = (lu.w) r1
                java.lang.Object r0 = uq.b.e()
                int r2 = r10.f25557e
                r7 = 2
                r8 = 1
                if (r2 == 0) goto L23
                if (r2 == r8) goto L1f
                if (r2 != r7) goto L17
                oq.u.b(r11)
                goto L73
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                oq.u.b(r11)
                goto L5a
            L23:
                oq.u.b(r11)
                ce3.a$b$a r4 = new ce3.a$b$a
                ce3.a r11 = ce3.a.this
                r9 = 0
                r4.<init>(r11, r1, r9)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                ju.d2 r11 = ju.i.d(r1, r2, r3, r4, r5, r6)
                ce3.a$b$b r4 = new ce3.a$b$b
                ce3.a r2 = ce3.a.this
                r4.<init>(r2, r1, r9)
                r2 = 0
                ju.d2 r2 = ju.i.d(r1, r2, r3, r4, r5, r6)
                ju.d2[] r3 = new ju.d2[r7]
                r4 = 0
                r3[r4] = r11
                r3[r8] = r2
                java.util.List r11 = pq.v.q(r3)
                java.util.Collection r11 = (java.util.Collection) r11
                r10.f25558f = r1
                r10.f25557e = r8
                java.lang.Object r11 = ju.f.c(r11, r10)
                if (r11 != r0) goto L5a
                goto L72
            L5a:
                ce3.a$a$a r11 = ce3.a.InterfaceC0680a.C0681a.f25553a
                r1.d(r11)
                ce3.b r11 = new ce3.b
                r11.<init>()
                java.lang.Object r2 = vq.j.a(r1)
                r10.f25558f = r2
                r10.f25557e = r7
                java.lang.Object r11 = lu.u.b(r1, r11, r10)
                if (r11 != r0) goto L73
            L72:
                return r0
            L73:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ce3.a.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super InterfaceC0680a> wVar, e<? super i0> eVar) {
            return ((b) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = a.this.new b(eVar);
            bVar.f25558f = obj;
            return bVar;
        }
    }

    public a(ui0.a aVar, ac4.a aVar2, vd3.a aVar3) {
        this.contactDetailsDownloadManager = aVar;
        this.loaderUseCase = aVar2;
        this.vehicleCollisionContainersInteractor = aVar3;
    }

    public g<InterfaceC0680a> e(gz.b.a.C1792a params) {
        return mu.i.e(new b(null));
    }
}
