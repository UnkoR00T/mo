package wd3;

import ae3.j;
import aw0.c0;
import aw0.p;
import aw0.u;
import dx.i;
import er.l;
import fr.t;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import mu.a0;
import mu.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import su.g;
import sv0.ProcessId;
import sv0.n;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130'2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b(\u0010)J,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130'2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010D¨\u0006F"}, d2 = {"Lwd3/b;", "Lwd3/a;", "Law0/u;", "getOtherSideInitialConfirmationUC", "Law0/p;", "confirmOtherSideDataUC", "Law0/c0;", "rejectOtherSideDataUC", "Lae3/j;", "longPollUC", "<init>", "(Law0/u;Law0/p;Law0/c0;Lae3/j;)V", "Lsv0/y;", "processId", "Lju/d2;", "m", "(Lsv0/y;)Lju/d2;", "Lsv0/h0;", "result", "Loq/i0;", "l", "(Lsv0/y;Lsv0/h0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "k", "(Lsv0/y;Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lsv0/n;", "n", "(Lsv0/h0;Lsv0/y;)Lsv0/n;", "status", "o", "(Lsv0/n;Ltq/e;)Ljava/lang/Object;", "a", "(Lsv0/y;)V", "Lmu/a0;", "j", "()Lmu/a0;", "cancel", "()V", "Ldx/i;", "d", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lsv0/a0;", "reason", "c", "(Lsv0/y;Lsv0/a0;Ltq/e;)Ljava/lang/Object;", "Law0/u;", "b", "Law0/p;", "Law0/c0;", "Lae3/j;", "e", "Lmu/a0;", "confirmationStatus", "f", "Lsv0/n;", "lastStatus", "g", "Lsv0/y;", "lastProcessId", "h", "Lju/d2;", "job", "Lsu/a;", "i", "Lsu/a;", "mutex", "Lju/p0;", "Lju/p0;", "scope", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements wd3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u getOtherSideInitialConfirmationUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p confirmOtherSideDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0 rejectOtherSideDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j longPollUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private n lastStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ProcessId lastProcessId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a0<n> confirmationStatus = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = g.b(false, 1, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0 scope = q0.a(g1.b().n0(z2.b(null, 1, null)));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212487h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f212488j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212490l;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212488j = obj;
            this.f212490l |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    /* JADX INFO: renamed from: wd3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5600b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212495h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f212496j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f212497k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212498l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212499m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f212500n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f212502q;

        C5600b(e<? super C5600b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212500n = obj;
            this.f212502q |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212506h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f212507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f212508k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212509l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212510m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f212511n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f212512p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f212513q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ProcessId f212515s;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lsv0/h0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends k implements l<e<? super i<? extends dx.b, ? extends sv0.h0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f212516e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f212517f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ProcessId f212518g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, ProcessId processId, e<? super a> eVar) {
                super(1, eVar);
                this.f212517f = bVar;
                this.f212518g = processId;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f212516e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                u uVar = this.f212517f.getOtherSideInitialConfirmationUC;
                u.Params params = new u.Params(this.f212518g);
                this.f212516e = 1;
                Object objC = uVar.c(params, this);
                return objC == objE ? objE : objC;
            }

            public final e<i0> M(e<?> eVar) {
                return new a(this.f212517f, this.f212518g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(e<? super i<? extends dx.b, ? extends sv0.h0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ProcessId processId, e<? super c> eVar) {
            super(2, eVar);
            this.f212515s = processId;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0137  */
        /* JADX WARN: Code duplicated, block: B:52:0x01ab  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i iVar;
            b bVar;
            ProcessId processId;
            sv0.h0 h0Var;
            su.a aVar;
            c cVar;
            int i15;
            int i16;
            int i17;
            dx.b bVar2;
            su.a aVar2;
            c cVar2;
            int i18;
            int i19;
            int i25;
            su.a aVar3;
            b bVar3;
            su.a aVar4;
            b bVar4;
            Object objE = uq.b.e();
            int i26 = this.f212513q;
            if (i26 == 0) {
                oq.u.b(obj);
                j jVar = b.this.longPollUC;
                a aVar5 = new a(b.this, this.f212515s, null);
                this.f212513q = 1;
                obj = jVar.a(aVar5, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i26 != 1) {
                if (i26 == 2) {
                    int i27 = this.f212511n;
                    int i28 = this.f212510m;
                    int i29 = this.f212509l;
                    c cVar3 = (c) this.f212508k;
                    su.a aVar6 = (su.a) this.f212507j;
                    bVar2 = (dx.b) this.f212506h;
                    processId = (ProcessId) this.f212505g;
                    b bVar5 = (b) this.f212504f;
                    iVar = (i) this.f212503e;
                    oq.u.b(obj);
                    i18 = i27;
                    aVar2 = aVar6;
                    cVar2 = cVar3;
                    i25 = i29;
                    i19 = i28;
                    bVar = bVar5;
                    try {
                        this.f212503e = vq.j.a(iVar);
                        this.f212504f = bVar;
                        this.f212505g = vq.j.a(bVar2);
                        this.f212506h = aVar2;
                        this.f212507j = vq.j.a(cVar2);
                        this.f212508k = null;
                        this.f212509l = i25;
                        this.f212510m = i19;
                        this.f212511n = i18;
                        this.f212512p = 0;
                        this.f212513q = 3;
                        if (bVar.k(processId, bVar2, this) != objE) {
                            aVar3 = aVar2;
                            bVar3 = bVar;
                            bVar3.cancel();
                            i0 i0Var = i0.f148189a;
                            aVar3.r(null);
                            return i0.f148189a;
                        }
                        return objE;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar3 = aVar2;
                        aVar3.r(null);
                        throw th;
                    }
                }
                if (i26 == 3) {
                    aVar3 = (su.a) this.f212506h;
                    bVar3 = (b) this.f212504f;
                    try {
                        oq.u.b(obj);
                        bVar3.cancel();
                        i0 i0Var2 = i0.f148189a;
                        aVar3.r(null);
                        return i0.f148189a;
                    } catch (Throwable th5) {
                        th = th5;
                        aVar3.r(null);
                        throw th;
                    }
                }
                if (i26 != 4) {
                    if (i26 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar4 = (su.a) this.f212506h;
                    bVar4 = (b) this.f212504f;
                    try {
                        oq.u.b(obj);
                        bVar4.cancel();
                        i0 i0Var3 = i0.f148189a;
                        aVar4.r(null);
                        return i0.f148189a;
                    } catch (Throwable th6) {
                        th = th6;
                        aVar4.r(null);
                        throw th;
                    }
                }
                int i35 = this.f212511n;
                int i36 = this.f212510m;
                int i37 = this.f212509l;
                c cVar4 = (c) this.f212508k;
                su.a aVar7 = (su.a) this.f212507j;
                h0Var = (sv0.h0) this.f212506h;
                processId = (ProcessId) this.f212505g;
                b bVar6 = (b) this.f212504f;
                iVar = (i) this.f212503e;
                oq.u.b(obj);
                i15 = i35;
                aVar = aVar7;
                cVar = cVar4;
                i17 = i37;
                i16 = i36;
                bVar = bVar6;
                try {
                    this.f212503e = vq.j.a(iVar);
                    this.f212504f = bVar;
                    this.f212505g = vq.j.a(h0Var);
                    this.f212506h = aVar;
                    this.f212507j = vq.j.a(cVar);
                    this.f212508k = null;
                    this.f212509l = i17;
                    this.f212510m = i16;
                    this.f212511n = i15;
                    this.f212512p = 0;
                    this.f212513q = 5;
                    if (bVar.l(processId, h0Var, this) != objE) {
                        aVar4 = aVar;
                        bVar4 = bVar;
                        bVar4.cancel();
                        i0 i0Var4 = i0.f148189a;
                        aVar4.r(null);
                        return i0.f148189a;
                    }
                    return objE;
                } catch (Throwable th7) {
                    th = th7;
                    aVar4 = aVar;
                    aVar4.r(null);
                    throw th;
                }
            }
            oq.u.b(obj);
            iVar = (i) obj;
            bVar = b.this;
            processId = this.f212515s;
            if (iVar instanceof i.Left) {
                bVar2 = (dx.b) ((i.Left) iVar).b();
                aVar2 = bVar.mutex;
                this.f212503e = vq.j.a(iVar);
                this.f212504f = bVar;
                this.f212505g = processId;
                this.f212506h = bVar2;
                this.f212507j = aVar2;
                this.f212508k = vq.j.a(this);
                this.f212509l = 0;
                this.f212510m = 0;
                this.f212511n = 0;
                this.f212513q = 2;
                if (aVar2.h(null, this) != objE) {
                    cVar2 = this;
                    i18 = 0;
                    i19 = 0;
                    i25 = 0;
                    this.f212503e = vq.j.a(iVar);
                    this.f212504f = bVar;
                    this.f212505g = vq.j.a(bVar2);
                    this.f212506h = aVar2;
                    this.f212507j = vq.j.a(cVar2);
                    this.f212508k = null;
                    this.f212509l = i25;
                    this.f212510m = i19;
                    this.f212511n = i18;
                    this.f212512p = 0;
                    this.f212513q = 3;
                    if (bVar.k(processId, bVar2, this) != objE) {
                        aVar3 = aVar2;
                        bVar3 = bVar;
                        bVar3.cancel();
                        i0 i0Var5 = i0.f148189a;
                        aVar3.r(null);
                        return i0.f148189a;
                    }
                }
            } else {
                if (!(iVar instanceof i.Right)) {
                    throw new oq.p();
                }
                h0Var = (sv0.h0) ((i.Right) iVar).b();
                aVar = bVar.mutex;
                this.f212503e = vq.j.a(iVar);
                this.f212504f = bVar;
                this.f212505g = processId;
                this.f212506h = h0Var;
                this.f212507j = aVar;
                this.f212508k = vq.j.a(this);
                this.f212509l = 0;
                this.f212510m = 0;
                this.f212511n = 0;
                this.f212513q = 4;
                if (aVar.h(null, this) != objE) {
                    cVar = this;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                    this.f212503e = vq.j.a(iVar);
                    this.f212504f = bVar;
                    this.f212505g = vq.j.a(h0Var);
                    this.f212506h = aVar;
                    this.f212507j = vq.j.a(cVar);
                    this.f212508k = null;
                    this.f212509l = i17;
                    this.f212510m = i16;
                    this.f212511n = i15;
                    this.f212512p = 0;
                    this.f212513q = 5;
                    if (bVar.l(processId, h0Var, this) != objE) {
                        aVar4 = aVar;
                        bVar4 = bVar;
                        bVar4.cancel();
                        i0 i0Var6 = i0.f148189a;
                        aVar4.r(null);
                        return i0.f148189a;
                    }
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return b.this.new c(this.f212515s, eVar);
        }
    }

    public b(u uVar, p pVar, c0 c0Var, j jVar) {
        this.getOtherSideInitialConfirmationUC = uVar;
        this.confirmOtherSideDataUC = pVar;
        this.rejectOtherSideDataUC = c0Var;
        this.longPollUC = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(ProcessId processId, dx.b bVar, e<? super i0> eVar) {
        Object objO;
        return ((this.lastStatus instanceof n.RejectedByMe) || (objO = o(new n.Error(processId, bVar), eVar)) != uq.b.e()) ? i0.f148189a : objO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(ProcessId processId, sv0.h0 h0Var, e<? super i0> eVar) {
        Object objO;
        return ((this.lastStatus instanceof n.RejectedByMe) || (objO = o(n(h0Var, processId), eVar)) != uq.b.e()) ? i0.f148189a : objO;
    }

    private final d2 m(ProcessId processId) {
        return ju.k.d(this.scope, null, null, new c(processId, null), 3, null);
    }

    private final n n(sv0.h0 h0Var, ProcessId processId) {
        if (t.c(h0Var, sv0.h0.a.f184540a)) {
            return new n.ConfirmedByAll(processId);
        }
        if (h0Var instanceof sv0.h0.Rejected) {
            return new n.RejectedByOtherSide(processId, ((sv0.h0.Rejected) h0Var).getRejectedReason());
        }
        throw new oq.p();
    }

    private final Object o(n nVar, e<? super i0> eVar) {
        this.lastStatus = nVar;
        Object objF = this.confirmationStatus.F(nVar, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // wd3.a
    public void a(ProcessId processId) {
        if (t.c(this.lastProcessId, processId)) {
            return;
        }
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.lastStatus = null;
        this.lastProcessId = processId;
        this.job = m(processId);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:43:0x00fa, B:34:0x00b9, B:37:0x00c0, B:39:0x00c4, B:46:0x0103, B:47:0x0108), top: B:52:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:43:0x00fa, B:34:0x00b9, B:37:0x00c0, B:39:0x00c4, B:46:0x0103, B:47:0x0108), top: B:52:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:43:0x00fa, B:34:0x00b9, B:37:0x00c0, B:39:0x00c4, B:46:0x0103, B:47:0x0108), top: B:52:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [wd3.b] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, sv0.a0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [su.a] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, sv0.a0] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, sv0.a0] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // wd3.a
    public Object c(ProcessId processId, sv0.a0 a0Var, e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        C5600b c5600b;
        su.a aVar;
        int i15;
        ?? r15;
        ?? r16;
        su.a aVar2;
        ProcessId processId2;
        int i16;
        Object right;
        i0 i0Var;
        n.RejectedByMe rejectedByMe;
        i0 i0Var2;
        if (eVar instanceof C5600b) {
            c5600b = (C5600b) eVar;
            int i17 = c5600b.f212502q;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                c5600b.f212502q = i17 - PKIFailureInfo.systemUnavail;
            } else {
                c5600b = new C5600b(eVar);
            }
        } else {
            c5600b = new C5600b(eVar);
        }
        Object obj = c5600b.f212500n;
        Object objE = uq.b.e();
        int i18 = c5600b.f212502q;
        try {
            try {
                if (i18 == 0) {
                    oq.u.b(obj);
                    aVar = this.mutex;
                    c5600b.f212491d = processId;
                    c5600b.f212492e = a0Var;
                    c5600b.f212493f = aVar;
                    c5600b.f212496j = 0;
                    c5600b.f212502q = 1;
                    if (aVar.h(null, c5600b) != objE) {
                        i15 = 0;
                        r15 = a0Var;
                    }
                    return objE;
                }
                if (i18 != 1) {
                    if (i18 == 2) {
                        i16 = c5600b.f212497k;
                        int i19 = c5600b.f212496j;
                        su.a aVar3 = (su.a) c5600b.f212493f;
                        sv0.a0 a0Var2 = (sv0.a0) c5600b.f212492e;
                        processId2 = (ProcessId) c5600b.f212491d;
                        try {
                            oq.u.b(obj);
                            i15 = i19;
                            aVar2 = aVar3;
                            r16 = a0Var2;
                            right = (i) obj;
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    throw new oq.p();
                                }
                                i0Var = (i0) ((i.Right) right).b();
                                rejectedByMe = new n.RejectedByMe(processId2, r16);
                                c5600b.f212491d = vq.j.a(processId2);
                                c5600b.f212492e = vq.j.a(r16);
                                c5600b.f212493f = aVar2;
                                c5600b.f212494g = vq.j.a(right);
                                c5600b.f212495h = i0Var;
                                c5600b.f212496j = i15;
                                c5600b.f212497k = i16;
                                c5600b.f212498l = 0;
                                c5600b.f212499m = 0;
                                c5600b.f212502q = 3;
                                if (o(rejectedByMe, c5600b) != objE) {
                                    i0Var2 = i0Var;
                                }
                                return objE;
                            }
                            aVar2.r(null);
                            return right;
                        } catch (Throwable th4) {
                            th = th4;
                            a0Var = aVar3;
                            a0Var.r(null);
                            throw th;
                        }
                    }
                    if (i18 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0Var2 = (i0) c5600b.f212495h;
                    aVar2 = (su.a) c5600b.f212493f;
                    oq.u.b(obj);
                    right = new i.Right(i0Var2);
                    aVar2.r(null);
                    return right;
                }
                int i25 = c5600b.f212496j;
                su.a aVar4 = (su.a) c5600b.f212493f;
                sv0.a0 a0Var3 = (sv0.a0) c5600b.f212492e;
                ProcessId processId3 = (ProcessId) c5600b.f212491d;
                oq.u.b(obj);
                aVar = aVar4;
                r15 = a0Var3;
                i15 = i25;
                processId = processId3;
                c0 c0Var = this.rejectOtherSideDataUC;
                c0.Params params = new c0.Params(processId, r15);
                c5600b.f212491d = processId;
                c5600b.f212492e = r15;
                c5600b.f212493f = aVar;
                c5600b.f212496j = i15;
                c5600b.f212497k = 0;
                c5600b.f212502q = 2;
                Object objC = c0Var.c(params, c5600b);
                if (objC != objE) {
                    r16 = r15;
                    aVar2 = aVar;
                    obj = objC;
                    processId2 = processId;
                    i16 = 0;
                    right = (i) obj;
                    if (!(right instanceof i.Left)) {
                        if (right instanceof i.Right) {
                            throw new oq.p();
                        }
                        i0Var = (i0) ((i.Right) right).b();
                        rejectedByMe = new n.RejectedByMe(processId2, r16);
                        c5600b.f212491d = vq.j.a(processId2);
                        c5600b.f212492e = vq.j.a(r16);
                        c5600b.f212493f = aVar2;
                        c5600b.f212494g = vq.j.a(right);
                        c5600b.f212495h = i0Var;
                        c5600b.f212496j = i15;
                        c5600b.f212497k = i16;
                        c5600b.f212498l = 0;
                        c5600b.f212499m = 0;
                        c5600b.f212502q = 3;
                        if (o(rejectedByMe, c5600b) != objE) {
                            i0Var2 = i0Var;
                            right = new i.Right(i0Var2);
                        }
                    }
                    aVar2.r(null);
                    return right;
                }
                return objE;
            } catch (Throwable th5) {
                th = th5;
                a0Var = aVar;
                a0Var.r(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // wd3.a
    public void cancel() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.lastProcessId = null;
        this.lastStatus = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a5 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:21:0x0055, B:34:0x009f, B:36:0x00a5, B:30:0x0083), top: B:45:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [wd3.b] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [su.a] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [su.a] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [su.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // wd3.a
    public Object d(ProcessId processId, e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        ?? r15;
        su.a aVar2;
        int i15;
        ProcessId processId2;
        int i16;
        i iVar;
        n.ConfirmedByMe confirmedByMe;
        i iVar2;
        ?? r16;
        ?? r17;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i17 = aVar.f212490l;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212490l = i17 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f212488j;
        Object objE = uq.b.e();
        ?? r18 = aVar.f212490l;
        int i18 = 0;
        try {
            if (r18 == 0) {
                oq.u.b(obj);
                su.a aVar3 = this.mutex;
                aVar.f212483d = processId;
                aVar.f212484e = aVar3;
                aVar.f212486g = 0;
                aVar.f212490l = 1;
                if (aVar3.h(null, aVar) != objE) {
                    aVar2 = aVar3;
                    i15 = 0;
                }
                return objE;
            }
            if (r18 == 1) {
                int i19 = aVar.f212486g;
                su.a aVar4 = (su.a) aVar.f212484e;
                ProcessId processId3 = (ProcessId) aVar.f212483d;
                oq.u.b(obj);
                i15 = i19;
                processId = processId3;
                aVar2 = aVar4;
            } else {
                if (r18 == 2) {
                    i18 = aVar.f212487h;
                    i16 = aVar.f212486g;
                    su.a aVar5 = (su.a) aVar.f212484e;
                    processId2 = (ProcessId) aVar.f212483d;
                    oq.u.b(obj);
                    r18 = aVar5;
                    iVar = (i) obj;
                    r17 = r18;
                    if (iVar instanceof i.Right) {
                        confirmedByMe = new n.ConfirmedByMe(processId2);
                        aVar.f212483d = vq.j.a(processId2);
                        aVar.f212484e = r18;
                        aVar.f212485f = iVar;
                        aVar.f212486g = i16;
                        aVar.f212487h = i18;
                        aVar.f212490l = 3;
                        if (o(confirmedByMe, aVar) != objE) {
                            iVar2 = iVar;
                            r16 = r18;
                        }
                        return objE;
                    }
                    r17.r(null);
                    return iVar;
                }
                if (r18 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar2 = (i) aVar.f212485f;
                r15 = (su.a) aVar.f212484e;
                try {
                    oq.u.b(obj);
                    r16 = r15;
                } catch (Throwable th4) {
                    th = th4;
                    r15.r(null);
                    throw th;
                }
            }
            iVar = iVar2;
            r17 = r16;
            r17.r(null);
            return iVar;
            p pVar = this.confirmOtherSideDataUC;
            p.Params params = new p.Params(processId);
            aVar.f212483d = processId;
            aVar.f212484e = aVar2;
            aVar.f212486g = i15;
            aVar.f212487h = 0;
            aVar.f212490l = 2;
            Object objC = pVar.c(params, aVar);
            if (objC != objE) {
                processId2 = processId;
                i16 = i15;
                obj = objC;
                r18 = aVar2;
                iVar = (i) obj;
                r17 = r18;
                if (iVar instanceof i.Right) {
                    confirmedByMe = new n.ConfirmedByMe(processId2);
                    aVar.f212483d = vq.j.a(processId2);
                    aVar.f212484e = r18;
                    aVar.f212485f = iVar;
                    aVar.f212486g = i16;
                    aVar.f212487h = i18;
                    aVar.f212490l = 3;
                    if (o(confirmedByMe, aVar) != objE) {
                        iVar2 = iVar;
                        r16 = r18;
                        iVar = iVar2;
                        r17 = r16;
                    }
                }
                r17.r(null);
                return iVar;
            }
            return objE;
        } catch (Throwable th5) {
            th = th5;
            r15 = r18;
        }
    }

    @Override // wd3.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a0<n> b() {
        return this.confirmationStatus;
    }
}
