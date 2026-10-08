package coil3.compose;

import android.os.Trace;
import coil3.compose.AsyncImagePainter;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import fr.t;
import ju.d2;
import kc.n;
import kc.s;
import lc.g;
import lc.h;
import m3.k;
import mc.m;
import mu.a0;
import mu.b0;
import mu.h0;
import mu.p0;
import mu.r0;
import n3.n1;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.u4;
import p3.f;
import tq.e;
import tq.j;
import zc.ErrorResult;
import zc.ImageRequest;
import zc.SuccessResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0003$\u007f B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0007*\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\tJ\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\tJ\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tR/\u00101\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R(\u0010?\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010AR$\u0010F\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bC\u0010=\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR.\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010h\u001a\u00020c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bd\u0010f\"\u0004\b3\u0010gR$\u0010n\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010j\u001a\u0004\bk\u0010l\"\u0004\be\u0010mR.\u0010s\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u00038\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010\u0006R\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00030t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010uR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00100t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100w8\u0006¢\u0006\f\n\u0004\b\u0019\u0010y\u001a\u0004\bx\u0010{R\u0014\u0010~\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010}¨\u0006\u0080\u0001"}, d2 = {"Lcoil3/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/a;", "Lm2/u4;", "Lcoil3/compose/AsyncImagePainter$b;", "input", "<init>", "(Lcoil3/compose/AsyncImagePainter$b;)V", "Loq/i0;", "A", "()V", "Lzc/f;", "request", "", "isPreview", "O", "(Lzc/f;Z)Lzc/f;", "Lcoil3/compose/AsyncImagePainter$State;", "state", i.f37086m, "(Lcoil3/compose/AsyncImagePainter$State;)V", "Lzc/i;", "N", "(Lzc/i;)Lcoil3/compose/AsyncImagePainter$State;", "Lmu/g;", "Lm3/k;", "B", "()Lmu/g;", "Lp3/f;", "n", "(Lp3/f;)V", "", "alpha", "a", "(F)Z", "Ln3/n1;", "colorFilter", "b", "(Ln3/n1;)Z", "c", "e", "d", "C", "<set-?>", "h", "Lm2/a3;", "w", "()Landroidx/compose/ui/graphics/painter/a;", i.f37087n, "(Landroidx/compose/ui/graphics/painter/a;)V", "painter", "j", "F", "k", "Ln3/n1;", "l", "Z", "isRemembered", "Lju/d2;", "value", "m", "Lju/d2;", "J", "(Lju/d2;)V", "rememberJob", "Lmu/a0;", "Lmu/a0;", "drawSizeFlow", "p", "E", "(J)V", "drawSize", "Lju/p0;", "q", "Lju/p0;", "y", "()Lju/p0;", "K", "(Lju/p0;)V", "scope", "Lkotlin/Function1;", "r", "Ler/l;", "getTransform$coil_compose_core", "()Ler/l;", i.f37094u, "(Ler/l;)V", "transform", "s", "getOnState$coil_compose_core", "G", "onState", "Le4/l;", "t", "Le4/l;", "getContentScale$coil_compose_core", "()Le4/l;", ip.a.f96138c, "(Le4/l;)V", "contentScale", "Ln3/v1;", "v", "I", "()I", "(I)V", "filterQuality", "Lcoil3/compose/c;", "Lcoil3/compose/c;", "x", "()Lcoil3/compose/c;", "(Lcoil3/compose/c;)V", "previewHandler", "Lcoil3/compose/AsyncImagePainter$b;", "get_input$coil_compose_core", "()Lcoil3/compose/AsyncImagePainter$b;", "M", "_input", "Lmu/b0;", "Lmu/b0;", "inputFlow", "Lmu/p0;", "z", "Lmu/p0;", "getInput", "()Lmu/p0;", "stateFlow", "()J", "intrinsicSize", "State", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncImagePainter extends androidx.compose.ui.graphics.painter.a implements u4 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<State, State> D = new l() { // from class: lc.c
        @Override // er.l
        public final Object b(Object obj) {
            return AsyncImagePainter.p((AsyncImagePainter.State) obj);
        }
    };

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final b0<State> stateFlow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final p0<State> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isRemembered;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private d2 rememberJob;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private a0<k> drawSizeFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public ju.p0 scope;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private l<? super State, i0> onState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private coil3.compose.c previewHandler;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Input _input;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final b0<Input> inputFlow;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p0<Input> input;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a3 painter = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long drawSize = k.INSTANCE.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private l<? super State, ? extends State> transform = D;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private p036e4.l contentScale = p036e4.l.INSTANCE.e();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int filterQuality = f.INSTANCE.b();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State;", "", "Landroidx/compose/ui/graphics/painter/a;", "a", "()Landroidx/compose/ui/graphics/painter/a;", "painter", "Loading", "Success", "Error", "Lcoil3/compose/AsyncImagePainter$State$a;", "Lcoil3/compose/AsyncImagePainter$State$Error;", "Lcoil3/compose/AsyncImagePainter$State$Loading;", "Lcoil3/compose/AsyncImagePainter$State$Success;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Error;", "Lcoil3/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/a;", "painter", "Lzc/e;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/a;Lzc/e;)V", "b", "(Landroidx/compose/ui/graphics/painter/a;Lzc/e;)Lcoil3/compose/AsyncImagePainter$State$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/a;", "a", "()Landroidx/compose/ui/graphics/painter/a;", "Lzc/e;", "d", "()Lzc/e;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ErrorResult result;
            private final androidx.compose.ui.graphics.painter.a painter;

            public Error(androidx.compose.ui.graphics.painter.a aVar, ErrorResult errorResult) {
                this.painter = aVar;
                this.result = errorResult;
            }

            public static /* synthetic */ Error c(Error error, androidx.compose.ui.graphics.painter.a aVar, ErrorResult errorResult, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    aVar = error.painter;
                }
                if ((i15 & 2) != 0) {
                    errorResult = error.result;
                }
                return error.b(aVar, errorResult);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public androidx.compose.ui.graphics.painter.a getPainter() {
                return this.painter;
            }

            public final Error b(androidx.compose.ui.graphics.painter.a painter, ErrorResult result) {
                return new Error(painter, result);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ErrorResult getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return t.c(this.painter, error.painter) && t.c(this.result, error.result);
            }

            public int hashCode() {
                androidx.compose.ui.graphics.painter.a aVar = this.painter;
                return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.result + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Loading;", "Lcoil3/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/a;", "painter", "<init>", "(Landroidx/compose/ui/graphics/painter/a;)V", "b", "(Landroidx/compose/ui/graphics/painter/a;)Lcoil3/compose/AsyncImagePainter$State$Loading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/a;", "a", "()Landroidx/compose/ui/graphics/painter/a;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements State {
            private final androidx.compose.ui.graphics.painter.a painter;

            public Loading(androidx.compose.ui.graphics.painter.a aVar) {
                this.painter = aVar;
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public androidx.compose.ui.graphics.painter.a getPainter() {
                return this.painter;
            }

            public final Loading b(androidx.compose.ui.graphics.painter.a painter) {
                return new Loading(painter);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && t.c(this.painter, ((Loading) other).painter);
            }

            public int hashCode() {
                androidx.compose.ui.graphics.painter.a aVar = this.painter;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Success;", "Lcoil3/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/a;", "painter", "Lzc/r;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/a;Lzc/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/a;", "a", "()Landroidx/compose/ui/graphics/painter/a;", "Lzc/r;", "b", "()Lzc/r;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SuccessResult result;
            private final androidx.compose.ui.graphics.painter.a painter;

            public Success(androidx.compose.ui.graphics.painter.a aVar, SuccessResult successResult) {
                this.painter = aVar;
                this.result = successResult;
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public androidx.compose.ui.graphics.painter.a getPainter() {
                return this.painter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final SuccessResult getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return t.c(this.painter, success.painter) && t.c(this.result, success.result);
            }

            public int hashCode() {
                return (this.painter.hashCode() * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.result + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$a;", "Lcoil3/compose/AsyncImagePainter$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/a;", "a", "()Landroidx/compose/ui/graphics/painter/a;", "painter", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28686a = new a();

            private a() {
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a */
            public androidx.compose.ui.graphics.painter.a getPainter() {
                return null;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1625786264;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: a */
        androidx.compose.ui.graphics.painter.a getPainter();
    }

    /* JADX INFO: renamed from: coil3.compose.AsyncImagePainter$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/compose/AsyncImagePainter$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$State;", "DefaultTransform", "Ler/l;", "a", "()Ler/l;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final l<State, State> a() {
            return AsyncImagePainter.D;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: coil3.compose.AsyncImagePainter$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcoil3/compose/AsyncImagePainter$b;", "", "Lkc/s;", "imageLoader", "Lzc/f;", "request", "Llc/b;", "modelEqualityDelegate", "<init>", "(Lkc/s;Lzc/f;Llc/b;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkc/s;", "()Lkc/s;", "b", "Lzc/f;", "()Lzc/f;", "c", "Llc/b;", "getModelEqualityDelegate", "()Llc/b;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s imageLoader;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageRequest request;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final lc.b modelEqualityDelegate;

        public Input(s sVar, ImageRequest imageRequest, lc.b bVar) {
            this.imageLoader = sVar;
            this.request = imageRequest;
            this.modelEqualityDelegate = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final s getImageLoader() {
            return this.imageLoader;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageRequest getRequest() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return t.c(this.imageLoader, input.imageLoader) && t.c(this.modelEqualityDelegate, input.modelEqualityDelegate) && this.modelEqualityDelegate.c(this.request, input.request);
        }

        public int hashCode() {
            return (((this.imageLoader.hashCode() * 31) + this.modelEqualityDelegate.hashCode()) * 31) + this.modelEqualityDelegate.b(this.request);
        }

        public String toString() {
            return "Input(imageLoader=" + this.imageLoader + ", request=" + this.request + ", modelEqualityDelegate=" + this.modelEqualityDelegate + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<ju.p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f28690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f28691f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Input f28693h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Input input, e<? super c> eVar) {
            super(2, eVar);
            this.f28693h = input;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r5 == r0) goto L18;
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
                int r1 = r4.f28691f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.f28690e
                coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
                oq.u.b(r5)
                goto L6c
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                oq.u.b(r5)
                goto L48
            L22:
                oq.u.b(r5)
                coil3.compose.AsyncImagePainter r5 = coil3.compose.AsyncImagePainter.this
                coil3.compose.c r5 = r5.getPreviewHandler()
                if (r5 == 0) goto L4b
                coil3.compose.AsyncImagePainter r1 = coil3.compose.AsyncImagePainter.this
                coil3.compose.AsyncImagePainter$b r2 = r4.f28693h
                zc.f r2 = r2.getRequest()
                zc.f r1 = coil3.compose.AsyncImagePainter.t(r1, r2, r3)
                coil3.compose.AsyncImagePainter$b r2 = r4.f28693h
                kc.s r2 = r2.getImageLoader()
                r4.f28691f = r3
                java.lang.Object r5 = r5.a(r2, r1, r4)
                if (r5 != r0) goto L48
                goto L6a
            L48:
                coil3.compose.AsyncImagePainter$State r5 = (coil3.compose.AsyncImagePainter.State) r5
                goto L72
            L4b:
                coil3.compose.AsyncImagePainter r5 = coil3.compose.AsyncImagePainter.this
                coil3.compose.AsyncImagePainter$b r1 = r4.f28693h
                zc.f r1 = r1.getRequest()
                r3 = 0
                zc.f r5 = coil3.compose.AsyncImagePainter.t(r5, r1, r3)
                coil3.compose.AsyncImagePainter r1 = coil3.compose.AsyncImagePainter.this
                coil3.compose.AsyncImagePainter$b r3 = r4.f28693h
                kc.s r3 = r3.getImageLoader()
                r4.f28690e = r1
                r4.f28691f = r2
                java.lang.Object r5 = r3.d(r5, r4)
                if (r5 != r0) goto L6b
            L6a:
                return r0
            L6b:
                r0 = r1
            L6c:
                zc.i r5 = (zc.i) r5
                coil3.compose.AsyncImagePainter$State r5 = coil3.compose.AsyncImagePainter.s(r0, r5)
            L72:
                coil3.compose.AsyncImagePainter r0 = coil3.compose.AsyncImagePainter.this
                coil3.compose.AsyncImagePainter.u(r0, r5)
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return AsyncImagePainter.this.new c(this.f28693h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"coil3/compose/AsyncImagePainter$d", "Lbd/a;", "Lkc/n;", "placeholder", "Loq/i0;", "a", "(Lkc/n;)V", "error", "c", "result", "b", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements bd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageRequest f28694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AsyncImagePainter f28695b;

        public d(ImageRequest imageRequest, AsyncImagePainter asyncImagePainter) {
            this.f28694a = imageRequest;
            this.f28695b = asyncImagePainter;
        }

        @Override // bd.a
        public void a(n placeholder) {
            androidx.compose.ui.graphics.painter.a aVarW;
            androidx.compose.ui.graphics.painter.a aVarA = placeholder != null ? g.a(placeholder, this.f28694a.getContext(), this.f28695b.getFilterQuality()) : null;
            if (aVarA == null && h.b(this.f28694a) && (aVarW = this.f28695b.w()) != null) {
                aVarA = aVarW;
            }
            this.f28695b.P(new State.Loading(aVarA));
        }

        @Override // bd.a
        public void b(n result) {
        }

        @Override // bd.a
        public void c(n error) {
        }
    }

    public AsyncImagePainter(Input input) {
        this._input = input;
        b0<Input> b0VarA = r0.a(input);
        this.inputFlow = b0VarA;
        this.input = mu.i.b(b0VarA);
        b0<State> b0VarA2 = r0.a(State.a.f28686a);
        this.stateFlow = b0VarA2;
        this.state = mu.i.b(b0VarA2);
    }

    private final void A() {
        Input input = this._input;
        if (input == null) {
            return;
        }
        J(mc.h.a(y(), new c(input, null)));
    }

    private final mu.g<k> B() {
        a0<k> a0VarB = this.drawSizeFlow;
        if (a0VarB == null) {
            a0VarB = h0.b(1, 0, lu.a.DROP_OLDEST, 2, null);
            long j15 = this.drawSize;
            if (j15 != 9205357640488583168L) {
                a0VarB.f(k.c(j15));
            }
            this.drawSizeFlow = a0VarB;
        }
        return a0VarB;
    }

    private final void E(long j15) {
        if (k.f(this.drawSize, j15)) {
            return;
        }
        this.drawSize = j15;
        a0<k> a0Var = this.drawSizeFlow;
        if (a0Var != null) {
            a0Var.f(k.c(j15));
        }
    }

    private final void H(androidx.compose.ui.graphics.painter.a aVar) {
        this.painter.setValue(aVar);
    }

    private final void J(d2 d2Var) {
        d2 d2Var2 = this.rememberJob;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        this.rememberJob = d2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State N(zc.i iVar) {
        if (iVar instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) iVar;
            return new State.Success(g.a(successResult.getImage(), successResult.getRequest().getContext(), this.filterQuality), successResult);
        }
        if (!(iVar instanceof ErrorResult)) {
            throw new oq.p();
        }
        ErrorResult errorResult = (ErrorResult) iVar;
        n image = errorResult.getImage();
        return new State.Error(image != null ? g.a(image, errorResult.getRequest().getContext(), this.filterQuality) : null, errorResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageRequest O(ImageRequest request, boolean isPreview) {
        ad.i sizeResolver = request.getSizeResolver();
        if (sizeResolver instanceof lc.f) {
            ((lc.f) sizeResolver).q(B());
        }
        ImageRequest.a aVarH = ImageRequest.A(request, null, 1, null).h(new d(request, this));
        if (request.getDefined().getSizeResolver() == null) {
            aVarH.g(ad.i.f5431b);
        }
        if (request.getDefined().getScale() == null) {
            aVarH.f(m.o(this.contentScale));
        }
        if (request.getDefined().getPrecision() == null) {
            aVarH.e(ad.c.INEXACT);
        }
        if (isPreview) {
            aVarH.b(j.f191408a);
        }
        return aVarH.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(State state) {
        State value = this.stateFlow.getValue();
        State stateB = this.transform.b(state);
        this.stateFlow.setValue(stateB);
        androidx.compose.ui.graphics.painter.a aVarA = b.a(value, stateB, this.contentScale);
        if (aVarA == null) {
            aVarA = stateB.getPainter();
        }
        H(aVarA);
        if (value.getPainter() != stateB.getPainter()) {
            Object painter = value.getPainter();
            u4 u4Var = painter instanceof u4 ? (u4) painter : null;
            if (u4Var != null) {
                u4Var.e();
            }
            Object painter2 = stateB.getPainter();
            u4 u4Var2 = painter2 instanceof u4 ? (u4) painter2 : null;
            if (u4Var2 != null) {
                u4Var2.c();
            }
        }
        l<? super State, i0> lVar = this.onState;
        if (lVar != null) {
            lVar.b(stateB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State p(State state) {
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.graphics.painter.a w() {
        return (androidx.compose.ui.graphics.painter.a) this.painter.getValue();
    }

    public final void C() {
        if (this._input == null) {
            J(null);
        } else if (this.isRemembered) {
            A();
        }
    }

    public final void D(p036e4.l lVar) {
        this.contentScale = lVar;
    }

    public final void F(int i15) {
        this.filterQuality = i15;
    }

    public final void G(l<? super State, i0> lVar) {
        this.onState = lVar;
    }

    public final void I(coil3.compose.c cVar) {
        this.previewHandler = cVar;
    }

    public final void K(ju.p0 p0Var) {
        this.scope = p0Var;
    }

    public final void L(l<? super State, ? extends State> lVar) {
        this.transform = lVar;
    }

    public final void M(Input input) {
        if (t.c(this._input, input)) {
            return;
        }
        this._input = input;
        C();
        if (input != null) {
            this.inputFlow.setValue(input);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean b(n1 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // p076m2.u4
    public void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objW = w();
            u4 u4Var = objW instanceof u4 ? (u4) objW : null;
            if (u4Var != null) {
                u4Var.c();
            }
            A();
            this.isRemembered = true;
            i0 i0Var = i0.f148189a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // p076m2.u4
    public void d() {
        J(null);
        Object objW = w();
        u4 u4Var = objW instanceof u4 ? (u4) objW : null;
        if (u4Var != null) {
            u4Var.d();
        }
        this.isRemembered = false;
    }

    @Override // p076m2.u4
    public void e() {
        J(null);
        Object objW = w();
        u4 u4Var = objW instanceof u4 ? (u4) objW : null;
        if (u4Var != null) {
            u4Var.e();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    /* JADX INFO: renamed from: l */
    public long getIntrinsicSize() {
        androidx.compose.ui.graphics.painter.a aVarW = w();
        return aVarW != null ? aVarW.getIntrinsicSize() : k.INSTANCE.a();
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        E(fVar.a());
        androidx.compose.ui.graphics.painter.a aVarW = w();
        if (aVarW != null) {
            aVarW.j(fVar, fVar.a(), this.alpha, this.colorFilter);
        }
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final coil3.compose.c getPreviewHandler() {
        return this.previewHandler;
    }

    public final ju.p0 y() {
        ju.p0 p0Var = this.scope;
        if (p0Var != null) {
            return p0Var;
        }
        return null;
    }

    public final p0<State> z() {
        return this.state;
    }
}
