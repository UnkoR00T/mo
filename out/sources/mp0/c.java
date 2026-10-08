package mp0;

import dx.i;
import er.l;
import fv.c0;
import fv.e0;
import ge4.x;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import tq.e;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lmp0/c;", "Lop0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Ljp0/b;", "requestFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lhp0/c;", "giosReportRequestCreator", "<init>", "(Lpl/gov/coi/common/network/w;Ljp0/b;Lpl/gov/coi/common/network/g0;Lhp0/c;)V", "", "formName", "instituteUrl", "requestId", "Lhp0/c$a;", "requestJson", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfp0/i;", "data", "a", "(Lfp0/i;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "b", "Ljp0/b;", "c", "Lpl/gov/coi/common/network/g0;", "d", "Lhp0/c;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements op0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jp0.b requestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hp0.c giosReportRequestCreator;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127416h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f127417j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f127419l;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127417j = obj;
            this.f127419l |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f127424h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f127426k;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127424h = obj;
            this.f127426k |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mp0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3148c extends k implements l<e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127427e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f127429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f127430h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f127431j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3148c(String str, String str2, String str3, e<? super C3148c> eVar) {
            super(1, eVar);
            this.f127429g = str;
            this.f127430h = str2;
            this.f127431j = str3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127427e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ip0.a aVar = (ip0.a) c.this.httpServiceFactory.a(new y.c(this.f127429g, null, 2, null), ip0.a.class);
            String str = this.f127430h;
            String strA = c.this.requestFactory.a();
            c0 c0VarF = c0.INSTANCE.f(this.f127431j, fv.x.INSTANCE.b(m00.c.JSON.getHeaderValue()));
            this.f127427e = 1;
            Object objA = aVar.a(str, strA, c0VarF, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return c.this.new C3148c(this.f127429g, this.f127430h, this.f127431j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<e0>> eVar) {
            return ((C3148c) M(eVar)).J(i0.f148189a);
        }
    }

    public c(w wVar, jp0.b bVar, g0 g0Var, hp0.c cVar) {
        this.httpServiceFactory = wVar;
        this.requestFactory = bVar;
        this.networkCallMediator = g0Var;
        this.giosReportRequestCreator = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, String str3, String str4, e<? super i<? extends dx.b, String>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f127426k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f127426k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f127424h;
        Object objE = uq.b.e();
        int i16 = bVar.f127426k;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3148c c3148c = new C3148c(str2, str3, str4, null);
            bVar.f127420d = str;
            bVar.f127421e = j.a(str2);
            bVar.f127422f = j.a(str3);
            bVar.f127423g = j.a(str4);
            bVar.f127426k = 1;
            objB = g0Var.b(c3148c, bVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f127420d;
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // op0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(fp0.ReportData r8, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof mp0.c.a
            if (r0 == 0) goto L14
            r0 = r9
            mp0.c$a r0 = (mp0.c.a) r0
            int r1 = r0.f127419l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f127419l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            mp0.c$a r0 = new mp0.c$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f127417j
            java.lang.Object r0 = uq.b.e()
            int r1 = r6.f127419l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L42
            if (r1 != r2) goto L3a
            java.lang.Object r8 = r6.f127414f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r6.f127413e
            dx.i r8 = (dx.i) r8
            java.lang.Object r8 = r6.f127412d
            fp0.i r8 = (fp0.ReportData) r8
            oq.u.b(r9)
            goto La8
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            java.lang.Object r8 = r6.f127412d
            fp0.i r8 = (fp0.ReportData) r8
            oq.u.b(r9)
            goto L5a
        L4a:
            oq.u.b(r9)
            hp0.c r9 = r7.giosReportRequestCreator
            r6.f127412d = r8
            r6.f127419l = r3
            java.lang.Object r9 = r9.a(r8, r6)
            if (r9 != r0) goto L5a
            goto La7
        L5a:
            dx.i r9 = (dx.i) r9
            boolean r1 = r9 instanceof dx.i.Left
            if (r1 == 0) goto L61
            return r9
        L61:
            boolean r1 = r9 instanceof dx.i.Right
            if (r1 == 0) goto Lab
            r1 = r9
            dx.i$c r1 = (dx.i.Right) r1
            java.lang.Object r1 = r1.b()
            hp0.c$a r1 = (hp0.c.a) r1
            java.lang.String r5 = r1.getValue()
            fp0.f r1 = r8.getInstitutionCardAndCertData()
            java.lang.String r1 = r1.getFormName()
            java.lang.String r3 = r8.getInstituteUrl()
            fp0.f r4 = r8.getInstitutionCardAndCertData()
            java.lang.String r4 = r4.getRequestId()
            java.lang.Object r8 = vq.j.a(r8)
            r6.f127412d = r8
            java.lang.Object r8 = vq.j.a(r9)
            r6.f127413e = r8
            java.lang.Object r8 = vq.j.a(r5)
            r6.f127414f = r8
            r8 = 0
            r6.f127415g = r8
            r6.f127416h = r8
            r6.f127419l = r2
            r2 = r1
            r1 = r7
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6)
            if (r9 != r0) goto La8
        La7:
            return r0
        La8:
            dx.i r9 = (dx.i) r9
            return r9
        Lab:
            oq.p r8 = new oq.p
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mp0.c.a(fp0.i, tq.e):java.lang.Object");
    }
}
