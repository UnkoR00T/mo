package xv1;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import lv1.DynamicDocument;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lxv1/q;", "Ll00/g;", "Lxv1/c;", "Lxv1/a;", "Lxv1/d;", "", "Lyy/a;", "stateMachineFactory", "Lyv1/f;", "mapper", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lpv1/c;", "getByIdDynamicDocumentsListDataUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lpv1/h;", "monitorDynamicDocumentsChangesUC", "Lmz3/v;", "removeDocumentDownloadStatusUseCase", "Lpv1/f;", "getDynamicListSingleDocumentStatusUC", "Lcb4/j;", "dialogVMSFactory", "Lyv1/d;", "dynamicDocumentListSorterMapper", "Lxv1/b;", "setupData", "<init>", "(Lyy/a;Lyv1/f;Lkv1/a;Lpv1/c;Lac4/a;Lpv1/h;Lmz3/v;Lpv1/f;Lcb4/j;Lyv1/d;Lxv1/b;)V", "state", "Lxv1/d$a;", "y9", "(Lxv1/c;)Lxv1/d$a;", "b", "Lyv1/f;", "c", "Lkv1/a;", "d", "Lpv1/c;", "e", "Lac4/a;", "f", "Lpv1/h;", "g", "Lmz3/v;", "h", "Lpv1/f;", "j", "Lcb4/j;", "k", "Lyv1/d;", "l", "Lxv1/b;", "Lxv1/c$a;", "m", "Lxv1/c$a;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxv1/a$e;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<xv1.c, xv1.a> implements xv1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yv1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pv1.c getByIdDynamicDocumentsListDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pv1.h monitorDynamicDocumentsChangesUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.v removeDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pv1.f getDynamicListSingleDocumentStatusUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final yv1.d dynamicDocumentListSorterMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xv1.c.a initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<xv1.c, xv1.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xv1.a.e> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<xv1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<xv1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f221506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f221507b;

        /* JADX INFO: renamed from: xv1.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5926a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f221508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f221509b;

            /* JADX INFO: renamed from: xv1.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5927a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f221510d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f221511e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f221512f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f221514h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f221515j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f221516k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f221517l;

                public C5927a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f221510d = obj;
                    this.f221511e |= PKIFailureInfo.systemUnavail;
                    return C5926a.this.F(null, this);
                }
            }

            public C5926a(mu.h hVar, q qVar) {
                this.f221508a = hVar;
                this.f221509b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5927a c5927a;
                if (eVar instanceof C5927a) {
                    c5927a = (C5927a) eVar;
                    int i15 = c5927a.f221511e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5927a.f221511e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5927a = new C5927a(eVar);
                    }
                } else {
                    c5927a = new C5927a(eVar);
                }
                Object obj2 = c5927a.f221510d;
                Object objE = uq.b.e();
                int i16 = c5927a.f221511e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f221508a;
                    xv1.d.a aVarY9 = this.f221509b.y9((xv1.c) obj);
                    c5927a.f221512f = vq.j.a(obj);
                    c5927a.f221514h = vq.j.a(c5927a);
                    c5927a.f221515j = vq.j.a(obj);
                    c5927a.f221516k = vq.j.a(hVar);
                    c5927a.f221517l = 0;
                    c5927a.f221511e = 1;
                    if (hVar.F(aVarY9, c5927a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f221506a = gVar;
            this.f221507b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xv1.d.a> hVar, tq.e eVar) {
            Object objA = this.f221506a.a(new C5926a(hVar, this.f221507b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxv1/a$b;", "<unused var>", "Lxv1/c;", "Loq/i0;", "<anonymous>", "(Lxv1/a$b;Lxv1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<xv1.a.b, xv1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221518e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221518e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                xv1.a.e.C5923a c5923a = xv1.a.e.C5923a.f221458a;
                this.f221518e = 1;
                if (qVar.F(c5923a, this) == objE) {
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
        public final Object w(xv1.a.b bVar, xv1.c cVar, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxv1/a$h;", "action", "Lxv1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxv1/a$h;Lxv1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<xv1.a.ToDocumentView, xv1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221521f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        
            if (r12.F(r2, r11) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f221521f
                xv1.a$h r0 = (xv1.a.ToDocumentView) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f221520e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                oq.u.b(r12)
                goto L94
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                goto L55
            L23:
                oq.u.b(r12)
                lz3.h r12 = r0.getDocumentStatus()
                lz3.h r2 = lz3.h.ALREADY_DOWNLOADED
                if (r12 != r2) goto L55
                xv1.q r12 = xv1.q.this
                mz3.v r12 = xv1.q.u9(r12)
                mz3.v$a r5 = new mz3.v$a
                xv1.q r2 = xv1.q.this
                xv1.b r2 = xv1.q.v9(r2)
                rq0.b$b r6 = r2.getDynamicDocumentType()
                java.lang.String r8 = r0.getDocumentIID()
                r9 = 2
                r10 = 0
                r7 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f221521f = r0
                r11.f221520e = r4
                java.lang.Object r12 = r12.c(r5, r11)
                if (r12 != r1) goto L55
                goto L93
            L55:
                xv1.q r12 = xv1.q.this
                xv1.a$e$c r2 = new xv1.a$e$c
                java.lang.String r4 = r0.getDocumentIID()
                if (r4 != 0) goto L6f
                dw1.h$b r4 = new dw1.h$b
                xv1.q r5 = xv1.q.this
                xv1.b r5 = xv1.q.v9(r5)
                rq0.b$b r5 = r5.getDynamicDocumentType()
                r4.<init>(r5)
                goto L82
            L6f:
                dw1.h$a r4 = new dw1.h$a
                xv1.q r5 = xv1.q.this
                xv1.b r5 = xv1.q.v9(r5)
                rq0.b$b r5 = r5.getDynamicDocumentType()
                java.lang.String r6 = r0.getDocumentIID()
                r4.<init>(r5, r6)
            L82:
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r11.f221521f = r0
                r11.f221520e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L94
            L93:
                return r1
            L94:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: xv1.q.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xv1.a.ToDocumentView toDocumentView, xv1.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = q.this.new c(eVar);
            cVar2.f221521f = toDocumentView;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxv1/c$a;", "it", "Loq/i0;", "<anonymous>", "(Lxv1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<xv1.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221523e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f221523e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(xv1.a.c.f221456a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(xv1.c.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxv1/a$c;", "<unused var>", "Lxv1/c$a;", "Loq/i0;", "<anonymous>", "(Lxv1/a$c;Lxv1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xv1.a.c, xv1.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221525e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f221527e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f221528f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f221528f = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objB;
                Object objE = uq.b.e();
                int i15 = this.f221527e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    kv1.a aVar = this.f221528f.dynamicDocumentContainersInteractor;
                    rq0.b.EnumC4479b dynamicDocumentType = this.f221528f.setupData.getDynamicDocumentType();
                    this.f221527e = 1;
                    obj = aVar.e(dynamicDocumentType, this);
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
                if (iVar instanceof dx.i.Left) {
                    objB = vq.b.a(false);
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVar).b();
                }
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                if (zBooleanValue) {
                    this.f221528f.d9(xv1.a.f.f221461a);
                } else {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    this.f221528f.d9(new xv1.a.ToDocumentView(null, null));
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f221528f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221525e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUseCase;
                a aVar2 = new a(q.this, null);
                this.f221525e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(xv1.a.c cVar, xv1.c.a aVar, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxv1/a$f;", "<unused var>", "Lk10/c0;", "Lxv1/c$a;", "state", "Lk10/l;", "Lxv1/c;", "<anonymous>", "(Lxv1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xv1.a.f, c0<xv1.c.a>, tq.e<? super k10.l<? extends xv1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221530f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lxv1/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends xv1.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f221532e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f221533f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f221534g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f221535h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f221536j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f221537k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f221538l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f221539m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f221540n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f221541p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f221542q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f221543r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f221544s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f221545t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f221546v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f221547w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f221548x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ q f221549y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ c0<xv1.c.a> f221550z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<xv1.c.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f221549y = qVar;
                this.f221550z = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final xv1.c.b.Screen V(List list, String str, xv1.c.a aVar) {
                return new xv1.c.b.Screen(list, str);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:27:0x014e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x014e -> B:28:0x0158). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 454
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xv1.q.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f221549y, this.f221550z, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends xv1.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f221530f;
            Object objE = uq.b.e();
            int i15 = this.f221529e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f221530f = vq.j.a(c0Var);
            this.f221529e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xv1.a.f fVar, c0<xv1.c.a> c0Var, tq.e<? super k10.l<? extends xv1.c>> eVar) {
            f fVar2 = q.this.new f(eVar);
            fVar2.f221530f = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxv1/c$b$b;", "state", "Lk10/l;", "Lxv1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<xv1.c.b.Screen>, tq.e<? super k10.l<? extends xv1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221552f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xv1.c.b.Screen O(q qVar, c0 c0Var, xv1.c.b.Screen screen) {
            return xv1.c.b.Screen.d(screen, qVar.dynamicDocumentListSorterMapper.b(new yv1.d.Input(qVar.setupData.getDynamicDocumentType(), ((xv1.c.b.Screen) c0Var.a()).b())), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f221552f;
            uq.b.e();
            if (this.f221551e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: xv1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O(qVar, c0Var, (c.b.Screen) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<xv1.c.b.Screen> c0Var, tq.e<? super k10.l<? extends xv1.c>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f221552f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Llv1/c;", "value", "Lk10/c0;", "Lxv1/c$b$b;", "state", "Lk10/l;", "Lxv1/c;", "<anonymous>", "(Ljava/util/List;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<List<? extends DynamicDocument>, c0<xv1.c.b.Screen>, tq.e<? super k10.l<? extends xv1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221556g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xv1.c.b.Screen O(q qVar, List list, xv1.c.b.Screen screen) {
            return xv1.c.b.Screen.d(screen, qVar.dynamicDocumentListSorterMapper.b(new yv1.d.Input(qVar.setupData.getDynamicDocumentType(), list)), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list = (List) this.f221555f;
            c0 c0Var = (c0) this.f221556g;
            uq.b.e();
            if (this.f221554e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: xv1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.h.O(qVar, list, (c.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(List<DynamicDocument> list, c0<xv1.c.b.Screen> c0Var, tq.e<? super k10.l<? extends xv1.c>> eVar) {
            h hVar = q.this.new h(eVar);
            hVar.f221555f = list;
            hVar.f221556g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxv1/a$a;", "<unused var>", "Lxv1/c$b$b;", "Loq/i0;", "<anonymous>", "(Lxv1/a$a;Lxv1/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xv1.a.C5922a, xv1.c.b.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f221559f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        
            if (r1.F(r3, r6) == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f221559f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f221558e
                cb4.d r0 = (cb4.DialogData) r0
                oq.u.b(r7)
                goto L6a
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L46
            L22:
                oq.u.b(r7)
                xv1.q r7 = xv1.q.this
                kv1.a r7 = xv1.q.q9(r7)
                xv1.q r1 = xv1.q.this
                xv1.b r1 = xv1.q.v9(r1)
                rq0.b$b r1 = r1.getDynamicDocumentType()
                xv1.q r4 = xv1.q.this
                xv1.a$d r5 = xv1.a.d.f221457a
                er.a r4 = xv1.q.m9(r4, r5)
                r6.f221559f = r3
                java.lang.Object r7 = r7.m(r1, r4, r6)
                if (r7 != r0) goto L46
                goto L69
            L46:
                cb4.d r7 = (cb4.DialogData) r7
                if (r7 == 0) goto L57
                xv1.q r0 = xv1.q.this
                xv1.a$g r1 = new xv1.a$g
                r1.<init>(r7)
                xv1.q.n9(r0, r1)
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L57:
                xv1.q r1 = xv1.q.this
                xv1.a$e$b r3 = xv1.a.e.b.f221459a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f221558e = r7
                r6.f221559f = r2
                java.lang.Object r7 = r1.F(r3, r6)
                if (r7 != r0) goto L6a
            L69:
                return r0
            L6a:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xv1.q.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xv1.a.C5922a c5922a, xv1.c.b.Screen screen, tq.e<? super i0> eVar) {
            return q.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxv1/a$g;", "action", "Lk10/c0;", "Lxv1/c$b$b;", "state", "Lk10/l;", "Lxv1/c;", "<anonymous>", "(Lxv1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<xv1.a.ShowDialog, c0<xv1.c.b.Screen>, tq.e<? super k10.l<? extends xv1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221563g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xv1.c.b.Dialog O(q qVar, xv1.a.ShowDialog showDialog, xv1.c.b.Screen screen) {
            return new xv1.c.b.Dialog(screen.b(), screen.getDocumentShortName(), qVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xv1.a.ShowDialog showDialog = (xv1.a.ShowDialog) this.f221562f;
            c0 c0Var = (c0) this.f221563g;
            uq.b.e();
            if (this.f221561e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: xv1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O(qVar, showDialog, (c.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xv1.a.ShowDialog showDialog, c0<xv1.c.b.Screen> c0Var, tq.e<? super k10.l<? extends xv1.c>> eVar) {
            j jVar = q.this.new j(eVar);
            jVar.f221562f = showDialog;
            jVar.f221563g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxv1/a$d;", "<unused var>", "Lk10/c0;", "Lxv1/c$b$a;", "state", "Lk10/l;", "Lxv1/c;", "<anonymous>", "(Lxv1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xv1.a.d, c0<xv1.c.b.Dialog>, tq.e<? super k10.l<? extends xv1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221566f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xv1.c.b.Screen O(xv1.c.b.Dialog dialog) {
            return new xv1.c.b.Screen(dialog.b(), dialog.getDocumentShortName());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f221566f;
            uq.b.e();
            if (this.f221565e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xv1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.k.O((c.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xv1.a.d dVar, c0<xv1.c.b.Dialog> c0Var, tq.e<? super k10.l<? extends xv1.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f221566f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, yv1.f fVar, kv1.a aVar2, pv1.c cVar, ac4.a aVar3, pv1.h hVar, mz3.v vVar, pv1.f fVar2, cb4.j jVar, yv1.d dVar, SetupData setupData) {
        this.mapper = fVar;
        this.dynamicDocumentContainersInteractor = aVar2;
        this.getByIdDynamicDocumentsListDataUC = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.monitorDynamicDocumentsChangesUC = hVar;
        this.removeDocumentDownloadStatusUseCase = vVar;
        this.getDynamicListSingleDocumentStatusUC = fVar2;
        this.dialogVMSFactory = jVar;
        this.dynamicDocumentListSorterMapper = dVar;
        this.setupData = setupData;
        xv1.c.a aVar4 = xv1.c.a.f221466a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: xv1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f221491a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), y9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(xv1.c.class), new er.l() { // from class: xv1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(this.f221488a, (z) obj);
            }
        });
        vVar.c(q0.c(xv1.c.a.class), new er.l() { // from class: xv1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f221489a, (z) obj);
            }
        });
        vVar.c(q0.c(xv1.c.b.Screen.class), new er.l() { // from class: xv1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f221490a, (z) obj);
            }
        });
        vVar.c(q0.c(xv1.c.b.Dialog.class), new er.l() { // from class: xv1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xv1.a.b.class), oVar, bVar);
        zVar.x(q0.c(xv1.a.ToDocumentView.class), oVar, qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, z zVar) {
        zVar.C(qVar.new d(null));
        e eVar = qVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xv1.a.c.class), oVar, eVar);
        zVar.v(q0.c(xv1.a.f.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(q qVar, z zVar) {
        zVar.A(qVar.new g(null));
        k10.k.m(zVar, (mu.g) qVar.monitorDynamicDocumentsChangesUC.a(gz.b.a.C1792a.f78542a), null, qVar.new h(null), 2, null);
        i iVar = qVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xv1.a.C5922a.class), oVar, iVar);
        zVar.v(q0.c(xv1.a.ShowDialog.class), oVar, qVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(z zVar) {
        k kVar = new k(null);
        zVar.v(q0.c(xv1.a.d.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xv1.d.a y9(xv1.c state) {
        return this.mapper.b(new yv1.f.Params(state, b9(xv1.a.b.f221455a), new er.p() { // from class: xv1.k
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q.z9(this.f221487a, (String) obj, (lz3.h) obj2);
            }
        }, b9(xv1.a.C5922a.f221454a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, String str, lz3.h hVar) {
        qVar.d9(new xv1.a.ToDocumentView(str, hVar));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<xv1.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<xv1.c, xv1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xv1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xv1.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
