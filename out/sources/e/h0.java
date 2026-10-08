package e;

import android.hardware.camera2.CaptureResult;
import android.view.Surface;
import h.Result3A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ju.g3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\b\u0005*\u0001\u007f\b\u0007\u0018\u00002\u00020\u0001:\u0002)]B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0096@¢\u0006\u0004\b&\u0010'J(\u0010)\u001a\u00020(2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0096@¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010!\u001a\u00020 H\u0087@¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020+2\u0006\u0010!\u001a\u00020 H\u0087@¢\u0006\u0004\b.\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010/H\u0082@¢\u0006\u0004\b0\u00101JN\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u000104H\u0082@¢\u0006\u0004\b6\u00107JF\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0019H\u0082@¢\u0006\u0004\b8\u00109JF\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0019H\u0082@¢\u0006\u0004\b:\u00109J>\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010!\u001a\u00020 2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0019H\u0082@¢\u0006\u0004\b;\u0010<JN\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010!\u001a\u00020 2\u0006\u0010>\u001a\u00020=2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00192\u0006\u0010@\u001a\u00020?H\u0082@¢\u0006\u0004\bA\u0010BJF\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010>\u001a\u00020=2\u0006\u0010!\u001a\u00020 2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0019H\u0082@¢\u0006\u0004\bC\u0010DJ>\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010!\u001a\u00020 2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0019H\u0082@¢\u0006\u0004\bE\u0010<J \u0010I\u001a\u00020H2\u0006\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020?H\u0082@¢\u0006\u0004\bI\u0010JJ#\u0010L\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020?0K2\u0006\u0010G\u001a\u00020?H\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010O\u001a\u00020N*\u00020/H\u0002¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u00020H2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\bQ\u0010RJ%\u0010T\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\u0006\u0010S\u001a\u000204H\u0002¢\u0006\u0004\bT\u0010UJ\u0018\u0010V\u001a\u00020?2\u0006\u0010#\u001a\u00020 H\u0082@¢\u0006\u0004\bV\u0010-J0\u0010Z\u001a\u0004\u0018\u00010X2\u0006\u0010W\u001a\u00020=2\u0014\b\u0002\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020?0KH\u0082@¢\u0006\u0004\bZ\u0010[J\u0018\u0010\\\u001a\u00020?2\u0006\u0010\"\u001a\u00020 H\u0082@¢\u0006\u0004\b\\\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR#\u0010v\u001a\n r*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\bt\u0010uR\"\u0010{\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\bx\u0010y\"\u0004\ba\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0083\u0001"}, d2 = {"Le/h0;", "Le/c0;", "LPRN/r;", "configAdapter", "Le/f1;", "flashControl", "Le/x1;", "torchControl", "Le/v2;", "videoUsageControl", "Le/u2;", "threads", "Le/u0;", "requestListener", "Lc/m0;", "useTorchAsFlash", "Le/b0;", "cameraProperties", "Lnq/a;", "Le/l2;", "useCaseCameraStateProvider", "Ld/g0;", "useCaseGraphContext", "<init>", "(LPRN/r;Le/f1;Le/x1;Le/v2;Le/u2;Le/u0;Lc/m0;Le/b0;Lnq/a;Ld/g0;)V", "", "Lv/n1;", "configs", "Lh/k1;", "requestTemplate", "Lv/p1;", "sessionConfigOptions", "", "captureMode", "flashType", "flashMode", "Lju/w0;", "Ljava/lang/Void;", "c", "(Ljava/util/List;ILv/p1;IIILtq/e;)Ljava/lang/Object;", "Lu/m;", "b", "(IIILtq/e;)Ljava/lang/Object;", "Loq/i0;", "N", "(ILtq/e;)Ljava/lang/Object;", "M", "Lh/q0;", "G", "(Ltq/e;)Ljava/lang/Object;", "Le/h0$b;", "pipelineTasks", "Le/h0$a;", "mainCaptureParams", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/util/List;IIILe/h0$a;Ltq/e;)Ljava/lang/Object;", "V", "(Le/h0$a;IILjava/util/List;Ltq/e;)Ljava/lang/Object;", "C", ip.a.f96138c, "(Le/h0$a;ILjava/util/List;Ltq/e;)Ljava/lang/Object;", "", "timeLimitNs", "", "triggerAePreCapture", "U", "(Le/h0$a;IJLjava/util/List;ZLtq/e;)Ljava/lang/Object;", "B", "(Le/h0$a;JILjava/util/List;Ltq/e;)Ljava/lang/Object;", "R", "convergedTimeLimitNs", "isTorchAsFlash", "Lh/m1;", "Q", "(JZLtq/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "E", "(Z)Ler/l;", "Lv/c0;", "T", "(Lh/q0;)Lv/c0;", "W", "(JLtq/e;)Ljava/lang/Object;", "params", ip.a.f96137b, "(Le/h0$a;)Ljava/util/List;", "O", "waitTimeoutNanos", "Lh/p0;", "checker", "Y", "(JLer/l;Ltq/e;)Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "a", "LPRN/r;", "Le/f1;", "Le/x1;", "d", "Le/v2;", "e", "Le/u2;", "f", "Le/u0;", "g", "Lc/m0;", "h", "Lnq/a;", "i", "Ld/g0;", "j", "Loq/k;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Z", "hasFlashUnit", "kotlin.jvm.PlatformType", "k", "J", "()Le/l2;", "useCaseCameraState", "l", "I", "()I", "(I)V", "template", "m", "Lh/q0;", "frameMetadata", "e/h0$h", "n", "Le/h0$h;", "emptyRequestMetadata", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 implements e.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PRN.r configAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f1 flashControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x1 torchControl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v2 videoUsageControl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u0 requestListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c.m0 useTorchAsFlash;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final nq.a<l2> useCaseCameraStateProvider;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final d.g0 useCaseGraphContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k hasFlashUnit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private h.q0 frameMetadata;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k useCaseCameraState = oq.l.a(new er.a() { // from class: e.f0
        @Override // er.a
        public final Object a() {
            return h0.X(this.f45754a);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int template = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final h emptyRequestMetadata = new h();

    /* JADX INFO: renamed from: e.h0$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Le/h0$a;", "", "", "Lv/n1;", "configs", "Lh/k1;", "requestTemplate", "Lv/p1;", "sessionConfigOptions", "<init>", "(Ljava/util/List;ILv/p1;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "Lv/p1;", "()Lv/p1;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class MainCaptureParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<v.n1> configs;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int requestTemplate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v.p1 sessionConfigOptions;

        public /* synthetic */ MainCaptureParams(List list, int i15, v.p1 p1Var, fr.k kVar) {
            this(list, i15, p1Var);
        }

        public final List<v.n1> a() {
            return this.configs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRequestTemplate() {
            return this.requestTemplate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final v.p1 getSessionConfigOptions() {
            return this.sessionConfigOptions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainCaptureParams)) {
                return false;
            }
            MainCaptureParams mainCaptureParams = (MainCaptureParams) other;
            return fr.t.c(this.configs, mainCaptureParams.configs) && h.k1.d(this.requestTemplate, mainCaptureParams.requestTemplate) && fr.t.c(this.sessionConfigOptions, mainCaptureParams.sessionConfigOptions);
        }

        public int hashCode() {
            return (((this.configs.hashCode() * 31) + h.k1.f(this.requestTemplate)) * 31) + this.sessionConfigOptions.hashCode();
        }

        public String toString() {
            return "MainCaptureParams(configs=" + this.configs + ", requestTemplate=" + ((Object) h.k1.g(this.requestTemplate)) + ", sessionConfigOptions=" + this.sessionConfigOptions + ')';
        }

        private MainCaptureParams(List<v.n1> list, int i15, v.p1 p1Var) {
            this.configs = list;
            this.requestTemplate = i15;
            this.sessionConfigOptions = p1Var;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45844d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45845e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45847g;

        a0(tq.e<? super a0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45845e = obj;
            this.f45847g |= PKIFailureInfo.systemUnavail;
            return h0.this.Y(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Le/h0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum b {
        PRE_CAPTURE,
        MAIN_CAPTURE,
        POST_CAPTURE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f45852e = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lh/p0;", "<anonymous>", "(Lju/p0;)Lh/p0;"}, k = 3, mv = {2, 1, 0})
    static final class b0 extends vq.k implements er.p<ju.p0, tq.e<? super h.p0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o1 f45854f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(o1 o1Var, tq.e<? super b0> eVar) {
            super(2, eVar);
            this.f45854f = o1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45853e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<h.p0> w0VarA = this.f45854f.a();
            this.f45853e = 1;
            Object objI = w0VarA.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super h.p0> eVar) {
            return ((b0) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b0(this.f45854f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f45856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f45857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f45858h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45859j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, tq.e eVar, h0 h0Var, int i15) {
            super(2, eVar);
            this.f45856f = list;
            this.f45857g = h0Var;
            this.f45858h = i15;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x007e A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x0073, B:34:0x007e, B:37:0x0087, B:41:0x008d), top: B:55:0x0073 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x008b  */
        /* JADX WARN: Code duplicated, block: B:40:0x008c  */
        /* JADX WARN: Code duplicated, block: B:44:0x0098  */
        /* JADX WARN: Code duplicated, block: B:47:0x00a1 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:8:0x0017, B:45:0x0099, B:47:0x00a1, B:48:0x00a4), top: B:57:0x0017 }] */
        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            AutoCloseable autoCloseable;
            AutoCloseable autoCloseable2;
            Throwable th4;
            h.s.g gVar;
            Object objE = uq.b.e();
            int i15 = this.f45855e;
            boolean z15 = true;
            if (i15 == 0) {
                oq.u.b(obj);
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
                List list = this.f45856f;
                this.f45855e = 1;
                if (ju.f.c(list, this) != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoCloseable2 = (AutoCloseable) this.f45859j;
                    try {
                        oq.u.b(obj);
                        e.c cVar2 = e.c.f45719a;
                        if (o.e1.f("CXCP")) {
                            String unused2 = e.c.TRUNCATED_TAG;
                        }
                        oq.i0 i0Var = oq.i0.f148189a;
                        cr.a.a(autoCloseable2, null);
                        return oq.i0.f148189a;
                    } catch (Throwable th5) {
                        th4 = th5;
                        try {
                            throw th4;
                        } catch (Throwable th6) {
                            cr.a.a(autoCloseable2, th4);
                            throw th6;
                        }
                    }
                }
                oq.u.b(obj);
                autoCloseable = (AutoCloseable) obj;
                try {
                    gVar = (h.s.g) autoCloseable;
                    e.c cVar3 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused3 = e.c.TRUNCATED_TAG;
                    }
                    if (this.f45858h == 0) {
                        z15 = false;
                    }
                    this.f45859j = autoCloseable;
                    this.f45855e = 3;
                    if (gVar.b2(z15, this) != objE) {
                        autoCloseable2 = autoCloseable;
                        e.c cVar4 = e.c.f45719a;
                        if (o.e1.f("CXCP")) {
                            String unused4 = e.c.TRUNCATED_TAG;
                        }
                        oq.i0 i0Var2 = oq.i0.f148189a;
                        cr.a.a(autoCloseable2, null);
                        return oq.i0.f148189a;
                    }
                    return objE;
                } catch (Throwable th7) {
                    autoCloseable2 = autoCloseable;
                    th4 = th7;
                    throw th4;
                }
            }
            oq.u.b(obj);
            e.c cVar5 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused5 = e.c.TRUNCATED_TAG;
            }
            if (o.e1.f("CXCP")) {
                String unused6 = e.c.TRUNCATED_TAG;
            }
            h.s sVarF = this.f45857g.useCaseGraphContext.f();
            this.f45855e = 2;
            obj = sVarF.m3(this);
            if (obj != objE) {
                autoCloseable = (AutoCloseable) obj;
                gVar = (h.s.g) autoCloseable;
                e.c cVar6 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused7 = e.c.TRUNCATED_TAG;
                }
                if (this.f45858h == 0) {
                    z15 = false;
                }
                this.f45859j = autoCloseable;
                this.f45855e = 3;
                if (gVar.b2(z15, this) != objE) {
                    autoCloseable2 = autoCloseable;
                    e.c cVar7 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused8 = e.c.TRUNCATED_TAG;
                    }
                    oq.i0 i0Var3 = oq.i0.f148189a;
                    cr.a.a(autoCloseable2, null);
                    return oq.i0.f148189a;
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f45856f, eVar, this.f45857g, this.f45858h);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c0 extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o1 f45861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f45862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(o1 o1Var, h0 h0Var, tq.e<? super c0> eVar) {
            super(2, eVar);
            this.f45861f = o1Var;
            this.f45862g = h0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45860e;
            if (i15 == 0) {
                oq.u.b(obj);
                ju.w0<h.p0> w0VarA = this.f45861f.a();
                this.f45860e = 1;
                if (w0VarA.T0(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f45862g.requestListener.G(this.f45861f);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c0) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c0(this.f45861f, this.f45862g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f45863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45867h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45868j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f45869k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f45871m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45869k = obj;
            this.f45871m |= PKIFailureInfo.systemUnavail;
            return h0.this.B(null, 0L, 0, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45875g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f45877j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45875g = obj;
            this.f45877j |= PKIFailureInfo.systemUnavail;
            return h0.this.C(null, 0, 0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f45879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f45880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f45881h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, tq.e eVar, boolean z15, h0 h0Var) {
            super(2, eVar);
            this.f45879f = list;
            this.f45880g = z15;
            this.f45881h = h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        
            if (r8.W(r5, r7) == r0) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f45878e
                r2 = 2
                r3 = 1
                java.lang.String r4 = "CXCP"
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                oq.u.b(r8)
                goto L62
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oq.u.b(r8)
                goto L3b
            L20:
                oq.u.b(r8)
                e.c r8 = e.c.f45719a
                boolean r8 = o.e1.f(r4)
                if (r8 == 0) goto L2e
                e.c.a()
            L2e:
                java.util.List r8 = r7.f45879f
                java.util.Collection r8 = (java.util.Collection) r8
                r7.f45878e = r3
                java.lang.Object r8 = ju.f.c(r8, r7)
                if (r8 != r0) goto L3b
                goto L61
            L3b:
                e.c r8 = e.c.f45719a
                boolean r8 = o.e1.f(r4)
                if (r8 == 0) goto L46
                e.c.a()
            L46:
                boolean r8 = r7.f45880g
                if (r8 == 0) goto L6d
                boolean r8 = o.e1.f(r4)
                if (r8 == 0) goto L53
                e.c.a()
            L53:
                e.h0 r8 = r7.f45881h
                long r5 = e.i0.a()
                r7.f45878e = r2
                java.lang.Object r8 = e.h0.z(r8, r5, r7)
                if (r8 != r0) goto L62
            L61:
                return r0
            L62:
                e.c r8 = e.c.f45719a
                boolean r8 = o.e1.f(r4)
                if (r8 == 0) goto L6d
                e.c.a()
            L6d:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h0.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f45879f, eVar, this.f45880g, this.f45881h);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f45886h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f45888k;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45886h = obj;
            this.f45888k |= PKIFailureInfo.systemUnavail;
            return h0.this.D(null, 0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0017\u0010$R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"e/h0$h", "Lh/i1;", "T", "Lh/a1$a;", "key", "c", "(Lh/a1$a;)Ljava/lang/Object;", "default", "a", "(Lh/a1$a;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Lh/k1;", "I", "getTemplate-fGx8uWA", "()I", "template", "", "Lh/q1;", "Landroid/view/Surface;", "b", "Ljava/util/Map;", "G", "()Ljava/util/Map;", "streams", "", "Z", "r", "()Z", "repeating", "Lh/g1;", "d", "Lh/g1;", "()Lh/g1;", "request", "Lh/j1;", "e", "J", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()J", "requestNumber", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements h.i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int template = h.k1.b(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<h.q1, Surface> streams = pq.v0.i();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean repeating = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final h.g1 request = new h.g1(pq.v.n(), null, null, null, null, null, 62, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final long requestNumber = h.j1.b(0);

        h() {
        }

        @Override // h.i1
        public Map<h.q1, Surface> G() {
            return this.streams;
        }

        @Override // h.i1
        /* JADX INFO: renamed from: L, reason: from getter */
        public long getRequestNumber() {
            return this.requestNumber;
        }

        @Override // h.a1
        public <T> T a(h.a1.a<T> key, T t15) {
            return t15;
        }

        @Override // h.i1
        /* JADX INFO: renamed from: b, reason: from getter */
        public h.g1 getRequest() {
            return this.request;
        }

        @Override // h.a1
        public <T> T c(h.a1.a<T> key) {
            return null;
        }

        @Override // h.t1
        public <T> T c0(mr.c<T> type) {
            return null;
        }

        @Override // h.i1
        /* JADX INFO: renamed from: r, reason: from getter */
        public boolean getRepeating() {
            return this.repeating;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"e/h0$i", "Lu/m;", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "a", "()Lcom/google/common/util/concurrent/q;", "b", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements u.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45897d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements androidx.concurrent.futures.c.InterfaceC0250c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ju.p0 f45898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f45899b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f45900c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f45901d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f45902e;

            /* JADX INFO: renamed from: e.h0$i$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C1051a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f45903e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f45904f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.concurrent.futures.c.a f45905g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ h0 f45906h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ int f45907j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f45908k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ int f45909l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1051a(androidx.concurrent.futures.c.a aVar, tq.e eVar, h0 h0Var, int i15, int i16, int i17) {
                    super(2, eVar);
                    this.f45905g = aVar;
                    this.f45906h = h0Var;
                    this.f45907j = i15;
                    this.f45908k = i16;
                    this.f45909l = i17;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Exception {
                    C1051a c1051a;
                    androidx.concurrent.futures.c.a aVar;
                    androidx.concurrent.futures.c.a aVar2;
                    Object objE = uq.b.e();
                    int i15 = this.f45904f;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            aVar = (androidx.concurrent.futures.c.a) this.f45903e;
                            oq.u.b(obj);
                            c1051a = this;
                        } else {
                            if (i15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (androidx.concurrent.futures.c.a) this.f45903e;
                            oq.u.b(obj);
                        }
                        aVar2.c(null);
                        return oq.i0.f148189a;
                    }
                    oq.u.b(obj);
                    androidx.concurrent.futures.c.a aVar3 = this.f45905g;
                    h0 h0Var = this.f45906h;
                    List listE = pq.v.e(b.POST_CAPTURE);
                    int i16 = this.f45907j;
                    int i17 = this.f45908k;
                    int i18 = this.f45909l;
                    this.f45903e = aVar3;
                    this.f45904f = 1;
                    c1051a = this;
                    Object objL = h0Var.L(listE, i16, i17, i18, null, c1051a);
                    if (objL != objE) {
                        aVar = aVar3;
                        obj = objL;
                    }
                    return objE;
                    c1051a.f45903e = aVar;
                    c1051a.f45904f = 2;
                    if (ju.f.c((Collection) obj, this) != objE) {
                        aVar2 = aVar;
                        aVar2.c(null);
                        return oq.i0.f148189a;
                    }
                    return objE;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C1051a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C1051a(this.f45905g, eVar, this.f45906h, this.f45907j, this.f45908k, this.f45909l);
                }
            }

            public a(ju.p0 p0Var, h0 h0Var, int i15, int i16, int i17) {
                this.f45898a = p0Var;
                this.f45899b = h0Var;
                this.f45900c = i15;
                this.f45901d = i16;
                this.f45902e = i17;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a<T> aVar) {
                return ju.k.d(this.f45898a, null, null, new C1051a(aVar, null, this.f45899b, this.f45900c, this.f45901d, this.f45902e), 3, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b<T> implements androidx.concurrent.futures.c.InterfaceC0250c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ju.p0 f45910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f45911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f45912c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f45913d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f45914e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f45915e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f45916f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.concurrent.futures.c.a f45917g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ h0 f45918h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ int f45919j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f45920k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ int f45921l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(androidx.concurrent.futures.c.a aVar, tq.e eVar, h0 h0Var, int i15, int i16, int i17) {
                    super(2, eVar);
                    this.f45917g = aVar;
                    this.f45918h = h0Var;
                    this.f45919j = i15;
                    this.f45920k = i16;
                    this.f45921l = i17;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Exception {
                    a aVar;
                    androidx.concurrent.futures.c.a aVar2;
                    androidx.concurrent.futures.c.a aVar3;
                    Object objE = uq.b.e();
                    int i15 = this.f45916f;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            aVar2 = (androidx.concurrent.futures.c.a) this.f45915e;
                            oq.u.b(obj);
                            aVar = this;
                        } else {
                            if (i15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (androidx.concurrent.futures.c.a) this.f45915e;
                            oq.u.b(obj);
                        }
                        aVar3.c(null);
                        return oq.i0.f148189a;
                    }
                    oq.u.b(obj);
                    androidx.concurrent.futures.c.a aVar4 = this.f45917g;
                    h0 h0Var = this.f45918h;
                    List listE = pq.v.e(b.PRE_CAPTURE);
                    int i16 = this.f45919j;
                    int i17 = this.f45920k;
                    int i18 = this.f45921l;
                    this.f45915e = aVar4;
                    this.f45916f = 1;
                    aVar = this;
                    Object objL = h0Var.L(listE, i16, i17, i18, null, aVar);
                    if (objL != objE) {
                        aVar2 = aVar4;
                        obj = objL;
                    }
                    return objE;
                    aVar.f45915e = aVar2;
                    aVar.f45916f = 2;
                    if (ju.f.c((Collection) obj, this) != objE) {
                        aVar3 = aVar2;
                        aVar3.c(null);
                        return oq.i0.f148189a;
                    }
                    return objE;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new a(this.f45917g, eVar, this.f45918h, this.f45919j, this.f45920k, this.f45921l);
                }
            }

            public b(ju.p0 p0Var, h0 h0Var, int i15, int i16, int i17) {
                this.f45910a = p0Var;
                this.f45911b = h0Var;
                this.f45912c = i15;
                this.f45913d = i16;
                this.f45914e = i17;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a<T> aVar) {
                return ju.k.d(this.f45910a, null, null, new a(aVar, null, this.f45911b, this.f45912c, this.f45913d, this.f45914e), 3, null);
            }
        }

        i(int i15, int i16, int i17) {
            this.f45895b = i15;
            this.f45896c = i16;
            this.f45897d = i17;
        }

        @Override // u.m
        public com.google.common.util.concurrent.q<Void> a() {
            return androidx.concurrent.futures.c.a(new b(h0.this.threads.getScope(), h0.this, this.f45895b, this.f45896c, this.f45897d));
        }

        @Override // u.m
        public com.google.common.util.concurrent.q<Void> b() {
            return androidx.concurrent.futures.c.a(new a(h0.this.threads.getScope(), h0.this, this.f45895b, this.f45896c, this.f45897d));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45923e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45925g;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45923e = obj;
            this.f45925g |= PKIFailureInfo.systemUnavail;
            return h0.this.G(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f45930h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f45932k;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45930h = obj;
            this.f45932k |= PKIFailureInfo.systemUnavail;
            return h0.this.L(null, 0, 0, 0, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45935f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45937h;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45935f = obj;
            this.f45937h |= PKIFailureInfo.systemUnavail;
            return h0.this.M(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45940f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45942h;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45940f = obj;
            this.f45942h |= PKIFailureInfo.systemUnavail;
            return h0.this.N(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f45943d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45945f;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45943d = obj;
            this.f45945f |= PKIFailureInfo.systemUnavail;
            return h0.this.O(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh/q0;", "<anonymous>", "()Lh/q0;"}, k = 3, mv = {2, 1, 0})
    static final class o extends vq.k implements er.l<tq.e<? super h.q0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45946e;

        o(tq.e<? super o> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45946e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            h0 h0Var = h0.this;
            this.f45946e = 1;
            Object objG = h0Var.G(this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return h0.this.new o(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super h.q0> eVar) {
            return ((o) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f45948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f45949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45950f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45951g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f45953j;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45951g = obj;
            this.f45953j |= PKIFailureInfo.systemUnavail;
            return h0.this.Q(0L, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class q extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f45955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f45956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f45957h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List list, tq.e eVar, h0 h0Var, int i15) {
            super(2, eVar);
            this.f45955f = list;
            this.f45956g = h0Var;
            this.f45957h = i15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        
            if (r6.M(r1, r5) == r0) goto L21;
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
                int r1 = r5.f45954e
                java.lang.String r2 = "CXCP"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                oq.u.b(r6)
                goto L53
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                oq.u.b(r6)
                goto L3b
            L20:
                oq.u.b(r6)
                e.c r6 = e.c.f45719a
                boolean r6 = o.e1.f(r2)
                if (r6 == 0) goto L2e
                e.c.a()
            L2e:
                java.util.List r6 = r5.f45955f
                java.util.Collection r6 = (java.util.Collection) r6
                r5.f45954e = r4
                java.lang.Object r6 = ju.f.c(r6, r5)
                if (r6 != r0) goto L3b
                goto L52
            L3b:
                e.c r6 = e.c.f45719a
                boolean r6 = o.e1.f(r2)
                if (r6 == 0) goto L46
                e.c.a()
            L46:
                e.h0 r6 = r5.f45956g
                int r1 = r5.f45957h
                r5.f45954e = r3
                java.lang.Object r6 = r6.M(r1, r5)
                if (r6 != r0) goto L53
            L52:
                return r0
            L53:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h0.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((q) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new q(this.f45955f, eVar, this.f45956g, this.f45957h);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f45962h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f45964k;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45962h = obj;
            this.f45964k |= PKIFailureInfo.systemUnavail;
            return h0.this.R(null, 0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class s extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f45966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f45967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f45968h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45969j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(tq.e eVar, h0 h0Var, List list, List list2) {
            super(2, eVar);
            this.f45966f = h0Var;
            this.f45967g = list;
            this.f45968h = list2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        
            if (r9.h(r8) == r0) goto L39;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h0.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((s) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new s(eVar, this.f45966f, this.f45967g, this.f45968h);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"e/h0$t", "Lh/g1$a;", "Lh/g1;", "request", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lh/g1;)V", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "totalCaptureResult", "a0", "(Lh/i1;JLh/p0;)V", "Lh/h1;", "requestFailure", "p", "(Lh/i1;JLh/h1;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t implements h.g1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.x<Void> f45970a;

        t(ju.x<Void> xVar) {
            this.f45970a = xVar;
        }

        @Override // h.g1.a
        public void H(h.g1 request) {
            this.f45970a.p(new o.v0(3, "Capture request is cancelled because camera is closed", null));
        }

        @Override // h.g1.a
        public void a0(h.i1 requestMetadata, long frameNumber, h.p0 totalCaptureResult) {
            this.f45970a.d0(null);
        }

        @Override // h.g1.a
        public void p(h.i1 requestMetadata, long frameNumber, h.h1 requestFailure) {
            this.f45970a.p(new o.v0(2, "Capture request failed with reason " + requestFailure.getReason(), null));
        }
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"e/h0$u", "Lh/p0;", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Lh/q0;", "a", "Lh/q0;", "frameMetadata", "b", "e", "()Lh/q0;", "metadata", "Lh/v;", "c", "Ljava/lang/String;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", "camera", "Lh/r0;", "d", "J", "getFrameNumber-Ugla2oM", "()J", "frameNumber", "Lh/i1;", "Lh/i1;", "getRequestMetadata", "()Lh/i1;", "requestMetadata", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class u implements h.p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h.q0 frameMetadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final h.q0 metadata;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String camera;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long frameNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final h.i1 requestMetadata;

        u(h.q0 q0Var, h0 h0Var) {
            this.frameMetadata = q0Var;
            this.metadata = q0Var;
            this.camera = q0Var.getCamera();
            this.frameNumber = q0Var.Y0();
            this.requestMetadata = h0Var.emptyRequestMetadata;
        }

        @Override // h.t1
        public <T> T c0(mr.c<T> type) {
            return null;
        }

        @Override // h.p0
        /* JADX INFO: renamed from: e, reason: from getter */
        public h.q0 getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class v extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f45977f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f45978g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f45979h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f45980j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f45981k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f45982l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f45983m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(List list, tq.e eVar, boolean z15, h0 h0Var, boolean z16, boolean z17, int i15) {
            super(2, eVar);
            this.f45977f = list;
            this.f45978g = z15;
            this.f45979h = h0Var;
            this.f45980j = z16;
            this.f45981k = z17;
            this.f45982l = i15;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00eb, code lost:
        
            if (r14.W(r3, r13) == r0) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h0.v.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((v) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new v(this.f45977f, eVar, this.f45978g, this.f45979h, this.f45980j, this.f45981k, this.f45982l);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class w extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f45987g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f45988h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45989j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f45990k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f45991l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f45992m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f45993n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f45995q;

        w(tq.e<? super w> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45993n = obj;
            this.f45995q |= PKIFailureInfo.systemUnavail;
            return h0.this.U(null, 0, 0L, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class x implements er.l<h.p0, Boolean> {
        x() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(h.p0 p0Var) {
            return Boolean.valueOf(v.q1.a(h0.this.T(p0Var.getMetadata()), true));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class y extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f46000g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46002j;

        y(tq.e<? super y> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46000g = obj;
            this.f46002j |= PKIFailureInfo.systemUnavail;
            return h0.this.V(null, 0, 0, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f46003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f46005f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f46007h;

        z(tq.e<? super z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46005f = obj;
            this.f46007h |= PKIFailureInfo.systemUnavail;
            return h0.this.W(0L, this);
        }
    }

    public h0(PRN.r rVar, f1 f1Var, x1 x1Var, v2 v2Var, u2 u2Var, u0 u0Var, c.m0 m0Var, final e.b0 b0Var, nq.a<l2> aVar, d.g0 g0Var) {
        this.configAdapter = rVar;
        this.flashControl = f1Var;
        this.torchControl = x1Var;
        this.videoUsageControl = v2Var;
        this.threads = u2Var;
        this.requestListener = u0Var;
        this.useTorchAsFlash = m0Var;
        this.useCaseCameraStateProvider = aVar;
        this.useCaseGraphContext = g0Var;
        this.hasFlashUnit = oq.l.a(new er.a() { // from class: e.e0
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(h0.K(b0Var));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165 A[Catch: all -> 0x004d, TryCatch #4 {all -> 0x004d, blocks: (B:15:0x0048, B:69:0x015d, B:71:0x0165, B:72:0x0168), top: B:110:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x019b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6  */
    public final Object B(MainCaptureParams mainCaptureParams, long j15, int i15, List<? extends b> list, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Exception {
        d dVar;
        MainCaptureParams mainCaptureParams2;
        int i16;
        h0 h0Var;
        List<? extends b> list2;
        MainCaptureParams mainCaptureParams3;
        Object obj;
        int i17;
        long j16;
        h0 h0Var2;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        Throwable th4;
        AutoCloseable autoCloseable3;
        h.s.g gVar;
        boolean z15;
        h0 h0Var3;
        List<? extends b> list3;
        boolean z16;
        MainCaptureParams mainCaptureParams4;
        int i18;
        AutoCloseable autoCloseable4;
        List<? extends b> list4;
        List<? extends b> list5;
        List<ju.w0<Void>> listE;
        List<? extends b> list6 = list;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i19 = dVar.f45871m;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f45871m = i19 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object obj2 = dVar2.f45869k;
        Object objE = uq.b.e();
        int i25 = dVar2.f45871m;
        try {
            try {
                if (i25 == 0) {
                    oq.u.b(obj2);
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                    }
                    if (o.e1.f("CXCP")) {
                        String unused2 = e.c.TRUNCATED_TAG;
                        Objects.toString(list6);
                    }
                    if (list6.contains(b.PRE_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused3 = e.c.TRUNCATED_TAG;
                        }
                        if (o.e1.f("CXCP")) {
                            String unused4 = e.c.TRUNCATED_TAG;
                        }
                        h.s sVarF = this.useCaseGraphContext.f();
                        dVar2.f45865f = this;
                        dVar2.f45866g = list6;
                        dVar2.f45867h = mainCaptureParams;
                        dVar2.f45863d = j15;
                        dVar2.f45864e = i15;
                        dVar2.f45871m = 1;
                        Object objM3 = sVarF.m3(dVar2);
                        if (objM3 != objE) {
                            list2 = list6;
                            mainCaptureParams3 = mainCaptureParams;
                            obj = objM3;
                            i17 = i15;
                            j16 = j15;
                            h0Var2 = this;
                        }
                        return objE;
                    }
                    mainCaptureParams2 = mainCaptureParams;
                    i16 = i15;
                    h0Var = this;
                    if (list6.contains(b.MAIN_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused5 = e.c.TRUNCATED_TAG;
                        }
                        if (mainCaptureParams2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        listE = h0Var.S(mainCaptureParams2);
                        if (o.e1.f("CXCP")) {
                            String unused6 = e.c.TRUNCATED_TAG;
                        }
                    } else {
                        listE = pq.v.e(ju.z.a(null));
                    }
                    if (list6.contains(b.POST_CAPTURE)) {
                        ju.k.d(h0Var.threads.getSequentialScope(), null, null, new c(listE, null, this, i16), 3, null);
                    }
                    return listE;
                }
                if (i25 != 1) {
                    if (i25 != 2) {
                        if (i25 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i18 = dVar2.f45864e;
                        autoCloseable3 = (AutoCloseable) dVar2.f45868j;
                        mainCaptureParams2 = (MainCaptureParams) dVar2.f45867h;
                        list5 = (List) dVar2.f45866g;
                        h0Var = (h0) dVar2.f45865f;
                        try {
                            oq.u.b(obj2);
                            e.c cVar2 = e.c.f45719a;
                            if (o.e1.f("CXCP")) {
                                String unused7 = e.c.TRUNCATED_TAG;
                            }
                            oq.i0 i0Var = oq.i0.f148189a;
                            cr.a.a(autoCloseable3, null);
                            if (o.e1.f("CXCP")) {
                                String unused8 = e.c.TRUNCATED_TAG;
                            }
                            i16 = i18;
                            list6 = list5;
                            if (list6.contains(b.MAIN_CAPTURE)) {
                                if (o.e1.f("CXCP")) {
                                    String unused9 = e.c.TRUNCATED_TAG;
                                }
                                if (mainCaptureParams2 != null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                listE = h0Var.S(mainCaptureParams2);
                                if (o.e1.f("CXCP")) {
                                    String unused10 = e.c.TRUNCATED_TAG;
                                }
                            } else {
                                listE = pq.v.e(ju.z.a(null));
                            }
                            if (list6.contains(b.POST_CAPTURE)) {
                                ju.k.d(h0Var.threads.getSequentialScope(), null, null, new c(listE, null, this, i16), 3, null);
                            }
                            return listE;
                        } catch (Throwable th5) {
                            th4 = th5;
                            try {
                                throw th4;
                            } catch (Throwable th6) {
                                cr.a.a(autoCloseable3, th4);
                                throw th6;
                            }
                        }
                    }
                    i18 = dVar2.f45864e;
                    autoCloseable4 = (AutoCloseable) dVar2.f45868j;
                    mainCaptureParams4 = (MainCaptureParams) dVar2.f45867h;
                    List<? extends b> list7 = (List) dVar2.f45866g;
                    h0 h0Var4 = (h0) dVar2.f45865f;
                    try {
                        oq.u.b(obj2);
                        list4 = list7;
                        h0Var = h0Var4;
                        dVar2.f45865f = h0Var;
                        dVar2.f45866g = list4;
                        dVar2.f45867h = mainCaptureParams4;
                        dVar2.f45868j = autoCloseable4;
                        dVar2.f45864e = i18;
                        dVar2.f45871m = 3;
                        if (((ju.w0) obj2).T0(dVar2) != objE) {
                            autoCloseable3 = autoCloseable4;
                            mainCaptureParams2 = mainCaptureParams4;
                            list5 = list4;
                            e.c cVar3 = e.c.f45719a;
                            if (o.e1.f("CXCP")) {
                                String unused11 = e.c.TRUNCATED_TAG;
                            }
                            oq.i0 i0Var2 = oq.i0.f148189a;
                            cr.a.a(autoCloseable3, null);
                            if (o.e1.f("CXCP")) {
                                String unused12 = e.c.TRUNCATED_TAG;
                            }
                            i16 = i18;
                            list6 = list5;
                            if (list6.contains(b.MAIN_CAPTURE)) {
                                if (o.e1.f("CXCP")) {
                                    String unused13 = e.c.TRUNCATED_TAG;
                                }
                                if (mainCaptureParams2 != null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                listE = h0Var.S(mainCaptureParams2);
                                if (o.e1.f("CXCP")) {
                                    String unused14 = e.c.TRUNCATED_TAG;
                                }
                            } else {
                                listE = pq.v.e(ju.z.a(null));
                            }
                            if (list6.contains(b.POST_CAPTURE)) {
                                ju.k.d(h0Var.threads.getSequentialScope(), null, null, new c(listE, null, this, i16), 3, null);
                            }
                            return listE;
                        }
                        return objE;
                    } catch (Throwable th7) {
                        th4 = th7;
                        autoCloseable3 = autoCloseable4;
                        throw th4;
                    }
                }
                int i26 = dVar2.f45864e;
                long j17 = dVar2.f45863d;
                MainCaptureParams mainCaptureParams5 = (MainCaptureParams) dVar2.f45867h;
                List<? extends b> list8 = (List) dVar2.f45866g;
                h0Var2 = (h0) dVar2.f45865f;
                oq.u.b(obj2);
                i17 = i26;
                mainCaptureParams3 = mainCaptureParams5;
                list2 = list8;
                j16 = j17;
                obj = obj2;
                Object objR3 = h.s.g.R3(gVar, z16, z15, 0, j16, dVar2, 4, null);
                if (objR3 != objE) {
                    mainCaptureParams4 = mainCaptureParams3;
                    i18 = i17;
                    obj2 = objR3;
                    h0Var = h0Var3;
                    autoCloseable4 = autoCloseable2;
                    list4 = list3;
                    dVar2.f45865f = h0Var;
                    dVar2.f45866g = list4;
                    dVar2.f45867h = mainCaptureParams4;
                    dVar2.f45868j = autoCloseable4;
                    dVar2.f45864e = i18;
                    dVar2.f45871m = 3;
                    if (((ju.w0) obj2).T0(dVar2) != objE) {
                        autoCloseable3 = autoCloseable4;
                        mainCaptureParams2 = mainCaptureParams4;
                        list5 = list4;
                        e.c cVar4 = e.c.f45719a;
                        if (o.e1.f("CXCP")) {
                            String unused15 = e.c.TRUNCATED_TAG;
                        }
                        oq.i0 i0Var3 = oq.i0.f148189a;
                        cr.a.a(autoCloseable3, null);
                        if (o.e1.f("CXCP")) {
                            String unused16 = e.c.TRUNCATED_TAG;
                        }
                        i16 = i18;
                        list6 = list5;
                        if (list6.contains(b.MAIN_CAPTURE)) {
                            if (o.e1.f("CXCP")) {
                                String unused17 = e.c.TRUNCATED_TAG;
                            }
                            if (mainCaptureParams2 != null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            listE = h0Var.S(mainCaptureParams2);
                            if (o.e1.f("CXCP")) {
                                String unused18 = e.c.TRUNCATED_TAG;
                            }
                        } else {
                            listE = pq.v.e(ju.z.a(null));
                        }
                        if (list6.contains(b.POST_CAPTURE)) {
                            ju.k.d(h0Var.threads.getSequentialScope(), null, null, new c(listE, null, this, i16), 3, null);
                        }
                        return listE;
                    }
                }
                return objE;
            } catch (Throwable th8) {
                th = th8;
                th4 = th;
                autoCloseable3 = autoCloseable2;
                throw th4;
            }
            gVar = (h.s.g) autoCloseable;
            e.c cVar5 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                try {
                    String unused19 = e.c.TRUNCATED_TAG;
                } catch (Throwable th9) {
                    th4 = th9;
                    autoCloseable3 = autoCloseable;
                    throw th4;
                }
            }
            boolean z17 = i17 == 0;
            z15 = i17 == 0;
            dVar2.f45865f = h0Var2;
            dVar2.f45866g = list2;
            dVar2.f45867h = mainCaptureParams3;
            dVar2.f45868j = autoCloseable;
            dVar2.f45864e = i17;
            dVar2.f45871m = 2;
            h0Var3 = h0Var2;
            list3 = list2;
            z16 = z17;
            autoCloseable2 = autoCloseable;
        } catch (Throwable th10) {
            th = th10;
            autoCloseable2 = autoCloseable;
        }
        autoCloseable = (AutoCloseable) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object C(MainCaptureParams mainCaptureParams, int i15, int i16, List<? extends b> list, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Exception {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i17 = eVar2.f45877j;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f45877j = i17 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        e eVar3 = eVar2;
        Object objO = eVar3.f45875g;
        Object objE = uq.b.e();
        int i18 = eVar3.f45877j;
        if (i18 == 0) {
            oq.u.b(objO);
            if (H()) {
                eVar3.f45872d = mainCaptureParams;
                eVar3.f45873e = list;
                eVar3.f45874f = i15;
                eVar3.f45877j = 1;
                objO = O(i16, eVar3);
                if (objO == objE) {
                }
            } else {
                eVar3.f45877j = 4;
                Object objD = D(mainCaptureParams, i15, list, eVar3);
                if (objD != objE) {
                    return objD;
                }
            }
            return objE;
        }
        if (i18 != 1) {
            if (i18 == 2) {
                oq.u.b(objO);
                return objO;
            }
            if (i18 == 3) {
                oq.u.b(objO);
                return objO;
            }
            if (i18 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objO);
            return objO;
        }
        i15 = eVar3.f45874f;
        list = (List) eVar3.f45873e;
        mainCaptureParams = (MainCaptureParams) eVar3.f45872d;
        oq.u.b(objO);
        MainCaptureParams mainCaptureParams2 = mainCaptureParams;
        int i19 = i15;
        List<? extends b> list2 = list;
        boolean zBooleanValue = ((Boolean) objO).booleanValue();
        long j15 = zBooleanValue ? i0.f46014c : i0.f46013b;
        if (zBooleanValue || i19 == 0) {
            eVar3.f45872d = null;
            eVar3.f45873e = null;
            eVar3.f45877j = 2;
            Object objB = B(mainCaptureParams2, j15, i19, list2, eVar3);
            if (objB != objE) {
                return objB;
            }
        } else {
            eVar3.f45872d = null;
            eVar3.f45873e = null;
            eVar3.f45877j = 3;
            Object objD2 = D(mainCaptureParams2, i19, list2, eVar3);
            if (objD2 != objE) {
                return objD2;
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object D(MainCaptureParams mainCaptureParams, int i15, List<? extends b> list, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Throwable {
        g gVar;
        int i16;
        h0 h0Var;
        MainCaptureParams mainCaptureParams2;
        List<ju.w0<Void>> listE;
        List<? extends b> list2 = list;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i17 = gVar.f45888k;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f45888k = i17 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f45886h;
        Object objE = uq.b.e();
        int i18 = gVar.f45888k;
        if (i18 == 0) {
            oq.u.b(obj);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            i16 = i15 == 0 ? 1 : 0;
            if (o.e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                Objects.toString(list2);
            }
            if (list2.contains(b.PRE_CAPTURE)) {
                if (o.e1.f("CXCP")) {
                    String unused3 = e.c.TRUNCATED_TAG;
                }
                if (i16 != 0) {
                    if (o.e1.f("CXCP")) {
                        String unused4 = e.c.TRUNCATED_TAG;
                    }
                    long j15 = i0.f46013b;
                    gVar.f45883e = this;
                    gVar.f45884f = list2;
                    gVar.f45885g = mainCaptureParams;
                    gVar.f45882d = i16;
                    gVar.f45888k = 1;
                    if (Q(j15, false, gVar) == objE) {
                        return objE;
                    }
                    h0Var = this;
                    mainCaptureParams2 = mainCaptureParams;
                } else {
                    h0Var = this;
                    mainCaptureParams2 = mainCaptureParams;
                }
                if (o.e1.f("CXCP")) {
                    String unused5 = e.c.TRUNCATED_TAG;
                }
            } else {
                h0Var = this;
                mainCaptureParams2 = mainCaptureParams;
            }
            if (list2.contains(b.MAIN_CAPTURE)) {
                if (o.e1.f("CXCP")) {
                    String unused6 = e.c.TRUNCATED_TAG;
                }
                if (mainCaptureParams2 != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                listE = h0Var.S(mainCaptureParams2);
                if (o.e1.f("CXCP")) {
                    String unused7 = e.c.TRUNCATED_TAG;
                }
            } else {
                listE = pq.v.e(ju.z.a(null));
            }
            if (list2.contains(b.POST_CAPTURE)) {
                ju.k.d(h0Var.threads.getSequentialScope(), null, null, new f(listE, null, i16 != 0, this), 3, null);
            }
            return listE;
        }
        if (i18 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i19 = gVar.f45882d;
        mainCaptureParams2 = (MainCaptureParams) gVar.f45885g;
        List<? extends b> list3 = (List) gVar.f45884f;
        h0Var = (h0) gVar.f45883e;
        oq.u.b(obj);
        i16 = i19;
        list2 = list3;
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused8 = e.c.TRUNCATED_TAG;
        }
        if (o.e1.f("CXCP")) {
            String unused9 = e.c.TRUNCATED_TAG;
        }
        if (list2.contains(b.MAIN_CAPTURE)) {
            if (o.e1.f("CXCP")) {
                String unused10 = e.c.TRUNCATED_TAG;
            }
            if (mainCaptureParams2 != null) {
                throw new IllegalStateException("Required value was null.");
            }
            listE = h0Var.S(mainCaptureParams2);
            if (o.e1.f("CXCP")) {
                String unused11 = e.c.TRUNCATED_TAG;
            }
        } else {
            listE = pq.v.e(ju.z.a(null));
        }
        if (list2.contains(b.POST_CAPTURE)) {
            ju.k.d(h0Var.threads.getSequentialScope(), null, null, new f(listE, null, i16 != 0, this), 3, null);
        }
        return listE;
    }

    private final er.l<h.q0, Boolean> E(final boolean isTorchAsFlash) {
        return new er.l() { // from class: e.g0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(h0.F(this.f45801a, isTorchAsFlash, (h.q0) obj));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(h0 h0Var, boolean z15, h.q0 q0Var) {
        return v.q1.a(h0Var.T(q0Var), z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object G(tq.e<? super h.q0> eVar) throws Throwable {
        j jVar;
        h0 h0Var;
        h0 h0Var2;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f45925g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f45925g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        j jVar2 = jVar;
        Object objZ = jVar2.f45923e;
        Object objE = uq.b.e();
        int i16 = jVar2.f45925g;
        if (i16 == 0) {
            oq.u.b(objZ);
            if (this.frameMetadata == null) {
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
                long j15 = i0.f46012a;
                jVar2.f45922d = this;
                jVar2.f45925g = 1;
                h0Var = this;
                objZ = Z(h0Var, j15, null, jVar2, 2, null);
                if (objZ == objE) {
                    return objE;
                }
                h0Var2 = h0Var;
            } else {
                h0Var = this;
            }
            e.c cVar2 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                Objects.toString(this.frameMetadata);
            }
            return h0Var.frameMetadata;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var2 = (h0) jVar2.f45922d;
        oq.u.b(objZ);
        h0Var = this;
        h.p0 p0Var = (h.p0) objZ;
        h0Var2.frameMetadata = p0Var != null ? p0Var.getMetadata() : null;
        e.c cVar3 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused3 = e.c.TRUNCATED_TAG;
            Objects.toString(this.frameMetadata);
        }
        return h0Var.frameMetadata;
    }

    private final boolean H() {
        return ((Boolean) this.hasFlashUnit.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l2 J() {
        return (l2) this.useCaseCameraState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(e.b0 b0Var) {
        return c.l.b(b0Var, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object L(List<? extends b> list, int i15, int i16, int i17, MainCaptureParams mainCaptureParams, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Exception {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i18 = kVar.f45932k;
            if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f45932k = i18 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        k kVar2 = kVar;
        Object objP = kVar2.f45930h;
        Object objE = uq.b.e();
        int i19 = kVar2.f45932k;
        if (i19 == 0) {
            oq.u.b(objP);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                Objects.toString(list);
            }
            this.frameMetadata = null;
            if (list.contains(b.MAIN_CAPTURE) && mainCaptureParams == null) {
                throw new IllegalStateException("Must not be null for PipelineType.MAIN_CAPTURE");
            }
            if (i16 == 3) {
                kVar2.f45932k = 1;
                Object objR = R(mainCaptureParams, i15, list, kVar2);
                if (objR != objE) {
                    return objR;
                }
            } else {
                kVar2.f45926d = list;
                kVar2.f45927e = mainCaptureParams;
                kVar2.f45928f = i15;
                kVar2.f45929g = i16;
                kVar2.f45932k = 2;
                objP = P(i17, kVar2);
                if (objP != objE) {
                }
            }
            return objE;
        }
        if (i19 == 1) {
            oq.u.b(objP);
            return objP;
        }
        if (i19 != 2) {
            if (i19 == 3) {
                oq.u.b(objP);
                return objP;
            }
            if (i19 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objP);
            return objP;
        }
        i16 = kVar2.f45929g;
        i15 = kVar2.f45928f;
        mainCaptureParams = (MainCaptureParams) kVar2.f45927e;
        list = (List) kVar2.f45926d;
        oq.u.b(objP);
        int i25 = i16;
        int i26 = i15;
        MainCaptureParams mainCaptureParams2 = mainCaptureParams;
        List<? extends b> list2 = list;
        if (((Boolean) objP).booleanValue()) {
            kVar2.f45926d = null;
            kVar2.f45927e = null;
            kVar2.f45932k = 3;
            Object objV = V(mainCaptureParams2, i26, i25, list2, kVar2);
            if (objV != objE) {
                return objV;
            }
        } else {
            kVar2.f45926d = null;
            kVar2.f45927e = null;
            kVar2.f45932k = 4;
            Object objC = C(mainCaptureParams2, i26, i25, list2, kVar2);
            if (objC != objE) {
                return objC;
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(int i15, tq.e<? super Boolean> eVar) throws Throwable {
        n nVar;
        Integer num;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i16 = nVar.f45945f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f45945f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object objG = nVar.f45943d;
        Object objE = uq.b.e();
        int i17 = nVar.f45945f;
        boolean z15 = false;
        if (i17 == 0) {
            oq.u.b(objG);
            if (i15 == 0) {
                nVar.f45945f = 1;
                objG = G(nVar);
                if (objG == objE) {
                    return objE;
                }
            } else if (i15 == 1) {
                z15 = true;
            } else if (i15 != 2 && i15 != 3) {
                throw new AssertionError(i15);
            }
            return vq.b.a(z15);
        }
        if (i17 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oq.u.b(objG);
        h.q0 q0Var = (h.q0) objG;
        if (q0Var != null && (num = (Integer) q0Var.I(CaptureResult.CONTROL_AE_STATE)) != null && num.intValue() == 4) {
            z15 = true;
        }
        return vq.b.a(z15);
    }

    private final Object P(int i15, tq.e<? super Boolean> eVar) {
        return (getTemplate() == 3 || i15 == 1) ? vq.b.a(true) : this.useTorchAsFlash.a(new o(null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Q(long j15, boolean z15, tq.e<? super Result3A> eVar) throws Exception {
        p pVar;
        boolean z16;
        long j16;
        AutoCloseable autoCloseable;
        Object obj;
        AutoCloseable autoCloseable2;
        h.s.g gVar;
        h.z0 z0VarD;
        er.l<h.q0, Boolean> lVarE;
        long j17;
        p pVar2;
        int i15;
        Object objZ2;
        p pVar3;
        AutoCloseable autoCloseable3;
        Throwable th4;
        Object objI;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i16 = pVar.f45953j;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f45953j = i16 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object objM3 = pVar.f45951g;
        Object objE = uq.b.e();
        int i17 = pVar.f45953j;
        try {
            try {
                if (i17 != 0) {
                    if (i17 == 1) {
                        z16 = pVar.f45949e;
                        long j18 = pVar.f45948d;
                        oq.u.b(objM3);
                        j16 = j18;
                    } else {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(objM3);
                            return objM3;
                        }
                        autoCloseable3 = (AutoCloseable) pVar.f45950f;
                        try {
                            oq.u.b(objM3);
                            objZ2 = objM3;
                            obj = objE;
                            pVar3 = pVar;
                            autoCloseable2 = autoCloseable3;
                            i15 = 3;
                        } catch (Throwable th5) {
                            th4 = th5;
                            try {
                                throw th4;
                            } catch (Throwable th6) {
                                cr.a.a(autoCloseable3, th4);
                                throw th6;
                            }
                        }
                    }
                    ju.w0 w0Var = (ju.w0) objZ2;
                    cr.a.a(autoCloseable2, null);
                    pVar3.f45950f = null;
                    pVar3.f45953j = i15;
                    objI = w0Var.I(pVar3);
                    if (objI == obj) {
                        return obj;
                    }
                    return objI;
                }
                oq.u.b(objM3);
                h.s sVarF = this.useCaseGraphContext.f();
                pVar.f45948d = j15;
                z16 = z15;
                pVar.f45949e = z16;
                pVar.f45953j = 1;
                objM3 = sVarF.m3(pVar);
                if (objM3 == objE) {
                    return objE;
                }
                j16 = j15;
                objZ2 = h.s.g.Z2(gVar, null, null, null, null, null, null, null, z0VarD, null, null, lVarE, null, 0, j16, j17, pVar2, 6719, null);
                pVar3 = pVar2;
                if (objZ2 == obj) {
                    return obj;
                }
                ju.w0 w0Var2 = (ju.w0) objZ2;
                cr.a.a(autoCloseable2, null);
                pVar3.f45950f = null;
                pVar3.f45953j = i15;
                objI = w0Var2.I(pVar3);
                if (objI == obj) {
                    return obj;
                }
                return objI;
            } catch (Throwable th7) {
                th = th7;
                th4 = th;
                autoCloseable3 = autoCloseable2;
                throw th4;
            }
            gVar = (h.s.g) autoCloseable;
            z0VarD = h.z0.d(h.z0.INSTANCE.a());
            lVarE = E(z16);
            j17 = i0.f46013b;
            pVar.f45950f = autoCloseable;
            pVar.f45953j = 2;
            pVar2 = pVar;
            autoCloseable2 = autoCloseable;
            i15 = 3;
        } catch (Throwable th8) {
            th = th8;
            autoCloseable2 = autoCloseable;
            th4 = th;
            autoCloseable3 = autoCloseable2;
            throw th4;
        }
        autoCloseable = (AutoCloseable) objM3;
        obj = objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(MainCaptureParams mainCaptureParams, int i15, List<? extends b> list, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Throwable {
        r rVar;
        h0 h0Var;
        List<ju.w0<Void>> listE;
        if (eVar instanceof r) {
            rVar = (r) eVar;
            int i16 = rVar.f45964k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f45964k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(eVar);
            }
        } else {
            rVar = new r(eVar);
        }
        Object obj = rVar.f45962h;
        Object objE = uq.b.e();
        int i17 = rVar.f45964k;
        if (i17 == 0) {
            oq.u.b(obj);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            if (o.e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                Objects.toString(list);
            }
            if (list.contains(b.PRE_CAPTURE)) {
                if (o.e1.f("CXCP")) {
                    String unused3 = e.c.TRUNCATED_TAG;
                }
                rVar.f45959e = this;
                rVar.f45960f = list;
                rVar.f45961g = mainCaptureParams;
                rVar.f45958d = i15;
                rVar.f45964k = 1;
                if (N(i15, rVar) == objE) {
                    return objE;
                }
                h0Var = this;
            } else {
                h0Var = this;
            }
            if (list.contains(b.MAIN_CAPTURE)) {
                if (o.e1.f("CXCP")) {
                    String unused4 = e.c.TRUNCATED_TAG;
                }
                if (mainCaptureParams != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                listE = h0Var.S(mainCaptureParams);
                if (o.e1.f("CXCP")) {
                    String unused5 = e.c.TRUNCATED_TAG;
                }
            } else {
                listE = pq.v.e(ju.z.a(null));
            }
            if (list.contains(b.POST_CAPTURE)) {
                ju.k.d(h0Var.threads.getSequentialScope(), null, null, new q(listE, null, this, i15), 3, null);
            }
            return listE;
        }
        if (i17 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i15 = rVar.f45958d;
        mainCaptureParams = (MainCaptureParams) rVar.f45961g;
        list = (List) rVar.f45960f;
        h0Var = (h0) rVar.f45959e;
        oq.u.b(obj);
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused6 = e.c.TRUNCATED_TAG;
        }
        if (list.contains(b.MAIN_CAPTURE)) {
            if (o.e1.f("CXCP")) {
                String unused7 = e.c.TRUNCATED_TAG;
            }
            if (mainCaptureParams != null) {
                throw new IllegalStateException("Required value was null.");
            }
            listE = h0Var.S(mainCaptureParams);
            if (o.e1.f("CXCP")) {
                String unused8 = e.c.TRUNCATED_TAG;
            }
        } else {
            listE = pq.v.e(ju.z.a(null));
        }
        if (list.contains(b.POST_CAPTURE)) {
            ju.k.d(h0Var.threads.getSequentialScope(), null, null, new q(listE, null, this, i15), 3, null);
        }
        return listE;
    }

    private final List<ju.w0<Void>> S(MainCaptureParams params) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(params.a());
        }
        ArrayList arrayList = new ArrayList();
        List<v.n1> listA = params.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (true) {
            h.g1 g1VarD = null;
            if (!it.hasNext()) {
                break;
            }
            v.n1 n1Var = (v.n1) it.next();
            ju.x xVarC = ju.z.c(null, 1, null);
            arrayList.add(xVarC);
            try {
                g1VarD = this.configAdapter.d(n1Var, params.getRequestTemplate(), params.getSessionConfigOptions(), pq.v.e(new t(xVarC)));
            } catch (IllegalStateException e15) {
                e.c cVar2 = e.c.f45719a;
                if (o.e1.h("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
                xVarC.p(new o.v0(2, "Capture request failed with reason " + e15.getMessage(), e15));
            }
            if (g1VarD != null) {
                arrayList2.add(g1VarD);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        ju.k.d(this.threads.getSequentialScope(), null, null, new s(null, this, arrayList, arrayList2), 3, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v.c0 T(h.q0 q0Var) {
        return new PRN.s(this.emptyRequestMetadata, q0Var.Y0(), new u(q0Var, this), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0277  */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x030f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0315  */
    /* JADX WARN: Code duplicated, block: B:135:0x031a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0324  */
    /* JADX WARN: Code duplicated, block: B:138:0x0328  */
    /* JADX WARN: Code duplicated, block: B:140:0x0330  */
    /* JADX WARN: Code duplicated, block: B:143:0x0340  */
    /* JADX WARN: Code duplicated, block: B:145:0x034b  */
    /* JADX WARN: Code duplicated, block: B:146:0x034e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0353  */
    /* JADX WARN: Code duplicated, block: B:62:0x019b  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0228  */
    /* JADX WARN: Code duplicated, block: B:86:0x024d  */
    /* JADX WARN: Code duplicated, block: B:87:0x024f  */
    /* JADX WARN: Code duplicated, block: B:91:0x025e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0272  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    public final Object U(MainCaptureParams mainCaptureParams, int i15, long j15, List<? extends b> list, boolean z15, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Exception {
        w wVar;
        ?? r15;
        Throwable th4;
        ?? r16;
        int i16;
        MainCaptureParams mainCaptureParams2;
        boolean z16;
        Throwable th5;
        int i17;
        List<? extends b> list2;
        h0 h0Var;
        int i18;
        boolean z17;
        int i19;
        int i25;
        boolean z18;
        List<? extends b> list3;
        int i26;
        long j16;
        long j17;
        boolean z19;
        int i27;
        x xVar;
        int i28;
        MainCaptureParams mainCaptureParams3;
        List<? extends b> list4;
        h0 h0Var2;
        Object objM3;
        long j18;
        int i29;
        MainCaptureParams mainCaptureParams4;
        int i35;
        List<? extends b> list5;
        h0 h0Var3;
        AutoCloseable autoCloseable;
        boolean z25;
        boolean z26;
        boolean z27;
        int i36;
        MainCaptureParams mainCaptureParams5;
        Object objR3;
        AutoCloseable autoCloseable2;
        h0 h0Var4;
        boolean z28;
        Result3A result3A;
        List<ju.w0<Void>> listE;
        int i37;
        boolean z29;
        int i38;
        if (!(eVar instanceof w) || (r15 = (i38 = (wVar = (w) eVar).f45995q) & PKIFailureInfo.systemUnavail) == 0) {
            wVar = new w(eVar);
        } else {
            wVar.f45995q = i38 - PKIFailureInfo.systemUnavail;
        }
        w wVar2 = wVar;
        Object objI = wVar2.f45993n;
        Object objE = uq.b.e();
        try {
            switch (wVar2.f45995q) {
                case 0:
                    oq.u.b(objI);
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                    }
                    Integer numF = this.torchControl.g().f();
                    i16 = (numF != null && numF.intValue() == 0) ? 1 : 0;
                    int i39 = (i16 != 0 || i15 == 0) ? 1 : 0;
                    if (o.e1.f("CXCP")) {
                        String unused2 = e.c.TRUNCATED_TAG;
                        Objects.toString(list);
                    }
                    if (list.contains(b.PRE_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused3 = e.c.TRUNCATED_TAG;
                        }
                        if (i16 != 0) {
                            if (o.e1.f("CXCP")) {
                                String unused4 = e.c.TRUNCATED_TAG;
                            }
                            ju.w0 w0VarN = x1.n(this.torchControl, x1.a.INSTANCE.c(), false, false, 6, null);
                            wVar2.f45989j = this;
                            wVar2.f45990k = list;
                            mainCaptureParams2 = mainCaptureParams;
                            wVar2.f45991l = mainCaptureParams2;
                            wVar2.f45984d = i15;
                            wVar2.f45987g = j15;
                            wVar2.f45988h = z15;
                            wVar2.f45985e = i16;
                            wVar2.f45986f = i39;
                            wVar2.f45995q = 1;
                            if (w0VarN.T0(wVar2) != objE) {
                                i19 = i16;
                                h0Var = this;
                                i25 = i39;
                                z18 = z15;
                                list3 = list;
                                j17 = j15;
                                i26 = i15;
                                j16 = j17;
                                e.c cVar2 = e.c.f45719a;
                                if (o.e1.f("CXCP")) {
                                    String unused5 = e.c.TRUNCATED_TAG;
                                }
                                if (!z18) {
                                    if (o.e1.f("CXCP")) {
                                        String unused6 = e.c.TRUNCATED_TAG;
                                    }
                                    h.s sVarF = this.useCaseGraphContext.f();
                                    wVar2.f45989j = h0Var;
                                    wVar2.f45990k = list3;
                                    wVar2.f45991l = mainCaptureParams2;
                                    wVar2.f45984d = i26;
                                    wVar2.f45987g = j16;
                                    wVar2.f45988h = z18;
                                    wVar2.f45985e = i19;
                                    wVar2.f45986f = i25;
                                    wVar2.f45995q = 2;
                                    objM3 = sVarF.m3(wVar2);
                                    if (objM3 != objE) {
                                        j18 = j16;
                                        i18 = i25;
                                        objI = objM3;
                                        i29 = i19;
                                        mainCaptureParams4 = mainCaptureParams2;
                                        i35 = i26;
                                        long j19 = j18;
                                        list5 = list3;
                                        h0Var3 = h0Var;
                                        autoCloseable = (AutoCloseable) objI;
                                        try {
                                            h.s.g gVar = (h.s.g) autoCloseable;
                                            if (i35 == 0) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (i35 == 0) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            wVar2.f45989j = h0Var3;
                                            wVar2.f45990k = list5;
                                            wVar2.f45991l = mainCaptureParams4;
                                            wVar2.f45992m = autoCloseable;
                                            wVar2.f45984d = i35;
                                            wVar2.f45988h = z18;
                                            wVar2.f45985e = i29;
                                            wVar2.f45986f = i18;
                                            wVar2.f45995q = 3;
                                            z27 = z18;
                                            i36 = i35;
                                            boolean z35 = z26;
                                            mainCaptureParams5 = mainCaptureParams4;
                                            th5 = null;
                                            objR3 = h.s.g.R3(gVar, z25, z35, 0, j19, wVar2, 4, null);
                                            if (objR3 != objE) {
                                                autoCloseable2 = autoCloseable;
                                                objI = objR3;
                                                list2 = list5;
                                                mainCaptureParams2 = mainCaptureParams5;
                                                h0Var4 = h0Var3;
                                                z28 = z27;
                                                wVar2.f45989j = h0Var4;
                                                wVar2.f45990k = list2;
                                                wVar2.f45991l = mainCaptureParams2;
                                                wVar2.f45992m = autoCloseable2;
                                                wVar2.f45984d = i36;
                                                wVar2.f45988h = z28;
                                                wVar2.f45985e = i29;
                                                wVar2.f45986f = i18;
                                                wVar2.f45995q = 4;
                                                objI = ((ju.w0) objI).I(wVar2);
                                                if (objI == objE) {
                                                    z19 = z28;
                                                    i27 = i36;
                                                    r15 = autoCloseable2;
                                                    result3A = (Result3A) objI;
                                                    cr.a.a(r15, th5);
                                                    e.c cVar3 = e.c.f45719a;
                                                    if (o.e1.f("CXCP")) {
                                                        String unused7 = e.c.TRUNCATED_TAG;
                                                        Objects.toString(result3A);
                                                    }
                                                    i16 = i29;
                                                    h0Var = h0Var4;
                                                    z16 = true;
                                                    if (o.e1.f("CXCP")) {
                                                        String unused8 = e.c.TRUNCATED_TAG;
                                                    }
                                                    i17 = i27;
                                                    z17 = z19;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th4 = th6;
                                            r16 = autoCloseable;
                                            try {
                                                throw th4;
                                            } catch (Throwable th7) {
                                                cr.a.a(r16, th4);
                                                throw th7;
                                            }
                                        }
                                    }
                                } else {
                                    th5 = null;
                                    if (i25 == 0) {
                                        z16 = true;
                                        i18 = i25;
                                        z19 = z18;
                                        i16 = i19;
                                        i27 = i26;
                                        list2 = list3;
                                    } else if (i26 == 0) {
                                        if (o.e1.f("CXCP")) {
                                            String unused9 = e.c.TRUNCATED_TAG;
                                        }
                                        wVar2.f45989j = h0Var;
                                        wVar2.f45990k = list3;
                                        wVar2.f45991l = mainCaptureParams2;
                                        wVar2.f45984d = i26;
                                        wVar2.f45988h = z18;
                                        wVar2.f45985e = i19;
                                        wVar2.f45986f = i25;
                                        wVar2.f45995q = 5;
                                        z16 = true;
                                        if (Q(j16, true, wVar2) != objE) {
                                            i18 = i25;
                                            z19 = z18;
                                            i28 = i19;
                                            mainCaptureParams3 = mainCaptureParams2;
                                            i27 = i26;
                                            list4 = list3;
                                            h0Var2 = h0Var;
                                            e.c cVar4 = e.c.f45719a;
                                            if (o.e1.f("CXCP")) {
                                                String unused10 = e.c.TRUNCATED_TAG;
                                            }
                                            i16 = i28;
                                            h0Var = h0Var2;
                                            list2 = list4;
                                            mainCaptureParams2 = mainCaptureParams3;
                                        }
                                    } else {
                                        z16 = true;
                                        if (o.e1.f("CXCP")) {
                                            String unused11 = e.c.TRUNCATED_TAG;
                                        }
                                        xVar = new x();
                                        wVar2.f45989j = h0Var;
                                        wVar2.f45990k = list3;
                                        wVar2.f45991l = mainCaptureParams2;
                                        wVar2.f45984d = i26;
                                        wVar2.f45988h = z18;
                                        wVar2.f45985e = i19;
                                        wVar2.f45986f = i25;
                                        wVar2.f45995q = 6;
                                        if (Y(j16, xVar, wVar2) != objE) {
                                            i18 = i25;
                                            z19 = z18;
                                            i28 = i19;
                                            mainCaptureParams3 = mainCaptureParams2;
                                            i27 = i26;
                                            list4 = list3;
                                            h0Var2 = h0Var;
                                            e.c cVar5 = e.c.f45719a;
                                            if (o.e1.f("CXCP")) {
                                                String unused12 = e.c.TRUNCATED_TAG;
                                            }
                                            i16 = i28;
                                            h0Var = h0Var2;
                                            list2 = list4;
                                            mainCaptureParams2 = mainCaptureParams3;
                                        }
                                    }
                                    if (o.e1.f("CXCP")) {
                                        String unused13 = e.c.TRUNCATED_TAG;
                                    }
                                    i17 = i27;
                                    z17 = z19;
                                }
                            }
                        } else {
                            mainCaptureParams2 = mainCaptureParams;
                            i19 = i16;
                            h0Var = this;
                            i25 = i39;
                            z18 = z15;
                            list3 = list;
                            i26 = i15;
                            j16 = j15;
                            if (!z18) {
                                if (o.e1.f("CXCP")) {
                                    String unused14 = e.c.TRUNCATED_TAG;
                                }
                                h.s sVarF2 = this.useCaseGraphContext.f();
                                wVar2.f45989j = h0Var;
                                wVar2.f45990k = list3;
                                wVar2.f45991l = mainCaptureParams2;
                                wVar2.f45984d = i26;
                                wVar2.f45987g = j16;
                                wVar2.f45988h = z18;
                                wVar2.f45985e = i19;
                                wVar2.f45986f = i25;
                                wVar2.f45995q = 2;
                                objM3 = sVarF2.m3(wVar2);
                                if (objM3 != objE) {
                                    j18 = j16;
                                    i18 = i25;
                                    objI = objM3;
                                    i29 = i19;
                                    mainCaptureParams4 = mainCaptureParams2;
                                    i35 = i26;
                                    long j110 = j18;
                                    list5 = list3;
                                    h0Var3 = h0Var;
                                    autoCloseable = (AutoCloseable) objI;
                                    h.s.g gVar2 = (h.s.g) autoCloseable;
                                    if (i35 == 0) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    if (i35 == 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    wVar2.f45989j = h0Var3;
                                    wVar2.f45990k = list5;
                                    wVar2.f45991l = mainCaptureParams4;
                                    wVar2.f45992m = autoCloseable;
                                    wVar2.f45984d = i35;
                                    wVar2.f45988h = z18;
                                    wVar2.f45985e = i29;
                                    wVar2.f45986f = i18;
                                    wVar2.f45995q = 3;
                                    z27 = z18;
                                    i36 = i35;
                                    boolean z36 = z26;
                                    mainCaptureParams5 = mainCaptureParams4;
                                    th5 = null;
                                    objR3 = h.s.g.R3(gVar2, z25, z36, 0, j110, wVar2, 4, null);
                                    if (objR3 != objE) {
                                        autoCloseable2 = autoCloseable;
                                        objI = objR3;
                                        list2 = list5;
                                        mainCaptureParams2 = mainCaptureParams5;
                                        h0Var4 = h0Var3;
                                        z28 = z27;
                                        wVar2.f45989j = h0Var4;
                                        wVar2.f45990k = list2;
                                        wVar2.f45991l = mainCaptureParams2;
                                        wVar2.f45992m = autoCloseable2;
                                        wVar2.f45984d = i36;
                                        wVar2.f45988h = z28;
                                        wVar2.f45985e = i29;
                                        wVar2.f45986f = i18;
                                        wVar2.f45995q = 4;
                                        objI = ((ju.w0) objI).I(wVar2);
                                        if (objI == objE) {
                                            z19 = z28;
                                            i27 = i36;
                                            r15 = autoCloseable2;
                                            result3A = (Result3A) objI;
                                            cr.a.a(r15, th5);
                                            e.c cVar6 = e.c.f45719a;
                                            if (o.e1.f("CXCP")) {
                                                String unused15 = e.c.TRUNCATED_TAG;
                                                Objects.toString(result3A);
                                            }
                                            i16 = i29;
                                            h0Var = h0Var4;
                                            z16 = true;
                                            if (o.e1.f("CXCP")) {
                                                String unused16 = e.c.TRUNCATED_TAG;
                                            }
                                            i17 = i27;
                                            z17 = z19;
                                        }
                                    }
                                }
                            } else {
                                th5 = null;
                                if (i25 == 0) {
                                    z16 = true;
                                    i18 = i25;
                                    z19 = z18;
                                    i16 = i19;
                                    i27 = i26;
                                    list2 = list3;
                                } else if (i26 == 0) {
                                    if (o.e1.f("CXCP")) {
                                        String unused17 = e.c.TRUNCATED_TAG;
                                    }
                                    wVar2.f45989j = h0Var;
                                    wVar2.f45990k = list3;
                                    wVar2.f45991l = mainCaptureParams2;
                                    wVar2.f45984d = i26;
                                    wVar2.f45988h = z18;
                                    wVar2.f45985e = i19;
                                    wVar2.f45986f = i25;
                                    wVar2.f45995q = 5;
                                    z16 = true;
                                    if (Q(j16, true, wVar2) != objE) {
                                        i18 = i25;
                                        z19 = z18;
                                        i28 = i19;
                                        mainCaptureParams3 = mainCaptureParams2;
                                        i27 = i26;
                                        list4 = list3;
                                        h0Var2 = h0Var;
                                        e.c cVar7 = e.c.f45719a;
                                        if (o.e1.f("CXCP")) {
                                            String unused18 = e.c.TRUNCATED_TAG;
                                        }
                                        i16 = i28;
                                        h0Var = h0Var2;
                                        list2 = list4;
                                        mainCaptureParams2 = mainCaptureParams3;
                                    }
                                } else {
                                    z16 = true;
                                    if (o.e1.f("CXCP")) {
                                        String unused19 = e.c.TRUNCATED_TAG;
                                    }
                                    xVar = new x();
                                    wVar2.f45989j = h0Var;
                                    wVar2.f45990k = list3;
                                    wVar2.f45991l = mainCaptureParams2;
                                    wVar2.f45984d = i26;
                                    wVar2.f45988h = z18;
                                    wVar2.f45985e = i19;
                                    wVar2.f45986f = i25;
                                    wVar2.f45995q = 6;
                                    if (Y(j16, xVar, wVar2) != objE) {
                                        i18 = i25;
                                        z19 = z18;
                                        i28 = i19;
                                        mainCaptureParams3 = mainCaptureParams2;
                                        i27 = i26;
                                        list4 = list3;
                                        h0Var2 = h0Var;
                                        e.c cVar8 = e.c.f45719a;
                                        if (o.e1.f("CXCP")) {
                                            String unused110 = e.c.TRUNCATED_TAG;
                                        }
                                        i16 = i28;
                                        h0Var = h0Var2;
                                        list2 = list4;
                                        mainCaptureParams2 = mainCaptureParams3;
                                    }
                                }
                                if (o.e1.f("CXCP")) {
                                    String unused111 = e.c.TRUNCATED_TAG;
                                }
                                i17 = i27;
                                z17 = z19;
                            }
                        }
                        return objE;
                    }
                    mainCaptureParams2 = mainCaptureParams;
                    z16 = true;
                    th5 = null;
                    i17 = i15;
                    list2 = list;
                    h0Var = this;
                    i18 = i39;
                    z17 = z15;
                    if (list2.contains(b.MAIN_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused20 = e.c.TRUNCATED_TAG;
                        }
                        if (mainCaptureParams2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        listE = h0Var.S(mainCaptureParams2);
                        if (o.e1.f("CXCP")) {
                            String unused21 = e.c.TRUNCATED_TAG;
                        }
                    } else {
                        listE = pq.v.e(ju.z.a(th5));
                    }
                    if (list2.contains(b.POST_CAPTURE)) {
                        ju.p0 sequentialScope = h0Var.threads.getSequentialScope();
                        i37 = i18;
                        if (i16 != 0) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        if (i37 == 0) {
                            z16 = false;
                        }
                        ju.k.d(sequentialScope, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                    }
                    return listE;
                case 1:
                    int i45 = wVar2.f45986f;
                    int i46 = wVar2.f45985e;
                    z18 = wVar2.f45988h;
                    long j25 = wVar2.f45987g;
                    i26 = wVar2.f45984d;
                    MainCaptureParams mainCaptureParams6 = (MainCaptureParams) wVar2.f45991l;
                    list3 = (List) wVar2.f45990k;
                    h0Var = (h0) wVar2.f45989j;
                    oq.u.b(objI);
                    i25 = i45;
                    j17 = j25;
                    i19 = i46;
                    mainCaptureParams2 = mainCaptureParams6;
                    j16 = j17;
                    e.c cVar9 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused22 = e.c.TRUNCATED_TAG;
                    }
                    if (!z18) {
                        th5 = null;
                        if (i25 == 0) {
                            z16 = true;
                            i18 = i25;
                            z19 = z18;
                            i16 = i19;
                            i27 = i26;
                            list2 = list3;
                        } else if (i26 == 0) {
                            if (o.e1.f("CXCP")) {
                                String unused112 = e.c.TRUNCATED_TAG;
                            }
                            wVar2.f45989j = h0Var;
                            wVar2.f45990k = list3;
                            wVar2.f45991l = mainCaptureParams2;
                            wVar2.f45984d = i26;
                            wVar2.f45988h = z18;
                            wVar2.f45985e = i19;
                            wVar2.f45986f = i25;
                            wVar2.f45995q = 5;
                            z16 = true;
                            if (Q(j16, true, wVar2) != objE) {
                                i18 = i25;
                                z19 = z18;
                                i28 = i19;
                                mainCaptureParams3 = mainCaptureParams2;
                                i27 = i26;
                                list4 = list3;
                                h0Var2 = h0Var;
                                e.c cVar10 = e.c.f45719a;
                                if (o.e1.f("CXCP")) {
                                    String unused113 = e.c.TRUNCATED_TAG;
                                }
                                i16 = i28;
                                h0Var = h0Var2;
                                list2 = list4;
                                mainCaptureParams2 = mainCaptureParams3;
                            }
                        } else {
                            z16 = true;
                            if (o.e1.f("CXCP")) {
                                String unused114 = e.c.TRUNCATED_TAG;
                            }
                            xVar = new x();
                            wVar2.f45989j = h0Var;
                            wVar2.f45990k = list3;
                            wVar2.f45991l = mainCaptureParams2;
                            wVar2.f45984d = i26;
                            wVar2.f45988h = z18;
                            wVar2.f45985e = i19;
                            wVar2.f45986f = i25;
                            wVar2.f45995q = 6;
                            if (Y(j16, xVar, wVar2) != objE) {
                                i18 = i25;
                                z19 = z18;
                                i28 = i19;
                                mainCaptureParams3 = mainCaptureParams2;
                                i27 = i26;
                                list4 = list3;
                                h0Var2 = h0Var;
                                e.c cVar11 = e.c.f45719a;
                                if (o.e1.f("CXCP")) {
                                    String unused115 = e.c.TRUNCATED_TAG;
                                }
                                i16 = i28;
                                h0Var = h0Var2;
                                list2 = list4;
                                mainCaptureParams2 = mainCaptureParams3;
                            }
                        }
                        if (o.e1.f("CXCP")) {
                            String unused116 = e.c.TRUNCATED_TAG;
                        }
                        i17 = i27;
                        z17 = z19;
                        if (list2.contains(b.MAIN_CAPTURE)) {
                            if (o.e1.f("CXCP")) {
                                String unused23 = e.c.TRUNCATED_TAG;
                            }
                            if (mainCaptureParams2 != null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            listE = h0Var.S(mainCaptureParams2);
                            if (o.e1.f("CXCP")) {
                                String unused24 = e.c.TRUNCATED_TAG;
                            }
                        } else {
                            listE = pq.v.e(ju.z.a(th5));
                        }
                        if (list2.contains(b.POST_CAPTURE)) {
                            ju.p0 sequentialScope2 = h0Var.threads.getSequentialScope();
                            i37 = i18;
                            if (i16 != 0) {
                                z29 = z16;
                            } else {
                                z29 = false;
                            }
                            if (i37 == 0) {
                                z16 = false;
                            }
                            ju.k.d(sequentialScope2, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                        }
                        return listE;
                    }
                    if (o.e1.f("CXCP")) {
                        String unused117 = e.c.TRUNCATED_TAG;
                    }
                    h.s sVarF3 = this.useCaseGraphContext.f();
                    wVar2.f45989j = h0Var;
                    wVar2.f45990k = list3;
                    wVar2.f45991l = mainCaptureParams2;
                    wVar2.f45984d = i26;
                    wVar2.f45987g = j16;
                    wVar2.f45988h = z18;
                    wVar2.f45985e = i19;
                    wVar2.f45986f = i25;
                    wVar2.f45995q = 2;
                    objM3 = sVarF3.m3(wVar2);
                    if (objM3 != objE) {
                        j18 = j16;
                        i18 = i25;
                        objI = objM3;
                        i29 = i19;
                        mainCaptureParams4 = mainCaptureParams2;
                        i35 = i26;
                        long j111 = j18;
                        list5 = list3;
                        h0Var3 = h0Var;
                        autoCloseable = (AutoCloseable) objI;
                        h.s.g gVar3 = (h.s.g) autoCloseable;
                        if (i35 == 0) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (i35 == 0) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        wVar2.f45989j = h0Var3;
                        wVar2.f45990k = list5;
                        wVar2.f45991l = mainCaptureParams4;
                        wVar2.f45992m = autoCloseable;
                        wVar2.f45984d = i35;
                        wVar2.f45988h = z18;
                        wVar2.f45985e = i29;
                        wVar2.f45986f = i18;
                        wVar2.f45995q = 3;
                        z27 = z18;
                        i36 = i35;
                        boolean z37 = z26;
                        mainCaptureParams5 = mainCaptureParams4;
                        th5 = null;
                        objR3 = h.s.g.R3(gVar3, z25, z37, 0, j111, wVar2, 4, null);
                        if (objR3 != objE) {
                            autoCloseable2 = autoCloseable;
                            objI = objR3;
                            list2 = list5;
                            mainCaptureParams2 = mainCaptureParams5;
                            h0Var4 = h0Var3;
                            z28 = z27;
                            wVar2.f45989j = h0Var4;
                            wVar2.f45990k = list2;
                            wVar2.f45991l = mainCaptureParams2;
                            wVar2.f45992m = autoCloseable2;
                            wVar2.f45984d = i36;
                            wVar2.f45988h = z28;
                            wVar2.f45985e = i29;
                            wVar2.f45986f = i18;
                            wVar2.f45995q = 4;
                            objI = ((ju.w0) objI).I(wVar2);
                            if (objI == objE) {
                                z19 = z28;
                                i27 = i36;
                                r15 = autoCloseable2;
                                result3A = (Result3A) objI;
                                cr.a.a(r15, th5);
                                e.c cVar12 = e.c.f45719a;
                                if (o.e1.f("CXCP")) {
                                    String unused118 = e.c.TRUNCATED_TAG;
                                    Objects.toString(result3A);
                                }
                                i16 = i29;
                                h0Var = h0Var4;
                                z16 = true;
                                if (o.e1.f("CXCP")) {
                                    String unused119 = e.c.TRUNCATED_TAG;
                                }
                                i17 = i27;
                                z17 = z19;
                                if (list2.contains(b.MAIN_CAPTURE)) {
                                    if (o.e1.f("CXCP")) {
                                        String unused25 = e.c.TRUNCATED_TAG;
                                    }
                                    if (mainCaptureParams2 != null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    listE = h0Var.S(mainCaptureParams2);
                                    if (o.e1.f("CXCP")) {
                                        String unused26 = e.c.TRUNCATED_TAG;
                                    }
                                } else {
                                    listE = pq.v.e(ju.z.a(th5));
                                }
                                if (list2.contains(b.POST_CAPTURE)) {
                                    ju.p0 sequentialScope3 = h0Var.threads.getSequentialScope();
                                    i37 = i18;
                                    if (i16 != 0) {
                                        z29 = z16;
                                    } else {
                                        z29 = false;
                                    }
                                    if (i37 == 0) {
                                        z16 = false;
                                    }
                                    ju.k.d(sequentialScope3, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                                }
                                return listE;
                            }
                        }
                    }
                    return objE;
                case 2:
                    i18 = wVar2.f45986f;
                    i29 = wVar2.f45985e;
                    z18 = wVar2.f45988h;
                    long j26 = wVar2.f45987g;
                    i26 = wVar2.f45984d;
                    MainCaptureParams mainCaptureParams7 = (MainCaptureParams) wVar2.f45991l;
                    list3 = (List) wVar2.f45990k;
                    h0Var = (h0) wVar2.f45989j;
                    oq.u.b(objI);
                    j18 = j26;
                    mainCaptureParams4 = mainCaptureParams7;
                    i35 = i26;
                    long j112 = j18;
                    list5 = list3;
                    h0Var3 = h0Var;
                    autoCloseable = (AutoCloseable) objI;
                    h.s.g gVar4 = (h.s.g) autoCloseable;
                    if (i35 == 0) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i35 == 0) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    wVar2.f45989j = h0Var3;
                    wVar2.f45990k = list5;
                    wVar2.f45991l = mainCaptureParams4;
                    wVar2.f45992m = autoCloseable;
                    wVar2.f45984d = i35;
                    wVar2.f45988h = z18;
                    wVar2.f45985e = i29;
                    wVar2.f45986f = i18;
                    wVar2.f45995q = 3;
                    z27 = z18;
                    i36 = i35;
                    boolean z38 = z26;
                    mainCaptureParams5 = mainCaptureParams4;
                    th5 = null;
                    objR3 = h.s.g.R3(gVar4, z25, z38, 0, j112, wVar2, 4, null);
                    if (objR3 != objE) {
                        autoCloseable2 = autoCloseable;
                        objI = objR3;
                        list2 = list5;
                        mainCaptureParams2 = mainCaptureParams5;
                        h0Var4 = h0Var3;
                        z28 = z27;
                        wVar2.f45989j = h0Var4;
                        wVar2.f45990k = list2;
                        wVar2.f45991l = mainCaptureParams2;
                        wVar2.f45992m = autoCloseable2;
                        wVar2.f45984d = i36;
                        wVar2.f45988h = z28;
                        wVar2.f45985e = i29;
                        wVar2.f45986f = i18;
                        wVar2.f45995q = 4;
                        objI = ((ju.w0) objI).I(wVar2);
                        if (objI == objE) {
                            z19 = z28;
                            i27 = i36;
                            r15 = autoCloseable2;
                            result3A = (Result3A) objI;
                            cr.a.a(r15, th5);
                            e.c cVar13 = e.c.f45719a;
                            if (o.e1.f("CXCP")) {
                                String unused1110 = e.c.TRUNCATED_TAG;
                                Objects.toString(result3A);
                            }
                            i16 = i29;
                            h0Var = h0Var4;
                            z16 = true;
                            if (o.e1.f("CXCP")) {
                                String unused1111 = e.c.TRUNCATED_TAG;
                            }
                            i17 = i27;
                            z17 = z19;
                            if (list2.contains(b.MAIN_CAPTURE)) {
                                if (o.e1.f("CXCP")) {
                                    String unused27 = e.c.TRUNCATED_TAG;
                                }
                                if (mainCaptureParams2 != null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                listE = h0Var.S(mainCaptureParams2);
                                if (o.e1.f("CXCP")) {
                                    String unused28 = e.c.TRUNCATED_TAG;
                                }
                            } else {
                                listE = pq.v.e(ju.z.a(th5));
                            }
                            if (list2.contains(b.POST_CAPTURE)) {
                                ju.p0 sequentialScope4 = h0Var.threads.getSequentialScope();
                                i37 = i18;
                                if (i16 != 0) {
                                    z29 = z16;
                                } else {
                                    z29 = false;
                                }
                                if (i37 == 0) {
                                    z16 = false;
                                }
                                ju.k.d(sequentialScope4, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                            }
                            return listE;
                        }
                    }
                    return objE;
                case 3:
                    i18 = wVar2.f45986f;
                    i29 = wVar2.f45985e;
                    z28 = wVar2.f45988h;
                    int i47 = wVar2.f45984d;
                    AutoCloseable autoCloseable3 = (AutoCloseable) wVar2.f45992m;
                    MainCaptureParams mainCaptureParams8 = (MainCaptureParams) wVar2.f45991l;
                    List<? extends b> list6 = (List) wVar2.f45990k;
                    h0 h0Var5 = (h0) wVar2.f45989j;
                    try {
                        oq.u.b(objI);
                        i36 = i47;
                        autoCloseable2 = autoCloseable3;
                        mainCaptureParams2 = mainCaptureParams8;
                        list2 = list6;
                        h0Var4 = h0Var5;
                        th5 = null;
                        wVar2.f45989j = h0Var4;
                        wVar2.f45990k = list2;
                        wVar2.f45991l = mainCaptureParams2;
                        wVar2.f45992m = autoCloseable2;
                        wVar2.f45984d = i36;
                        wVar2.f45988h = z28;
                        wVar2.f45985e = i29;
                        wVar2.f45986f = i18;
                        wVar2.f45995q = 4;
                        objI = ((ju.w0) objI).I(wVar2);
                        if (objI == objE) {
                            return objE;
                        }
                        z19 = z28;
                        i27 = i36;
                        r15 = autoCloseable2;
                        result3A = (Result3A) objI;
                        cr.a.a(r15, th5);
                        e.c cVar14 = e.c.f45719a;
                        if (o.e1.f("CXCP")) {
                            String unused1112 = e.c.TRUNCATED_TAG;
                            Objects.toString(result3A);
                        }
                        i16 = i29;
                        h0Var = h0Var4;
                        z16 = true;
                        if (o.e1.f("CXCP")) {
                            String unused1113 = e.c.TRUNCATED_TAG;
                        }
                        i17 = i27;
                        z17 = z19;
                        if (list2.contains(b.MAIN_CAPTURE)) {
                            if (o.e1.f("CXCP")) {
                                String unused29 = e.c.TRUNCATED_TAG;
                            }
                            if (mainCaptureParams2 != null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            listE = h0Var.S(mainCaptureParams2);
                            if (o.e1.f("CXCP")) {
                                String unused210 = e.c.TRUNCATED_TAG;
                            }
                        } else {
                            listE = pq.v.e(ju.z.a(th5));
                        }
                        if (list2.contains(b.POST_CAPTURE)) {
                            ju.p0 sequentialScope5 = h0Var.threads.getSequentialScope();
                            i37 = i18;
                            if (i16 != 0) {
                                z29 = z16;
                            } else {
                                z29 = false;
                            }
                            if (i37 == 0) {
                                z16 = false;
                            }
                            ju.k.d(sequentialScope5, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                        }
                        return listE;
                    } catch (Throwable th8) {
                        th4 = th8;
                        r16 = autoCloseable3;
                        throw th4;
                    }
                case 4:
                    i18 = wVar2.f45986f;
                    i29 = wVar2.f45985e;
                    z19 = wVar2.f45988h;
                    i27 = wVar2.f45984d;
                    AutoCloseable autoCloseable4 = (AutoCloseable) wVar2.f45992m;
                    mainCaptureParams2 = (MainCaptureParams) wVar2.f45991l;
                    list2 = (List) wVar2.f45990k;
                    h0Var4 = (h0) wVar2.f45989j;
                    oq.u.b(objI);
                    th5 = null;
                    r15 = autoCloseable4;
                    result3A = (Result3A) objI;
                    cr.a.a(r15, th5);
                    e.c cVar15 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused1114 = e.c.TRUNCATED_TAG;
                        Objects.toString(result3A);
                    }
                    i16 = i29;
                    h0Var = h0Var4;
                    z16 = true;
                    if (o.e1.f("CXCP")) {
                        String unused1115 = e.c.TRUNCATED_TAG;
                    }
                    i17 = i27;
                    z17 = z19;
                    if (list2.contains(b.MAIN_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused211 = e.c.TRUNCATED_TAG;
                        }
                        if (mainCaptureParams2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        listE = h0Var.S(mainCaptureParams2);
                        if (o.e1.f("CXCP")) {
                            String unused212 = e.c.TRUNCATED_TAG;
                        }
                    } else {
                        listE = pq.v.e(ju.z.a(th5));
                    }
                    if (list2.contains(b.POST_CAPTURE)) {
                        ju.p0 sequentialScope6 = h0Var.threads.getSequentialScope();
                        i37 = i18;
                        if (i16 != 0) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        if (i37 == 0) {
                            z16 = false;
                        }
                        ju.k.d(sequentialScope6, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                    }
                    return listE;
                case 5:
                    i18 = wVar2.f45986f;
                    i28 = wVar2.f45985e;
                    z19 = wVar2.f45988h;
                    i27 = wVar2.f45984d;
                    mainCaptureParams3 = (MainCaptureParams) wVar2.f45991l;
                    list4 = (List) wVar2.f45990k;
                    h0Var2 = (h0) wVar2.f45989j;
                    oq.u.b(objI);
                    z16 = true;
                    th5 = null;
                    e.c cVar16 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused1116 = e.c.TRUNCATED_TAG;
                    }
                    i16 = i28;
                    h0Var = h0Var2;
                    list2 = list4;
                    mainCaptureParams2 = mainCaptureParams3;
                    if (o.e1.f("CXCP")) {
                        String unused1117 = e.c.TRUNCATED_TAG;
                    }
                    i17 = i27;
                    z17 = z19;
                    if (list2.contains(b.MAIN_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused213 = e.c.TRUNCATED_TAG;
                        }
                        if (mainCaptureParams2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        listE = h0Var.S(mainCaptureParams2);
                        if (o.e1.f("CXCP")) {
                            String unused214 = e.c.TRUNCATED_TAG;
                        }
                    } else {
                        listE = pq.v.e(ju.z.a(th5));
                    }
                    if (list2.contains(b.POST_CAPTURE)) {
                        ju.p0 sequentialScope7 = h0Var.threads.getSequentialScope();
                        i37 = i18;
                        if (i16 != 0) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        if (i37 == 0) {
                            z16 = false;
                        }
                        ju.k.d(sequentialScope7, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                    }
                    return listE;
                case 6:
                    i18 = wVar2.f45986f;
                    i28 = wVar2.f45985e;
                    z19 = wVar2.f45988h;
                    i27 = wVar2.f45984d;
                    mainCaptureParams3 = (MainCaptureParams) wVar2.f45991l;
                    list4 = (List) wVar2.f45990k;
                    h0Var2 = (h0) wVar2.f45989j;
                    oq.u.b(objI);
                    z16 = true;
                    th5 = null;
                    e.c cVar17 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused1118 = e.c.TRUNCATED_TAG;
                    }
                    i16 = i28;
                    h0Var = h0Var2;
                    list2 = list4;
                    mainCaptureParams2 = mainCaptureParams3;
                    if (o.e1.f("CXCP")) {
                        String unused1119 = e.c.TRUNCATED_TAG;
                    }
                    i17 = i27;
                    z17 = z19;
                    if (list2.contains(b.MAIN_CAPTURE)) {
                        if (o.e1.f("CXCP")) {
                            String unused215 = e.c.TRUNCATED_TAG;
                        }
                        if (mainCaptureParams2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        listE = h0Var.S(mainCaptureParams2);
                        if (o.e1.f("CXCP")) {
                            String unused216 = e.c.TRUNCATED_TAG;
                        }
                    } else {
                        listE = pq.v.e(ju.z.a(th5));
                    }
                    if (list2.contains(b.POST_CAPTURE)) {
                        ju.p0 sequentialScope8 = h0Var.threads.getSequentialScope();
                        i37 = i18;
                        if (i16 != 0) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        if (i37 == 0) {
                            z16 = false;
                        }
                        ju.k.d(sequentialScope8, null, null, new v(listE, null, z29, this, z17, z16, i17), 3, null);
                    }
                    return listE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th9) {
            th4 = th9;
            r16 = r15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object V(MainCaptureParams mainCaptureParams, int i15, int i16, List<? extends b> list, tq.e<? super List<? extends ju.w0<Void>>> eVar) throws Exception {
        y yVar;
        Object objD;
        if (eVar instanceof y) {
            yVar = (y) eVar;
            int i17 = yVar.f46002j;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                yVar.f46002j = i17 - PKIFailureInfo.systemUnavail;
            } else {
                yVar = new y(eVar);
            }
        } else {
            yVar = new y(eVar);
        }
        y yVar2 = yVar;
        Object objO = yVar2.f46000g;
        Object objE = uq.b.e();
        int i18 = yVar2.f46002j;
        if (i18 == 0) {
            oq.u.b(objO);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            if (H()) {
                yVar2.f45997d = mainCaptureParams;
                yVar2.f45998e = list;
                yVar2.f45999f = i15;
                yVar2.f46002j = 1;
                objO = O(i16, yVar2);
                if (objO == objE) {
                }
            } else {
                yVar2.f45997d = null;
                yVar2.f45998e = null;
                yVar2.f46002j = 3;
                objD = D(mainCaptureParams, i15, list, yVar2);
                if (objD == objE) {
                    return objD;
                }
            }
            return objE;
        }
        if (i18 != 1) {
            if (i18 == 2) {
                oq.u.b(objO);
                return objO;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objO);
            return objO;
        }
        i15 = yVar2.f45999f;
        list = (List) yVar2.f45998e;
        mainCaptureParams = (MainCaptureParams) yVar2.f45997d;
        oq.u.b(objO);
        List<? extends b> list2 = list;
        if (((Boolean) objO).booleanValue()) {
            boolean z15 = true;
            long j15 = i0.f46014c;
            if (this.useTorchAsFlash.b() || this.videoUsageControl.a()) {
                z15 = false;
            }
            boolean z16 = z15;
            yVar2.f45997d = null;
            yVar2.f45998e = null;
            yVar2.f46002j = 2;
            Object objU = U(mainCaptureParams, i15, j15, list2, z16, yVar2);
            if (objU != objE) {
                return objU;
            }
        } else {
            list = list2;
            yVar2.f45997d = null;
            yVar2.f45998e = null;
            yVar2.f46002j = 3;
            objD = D(mainCaptureParams, i15, list, yVar2);
            if (objD == objE) {
                return objD;
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object W(long j15, tq.e<? super Result3A> eVar) throws Exception {
        z zVar;
        long j16;
        long j17;
        AutoCloseable autoCloseable;
        Throwable th4;
        AutoCloseable autoCloseable2;
        Object objI;
        if (eVar instanceof z) {
            zVar = (z) eVar;
            int i15 = zVar.f46007h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                zVar.f46007h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                zVar = new z(eVar);
            }
        } else {
            zVar = new z(eVar);
        }
        z zVar2 = zVar;
        Object objM3 = zVar2.f46005f;
        Object objE = uq.b.e();
        int i16 = zVar2.f46007h;
        try {
            if (i16 == 0) {
                oq.u.b(objM3);
                h.s sVarF = this.useCaseGraphContext.f();
                j16 = j15;
                zVar2.f46003d = j16;
                zVar2.f46007h = 1;
                objM3 = sVarF.m3(zVar2);
                if (objM3 != objE) {
                }
                return objE;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(objM3);
                    return objM3;
                }
                autoCloseable2 = (AutoCloseable) zVar2.f46004e;
                try {
                    oq.u.b(objM3);
                    ju.w0 w0Var = (ju.w0) objM3;
                    cr.a.a(autoCloseable2, null);
                    zVar2.f46004e = null;
                    zVar2.f46007h = 3;
                    objI = w0Var.I(zVar2);
                    if (objI != objE) {
                        return objE;
                    }
                    return objI;
                } catch (Throwable th5) {
                    th4 = th5;
                    try {
                        throw th4;
                    } catch (Throwable th6) {
                        cr.a.a(autoCloseable2, th4);
                        throw th6;
                    }
                }
            }
            j16 = zVar2.f46003d;
            oq.u.b(objM3);
            Boolean boolA = vq.b.a(true);
            zVar2.f46004e = autoCloseable;
            zVar2.f46007h = 2;
            objM3 = h.s.g.T2((h.s.g) autoCloseable, null, boolA, null, null, 0, j17, zVar2, 29, null);
            if (objM3 != objE) {
                autoCloseable2 = autoCloseable;
                ju.w0 w0Var2 = (ju.w0) objM3;
                cr.a.a(autoCloseable2, null);
                zVar2.f46004e = null;
                zVar2.f46007h = 3;
                objI = w0Var2.I(zVar2);
                if (objI != objE) {
                    return objI;
                }
            }
            return objE;
        } catch (Throwable th7) {
            th4 = th7;
            autoCloseable2 = autoCloseable;
            throw th4;
        }
        j17 = j16;
        autoCloseable = (AutoCloseable) objM3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 X(h0 h0Var) {
        return h0Var.useCaseCameraStateProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(long j15, er.l<? super h.p0, Boolean> lVar, tq.e<? super h.p0> eVar) throws Throwable {
        a0 a0Var;
        o1 o1Var;
        if (eVar instanceof a0) {
            a0Var = (a0) eVar;
            int i15 = a0Var.f45847g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f45847g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(eVar);
            }
        } else {
            a0Var = new a0(eVar);
        }
        Object obj = a0Var.f45845e;
        Object objE = uq.b.e();
        int i16 = a0Var.f45847g;
        if (i16 == 0) {
            oq.u.b(obj);
            o1 o1Var2 = new o1(j15, lVar);
            this.requestListener.o(o1Var2, this.threads.getSequentialExecutor());
            ju.k.d(this.threads.getSequentialScope(), null, null, new c0(o1Var2, this, null), 3, null);
            long millis = TimeUnit.NANOSECONDS.toMillis(j15);
            b0 b0Var = new b0(o1Var2, null);
            a0Var.f45844d = o1Var2;
            a0Var.f45847g = 1;
            Object objE2 = g3.e(millis, b0Var, a0Var);
            if (objE2 == objE) {
                return objE;
            }
            obj = objE2;
            o1Var = o1Var2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o1Var = (o1) a0Var.f45844d;
            oq.u.b(obj);
        }
        if (((h.p0) obj) == null) {
            this.requestListener.G(o1Var);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object Z(h0 h0Var, long j15, er.l lVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            lVar = new er.l() { // from class: e.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return Boolean.valueOf(h0.a0((h.p0) obj2));
                }
            };
        }
        return h0Var.Y(j15, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(h.p0 p0Var) {
        return true;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public int getTemplate() {
        return this.template;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:32:0x007b, B:34:0x0086, B:40:0x0093), top: B:58:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:44:0x009f, B:46:0x00a7, B:47:0x00aa), top: B:56:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(int i15, tq.e<? super oq.i0> eVar) throws Exception {
        l lVar;
        AutoCloseable autoCloseable;
        Throwable th4;
        AutoCloseable autoCloseable2;
        h.s.g gVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i16 = lVar.f45937h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f45937h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objM3 = lVar.f45935f;
        Object objE = uq.b.e();
        int i17 = lVar.f45937h;
        boolean z15 = true;
        if (i17 == 0) {
            oq.u.b(objM3);
            f1 f1Var = this.flashControl;
            lVar.f45933d = i15;
            lVar.f45937h = 1;
            if (f1Var.v(lVar) != objE) {
            }
            return objE;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoCloseable2 = (AutoCloseable) lVar.f45934e;
                try {
                    oq.u.b(objM3);
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                    cr.a.a(autoCloseable2, null);
                    return oq.i0.f148189a;
                } catch (Throwable th5) {
                    th4 = th5;
                    try {
                        throw th4;
                    } catch (Throwable th6) {
                        cr.a.a(autoCloseable2, th4);
                        throw th6;
                    }
                }
            }
            i15 = lVar.f45933d;
            oq.u.b(objM3);
            autoCloseable = (AutoCloseable) objM3;
            try {
                gVar = (h.s.g) autoCloseable;
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
                if (i15 == 0) {
                    z15 = false;
                }
                lVar.f45934e = autoCloseable;
                lVar.f45937h = 3;
                if (gVar.b2(z15, lVar) != objE) {
                    autoCloseable2 = autoCloseable;
                    e.c cVar3 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused3 = e.c.TRUNCATED_TAG;
                    }
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    cr.a.a(autoCloseable2, null);
                    return oq.i0.f148189a;
                }
                return objE;
            } catch (Throwable th7) {
                th4 = th7;
                autoCloseable2 = autoCloseable;
                throw th4;
            }
        }
        i15 = lVar.f45933d;
        oq.u.b(objM3);
        e.c cVar4 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused4 = e.c.TRUNCATED_TAG;
        }
        h.s sVarF = this.useCaseGraphContext.f();
        lVar.f45933d = i15;
        lVar.f45937h = 2;
        objM3 = sVarF.m3(lVar);
        if (objM3 != objE) {
            autoCloseable = (AutoCloseable) objM3;
            gVar = (h.s.g) autoCloseable;
            e.c cVar5 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused5 = e.c.TRUNCATED_TAG;
            }
            if (i15 == 0) {
                z15 = false;
            }
            lVar.f45934e = autoCloseable;
            lVar.f45937h = 3;
            if (gVar.b2(z15, lVar) != objE) {
                autoCloseable2 = autoCloseable;
                e.c cVar6 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused6 = e.c.TRUNCATED_TAG;
                }
                oq.i0 i0Var3 = oq.i0.f148189a;
                cr.a.a(autoCloseable2, null);
                return oq.i0.f148189a;
            }
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:34:0x007f, B:36:0x008a, B:39:0x0094, B:43:0x009c), top: B:64:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        if (r15 == r0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [int] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(int r14, tq.e<? super oq.i0> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h0.N(int, tq.e):java.lang.Object");
    }

    @Override // e.c0
    public Object b(int i15, int i16, int i17, tq.e<? super u.m> eVar) {
        return new i(i15, i16, i17);
    }

    @Override // e.c0
    public Object c(List<v.n1> list, int i15, v.p1 p1Var, int i16, int i17, int i18, tq.e<? super List<? extends ju.w0<Void>>> eVar) {
        return L(pq.v.q(b.PRE_CAPTURE, b.MAIN_CAPTURE, b.POST_CAPTURE), i16, i18, i17, new MainCaptureParams(list, i15, p1Var, null), eVar);
    }

    @Override // e.c0
    public void d(int i15) {
        this.template = i15;
    }
}
