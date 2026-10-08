package jd3;

import hd3.RailwayCardContainerData;
import hd3.RailwayCardData;
import hd3.RailwayCardFullData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ld3.UutCardBottomSheetData;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 p2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001qBq\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\"\u0010(\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020/2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00104\u001a\u000203*\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0016\u00107\u001a\u0004\u0018\u00010\u0003*\u000206H\u0082@¢\u0006\u0004\b7\u00108J \u0010<\u001a\u00020'2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020#H\u0082@¢\u0006\u0004\b<\u0010=J\u0018\u0010@\u001a\u00020'2\u0006\u0010?\u001a\u00020>H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020'H\u0096\u0001¢\u0006\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010b\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR,\u0010h\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR \u0010.\u001a\b\u0012\u0004\u0012\u00020/0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020n0*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010-¨\u0006r"}, d2 = {"Ljd3/l0;", "Ll00/g;", "Ln20/b;", "Ljd3/n;", "Ln20/a;", "Ljd3/o;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lkd3/t;", "uutCardScreenMapper", "Lkd3/n;", "errorMapper", "Lez/a;", "currentTimeProvider", "snackBarManagerStateHolder", "Lmx/c;", "labelProvider", "Lkd3/b;", "uutDialogMapper", "Lc54/b;", "isFeatureEnabledUseCase", "Lo20/t2$a;", "deps", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lgd3/a;", "uutContainersInteractor", "<init>", "(Ln20/j;Lac4/a;Lkd3/t;Lkd3/n;Lez/a;Li70/n;Lmx/c;Lkd3/b;Lc54/b;Lo20/t2$a;Lmz3/z;Lmz3/w;Lgd3/a;)V", "", "documentId", "Lmz3/z$b;", "updateMethodType", "Loq/i0;", "Z9", "(Ljava/lang/String;Lmz3/z$b;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Ljava/time/OffsetDateTime;", "G9", "()Lmu/g;", "state", "Ljd3/o$a;", "L9", "(Ln20/b;)Ljd3/o$a;", "Lkd3/n$b;", "Ljd3/i$b;", "J9", "(Lkd3/n$b;)Ljd3/i$b;", "Lhd3/f;", "S9", "(Lhd3/f;Ltq/e;)Ljava/lang/Object;", "Lhd3/c;", "selectedCardStatus", "batchAndCardNumber", "I9", "(Lhd3/c;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lac4/a;", "c", "Lkd3/t;", "d", "Lkd3/n;", "e", "Lez/a;", "f", "Li70/n;", "g", "Lmx/c;", "h", "Lkd3/b;", "j", "Lc54/b;", "k", "Lo20/t2$a;", "l", "Lmz3/z;", "m", "Lmz3/w;", "n", "Lgd3/a;", "Lxw/b;", "Ljd3/i;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "Li70/p;", "snackBarVisibilityState", "s", "a", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 extends l00.g<State<jd3.n>, n20.a> implements jd3.o, zx.b, i70.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f101949t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final rq0.b.d f101950v = rq0.b.d.RAILWAY_CARD;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kd3.t uutCardScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kd3.n errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kd3.b uutDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final gd3.a uutContainersInteractor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<jd3.n>, n20.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jd3.i> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<jd3.o.a> state = a9(new d(e9().getState(), this), jd3.o.a.b.f102116a);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljd3/j;", "<unused var>", "Ljd3/n;", "Loq/i0;", "<anonymous>", "(Ljd3/j;Ljd3/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<jd3.j, jd3.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f101967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f101968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f101969h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f101970j;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (r1.F(r4, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f101970j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f101967f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f101966e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L6c
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L40
            L26:
                oq.u.b(r6)
                jd3.l0 r6 = jd3.l0.this
                gd3.a r6 = jd3.l0.z9(r6)
                jd3.l0 r1 = jd3.l0.this
                jd3.f r4 = jd3.f.f101931a
                er.a r1 = jd3.l0.s9(r1, r4)
                r5.f101970j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                jd3.l0 r1 = jd3.l0.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                jd3.i$e r4 = new jd3.i$e
                r4.<init>(r3)
                r5.f101966e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f101967f = r6
                r6 = 0
                r5.f101968g = r6
                r5.f101969h = r6
                r5.f101970j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jd3.l0.a0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.j jVar, jd3.n nVar, tq.e<? super oq.i0> eVar) {
            return l0.this.new a0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Ljava/time/OffsetDateTime;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<mu.h<? super OffsetDateTime>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f101973f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:11:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f101973f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f101972e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                oq.u.b(r8)
                goto L39
            L1f:
                oq.u.b(r8)
            L22:
                tq.i r8 = r7.getContext()
                boolean r8 = ju.g2.n(r8)
                if (r8 == 0) goto L4e
                r7.f101973f = r0
                r7.f101972e = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L39
                goto L4d
            L39:
                jd3.l0 r8 = jd3.l0.this
                ez.a r8 = jd3.l0.v9(r8)
                java.time.OffsetDateTime r8 = r8.f()
                r7.f101973f = r0
                r7.f101972e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L22
            L4d:
                return r1
            L4e:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jd3.l0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super OffsetDateTime> hVar, tq.e<? super oq.i0> eVar) {
            return ((b) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = l0.this.new b(eVar);
            bVar.f101973f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/l;", "action", "Ljd3/n;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljd3/l;Ljd3/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<ShowUutDialog, jd3.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101976f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowUutDialog showUutDialog = (ShowUutDialog) this.f101976f;
            Object objE = uq.b.e();
            int i15 = this.f101975e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<jd3.i> bVarY1 = l0.this.Y1();
                jd3.i.ShowDialog showDialog = new jd3.i.ShowDialog(l0.this.uutDialogMapper.b(showUutDialog.getDialogType()));
                this.f101976f = vq.j.a(showUutDialog);
                this.f101975e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowUutDialog showUutDialog, jd3.n nVar, tq.e<? super oq.i0> eVar) {
            b0 b0Var = l0.this.new b0(eVar);
            b0Var.f101976f = showUutDialog;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f101979e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f101981g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101979e = obj;
            this.f101981g |= PKIFailureInfo.systemUnavail;
            return l0.this.S9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f101984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f101985g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f101986h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f101987j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f101988k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f101989l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f101991n;

        c0(tq.e<? super c0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101989l = obj;
            this.f101991n |= PKIFailureInfo.systemUnavail;
            return l0.this.Z9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<jd3.o.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f101992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f101993b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f101994a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f101995b;

            /* JADX INFO: renamed from: jd3.l0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2412a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f101996d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f101997e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f101998f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f102000h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f102001j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f102002k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f102003l;

                public C2412a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f101996d = obj;
                    this.f101997e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l0 l0Var) {
                this.f101994a = hVar;
                this.f101995b = l0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2412a c2412a;
                if (eVar instanceof C2412a) {
                    c2412a = (C2412a) eVar;
                    int i15 = c2412a.f101997e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2412a.f101997e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2412a = new C2412a(eVar);
                    }
                } else {
                    c2412a = new C2412a(eVar);
                }
                Object obj2 = c2412a.f101996d;
                Object objE = uq.b.e();
                int i16 = c2412a.f101997e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f101994a;
                    jd3.o.a aVarL9 = this.f101995b.L9((State) obj);
                    c2412a.f101998f = vq.j.a(obj);
                    c2412a.f102000h = vq.j.a(c2412a);
                    c2412a.f102001j = vq.j.a(obj);
                    c2412a.f102002k = vq.j.a(hVar);
                    c2412a.f102003l = 0;
                    c2412a.f101997e = 1;
                    if (hVar.F(aVarL9, c2412a) == objE) {
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

        public d(mu.g gVar, l0 l0Var) {
            this.f101992a = gVar;
            this.f101993b = l0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super jd3.o.a> hVar, tq.e eVar) {
            Object objA = this.f101992a.a(new a(hVar, this.f101993b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljd3/n$b;", "it", "Loq/i0;", "<anonymous>", "(Ljd3/n$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<jd3.n.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102004e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r7.F(r1, r6) == r0) goto L17;
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
                int r1 = r6.f102004e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                oq.u.b(r7)
                goto L6c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L39
            L1e:
                oq.u.b(r7)
                jd3.l0 r7 = jd3.l0.this
                mz3.w r7 = jd3.l0.y9(r7)
                mz3.w$a r1 = new mz3.w$a
                rq0.b$d r4 = jd3.l0.w9()
                r1.<init>(r4)
                r6.f102004e = r2
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L39
                goto L5c
            L39:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r1 = r7 instanceof mz3.w.b.NotReady
                if (r1 == 0) goto L5d
                jd3.l0 r7 = jd3.l0.this
                xw.b r7 = r7.Y1()
                jd3.i$d r1 = new jd3.i$d
                gv3.b$b r2 = new gv3.b$b
                rq0.b$d r4 = jd3.l0.w9()
                r5 = 0
                r2.<init>(r4, r5, r3, r5)
                r1.<init>(r2)
                r6.f102004e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto L6c
            L5c:
                return r0
            L5d:
                mz3.w$b$b r0 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r0)
                if (r7 == 0) goto L6f
                jd3.l0 r7 = jd3.l0.this
                jd3.h r0 = jd3.h.f101935a
                jd3.l0.t9(r7, r0)
            L6c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L6f:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jd3.l0.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(jd3.n.b bVar, tq.e<? super oq.i0> eVar) {
            return ((e) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l0.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljd3/a;", "<unused var>", "Ljd3/n$b;", "Loq/i0;", "<anonymous>", "(Ljd3/a;Ljd3/n$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a, jd3.n.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102006e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102006e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<jd3.i> bVarY1 = l0.this.Y1();
                jd3.i.a aVar = jd3.i.a.f101937a;
                this.f102006e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, jd3.n.b bVar, tq.e<? super oq.i0> eVar) {
            return l0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljd3/f;", "<unused var>", "Ljd3/n$b;", "Loq/i0;", "<anonymous>", "(Ljd3/f;Ljd3/n$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jd3.f, jd3.n.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102008e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f102008e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L42
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L31
            L1e:
                oq.u.b(r5)
                jd3.l0 r5 = jd3.l0.this
                gd3.a r5 = jd3.l0.z9(r5)
                r4.f102008e = r3
                r1 = 0
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L31
                goto L41
            L31:
                jd3.l0 r5 = jd3.l0.this
                xw.b r5 = r5.Y1()
                jd3.i$a r1 = jd3.i.a.f101937a
                r4.f102008e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: jd3.l0.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.f fVar, jd3.n.b bVar, tq.e<? super oq.i0> eVar) {
            return l0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/a;", "<unused var>", "Lk10/c0;", "Ljd3/n$a;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a, k10.c0<jd3.n.DataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102011f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.DataLoaded O(k10.c0 c0Var, jd3.n.DataLoaded dataLoaded) {
            return jd3.n.DataLoaded.b(dataLoaded, null, null, ((jd3.n.DataLoaded) c0Var.a()).getOwnCard(), null, null, false, null, null, null, 507, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f102011f;
            Object objE = uq.b.e();
            int i15 = this.f102010e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((jd3.n.DataLoaded) c0Var.a()).getBottomSheetValue() != g30.v.HIDDEN) {
                    l0.this.d9(jd3.d.f101927a);
                    return c0Var.c();
                }
                boolean zL = ((jd3.n.DataLoaded) c0Var.a()).getSelectedCard().getScope().getData().l();
                if (!zL) {
                    if (zL) {
                        throw new oq.p();
                    }
                    return c0Var.b(new er.l() { // from class: jd3.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.h.O(c0Var, (n.DataLoaded) obj2);
                        }
                    });
                }
                xw.b<jd3.i> bVarY1 = l0.this.Y1();
                jd3.i.a aVar = jd3.i.a.f101937a;
                this.f102011f = c0Var;
                this.f102010e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, k10.c0<jd3.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            h hVar = l0.this.new h(eVar);
            hVar.f102011f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/c;", "action", "Lk10/c0;", "Ljd3/n$a;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ChangeSwitchItem, k10.c0<jd3.n.DataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102015g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.DataLoaded O(ChangeSwitchItem changeSwitchItem, jd3.n.DataLoaded dataLoaded) {
            return jd3.n.DataLoaded.b(dataLoaded, null, null, null, changeSwitchItem.getNewItem(), null, false, null, null, null, 503, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeSwitchItem changeSwitchItem = (ChangeSwitchItem) this.f102014f;
            k10.c0 c0Var = (k10.c0) this.f102015g;
            uq.b.e();
            if (this.f102013e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.i.O(changeSwitchItem, (n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeSwitchItem changeSwitchItem, k10.c0<jd3.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            i iVar = new i(eVar);
            iVar.f102014f = changeSwitchItem;
            iVar.f102015g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/b;", "action", "Lk10/c0;", "Ljd3/n$a;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ChangeCard, k10.c0<jd3.n.DataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102018g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.DataLoaded O(ChangeCard changeCard, jd3.n.DataLoaded dataLoaded) {
            return jd3.n.DataLoaded.b(dataLoaded, null, null, changeCard.getCard(), null, null, false, null, null, null, 507, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeCard changeCard = (ChangeCard) this.f102017f;
            k10.c0 c0Var = (k10.c0) this.f102018g;
            uq.b.e();
            if (this.f102016e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.j.O(changeCard, (n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeCard changeCard, k10.c0<jd3.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            j jVar = new j(eVar);
            jVar.f102017f = changeCard;
            jVar.f102018g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/k;", "action", "Lk10/c0;", "Ljd3/n$a;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ShowQrCode, k10.c0<jd3.n.DataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102021g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.DataLoaded O(ShowQrCode showQrCode, jd3.n.DataLoaded dataLoaded) {
            return jd3.n.DataLoaded.b(dataLoaded, null, null, null, null, null, false, g30.v.EXPANDED, showQrCode.getData(), null, 319, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowQrCode showQrCode = (ShowQrCode) this.f102020f;
            k10.c0 c0Var = (k10.c0) this.f102021g;
            uq.b.e();
            if (this.f102019e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.k.O(showQrCode, (n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowQrCode showQrCode, k10.c0<jd3.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            k kVar = new k(eVar);
            kVar.f102020f = showQrCode;
            kVar.f102021g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/d;", "<unused var>", "Lk10/c0;", "Ljd3/n$a;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<jd3.d, k10.c0<jd3.n.DataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102023f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.DataLoaded O(jd3.n.DataLoaded dataLoaded) {
            return jd3.n.DataLoaded.b(dataLoaded, null, null, null, null, null, false, g30.v.HIDDEN, null, null, 447, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102023f;
            uq.b.e();
            if (this.f102022e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.l.O((n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.d dVar, k10.c0<jd3.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            l lVar = new l(eVar);
            lVar.f102023f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/e;", "<unused var>", "Lk10/c0;", "Ljd3/n$a;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<jd3.e, k10.c0<jd3.n.DataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102025f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.DataLoaded O(jd3.n.DataLoaded dataLoaded) {
            return jd3.n.DataLoaded.b(dataLoaded, null, null, null, null, null, false, null, null, null, 479, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102025f;
            uq.b.e();
            if (this.f102024e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.m.O((n.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.e eVar, k10.c0<jd3.n.DataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar2) {
            m mVar = new m(eVar2);
            mVar.f102025f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/g;", "action", "Ljd3/n$a;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/g;Ljd3/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<GoToVerificationProcess, jd3.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102028g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToVerificationProcess goToVerificationProcess = (GoToVerificationProcess) this.f102027f;
            jd3.n.DataLoaded dataLoaded = (jd3.n.DataLoaded) this.f102028g;
            Object objE = uq.b.e();
            int i15 = this.f102026e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                hd3.c documentStatus = dataLoaded.getSelectedCard().getDocumentStatus();
                String batchAndCardNumber = goToVerificationProcess.getBatchAndCardNumber();
                this.f102027f = vq.j.a(goToVerificationProcess);
                this.f102028g = vq.j.a(dataLoaded);
                this.f102026e = 1;
                if (l0Var.I9(documentStatus, batchAndCardNumber, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToVerificationProcess goToVerificationProcess, jd3.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            n nVar = l0.this.new n(eVar);
            nVar.f102027f = goToVerificationProcess;
            nVar.f102028g = dataLoaded;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/f;", "<unused var>", "Ljd3/n$a;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/f;Ljd3/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jd3.f, jd3.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102031f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (r7.F(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f102031f
                jd3.n$a r0 = (jd3.n.DataLoaded) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f102030e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L59
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L42
            L22:
                oq.u.b(r7)
                jd3.l0 r7 = jd3.l0.this
                gd3.a r7 = jd3.l0.z9(r7)
                hd3.f r2 = r0.getUutCardData()
                java.lang.String r2 = r2.getParentId()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f102031f = r5
                r6.f102030e = r4
                java.lang.Object r7 = r7.b(r2, r6)
                if (r7 != r1) goto L42
                goto L58
            L42:
                jd3.l0 r7 = jd3.l0.this
                xw.b r7 = r7.Y1()
                jd3.i$a r2 = jd3.i.a.f101937a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f102031f = r0
                r6.f102030e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jd3.l0.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.f fVar, jd3.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            o oVar = l0.this.new o(eVar);
            oVar.f102031f = dataLoaded;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/m;", "event", "Ljd3/n$a;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/m;Ljd3/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<UpdateDocument, jd3.n.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102035g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            UpdateDocument updateDocument = (UpdateDocument) this.f102034f;
            jd3.n.DataLoaded dataLoaded = (jd3.n.DataLoaded) this.f102035g;
            Object objE = uq.b.e();
            int i15 = this.f102033e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.z.b updateMethodType = updateDocument.getUpdateMethodType();
                String parentId = dataLoaded.getUutCardData().getParentId();
                l0 l0Var = l0.this;
                this.f102034f = vq.j.a(updateDocument);
                this.f102035g = vq.j.a(dataLoaded);
                this.f102033e = 1;
                if (l0Var.Z9(parentId, updateMethodType, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, jd3.n.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            p pVar = l0.this.new p(eVar);
            pVar.f102034f = updateDocument;
            pVar.f102035g = dataLoaded;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/time/OffsetDateTime;", "currentDateTime", "Lk10/c0;", "Ljd3/n$c;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljava/time/OffsetDateTime;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<OffsetDateTime, k10.c0<jd3.n.PackageDataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102039g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded O(OffsetDateTime offsetDateTime, jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, null, null, offsetDateTime, false, false, null, null, null, 2015, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OffsetDateTime offsetDateTime = (OffsetDateTime) this.f102038f;
            k10.c0 c0Var = (k10.c0) this.f102039g;
            uq.b.e();
            if (this.f102037e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.q.O(offsetDateTime, (n.PackageDataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OffsetDateTime offsetDateTime, k10.c0<jd3.n.PackageDataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            q qVar = new q(eVar);
            qVar.f102038f = offsetDateTime;
            qVar.f102039g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/c;", "action", "Lk10/c0;", "Ljd3/n$c;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ChangeSwitchItem, k10.c0<jd3.n.PackageDataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102042g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102043a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f102043a = iArr;
            }
        }

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded V(ChangeSwitchItem changeSwitchItem, k10.c0 c0Var, jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, ((jd3.n.PackageDataLoaded) c0Var.a()).getOwnCard(), changeSwitchItem.getNewItem(), null, false, false, null, null, null, 2023, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded X(ChangeSwitchItem changeSwitchItem, k10.c0 c0Var, jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, ((jd3.n.PackageDataLoaded) c0Var.a()).getAnotherOwnCard(), changeSwitchItem.getNewItem(), null, false, false, null, null, null, 2023, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeSwitchItem changeSwitchItem = (ChangeSwitchItem) this.f102041f;
            final k10.c0 c0Var = (k10.c0) this.f102042g;
            uq.b.e();
            if (this.f102040e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f102043a[changeSwitchItem.getNewItem().ordinal()];
            if (i15 == 1) {
                return c0Var.b(new er.l() { // from class: jd3.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.r.V(changeSwitchItem, c0Var, (n.PackageDataLoaded) obj2);
                    }
                });
            }
            if (i15 == 2) {
                return c0Var.b(new er.l() { // from class: jd3.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.r.X(changeSwitchItem, c0Var, (n.PackageDataLoaded) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeSwitchItem changeSwitchItem, k10.c0<jd3.n.PackageDataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            r rVar = new r(eVar);
            rVar.f102041f = changeSwitchItem;
            rVar.f102042g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/e;", "<unused var>", "Lk10/c0;", "Ljd3/n$c;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<jd3.e, k10.c0<jd3.n.PackageDataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102045f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102046a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f102046a = iArr;
            }
        }

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded V(jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, null, null, null, false, false, null, null, null, 1983, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded X(jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, null, null, null, false, false, null, null, null, 1919, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102045f;
            uq.b.e();
            if (this.f102044e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f102046a[((jd3.n.PackageDataLoaded) c0Var.a()).getSelectedItem().ordinal()];
            if (i15 == 1) {
                return c0Var.b(new er.l() { // from class: jd3.v0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.s.V((n.PackageDataLoaded) obj2);
                    }
                });
            }
            if (i15 == 2) {
                return c0Var.b(new er.l() { // from class: jd3.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.s.X((n.PackageDataLoaded) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.e eVar, k10.c0<jd3.n.PackageDataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar2) {
            s sVar = new s(eVar2);
            sVar.f102045f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/a;", "<unused var>", "Ljd3/n$c;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/a;Ljd3/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<jd3.a, jd3.n.PackageDataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102048f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102050a;

            static {
                int[] iArr = new int[g30.v.values().length];
                try {
                    iArr[g30.v.HIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f102050a = iArr;
            }
        }

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jd3.n.PackageDataLoaded packageDataLoaded = (jd3.n.PackageDataLoaded) this.f102048f;
            Object objE = uq.b.e();
            int i15 = this.f102047e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (a.f102050a[packageDataLoaded.getBottomSheetValue().ordinal()] == 1) {
                    xw.b<jd3.i> bVarY1 = l0.this.Y1();
                    jd3.i.a aVar = jd3.i.a.f101937a;
                    this.f102048f = vq.j.a(packageDataLoaded);
                    this.f102047e = 1;
                    if (bVarY1.F(aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    l0.this.d9(jd3.d.f101927a);
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.a aVar, jd3.n.PackageDataLoaded packageDataLoaded, tq.e<? super oq.i0> eVar) {
            t tVar = l0.this.new t(eVar);
            tVar.f102048f = packageDataLoaded;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/k;", "action", "Lk10/c0;", "Ljd3/n$c;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<ShowQrCode, k10.c0<jd3.n.PackageDataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102053g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded O(ShowQrCode showQrCode, jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, null, null, null, false, false, g30.v.EXPANDED, showQrCode.getData(), null, 1279, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowQrCode showQrCode = (ShowQrCode) this.f102052f;
            k10.c0 c0Var = (k10.c0) this.f102053g;
            uq.b.e();
            if (this.f102051e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.u.O(showQrCode, (n.PackageDataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowQrCode showQrCode, k10.c0<jd3.n.PackageDataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            u uVar = new u(eVar);
            uVar.f102052f = showQrCode;
            uVar.f102053g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljd3/d;", "<unused var>", "Lk10/c0;", "Ljd3/n$c;", "state", "Lk10/l;", "Ljd3/n;", "<anonymous>", "(Ljd3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<jd3.d, k10.c0<jd3.n.PackageDataLoaded>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102055f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3.n.PackageDataLoaded O(jd3.n.PackageDataLoaded packageDataLoaded) {
            return jd3.n.PackageDataLoaded.b(packageDataLoaded, null, null, null, null, null, null, false, false, g30.v.HIDDEN, null, null, 1791, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102055f;
            uq.b.e();
            if (this.f102054e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jd3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.v.O((n.PackageDataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.d dVar, k10.c0<jd3.n.PackageDataLoaded> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            v vVar = new v(eVar);
            vVar.f102055f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/g;", "action", "Ljd3/n$c;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/g;Ljd3/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<GoToVerificationProcess, jd3.n.PackageDataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102058g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToVerificationProcess goToVerificationProcess = (GoToVerificationProcess) this.f102057f;
            jd3.n.PackageDataLoaded packageDataLoaded = (jd3.n.PackageDataLoaded) this.f102058g;
            Object objE = uq.b.e();
            int i15 = this.f102056e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                hd3.c documentStatus = packageDataLoaded.getSelectedCard().getDocumentStatus();
                String batchAndCardNumber = goToVerificationProcess.getBatchAndCardNumber();
                this.f102057f = vq.j.a(goToVerificationProcess);
                this.f102058g = vq.j.a(packageDataLoaded);
                this.f102056e = 1;
                if (l0Var.I9(documentStatus, batchAndCardNumber, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToVerificationProcess goToVerificationProcess, jd3.n.PackageDataLoaded packageDataLoaded, tq.e<? super oq.i0> eVar) {
            w wVar = l0.this.new w(eVar);
            wVar.f102057f = goToVerificationProcess;
            wVar.f102058g = packageDataLoaded;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/f;", "<unused var>", "Ljd3/n$c;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/f;Ljd3/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<jd3.f, jd3.n.PackageDataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102061f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r7.F(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f102061f
                jd3.n$c r0 = (jd3.n.PackageDataLoaded) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f102060e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L55
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L3e
            L22:
                oq.u.b(r7)
                jd3.l0 r7 = jd3.l0.this
                gd3.a r7 = jd3.l0.z9(r7)
                java.lang.String r2 = r0.getDocumentParentId()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f102061f = r5
                r6.f102060e = r4
                java.lang.Object r7 = r7.b(r2, r6)
                if (r7 != r1) goto L3e
                goto L54
            L3e:
                jd3.l0 r7 = jd3.l0.this
                xw.b r7 = r7.Y1()
                jd3.i$a r2 = jd3.i.a.f101937a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f102061f = r0
                r6.f102060e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L55
            L54:
                return r1
            L55:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jd3.l0.x.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.f fVar, jd3.n.PackageDataLoaded packageDataLoaded, tq.e<? super oq.i0> eVar) {
            x xVar = l0.this.new x(eVar);
            xVar.f102061f = packageDataLoaded;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljd3/m;", "event", "Ljd3/n$c;", "state", "Loq/i0;", "<anonymous>", "(Ljd3/m;Ljd3/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<UpdateDocument, jd3.n.PackageDataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102065g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            UpdateDocument updateDocument = (UpdateDocument) this.f102064f;
            jd3.n.PackageDataLoaded packageDataLoaded = (jd3.n.PackageDataLoaded) this.f102065g;
            Object objE = uq.b.e();
            int i15 = this.f102063e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.z.b updateMethodType = updateDocument.getUpdateMethodType();
                String documentParentId = packageDataLoaded.getDocumentParentId();
                l0 l0Var = l0.this;
                this.f102064f = vq.j.a(updateDocument);
                this.f102065g = vq.j.a(packageDataLoaded);
                this.f102063e = 1;
                if (l0Var.Z9(documentParentId, updateMethodType, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, jd3.n.PackageDataLoaded packageDataLoaded, tq.e<? super oq.i0> eVar) {
            y yVar = l0.this.new y(eVar);
            yVar.f102064f = updateDocument;
            yVar.f102065g = packageDataLoaded;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljd3/h;", "<unused var>", "Lk10/c0;", "Ljd3/n;", "state", "Lk10/l;", "<anonymous>", "(Ljd3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<jd3.h, k10.c0<jd3.n>, tq.e<? super k10.l<? extends jd3.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102068f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k10.z<jd3.n, jd3.n, n20.a> f102070h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljd3/n;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jd3.n>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f102071e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f102072f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f102073g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f102074h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f102075j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f102076k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f102077l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f102078m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f102079n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ l0 f102080p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<jd3.n> f102081q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k10.z<jd3.n, jd3.n, n20.a> f102082r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, k10.c0<jd3.n> c0Var, k10.z<jd3.n, jd3.n, n20.a> zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f102080p = l0Var;
                this.f102081q = c0Var;
                this.f102082r = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jd3.n V(jd3.n nVar, jd3.n nVar2) {
                return nVar;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x0138  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                l0 l0Var;
                k10.z<jd3.n, jd3.n, n20.a> zVar;
                RailwayCardFullData railwayCardFullData;
                k10.c0<jd3.n> c0Var;
                int i15;
                int i16;
                k10.c0<jd3.n> c0Var2;
                final jd3.n nVar;
                xw.b<jd3.i> bVarY1;
                jd3.i.Error errorJ9;
                k10.c0<jd3.n> c0Var3;
                Object objD;
                Object objE = uq.b.e();
                int i17 = this.f102079n;
                if (i17 == 0) {
                    oq.u.b(obj);
                    gd3.a aVar = this.f102080p.uutContainersInteractor;
                    this.f102079n = 1;
                    obj = aVar.e(this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        c0Var2 = (k10.c0) this.f102072f;
                        oq.u.b(obj);
                        return c0Var2.c();
                    }
                    if (i17 == 3) {
                        i15 = this.f102077l;
                        i16 = this.f102076k;
                        railwayCardFullData = (RailwayCardFullData) this.f102075j;
                        c0Var = (k10.c0) this.f102074h;
                        zVar = (k10.z) this.f102073g;
                        l0Var = (l0) this.f102072f;
                        iVar = (dx.i) this.f102071e;
                        oq.u.b(obj);
                        nVar = (jd3.n) obj;
                        if (nVar == null && (objD = c0Var.d(new er.l() { // from class: jd3.z0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return l0.z.a.V(nVar, (n) obj2);
                            }
                        })) != null) {
                            return objD;
                        }
                        bVarY1 = l0Var.Y1();
                        errorJ9 = l0Var.J9(new kd3.n.b.GetDocument(l0Var.errorMapper.h()));
                        this.f102071e = vq.j.a(iVar);
                        this.f102072f = c0Var;
                        this.f102073g = vq.j.a(railwayCardFullData);
                        this.f102074h = vq.j.a(zVar);
                        this.f102075j = null;
                        this.f102076k = i16;
                        this.f102077l = i15;
                        this.f102078m = 0;
                        this.f102079n = 4;
                        if (bVarY1.F(errorJ9, this) != objE) {
                            c0Var3 = c0Var;
                        }
                        return objE;
                    }
                    if (i17 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var3 = (k10.c0) this.f102072f;
                    oq.u.b(obj);
                    return c0Var3.c();
                }
                oq.u.b(obj);
                iVar = (dx.i) obj;
                l0Var = this.f102080p;
                k10.c0<jd3.n> c0Var4 = this.f102081q;
                zVar = this.f102082r;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    xw.b<jd3.i> bVarY2 = l0Var.Y1();
                    jd3.i.Error errorJ10 = l0Var.J9(new kd3.n.b.GetDocument(bVar));
                    this.f102071e = vq.j.a(iVar);
                    this.f102072f = c0Var4;
                    this.f102073g = vq.j.a(bVar);
                    this.f102076k = 0;
                    this.f102077l = 0;
                    this.f102079n = 2;
                    if (bVarY2.F(errorJ10, this) != objE) {
                        c0Var2 = c0Var4;
                        return c0Var2.c();
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    railwayCardFullData = (RailwayCardFullData) ((dx.i.Right) iVar).b();
                    this.f102071e = vq.j.a(iVar);
                    this.f102072f = l0Var;
                    this.f102073g = zVar;
                    this.f102074h = c0Var4;
                    this.f102075j = vq.j.a(railwayCardFullData);
                    this.f102076k = 0;
                    this.f102077l = 0;
                    this.f102079n = 3;
                    Object objS9 = l0Var.S9(railwayCardFullData, this);
                    if (objS9 != objE) {
                        c0Var = c0Var4;
                        obj = objS9;
                        i15 = 0;
                        i16 = 0;
                        nVar = (jd3.n) obj;
                        if (nVar == null) {
                        }
                        bVarY1 = l0Var.Y1();
                        errorJ9 = l0Var.J9(new kd3.n.b.GetDocument(l0Var.errorMapper.h()));
                        this.f102071e = vq.j.a(iVar);
                        this.f102072f = c0Var;
                        this.f102073g = vq.j.a(railwayCardFullData);
                        this.f102074h = vq.j.a(zVar);
                        this.f102075j = null;
                        this.f102076k = i16;
                        this.f102077l = i15;
                        this.f102078m = 0;
                        this.f102079n = 4;
                        if (bVarY1.F(errorJ9, this) != objE) {
                            c0Var3 = c0Var;
                            return c0Var3.c();
                        }
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f102080p, this.f102081q, this.f102082r, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jd3.n>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(k10.z<jd3.n, jd3.n, n20.a> zVar, tq.e<? super z> eVar) {
            super(3, eVar);
            this.f102070h = zVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102068f;
            Object objE = uq.b.e();
            int i15 = this.f102067e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = l0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l0.this, c0Var, this.f102070h, null);
            this.f102068f = vq.j.a(c0Var);
            this.f102067e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jd3.h hVar, k10.c0<jd3.n> c0Var, tq.e<? super k10.l<? extends jd3.n>> eVar) {
            z zVar = l0.this.new z(this.f102070h, eVar);
            zVar.f102068f = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public l0(n20.j jVar, ac4.a aVar, kd3.t tVar, kd3.n nVar, ez.a aVar2, i70.n nVar2, mx.c cVar, kd3.b bVar, c54.b bVar2, t2.a aVar3, mz3.z zVar, mz3.w wVar, gd3.a aVar4) {
        this.callActionWithLoaderUseCase = aVar;
        this.uutCardScreenMapper = tVar;
        this.errorMapper = nVar;
        this.currentTimeProvider = aVar2;
        this.snackBarManagerStateHolder = nVar2;
        this.labelProvider = cVar;
        this.uutDialogMapper = bVar;
        this.isFeatureEnabledUseCase = bVar2;
        this.deps = aVar3;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.uutContainersInteractor = aVar4;
        this.stateMachine = jVar.a(jd3.n.b.f102094a, new er.l() { // from class: jd3.z
            @Override // er.l
            public final Object b(Object obj) {
                return l0.U9(this.f102144a, (k10.v) obj);
            }
        });
    }

    private final mu.g<OffsetDateTime> G9() {
        return mu.i.I(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I9(hd3.c cVar, String str, tq.e<? super oq.i0> eVar) {
        if (!this.isFeatureEnabledUseCase.a(b54.c.ALERT_ON_VERIFICATION).booleanValue() || cVar.e()) {
            Object objF = Y1().F(new jd3.i.GoToVerification(str), eVar);
            return objF == uq.b.e() ? objF : oq.i0.f148189a;
        }
        d9(new ShowUutDialog(new kd3.u.Refresh(b9(new UpdateDocument(mz3.z.b.UPDATE)))));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jd3.i.Error J9(final kd3.n.b bVar) {
        return new jd3.i.Error(this.errorMapper.b(new kd3.n.Params(bVar, b9(a.f101917a), b9(jd3.f.f101931a), new er.a() { // from class: jd3.b0
            @Override // er.a
            public final Object a() {
                return l0.K9(bVar, this);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(kd3.n.b bVar, l0 l0Var) {
        if (bVar instanceof kd3.n.b.UpdateDocument) {
            l0Var.d9(new UpdateDocument(((kd3.n.b.UpdateDocument) bVar).getUpdateMethodType()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jd3.o.a L9(State<jd3.n> state) {
        return this.uutCardScreenMapper.b(new kd3.t.Params(state, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), new er.l() { // from class: jd3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.M9(this.f101925a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: jd3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.N9(this.f101928a, (mz3.z.b) obj);
            }
        }, new er.l() { // from class: jd3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.O9(this.f101930a, (RailwayCardData) obj);
            }
        }, new er.l() { // from class: jd3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.P9(this.f101932a, (UutCardBottomSheetData) obj);
            }
        }, new er.l() { // from class: jd3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.Q9(this.f101934a, (String) obj);
            }
        }, b9(jd3.j.f101943a), new er.l() { // from class: jd3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.R9(this.f101936a, (n20.a) obj);
            }
        }, b9(jd3.e.f101929a), b9(a.f101917a), b9(jd3.d.f101927a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(l0 l0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        l0Var.d9(new ChangeSwitchItem(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(l0 l0Var, mz3.z.b bVar) {
        l0Var.d9(new UpdateDocument(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(l0 l0Var, RailwayCardData railwayCardData) {
        l0Var.d9(new ChangeCard(railwayCardData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(l0 l0Var, UutCardBottomSheetData uutCardBottomSheetData) {
        l0Var.d9(new ShowQrCode(uutCardBottomSheetData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(l0 l0Var, String str) {
        l0Var.d9(new GoToVerificationProcess(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(l0 l0Var, n20.a aVar) {
        l0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object S9(RailwayCardFullData railwayCardFullData, tq.e<? super jd3.n> eVar) throws Throwable {
        c cVar;
        RailwayCardFullData railwayCardFullData2;
        Object next;
        String str;
        Object next2;
        Object next3;
        jd3.n.PackageDataLoaded packageDataLoaded;
        RailwayCardData railwayCardData;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f101981g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f101981g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f101979e;
        Object objE = uq.b.e();
        int i16 = cVar.f101981g;
        if (i16 == 0) {
            oq.u.b(objD);
            gd3.a aVar = this.uutContainersInteractor;
            cVar.f101978d = railwayCardFullData;
            cVar.f101981g = 1;
            objD = aVar.d(cVar);
            if (objD == objE) {
                return objE;
            }
            railwayCardFullData2 = railwayCardFullData;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            railwayCardFullData2 = (RailwayCardFullData) cVar.f101978d;
            oq.u.b(objD);
        }
        String str2 = (String) ((dx.i) objD).a();
        Iterator<T> it = railwayCardFullData2.c().values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            railwayCardData = (RailwayCardData) next;
            if (railwayCardData.getScope().getData().getOuCategory() == RailwayCardContainerData.a.PENSIONER_I_PACKAGE) {
                break;
            }
        } while (railwayCardData.getScope().getData().getOuCategory() != RailwayCardContainerData.a.ANNUITY_I_PACKAGE);
        RailwayCardData railwayCardData2 = (RailwayCardData) next;
        if (railwayCardData2 != null) {
            Collection<RailwayCardData> collectionValues = railwayCardFullData2.c().values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (!fr.t.c(((RailwayCardData) obj).getScope().getData().getNumber(), railwayCardData2.getScope().getData().getNumber())) {
                    arrayList.add(obj);
                }
            }
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (!((RailwayCardData) next3).getScope().getData().l());
            RailwayCardData railwayCardData3 = (RailwayCardData) next3;
            if (railwayCardData3 != null) {
                str = str2;
                packageDataLoaded = new jd3.n.PackageDataLoaded(railwayCardFullData2.getParentId(), railwayCardData3, railwayCardData2, railwayCardData2, y30.n.Switch.EnumC5973b.LEFT, this.currentTimeProvider.f(), false, false, null, null, str, 448, null);
            } else {
                str = str2;
                packageDataLoaded = null;
            }
            if (packageDataLoaded != null) {
                return packageDataLoaded;
            }
        } else {
            str = str2;
        }
        Iterator<T> it5 = railwayCardFullData2.c().values().iterator();
        do {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
        } while (!((RailwayCardData) next2).getScope().getData().l());
        RailwayCardData railwayCardData4 = (RailwayCardData) next2;
        if (railwayCardData4 == null) {
            return null;
        }
        Map<String, RailwayCardData> mapC = railwayCardFullData2.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, RailwayCardData> entry : mapC.entrySet()) {
            if (!fr.t.c(entry.getValue().getScope().getData().getNumber(), railwayCardData4.getScope().getData().getNumber())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new jd3.n.DataLoaded(RailwayCardFullData.b(railwayCardFullData2, null, linkedHashMap, 1, null), railwayCardData4, railwayCardData4, y30.n.Switch.EnumC5973b.LEFT, this.currentTimeProvider.f(), false, null, null, str, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(final l0 l0Var, k10.v vVar) {
        vVar.c(fr.q0.c(jd3.n.b.class), new er.l() { // from class: jd3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.V9(this.f101942a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jd3.n.DataLoaded.class), new er.l() { // from class: jd3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.W9(this.f101944a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jd3.n.PackageDataLoaded.class), new er.l() { // from class: jd3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.X9(this.f101946a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jd3.n.class), new er.l() { // from class: jd3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.Y9(this.f101918a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(l0 l0Var, k10.z zVar) {
        zVar.C(l0Var.new e(null));
        f fVar = l0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.class), oVar, fVar);
        zVar.x(fr.q0.c(jd3.f.class), oVar, l0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(l0 l0Var, k10.z zVar) {
        h hVar = l0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.class), oVar, hVar);
        zVar.v(fr.q0.c(ChangeSwitchItem.class), oVar, new i(null));
        zVar.v(fr.q0.c(ChangeCard.class), oVar, new j(null));
        zVar.v(fr.q0.c(ShowQrCode.class), oVar, new k(null));
        zVar.v(fr.q0.c(jd3.d.class), oVar, new l(null));
        zVar.v(fr.q0.c(jd3.e.class), oVar, new m(null));
        zVar.x(fr.q0.c(GoToVerificationProcess.class), oVar, l0Var.new n(null));
        zVar.x(fr.q0.c(jd3.f.class), oVar, l0Var.new o(null));
        zVar.x(fr.q0.c(UpdateDocument.class), oVar, l0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(l0 l0Var, k10.z zVar) {
        k10.k.m(zVar, l0Var.G9(), null, new q(null), 2, null);
        r rVar = new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ChangeSwitchItem.class), oVar, rVar);
        zVar.v(fr.q0.c(jd3.e.class), oVar, new s(null));
        zVar.x(fr.q0.c(a.class), oVar, l0Var.new t(null));
        zVar.v(fr.q0.c(ShowQrCode.class), oVar, new u(null));
        zVar.v(fr.q0.c(jd3.d.class), oVar, new v(null));
        zVar.x(fr.q0.c(GoToVerificationProcess.class), oVar, l0Var.new w(null));
        zVar.x(fr.q0.c(jd3.f.class), oVar, l0Var.new x(null));
        zVar.x(fr.q0.c(UpdateDocument.class), oVar, l0Var.new y(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(l0 l0Var, k10.z zVar) {
        z zVar2 = l0Var.new z(zVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jd3.h.class), oVar, zVar2);
        zVar.x(fr.q0.c(jd3.j.class), oVar, l0Var.new a0(null));
        zVar.x(fr.q0.c(ShowUutDialog.class), oVar, l0Var.new b0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (F(r6, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014b, code lost:
    
        if (r7.F(r12, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b0, code lost:
    
        if (r6.F(r7, r2) == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z9(java.lang.String r21, mz3.z.b r22, tq.e<? super oq.i0> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jd3.l0.Z9(java.lang.String, mz3.z$b, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jd3.i iVar, tq.e<? super oq.i0> eVar) {
        return super.F(iVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: T9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<jd3.i> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<jd3.n>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<jd3.o.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
