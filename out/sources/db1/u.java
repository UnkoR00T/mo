package db1;

import f00.j0;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005:\u0001BB;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010@¨\u0006C"}, d2 = {"Ldb1/u;", "Ll00/g;", "Ldb1/g;", "", "Ldb1/h;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lia1/a;", "companyEndpoints", "Leb1/b;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Ldb1/u$a$a;", "setupData", "<init>", "(Lyy/a;Lia1/a;Leb1/b;La14/w;Li70/n;Ldb1/u$a$a;)V", "Ldb1/h$a;", "m9", "(Ldb1/g;)Ldb1/h$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lia1/a;", "c", "Leb1/b;", "d", "La14/w;", "e", "Li70/n;", "f", "Ldb1/u$a$a;", "Ldb1/g$b;", "g", "Ldb1/g$b;", "initialState", "Lxw/b;", "Ldb1/d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<db1.g, Object> implements h, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final eb1.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final db1.g.WelcomePageInitialized initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<db1.d> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<db1.g, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<h.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ldb1/u$a;", "Lf00/j0;", "Ldb1/u$a$a;", "Ldb1/u;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<SetupData, u> {

        /* JADX INFO: renamed from: db1.u$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldb1/u$a$a;", "", "Lma1/j;", "companyInfoStatus", "<init>", "(Lma1/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lma1/j;", "()Lma1/j;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ma1.j companyInfoStatus;

            public SetupData(ma1.j jVar) {
                this.companyInfoStatus = jVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ma1.j getCompanyInfoStatus() {
                return this.companyInfoStatus;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && this.companyInfoStatus == ((SetupData) other).companyInfoStatus;
            }

            public int hashCode() {
                return this.companyInfoStatus.hashCode();
            }

            public String toString() {
                return "SetupData(companyInfoStatus=" + this.companyInfoStatus + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f40696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f40697b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f40698a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f40699b;

            /* JADX INFO: renamed from: db1.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0897a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f40700d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40701e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f40702f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f40704h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f40705j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f40706k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f40707l;

                public C0897a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f40700d = obj;
                    this.f40701e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f40698a = hVar;
                this.f40699b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0897a c0897a;
                if (eVar instanceof C0897a) {
                    c0897a = (C0897a) eVar;
                    int i15 = c0897a.f40701e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0897a.f40701e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0897a = new C0897a(eVar);
                    }
                } else {
                    c0897a = new C0897a(eVar);
                }
                Object obj2 = c0897a.f40700d;
                Object objE = uq.b.e();
                int i16 = c0897a.f40701e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f40698a;
                    h.a aVarM9 = this.f40699b.m9((db1.g) obj);
                    c0897a.f40702f = vq.j.a(obj);
                    c0897a.f40704h = vq.j.a(c0897a);
                    c0897a.f40705j = vq.j.a(obj);
                    c0897a.f40706k = vq.j.a(hVar);
                    c0897a.f40707l = 0;
                    c0897a.f40701e = 1;
                    if (hVar.F(aVarM9, c0897a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, u uVar) {
            this.f40696a = gVar;
            this.f40697b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.a> hVar, tq.e eVar) {
            Object objA = this.f40696a.a(new a(hVar, this.f40697b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldb1/b;", "<unused var>", "Ldb1/g$b;", "Loq/i0;", "<anonymous>", "(Ldb1/b;Ldb1/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<db1.b, db1.g.WelcomePageInitialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40708e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40708e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<db1.d> bVarY1 = u.this.Y1();
                db1.d.a aVar = db1.d.a.f40645a;
                this.f40708e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(db1.b bVar, db1.g.WelcomePageInitialized welcomePageInitialized, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldb1/f;", "<unused var>", "Ldb1/g$b;", "state", "Loq/i0;", "<anonymous>", "(Ldb1/f;Ldb1/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<db1.f, db1.g.WelcomePageInitialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40711f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f40711f
                db1.g$b r0 = (db1.g.WelcomePageInitialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f40710e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L58
            L1f:
                oq.u.b(r6)
                ma1.j r6 = r0.getCompanyInfoStatus()
                ma1.j r2 = ma1.j.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE
                if (r6 != r2) goto L41
                db1.u r6 = db1.u.this
                xw.b r6 = r6.Y1()
                db1.d$b r2 = db1.d.b.f40646a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f40711f = r0
                r5.f40710e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L58
                goto L57
            L41:
                db1.u r6 = db1.u.this
                xw.b r6 = r6.Y1()
                db1.d$c r2 = db1.d.c.f40647a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f40711f = r0
                r5.f40710e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L58
            L57:
                return r1
            L58:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: db1.u.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(db1.f fVar, db1.g.WelcomePageInitialized welcomePageInitialized, tq.e<? super i0> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f40711f = welcomePageInitialized;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldb1/a;", "<unused var>", "Lk10/c0;", "Ldb1/g$b;", "state", "Lk10/l;", "Ldb1/g;", "<anonymous>", "(Ldb1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<db1.a, c0<db1.g.WelcomePageInitialized>, tq.e<? super k10.l<? extends db1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40714f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final db1.g.WelcomePageDataInformationInitialized O(c0 c0Var, db1.g.WelcomePageInitialized welcomePageInitialized) {
            return new db1.g.WelcomePageDataInformationInitialized(((db1.g.WelcomePageInitialized) c0Var.a()).getCompanyInfoStatus(), ((db1.g.WelcomePageInitialized) c0Var.a()).getCeidgUrl());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f40714f;
            uq.b.e();
            if (this.f40713e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: db1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(c0Var, (g.WelcomePageInitialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(db1.a aVar, c0<db1.g.WelcomePageInitialized> c0Var, tq.e<? super k10.l<? extends db1.g>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f40714f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldb1/c;", "<unused var>", "Lk10/c0;", "Ldb1/g$a;", "state", "Lk10/l;", "Ldb1/g;", "<anonymous>", "(Ldb1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<db1.c, c0<db1.g.WelcomePageDataInformationInitialized>, tq.e<? super k10.l<? extends db1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40716f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final db1.g.WelcomePageInitialized O(c0 c0Var, db1.g.WelcomePageDataInformationInitialized welcomePageDataInformationInitialized) {
            return new db1.g.WelcomePageInitialized(((db1.g.WelcomePageDataInformationInitialized) c0Var.a()).getCompanyInfoStatus(), ((db1.g.WelcomePageDataInformationInitialized) c0Var.a()).getCeidgUrl());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f40716f;
            uq.b.e();
            if (this.f40715e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: db1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(c0Var, (g.WelcomePageDataInformationInitialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(db1.c cVar, c0<db1.g.WelcomePageDataInformationInitialized> c0Var, tq.e<? super k10.l<? extends db1.g>> eVar) {
            f fVar = new f(eVar);
            fVar.f40716f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldb1/e;", "action", "Ldb1/g$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldb1/e;Ldb1/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OpenWebsite, db1.g.WelcomePageDataInformationInitialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40718f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenWebsite openWebsite = (OpenWebsite) this.f40718f;
            Object objE = uq.b.e();
            int i15 = this.f40717e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openWebsite.getUrl(), false, 2, null);
                this.f40718f = vq.j.a(openWebsite);
                this.f40717e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenWebsite openWebsite, db1.g.WelcomePageDataInformationInitialized welcomePageDataInformationInitialized, tq.e<? super i0> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f40718f = openWebsite;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, ia1.a aVar2, eb1.b bVar, a14.w wVar, i70.n nVar, a.SetupData setupData) {
        this.companyEndpoints = aVar2;
        this.mapper = bVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.setupData = setupData;
        db1.g.WelcomePageInitialized welcomePageInitialized = new db1.g.WelcomePageInitialized(setupData.getCompanyInfoStatus(), aVar2.u0());
        this.initialState = welcomePageInitialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(welcomePageInitialized, new er.l() { // from class: db1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.p9(this.f40685a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(welcomePageInitialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.a m9(db1.g gVar) {
        return this.mapper.b(new eb1.b.Params(gVar, b9(db1.a.f40642a), b9(db1.b.f40643a), new er.l() { // from class: db1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.n9(this.f40682a, (String) obj);
            }
        }, b9(db1.c.f40644a), b9(db1.f.f40649a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(u uVar, String str) {
        uVar.d9(new OpenWebsite(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(db1.g.WelcomePageInitialized.class), new er.l() { // from class: db1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.q9(this.f40683a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(db1.g.WelcomePageDataInformationInitialized.class), new er.l() { // from class: db1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.r9(this.f40684a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(db1.b.class), oVar, cVar);
        zVar.x(q0.c(db1.f.class), oVar, uVar.new d(null));
        zVar.v(q0.c(db1.a.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(u uVar, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(db1.c.class), oVar, fVar);
        zVar.x(q0.c(OpenWebsite.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<db1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<db1.g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(h.a aVar) {
        super.P5(aVar);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
